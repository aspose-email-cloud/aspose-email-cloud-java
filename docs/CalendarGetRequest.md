# calendarGetRequest

Request model for CalendarApi.get

## Properties

Name | Type | Description | Notes
---- | ---- | ----------- | -----
**fileName** | **String**| iCalendar file name in storage. |
**folder** | **String**| Path to folder in storage. | [optional]
**storage** | **String**| Storage name. | [optional]

## Example
```java
CalendarGetRequest request = Models.calendarGetRequest()
    .fileName("calendar.ics")
    .folder("calendar/location/on/storage")
    .storage("First Storage")
    .build();
```

