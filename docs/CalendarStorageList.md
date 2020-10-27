# CalendarStorageList

iCalendar models list with corresponding storage locations.             

## Properties
Class has no properties

## Parent class

See: [ListResponseOfStorageModelOfCalendarDto](ListResponseOfStorageModelOfCalendarDto.md)


## Example
```java
CalendarStorageList calendarStorageList = Models.calendarStorageList()
    .value(Arrays.<StorageModelOfCalendarDto>asList(
        Models.storageModelOfCalendarDto()
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
            .build()))
    .build();
```


[[Back to Model list]](Models.md) [[Back to API README]](README.md)
