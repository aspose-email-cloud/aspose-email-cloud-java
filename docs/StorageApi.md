# StorageApi

            
<a name="getDiscUsage"></a>
# **getDiscUsage**
> [DiscUsage](DiscUsage.md) getDiscUsage(GetDiscUsageRequest request)



### **GetDiscUsageRequest** Parameters
```java
public GetDiscUsageRequest(
    String storageName)
```

Name | Type | Description | Notes
---- | ---- | ----------- | -----
 **storageName** | **String**|  | [optional]

### Return type

[**DiscUsage**](DiscUsage.md)

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

            
<a name="getFileVersions"></a>
# **getFileVersions**
> [FileVersions](FileVersions.md) getFileVersions(GetFileVersionsRequest request)



### **GetFileVersionsRequest** Parameters
```java
public GetFileVersionsRequest(
    String path, 
    String storageName)
```

Name | Type | Description | Notes
---- | ---- | ----------- | -----
 **path** | **String**|  |
 **storageName** | **String**|  | [optional]

### Return type

[**FileVersions**](FileVersions.md)

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

            
<a name="objectExists"></a>
# **objectExists**
> [ObjectExist](ObjectExist.md) objectExists(ObjectExistsRequest request)



### **ObjectExistsRequest** Parameters
```java
public ObjectExistsRequest(
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

[**ObjectExist**](ObjectExist.md)

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

            
<a name="exists"></a>
# **exists**
> [StorageExist](StorageExist.md) exists(StorageExistsRequest request)



### **StorageExistsRequest** Parameters
```java
public StorageExistsRequest(
    String storageName)
```

Name | Type | Description | Notes
---- | ---- | ----------- | -----
 **storageName** | **String**|  |

### Return type

[**StorageExist**](StorageExist.md)

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

