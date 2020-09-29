# calendarConvertRequest

Request model for CalendarApi.convert

## Properties

Name | Type | Description | Notes
---- | ---- | ----------- | -----
**format** | **String**| File format. Enum, available values: Ics, Msg |
**file** | **byte[]**| File to convert |

## Example
```java
CalendarConvertRequest request = Models.calendarConvertRequest()
    .format("Ics")
    .file(IOUtils.toByteArray(new FileInputStream("/path/to/calendar.msg")))
    .build();
```

