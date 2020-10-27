package com.aspose.email.cloud.sdk.api;

import com.aspose.email.cloud.sdk.api.utils.TestBase;
import com.aspose.email.cloud.sdk.model.*;
import org.testng.annotations.Test;

import java.io.UnsupportedEncodingException;
import java.util.Calendar;
import java.util.UUID;

public class MapiCalendarTests extends TestBase {
    private static final MapiCalendarDto mapiCalendar = (MapiCalendarDto) new MapiCalendarDto()
        .attendees(new MapiCalendarAttendeesDto()
            .addAppointmentRecipientsItem(
                new MapiRecipientDto()
                    .addressType("SMTP")
                    .displayName("Organizer Name")
                    .emailAddress("organizer@aspose.com")
                    .recipientType("MapiTo"))
            .addAppointmentRecipientsItem(
                new MapiRecipientDto()
                    .addressType("SMTP")
                    .displayName("Attendee Name")
                    .emailAddress("attendee@aspose.com")
                    .recipientType("MapiTo")))
        .addClientIntentItem("Manager")
        .recurrence(new MapiCalendarEventRecurrenceDto()
            .recurrencePattern(new MapiCalendarDailyRecurrencePatternDto()
                .occurrenceCount((long) 10)
                .weekStartDay("Monday")))
        .organizer(new MapiElectronicAddressDto()
            .emailAddress("organizer@aspose.com"))
        .busyStatus("Tentative")
        .startDate(Calendar.getInstance().getTime())
        .endDate(Calendar.getInstance().getTime())
        .location("Some location")
        .body("Some description")
        .bodyType("PlainText")
        .subject("Some summary");

    @Test(groups = {"pipeline"})
    public void modelToCalendarDtoTest() {
        CalendarDto calendarDto = api.mapi().calendar().asCalendarDto(mapiCalendar);
        assert mapiCalendar.getSubject().equals(calendarDto.getSummary());
        assert mapiCalendar.getLocation().equals(calendarDto.getLocation());
    }

    @Test(groups = {"pipeline"})
    public void ModelToFileTest() throws UnsupportedEncodingException {
        byte[] ics =
            api.mapi().calendar().asFile(
                Models.mapiCalendarAsFileRequest()
                    .format("Ics")
                    .value(mapiCalendar)
                    .build());
        String calendarContent = new String(ics, "UTF-8");
        assert calendarContent.contains(mapiCalendar.getLocation());

        MapiCalendarDto mapiCalendarConverted =
            api.mapi().calendar().fromFile(new MapiCalendarFromFileRequest(ics));
        assert mapiCalendar.getLocation().equals(mapiCalendarConverted.getLocation());
    }

    @Test(groups = {"pipeline"})
    public void StorageTest() {
        String fileName = UUID.randomUUID().toString() + ".msg";
        api.mapi().calendar().save(
            new MapiCalendarSaveRequest(new StorageFileLocation(storage, folder, fileName),
                mapiCalendar, "Msg"));
        MapiCalendarDto mapiCalendarFromStorage =
            api.mapi().calendar().get(new MapiCalendarGetRequest(fileName, folder, storage));
        assert mapiCalendar.getLocation().equals(mapiCalendarFromStorage.getLocation());
    }
}
