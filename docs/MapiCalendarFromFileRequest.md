# mapiCalendarFromFileRequest

Request model for MapiCalendarApi.fromFile

## Properties

Name | Type | Description | Notes
---- | ---- | ----------- | -----
**file** | **byte[]**| File to convert |

## Example
```java
MapiCalendarFromFileRequest request = Models.mapiCalendarFromFileRequest()
    .file(IOUtils.toByteArray(new FileInputStream("/path/to/calendar.msg")))
    .build();
```

