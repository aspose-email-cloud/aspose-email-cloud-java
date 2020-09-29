# emailGetListRequest

Request model for EmailApi.getList

## Properties

Name | Type | Description | Notes
---- | ---- | ----------- | -----
**format** | **String**| Email document format. Enum, available values: Eml, Msg, MsgUnicode, Mhtml, Html, Tnef, Oft |
**folder** | **String**| Path to folder in storage. | [optional]
**storage** | **String**| Storage name. | [optional]
**itemsPerPage** | **Integer**| Count of items on page. | [optional] [default to 10]
**pageNumber** | **Integer**| Page number. | [optional] [default to 0]

## Example
```java
EmailGetListRequest request = Models.emailGetListRequest()
    .format("Eml")
    .folder("folder/on/storage")
    .storage("First Storage")
    .itemsPerPage(10)
    .pageNumber(0)
    .build();
```

