# clientFolderGetListRequest

Request model for ClientFolderApi.getList

## Properties

Name | Type | Description | Notes
---- | ---- | ----------- | -----
**account** | **String**| Email account |
**storage** | **String**| Storage name where account file located | [optional]
**accountStorageFolder** | **String**| Folder in storage where account file located | [optional]
**parentFolder** | **String**| Folder in which subfolders should be listed | [optional]

## Example
```java
ClientFolderGetListRequest request = Models.clientFolderGetListRequest()
    .account("email.multi.account")
    .storage("First Storage")
    .accountStorageFolder("email/account/location/on/storage")
    .parentFolder("INBOX")
    .build();
```

