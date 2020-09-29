
# ClientThreadMoveRequest

Email client move thread request.             

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**destinationFolder** | **String** | Email account folder to move thread to.              | 

## Parent class

See: [ClientThreadBaseRequest](ClientThreadBaseRequest.md)


## Example
```java
ClientThreadMoveRequest clientThreadMoveRequest = Models.clientThreadMoveRequest()
    .destinationFolder("INBOX/SubFolder")
    .threadId("5")
    .accountLocation(Models.storageFileLocation()
        .fileName("email.account")
        .storage("First Storage")
        .folderPath("file/location/folder/on/storage")
        .build())
    .build();
```


[[Back to Model list]](Models.md) [[Back to API README]](README.md)

