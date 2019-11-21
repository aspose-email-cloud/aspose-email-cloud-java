# com.aspose.email.cloud.sdk.api.EmailClientApi

<a name="appendEmailMessage"></a>
## **appendEmailMessage**
> [EmailPropertyResponse](EmailPropertyResponse.md) appendEmailMessage(AppendEmailMessageRequestData request)

Adds an email from *.eml file to specified folder in email account

### **AppendEmailMessageRequestData** Parameters
```java
public AppendEmailMessageRequestData(
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
> [ValueResponse](ValueResponse.md) appendMimeMessage(AppendMimeMessageRequestData request)

Adds an email from MIME to specified folder in email account

### **AppendMimeMessageRequestData** Parameters
```java
public AppendMimeMessageRequestData(
    AppendEmailMimeBaseRequest request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**AppendEmailMimeBaseRequest**](AppendEmailMimeBaseRequest.md)| Append email request |

### Return type

[**ValueResponse**](ValueResponse.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="createEmailFolder"></a>
## **createEmailFolder**
> void createEmailFolder(CreateEmailFolderRequestData request)

Create new folder in email account

### **CreateEmailFolderRequestData** Parameters
```java
public CreateEmailFolderRequestData(
    CreateFolderBaseRequest request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CreateFolderBaseRequest**](CreateFolderBaseRequest.md)| Create folder request |

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="deleteEmailFolder"></a>
## **deleteEmailFolder**
> void deleteEmailFolder(DeleteEmailFolderRequestData request)

Delete a folder in email account

### **DeleteEmailFolderRequestData** Parameters
```java
public DeleteEmailFolderRequestData(
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
> void deleteEmailMessage(DeleteEmailMessageRequestData request)

Delete message from email account by id

### **DeleteEmailMessageRequestData** Parameters
```java
public DeleteEmailMessageRequestData(
    DeleteMessageBaseRequest request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**DeleteMessageBaseRequest**](DeleteMessageBaseRequest.md)| Delete message request |

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="fetchEmailMessage"></a>
## **fetchEmailMessage**
> [MimeResponse](MimeResponse.md) fetchEmailMessage(FetchEmailMessageRequestData request)

Fetch message mime from email account

### **FetchEmailMessageRequestData** Parameters
```java
public FetchEmailMessageRequestData(
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

<a name="listEmailFolders"></a>
## **listEmailFolders**
> [ListResponseOfMailServerFolder](ListResponseOfMailServerFolder.md) listEmailFolders(ListEmailFoldersRequestData request)

Get folders list in email account

### **ListEmailFoldersRequestData** Parameters
```java
public ListEmailFoldersRequestData(
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

[**ListResponseOfMailServerFolder**](ListResponseOfMailServerFolder.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="listEmailMessages"></a>
## **listEmailMessages**
> [ListResponseOfString](ListResponseOfString.md) listEmailMessages(ListEmailMessagesRequestData request)

Get messages from folder, filtered by query

The query string should have the following view.  The example of a simple expression:   &#39;&lt;Field name&gt;&#39; &lt;Comparison operator&gt; &#39;&lt;Field value&gt;&#39;,  where &amp;lt;Field Name&amp;gt; - the name of a message field through which filtering is made, &amp;lt;Comparison operator&amp;gt; - comparison operators, as their name implies, allow to compare message field and specified value, &amp;lt;Field value&amp;gt; - value to be compared with a message field.  The number of simple expressions can make a compound one, ex.: (&lt;Simple expression 1&gt; &amp; &lt;Simple expression 2&gt;) | &lt;Simple expression 3&gt;,  where \&quot;&amp;amp;\&quot; - logical-AND operator, \&quot;|\&quot; - logical-OR operator  At present the following values are allowed as a field name (&lt;Field name&gt;):  \&quot;To\&quot; - represents a TO field of message, \&quot;Text\&quot; - represents string in the header or body of the message, \&quot;Bcc\&quot; - represents a BCC field of message, \&quot;Body\&quot; - represents a string in the body of message, \&quot;Cc\&quot; - represents a CC field of message, \&quot;From\&quot; - represents a From field of message, \&quot;Subject\&quot; - represents a string in the subject of message, \&quot;InternalDate\&quot; - represents an internal date of message, \&quot;SentDate\&quot; - represents a sent date of message  Additionally, the following field names are allowed for IMAP-protocol:  \&quot;Answered\&quot; - represents an /Answered flag of message \&quot;Seen\&quot; - represents a /Seen flag of message \&quot;Flagged\&quot; - represents a /Flagged flag of message \&quot;Draft\&quot; - represents a /Draft flag of message \&quot;Deleted\&quot; - represents a Deleted/ flag of message \&quot;Recent\&quot; - represents a Deleted/ flag of message \&quot;MessageSize\&quot; - represents a size (in bytes) of message  Additionally, the following field names are allowed for Exchange:  \&quot;IsRead\&quot; - Indicates whether the message has been read \&quot;HasAttachment\&quot; - Indicates whether or not the message has attachments \&quot;IsSubmitted\&quot; - Indicates whether the message has been submitted to the Outbox \&quot;ContentClass\&quot; - represents a content class of item  Additionally, the following field names are allowed for pst/ost files:  \&quot;MessageClass\&quot; - Represents a message class \&quot;ContainerClass\&quot; - Represents a folder container class \&quot;Importance\&quot; - Represents a message importance \&quot;MessageSize\&quot; - represents a size (in bytes) of message \&quot;FolderName\&quot; - represents a folder name \&quot;ContentsCount\&quot; - represents a total number of items in the folder \&quot;UnreadContentsCount\&quot; - represents the number of unread items in the folder. \&quot;Subfolders\&quot; - Indicates whether or not the folder has subfolders \&quot;Read\&quot; - the message is marked as having been read \&quot;HasAttachment\&quot; - the message has at least one attachment \&quot;Unsent\&quot; - the message is still being composed \&quot;Unmodified\&quot; - the message has not been modified since it was first saved (if unsent) or it was delivered (if sent) \&quot;FromMe\&quot; - the user receiving the message was also the user who sent the message \&quot;Resend\&quot; - the message includes a request for a resend operation with a non-delivery report \&quot;NotifyRead\&quot; - the user who sent the message has requested notification when a recipient first reads it \&quot;NotifyUnread\&quot; - the user who sent the message has requested notification when a recipient deletes it before reading or the Message object expires \&quot;EverRead\&quot; - the message has been read at least once  The field value (&lt;Field value&gt;) can take the following values: For text fields - any string, For date type fields - the string of \&quot;d-MMM-yyy\&quot; format, ex. \&quot;10-Feb-2009\&quot;, For flags (fields of boolean type) - either \&quot;True\&quot;, or \&quot;False\&quot;

### **ListEmailMessagesRequestData** Parameters
```java
public ListEmailMessagesRequestData(
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

[**ListResponseOfString**](ListResponseOfString.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="saveMailAccount"></a>
## **saveMailAccount**
> void saveMailAccount(SaveMailAccountRequestData request)

Create email account file (*.account) with login/password authentication

### **SaveMailAccountRequestData** Parameters
```java
public SaveMailAccountRequestData(
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
> void saveMailOAuthAccount(SaveMailOAuthAccountRequestData request)

Create email account file (*.account) with OAuth

### **SaveMailOAuthAccountRequestData** Parameters
```java
public SaveMailOAuthAccountRequestData(
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
> void sendEmail(SendEmailRequestData request)

Send an email from *.eml file located on storage

### **SendEmailRequestData** Parameters
```java
public SendEmailRequestData(
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
> void sendEmailMime(SendEmailMimeRequestData request)

Send an email specified by MIME in request

### **SendEmailMimeRequestData** Parameters
```java
public SendEmailMimeRequestData(
    SendEmailMimeBaseRequest request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**SendEmailMimeBaseRequest**](SendEmailMimeBaseRequest.md)| Send email request |

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="setEmailReadFlag"></a>
## **setEmailReadFlag**
> void setEmailReadFlag(SetEmailReadFlagRequestData request)

Sets \&quot;Message is read\&quot; flag

### **SetEmailReadFlagRequestData** Parameters
```java
public SetEmailReadFlagRequestData(
    SetMessageReadFlagAccountBaseRequest request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**SetMessageReadFlagAccountBaseRequest**](SetMessageReadFlagAccountBaseRequest.md)| Message is read request |

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

