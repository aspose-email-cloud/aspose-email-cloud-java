# FileApi

            ﻿
<a name="copyFile"></a>
# **copyFile**
> void copyFile(CopyFileRequest request)

Copy file

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
 **srcPath** | **String**| Source file path e.g. &#39;/folder/file.ext&#39; |
 **destPath** | **String**| Destination file path |
 **srcStorageName** | **String**| Source storage name | [optional]
 **destStorageName** | **String**| Destination storage name | [optional]
 **versionId** | **String**| File version ID to copy | [optional]

### Return type

void (empty response body)

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

            ﻿
<a name="deleteFile"></a>
# **deleteFile**
> void deleteFile(DeleteFileRequest request)

Delete file

### **DeleteFileRequest** Parameters
```java
public DeleteFileRequest(
    String path, 
    String storageName, 
    String versionId)
```

Name | Type | Description | Notes
---- | ---- | ----------- | -----
 **path** | **String**| File path e.g. &#39;/folder/file.ext&#39; |
 **storageName** | **String**| Storage name | [optional]
 **versionId** | **String**| File version ID to delete | [optional]

### Return type

void (empty response body)

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

            ﻿
<a name="downloadFile"></a>
# **downloadFile**
> byte[] downloadFile(DownloadFileRequest request)

Download file

### **DownloadFileRequest** Parameters
```java
public DownloadFileRequest(
    String path, 
    String storageName, 
    String versionId)
```

Name | Type | Description | Notes
---- | ---- | ----------- | -----
 **path** | **String**| File path e.g. &#39;/folder/file.ext&#39; |
 **storageName** | **String**| Storage name | [optional]
 **versionId** | **String**| File version ID to download | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

            ﻿
<a name="moveFile"></a>
# **moveFile**
> void moveFile(MoveFileRequest request)

Move file

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
 **srcPath** | **String**| Source file path e.g. &#39;/src.ext&#39; |
 **destPath** | **String**| Destination file path e.g. &#39;/dest.ext&#39; |
 **srcStorageName** | **String**| Source storage name | [optional]
 **destStorageName** | **String**| Destination storage name | [optional]
 **versionId** | **String**| File version ID to move | [optional]

### Return type

void (empty response body)

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

            ﻿
<a name="uploadFile"></a>
# **uploadFile**
> [FilesUploadResult](FilesUploadResult.md) uploadFile(UploadFileRequest request)

Upload file

### **UploadFileRequest** Parameters
```java
public UploadFileRequest(
    String path, 
    byte[] file, 
    String storageName)
```

Name | Type | Description | Notes
---- | ---- | ----------- | -----
 **path** | **String**| Path where to upload including filename and extension e.g. /file.ext or /Folder 1/file.ext             If the content is multipart and path does not contains the file name it tries to get them from filename parameter             from Content-Disposition header.              |
 **file** | **byte[]**| File to upload |
 **storageName** | **String**| Storage name | [optional]

### Return type

[**FilesUploadResult**](FilesUploadResult.md)

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

