package com.aspose.email.cloud.sdk.api;

import com.aspose.email.cloud.sdk.invoker.ApiException;
import com.aspose.email.cloud.sdk.model.*;
import com.aspose.email.cloud.sdk.model.requests.CreateCalendarRequestData;
import com.aspose.email.cloud.sdk.model.requests.CreateFolderRequestData;
import com.aspose.email.cloud.sdk.model.requests.DeleteFolderRequestData;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.UUID;

public class TestBase {
    protected EmailApi api;
    protected String folder;
    protected static final String storage = "First Storage";
    protected static final DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss'Z'");

    @BeforeClass(alwaysRun = true)
    public void oneTimeSetUp() throws ApiException {
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

    @AfterClass(alwaysRun = true)
    public void oneTimeTearDown() throws ApiException {
        api.deleteFolder(new DeleteFolderRequestData(folder, storage, true));
    }

    protected String createCalendar() throws ApiException {
        Calendar startDate = Calendar.getInstance();
        return createCalendar(startDate);
    }

    protected String createCalendar(Calendar startDate) throws ApiException {
        String fileName = UUID.randomUUID().toString() + ".ics";
        Calendar endDate = (Calendar) startDate.clone();
        endDate.set(Calendar.HOUR_OF_DAY, endDate.get(Calendar.HOUR_OF_DAY) + 1);
        api.createCalendar(new CreateCalendarRequestData(fileName, new HierarchicalObjectRequest(
            new HierarchicalObject("CALENDAR", null, Arrays.asList(
                new PrimitiveObject("LOCATION", null, "location"),
                new PrimitiveObject("STARTDATE", null, dateFormat.format(startDate.getTime())),
                new PrimitiveObject("ENDDATE", null, dateFormat.format(endDate.getTime())),
                new HierarchicalObject("ORGANIZER", null, Arrays.<BaseObject>asList(
                    new PrimitiveObject("ADDRESS", null, "organizer@am.ru"),
                    new PrimitiveObject("DISPLAYNAME", null, "Organizer Name"))),
                new HierarchicalObject("ATTENDEES", null, Collections.<BaseObject>singletonList(
                    new IndexedHierarchicalObject(
                        "ATTENDEE", null, 0, Arrays.<BaseObject>asList(
                        new PrimitiveObject("ADDRESS", null, "attendee@am.ru"),
                        new PrimitiveObject("DISPLAYNAME", null, "Attendee Name"))))))),
            new StorageFolderLocation(storage, folder))));
        return fileName;
    }
}