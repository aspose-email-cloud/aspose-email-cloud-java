# com.aspose.email.cloud.sdk.api.AiBcrApi

<a name="aiBcrParse"></a>
## **aiBcrParse**
> [ContactList](ContactList.md) aiBcrParse(AiBcrParseRequestData request)

Parse images to vCard document models             

### **AiBcrParseRequestData** Parameters
```java
public AiBcrParseRequestData(
    byte[] file, 
    String countries, 
    String languages, 
    Boolean isSingle)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **byte[]**| File to parse |
 **countries** | **String**| Comma-separated codes of countries. | [optional] [default to ]
 **languages** | **String**| Comma-separated ISO-639 codes of languages (either 639-1 or 639-3; i.e. \&quot;it\&quot; or \&quot;ita\&quot; for Italian); it&#39;s \&quot;\&quot; by default.              | [optional] [default to ]
 **isSingle** | **Boolean**| Determines that image contains single VCard or more. | [optional] [default to true]

### Return type

[**ContactList**](ContactList.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="aiBcrParseStorage"></a>
## **aiBcrParseStorage**
> [StorageFileLocationList](StorageFileLocationList.md) aiBcrParseStorage(AiBcrParseStorageRequestData request)

Parse images from storage to vCard files             

### **AiBcrParseStorageRequestData** Parameters
```java
public AiBcrParseStorageRequestData(
    AiBcrParseStorageRequest request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**AiBcrParseStorageRequest**](AiBcrParseStorageRequest.md)| Request with images located on storage |

### Return type

[**StorageFileLocationList**](StorageFileLocationList.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

