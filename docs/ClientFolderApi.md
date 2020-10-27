# ClientFolderApi

            
<a name="create"></a>
# create
> void create([ClientFolderCreateRequest](ClientFolderCreateRequest.md) request)

Create new folder in email account             

### request Parameter

See parameter model documentation at [ClientFolderCreateRequest](ClientFolderCreateRequest.md)

### Return type

void (empty response body)

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)
            
<a name="delete"></a>
# delete
> void delete([ClientFolderDeleteRequest](ClientFolderDeleteRequest.md) request)

Delete a folder in email account             

### request Parameter

See parameter model documentation at [ClientFolderDeleteRequest](ClientFolderDeleteRequest.md)

### Return type

void (empty response body)

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)
            
<a name="getList"></a>
# **getList**
> [MailServerFolderList](MailServerFolderList.md) getList(ClientFolderGetListRequest request)

Get folders list in email account             

### **ClientFolderGetListRequest** Parameters
```java
public ClientFolderGetListRequest(
    String account, 
    String storage, 
    String accountStorageFolder, 
    String parentFolder)
```

Name | Type | Description | Notes
---- | ---- | ----------- | -----
 **account** | **String**| Email account |
 **storage** | **String**| Storage name where account file located | [optional]
 **accountStorageFolder** | **String**| Folder in storage where account file located | [optional]
 **parentFolder** | **String**| Folder in which subfolders should be listed | [optional]

### Return type

[**MailServerFolderList**](MailServerFolderList.md)

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

