# ClientThreadGetMessagesRequest

Request model for ClientThreadApi.getMessages

## Properties

Name | Type | Description | Notes
---- | ---- | ----------- | -----
**threadId** | **String**| Thread identifier |
**account** | **String**| Email account |
**folder** | **String**| Specifies account folder to get thread from              | [optional]
**storage** | **String**| Storage name where account file located | [optional]
**accountStorageFolder** | **String**| Folder in storage where account file located | [optional]

## Example
```java
ClientThreadGetMessagesRequest request = Models.clientThreadGetMessagesRequest()
    .threadId("5")
    .account("email.account")
    .folder("INBOX")
    .storage("First Storage")
    .accountStorageFolder("email/account/location/on/storage")
    .build();
```

