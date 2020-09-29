
# MapiCalendarDto

Represents the mapi calendar object             

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**appointmentCounterProposal** | **Boolean** | Value indicating whether a Meeting Response object is a counter proposal.              | 
**attendees** | [**MapiCalendarAttendeesDto**](MapiCalendarAttendeesDto.md) | Attendees              |  [optional]
**busyStatus** | **String** | Enumerates the mapi calendar possible busy status Enum, available values: Free, Tentative, Busy, OutOfOffice | 
**clientIntent** | **List&lt;String&gt;** | Actions the user has taken on this Meeting object.              Items: Enumerates the actions the user can taken on the Meeting object Enum, available values: Manager, Delegate, DeletedWithNoResponse, DeletedExceptionWithNoResponse, RespondedTentative, RespondedAccept, RespondedDecline, ModifiedStartTime, ModifiedEndTime, ModifiedLocation, RespondedExceptionDecline, Canceled, ExceptionCanceled |  [optional]
**endDate** | [**Date**](Date.md) | End date and time of the event. If the date is not set, default value for DateTime is returned.              | 
**endDateTimeZone** | [**MapiCalendarTimeZoneDto**](MapiCalendarTimeZoneDto.md) | Time zone information that indicates the time zone of the EndDate property.              |  [optional]
**isAllDay** | **Boolean** | Value indicating whether the event is an all-day event.              | 
**keyWords** | **String** | Categories of the calendar object.              |  [optional]
**location** | **String** | Location of the event.              |  [optional]
**recurrence** | [**MapiCalendarEventRecurrenceDto**](MapiCalendarEventRecurrenceDto.md) | Recurrence properties.              |  [optional]
**reminderDelta** | **Integer** | Interval, in minutes, between the time at which the reminder first becomes overdue and the start time of the Calendar object.              | 
**reminderFileParameter** | **String** | Full path of the sound that a client SHOULD play when the reminder becomes overdue.              |  [optional]
**reminderSet** | **Boolean** | Value indicating whether a reminder is set on the object.              | 
**sequence** | **Integer** | Sequence number.              | 
**startDate** | [**Date**](Date.md) | Start date and time of the event. If the date is not set, default value for DateTime is returned.              | 
**startDateTimeZone** | [**MapiCalendarTimeZoneDto**](MapiCalendarTimeZoneDto.md) | Time zone information that indicates the time zone of the StartDate property.              |  [optional]
**uid** | **String** | Unique identifier.              |  [optional]
**organizer** | [**MapiElectronicAddressDto**](MapiElectronicAddressDto.md) | Organizer              |  [optional]

## Parent class

See: [MapiMessageItemBaseDto](MapiMessageItemBaseDto.md)


## Example
```java
MapiCalendarDto mapiCalendarDto = Models.mapiCalendarDto()
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
    .build();
```


[[Back to Model list]](Models.md) [[Back to API README]](README.md)

