# calendarGetAsFileRequest

Request model for CalendarApi.getAsFile

## Properties

Name | Type | Description | Notes
---- | ---- | ----------- | -----
**fileName** | **String**| Calendar document file name. |
**format** | **String**| File format. Enum, available values: Ics, Msg |
**storage** | **String**| Storage name. | [optional]
**folder** | **String**| Path to folder in storage. | [optional]

## Example
```java
CalendarGetAsFileRequest request = Models.calendarGetAsFileRequest()
    .fileName("calendar.msg")
    .format("Ics")
    .storage("First Storage")
    .folder("calendar/file/location/on/storage")
    .build();
```

