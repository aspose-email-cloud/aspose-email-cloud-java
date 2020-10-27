# ClientMessageMoveRequest

Email client move message request.             

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sourceFolder** | **String** | Folder to move message from.              |  [optional]
**destinationFolder** | **String** | Folder to move message to.              | 

## Parent class

See: [ClientMessageBaseRequest](ClientMessageBaseRequest.md)


## Example
```java
ClientMessageMoveRequest clientMessageMoveRequest = Models.clientMessageMoveRequest()
    .sourceFolder("INBOX")
    .destinationFolder("INBOX/SubFolder")
    .messageId("5")
    .accountLocation(Models.storageFileLocation()
        .fileName("email.account")
        .storage("First Storage")
        .folderPath("file/location/folder/on/storage")
        .build())
    .build();
```


[[Back to Model list]](Models.md) [[Back to API README]](README.md)
