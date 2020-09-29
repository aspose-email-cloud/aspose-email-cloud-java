# contactGetListRequest

Request model for ContactApi.getList

## Properties

Name | Type | Description | Notes
---- | ---- | ----------- | -----
**format** | **String**| Contact document format. Enum, available values: VCard, WebDav, Msg |
**folder** | **String**| Path to folder in storage. | [optional]
**storage** | **String**| Storage name. | [optional]
**itemsPerPage** | **Integer**| Count of items on page. | [optional] [default to 10]
**pageNumber** | **Integer**| Page number. | [optional] [default to 0]

## Example
```java
ContactGetListRequest request = Models.contactGetListRequest()
    .format("VCard")
    .folder("folder/on/storage")
    .storage("First Storage")
    .itemsPerPage(10)
    .pageNumber(0)
    .build();
```

