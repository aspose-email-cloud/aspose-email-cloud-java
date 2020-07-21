# com.aspose.email.cloud.sdk.api.ClientFolderApi

<a name="clientFolderCreate"></a>
## **clientFolderCreate**
> void clientFolderCreate(ClientFolderCreateRequestData request)

Create new folder in email account             

### **ClientFolderCreateRequestData** Parameters
```java
public ClientFolderCreateRequestData(
    ClientFolderCreateRequest request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**ClientFolderCreateRequest**](ClientFolderCreateRequest.md)| Create folder request |

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="clientFolderDelete"></a>
## **clientFolderDelete**
> void clientFolderDelete(ClientFolderDeleteRequestData request)

Delete a folder in email account             

### **ClientFolderDeleteRequestData** Parameters
```java
public ClientFolderDeleteRequestData(
    ClientFolderDeleteRequest request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**ClientFolderDeleteRequest**](ClientFolderDeleteRequest.md)| Delete folder request |

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="clientFolderGetList"></a>
## **clientFolderGetList**
> [MailServerFolderList](MailServerFolderList.md) clientFolderGetList(ClientFolderGetListRequestData request)

Get folders list in email account             

### **ClientFolderGetListRequestData** Parameters
```java
public ClientFolderGetListRequestData(
    String account, 
    String storage, 
    String accountStorageFolder, 
    String parentFolder)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account** | **String**| Email account |
 **storage** | **String**| Storage name where account file located | [optional]
 **accountStorageFolder** | **String**| Folder in storage where account file located | [optional]
 **parentFolder** | **String**| Folder in which subfolders should be listed | [optional]

### Return type

[**MailServerFolderList**](MailServerFolderList.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

