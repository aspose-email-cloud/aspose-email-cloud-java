# FolderApi

            
<a name="copyFolder"></a>
# **copyFolder**
> void copyFolder(CopyFolderRequest request)

Copy folder

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
 **srcPath** | **String**| Source folder path e.g. &#39;/src&#39; |
 **destPath** | **String**| Destination folder path e.g. &#39;/dst&#39; |
 **srcStorageName** | **String**| Source storage name | [optional]
 **destStorageName** | **String**| Destination storage name | [optional]

### Return type

void (empty response body)

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

            
<a name="createFolder"></a>
# **createFolder**
> void createFolder(CreateFolderRequest request)

Create the folder

### **CreateFolderRequest** Parameters
```java
public CreateFolderRequest(
    String path, 
    String storageName)
```

Name | Type | Description | Notes
---- | ---- | ----------- | -----
 **path** | **String**| Folder path to create e.g. &#39;folder_1/folder_2/&#39; |
 **storageName** | **String**| Storage name | [optional]

### Return type

void (empty response body)

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

            
<a name="deleteFolder"></a>
# **deleteFolder**
> void deleteFolder(DeleteFolderRequest request)

Delete folder

### **DeleteFolderRequest** Parameters
```java
public DeleteFolderRequest(
    String path, 
    String storageName, 
    Boolean recursive)
```

Name | Type | Description | Notes
---- | ---- | ----------- | -----
 **path** | **String**| Folder path e.g. &#39;/folder&#39; |
 **storageName** | **String**| Storage name | [optional]
 **recursive** | **Boolean**| Enable to delete folders, subfolders and files | [optional] [default to false]

### Return type

void (empty response body)

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

            
<a name="getFilesList"></a>
# **getFilesList**
> [FilesList](FilesList.md) getFilesList(GetFilesListRequest request)

Get all files and folders within a folder

### **GetFilesListRequest** Parameters
```java
public GetFilesListRequest(
    String path, 
    String storageName)
```

Name | Type | Description | Notes
---- | ---- | ----------- | -----
 **path** | **String**| Folder path e.g. &#39;/folder&#39; |
 **storageName** | **String**| Storage name | [optional]

### Return type

[**FilesList**](FilesList.md)

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

            
<a name="moveFolder"></a>
# **moveFolder**
> void moveFolder(MoveFolderRequest request)

Move folder

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
 **srcPath** | **String**| Folder path to move e.g. &#39;/folder&#39; |
 **destPath** | **String**| Destination folder path to move to e.g &#39;/dst&#39; |
 **srcStorageName** | **String**| Source storage name | [optional]
 **destStorageName** | **String**| Destination storage name | [optional]

### Return type

void (empty response body)

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

