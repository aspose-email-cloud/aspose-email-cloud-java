# CalendarGetAsAlternateRequest

Request model for CalendarApi.getAsAlternate

## Properties

Name | Type | Description | Notes
---- | ---- | ----------- | -----
**fileName** | **String**| iCalendar file name in storage |
**calendarAction** | **String**| iCalendar method type Enum, available values: Create, Update, Cancel |
**sequenceId** | **String**| The sequence id | [optional]
**folder** | **String**| Path to folder in storage | [optional]
**storage** | **String**| Storage name | [optional]

## Example
```java
CalendarGetAsAlternateRequest request = Models.calendarGetAsAlternateRequest()
    .fileName("calendar.ics")
    .calendarAction("Create")
    .folder("calendar/location/on/storage")
    .storage("First Storage")
    .build();
```

