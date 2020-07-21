# com.aspose.email.cloud.sdk.api.MapiCalendarApi

<a name="mapiCalendarAsCalendarDto"></a>
## **mapiCalendarAsCalendarDto**
> [CalendarDto](CalendarDto.md) mapiCalendarAsCalendarDto(MapiCalendarAsCalendarDtoRequestData request)

Converts MAPI calendar model to CalendarDto model.             

### **MapiCalendarAsCalendarDtoRequestData** Parameters
```java
public MapiCalendarAsCalendarDtoRequestData(
    MapiCalendarDto mapiCalendarDto)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mapiCalendarDto** | [**MapiCalendarDto**](MapiCalendarDto.md)| MAPI calendar model to convert. |

### Return type

[**CalendarDto**](CalendarDto.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="mapiCalendarAsFile"></a>
## **mapiCalendarAsFile**
> byte[] mapiCalendarAsFile(MapiCalendarAsFileRequestData request)

Converts MAPI calendar model to specified format and returns as file.             

### **MapiCalendarAsFileRequestData** Parameters
```java
public MapiCalendarAsFileRequestData(
    MapiCalendarAsFileRequest request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**MapiCalendarAsFileRequest**](MapiCalendarAsFileRequest.md)| MAPI calendar model to convert. |

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="mapiCalendarFromFile"></a>
## **mapiCalendarFromFile**
> [MapiCalendarDto](MapiCalendarDto.md) mapiCalendarFromFile(MapiCalendarFromFileRequestData request)

Converts calendar file to a MAPI model representation.             

### **MapiCalendarFromFileRequestData** Parameters
```java
public MapiCalendarFromFileRequestData(
    byte[] file)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **byte[]**| File to convert |

### Return type

[**MapiCalendarDto**](MapiCalendarDto.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="mapiCalendarGet"></a>
## **mapiCalendarGet**
> [MapiCalendarDto](MapiCalendarDto.md) mapiCalendarGet(MapiCalendarGetRequestData request)

Get MAPI calendar document.             

### **MapiCalendarGetRequestData** Parameters
```java
public MapiCalendarGetRequestData(
    String name, 
    String folder, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Calendar file name in storage. |
 **folder** | **String**| Path to folder in storage. | [optional]
 **storage** | **String**| Storage name. | [optional]

### Return type

[**MapiCalendarDto**](MapiCalendarDto.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="mapiCalendarSave"></a>
## **mapiCalendarSave**
> void mapiCalendarSave(MapiCalendarSaveRequestData request)

Save MAPI Calendar to storage.             

### **MapiCalendarSaveRequestData** Parameters
```java
public MapiCalendarSaveRequestData(
    MapiCalendarSaveRequest request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**MapiCalendarSaveRequest**](MapiCalendarSaveRequest.md)| Calendar create/update request. |

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

