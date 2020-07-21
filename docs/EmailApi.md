# com.aspose.email.cloud.sdk.api.EmailApi

<a name="emailAsFile"></a>
## **emailAsFile**
> byte[] emailAsFile(EmailAsFileRequestData request)

Converts Email model to specified format and returns as file.             

### **EmailAsFileRequestData** Parameters
```java
public EmailAsFileRequestData(
    EmailAsFileRequest request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**EmailAsFileRequest**](EmailAsFileRequest.md)| Email model and format to convert. |

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="emailAsMapi"></a>
## **emailAsMapi**
> [MapiMessageDto](MapiMessageDto.md) emailAsMapi(EmailAsMapiRequestData request)

Converts EmailDto to MapiMessageDto.             

### **EmailAsMapiRequestData** Parameters
```java
public EmailAsMapiRequestData(
    EmailDto emailDto)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailDto** | [**EmailDto**](EmailDto.md)| Email model to convert |

### Return type

[**MapiMessageDto**](MapiMessageDto.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="emailConvert"></a>
## **emailConvert**
> byte[] emailConvert(EmailConvertRequestData request)

Converts email document to specified format and returns as file             

### **EmailConvertRequestData** Parameters
```java
public EmailConvertRequestData(
    String format, 
    byte[] file)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**| File format Enum, available values: Eml, Msg, MsgUnicode, Mhtml, Html, Tnef |
 **file** | **byte[]**| File to convert |

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="emailFromFile"></a>
## **emailFromFile**
> [EmailDto](EmailDto.md) emailFromFile(EmailFromFileRequestData request)

Converts email document to a model representation             

### **EmailFromFileRequestData** Parameters
```java
public EmailFromFileRequestData(
    byte[] file)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **byte[]**| File to convert |

### Return type

[**EmailDto**](EmailDto.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="emailGet"></a>
## **emailGet**
> [EmailDto](EmailDto.md) emailGet(EmailGetRequestData request)

Get email document from storage.             

### **EmailGetRequestData** Parameters
```java
public EmailGetRequestData(
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

[**EmailDto**](EmailDto.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="emailGetAsFile"></a>
## **emailGetAsFile**
> byte[] emailGetAsFile(EmailGetAsFileRequestData request)

Converts email document from storage to specified format and returns as file             

### **EmailGetAsFileRequestData** Parameters
```java
public EmailGetAsFileRequestData(
    String fileName, 
    String format, 
    String storage, 
    String folder)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileName** | **String**| Email document file name |
 **format** | **String**| File format Enum, available values: Eml, Msg, MsgUnicode, Mhtml, Html, Tnef |
 **storage** | **String**| Storage name | [optional]
 **folder** | **String**| Path to folder in storage | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="emailGetList"></a>
## **emailGetList**
> [EmailStorageList](EmailStorageList.md) emailGetList(EmailGetListRequestData request)

Get email list from storage folder.             

### **EmailGetListRequestData** Parameters
```java
public EmailGetListRequestData(
    String format, 
    String folder, 
    String storage, 
    Integer itemsPerPage, 
    Integer pageNumber)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**| Email document format. Enum, available values: Eml, Msg, MsgUnicode, Mhtml, Html, Tnef |
 **folder** | **String**| Path to folder in storage. | [optional]
 **storage** | **String**| Storage name. | [optional]
 **itemsPerPage** | **Integer**| Count of items on page. | [optional] [default to 10]
 **pageNumber** | **Integer**| Page number. | [optional] [default to 0]

### Return type

[**EmailStorageList**](EmailStorageList.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="emailSave"></a>
## **emailSave**
> void emailSave(EmailSaveRequestData request)

Save email document to storage.             

### **EmailSaveRequestData** Parameters
```java
public EmailSaveRequestData(
    EmailSaveRequest request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**EmailSaveRequest**](EmailSaveRequest.md)| Email document create/update request. |

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

