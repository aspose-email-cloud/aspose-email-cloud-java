# MapiCalendarAsFileRequest

Convert MapiCalendar to file request.             

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**format** | **String** | Calendar file format Enum, available values: Ics, Msg | 
**value** | [**MapiCalendarDto**](MapiCalendarDto.md) | MAPI calendar model.              | 



## Example
```java
MapiCalendarAsFileRequest mapiCalendarAsFileRequest = Models.mapiCalendarAsFileRequest()
    .format("Msg")
    .value(Models.mapiCalendarDto()
        .attendees(Models.mapiCalendarAttendeesDto()
            .appointmentRecipients(Arrays.<MapiRecipientDto>asList(
                Models.mapiRecipientDto()
                    .emailAddress("organizer@aspose.com")
                    .addressType("SMTP")
                    .displayName("Organizer Name")
                    .recipientType("MapiTo")
                    .build(),
                Models.mapiRecipientDto()
                    .emailAddress("attendee@aspose.com")
                    .addressType("SMTP")
                    .displayName("Attendee Name")
                    .recipientType("MapiTo")
                    .build()))
            .build())
        .busyStatus("Tentative")
        .clientIntent(Arrays.<MapiCalendarClientIntent>asList(
            "Manager"))
        .endDate(Calendar.getInstance().getTime())
        .location("Some location")
        .recurrence(Models.mapiCalendarEventRecurrenceDto()
            .recurrencePattern(Models.mapiCalendarDailyRecurrencePatternDto()
                .frequency("Daily")
                .occurrenceCount(10)
                .weekStartDay("Monday")
                .build())
            .build())
        .startDate(Calendar.getInstance().getTime())
        .organizer(Models.mapiElectronicAddressDto()
            .emailAddress("organizer@aspose.com")
            .build())
        .body("Some description")
        .subject("Some summary")
        .build())
    .build();
```


[[Back to Model list]](Models.md) [[Back to API README]](README.md)
