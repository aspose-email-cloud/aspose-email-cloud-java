# com.aspose.email.cloud.sdk.api.MapiApi

<a name="addMapiAttachment"></a>
## **addMapiAttachment**
> void addMapiAttachment(AddMapiAttachmentRequestData request)

Add attachment to document

### **AddMapiAttachmentRequestData** Parameters
```java
public AddMapiAttachmentRequestData(
    String name, 
    String attachment, 
    AddAttachmentRequest request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document file name |
 **attachment** | **String**| Attachment file name |
 **request** | [**AddAttachmentRequest**](AddAttachmentRequest.md)| Add attachment request |

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="createMapi"></a>
## **createMapi**
> void createMapi(CreateMapiRequestData request)

Create new document

### **CreateMapiRequestData** Parameters
```java
public CreateMapiRequestData(
    String name, 
    HierarchicalObjectRequest request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document file name |
 **request** | [**HierarchicalObjectRequest**](HierarchicalObjectRequest.md)| Create document request |

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="deleteMapiAttachment"></a>
## **deleteMapiAttachment**
> void deleteMapiAttachment(DeleteMapiAttachmentRequestData request)

Remove attachment from document

### **DeleteMapiAttachmentRequestData** Parameters
```java
public DeleteMapiAttachmentRequestData(
    String name, 
    String attachment, 
    StorageFolderLocation storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document file name |
 **attachment** | **String**| Attachment name or index |
 **storage** | [**StorageFolderLocation**](StorageFolderLocation.md)| Document file storage location info |

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="deleteMapiProperties"></a>
## **deleteMapiProperties**
> void deleteMapiProperties(DeleteMapiPropertiesRequestData request)

Delete document properties

### **DeleteMapiPropertiesRequestData** Parameters
```java
public DeleteMapiPropertiesRequestData(
    String name, 
    HierarchicalObjectRequest request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document file name |
 **request** | [**HierarchicalObjectRequest**](HierarchicalObjectRequest.md)| Properties that should be deleted |

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="getMapiAttachment"></a>
## **getMapiAttachment**
> [File](File.md) getMapiAttachment(GetMapiAttachmentRequestData request)

Get document attachment as file stream

### **GetMapiAttachmentRequestData** Parameters
```java
public GetMapiAttachmentRequestData(
    String name, 
    String attachment, 
    String folder, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document file name |
 **attachment** | **String**| Attachment name or index |
 **folder** | **String**| Path to folder in storage | [optional]
 **storage** | **String**| Storage name | [optional]

### Return type

[**File**](File.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="getMapiAttachments"></a>
## **getMapiAttachments**
> [ListResponseOfString](ListResponseOfString.md) getMapiAttachments(GetMapiAttachmentsRequestData request)

Get document attachment list

### **GetMapiAttachmentsRequestData** Parameters
```java
public GetMapiAttachmentsRequestData(
    String name, 
    String folder, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document file name |
 **folder** | **String**| Path to folder in storage | [optional]
 **storage** | **String**| Storage name | [optional]

### Return type

[**ListResponseOfString**](ListResponseOfString.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="getMapiList"></a>
## **getMapiList**
> [ListResponseOfHierarchicalObjectResponse](ListResponseOfHierarchicalObjectResponse.md) getMapiList(GetMapiListRequestData request)

Get document list from storage folder

### **GetMapiListRequestData** Parameters
```java
public GetMapiListRequestData(
    String folder, 
    String storage, 
    Integer itemsPerPage, 
    Integer pageNumber)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **folder** | **String**| Path to folder in storage | [optional]
 **storage** | **String**| Storage name | [optional]
 **itemsPerPage** | **Integer**| Count of items on page | [optional] [default to 10]
 **pageNumber** | **Integer**| Page number | [optional] [default to 0]

### Return type

[**ListResponseOfHierarchicalObjectResponse**](ListResponseOfHierarchicalObjectResponse.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="getMapiProperties"></a>
## **getMapiProperties**
> [HierarchicalObjectResponse](HierarchicalObjectResponse.md) getMapiProperties(GetMapiPropertiesRequestData request)

Get document properties

### **GetMapiPropertiesRequestData** Parameters
```java
public GetMapiPropertiesRequestData(
    String name, 
    String folder, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document file name |
 **folder** | **String**| Path to folder in storage | [optional]
 **storage** | **String**| Storage name | [optional]

### Return type

[**HierarchicalObjectResponse**](HierarchicalObjectResponse.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="updateMapiProperties"></a>
## **updateMapiProperties**
> void updateMapiProperties(UpdateMapiPropertiesRequestData request)

Update document properties

### **UpdateMapiPropertiesRequestData** Parameters
```java
public UpdateMapiPropertiesRequestData(
    String name, 
    HierarchicalObjectRequest request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document file name |
 **request** | [**HierarchicalObjectRequest**](HierarchicalObjectRequest.md)| Properties that should be updated/added |

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

