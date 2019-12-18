package com.aspose.email.cloud.sdk.api;

import java.nio.charset.StandardCharsets;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.UUID;

import com.aspose.email.cloud.sdk.model.BaseObject;
import com.aspose.email.cloud.sdk.model.HierarchicalObject;
import com.aspose.email.cloud.sdk.model.HierarchicalObjectRequest;
import com.aspose.email.cloud.sdk.model.IndexedHierarchicalObject;
import com.aspose.email.cloud.sdk.model.ObjectExist;
import com.aspose.email.cloud.sdk.model.PrimitiveObject;
import com.aspose.email.cloud.sdk.model.StorageFolderLocation;
import com.aspose.email.cloud.sdk.model.requests.CreateCalendarRequestData;
import com.aspose.email.cloud.sdk.model.requests.CreateContactRequestData;
import com.aspose.email.cloud.sdk.model.requests.CreateFolderRequestData;
import com.aspose.email.cloud.sdk.model.requests.DownloadFileRequestData;
import com.aspose.email.cloud.sdk.model.requests.GetCalendarRequestData;
import com.aspose.email.cloud.sdk.model.requests.ObjectExistsRequestData;
import com.aspose.email.cloud.sdk.model.requests.UploadFileRequestData;

import org.apache.commons.lang3.time.DateUtils;
import org.testng.annotations.*;

public class EmailApiTests {
    private EmailApi api;
    private String folder;
    private static final String storage = "First Storage";
    private static final DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss'Z'");

    @BeforeClass
    public void oneTimeSetUp() throws Exception {
        api = new EmailApi(
            System.getenv("appKey"),
            System.getenv("appSid"),
            System.getenv("apiBaseUrl"),
            "v3.0",
            false,
            System.getenv("authUrl"));
        folder = UUID.randomUUID().toString();
        api.createFolder(new CreateFolderRequestData(folder, storage));
    }

    @Test
    public void hierarchicalTest() throws Exception {
        String fileName = createCalendar();
        HierarchicalObject calendar = api.getCalendar(new GetCalendarRequestData(fileName, folder, storage));
        ArrayList<PrimitiveObject> primitives = new ArrayList<PrimitiveObject>();
        for (BaseObject property: calendar.getInternalProperties())
        {
            if (property.getType().equals("PrimitiveObject"))
            {
                primitives.add((PrimitiveObject)property);
            }
        }
        assert primitives.size() >= 3;
        PrimitiveObject first = primitives.get(0);
        assert first.getValue() != null;
    }

    @Test
    public void dateTest() throws Exception {
        Calendar startDate = Calendar.getInstance();
        startDate.set(Calendar.MILLISECOND, 0);
        String calendarFile = createCalendar(startDate);
        HierarchicalObject calendar = api.getCalendar(new GetCalendarRequestData(calendarFile, folder, storage));
        PrimitiveObject startDateProperty = null;
        for (BaseObject property: calendar.getInternalProperties())
        {
            if (property.getName().equals("STARTDATE"))
            {
                startDateProperty = (PrimitiveObject)property;
            }
        }
        assert startDateProperty != null;
        Calendar factStartDate = Calendar.getInstance();
        factStartDate.setTime(dateFormat.parse(startDateProperty.getValue()));
        assert DateUtils.truncatedEquals(startDate, factStartDate, Calendar.SECOND);
    }

    @Test
    public void fileTest() throws Exception {
        String file = createCalendar();
        byte[] fileBytes = api.downloadFile(new DownloadFileRequestData(folder + "/" + file, storage, null));
        String calendarContent = new String(fileBytes, StandardCharsets.UTF_8);
        assert calendarContent.contains("organizer@am.ru");
        String uploadedName = UUID.randomUUID().toString() + ".ics";
        String path = folder + "/" + uploadedName;
        api.uploadFile(new UploadFileRequestData(path, fileBytes, storage));
        ObjectExist exist = api.objectExists(new ObjectExistsRequestData(path, storage, null));
        assert exist.isExists();
    }

    @Test
    public void contactFormatTest() throws Exception {
        String[] formats = {"vcard", "msg"};
        for(String format: formats) {
            String extension = format.equals("vcard") ? ".vcf" : ".msg";
            String fileName = UUID.randomUUID().toString() + extension;
            api.createContact(new CreateContactRequestData(
                format,
                fileName, 
                new HierarchicalObjectRequest()
                    .storageFolder(
                        new StorageFolderLocation()
                            .folderPath(folder)
                            .storage(storage))
                    .hierarchicalObject(
                        (HierarchicalObject) new HierarchicalObject()
                            .internalProperties(new ArrayList<BaseObject>())
                            .name("CONTACT"))));
            String path = folder + "/" + fileName;
            ObjectExist exist = api.objectExists(new ObjectExistsRequestData(path, storage, null));
            assert exist.isExists();
        }
    }

    private String createCalendar() throws Exception {
        Calendar startDate = Calendar.getInstance();
        return createCalendar(startDate);
    }

    private String createCalendar(Calendar startDate) throws Exception {
        String fileName = UUID.randomUUID().toString() + ".ics";
        Calendar endDate =(Calendar) startDate.clone();
        endDate.set(Calendar.HOUR_OF_DAY, endDate.get(Calendar.HOUR_OF_DAY + 1));
        api.createCalendar(new CreateCalendarRequestData(fileName, new HierarchicalObjectRequest()
            .storageFolder(
                new StorageFolderLocation()
                    .folderPath(folder)
                    .storage(storage))
            .hierarchicalObject(
                (HierarchicalObject) new HierarchicalObject()
                    .addInternalPropertiesItem(
                        new PrimitiveObject()
                            .value("location")
                            .name("LOCATION"))
                    .addInternalPropertiesItem(
                        new PrimitiveObject()
                            .value(dateFormat.format(startDate.getTime()))
                            .name("STARTDATE"))
                    .addInternalPropertiesItem(
                        new PrimitiveObject()
                            .value(dateFormat.format(endDate.getTime()))
                            .name("ENDDATE"))
                    .addInternalPropertiesItem(
                        new HierarchicalObject()
                            .addInternalPropertiesItem(
                                new PrimitiveObject()
                                    .value("organizer@am.ru")
                                    .name("ADDRESS"))
                            .addInternalPropertiesItem(
                                new PrimitiveObject()
                                    .value("Organizer Name")
                                    .name("DISPLAYNAME"))
                            .name("ORGANIZER"))
                    .addInternalPropertiesItem(
                        new HierarchicalObject()
                            .addInternalPropertiesItem(
                                new IndexedHierarchicalObject()
                                    .index(0)
                                    .addInternalPropertiesItem(
                                        new PrimitiveObject()
                                            .value("attendee@am.ru")
                                            .name("ADDRESS"))
                                    .addInternalPropertiesItem(
                                        new PrimitiveObject()
                                            .value("Attendee Name")
                                            .name("DISPLAYNAME"))
                                    .name("ATTENDEE"))
                            .name("ATTENDEES"))
                    .name("CALENDAR"))));
        return fileName;
    }
}