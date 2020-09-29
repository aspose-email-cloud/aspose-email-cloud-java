
# ClientThreadSetIsReadRequest

Mark thread messages as read or unread request.             

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**isRead** | **Boolean** | Message is read flag.              | 
**folder** | **String** | Folder on email server, where thread is stored.              |  [optional]

## Parent class

See: [ClientThreadBaseRequest](ClientThreadBaseRequest.md)


## Example
```java
ClientThreadSetIsReadRequest clientThreadSetIsReadRequest = Models.clientThreadSetIsReadRequest()
    .isRead(true)
    .folder("INBOX")
    .threadId("5")
    .accountLocation(Models.storageFileLocation()
        .fileName("email.account")
        .storage("First Storage")
        .folderPath("file/location/folder/on/storage")
        .build())
    .build();
```


[[Back to Model list]](Models.md) [[Back to API README]](README.md)

