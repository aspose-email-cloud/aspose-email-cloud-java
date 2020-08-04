# AiBcrApi

            
<a name="parse"></a>
# **parse**
> [ContactList](ContactList.md) parse(AiBcrParseRequest request)

Parse images to vCard document models             

### **AiBcrParseRequest** Parameters
```java
public AiBcrParseRequest(
    byte[] file, 
    String countries, 
    String languages, 
    Boolean isSingle)
```

Name | Type | Description | Notes
---- | ---- | ----------- | -----
 **file** | **byte[]**| File to parse |
 **countries** | **String**| Comma-separated codes of countries. | [optional] [default to ]
 **languages** | **String**| Comma-separated ISO-639 codes of languages (either 639-1 or 639-3; i.e. \&quot;it\&quot; or \&quot;ita\&quot; for Italian); it&#39;s \&quot;\&quot; by default.              | [optional] [default to ]
 **isSingle** | **Boolean**| Determines that image contains single VCard or more. | [optional] [default to true]

### Return type

[**ContactList**](ContactList.md)

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

            
<a name="parseStorage"></a>
# parseStorage
> [StorageFileLocationList](StorageFileLocationList.md) parseStorage([AiBcrParseStorageRequest](AiBcrParseStorageRequest.md) request)

Parse images from storage to vCard files             

### request Parameter

See parameter model documentation at [AiBcrParseStorageRequest](AiBcrParseStorageRequest.md)

### Return type

[**StorageFileLocationList**](StorageFileLocationList.md)

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)
