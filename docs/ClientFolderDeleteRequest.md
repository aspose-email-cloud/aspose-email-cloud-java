# ClientFolderDeleteRequest

Email client delete folder request.             

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**folder** | **String** | Path to folder to delete.              | 

## Parent class

See: [ClientAccountBaseRequest](ClientAccountBaseRequest.md)


## Example
```java
ClientFolderDeleteRequest clientFolderDeleteRequest = Models.clientFolderDeleteRequest()
    .folder("INBOX/SubFolder/FolderToDelete")
    .accountLocation(Models.storageFileLocation()
        .fileName("email.account")
        .storage("First Storage")
        .folderPath("file/location/folder/on/storage")
        .build())
    .build();
```


[[Back to Model list]](Models.md) [[Back to API README]](README.md)
