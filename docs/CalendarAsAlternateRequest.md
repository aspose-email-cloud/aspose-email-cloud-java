# CalendarAsAlternateRequest

Convert iCalendar to AlternateView request             

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | [**CalendarDto**](CalendarDto.md) | iCalendar document model              | 
**action** | **String** | iCalendar actions. Enum, available values: Create, Update, Cancel | 
**sequenceId** | **String** | iCalendar sequence id              |  [optional]



## Example
```java
CalendarAsAlternateRequest calendarAsAlternateRequest = Models.calendarAsAlternateRequest()
    .value(Models.calendarDto()
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
        .build())
    .sequenceId("cf4ffb6c-895d-4e58-bdb4-0a3918e96a43")
    .build();
```


[[Back to Model list]](Models.md) [[Back to API README]](README.md)
