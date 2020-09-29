
# ClientMessageDeleteRequest

Email client delete message request.             

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**folder** | **String** | Folder to delete message from.              |  [optional]

## Parent class

See: [ClientMessageBaseRequest](ClientMessageBaseRequest.md)


## Example
```java
ClientMessageDeleteRequest clientMessageDeleteRequest = Models.clientMessageDeleteRequest()
    .folder("INBOX")
    .messageId("5")
    .accountLocation(Models.storageFileLocation()
        .fileName("email.account")
        .storage("First Storage")
        .folderPath("file/location/folder/on/storage")
        .build())
    .build();
```


[[Back to Model list]](Models.md) [[Back to API README]](README.md)

