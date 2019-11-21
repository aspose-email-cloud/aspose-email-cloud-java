# com.aspose.email.cloud.sdk.api.FolderApi

<a name="copyFolder"></a>
## **copyFolder**
> void copyFolder(CopyFolderRequestData request)

Copy folder

### **CopyFolderRequestData** Parameters
```java
public CopyFolderRequestData(
    String srcPath, 
    String destPath, 
    String srcStorageName, 
    String destStorageName)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **srcPath** | **String**| Source folder path e.g. &#39;/src&#39; |
 **destPath** | **String**| Destination folder path e.g. &#39;/dst&#39; |
 **srcStorageName** | **String**| Source storage name | [optional]
 **destStorageName** | **String**| Destination storage name | [optional]

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="createFolder"></a>
## **createFolder**
> void createFolder(CreateFolderRequestData request)

Create the folder

### **CreateFolderRequestData** Parameters
```java
public CreateFolderRequestData(
    String path, 
    String storageName)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| Folder path to create e.g. &#39;folder_1/folder_2/&#39; |
 **storageName** | **String**| Storage name | [optional]

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="deleteFolder"></a>
## **deleteFolder**
> void deleteFolder(DeleteFolderRequestData request)

Delete folder

### **DeleteFolderRequestData** Parameters
```java
public DeleteFolderRequestData(
    String path, 
    String storageName, 
    Boolean recursive)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| Folder path e.g. &#39;/folder&#39; |
 **storageName** | **String**| Storage name | [optional]
 **recursive** | **Boolean**| Enable to delete folders, subfolders and files | [optional] [default to false]

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="getFilesList"></a>
## **getFilesList**
> [FilesList](FilesList.md) getFilesList(GetFilesListRequestData request)

Get all files and folders within a folder

### **GetFilesListRequestData** Parameters
```java
public GetFilesListRequestData(
    String path, 
    String storageName)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| Folder path e.g. &#39;/folder&#39; |
 **storageName** | **String**| Storage name | [optional]

### Return type

[**FilesList**](FilesList.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="moveFolder"></a>
## **moveFolder**
> void moveFolder(MoveFolderRequestData request)

Move folder

### **MoveFolderRequestData** Parameters
```java
public MoveFolderRequestData(
    String srcPath, 
    String destPath, 
    String srcStorageName, 
    String destStorageName)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **srcPath** | **String**| Folder path to move e.g. &#39;/folder&#39; |
 **destPath** | **String**| Destination folder path to move to e.g &#39;/dst&#39; |
 **srcStorageName** | **String**| Source storage name | [optional]
 **destStorageName** | **String**| Destination storage name | [optional]

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

