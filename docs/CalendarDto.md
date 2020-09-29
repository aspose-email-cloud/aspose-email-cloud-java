
# CalendarDto

iCalendar document representation.             

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attachments** | [**List&lt;Attachment&gt;**](Attachment.md) | Document attachments. |  [optional]
**attendees** | [**List&lt;MailAddress&gt;**](MailAddress.md) | Event attendees. | 
**description** | **String** | Description. |  [optional]
**endDate** | [**Date**](Date.md) | End date. | 
**endTimeZone** | **String** | End time zone. |  [optional]
**flags** | **List&lt;String&gt;** | Appointment flags. Items: Enumerates iCalendar flags. Enum, available values: None, AllDayEvent |  [optional]
**isDescriptionHtml** | **Boolean** | Indicates if description is in HTML format. | 
**location** | **String** | Location. | 
**method** | **String** | Defines the iCalendar object method type associated with the calendar document. Enum, available values: None, Publish, Request, Reply, Add, Cancel, Refresh, Counter, DeclineCounter | 
**microsoftBusyStatus** | **String** | Specifies the BUSY status. Enum, available values: NotDefined, Free, Tentative, Busy, Oof | 
**microsoftIntendedStatus** | **String** | Specifies the INTENDED status. Enum, available values: NotDefined, Free, Tentative, Busy, Oof | 
**optionalAttendees** | [**List&lt;MailAddress&gt;**](MailAddress.md) | Optional attendees.              |  [optional]
**organizer** | [**MailAddress**](MailAddress.md) | Event organizer.              | 
**recurrenceString** | **String** | Deprecated, use &#39;Recurrence&#39; property. String representation of recurrence pattern (See iCalendar RFC, \&quot;Recurrence rule\&quot; section). For example:               For daily recurrence:         \&quot;FREQ&#x3D;DAILY;COUNT&#x3D;10;WKST&#x3D;MO\&quot;                   For monthly recurrence:         \&quot;BYSETPOS&#x3D;1;BYDAY&#x3D;MO,TU,WE,TH,FR;FREQ&#x3D;MONTHLY;INTERVAL&#x3D;10;WKST&#x3D;MO\&quot;                   For yearly recurrence:         \&quot;BYMONTHDAY&#x3D;30;BYMONTH&#x3D;1;FREQ&#x3D;YEARLY;WKST&#x3D;MO\&quot;                    |  [optional]
**recurrence** | [**RecurrencePatternDto**](RecurrencePatternDto.md) | Recurrence pattern              |  [optional]
**reminders** | [**List&lt;CalendarReminder&gt;**](CalendarReminder.md) | Reminders. |  [optional]
**sequenceId** | **String** | The sequence id. Read only. |  [optional]
**startDate** | [**Date**](Date.md) | Start date. | 
**startTimeZone** | **String** | Start time zone. |  [optional]
**status** | **String** | Defines the overall status or confirmation for the calendar document. Enum, available values: NotDefined, Cancelled, Tentative, Confirmed | 
**summary** | **String** | Summary. |  [optional]
**transparency** | **String** | Specifies whether or not this appointment is intended to be visible in availability searches. Enum, available values: NotDefined, Transparent, Opaque | 



## Example
```java
CalendarDto calendarDto = Models.calendarDto()
    .attendees(Arrays.<MailAddress>asList(
        Models.mailAddress()
            .displayName("Attendee Name")
            .address("attendee@aspose.com")
            .participationStatus("Accepted")
            .build()))
    .description("Some description")
    .endDate(Calendar.getInstance().getTime())
    .location("Some location")
    .organizer(Models.mailAddress()
        .displayName("Organizer Name")
        .address("organizer@aspose.com")
        .build())
    .recurrence(Models.dailyRecurrencePatternDto()
        .interval(-1)
        .occurs(10)
        .weekStart("Monday")
        .build())
    .startDate(Calendar.getInstance().getTime())
    .summary("Some summary")
    .build();
```


[[Back to Model list]](Models.md) [[Back to API README]](README.md)

