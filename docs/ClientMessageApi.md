# ClientMessageApi (EmailCloud.client().message())

Email client message operations.

<a name="append"></a>
## append

Description: Add email message to specified folder in email account.             

Returns: Message id.

Method call example:
```java
ValueTOfString result = api.client().message().append(request);
```

### Parameter: request

Description: Append email request.

See parameter model documentation at [ClientMessageAppendRequest](ClientMessageAppendRequest.md)

<details>
    <summary>Parameter initialization example:</summary>
    
```java
ClientMessageAppendRequest request = Models.clientMessageAppendRequest()
    .folder("INBOX/SubFolder")
    .message(Models.mailMessageDto()
        .value(Models.emailDto()
            .attachments(Arrays.<Attachment>asList(
                Models.attachment()
                    .name("some-file.txt")
                    .base64Data("U29tZSBmaWxlIGNvbnRlbnQ=")
                    .build()))
            .body("Some body")
            .bodyType("Html")
            .deliveryNotificationOptions(Arrays.<EmailDeliveryNotificationOptions>asList(
                "OnSuccess",
                "Delay"))
            .from(Models.mailAddress()
                .displayName("From Address")
                .address("from@aspose.com")
                .build())
            .htmlBody("<b>Some body</b>")
            .isBodyHtml(true)
            .isDraft(true)
            .subject("Re: Some subject")
            .to(Arrays.<MailAddress>asList(
                Models.mailAddress()
                    .displayName("To Address")
                    .address("to@aspose.com")
                    .build()))
            .build())
        .build())
    .markAsSent(true)
    .accountLocation(Models.storageFileLocation()
        .fileName("email.account")
        .storage("First Storage")
        .folderPath("file/location/folder/on/storage")
        .build())
    .build();
```

</details>


### Result

Description: Message id.

Return type: [**ValueTOfString**](ValueTOfString.md)

<details>
    <summary>Result example</summary>

```java
result = ;
```
</details>

### Complete example

<details>
    <summary>Method call example:</summary>

```java
EmailCloud api = new EmailCloud(appKey, appSid);

// Prepare parameters:
ClientMessageAppendRequest request = Models.clientMessageAppendRequest()
    .folder("INBOX/SubFolder")
    .message(Models.mailMessageDto()
        .value(Models.emailDto()
            .attachments(Arrays.<Attachment>asList(
                Models.attachment()
                    .name("some-file.txt")
                    .base64Data("U29tZSBmaWxlIGNvbnRlbnQ=")
                    .build()))
            .body("Some body")
            .bodyType("Html")
            .deliveryNotificationOptions(Arrays.<EmailDeliveryNotificationOptions>asList(
                "OnSuccess",
                "Delay"))
            .from(Models.mailAddress()
                .displayName("From Address")
                .address("from@aspose.com")
                .build())
            .htmlBody("<b>Some body</b>")
            .isBodyHtml(true)
            .isDraft(true)
            .subject("Re: Some subject")
            .to(Arrays.<MailAddress>asList(
                Models.mailAddress()
                    .displayName("To Address")
                    .address("to@aspose.com")
                    .build()))
            .build())
        .build())
    .markAsSent(true)
    .accountLocation(Models.storageFileLocation()
        .fileName("email.account")
        .storage("First Storage")
        .folderPath("file/location/folder/on/storage")
        .build())
    .build();

// Call method:
ValueTOfString result = api.client().message().append(request);

// Result example:
result = ;
```

</details>

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)
<a name="appendFile"></a>
## appendFile

Description: Add email message from file to specified folder in email account.             

Returns: Message id.

Method call example:
```java
ValueTOfString result = api.client().message().appendFile(request);
```


### Parameter: request

Description: appendFile method request.

See parameter model documentation at [ClientMessageAppendFileRequest](ClientMessageAppendFileRequest.md)

<details>
    <summary>Parameter initialization example:</summary>

```java
ClientMessageAppendFileRequest request = Models.clientMessageAppendFileRequest()
    .account("email.multi.account")
    .file(IOUtils.toByteArray(new FileInputStream("/path/to/message.eml")))
    .storage("First Storage")
    .accountStorageFolder("email/account/location/on/storage")
    .format("Eml")
    .folder("INBOX")
    .build();
```

</details>

### Result

Description: Message id.

Return type: [**ValueTOfString**](ValueTOfString.md)

<details>
    <summary>Result example</summary>

```java
result = ;
```
</details>

### Complete example

<details>
    <summary>Method call example:</summary>

```java
EmailCloud api = new EmailCloud(appKey, appSid);

// Prepare parameters:
ClientMessageAppendFileRequest request = Models.clientMessageAppendFileRequest()
    .account("email.multi.account")
    .file(IOUtils.toByteArray(new FileInputStream("/path/to/message.eml")))
    .storage("First Storage")
    .accountStorageFolder("email/account/location/on/storage")
    .format("Eml")
    .folder("INBOX")
    .build();

// Call method:
ValueTOfString result = api.client().message().appendFile(request);

// Result example:
result = ;
```

</details>

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

<a name="delete"></a>
## delete

Description: Delete message.             


Method call example:
```java
api.client().message().delete(request);
```

### Parameter: request

Description: Delete message request.

See parameter model documentation at [ClientMessageDeleteRequest](ClientMessageDeleteRequest.md)

<details>
    <summary>Parameter initialization example:</summary>
    
```java
ClientMessageDeleteRequest request = Models.clientMessageDeleteRequest()
    .folder("INBOX")
    .messageId("5")
    .accountLocation(Models.storageFileLocation()
        .fileName("email.account")
        .storage("First Storage")
        .folderPath("file/location/folder/on/storage")
        .build())
    .build();
```

</details>


### Result

Return type: void (empty response body)

### Complete example

<details>
    <summary>Method call example:</summary>

```java
EmailCloud api = new EmailCloud(appKey, appSid);

// Prepare parameters:
ClientMessageDeleteRequest request = Models.clientMessageDeleteRequest()
    .folder("INBOX")
    .messageId("5")
    .accountLocation(Models.storageFileLocation()
        .fileName("email.account")
        .storage("First Storage")
        .folderPath("file/location/folder/on/storage")
        .build())
    .build();

// Call method:
api.client().message().delete(request);
```

</details>

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)
<a name="fetch"></a>
## fetch

Description: Fetch message from email account             

Returns: MailMessageBase object that represents fetched message in requested format.

Method call example:
```java
MailMessageBase result = api.client().message().fetch(request);
```


### Parameter: request

Description: fetch method request.

See parameter model documentation at [ClientMessageFetchRequest](ClientMessageFetchRequest.md)

<details>
    <summary>Parameter initialization example:</summary>

```java
ClientMessageFetchRequest request = Models.clientMessageFetchRequest()
    .messageId("&lt;put your message identifier here&gt;")
    .account("email.multi.account")
    .folder("INBOX")
    .storage("First Storage")
    .accountStorageFolder("email/account/location/on/storage")
    .type("Dto")
    .format("Eml")
    .build();
```

</details>

### Result

Description: MailMessageBase object that represents fetched message in requested format.

Return type: [**MailMessageBase**](MailMessageBase.md)

<details>
    <summary>Result example</summary>

```java
result = Models.mailMessageBase()
    
    .build();
```
</details>

### Complete example

<details>
    <summary>Method call example:</summary>

```java
EmailCloud api = new EmailCloud(appKey, appSid);

// Prepare parameters:
ClientMessageFetchRequest request = Models.clientMessageFetchRequest()
    .messageId("&lt;put your message identifier here&gt;")
    .account("email.multi.account")
    .folder("INBOX")
    .storage("First Storage")
    .accountStorageFolder("email/account/location/on/storage")
    .type("Dto")
    .format("Eml")
    .build();

// Call method:
MailMessageBase result = api.client().message().fetch(request);

// Result example:
result = Models.mailMessageBase()
    
    .build();
```

</details>

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

<a name="fetchFile"></a>
## fetchFile

Description: Fetch message as file from email account             

Returns: Email message file in requested format.

Method call example:
```java
byte[] result = api.client().message().fetchFile(request);
```


### Parameter: request

Description: fetchFile method request.

See parameter model documentation at [ClientMessageFetchFileRequest](ClientMessageFetchFileRequest.md)

<details>
    <summary>Parameter initialization example:</summary>

```java
ClientMessageFetchFileRequest request = Models.clientMessageFetchFileRequest()
    .messageId("&lt;put your message identifier here&gt;")
    .account("email.multi.account")
    .folder("INBOX")
    .storage("First Storage")
    .accountStorageFolder("email/account/location/on/storage")
    .format("Eml")
    .build();
```

</details>

### Result

Description: Email message file in requested format.

Return type: **byte[]**

### Complete example

<details>
    <summary>Method call example:</summary>

```java
EmailCloud api = new EmailCloud(appKey, appSid);

// Prepare parameters:
ClientMessageFetchFileRequest request = Models.clientMessageFetchFileRequest()
    .messageId("&lt;put your message identifier here&gt;")
    .account("email.multi.account")
    .folder("INBOX")
    .storage("First Storage")
    .accountStorageFolder("email/account/location/on/storage")
    .format("Eml")
    .build();

// Call method:
byte[] result = api.client().message().fetchFile(request);
```

</details>

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

<a name="list"></a>
## list

Description: Get messages from folder, filtered by query             

The query string should have the following view.      The example of a simple expression:       &#39;&lt;Field name&gt;&#39; &lt;Comparison operator&gt; &#39;&lt;Field value&gt;&#39;,  where &amp;lt;Field Name&amp;gt; - the name of a message field through which filtering is made, &amp;lt;Comparison operator&amp;gt; - comparison operators, as their name implies, allow to compare message field and specified value, &amp;lt;Field value&amp;gt; - value to be compared with a message field.      The number of simple expressions can make a compound one, ex.:     (&lt;Simple expression 1&gt; &amp; &lt;Simple expression 2&gt;) | &lt;Simple expression 3     &gt;,  where \&quot;&amp;amp;\&quot; - logical-AND operator, \&quot;|\&quot; - logical-OR operator      At present the following values are allowed as a field name (&lt;Field name&gt;):  \&quot;To\&quot; - represents a TO field of message, \&quot;Text\&quot; - represents string in the header or body of the message, \&quot;Bcc\&quot; - represents a BCC field of message, \&quot;Body\&quot; - represents a string in the body of message, \&quot;Cc\&quot; - represents a CC field of message, \&quot;From\&quot; - represents a From field of message, \&quot;Subject\&quot; - represents a string in the subject of message, \&quot;InternalDate\&quot; - represents an internal date of message, \&quot;SentDate\&quot; - represents a sent date of message      Additionally, the following field names are allowed for IMAP-protocol:  \&quot;Answered\&quot; - represents an /Answered flag of message \&quot;Seen\&quot; - represents a /Seen flag of message \&quot;Flagged\&quot; - represents a /Flagged flag of message \&quot;Draft\&quot; - represents a /Draft flag of message \&quot;Deleted\&quot; - represents a Deleted/ flag of message \&quot;Recent\&quot; - represents a Deleted/ flag of message \&quot;MessageSize\&quot; - represents a size (in bytes) of message      Additionally, the following field names are allowed for Exchange:  \&quot;IsRead\&quot; - Indicates whether the message has been read \&quot;HasAttachment\&quot; - Indicates whether or not the message has attachments \&quot;IsSubmitted\&quot; - Indicates whether the message has been submitted to the Outbox \&quot;ContentClass\&quot; - represents a content class of item      Additionally, the following field names are allowed for pst/ost files:  \&quot;MessageClass\&quot; - Represents a message class \&quot;ContainerClass\&quot; - Represents a folder container class \&quot;Importance\&quot; - Represents a message importance \&quot;MessageSize\&quot; - represents a size (in bytes) of message \&quot;FolderName\&quot; - represents a folder name \&quot;ContentsCount\&quot; - represents a total number of items in the folder \&quot;UnreadContentsCount\&quot; - represents the number of unread items in the folder. \&quot;Subfolders\&quot; - Indicates whether or not the folder has subfolders \&quot;Read\&quot; - the message is marked as having been read \&quot;HasAttachment\&quot; - the message has at least one attachment \&quot;Unsent\&quot; - the message is still being composed \&quot;Unmodified\&quot; - the message has not been modified since it was first saved (if unsent) or it was delivered (if sent) \&quot;FromMe\&quot; - the user receiving the message was also the user who sent the message \&quot;Resend\&quot; - the message includes a request for a resend operation with a non-delivery report \&quot;NotifyRead\&quot; - the user who sent the message has requested notification when a recipient first reads it \&quot;NotifyUnread\&quot; - the user who sent the message has requested notification when a recipient deletes it before reading or the Message object expires \&quot;EverRead\&quot; - the message has been read at least once      The field value (&lt;Field value&gt;) can take the following values:     For text fields - any string,     For date type fields - the string of \&quot;d-MMM-yyy\&quot; format, ex. \&quot;10-Feb-2009\&quot;,     For flags (fields of boolean type) - either \&quot;True\&quot;, or \&quot;False\&quot;              

Returns: List of MailMessageBase objects that represent fetched message in requested format.

Method call example:
```java
MailMessageBaseList result = api.client().message().list(request);
```


### Parameter: request

Description: list method request.

See parameter model documentation at [ClientMessageListRequest](ClientMessageListRequest.md)

<details>
    <summary>Parameter initialization example:</summary>

```java
ClientMessageListRequest request = Models.clientMessageListRequest()
    .folder("INBOX")
    .account("email.multi.account")
    .queryString("(&#39;From&#39; Contains &#39;.com&#39;)")
    .storage("First Storage")
    .accountStorageFolder("email/account/location/on/storage")
    .recursive(true)
    .type("Dto")
    .format("Eml")
    .build();
```

</details>

### Result

Description: List of MailMessageBase objects that represent fetched message in requested format.

Return type: [**MailMessageBaseList**](MailMessageBaseList.md)

<details>
    <summary>Result example</summary>

```java
result = ;
```
</details>

### Complete example

<details>
    <summary>Method call example:</summary>

```java
EmailCloud api = new EmailCloud(appKey, appSid);

// Prepare parameters:
ClientMessageListRequest request = Models.clientMessageListRequest()
    .folder("INBOX")
    .account("email.multi.account")
    .queryString("(&#39;From&#39; Contains &#39;.com&#39;)")
    .storage("First Storage")
    .accountStorageFolder("email/account/location/on/storage")
    .recursive(true)
    .type("Dto")
    .format("Eml")
    .build();

// Call method:
MailMessageBaseList result = api.client().message().list(request);

// Result example:
result = ;
```

</details>

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

<a name="move"></a>
## move

Description: Move message to another folder.             


Method call example:
```java
api.client().message().move(request);
```

### Parameter: request

Description: Move message request.

See parameter model documentation at [ClientMessageMoveRequest](ClientMessageMoveRequest.md)

<details>
    <summary>Parameter initialization example:</summary>
    
```java
ClientMessageMoveRequest request = Models.clientMessageMoveRequest()
    .sourceFolder("INBOX")
    .destinationFolder("INBOX/SubFolder")
    .messageId("5")
    .accountLocation(Models.storageFileLocation()
        .fileName("email.account")
        .storage("First Storage")
        .folderPath("file/location/folder/on/storage")
        .build())
    .build();
```

</details>


### Result

Return type: void (empty response body)

### Complete example

<details>
    <summary>Method call example:</summary>

```java
EmailCloud api = new EmailCloud(appKey, appSid);

// Prepare parameters:
ClientMessageMoveRequest request = Models.clientMessageMoveRequest()
    .sourceFolder("INBOX")
    .destinationFolder("INBOX/SubFolder")
    .messageId("5")
    .accountLocation(Models.storageFileLocation()
        .fileName("email.account")
        .storage("First Storage")
        .folderPath("file/location/folder/on/storage")
        .build())
    .build();

// Call method:
api.client().message().move(request);
```

</details>

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)
<a name="send"></a>
## send

Description: Send an email specified by model in request.             


Method call example:
```java
api.client().message().send(request);
```

### Parameter: request

Description: Send email request.

See parameter model documentation at [ClientMessageSendRequest](ClientMessageSendRequest.md)

<details>
    <summary>Parameter initialization example:</summary>
    
```java
ClientMessageSendRequest request = Models.clientMessageSendRequest()
    .message(Models.mailMessageDto()
        .value(Models.emailDto()
            .attachments(Arrays.<Attachment>asList(
                Models.attachment()
                    .name("some-file.txt")
                    .base64Data("U29tZSBmaWxlIGNvbnRlbnQ=")
                    .build()))
            .body("Some body")
            .bodyType("Html")
            .deliveryNotificationOptions(Arrays.<EmailDeliveryNotificationOptions>asList(
                "OnSuccess",
                "Delay"))
            .from(Models.mailAddress()
                .displayName("From Address")
                .address("from@aspose.com")
                .build())
            .htmlBody("<b>Some body</b>")
            .isBodyHtml(true)
            .isDraft(true)
            .subject("Re: Some subject")
            .to(Arrays.<MailAddress>asList(
                Models.mailAddress()
                    .displayName("To Address")
                    .address("to@aspose.com")
                    .build()))
            .build())
        .build())
    .accountLocation(Models.storageFileLocation()
        .fileName("email.account")
        .storage("First Storage")
        .folderPath("file/location/folder/on/storage")
        .build())
    .build();
```

</details>


### Result

Return type: void (empty response body)

### Complete example

<details>
    <summary>Method call example:</summary>

```java
EmailCloud api = new EmailCloud(appKey, appSid);

// Prepare parameters:
ClientMessageSendRequest request = Models.clientMessageSendRequest()
    .message(Models.mailMessageDto()
        .value(Models.emailDto()
            .attachments(Arrays.<Attachment>asList(
                Models.attachment()
                    .name("some-file.txt")
                    .base64Data("U29tZSBmaWxlIGNvbnRlbnQ=")
                    .build()))
            .body("Some body")
            .bodyType("Html")
            .deliveryNotificationOptions(Arrays.<EmailDeliveryNotificationOptions>asList(
                "OnSuccess",
                "Delay"))
            .from(Models.mailAddress()
                .displayName("From Address")
                .address("from@aspose.com")
                .build())
            .htmlBody("<b>Some body</b>")
            .isBodyHtml(true)
            .isDraft(true)
            .subject("Re: Some subject")
            .to(Arrays.<MailAddress>asList(
                Models.mailAddress()
                    .displayName("To Address")
                    .address("to@aspose.com")
                    .build()))
            .build())
        .build())
    .accountLocation(Models.storageFileLocation()
        .fileName("email.account")
        .storage("First Storage")
        .folderPath("file/location/folder/on/storage")
        .build())
    .build();

// Call method:
api.client().message().send(request);
```

</details>

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)
<a name="sendFile"></a>
## sendFile

Description: Send an email file.             


Method call example:
```java
api.client().message().sendFile(request);
```


### Parameter: request

Description: sendFile method request.

See parameter model documentation at [ClientMessageSendFileRequest](ClientMessageSendFileRequest.md)

<details>
    <summary>Parameter initialization example:</summary>

```java
ClientMessageSendFileRequest request = Models.clientMessageSendFileRequest()
    .account("email.multi.account")
    .file(IOUtils.toByteArray(new FileInputStream("/path/to/message.eml")))
    .storage("First Storage")
    .accountStorageFolder("email/account/location/on/storage")
    .format("Eml")
    .build();
```

</details>

### Result

Return type: void (empty response body)

### Complete example

<details>
    <summary>Method call example:</summary>

```java
EmailCloud api = new EmailCloud(appKey, appSid);

// Prepare parameters:
ClientMessageSendFileRequest request = Models.clientMessageSendFileRequest()
    .account("email.multi.account")
    .file(IOUtils.toByteArray(new FileInputStream("/path/to/message.eml")))
    .storage("First Storage")
    .accountStorageFolder("email/account/location/on/storage")
    .format("Eml")
    .build();

// Call method:
api.client().message().sendFile(request);
```

</details>

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

<a name="setIsRead"></a>
## setIsRead

Description: Mark message as read or unread.             


Method call example:
```java
api.client().message().setIsRead(request);
```

### Parameter: request

Description: Delete message request.

See parameter model documentation at [ClientMessageSetIsReadRequest](ClientMessageSetIsReadRequest.md)

<details>
    <summary>Parameter initialization example:</summary>
    
```java
ClientMessageSetIsReadRequest request = Models.clientMessageSetIsReadRequest()
    .isRead(true)
    .messageId("5")
    .accountLocation(Models.storageFileLocation()
        .fileName("email.account")
        .storage("First Storage")
        .folderPath("file/location/folder/on/storage")
        .build())
    .build();
```

</details>


### Result

Return type: void (empty response body)

### Complete example

<details>
    <summary>Method call example:</summary>

```java
EmailCloud api = new EmailCloud(appKey, appSid);

// Prepare parameters:
ClientMessageSetIsReadRequest request = Models.clientMessageSetIsReadRequest()
    .isRead(true)
    .messageId("5")
    .accountLocation(Models.storageFileLocation()
        .fileName("email.account")
        .storage("First Storage")
        .folderPath("file/location/folder/on/storage")
        .build())
    .build();

// Call method:
api.client().message().setIsRead(request);
```

</details>

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)
