package com.aspose.email.cloud.sdk.api;

import com.aspose.email.cloud.sdk.api.utils.TestBase;
import com.aspose.email.cloud.sdk.invoker.ApiException;
import com.aspose.email.cloud.sdk.model.*;
import org.testng.annotations.Test;

import java.io.UnsupportedEncodingException;
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
        .attendees(Collections.singletonList(new MailAddress().address("attendee@aspose.com")))
        .recurrence(new DailyRecurrencePatternDto()
            .occurs(10)
            .weekStart("Monday"));

    @Test(groups = {"pipeline"})
    public void fileTest() throws ApiException, UnsupportedEncodingException {
        String file = createCalendar();
        byte[] fileBytes =
            api.cloudStorage().file()
                .downloadFile(new DownloadFileRequest(folder + "/" + file, storage, null));
        String calendarContent = new String(fileBytes, "UTF-8");
        assert calendarContent.contains("organizer@aspose.com");
        String uploadedName = UUID.randomUUID().toString() + ".ics";
        String path = folder + "/" + uploadedName;
        api.cloudStorage().file().uploadFile(new UploadFileRequest(path, fileBytes, storage));
        ObjectExist exist =
            api.cloudStorage().storage().objectExists(new ObjectExistsRequest(path, storage, null));
        assert exist.isExists();
    }

    @Test(groups = {"pipeline"})
    public void createCalendarEmailTest() throws ApiException, UnsupportedEncodingException {
        String calendarFile = UUID.randomUUID().toString() + ".ics";
        api.calendar().save(
            new CalendarSaveRequest(new StorageFileLocation(storage, folder, calendarFile),
                calendarDto, "Ics"));

        ObjectExist objectExist = api.cloudStorage().storage()
            .objectExists(new ObjectExistsRequest(folder + "/" + calendarFile, storage, null));
        assert objectExist.isExists();

        AlternateView alternate =
            api.calendar().asAlternate(new CalendarAsAlternateRequest(calendarDto, "Create", null));

        EmailDto email = new EmailDto()
            .addAlternateViewsItem(alternate)
            .from(new MailAddress("From Name", "organizer@aspose.com", null, null))
            .addToItem(new MailAddress("To Name", "attendee@aspose.com", null, null))
            .subject("Some subject")
            .body("Some body");
        String emailFile = UUID.randomUUID().toString() + ".eml";
        api.email().save(
            new EmailSaveRequest(new StorageFileLocation(storage, folder, emailFile), email,
                "Eml"));

        byte[] downloaded = api.cloudStorage().file()
            .downloadFile(new DownloadFileRequest(folder + "/" + emailFile, storage, null));
        String calendarContent = new String(downloaded, "UTF-8");
        assert calendarContent.contains("Some subject");
    }

    @Test(groups = {"pipeline"})
    public void convertCalendarTest() throws ApiException, UnsupportedEncodingException {
        //Create DTO with specified location:
        //We can convert this DTO to a MAPI or ICS file:
        byte[] mapiBytes = api.calendar().asFile(new CalendarAsFileRequest("Msg", calendarDto));
        /*
        // mapiBytes can be saved as a calendar.msg file:
        try (FileOutputStream stream = new FileOutputStream("calendar.msg")){
            stream.write(mapiBytes);
        }
         */

        //Let's convert this bytes to an ICS file:
        byte[] icsBytes = api.calendar().convert(new CalendarConvertRequest("Ics", mapiBytes));
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
        CalendarDto dto = api.calendar().fromFile(new CalendarFromFileRequest(icsBytes));
        assert location.equals(dto.getLocation());
    }

    @Test(groups = {"pipeline"})
    public void convertModelToMapiModelTest() {
        MapiCalendarDto mapiCalendarDto = api.calendar().asMapi(calendarDto);
        assert calendarDto.getLocation().equals(mapiCalendarDto.getLocation());
        assert "MapiCalendarDailyRecurrencePatternDto"
            .equals(mapiCalendarDto.getRecurrence().getRecurrencePattern().getDiscriminator());
    }
}
