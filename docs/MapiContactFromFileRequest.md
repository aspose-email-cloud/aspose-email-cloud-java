# mapiContactFromFileRequest

Request model for MapiContactApi.fromFile

## Properties

Name | Type | Description | Notes
---- | ---- | ----------- | -----
**format** | **String**| File format Enum, available values: VCard, WebDav, Msg |
**file** | **byte[]**| File to convert |

## Example
```java
MapiContactFromFileRequest request = Models.mapiContactFromFileRequest()
    .format("Msg")
    .file(IOUtils.toByteArray(new FileInputStream("/path/to/contact.msg")))
    .build();
```

