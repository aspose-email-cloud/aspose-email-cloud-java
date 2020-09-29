# clientMessageSendFileRequest

Request model for ClientMessageApi.sendFile

## Properties

Name | Type | Description | Notes
---- | ---- | ----------- | -----
**account** | **String**| Email account |
**file** | **byte[]**| File to send |
**storage** | **String**| Storage name where account file located. | [optional]
**accountStorageFolder** | **String**| Folder in storage where account file located. | [optional]
**format** | **String**| Email file format Enum, available values: Eml, Msg, MsgUnicode, Mhtml, Html, Tnef, Oft | [optional] [default to 0]

## Example
```java
ClientMessageSendFileRequest request = Models.clientMessageSendFileRequest()
    .account("email.multi.account")
    .file(IOUtils.toByteArray(new FileInputStream("/path/to/message.eml")))
    .storage("First Storage")
    .accountStorageFolder("email/account/location/on/storage")
    .format("Eml")
    .build();
```

