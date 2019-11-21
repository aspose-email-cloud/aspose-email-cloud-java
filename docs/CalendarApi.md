# com.aspose.email.cloud.sdk.api.CalendarApi

<a name="addCalendarAttachment"></a>
## **addCalendarAttachment**
> void addCalendarAttachment(AddCalendarAttachmentRequestData request)

Adds an attachment to iCalendar file

### **AddCalendarAttachmentRequestData** Parameters
```java
public AddCalendarAttachmentRequestData(
    String name, 
    String attachment, 
    AddAttachmentRequest request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Calendar file name in storage |
 **attachment** | **String**| Attachment file name in storage |
 **request** | [**AddAttachmentRequest**](AddAttachmentRequest.md)| Storage name and folder path for calendar and attachment files |

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="createCalendar"></a>
## **createCalendar**
> void createCalendar(CreateCalendarRequestData request)

Create calendar file

### **CreateCalendarRequestData** Parameters
```java
public CreateCalendarRequestData(
    String name, 
    HierarchicalObjectRequest request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Calendar file name in storage |
 **request** | [**HierarchicalObjectRequest**](HierarchicalObjectRequest.md)|  |

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="deleteCalendarProperty"></a>
## **deleteCalendarProperty**
> void deleteCalendarProperty(DeleteCalendarPropertyRequestData request)

Deletes indexed property by index and name. To delete Reminder attachment, use path ReminderAttachment/{ReminderIndex}/{AttachmentIndex}

### **DeleteCalendarPropertyRequestData** Parameters
```java
public DeleteCalendarPropertyRequestData(
    String name, 
    String memberName, 
    String index, 
    StorageFolderLocation request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| iCalendar file name in storage |
 **memberName** | **String**| Indexed property name |
 **index** | **String**| Property index path |
 **request** | [**StorageFolderLocation**](StorageFolderLocation.md)| Storage detail to specify iCalendar file location |

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="getCalendar"></a>
## **getCalendar**
> [HierarchicalObject](HierarchicalObject.md) getCalendar(GetCalendarRequestData request)

Get calendar file properties

### **GetCalendarRequestData** Parameters
```java
public GetCalendarRequestData(
    String name, 
    String folder, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| iCalendar file name in storage |
 **folder** | **String**| Path to folder in storage | [optional]
 **storage** | **String**| Storage name | [optional]

### Return type

[**HierarchicalObject**](HierarchicalObject.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="getCalendarAttachment"></a>
## **getCalendarAttachment**
> [File](File.md) getCalendarAttachment(GetCalendarAttachmentRequestData request)

Get iCalendar document attachment by name

### **GetCalendarAttachmentRequestData** Parameters
```java
public GetCalendarAttachmentRequestData(
    String name, 
    String attachment, 
    String folder, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| iCalendar document file name |
 **attachment** | **String**| Attachment name or index |
 **folder** | **String**| Path to folder in storage | [optional]
 **storage** | **String**| Storage name | [optional]

### Return type

[**File**](File.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="getCalendarList"></a>
## **getCalendarList**
> [ListResponseOfHierarchicalObjectResponse](ListResponseOfHierarchicalObjectResponse.md) getCalendarList(GetCalendarListRequestData request)

Get iCalendar files list in folder on storage

### **GetCalendarListRequestData** Parameters
```java
public GetCalendarListRequestData(
    String folder, 
    Integer itemsPerPage, 
    Integer pageNumber, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **folder** | **String**| Path to folder in storage |
 **itemsPerPage** | **Integer**| Count of items on page |
 **pageNumber** | **Integer**| Page number |
 **storage** | **String**| Storage name | [optional]

### Return type

[**ListResponseOfHierarchicalObjectResponse**](ListResponseOfHierarchicalObjectResponse.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="updateCalendarProperties"></a>
## **updateCalendarProperties**
> void updateCalendarProperties(UpdateCalendarPropertiesRequestData request)

Update calendar file properties

### **UpdateCalendarPropertiesRequestData** Parameters
```java
public UpdateCalendarPropertiesRequestData(
    String name, 
    HierarchicalObjectRequest request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| iCalendar file name in storage |
 **request** | [**HierarchicalObjectRequest**](HierarchicalObjectRequest.md)| Calendar properties update request |

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

