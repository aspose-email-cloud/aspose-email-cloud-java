# FileApi

            
<a name="copyFile"></a>
# **copyFile**
> void copyFile(CopyFileRequest request)



### **CopyFileRequest** Parameters
```java
public CopyFileRequest(
    String srcPath, 
    String destPath, 
    String srcStorageName, 
    String destStorageName, 
    String versionId)
```

Name | Type | Description | Notes
---- | ---- | ----------- | -----
 **srcPath** | **String**|  |
 **destPath** | **String**|  |
 **srcStorageName** | **String**|  | [optional]
 **destStorageName** | **String**|  | [optional]
 **versionId** | **String**|  | [optional]

### Return type

void (empty response body)

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

            
<a name="deleteFile"></a>
# **deleteFile**
> void deleteFile(DeleteFileRequest request)



### **DeleteFileRequest** Parameters
```java
public DeleteFileRequest(
    String path, 
    String storageName, 
    String versionId)
```

Name | Type | Description | Notes
---- | ---- | ----------- | -----
 **path** | **String**|  |
 **storageName** | **String**|  | [optional]
 **versionId** | **String**|  | [optional]

### Return type

void (empty response body)

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

            
<a name="downloadFile"></a>
# **downloadFile**
> byte[] downloadFile(DownloadFileRequest request)



### **DownloadFileRequest** Parameters
```java
public DownloadFileRequest(
    String path, 
    String storageName, 
    String versionId)
```

Name | Type | Description | Notes
---- | ---- | ----------- | -----
 **path** | **String**|  |
 **storageName** | **String**|  | [optional]
 **versionId** | **String**|  | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

            
<a name="moveFile"></a>
# **moveFile**
> void moveFile(MoveFileRequest request)



### **MoveFileRequest** Parameters
```java
public MoveFileRequest(
    String srcPath, 
    String destPath, 
    String srcStorageName, 
    String destStorageName, 
    String versionId)
```

Name | Type | Description | Notes
---- | ---- | ----------- | -----
 **srcPath** | **String**|  |
 **destPath** | **String**|  |
 **srcStorageName** | **String**|  | [optional]
 **destStorageName** | **String**|  | [optional]
 **versionId** | **String**|  | [optional]

### Return type

void (empty response body)

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

            
<a name="uploadFile"></a>
# **uploadFile**
> [FilesUploadResult](FilesUploadResult.md) uploadFile(UploadFileRequest request)



### **UploadFileRequest** Parameters
```java
public UploadFileRequest(
    String path, 
    byte[] file, 
    String storageName)
```

Name | Type | Description | Notes
---- | ---- | ----------- | -----
 **path** | **String**|  |
 **file** | **byte[]**| File to upload |
 **storageName** | **String**|  | [optional]

### Return type

[**FilesUploadResult**](FilesUploadResult.md)

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

