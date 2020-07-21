# com.aspose.email.cloud.sdk.api.ContactApi

<a name="contactAsFile"></a>
## **contactAsFile**
> byte[] contactAsFile(ContactAsFileRequestData request)

Converts contact model to specified format and returns as file             

### **ContactAsFileRequestData** Parameters
```java
public ContactAsFileRequestData(
    ContactAsFileRequest request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**ContactAsFileRequest**](ContactAsFileRequest.md)| Contact model and format to convert |

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="contactAsMapi"></a>
## **contactAsMapi**
> [MapiContactDto](MapiContactDto.md) contactAsMapi(ContactAsMapiRequestData request)

Converts ContactDto to MapiContactDto.             

### **ContactAsMapiRequestData** Parameters
```java
public ContactAsMapiRequestData(
    ContactDto contactDto)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contactDto** | [**ContactDto**](ContactDto.md)| Contact model to convert |

### Return type

[**MapiContactDto**](MapiContactDto.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="contactConvert"></a>
## **contactConvert**
> byte[] contactConvert(ContactConvertRequestData request)

Converts contact document to specified format and returns as file             

### **ContactConvertRequestData** Parameters
```java
public ContactConvertRequestData(
    String toFormat, 
    String fromFormat, 
    byte[] file)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **toFormat** | **String**| File format to convert to Enum, available values: VCard, WebDav, Msg |
 **fromFormat** | **String**| File format to convert from Enum, available values: VCard, WebDav, Msg |
 **file** | **byte[]**| File to convert |

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="contactFromFile"></a>
## **contactFromFile**
> [ContactDto](ContactDto.md) contactFromFile(ContactFromFileRequestData request)

Converts contact document to a model representation             

### **ContactFromFileRequestData** Parameters
```java
public ContactFromFileRequestData(
    String format, 
    byte[] file)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**| File format Enum, available values: VCard, WebDav, Msg |
 **file** | **byte[]**| File to convert |

### Return type

[**ContactDto**](ContactDto.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="contactGet"></a>
## **contactGet**
> [ContactDto](ContactDto.md) contactGet(ContactGetRequestData request)

Get contact document from storage.             

### **ContactGetRequestData** Parameters
```java
public ContactGetRequestData(
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

[**ContactDto**](ContactDto.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="contactGetAsFile"></a>
## **contactGetAsFile**
> byte[] contactGetAsFile(ContactGetAsFileRequestData request)

Converts contact document from storage to specified format and returns as file             

### **ContactGetAsFileRequestData** Parameters
```java
public ContactGetAsFileRequestData(
    String fileName, 
    String toFormat, 
    String fromFormat, 
    String storage, 
    String folder)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileName** | **String**| Calendar document file name |
 **toFormat** | **String**| File format Enum, available values: VCard, WebDav, Msg |
 **fromFormat** | **String**| File format to convert from Enum, available values: VCard, WebDav, Msg |
 **storage** | **String**| Storage name | [optional]
 **folder** | **String**| Path to folder in storage | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="contactGetList"></a>
## **contactGetList**
> [ContactStorageList](ContactStorageList.md) contactGetList(ContactGetListRequestData request)

Get contact list from storage folder.             

### **ContactGetListRequestData** Parameters
```java
public ContactGetListRequestData(
    String format, 
    String folder, 
    String storage, 
    Integer itemsPerPage, 
    Integer pageNumber)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**| Contact document format. Enum, available values: VCard, WebDav, Msg |
 **folder** | **String**| Path to folder in storage. | [optional]
 **storage** | **String**| Storage name. | [optional]
 **itemsPerPage** | **Integer**| Count of items on page. | [optional] [default to 10]
 **pageNumber** | **Integer**| Page number. | [optional] [default to 0]

### Return type

[**ContactStorageList**](ContactStorageList.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="contactSave"></a>
## **contactSave**
> void contactSave(ContactSaveRequestData request)

Save contact to storage.             

### **ContactSaveRequestData** Parameters
```java
public ContactSaveRequestData(
    ContactSaveRequest request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**ContactSaveRequest**](ContactSaveRequest.md)| Create/Update contact request. |

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

