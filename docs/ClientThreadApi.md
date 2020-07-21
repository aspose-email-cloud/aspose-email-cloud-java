# com.aspose.email.cloud.sdk.api.ClientThreadApi

<a name="clientThreadDelete"></a>
## **clientThreadDelete**
> void clientThreadDelete(ClientThreadDeleteRequestData request)

Delete thread by id. All messages from thread will also be deleted.             

### **ClientThreadDeleteRequestData** Parameters
```java
public ClientThreadDeleteRequestData(
    ClientThreadDeleteRequest request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**ClientThreadDeleteRequest**](ClientThreadDeleteRequest.md)| Delete email thread request. |

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="clientThreadGetList"></a>
## **clientThreadGetList**
> [EmailThreadList](EmailThreadList.md) clientThreadGetList(ClientThreadGetListRequestData request)

Get message threads from folder. All messages are partly fetched (without email body and some other fields).             

### **ClientThreadGetListRequestData** Parameters
```java
public ClientThreadGetListRequestData(
    String folder, 
    String account, 
    String storage, 
    String accountStorageFolder, 
    Boolean updateFolderCache, 
    Integer messagesCacheLimit)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **folder** | **String**| A folder in email account.              |
 **account** | **String**| Email account |
 **storage** | **String**| Storage name where account file located | [optional]
 **accountStorageFolder** | **String**| Folder in storage where account file located | [optional]
 **updateFolderCache** | **Boolean**| This parameter is only used in accounts with CacheFile. If true - get new messages and update threads cache for given folder. If false, get only threads from cache without any calls to an email account              | [optional] [default to true]
 **messagesCacheLimit** | **Integer**| Limit messages cache size if CacheFile is used. Ignored in accounts without limits support              | [optional] [default to 200]

### Return type

[**EmailThreadList**](EmailThreadList.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="clientThreadGetMessages"></a>
## **clientThreadGetMessages**
> [EmailList](EmailList.md) clientThreadGetMessages(ClientThreadGetMessagesRequestData request)

Get messages from thread by id. All messages are fully fetched. For accounts with CacheFile only cached messages will be returned.             

### **ClientThreadGetMessagesRequestData** Parameters
```java
public ClientThreadGetMessagesRequestData(
    String threadId, 
    String account, 
    String folder, 
    String storage, 
    String accountStorageFolder)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **String**| Thread identifier |
 **account** | **String**| Email account |
 **folder** | **String**| Specifies account folder to get thread from              | [optional]
 **storage** | **String**| Storage name where account file located | [optional]
 **accountStorageFolder** | **String**| Folder in storage where account file located | [optional]

### Return type

[**EmailList**](EmailList.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="clientThreadMove"></a>
## **clientThreadMove**
> void clientThreadMove(ClientThreadMoveRequestData request)

Move thread to another folder.             

### **ClientThreadMoveRequestData** Parameters
```java
public ClientThreadMoveRequestData(
    ClientThreadMoveRequest request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**ClientThreadMoveRequest**](ClientThreadMoveRequest.md)| Move thread request. |

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="clientThreadSetIsRead"></a>
## **clientThreadSetIsRead**
> void clientThreadSetIsRead(ClientThreadSetIsReadRequestData request)

Mark all messages in thread as read or unread.             

### **ClientThreadSetIsReadRequestData** Parameters
```java
public ClientThreadSetIsReadRequestData(
    ClientThreadSetIsReadRequest request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**ClientThreadSetIsReadRequest**](ClientThreadSetIsReadRequest.md)| Email account specifier and IsRead flag. |

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

