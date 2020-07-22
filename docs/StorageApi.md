# com.aspose.email.cloud.sdk.api.StorageApi

            ﻿
<a name="getDiscUsage"></a>
# **getDiscUsage**
> [DiscUsage](DiscUsage.md) getDiscUsage(GetDiscUsageRequest request)

Get disc usage

### **GetDiscUsageRequest** Parameters
```java
public GetDiscUsageRequest(
    String storageName)
```

Name | Type | Description | Notes
---- | ---- | ----------- | -----
 **storageName** | **String**| Storage name | [optional]

### Return type

[**DiscUsage**](DiscUsage.md)

[[Back to top]](#) [[Back to Model list]](Model.md) [[Back to API README]](README.md)

            ﻿
<a name="getFileVersions"></a>
# **getFileVersions**
> [FileVersions](FileVersions.md) getFileVersions(GetFileVersionsRequest request)

Get file versions

### **GetFileVersionsRequest** Parameters
```java
public GetFileVersionsRequest(
    String path, 
    String storageName)
```

Name | Type | Description | Notes
---- | ---- | ----------- | -----
 **path** | **String**| File path e.g. &#39;/file.ext&#39; |
 **storageName** | **String**| Storage name | [optional]

### Return type

[**FileVersions**](FileVersions.md)

[[Back to top]](#) [[Back to Model list]](Model.md) [[Back to API README]](README.md)

            ﻿
<a name="objectExists"></a>
# **objectExists**
> [ObjectExist](ObjectExist.md) objectExists(ObjectExistsRequest request)

Check if file or folder exists

### **ObjectExistsRequest** Parameters
```java
public ObjectExistsRequest(
    String path, 
    String storageName, 
    String versionId)
```

Name | Type | Description | Notes
---- | ---- | ----------- | -----
 **path** | **String**| File or folder path e.g. &#39;/file.ext&#39; or &#39;/folder&#39; |
 **storageName** | **String**| Storage name | [optional]
 **versionId** | **String**| File version ID | [optional]

### Return type

[**ObjectExist**](ObjectExist.md)

[[Back to top]](#) [[Back to Model list]](Model.md) [[Back to API README]](README.md)

            ﻿
<a name="exists"></a>
# **exists**
> [StorageExist](StorageExist.md) exists(StorageExistsRequest request)

Check if storage exists

### **StorageExistsRequest** Parameters
```java
public StorageExistsRequest(
    String storageName)
```

Name | Type | Description | Notes
---- | ---- | ----------- | -----
 **storageName** | **String**| Storage name |

### Return type

[**StorageExist**](StorageExist.md)

[[Back to top]](#) [[Back to Model list]](Model.md) [[Back to API README]](README.md)

