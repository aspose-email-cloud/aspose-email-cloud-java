# ClientThreadApi (EmailCloud.client().thread())

Email client thread operations.

<a name="delete"></a>
## delete

Description: Delete thread by id. All messages from thread will also be deleted.             


Method call example:
```java
api.client().thread().delete(request);
```

### Parameter: request

Description: Delete email thread request.

See parameter model documentation at [ClientThreadDeleteRequest](ClientThreadDeleteRequest.md)

<details>
    <summary>Parameter initialization example:</summary>
    
```java
ClientThreadDeleteRequest request = Models.clientThreadDeleteRequest()
    .folder("INBOX/SubFolder")
    .threadId("5")
    .accountLocation(Models.storageFileLocation()
        .fileName("email.account")
        .storage("First Storage")
        .folderPath("file/location/folder/on/storage")
        .build())
    .build();
```

</details>


### Result

Return type: void (empty response body)

### Complete example

<details>
    <summary>Method call example:</summary>

```java
EmailCloud api = new EmailCloud(appKey, appSid);

// Prepare parameters:
ClientThreadDeleteRequest request = Models.clientThreadDeleteRequest()
    .folder("INBOX/SubFolder")
    .threadId("5")
    .accountLocation(Models.storageFileLocation()
        .fileName("email.account")
        .storage("First Storage")
        .folderPath("file/location/folder/on/storage")
        .build())
    .build();

// Call method:
api.client().thread().delete(request);
```

</details>

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)
<a name="getList"></a>
## getList

Description: Get message threads from folder. All messages are partly fetched (without email body and some other fields).             

Returns: List of threads

Method call example:
```java
EmailThreadList result = api.client().thread().getList(request);
```


### Parameter: request

Description: getList method request.

See parameter model documentation at [ClientThreadGetListRequest](ClientThreadGetListRequest.md).

<details>
    <summary>Parameter initialization example:</summary>

```java
ClientThreadGetListRequest request = Models.clientThreadGetListRequest()
    .folder("INBOX/SubFolder")
    .account("email.account")
    .storage("First Storage")
    .accountStorageFolder("email/account/location/on/storage")
    .build();
```

</details>

### Result

Description: List of threads

Return type: [**EmailThreadList**](EmailThreadList.md)

<details>
    <summary>Result example</summary>

```java
result = Models.emailThreadList()
    .value(Arrays.<EmailThread>asList(
        Models.emailThread()
            .id("123")
            .subject("Some email subject")
            .messages(Arrays.<EmailDto>asList(
                Models.emailDto()
                    .date(Calendar.getInstance().getTime())
                    .from(Models.mailAddress()
                        .address("from@aspose.com")
                        .build())
                    .messageId("1")
                    .subject("Some email subject")
                    .to(Arrays.<MailAddress>asList(
                        Models.mailAddress()
                            .address("to@aspose.com")
                            .build()))
                    .build(),
                Models.emailDto()
                    .date(Calendar.getInstance().getTime())
                    .from(Models.mailAddress()
                        .address("from@aspose.com")
                        .build())
                    .messageId("3")
                    .subject("Re: Some email subject")
                    .to(Arrays.<MailAddress>asList(
                        Models.mailAddress()
                            .address("to@aspose.com")
                            .build()))
                    .build()))
            .build()))
    .build();
```
</details>

### Complete example

<details>
    <summary>Method call example:</summary>

```java
EmailCloud api = new EmailCloud(appKey, appSid);

// Prepare parameters:
ClientThreadGetListRequest request = Models.clientThreadGetListRequest()
    .folder("INBOX/SubFolder")
    .account("email.account")
    .storage("First Storage")
    .accountStorageFolder("email/account/location/on/storage")
    .build();

// Call method:
EmailThreadList result = api.client().thread().getList(request);

// Result example:
result = Models.emailThreadList()
    .value(Arrays.<EmailThread>asList(
        Models.emailThread()
            .id("123")
            .subject("Some email subject")
            .messages(Arrays.<EmailDto>asList(
                Models.emailDto()
                    .date(Calendar.getInstance().getTime())
                    .from(Models.mailAddress()
                        .address("from@aspose.com")
                        .build())
                    .messageId("1")
                    .subject("Some email subject")
                    .to(Arrays.<MailAddress>asList(
                        Models.mailAddress()
                            .address("to@aspose.com")
                            .build()))
                    .build(),
                Models.emailDto()
                    .date(Calendar.getInstance().getTime())
                    .from(Models.mailAddress()
                        .address("from@aspose.com")
                        .build())
                    .messageId("3")
                    .subject("Re: Some email subject")
                    .to(Arrays.<MailAddress>asList(
                        Models.mailAddress()
                            .address("to@aspose.com")
                            .build()))
                    .build()))
            .build()))
    .build();

```

</details>

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

<a name="getMessages"></a>
## getMessages

Description: Get messages from thread by id. All messages are fully fetched. For accounts with CacheFile only cached messages will be returned.             

Returns: Requested thread with fully fetched messages

Method call example:
```java
EmailList result = api.client().thread().getMessages(request);
```


### Parameter: request

Description: getMessages method request.

See parameter model documentation at [ClientThreadGetMessagesRequest](ClientThreadGetMessagesRequest.md).

<details>
    <summary>Parameter initialization example:</summary>

```java
ClientThreadGetMessagesRequest request = Models.clientThreadGetMessagesRequest()
    .threadId("5")
    .account("email.account")
    .folder("INBOX")
    .storage("First Storage")
    .accountStorageFolder("email/account/location/on/storage")
    .build();
```

</details>

### Result

Description: Requested thread with fully fetched messages

Return type: [**EmailList**](EmailList.md)

<details>
    <summary>Result example</summary>

```java
result = ;
```
</details>

### Complete example

<details>
    <summary>Method call example:</summary>

```java
EmailCloud api = new EmailCloud(appKey, appSid);

// Prepare parameters:
ClientThreadGetMessagesRequest request = Models.clientThreadGetMessagesRequest()
    .threadId("5")
    .account("email.account")
    .folder("INBOX")
    .storage("First Storage")
    .accountStorageFolder("email/account/location/on/storage")
    .build();

// Call method:
EmailList result = api.client().thread().getMessages(request);

// Result example:
result = ;

```

</details>

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

<a name="move"></a>
## move

Description: Move thread to another folder.             


Method call example:
```java
api.client().thread().move(request);
```

### Parameter: request

Description: Move thread request.

See parameter model documentation at [ClientThreadMoveRequest](ClientThreadMoveRequest.md)

<details>
    <summary>Parameter initialization example:</summary>
    
```java
ClientThreadMoveRequest request = Models.clientThreadMoveRequest()
    .destinationFolder("INBOX/SubFolder")
    .threadId("5")
    .accountLocation(Models.storageFileLocation()
        .fileName("email.account")
        .storage("First Storage")
        .folderPath("file/location/folder/on/storage")
        .build())
    .build();
```

</details>


### Result

Return type: void (empty response body)

### Complete example

<details>
    <summary>Method call example:</summary>

```java
EmailCloud api = new EmailCloud(appKey, appSid);

// Prepare parameters:
ClientThreadMoveRequest request = Models.clientThreadMoveRequest()
    .destinationFolder("INBOX/SubFolder")
    .threadId("5")
    .accountLocation(Models.storageFileLocation()
        .fileName("email.account")
        .storage("First Storage")
        .folderPath("file/location/folder/on/storage")
        .build())
    .build();

// Call method:
api.client().thread().move(request);
```

</details>

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)
<a name="setIsRead"></a>
## setIsRead

Description: Mark all messages in thread as read or unread.             


Method call example:
```java
api.client().thread().setIsRead(request);
```

### Parameter: request

Description: Email account specifier and IsRead flag.

See parameter model documentation at [ClientThreadSetIsReadRequest](ClientThreadSetIsReadRequest.md)

<details>
    <summary>Parameter initialization example:</summary>
    
```java
ClientThreadSetIsReadRequest request = Models.clientThreadSetIsReadRequest()
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

</details>


### Result

Return type: void (empty response body)

### Complete example

<details>
    <summary>Method call example:</summary>

```java
EmailCloud api = new EmailCloud(appKey, appSid);

// Prepare parameters:
ClientThreadSetIsReadRequest request = Models.clientThreadSetIsReadRequest()
    .isRead(true)
    .folder("INBOX")
    .threadId("5")
    .accountLocation(Models.storageFileLocation()
        .fileName("email.account")
        .storage("First Storage")
        .folderPath("file/location/folder/on/storage")
        .build())
    .build();

// Call method:
api.client().thread().setIsRead(request);
```

</details>

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)
