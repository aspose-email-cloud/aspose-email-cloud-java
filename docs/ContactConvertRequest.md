# contactConvertRequest

Request model for ContactApi.convert

## Properties

Name | Type | Description | Notes
---- | ---- | ----------- | -----
**toFormat** | **String**| File format to convert to Enum, available values: VCard, WebDav, Msg |
**fromFormat** | **String**| File format to convert from Enum, available values: VCard, WebDav, Msg |
**file** | **byte[]**| File to convert |

## Example
```java
ContactConvertRequest request = Models.contactConvertRequest()
    .toFormat("VCard")
    .fromFormat("Msg")
    .file(IOUtils.toByteArray(new FileInputStream("/path/to/contact.msg")))
    .build();
```

