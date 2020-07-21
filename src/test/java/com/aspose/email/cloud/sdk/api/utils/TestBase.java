package com.aspose.email.cloud.sdk.api.utils;

import com.aspose.email.cloud.sdk.api.EmailCloud;
import com.aspose.email.cloud.sdk.invoker.ApiException;
import com.aspose.email.cloud.sdk.invoker.Configuration;
import com.aspose.email.cloud.sdk.model.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.UUID;

@Listeners({TestNameLogger.class})
public class TestBase {
    protected static final String storage = "First Storage";
    protected static final DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss'Z'");
    protected static final String location = "Some location";
    protected EmailCloud api;
    protected String folder;

    protected CalendarDto getCalendarDto() {
        return new CalendarDto()
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
    }


    @BeforeClass(alwaysRun = true)
    public void oneTimeSetUp() throws Exception {
        Configuration configuration = new Configuration();
        configuration.AppKey = System.getenv("appKey");
        configuration.AppSid = System.getenv("appSid");
        configuration.setApiBaseUrl(System.getenv("apiBaseUrl"));
        configuration.setApiVersion("v4.0");
        configuration.setAuthUrl(System.getenv("authUrl"));
        api = new EmailCloud(configuration);
        folder = UUID.randomUUID().toString();
        api.CloudStorage().Folder().createFolder(new CreateFolderRequest(folder, storage));
    }

    @AfterClass(alwaysRun = true)
    public void oneTimeTearDown() throws ApiException {
        api.CloudStorage().Folder().deleteFolder(new DeleteFolderRequest(folder, storage, true));
    }

    protected String createCalendar() throws ApiException {
        Calendar startDate = Calendar.getInstance();
        return createCalendar(startDate);
    }

    protected String createCalendar(Calendar startDate) throws ApiException {
        String fileName = UUID.randomUUID().toString() + ".ics";
        Calendar endDate = (Calendar) startDate.clone();
        endDate.set(Calendar.HOUR_OF_DAY, endDate.get(Calendar.HOUR_OF_DAY) + 1);
        CalendarDto calendarDto = getCalendarDto();
        calendarDto.setStartDate(startDate.getTime());
        calendarDto.setEndDate(endDate.getTime());
        api.Calendar().Save(
            new CalendarSaveRequest(new StorageFileLocation(storage, folder, fileName), calendarDto,
                "Ics"));
        return fileName;
    }
}