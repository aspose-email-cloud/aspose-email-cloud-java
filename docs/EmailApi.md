# com.aspose.email.cloud.sdk.api.EmailApi

<a name="addCalendarAttachment"></a>
## **addCalendarAttachment**
> void addCalendarAttachment(Request request)

Adds an attachment to iCalendar file

### **Request** Parameters
```java
Request(
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

<a name="addContactAttachment"></a>
## **addContactAttachment**
> void addContactAttachment(Request request)

Add attachment to contact document

### **Request** Parameters
```java
Request(
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

<a name="addEmailAttachment"></a>
## **addEmailAttachment**
> [EmailDocumentResponse](EmailDocumentResponse.md) addEmailAttachment(Request request)

Adds an attachment to Email document

### **Request** Parameters
```java
Request(
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

<a name="addMapiAttachment"></a>
## **addMapiAttachment**
> void addMapiAttachment(Request request)

Add attachment to document

### **Request** Parameters
```java
Request(
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

<a name="appendEmailMessage"></a>
## **appendEmailMessage**
> [EmailPropertyResponse](EmailPropertyResponse.md) appendEmailMessage(Request request)

Adds an email from *.eml file to specified folder in email account

### **Request** Parameters
```java
Request(
    AppendEmailBaseRequest request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**AppendEmailBaseRequest**](AppendEmailBaseRequest.md)| Append email request |

### Return type

[**EmailPropertyResponse**](EmailPropertyResponse.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="appendMimeMessage"></a>
## **appendMimeMessage**
> [ValueResponse](ValueResponse.md) appendMimeMessage(Request request)

Adds an email from MIME to specified folder in email account

### **Request** Parameters
```java
Request(
    AppendEmailMimeBaseRequest request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**AppendEmailMimeBaseRequest**](AppendEmailMimeBaseRequest.md)| Append email request |

### Return type

[**ValueResponse**](ValueResponse.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="copyFile"></a>
## **copyFile**
> void copyFile(Request request)

Copy file

### **Request** Parameters
```java
Request(
    String srcPath, 
    String destPath, 
    String srcStorageName, 
    String destStorageName, 
    String versionId)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **srcPath** | **String**| Source file path e.g. &#39;/folder/file.ext&#39; |
 **destPath** | **String**| Destination file path |
 **srcStorageName** | **String**| Source storage name | [optional]
 **destStorageName** | **String**| Destination storage name | [optional]
 **versionId** | **String**| File version ID to copy | [optional]

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="copyFolder"></a>
## **copyFolder**
> void copyFolder(Request request)

Copy folder

### **Request** Parameters
```java
Request(
    String srcPath, 
    String destPath, 
    String srcStorageName, 
    String destStorageName)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **srcPath** | **String**| Source folder path e.g. &#39;/src&#39; |
 **destPath** | **String**| Destination folder path e.g. &#39;/dst&#39; |
 **srcStorageName** | **String**| Source storage name | [optional]
 **destStorageName** | **String**| Destination storage name | [optional]

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="createCalendar"></a>
## **createCalendar**
> void createCalendar(Request request)

Create calendar file

### **Request** Parameters
```java
Request(
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

<a name="createContact"></a>
## **createContact**
> void createContact(Request request)

Create contact document

### **Request** Parameters
```java
Request(
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

<a name="createEmail"></a>
## **createEmail**
> [EmailDocumentResponse](EmailDocumentResponse.md) createEmail(Request request)

Create an email document

### **Request** Parameters
```java
Request(
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

<a name="createEmailFolder"></a>
## **createEmailFolder**
> void createEmailFolder(Request request)

Create new folder in email account

### **Request** Parameters
```java
Request(
    CreateFolderBaseRequest request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CreateFolderBaseRequest**](CreateFolderBaseRequest.md)| Create folder request |

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="createFolder"></a>
## **createFolder**
> void createFolder(Request request)

Create the folder

### **Request** Parameters
```java
Request(
    String path, 
    String storageName)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| Folder path to create e.g. &#39;folder_1/folder_2/&#39; |
 **storageName** | **String**| Storage name | [optional]

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="createMapi"></a>
## **createMapi**
> void createMapi(Request request)

Create new document

### **Request** Parameters
```java
Request(
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

<a name="deleteCalendarProperty"></a>
## **deleteCalendarProperty**
> void deleteCalendarProperty(Request request)

Deletes indexed property by index and name. To delete Reminder attachment, use path ReminderAttachment/{ReminderIndex}/{AttachmentIndex}

### **Request** Parameters
```java
Request(
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

<a name="deleteContactProperty"></a>
## **deleteContactProperty**
> void deleteContactProperty(Request request)

Delete property from indexed property list

### **Request** Parameters
```java
Request(
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

<a name="deleteEmailFolder"></a>
## **deleteEmailFolder**
> void deleteEmailFolder(Request request)

Delete a folder in email account

### **Request** Parameters
```java
Request(
    DeleteFolderBaseRequest request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**DeleteFolderBaseRequest**](DeleteFolderBaseRequest.md)| Delete folder request |

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="deleteEmailMessage"></a>
## **deleteEmailMessage**
> void deleteEmailMessage(Request request)

Delete message from email account by id

### **Request** Parameters
```java
Request(
    DeleteMessageBaseRequest request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**DeleteMessageBaseRequest**](DeleteMessageBaseRequest.md)| Delete message request |

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="deleteFile"></a>
## **deleteFile**
> void deleteFile(Request request)

Delete file

### **Request** Parameters
```java
Request(
    String path, 
    String storageName, 
    String versionId)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| File path e.g. &#39;/folder/file.ext&#39; |
 **storageName** | **String**| Storage name | [optional]
 **versionId** | **String**| File version ID to delete | [optional]

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="deleteFolder"></a>
## **deleteFolder**
> void deleteFolder(Request request)

Delete folder

### **Request** Parameters
```java
Request(
    String path, 
    String storageName, 
    Boolean recursive)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| Folder path e.g. &#39;/folder&#39; |
 **storageName** | **String**| Storage name | [optional]
 **recursive** | **Boolean**| Enable to delete folders, subfolders and files | [optional] [default to false]

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="deleteMapiAttachment"></a>
## **deleteMapiAttachment**
> void deleteMapiAttachment(Request request)

Remove attachment from document

### **Request** Parameters
```java
Request(
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
> void deleteMapiProperties(Request request)

Delete document properties

### **Request** Parameters
```java
Request(
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

<a name="downloadFile"></a>
## **downloadFile**
> byte[] downloadFile(Request request)

Download file

### **Request** Parameters
```java
Request(
    String path, 
    String storageName, 
    String versionId)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| File path e.g. &#39;/folder/file.ext&#39; |
 **storageName** | **String**| Storage name | [optional]
 **versionId** | **String**| File version ID to download | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="fetchEmailMessage"></a>
## **fetchEmailMessage**
> [MimeResponse](MimeResponse.md) fetchEmailMessage(Request request)

Fetch message mime from email account

### **Request** Parameters
```java
Request(
    String messageId, 
    String firstAccount, 
    String secondAccount, 
    String storage, 
    String storageFolder)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messageId** | **String**| Message identifier |
 **firstAccount** | **String**| Email account |
 **secondAccount** | **String**| Additional email account (should be specified for POP/IMAP accounts and should be SMTP account) | [optional]
 **storage** | **String**| Storage name where account file(s) located | [optional]
 **storageFolder** | **String**| Folder in storage where account file(s) located | [optional]

### Return type

[**MimeResponse**](MimeResponse.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="getCalendar"></a>
## **getCalendar**
> [HierarchicalObject](HierarchicalObject.md) getCalendar(Request request)

Get calendar file properties

### **Request** Parameters
```java
Request(
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
> [File](File.md) getCalendarAttachment(Request request)

Get iCalendar document attachment by name

### **Request** Parameters
```java
Request(
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
> [ListResponseOfHierarchicalObjectResponse](ListResponseOfHierarchicalObjectResponse.md) getCalendarList(Request request)

Get iCalendar files list in folder on storage

### **Request** Parameters
```java
Request(
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

<a name="getContactAttachment"></a>
## **getContactAttachment**
> [File](File.md) getContactAttachment(Request request)

Get attachment file by name

### **Request** Parameters
```java
Request(
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
> [ListResponseOfHierarchicalObjectResponse](ListResponseOfHierarchicalObjectResponse.md) getContactList(Request request)

Get contact list from storage folder

### **Request** Parameters
```java
Request(
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
> [HierarchicalObject](HierarchicalObject.md) getContactProperties(Request request)

Get contact document properties

### **Request** Parameters
```java
Request(
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

<a name="getDiscUsage"></a>
## **getDiscUsage**
> [DiscUsage](DiscUsage.md) getDiscUsage(Request request)

Get disc usage

### **Request** Parameters
```java
Request(
    String storageName)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storageName** | **String**| Storage name | [optional]

### Return type

[**DiscUsage**](DiscUsage.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="getEmail"></a>
## **getEmail**
> [EmailDocument](EmailDocument.md) getEmail(Request request)

Get email document

### **Request** Parameters
```java
Request(
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
> [File](File.md) getEmailAttachment(Request request)

Get email attachment by name

### **Request** Parameters
```java
Request(
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
> [EmailPropertyResponse](EmailPropertyResponse.md) getEmailProperty(Request request)

Get an email document property by its name

### **Request** Parameters
```java
Request(
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

<a name="getFileVersions"></a>
## **getFileVersions**
> [FileVersions](FileVersions.md) getFileVersions(Request request)

Get file versions

### **Request** Parameters
```java
Request(
    String path, 
    String storageName)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| File path e.g. &#39;/file.ext&#39; |
 **storageName** | **String**| Storage name | [optional]

### Return type

[**FileVersions**](FileVersions.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="getFilesList"></a>
## **getFilesList**
> [FilesList](FilesList.md) getFilesList(Request request)

Get all files and folders within a folder

### **Request** Parameters
```java
Request(
    String path, 
    String storageName)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| Folder path e.g. &#39;/folder&#39; |
 **storageName** | **String**| Storage name | [optional]

### Return type

[**FilesList**](FilesList.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="getMapiAttachment"></a>
## **getMapiAttachment**
> [File](File.md) getMapiAttachment(Request request)

Get document attachment as file stream

### **Request** Parameters
```java
Request(
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
> [ListResponseOfString](ListResponseOfString.md) getMapiAttachments(Request request)

Get document attachment list

### **Request** Parameters
```java
Request(
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
> [ListResponseOfHierarchicalObjectResponse](ListResponseOfHierarchicalObjectResponse.md) getMapiList(Request request)

Get document list from storage folder

### **Request** Parameters
```java
Request(
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
> [HierarchicalObjectResponse](HierarchicalObjectResponse.md) getMapiProperties(Request request)

Get document properties

### **Request** Parameters
```java
Request(
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

<a name="listEmailFolders"></a>
## **listEmailFolders**
> [ListFoldersResponse](ListFoldersResponse.md) listEmailFolders(Request request)

Get folders list in email account

### **Request** Parameters
```java
Request(
    String firstAccount, 
    String secondAccount, 
    String storage, 
    String storageFolder, 
    String parentFolder)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **firstAccount** | **String**| Email account |
 **secondAccount** | **String**| Additional email account (should be specified for POP/IMAP accounts and should be SMTP account) | [optional]
 **storage** | **String**| Storage name where account file(s) located | [optional]
 **storageFolder** | **String**| Folder in storage where account file(s) located | [optional]
 **parentFolder** | **String**| Folder in which subfolders should be listed | [optional]

### Return type

[**ListFoldersResponse**](ListFoldersResponse.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="listEmailMessages"></a>
## **listEmailMessages**
> [ListMessagesResponse](ListMessagesResponse.md) listEmailMessages(Request request)

Get messages from folder, filtered by query

The query string should have the following view.  The example of a simple expression:   &#39;&lt;Field name&gt;&#39; &lt;Comparison operator&gt; &#39;&lt;Field value&gt;&#39;,  where &amp;lt;Field Name&amp;gt; - the name of a message field through which filtering is made, &amp;lt;Comparison operator&amp;gt; - comparison operators, as their name implies, allow to compare message field and specified value, &amp;lt;Field value&amp;gt; - value to be compared with a message field.  The number of simple expressions can make a compound one, ex.: (&lt;Simple expression 1&gt; &amp; &lt;Simple expression 2&gt;) | &lt;Simple expression 3&gt;,  where \&quot;&amp;amp;\&quot; - logical-AND operator, \&quot;|\&quot; - logical-OR operator  At present the following values are allowed as a field name (&lt;Field name&gt;):  \&quot;To\&quot; - represents a TO field of message, \&quot;Text\&quot; - represents string in the header or body of the message, \&quot;Bcc\&quot; - represents a BCC field of message, \&quot;Body\&quot; - represents a string in the body of message, \&quot;Cc\&quot; - represents a CC field of message, \&quot;From\&quot; - represents a From field of message, \&quot;Subject\&quot; - represents a string in the subject of message, \&quot;InternalDate\&quot; - represents an internal date of message, \&quot;SentDate\&quot; - represents a sent date of message  Additionally, the following field names are allowed for IMAP-protocol:  \&quot;Answered\&quot; - represents an /Answered flag of message \&quot;Seen\&quot; - represents a /Seen flag of message \&quot;Flagged\&quot; - represents a /Flagged flag of message \&quot;Draft\&quot; - represents a /Draft flag of message \&quot;Deleted\&quot; - represents a Deleted/ flag of message \&quot;Recent\&quot; - represents a Deleted/ flag of message \&quot;MessageSize\&quot; - represents a size (in bytes) of message  Additionally, the following field names are allowed for Exchange:  \&quot;IsRead\&quot; - Indicates whether the message has been read \&quot;HasAttachment\&quot; - Indicates whether or not the message has attachments \&quot;IsSubmitted\&quot; - Indicates whether the message has been submitted to the Outbox \&quot;ContentClass\&quot; - represents a content class of item  Additionally, the following field names are allowed for pst/ost files:  \&quot;MessageClass\&quot; - Represents a message class \&quot;ContainerClass\&quot; - Represents a folder container class \&quot;Importance\&quot; - Represents a message importance \&quot;MessageSize\&quot; - represents a size (in bytes) of message \&quot;FolderName\&quot; - represents a folder name \&quot;ContentsCount\&quot; - represents a total number of items in the folder \&quot;UnreadContentsCount\&quot; - represents the number of unread items in the folder. \&quot;Subfolders\&quot; - Indicates whether or not the folder has subfolders \&quot;Read\&quot; - the message is marked as having been read \&quot;HasAttachment\&quot; - the message has at least one attachment \&quot;Unsent\&quot; - the message is still being composed \&quot;Unmodified\&quot; - the message has not been modified since it was first saved (if unsent) or it was delivered (if sent) \&quot;FromMe\&quot; - the user receiving the message was also the user who sent the message \&quot;Resend\&quot; - the message includes a request for a resend operation with a non-delivery report \&quot;NotifyRead\&quot; - the user who sent the message has requested notification when a recipient first reads it \&quot;NotifyUnread\&quot; - the user who sent the message has requested notification when a recipient deletes it before reading or the Message object expires \&quot;EverRead\&quot; - the message has been read at least once  The field value (&lt;Field value&gt;) can take the following values: For text fields - any string, For date type fields - the string of \&quot;d-MMM-yyy\&quot; format, ex. \&quot;10-Feb-2009\&quot;, For flags (fields of boolean type) - either \&quot;True\&quot;, or \&quot;False\&quot;

### **Request** Parameters
```java
Request(
    String folder, 
    String queryString, 
    String firstAccount, 
    String secondAccount, 
    String storage, 
    String storageFolder, 
    Boolean recursive)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **folder** | **String**| A folder in email account |
 **queryString** | **String**| A MailQuery search string |
 **firstAccount** | **String**| Email account |
 **secondAccount** | **String**| Additional email account (should be specified for POP/IMAP accounts and should be SMTP account) | [optional]
 **storage** | **String**| Storage name where account file(s) located | [optional]
 **storageFolder** | **String**| Folder in storage where account file(s) located | [optional]
 **recursive** | **Boolean**| Specifies that should message be searched in subfolders recursively | [optional] [default to false]

### Return type

[**ListMessagesResponse**](ListMessagesResponse.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="moveFile"></a>
## **moveFile**
> void moveFile(Request request)

Move file

### **Request** Parameters
```java
Request(
    String srcPath, 
    String destPath, 
    String srcStorageName, 
    String destStorageName, 
    String versionId)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **srcPath** | **String**| Source file path e.g. &#39;/src.ext&#39; |
 **destPath** | **String**| Destination file path e.g. &#39;/dest.ext&#39; |
 **srcStorageName** | **String**| Source storage name | [optional]
 **destStorageName** | **String**| Destination storage name | [optional]
 **versionId** | **String**| File version ID to move | [optional]

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="moveFolder"></a>
## **moveFolder**
> void moveFolder(Request request)

Move folder

### **Request** Parameters
```java
Request(
    String srcPath, 
    String destPath, 
    String srcStorageName, 
    String destStorageName)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **srcPath** | **String**| Folder path to move e.g. &#39;/folder&#39; |
 **destPath** | **String**| Destination folder path to move to e.g &#39;/dst&#39; |
 **srcStorageName** | **String**| Source storage name | [optional]
 **destStorageName** | **String**| Destination storage name | [optional]

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="objectExists"></a>
## **objectExists**
> [ObjectExist](ObjectExist.md) objectExists(Request request)

Check if file or folder exists

### **Request** Parameters
```java
Request(
    String path, 
    String storageName, 
    String versionId)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| File or folder path e.g. &#39;/file.ext&#39; or &#39;/folder&#39; |
 **storageName** | **String**| Storage name | [optional]
 **versionId** | **String**| File version ID | [optional]

### Return type

[**ObjectExist**](ObjectExist.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="saveMailAccount"></a>
## **saveMailAccount**
> void saveMailAccount(Request request)

Create email account file (*.account) with login/password authentication

### **Request** Parameters
```java
Request(
    SaveEmailAccountRequest request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**SaveEmailAccountRequest**](SaveEmailAccountRequest.md)| Email account information |

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="saveMailOAuthAccount"></a>
## **saveMailOAuthAccount**
> void saveMailOAuthAccount(Request request)

Create email account file (*.account) with OAuth

### **Request** Parameters
```java
Request(
    SaveOAuthEmailAccountRequest request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**SaveOAuthEmailAccountRequest**](SaveOAuthEmailAccountRequest.md)| Email account information |

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="sendEmail"></a>
## **sendEmail**
> void sendEmail(Request request)

Send an email from *.eml file located on storage

### **Request** Parameters
```java
Request(
    SendEmailBaseRequest request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**SendEmailBaseRequest**](SendEmailBaseRequest.md)| Send email request |

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="sendEmailMime"></a>
## **sendEmailMime**
> void sendEmailMime(Request request)

Send an email specified by MIME in request

### **Request** Parameters
```java
Request(
    SendEmailMimeBaseRequest request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**SendEmailMimeBaseRequest**](SendEmailMimeBaseRequest.md)| Send email request |

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="setEmailProperty"></a>
## **setEmailProperty**
> [EmailPropertyResponse](EmailPropertyResponse.md) setEmailProperty(Request request)

Set email document property value

### **Request** Parameters
```java
Request(
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

<a name="setEmailReadFlag"></a>
## **setEmailReadFlag**
> void setEmailReadFlag(Request request)

Sets \&quot;Message is read\&quot; flag

### **Request** Parameters
```java
Request(
    SetMessageReadFlagAccountBaseRequest request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**SetMessageReadFlagAccountBaseRequest**](SetMessageReadFlagAccountBaseRequest.md)| Message is read request |

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="storageExists"></a>
## **storageExists**
> [StorageExist](StorageExist.md) storageExists(Request request)

Check if storage exists

### **Request** Parameters
```java
Request(
    String storageName)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storageName** | **String**| Storage name |

### Return type

[**StorageExist**](StorageExist.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="updateCalendarProperties"></a>
## **updateCalendarProperties**
> void updateCalendarProperties(Request request)

Update calendar file properties

### **Request** Parameters
```java
Request(
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

<a name="updateContactProperties"></a>
## **updateContactProperties**
> void updateContactProperties(Request request)

Update contact document properties

### **Request** Parameters
```java
Request(
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

<a name="updateMapiProperties"></a>
## **updateMapiProperties**
> void updateMapiProperties(Request request)

Update document properties

### **Request** Parameters
```java
Request(
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

<a name="uploadFile"></a>
## **uploadFile**
> [FilesUploadResult](FilesUploadResult.md) uploadFile(Request request)

Upload file

### **Request** Parameters
```java
Request(
    String path, 
    byte[] file, 
    String storageName)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| Path where to upload including filename and extension e.g. /file.ext or /Folder 1/file.ext             If the content is multipart and path does not contains the file name it tries to get them from filename parameter             from Content-Disposition header.              |
 **file** | **byte[]**| File to upload |
 **storageName** | **String**| Storage name | [optional]

### Return type

[**FilesUploadResult**](FilesUploadResult.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

