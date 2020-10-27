# CalendarGetListRequest

Request model for CalendarApi.getList

## Properties

Name | Type | Description | Notes
---- | ---- | ----------- | -----
**folder** | **String**| Path to folder in storage. |
**itemsPerPage** | **Integer**| Count of items on page. | [optional] [default to 10]
**pageNumber** | **Integer**| Page number. | [optional] [default to 0]
**storage** | **String**| Storage name. | [optional]

## Example
```java
CalendarGetListRequest request = Models.calendarGetListRequest()
    .folder("some/folder/on/storage")
    .itemsPerPage(10)
    .pageNumber(0)
    .storage("First Storage")
    .build();
```

