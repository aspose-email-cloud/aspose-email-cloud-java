# CalendarSaveRequest

Save iCalendar to storage request.             

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**format** | **String** | Calendar file format Enum, available values: Ics, Msg | 

## Parent class

See: [StorageModelOfCalendarDto](StorageModelOfCalendarDto.md)


## Example
```java
CalendarSaveRequest calendarSaveRequest = Models.calendarSaveRequest()
    .storageFile(Models.storageFileLocation()
        .fileName("calendar.ics")
        .storage("First Storage")
        .folderPath("file/location/folder/on/storage")
        .build())
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
    .build();
```


[[Back to Model list]](Models.md) [[Back to API README]](README.md)
