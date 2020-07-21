# com.aspose.email.cloud.sdk.api.MapiContactApi

<a name="mapiContactAsContactDto"></a>
## **mapiContactAsContactDto**
> [ContactDto](ContactDto.md) mapiContactAsContactDto(MapiContactAsContactDtoRequestData request)

Converts MAPI contact model to ContactDto model.             

### **MapiContactAsContactDtoRequestData** Parameters
```java
public MapiContactAsContactDtoRequestData(
    MapiContactDto mapiContactDto)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mapiContactDto** | [**MapiContactDto**](MapiContactDto.md)| MAPI contact model to convert. |

### Return type

[**ContactDto**](ContactDto.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="mapiContactAsFile"></a>
## **mapiContactAsFile**
> byte[] mapiContactAsFile(MapiContactAsFileRequestData request)

Converts MAPI contact model to specified format and returns as file.             

### **MapiContactAsFileRequestData** Parameters
```java
public MapiContactAsFileRequestData(
    MapiContactAsFileRequest request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**MapiContactAsFileRequest**](MapiContactAsFileRequest.md)| MAPI contact model to convert. |

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="mapiContactFromFile"></a>
## **mapiContactFromFile**
> [MapiContactDto](MapiContactDto.md) mapiContactFromFile(MapiContactFromFileRequestData request)

Converts contact file to a MAPI model representation.             

### **MapiContactFromFileRequestData** Parameters
```java
public MapiContactFromFileRequestData(
    String fileFormat, 
    byte[] file)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileFormat** | **String**| File format Enum, available values: VCard, WebDav, Msg |
 **file** | **byte[]**| File to convert |

### Return type

[**MapiContactDto**](MapiContactDto.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="mapiContactGet"></a>
## **mapiContactGet**
> [MapiContactDto](MapiContactDto.md) mapiContactGet(MapiContactGetRequestData request)

Get MAPI contact document.             

### **MapiContactGetRequestData** Parameters
```java
public MapiContactGetRequestData(
    String format, 
    String name, 
    String folder, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**| Contact document format. Enum, available values: VCard, WebDav, Msg |
 **name** | **String**| Contact document file name. |
 **folder** | **String**| Path to folder in storage. | [optional]
 **storage** | **String**| Storage name. | [optional]

### Return type

[**MapiContactDto**](MapiContactDto.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="mapiContactSave"></a>
## **mapiContactSave**
> void mapiContactSave(MapiContactSaveRequestData request)

Save MAPI Contact to storage.             

### **MapiContactSaveRequestData** Parameters
```java
public MapiContactSaveRequestData(
    MapiContactSaveRequest request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**MapiContactSaveRequest**](MapiContactSaveRequest.md)| Create/Update contact request. |

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

