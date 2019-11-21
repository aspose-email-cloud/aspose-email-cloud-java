# com.aspose.email.cloud.sdk.api.StorageApi

<a name="getDiscUsage"></a>
## **getDiscUsage**
> [DiscUsage](DiscUsage.md) getDiscUsage(GetDiscUsageRequestData request)

Get disc usage

### **GetDiscUsageRequestData** Parameters
```java
public GetDiscUsageRequestData(
    String storageName)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storageName** | **String**| Storage name | [optional]

### Return type

[**DiscUsage**](DiscUsage.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="getFileVersions"></a>
## **getFileVersions**
> [FileVersions](FileVersions.md) getFileVersions(GetFileVersionsRequestData request)

Get file versions

### **GetFileVersionsRequestData** Parameters
```java
public GetFileVersionsRequestData(
    String path, 
    String storageName)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| File path e.g. &#39;/file.ext&#39; |
 **storageName** | **String**| Storage name | [optional]

### Return type

[**FileVersions**](FileVersions.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="objectExists"></a>
## **objectExists**
> [ObjectExist](ObjectExist.md) objectExists(ObjectExistsRequestData request)

Check if file or folder exists

### **ObjectExistsRequestData** Parameters
```java
public ObjectExistsRequestData(
    String path, 
    String storageName, 
    String versionId)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| File or folder path e.g. &#39;/file.ext&#39; or &#39;/folder&#39; |
 **storageName** | **String**| Storage name | [optional]
 **versionId** | **String**| File version ID | [optional]

### Return type

[**ObjectExist**](ObjectExist.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="storageExists"></a>
## **storageExists**
> [StorageExist](StorageExist.md) storageExists(StorageExistsRequestData request)

Check if storage exists

### **StorageExistsRequestData** Parameters
```java
public StorageExistsRequestData(
    String storageName)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storageName** | **String**| Storage name |

### Return type

[**StorageExist**](StorageExist.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

