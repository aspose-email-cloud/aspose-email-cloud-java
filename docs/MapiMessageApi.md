# com.aspose.email.cloud.sdk.api.MapiMessageApi

<a name="mapiMessageAsEmailDto"></a>
## **mapiMessageAsEmailDto**
> [EmailDto](EmailDto.md) mapiMessageAsEmailDto(MapiMessageAsEmailDtoRequestData request)

Converts MAPI message model to EmailDto model             

### **MapiMessageAsEmailDtoRequestData** Parameters
```java
public MapiMessageAsEmailDtoRequestData(
    MapiMessageDto mapiMessage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mapiMessage** | [**MapiMessageDto**](MapiMessageDto.md)| MAPI message model to convert |

### Return type

[**EmailDto**](EmailDto.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="mapiMessageAsFile"></a>
## **mapiMessageAsFile**
> byte[] mapiMessageAsFile(MapiMessageAsFileRequestData request)

Converts MAPI message model to specified format and returns as file.             

### **MapiMessageAsFileRequestData** Parameters
```java
public MapiMessageAsFileRequestData(
    MapiMessageAsFileRequest request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**MapiMessageAsFileRequest**](MapiMessageAsFileRequest.md)| MAPI message model to convert. |

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="mapiMessageFromFile"></a>
## **mapiMessageFromFile**
> [MapiMessageDto](MapiMessageDto.md) mapiMessageFromFile(MapiMessageFromFileRequestData request)

Converts email file to a MAPI model representation             

### **MapiMessageFromFileRequestData** Parameters
```java
public MapiMessageFromFileRequestData(
    String fileFormat, 
    byte[] file)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileFormat** | **String**| File format Enum, available values: Eml, Msg, MsgUnicode, Mhtml, Html, Tnef |
 **file** | **byte[]**| File to convert |

### Return type

[**MapiMessageDto**](MapiMessageDto.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="mapiMessageGet"></a>
## **mapiMessageGet**
> [MapiMessageDto](MapiMessageDto.md) mapiMessageGet(MapiMessageGetRequestData request)

Get MAPI message document.             

### **MapiMessageGetRequestData** Parameters
```java
public MapiMessageGetRequestData(
    String format, 
    String name, 
    String folder, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**| Email document format. Enum, available values: Eml, Msg, MsgUnicode, Mhtml, Html, Tnef |
 **name** | **String**| Email document file name. |
 **folder** | **String**| Path to folder in storage. | [optional]
 **storage** | **String**| Storage name. | [optional]

### Return type

[**MapiMessageDto**](MapiMessageDto.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="mapiMessageSave"></a>
## **mapiMessageSave**
> void mapiMessageSave(MapiMessageSaveRequestData request)

Save MAPI message to storage.             

### **MapiMessageSaveRequestData** Parameters
```java
public MapiMessageSaveRequestData(
    MapiMessageSaveRequest request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**MapiMessageSaveRequest**](MapiMessageSaveRequest.md)| Message create/update request. |

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

