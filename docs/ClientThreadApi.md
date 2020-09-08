# ClientThreadApi

            
<a name="delete"></a>
# delete
> void delete([ClientThreadDeleteRequest](ClientThreadDeleteRequest.md) request)

Delete thread by id. All messages from thread will also be deleted.             

### request Parameter

See parameter model documentation at [ClientThreadDeleteRequest](ClientThreadDeleteRequest.md)

### Return type

void (empty response body)

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)
            
<a name="getList"></a>
# **getList**
> [EmailThreadList](EmailThreadList.md) getList(ClientThreadGetListRequest request)

Get message threads from folder. All messages are partly fetched (without email body and some other fields).             

### **ClientThreadGetListRequest** Parameters
```java
public ClientThreadGetListRequest(
    String folder, 
    String account, 
    String storage, 
    String accountStorageFolder, 
    Boolean updateFolderCache, 
    Integer messagesCacheLimit)
```

Name | Type | Description | Notes
---- | ---- | ----------- | -----
 **folder** | **String**| A folder in email account.              |
 **account** | **String**| Email account |
 **storage** | **String**| Storage name where account file located | [optional]
 **accountStorageFolder** | **String**| Folder in storage where account file located | [optional]
 **updateFolderCache** | **Boolean**| This parameter is only used in accounts with CacheFile. If true - get new messages and update threads cache for given folder. If false, get only threads from cache without any calls to an email account              | [optional] [default to true]
 **messagesCacheLimit** | **Integer**| Limit messages cache size if CacheFile is used. Ignored in accounts without limits support              | [optional] [default to 200]

### Return type

[**EmailThreadList**](EmailThreadList.md)

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

            
<a name="getMessages"></a>
# **getMessages**
> [EmailList](EmailList.md) getMessages(ClientThreadGetMessagesRequest request)

Get messages from thread by id. All messages are fully fetched. For accounts with CacheFile only cached messages will be returned.             

### **ClientThreadGetMessagesRequest** Parameters
```java
public ClientThreadGetMessagesRequest(
    String threadId, 
    String account, 
    String folder, 
    String storage, 
    String accountStorageFolder)
```

Name | Type | Description | Notes
---- | ---- | ----------- | -----
 **threadId** | **String**| Thread identifier |
 **account** | **String**| Email account |
 **folder** | **String**| Specifies account folder to get thread from              | [optional]
 **storage** | **String**| Storage name where account file located | [optional]
 **accountStorageFolder** | **String**| Folder in storage where account file located | [optional]

### Return type

[**EmailList**](EmailList.md)

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

            
<a name="move"></a>
# move
> void move([ClientThreadMoveRequest](ClientThreadMoveRequest.md) request)

Move thread to another folder.             

### request Parameter

See parameter model documentation at [ClientThreadMoveRequest](ClientThreadMoveRequest.md)

### Return type

void (empty response body)

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)
            
<a name="setIsRead"></a>
# setIsRead
> void setIsRead([ClientThreadSetIsReadRequest](ClientThreadSetIsReadRequest.md) request)

Mark all messages in thread as read or unread.             

### request Parameter

See parameter model documentation at [ClientThreadSetIsReadRequest](ClientThreadSetIsReadRequest.md)

### Return type

void (empty response body)

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)
