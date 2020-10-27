# ClientThreadDeleteRequest

Delete email client thread request.             

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**folder** | **String** | Folder on email server, where thread is stored.              |  [optional]

## Parent class

See: [ClientThreadBaseRequest](ClientThreadBaseRequest.md)


## Example
```java
ClientThreadDeleteRequest clientThreadDeleteRequest = Models.clientThreadDeleteRequest()
    .folder("INBOX/SubFolder")
    .threadId("5")
    .accountLocation(Models.storageFileLocation()
        .fileName("email.account")
        .storage("First Storage")
        .folderPath("file/location/folder/on/storage")
        .build())
    .build();
```


[[Back to Model list]](Models.md) [[Back to API README]](README.md)
