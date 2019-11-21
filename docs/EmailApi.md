# com.aspose.email.cloud.sdk.api.EmailApi

<a name="addEmailAttachment"></a>
## **addEmailAttachment**
> [EmailDocumentResponse](EmailDocumentResponse.md) addEmailAttachment(AddEmailAttachmentRequestData request)

Adds an attachment to Email document

### **AddEmailAttachmentRequestData** Parameters
```java
public AddEmailAttachmentRequestData(
    String attachmentName, 
    String fileName, 
    AddAttachmentRequest request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attachmentName** | **String**| Attachment file name |
 **fileName** | **String**| Email document file name |
 **request** | [**AddAttachmentRequest**](AddAttachmentRequest.md)| Storage info to specify location of email document and attachment files |

### Return type

[**EmailDocumentResponse**](EmailDocumentResponse.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="createEmail"></a>
## **createEmail**
> [EmailDocumentResponse](EmailDocumentResponse.md) createEmail(CreateEmailRequestData request)

Create an email document

### **CreateEmailRequestData** Parameters
```java
public CreateEmailRequestData(
    String fileName, 
    CreateEmailRequest request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileName** | **String**| Email document file name in storage |
 **request** | [**CreateEmailRequest**](CreateEmailRequest.md)| An email document and optional Storage info to specify where the file should be located |

### Return type

[**EmailDocumentResponse**](EmailDocumentResponse.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="getEmail"></a>
## **getEmail**
> [EmailDocument](EmailDocument.md) getEmail(GetEmailRequestData request)

Get email document

### **GetEmailRequestData** Parameters
```java
public GetEmailRequestData(
    String fileName, 
    String storage, 
    String folder)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileName** | **String**| Email document file name in storage |
 **storage** | **String**| Storage name | [optional]
 **folder** | **String**| Path to folder in storage | [optional]

### Return type

[**EmailDocument**](EmailDocument.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="getEmailAttachment"></a>
## **getEmailAttachment**
> [File](File.md) getEmailAttachment(GetEmailAttachmentRequestData request)

Get email attachment by name

### **GetEmailAttachmentRequestData** Parameters
```java
public GetEmailAttachmentRequestData(
    String attachment, 
    String fileName, 
    String storage, 
    String folder)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attachment** | **String**| Attachment name |
 **fileName** | **String**| Email document file name |
 **storage** | **String**| Storage name | [optional]
 **folder** | **String**| Path to folder in storage | [optional]

### Return type

[**File**](File.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="getEmailProperty"></a>
## **getEmailProperty**
> [EmailPropertyResponse](EmailPropertyResponse.md) getEmailProperty(GetEmailPropertyRequestData request)

Get an email document property by its name

### **GetEmailPropertyRequestData** Parameters
```java
public GetEmailPropertyRequestData(
    String propertyName, 
    String fileName, 
    String storage, 
    String folder)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **propertyName** | **String**| A property name |
 **fileName** | **String**| Email document file name |
 **storage** | **String**| Storage name | [optional]
 **folder** | **String**| Path to folder in storage | [optional]

### Return type

[**EmailPropertyResponse**](EmailPropertyResponse.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="setEmailProperty"></a>
## **setEmailProperty**
> [EmailPropertyResponse](EmailPropertyResponse.md) setEmailProperty(SetEmailPropertyRequestData request)

Set email document property value

### **SetEmailPropertyRequestData** Parameters
```java
public SetEmailPropertyRequestData(
    String propertyName, 
    String fileName, 
    SetEmailPropertyRequest request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **propertyName** | **String**| A property name that should be changed |
 **fileName** | **String**| Email document file name |
 **request** | [**SetEmailPropertyRequest**](SetEmailPropertyRequest.md)| A property that should be changed and optional Storage info to specify             where the file located |

### Return type

[**EmailPropertyResponse**](EmailPropertyResponse.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

