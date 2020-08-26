# FolderApi

            
<a name="copyFolder"></a>
# **copyFolder**
> void copyFolder(CopyFolderRequest request)



### **CopyFolderRequest** Parameters
```java
public CopyFolderRequest(
    String srcPath, 
    String destPath, 
    String srcStorageName, 
    String destStorageName)
```

Name | Type | Description | Notes
---- | ---- | ----------- | -----
 **srcPath** | **String**|  |
 **destPath** | **String**|  |
 **srcStorageName** | **String**|  | [optional]
 **destStorageName** | **String**|  | [optional]

### Return type

void (empty response body)

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

            
<a name="createFolder"></a>
# **createFolder**
> void createFolder(CreateFolderRequest request)



### **CreateFolderRequest** Parameters
```java
public CreateFolderRequest(
    String path, 
    String storageName)
```

Name | Type | Description | Notes
---- | ---- | ----------- | -----
 **path** | **String**|  |
 **storageName** | **String**|  | [optional]

### Return type

void (empty response body)

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

            
<a name="deleteFolder"></a>
# **deleteFolder**
> void deleteFolder(DeleteFolderRequest request)



### **DeleteFolderRequest** Parameters
```java
public DeleteFolderRequest(
    String path, 
    String storageName, 
    Boolean recursive)
```

Name | Type | Description | Notes
---- | ---- | ----------- | -----
 **path** | **String**|  |
 **storageName** | **String**|  | [optional]
 **recursive** | **Boolean**|  | [optional] [default to false]

### Return type

void (empty response body)

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

            
<a name="getFilesList"></a>
# **getFilesList**
> [FilesList](FilesList.md) getFilesList(GetFilesListRequest request)



### **GetFilesListRequest** Parameters
```java
public GetFilesListRequest(
    String path, 
    String storageName)
```

Name | Type | Description | Notes
---- | ---- | ----------- | -----
 **path** | **String**|  |
 **storageName** | **String**|  | [optional]

### Return type

[**FilesList**](FilesList.md)

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

            
<a name="moveFolder"></a>
# **moveFolder**
> void moveFolder(MoveFolderRequest request)



### **MoveFolderRequest** Parameters
```java
public MoveFolderRequest(
    String srcPath, 
    String destPath, 
    String srcStorageName, 
    String destStorageName)
```

Name | Type | Description | Notes
---- | ---- | ----------- | -----
 **srcPath** | **String**|  |
 **destPath** | **String**|  |
 **srcStorageName** | **String**|  | [optional]
 **destStorageName** | **String**|  | [optional]

### Return type

void (empty response body)

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

