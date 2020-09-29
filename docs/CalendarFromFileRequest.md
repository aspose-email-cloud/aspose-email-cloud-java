# calendarFromFileRequest

Request model for CalendarApi.fromFile

## Properties

Name | Type | Description | Notes
---- | ---- | ----------- | -----
**file** | **byte[]**| File to convert |

## Example
```java
CalendarFromFileRequest request = Models.calendarFromFileRequest()
    .file(IOUtils.toByteArray(new FileInputStream("/path/to/calendar.ics")))
    .build();
```

