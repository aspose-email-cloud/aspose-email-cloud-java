# com.aspose.email.cloud.sdk.api.CalendarApi

<a name="calendarAsAlternate"></a>
## **calendarAsAlternate**
> [AlternateView](AlternateView.md) calendarAsAlternate(CalendarAsAlternateRequestData request)

Convert iCalendar to AlternateView             

### **CalendarAsAlternateRequestData** Parameters
```java
public CalendarAsAlternateRequestData(
    CalendarAsAlternateRequest request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CalendarAsAlternateRequest**](CalendarAsAlternateRequest.md)| iCalendar to AlternateView request |

### Return type

[**AlternateView**](AlternateView.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="calendarAsFile"></a>
## **calendarAsFile**
> byte[] calendarAsFile(CalendarAsFileRequestData request)

Converts calendar model to specified format and returns as file.             

### **CalendarAsFileRequestData** Parameters
```java
public CalendarAsFileRequestData(
    CalendarAsFileRequest request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CalendarAsFileRequest**](CalendarAsFileRequest.md)| Calendar model and format to convert. |

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="calendarAsMapi"></a>
## **calendarAsMapi**
> [MapiCalendarDto](MapiCalendarDto.md) calendarAsMapi(CalendarAsMapiRequestData request)

Converts CalendarDto to MapiCalendarDto.             

### **CalendarAsMapiRequestData** Parameters
```java
public CalendarAsMapiRequestData(
    CalendarDto calendarDto)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **calendarDto** | [**CalendarDto**](CalendarDto.md)| iCalendar model calendar representation. |

### Return type

[**MapiCalendarDto**](MapiCalendarDto.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="calendarConvert"></a>
## **calendarConvert**
> byte[] calendarConvert(CalendarConvertRequestData request)

Converts calendar document to specified format and returns as file.             

### **CalendarConvertRequestData** Parameters
```java
public CalendarConvertRequestData(
    String format, 
    byte[] file)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**| File format. Enum, available values: Ics, Msg |
 **file** | **byte[]**| File to convert |

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="calendarFromFile"></a>
## **calendarFromFile**
> [CalendarDto](CalendarDto.md) calendarFromFile(CalendarFromFileRequestData request)

Converts calendar document to a model representation.             

### **CalendarFromFileRequestData** Parameters
```java
public CalendarFromFileRequestData(
    byte[] file)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **byte[]**| File to convert |

### Return type

[**CalendarDto**](CalendarDto.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="calendarGet"></a>
## **calendarGet**
> [CalendarDto](CalendarDto.md) calendarGet(CalendarGetRequestData request)

Get calendar file from storage.             

### **CalendarGetRequestData** Parameters
```java
public CalendarGetRequestData(
    String name, 
    String folder, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| iCalendar file name in storage. |
 **folder** | **String**| Path to folder in storage. | [optional]
 **storage** | **String**| Storage name. | [optional]

### Return type

[**CalendarDto**](CalendarDto.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="calendarGetAsAlternate"></a>
## **calendarGetAsAlternate**
> [AlternateView](AlternateView.md) calendarGetAsAlternate(CalendarGetAsAlternateRequestData request)

Get iCalendar from storage as AlternateView             

### **CalendarGetAsAlternateRequestData** Parameters
```java
public CalendarGetAsAlternateRequestData(
    String name, 
    String calendarAction, 
    String sequenceId, 
    String folder, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| iCalendar file name in storage |
 **calendarAction** | **String**| iCalendar method type Enum, available values: Create, Update, Cancel |
 **sequenceId** | **String**| The sequence id | [optional]
 **folder** | **String**| Path to folder in storage | [optional]
 **storage** | **String**| Storage name | [optional]

### Return type

[**AlternateView**](AlternateView.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="calendarGetAsFile"></a>
## **calendarGetAsFile**
> byte[] calendarGetAsFile(CalendarGetAsFileRequestData request)

Converts calendar document from storage to specified format and returns as file.             

### **CalendarGetAsFileRequestData** Parameters
```java
public CalendarGetAsFileRequestData(
    String fileName, 
    String format, 
    String storage, 
    String folder)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileName** | **String**| Calendar document file name. |
 **format** | **String**| File format. Enum, available values: Ics, Msg |
 **storage** | **String**| Storage name. | [optional]
 **folder** | **String**| Path to folder in storage. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="calendarGetList"></a>
## **calendarGetList**
> [CalendarStorageList](CalendarStorageList.md) calendarGetList(CalendarGetListRequestData request)

Get iCalendar list from storage folder.             

### **CalendarGetListRequestData** Parameters
```java
public CalendarGetListRequestData(
    String folder, 
    Integer itemsPerPage, 
    Integer pageNumber, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **folder** | **String**| Path to folder in storage. |
 **itemsPerPage** | **Integer**| Count of items on page. | [optional] [default to 10]
 **pageNumber** | **Integer**| Page number. | [optional] [default to 0]
 **storage** | **String**| Storage name. | [optional]

### Return type

[**CalendarStorageList**](CalendarStorageList.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="calendarSave"></a>
## **calendarSave**
> void calendarSave(CalendarSaveRequestData request)

Save iCalendar             

### **CalendarSaveRequestData** Parameters
```java
public CalendarSaveRequestData(
    CalendarSaveRequest request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CalendarSaveRequest**](CalendarSaveRequest.md)| iCalendar create/update request |

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

