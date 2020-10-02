# ClientMessageFetchFileRequest

Request model for ClientMessageApi.fetchFile

## Properties

Name | Type | Description | Notes
---- | ---- | ----------- | -----
**messageId** | **String**| Message identifier |
**account** | **String**| Email account |
**folder** | **String**| Account folder to fetch from (should be specified for some protocols such as IMAP)              | [optional]
**storage** | **String**| Storage name where account file located. | [optional]
**accountStorageFolder** | **String**| Folder in storage where account file located. | [optional]
**format** | **String**| Fetched message file format. Enum, available values: Eml, Msg, MsgUnicode, Mhtml, Html, Tnef, Oft | [optional] [default to 0]

## Example
```java
ClientMessageFetchFileRequest request = Models.clientMessageFetchFileRequest()
    .messageId("<put your message identifier here>")
    .account("email.multi.account")
    .folder("INBOX")
    .storage("First Storage")
    .accountStorageFolder("email/account/location/on/storage")
    .format("Eml")
    .build();
```

