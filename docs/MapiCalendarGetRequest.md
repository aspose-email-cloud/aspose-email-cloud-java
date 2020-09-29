# mapiCalendarGetRequest

Request model for MapiCalendarApi.get

## Properties

Name | Type | Description | Notes
---- | ---- | ----------- | -----
**fileName** | **String**| Calendar file name in storage. |
**folder** | **String**| Path to folder in storage. | [optional]
**storage** | **String**| Storage name. | [optional]

## Example
```java
MapiCalendarGetRequest request = Models.mapiCalendarGetRequest()
    .fileName("calendar.msg")
    .folder("calendar/location/on/storage")
    .storage("First Storage")
    .build();
```

