# ClientFolderCreateRequest

Email Client create folder request.             

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**parentFolder** | **String** | Path to parent folder.              |  [optional]
**folderName** | **String** | Folder name.              | 

## Parent class

See: [ClientAccountBaseRequest](ClientAccountBaseRequest.md)


## Example
```java
ClientFolderCreateRequest clientFolderCreateRequest = Models.clientFolderCreateRequest()
    .parentFolder("INBOX/SubFolder/ParentFolder")
    .folderName("NewFolder")
    .accountLocation(Models.storageFileLocation()
        .fileName("email.account")
        .storage("First Storage")
        .folderPath("file/location/folder/on/storage")
        .build())
    .build();
```


[[Back to Model list]](Models.md) [[Back to API README]](README.md)
