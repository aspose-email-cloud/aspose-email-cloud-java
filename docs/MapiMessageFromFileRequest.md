# mapiMessageFromFileRequest

Request model for MapiMessageApi.fromFile

## Properties

Name | Type | Description | Notes
---- | ---- | ----------- | -----
**format** | **String**| File format Enum, available values: Eml, Msg, MsgUnicode, Mhtml, Html, Tnef, Oft |
**file** | **byte[]**| File to convert |

## Example
```java
MapiMessageFromFileRequest request = Models.mapiMessageFromFileRequest()
    .format("Msg")
    .file(IOUtils.toByteArray(new FileInputStream("/path/to/message.msg")))
    .build();
```

