# EmailConvertRequest

Request model for EmailApi.convert

## Properties

Name | Type | Description | Notes
---- | ---- | ----------- | -----
**fromFormat** | **String**| File format to convert to Enum, available values: Eml, Msg, MsgUnicode, Mhtml, Html, Tnef, Oft |
**toFormat** | **String**| File format to convert from Enum, available values: Eml, Msg, MsgUnicode, Mhtml, Html, Tnef, Oft |
**file** | **byte[]**| File to convert |

## Example
```java
EmailConvertRequest request = Models.emailConvertRequest()
    .fromFormat("Msg")
    .toFormat("Mhtml")
    .file(IOUtils.toByteArray(new FileInputStream("/path/to/message.msg")))
    .build();
```

