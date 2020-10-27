# ClientMessageApi

            
<a name="append"></a>
# append
> [ValueTOfString](ValueTOfString.md) append([ClientMessageAppendRequest](ClientMessageAppendRequest.md) request)

Add email message to specified folder in email account.             

### request Parameter

See parameter model documentation at [ClientMessageAppendRequest](ClientMessageAppendRequest.md)

### Return type

[**ValueTOfString**](ValueTOfString.md)

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)
            
<a name="appendFile"></a>
# **appendFile**
> [ValueTOfString](ValueTOfString.md) appendFile(ClientMessageAppendFileRequest request)

Add email message from file to specified folder in email account.             

### **ClientMessageAppendFileRequest** Parameters
```java
public ClientMessageAppendFileRequest(
    String account, 
    byte[] file, 
    String storage, 
    String accountStorageFolder, 
    String format, 
    String folder, 
    Boolean markAsSent)
```

Name | Type | Description | Notes
---- | ---- | ----------- | -----
 **account** | **String**| Email account. |
 **file** | **byte[]**| Message file to append. |
 **storage** | **String**| Storage name where account file located. | [optional]
 **accountStorageFolder** | **String**| Folder in storage where account file located. | [optional]
 **format** | **String**| Email file format. Enum, available values: Eml, Msg, MsgUnicode, Mhtml, Html, Tnef, Oft | [optional] [default to 0]
 **folder** | **String**| Path to folder on email server to append message to. | [optional]
 **markAsSent** | **Boolean**| Determines that appended message should be market as sent or not. | [optional] [default to true]

### Return type

[**ValueTOfString**](ValueTOfString.md)

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

            
<a name="delete"></a>
# delete
> void delete([ClientMessageDeleteRequest](ClientMessageDeleteRequest.md) request)

Delete message.             

### request Parameter

See parameter model documentation at [ClientMessageDeleteRequest](ClientMessageDeleteRequest.md)

### Return type

void (empty response body)

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)
            
<a name="fetch"></a>
# **fetch**
> [MailMessageBase](MailMessageBase.md) fetch(ClientMessageFetchRequest request)

Fetch message from email account             

### **ClientMessageFetchRequest** Parameters
```java
public ClientMessageFetchRequest(
    String messageId, 
    String account, 
    String folder, 
    String storage, 
    String accountStorageFolder, 
    String type, 
    String format)
```

Name | Type | Description | Notes
---- | ---- | ----------- | -----
 **messageId** | **String**| Message identifier |
 **account** | **String**| Email account |
 **folder** | **String**| Account folder to fetch from (should be specified for some protocols such as IMAP)              | [optional]
 **storage** | **String**| Storage name where account file located. | [optional]
 **accountStorageFolder** | **String**| Folder in storage where account file located. | [optional]
 **type** | **String**| MailMessageBase type. Using this property you can fetch message in different formats (as EmailDto, MapiMessageDto or a file represented as Base64 string).              Enum, available values: Dto, Mapi, Base64 | [optional] [default to 0]
 **format** | **String**| Base64 data format. Used only if type is set to Base64. Enum, available values: Eml, Msg, MsgUnicode, Mhtml, Html, Tnef, Oft | [optional] [default to 0]

### Return type

[**MailMessageBase**](MailMessageBase.md)

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

            
<a name="fetchFile"></a>
# **fetchFile**
> byte[] fetchFile(ClientMessageFetchFileRequest request)

Fetch message as file from email account             

### **ClientMessageFetchFileRequest** Parameters
```java
public ClientMessageFetchFileRequest(
    String messageId, 
    String account, 
    String folder, 
    String storage, 
    String accountStorageFolder, 
    String format)
```

Name | Type | Description | Notes
---- | ---- | ----------- | -----
 **messageId** | **String**| Message identifier |
 **account** | **String**| Email account |
 **folder** | **String**| Account folder to fetch from (should be specified for some protocols such as IMAP)              | [optional]
 **storage** | **String**| Storage name where account file located. | [optional]
 **accountStorageFolder** | **String**| Folder in storage where account file located. | [optional]
 **format** | **String**| Fetched message file format. Enum, available values: Eml, Msg, MsgUnicode, Mhtml, Html, Tnef, Oft | [optional] [default to 0]

### Return type

**byte[]**

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

            
<a name="list"></a>
# **list**
> [MailMessageBaseList](MailMessageBaseList.md) list(ClientMessageListRequest request)

Get messages from folder, filtered by query             

    The query string should have the following view.      The example of a simple expression:       &#39;&lt;Field name&gt;&#39; &lt;Comparison operator&gt; &#39;&lt;Field value&gt;&#39;,  where &amp;lt;Field Name&amp;gt; - the name of a message field through which filtering is made, &amp;lt;Comparison operator&amp;gt; - comparison operators, as their name implies, allow to compare message field and specified value, &amp;lt;Field value&amp;gt; - value to be compared with a message field.      The number of simple expressions can make a compound one, ex.:     (&lt;Simple expression 1&gt; &amp; &lt;Simple expression 2&gt;) | &lt;Simple expression 3     &gt;,  where \&quot;&amp;amp;\&quot; - logical-AND operator, \&quot;|\&quot; - logical-OR operator      At present the following values are allowed as a field name (&lt;Field name&gt;):  \&quot;To\&quot; - represents a TO field of message, \&quot;Text\&quot; - represents string in the header or body of the message, \&quot;Bcc\&quot; - represents a BCC field of message, \&quot;Body\&quot; - represents a string in the body of message, \&quot;Cc\&quot; - represents a CC field of message, \&quot;From\&quot; - represents a From field of message, \&quot;Subject\&quot; - represents a string in the subject of message, \&quot;InternalDate\&quot; - represents an internal date of message, \&quot;SentDate\&quot; - represents a sent date of message      Additionally, the following field names are allowed for IMAP-protocol:  \&quot;Answered\&quot; - represents an /Answered flag of message \&quot;Seen\&quot; - represents a /Seen flag of message \&quot;Flagged\&quot; - represents a /Flagged flag of message \&quot;Draft\&quot; - represents a /Draft flag of message \&quot;Deleted\&quot; - represents a Deleted/ flag of message \&quot;Recent\&quot; - represents a Deleted/ flag of message \&quot;MessageSize\&quot; - represents a size (in bytes) of message      Additionally, the following field names are allowed for Exchange:  \&quot;IsRead\&quot; - Indicates whether the message has been read \&quot;HasAttachment\&quot; - Indicates whether or not the message has attachments \&quot;IsSubmitted\&quot; - Indicates whether the message has been submitted to the Outbox \&quot;ContentClass\&quot; - represents a content class of item      Additionally, the following field names are allowed for pst/ost files:  \&quot;MessageClass\&quot; - Represents a message class \&quot;ContainerClass\&quot; - Represents a folder container class \&quot;Importance\&quot; - Represents a message importance \&quot;MessageSize\&quot; - represents a size (in bytes) of message \&quot;FolderName\&quot; - represents a folder name \&quot;ContentsCount\&quot; - represents a total number of items in the folder \&quot;UnreadContentsCount\&quot; - represents the number of unread items in the folder. \&quot;Subfolders\&quot; - Indicates whether or not the folder has subfolders \&quot;Read\&quot; - the message is marked as having been read \&quot;HasAttachment\&quot; - the message has at least one attachment \&quot;Unsent\&quot; - the message is still being composed \&quot;Unmodified\&quot; - the message has not been modified since it was first saved (if unsent) or it was delivered (if sent) \&quot;FromMe\&quot; - the user receiving the message was also the user who sent the message \&quot;Resend\&quot; - the message includes a request for a resend operation with a non-delivery report \&quot;NotifyRead\&quot; - the user who sent the message has requested notification when a recipient first reads it \&quot;NotifyUnread\&quot; - the user who sent the message has requested notification when a recipient deletes it before reading or the Message object expires \&quot;EverRead\&quot; - the message has been read at least once      The field value (&lt;Field value&gt;) can take the following values:     For text fields - any string,     For date type fields - the string of \&quot;d-MMM-yyy\&quot; format, ex. \&quot;10-Feb-2009\&quot;,     For flags (fields of boolean type) - either \&quot;True\&quot;, or \&quot;False\&quot;              

### **ClientMessageListRequest** Parameters
```java
public ClientMessageListRequest(
    String folder, 
    String account, 
    String queryString, 
    String storage, 
    String accountStorageFolder, 
    Boolean recursive, 
    String type, 
    String format)
```

Name | Type | Description | Notes
---- | ---- | ----------- | -----
 **folder** | **String**| A folder in email account |
 **account** | **String**| Email account |
 **queryString** | **String**| A MailQuery search string | [optional]
 **storage** | **String**| Storage name where account file located | [optional]
 **accountStorageFolder** | **String**| Folder in storage where account file located | [optional]
 **recursive** | **Boolean**| Specifies that should message be searched in subfolders recursively | [optional] [default to false]
 **type** | **String**| MailMessageBase type. Using this property you can get messages in different formats (as EmailDto, MapiMessageDto or a file represented as Base64 string).              Enum, available values: Dto, Mapi, Base64 | [optional] [default to 0]
 **format** | **String**| Base64 data format. Used only if type is set to Base64. Enum, available values: Eml, Msg, MsgUnicode, Mhtml, Html, Tnef, Oft | [optional] [default to 0]

### Return type

[**MailMessageBaseList**](MailMessageBaseList.md)

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

            
<a name="move"></a>
# move
> void move([ClientMessageMoveRequest](ClientMessageMoveRequest.md) request)

Move message to another folder.             

### request Parameter

See parameter model documentation at [ClientMessageMoveRequest](ClientMessageMoveRequest.md)

### Return type

void (empty response body)

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)
            
<a name="send"></a>
# send
> void send([ClientMessageSendRequest](ClientMessageSendRequest.md) request)

Send an email specified by model in request.             

### request Parameter

See parameter model documentation at [ClientMessageSendRequest](ClientMessageSendRequest.md)

### Return type

void (empty response body)

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)
            
<a name="sendFile"></a>
# **sendFile**
> void sendFile(ClientMessageSendFileRequest request)

Send an email file.             

### **ClientMessageSendFileRequest** Parameters
```java
public ClientMessageSendFileRequest(
    String account, 
    byte[] file, 
    String storage, 
    String accountStorageFolder, 
    String format)
```

Name | Type | Description | Notes
---- | ---- | ----------- | -----
 **account** | **String**| Email account |
 **file** | **byte[]**| File to send |
 **storage** | **String**| Storage name where account file located. | [optional]
 **accountStorageFolder** | **String**| Folder in storage where account file located. | [optional]
 **format** | **String**| Email file format Enum, available values: Eml, Msg, MsgUnicode, Mhtml, Html, Tnef, Oft | [optional] [default to 0]

### Return type

void (empty response body)

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

            
<a name="setIsRead"></a>
# setIsRead
> void setIsRead([ClientMessageSetIsReadRequest](ClientMessageSetIsReadRequest.md) request)

Mark message as read or unread.             

### request Parameter

See parameter model documentation at [ClientMessageSetIsReadRequest](ClientMessageSetIsReadRequest.md)

### Return type

void (empty response body)

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)
