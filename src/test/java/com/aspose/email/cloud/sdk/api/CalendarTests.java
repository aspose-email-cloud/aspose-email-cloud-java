package com.aspose.email.cloud.sdk.api;

import com.aspose.email.cloud.sdk.invoker.ApiException;
import com.aspose.email.cloud.sdk.model.*;
import com.aspose.email.cloud.sdk.model.requests.*;
import org.apache.commons.lang3.time.DateUtils;
import org.testng.annotations.Test;

import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.UUID;

public class CalendarTests extends TestBase {

    private static final String location = "Some location";
    private final CalendarDto calendarDto = new CalendarDto()
        .location(location)
        .summary("Some summary")
        .description("Some description")
        .startDate(Calendar.getInstance().getTime())
        .endDate(Calendar.getInstance().getTime())
        .organizer(new MailAddress().address("organizer@aspose.com"))
        .attendees(Collections.singletonList(new MailAddress().address("attendee@aspose.com")));

    @Test(groups = {"pipeline"})
    public void hierarchicalTest() throws ApiException {
        String fileName = createCalendar();
        HierarchicalObject
            calendar = api.getCalendar(new GetCalendarRequestData(fileName, folder, storage));
        ArrayList<PrimitiveObject> primitives = new ArrayList<PrimitiveObject>();
        for (BaseObject property : calendar.getInternalProperties()) {
            if (property.getType().equals("PrimitiveObject")) {
                primitives.add((PrimitiveObject) property);
            }
        }
        assert primitives.size() >= 3;
        PrimitiveObject first = primitives.get(0);
        assert first.getValue() != null;
    }

    @Test(groups = {"pipeline"})
    public void dateTest() throws ApiException, ParseException {
        Calendar startDate = Calendar.getInstance();
        startDate.set(Calendar.MILLISECOND, 0);
        String calendarFile = createCalendar(startDate);
        HierarchicalObject calendar = api.getCalendar(new GetCalendarRequestData(calendarFile, folder, storage));
        PrimitiveObject startDateProperty = null;
        for (BaseObject property : calendar.getInternalProperties()) {
            if (property.getName().equals("STARTDATE")) {
                startDateProperty = (PrimitiveObject) property;
            }
        }
        assert startDateProperty != null;
        Calendar factStartDate = Calendar.getInstance();
        factStartDate.setTime(dateFormat.parse(startDateProperty.getValue()));
        assert DateUtils.truncatedEquals(startDate, factStartDate, Calendar.SECOND);
    }

    @Test(groups = {"pipeline"})
    public void fileTest() throws ApiException, UnsupportedEncodingException {
        String file = createCalendar();
        byte[] fileBytes = api.downloadFile(new DownloadFileRequestData(folder + "/" + file, storage, null));
        String calendarContent = new String(fileBytes, "UTF-8");
        assert calendarContent.contains("organizer@am.ru");
        String uploadedName = UUID.randomUUID().toString() + ".ics";
        String path = folder + "/" + uploadedName;
        api.uploadFile(new UploadFileRequestData(path, fileBytes, storage));
        ObjectExist exist = api.objectExists(new ObjectExistsRequestData(path, storage, null));
        assert exist.isExists();
    }

    @Test(groups = {"pipeline"})
    public void createCalendarEmailTest() throws ApiException, UnsupportedEncodingException {
        Calendar startDate = Calendar.getInstance();
        Calendar endDate = (Calendar) startDate.clone();
        endDate.set(Calendar.HOUR_OF_DAY, endDate.get(Calendar.HOUR_OF_DAY) + 1);

        StorageFolderLocation folderLocation = new StorageFolderLocation(storage, folder);
        String calendarFile = UUID.randomUUID().toString() + ".ics";
        api.saveCalendarModel(new SaveCalendarModelRequestData(
            calendarFile,
            new StorageModelRqOfCalendarDto(calendarDto, folderLocation)));

        ObjectExist objectExist = api.objectExists(new ObjectExistsRequestData(
            folder + "/" + calendarFile, storage, null));
        assert objectExist.isExists();

        AlternateView alternate = api.convertCalendarModelToAlternate(
            new ConvertCalendarModelToAlternateRequestData(
                new CalendarDtoAlternateRq(calendarDto, "Create", null)));

        EmailDto email = new EmailDto()
            .addAlternateViewsItem(alternate)
            .from(new MailAddress("From Name", "organizer@aspose.com", null, null))
            .addToItem(new MailAddress("To Name", "attendee@aspose.com", null, null))
            .subject("Some subject")
            .body("Some body");
        String emailFile = UUID.randomUUID().toString() + ".eml";
        api.saveEmailModel(new SaveEmailModelRequestData(
            "Eml", emailFile, new StorageModelRqOfEmailDto(email, folderLocation)));

        byte[] downloaded = api.downloadFile(
            new DownloadFileRequestData(folder + "/" + emailFile, storage, null));
        String calendarContent = new String(downloaded, "UTF-8");
        assert calendarContent.contains("Some subject");
    }

    @Test(groups = {"pipeline"})
    public void convertCalendarTest() throws ApiException, UnsupportedEncodingException {
        //Create DTO with specified location:
        //We can convert this DTO to a MAPI or ICS file:
        byte[] mapiBytes = api.convertCalendarModelToFile(
            new ConvertCalendarModelToFileRequestData(
                "Msg", calendarDto));
        /*
        // mapiBytes can be saved as a calendar.msg file:
        try (FileOutputStream stream = new FileOutputStream("calendar.msg")){
            stream.write(mapiBytes);
        }
         */

        //Let's convert this bytes to an ICS file:
        byte[] icsBytes = api.convertCalendar(new ConvertCalendarRequestData("Ics", mapiBytes));
        /*
        //icsBytes can be saved as a calendar.ics file:
        try (FileOutputStream stream = new FileOutputStream("calendar.ics")){
            stream.write(icsBytes);
        }
        */
        //ICS is a text format. We can convert icsBytes to a string and check that it
        //contains specified location as a substring:
        String calendarContent = new String(icsBytes, "UTF-8");
        assert calendarContent.contains(location);
        //We can also convert file bytes back to a CalendarDto
        CalendarDto dto = api.getCalendarFileAsModel(
            new GetCalendarFileAsModelRequestData(icsBytes));
        assert location.equals(dto.getLocation());
    }

    @Test(groups = {"pipeline"})
    public void convertModelToMapiModelTest() {
        MapiCalendarDto mapiCalendarDto = api.convertCalendarModelToMapiModel(
            new ConvertCalendarModelToMapiModelRequestData(calendarDto));
        assert calendarDto.getLocation().equals(mapiCalendarDto.getLocation());
    }
}
