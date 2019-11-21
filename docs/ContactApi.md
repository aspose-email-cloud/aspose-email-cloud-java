# com.aspose.email.cloud.sdk.api.ContactApi

<a name="addContactAttachment"></a>
## **addContactAttachment**
> void addContactAttachment(AddContactAttachmentRequestData request)

Add attachment to contact document

### **AddContactAttachmentRequestData** Parameters
```java
public AddContactAttachmentRequestData(
    String format, 
    String name, 
    String attachment, 
    AddAttachmentRequest request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**| Contact document format | [enum: VCard, WebDav, Msg]
 **name** | **String**| Contact document file name |
 **attachment** | **String**| Attachment name |
 **request** | [**AddAttachmentRequest**](AddAttachmentRequest.md)| Add attachment request |

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="createContact"></a>
## **createContact**
> void createContact(CreateContactRequestData request)

Create contact document

### **CreateContactRequestData** Parameters
```java
public CreateContactRequestData(
    String format, 
    String name, 
    HierarchicalObjectRequest request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**| Contact document format | [enum: VCard, WebDav, Msg]
 **name** | **String**| Contact document file name |
 **request** | [**HierarchicalObjectRequest**](HierarchicalObjectRequest.md)| Create contact request |

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="deleteContactProperty"></a>
## **deleteContactProperty**
> void deleteContactProperty(DeleteContactPropertyRequestData request)

Delete property from indexed property list

### **DeleteContactPropertyRequestData** Parameters
```java
public DeleteContactPropertyRequestData(
    String format, 
    String name, 
    String memberName, 
    Integer index, 
    StorageFolderLocation folder)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**| Contact document format | [enum: VCard, WebDav, Msg]
 **name** | **String**| Contact document file name |
 **memberName** | **String**| Indexed property name |
 **index** | **Integer**| Property index |
 **folder** | [**StorageFolderLocation**](StorageFolderLocation.md)| Calendar document location in storage information |

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="getContactAttachment"></a>
## **getContactAttachment**
> [File](File.md) getContactAttachment(GetContactAttachmentRequestData request)

Get attachment file by name

### **GetContactAttachmentRequestData** Parameters
```java
public GetContactAttachmentRequestData(
    String format, 
    String name, 
    String attachment, 
    String folder, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**| Contact document format | [enum: VCard, WebDav, Msg]
 **name** | **String**| Contact document file name |
 **attachment** | **String**| Attachment name or index |
 **folder** | **String**| Path to folder in storage | [optional]
 **storage** | **String**| Storage name | [optional]

### Return type

[**File**](File.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="getContactList"></a>
## **getContactList**
> [ListResponseOfHierarchicalObjectResponse](ListResponseOfHierarchicalObjectResponse.md) getContactList(GetContactListRequestData request)

Get contact list from storage folder

### **GetContactListRequestData** Parameters
```java
public GetContactListRequestData(
    String format, 
    String folder, 
    String storage, 
    Integer itemsPerPage, 
    Integer pageNumber)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**| Contact document format | [enum: VCard, WebDav, Msg]
 **folder** | **String**| Path to folder in storage | [optional]
 **storage** | **String**| Storage name | [optional]
 **itemsPerPage** | **Integer**| Count of items on page | [optional] [default to 10]
 **pageNumber** | **Integer**| Page number | [optional] [default to 0]

### Return type

[**ListResponseOfHierarchicalObjectResponse**](ListResponseOfHierarchicalObjectResponse.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="getContactProperties"></a>
## **getContactProperties**
> [HierarchicalObject](HierarchicalObject.md) getContactProperties(GetContactPropertiesRequestData request)

Get contact document properties

### **GetContactPropertiesRequestData** Parameters
```java
public GetContactPropertiesRequestData(
    String format, 
    String name, 
    String folder, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**| Contact document format | [enum: VCard, WebDav, Msg]
 **name** | **String**| Contact document file name |
 **folder** | **String**| Path to folder in storage | [optional]
 **storage** | **String**| Storage name | [optional]

### Return type

[**HierarchicalObject**](HierarchicalObject.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="updateContactProperties"></a>
## **updateContactProperties**
> void updateContactProperties(UpdateContactPropertiesRequestData request)

Update contact document properties

### **UpdateContactPropertiesRequestData** Parameters
```java
public UpdateContactPropertiesRequestData(
    String format, 
    String name, 
    HierarchicalObjectRequest request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**| Contact document format | [enum: VCard, WebDav, Msg]
 **name** | **String**| Contact document file name |
 **request** | [**HierarchicalObjectRequest**](HierarchicalObjectRequest.md)| Properties that should be updated/added |

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

