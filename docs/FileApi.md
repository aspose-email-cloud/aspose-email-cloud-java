# com.aspose.email.cloud.sdk.api.FileApi

<a name="copyFile"></a>
## **copyFile**
> void copyFile(CopyFileRequestData request)

Copy file

### **CopyFileRequestData** Parameters
```java
public CopyFileRequestData(
    String srcPath, 
    String destPath, 
    String srcStorageName, 
    String destStorageName, 
    String versionId)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **srcPath** | **String**| Source file path e.g. &#39;/folder/file.ext&#39; |
 **destPath** | **String**| Destination file path |
 **srcStorageName** | **String**| Source storage name | [optional]
 **destStorageName** | **String**| Destination storage name | [optional]
 **versionId** | **String**| File version ID to copy | [optional]

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="deleteFile"></a>
## **deleteFile**
> void deleteFile(DeleteFileRequestData request)

Delete file

### **DeleteFileRequestData** Parameters
```java
public DeleteFileRequestData(
    String path, 
    String storageName, 
    String versionId)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| File path e.g. &#39;/folder/file.ext&#39; |
 **storageName** | **String**| Storage name | [optional]
 **versionId** | **String**| File version ID to delete | [optional]

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="downloadFile"></a>
## **downloadFile**
> byte[] downloadFile(DownloadFileRequestData request)

Download file

### **DownloadFileRequestData** Parameters
```java
public DownloadFileRequestData(
    String path, 
    String storageName, 
    String versionId)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| File path e.g. &#39;/folder/file.ext&#39; |
 **storageName** | **String**| Storage name | [optional]
 **versionId** | **String**| File version ID to download | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="moveFile"></a>
## **moveFile**
> void moveFile(MoveFileRequestData request)

Move file

### **MoveFileRequestData** Parameters
```java
public MoveFileRequestData(
    String srcPath, 
    String destPath, 
    String srcStorageName, 
    String destStorageName, 
    String versionId)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **srcPath** | **String**| Source file path e.g. &#39;/src.ext&#39; |
 **destPath** | **String**| Destination file path e.g. &#39;/dest.ext&#39; |
 **srcStorageName** | **String**| Source storage name | [optional]
 **destStorageName** | **String**| Destination storage name | [optional]
 **versionId** | **String**| File version ID to move | [optional]

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="uploadFile"></a>
## **uploadFile**
> [FilesUploadResult](FilesUploadResult.md) uploadFile(UploadFileRequestData request)

Upload file

### **UploadFileRequestData** Parameters
```java
public UploadFileRequestData(
    String path, 
    byte[] file, 
    String storageName)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| Path where to upload including filename and extension e.g. /file.ext or /Folder 1/file.ext             If the content is multipart and path does not contains the file name it tries to get them from filename parameter             from Content-Disposition header.              |
 **file** | **byte[]**| File to upload |
 **storageName** | **String**| Storage name | [optional]

### Return type

[**FilesUploadResult**](FilesUploadResult.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

