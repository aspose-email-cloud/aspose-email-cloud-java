# ClientMessageAppendFileRequest

Request model for ClientMessageApi.appendFile

## Properties

Name | Type | Description | Notes
---- | ---- | ----------- | -----
**account** | **String**| Email account. |
**file** | **byte[]**| Message file to append. |
**storage** | **String**| Storage name where account file located. | [optional]
**accountStorageFolder** | **String**| Folder in storage where account file located. | [optional]
**format** | **String**| Email file format. Enum, available values: Eml, Msg, MsgUnicode, Mhtml, Html, Tnef, Oft | [optional] [default to 0]
**folder** | **String**| Path to folder on email server to append message to. | [optional]
**markAsSent** | **Boolean**| Determines that appended message should be market as sent or not. | [optional] [default to true]

## Example
```java
ClientMessageAppendFileRequest request = Models.clientMessageAppendFileRequest()
    .account("email.multi.account")
    .file(IOUtils.toByteArray(new FileInputStream("/path/to/message.eml")))
    .storage("First Storage")
    .accountStorageFolder("email/account/location/on/storage")
    .format("Eml")
    .folder("INBOX")
    .build();
```

