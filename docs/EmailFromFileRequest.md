# EmailFromFileRequest

Request model for EmailApi.fromFile

## Properties

Name | Type | Description | Notes
---- | ---- | ----------- | -----
**format** | **String**|  Enum, available values: Eml, Msg, MsgUnicode, Mhtml, Html, Tnef, Oft |
**file** | **byte[]**| File to convert |

## Example
```java
EmailFromFileRequest request = Models.emailFromFileRequest()
    .format("Eml")
    .file(IOUtils.toByteArray(new FileInputStream("/path/to/message.eml")))
    .build();
```

