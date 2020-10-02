# ClientMessageSetIsReadRequest

Email client mark message is read/unread request.             

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**isRead** | **Boolean** | Message is read flag.              | 

## Parent class

See: [ClientMessageBaseRequest](ClientMessageBaseRequest.md)


## Example
```java
ClientMessageSetIsReadRequest clientMessageSetIsReadRequest = Models.clientMessageSetIsReadRequest()
    .isRead(true)
    .messageId("5")
    .accountLocation(Models.storageFileLocation()
        .fileName("email.account")
        .storage("First Storage")
        .folderPath("file/location/folder/on/storage")
        .build())
    .build();
```


[[Back to Model list]](Models.md) [[Back to API README]](README.md)
