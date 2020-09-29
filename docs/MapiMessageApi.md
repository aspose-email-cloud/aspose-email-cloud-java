# MapiMessageApi (EmailCloud.mapi().message())

MAPI message operations

<a name="asEmailDto"></a>
## asEmailDto

Description: Converts MAPI message model to EmailDto model             

Returns: EmailDto model

Method call example:
```java
EmailDto result = api.mapi().message().asEmailDto(mapiMessage);
```

### Parameter: mapiMessage

Description: MAPI message model to convert

See parameter model documentation at [MapiMessageDto](MapiMessageDto.md)

<details>
    <summary>Parameter initialization example:</summary>
    
```java
MapiMessageDto mapiMessage = Models.mapiMessageDto()
    .messageBody("Some body")
    .clientSubmitTime(Calendar.getInstance().getTime())
    .deliveryTime(Calendar.getInstance().getTime())
    .displayTo("To Address")
    .flags(Arrays.<MapiMessageFlag>asList(
        "MsgFlagRead",
        "MsgFlagUnsent",
        "MsgFlagHasAttach"))
    .normalizedSubject("Some subject")
    .senderAddressType("SMTP")
    .senderEmailAddress("from@aspose.com")
    .senderName("From Address")
    .senderSmtpAddress("from@aspose.com")
    .attachments(Arrays.<MapiAttachmentDto>asList(
        Models.mapiAttachmentDto()
            .name("some-file.txt")
            .dataBase64("U29tZSBmaWxlIHRleHQ=")
            .build()))
    .body("Some body")
    .messageClass("IPM.Note")
    .recipients(Arrays.<MapiRecipientDto>asList(
        Models.mapiRecipientDto()
            .emailAddress("to@aspose.com")
            .addressType("SMTP")
            .displayName("To Address")
            .recipientType("MapiTo")
            .build()))
    .subject("Re: Some subject")
    .subjectPrefix("Re: ")
    .build();
```

</details>


### Result

Description: EmailDto model

Return type: [**EmailDto**](EmailDto.md)

<details>
    <summary>Result example</summary>

```java
result = Models.emailDto()
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
    .build();
```
</details>

### Complete example

<details>
    <summary>Method call example:</summary>

```java
EmailCloud api = new EmailCloud(appKey, appSid);

// Prepare parameters:
MapiMessageDto mapiMessage = Models.mapiMessageDto()
    .messageBody("Some body")
    .clientSubmitTime(Calendar.getInstance().getTime())
    .deliveryTime(Calendar.getInstance().getTime())
    .displayTo("To Address")
    .flags(Arrays.<MapiMessageFlag>asList(
        "MsgFlagRead",
        "MsgFlagUnsent",
        "MsgFlagHasAttach"))
    .normalizedSubject("Some subject")
    .senderAddressType("SMTP")
    .senderEmailAddress("from@aspose.com")
    .senderName("From Address")
    .senderSmtpAddress("from@aspose.com")
    .attachments(Arrays.<MapiAttachmentDto>asList(
        Models.mapiAttachmentDto()
            .name("some-file.txt")
            .dataBase64("U29tZSBmaWxlIHRleHQ=")
            .build()))
    .body("Some body")
    .messageClass("IPM.Note")
    .recipients(Arrays.<MapiRecipientDto>asList(
        Models.mapiRecipientDto()
            .emailAddress("to@aspose.com")
            .addressType("SMTP")
            .displayName("To Address")
            .recipientType("MapiTo")
            .build()))
    .subject("Re: Some subject")
    .subjectPrefix("Re: ")
    .build();

// Call method:
EmailDto result = api.mapi().message().asEmailDto(mapiMessage);

// Result example:
result = Models.emailDto()
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
    .build();
```

</details>

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)
<a name="asFile"></a>
## asFile

Description: Converts MAPI message model to specified format and returns as file.             

Returns: File stream in specified format.

Method call example:
```java
byte[] result = api.mapi().message().asFile(request);
```

### Parameter: request

Description: MAPI message model to convert.

See parameter model documentation at [MapiMessageAsFileRequest](MapiMessageAsFileRequest.md)

<details>
    <summary>Parameter initialization example:</summary>
    
```java
MapiMessageAsFileRequest request = Models.mapiMessageAsFileRequest()
    .format("Msg")
    .value(Models.mapiMessageDto()
        .messageBody("Some body")
        .clientSubmitTime(Calendar.getInstance().getTime())
        .deliveryTime(Calendar.getInstance().getTime())
        .displayTo("To Address")
        .flags(Arrays.<MapiMessageFlag>asList(
            "MsgFlagRead",
            "MsgFlagUnsent",
            "MsgFlagHasAttach"))
        .normalizedSubject("Some subject")
        .senderAddressType("SMTP")
        .senderEmailAddress("from@aspose.com")
        .senderName("From Address")
        .senderSmtpAddress("from@aspose.com")
        .attachments(Arrays.<MapiAttachmentDto>asList(
            Models.mapiAttachmentDto()
                .name("some-file.txt")
                .dataBase64("U29tZSBmaWxlIHRleHQ=")
                .build()))
        .body("Some body")
        .messageClass("IPM.Note")
        .recipients(Arrays.<MapiRecipientDto>asList(
            Models.mapiRecipientDto()
                .emailAddress("to@aspose.com")
                .addressType("SMTP")
                .displayName("To Address")
                .recipientType("MapiTo")
                .build()))
        .subject("Re: Some subject")
        .subjectPrefix("Re: ")
        .build())
    .build();
```

</details>


### Result

Description: File stream in specified format.

Return type: **byte[]**


### Complete example

<details>
    <summary>Method call example:</summary>

```java
EmailCloud api = new EmailCloud(appKey, appSid);

// Prepare parameters:
MapiMessageAsFileRequest request = Models.mapiMessageAsFileRequest()
    .format("Msg")
    .value(Models.mapiMessageDto()
        .messageBody("Some body")
        .clientSubmitTime(Calendar.getInstance().getTime())
        .deliveryTime(Calendar.getInstance().getTime())
        .displayTo("To Address")
        .flags(Arrays.<MapiMessageFlag>asList(
            "MsgFlagRead",
            "MsgFlagUnsent",
            "MsgFlagHasAttach"))
        .normalizedSubject("Some subject")
        .senderAddressType("SMTP")
        .senderEmailAddress("from@aspose.com")
        .senderName("From Address")
        .senderSmtpAddress("from@aspose.com")
        .attachments(Arrays.<MapiAttachmentDto>asList(
            Models.mapiAttachmentDto()
                .name("some-file.txt")
                .dataBase64("U29tZSBmaWxlIHRleHQ=")
                .build()))
        .body("Some body")
        .messageClass("IPM.Note")
        .recipients(Arrays.<MapiRecipientDto>asList(
            Models.mapiRecipientDto()
                .emailAddress("to@aspose.com")
                .addressType("SMTP")
                .displayName("To Address")
                .recipientType("MapiTo")
                .build()))
        .subject("Re: Some subject")
        .subjectPrefix("Re: ")
        .build())
    .build();

// Call method:
byte[] result = api.mapi().message().asFile(request);
```

</details>

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)
<a name="fromFile"></a>
## fromFile

Description: Converts email file to a MAPI model representation             

Returns: MAPI model

Method call example:
```java
MapiMessageDto result = api.mapi().message().fromFile(request);
```


### Parameter: request

Description: fromFile method request.

See parameter model documentation at [MapiMessageFromFileRequest](MapiMessageFromFileRequest.md)

<details>
    <summary>Parameter initialization example:</summary>

```java
MapiMessageFromFileRequest request = Models.mapiMessageFromFileRequest()
    .format("Msg")
    .file(IOUtils.toByteArray(new FileInputStream("/path/to/message.msg")))
    .build();
```

</details>

### Result

Description: MAPI model

Return type: [**MapiMessageDto**](MapiMessageDto.md)

<details>
    <summary>Result example</summary>

```java
result = Models.mapiMessageDto()
    .messageBody("Some body")
    .clientSubmitTime(Calendar.getInstance().getTime())
    .deliveryTime(Calendar.getInstance().getTime())
    .displayTo("To Address")
    .flags(Arrays.<MapiMessageFlag>asList(
        "MsgFlagRead",
        "MsgFlagUnsent",
        "MsgFlagHasAttach"))
    .normalizedSubject("Some subject")
    .senderAddressType("SMTP")
    .senderEmailAddress("from@aspose.com")
    .senderName("From Address")
    .senderSmtpAddress("from@aspose.com")
    .attachments(Arrays.<MapiAttachmentDto>asList(
        Models.mapiAttachmentDto()
            .name("some-file.txt")
            .dataBase64("U29tZSBmaWxlIHRleHQ=")
            .build()))
    .body("Some body")
    .messageClass("IPM.Note")
    .recipients(Arrays.<MapiRecipientDto>asList(
        Models.mapiRecipientDto()
            .emailAddress("to@aspose.com")
            .addressType("SMTP")
            .displayName("To Address")
            .recipientType("MapiTo")
            .build()))
    .subject("Re: Some subject")
    .subjectPrefix("Re: ")
    .build();
```
</details>

### Complete example

<details>
    <summary>Method call example:</summary>

```java
EmailCloud api = new EmailCloud(appKey, appSid);

// Prepare parameters:
MapiMessageFromFileRequest request = Models.mapiMessageFromFileRequest()
    .format("Msg")
    .file(IOUtils.toByteArray(new FileInputStream("/path/to/message.msg")))
    .build();

// Call method:
MapiMessageDto result = api.mapi().message().fromFile(request);

// Result example:
result = Models.mapiMessageDto()
    .messageBody("Some body")
    .clientSubmitTime(Calendar.getInstance().getTime())
    .deliveryTime(Calendar.getInstance().getTime())
    .displayTo("To Address")
    .flags(Arrays.<MapiMessageFlag>asList(
        "MsgFlagRead",
        "MsgFlagUnsent",
        "MsgFlagHasAttach"))
    .normalizedSubject("Some subject")
    .senderAddressType("SMTP")
    .senderEmailAddress("from@aspose.com")
    .senderName("From Address")
    .senderSmtpAddress("from@aspose.com")
    .attachments(Arrays.<MapiAttachmentDto>asList(
        Models.mapiAttachmentDto()
            .name("some-file.txt")
            .dataBase64("U29tZSBmaWxlIHRleHQ=")
            .build()))
    .body("Some body")
    .messageClass("IPM.Note")
    .recipients(Arrays.<MapiRecipientDto>asList(
        Models.mapiRecipientDto()
            .emailAddress("to@aspose.com")
            .addressType("SMTP")
            .displayName("To Address")
            .recipientType("MapiTo")
            .build()))
    .subject("Re: Some subject")
    .subjectPrefix("Re: ")
    .build();
```

</details>

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

<a name="get"></a>
## get

Description: Get MAPI message document.             

Returns: MAPI message document.

Method call example:
```java
MapiMessageDto result = api.mapi().message().get(request);
```


### Parameter: request

Description: get method request.

See parameter model documentation at [MapiMessageGetRequest](MapiMessageGetRequest.md)

<details>
    <summary>Parameter initialization example:</summary>

```java
MapiMessageGetRequest request = Models.mapiMessageGetRequest()
    .format("Eml")
    .fileName("email.eml")
    .folder("folder/on/storage")
    .storage("First Storage")
    .build();
```

</details>

### Result

Description: MAPI message document.

Return type: [**MapiMessageDto**](MapiMessageDto.md)

<details>
    <summary>Result example</summary>

```java
result = Models.mapiMessageDto()
    .messageBody("Some body")
    .clientSubmitTime(Calendar.getInstance().getTime())
    .deliveryTime(Calendar.getInstance().getTime())
    .displayTo("To Address")
    .flags(Arrays.<MapiMessageFlag>asList(
        "MsgFlagRead",
        "MsgFlagUnsent",
        "MsgFlagHasAttach"))
    .normalizedSubject("Some subject")
    .senderAddressType("SMTP")
    .senderEmailAddress("from@aspose.com")
    .senderName("From Address")
    .senderSmtpAddress("from@aspose.com")
    .attachments(Arrays.<MapiAttachmentDto>asList(
        Models.mapiAttachmentDto()
            .name("some-file.txt")
            .dataBase64("U29tZSBmaWxlIHRleHQ=")
            .build()))
    .body("Some body")
    .messageClass("IPM.Note")
    .recipients(Arrays.<MapiRecipientDto>asList(
        Models.mapiRecipientDto()
            .emailAddress("to@aspose.com")
            .addressType("SMTP")
            .displayName("To Address")
            .recipientType("MapiTo")
            .build()))
    .subject("Re: Some subject")
    .subjectPrefix("Re: ")
    .build();
```
</details>

### Complete example

<details>
    <summary>Method call example:</summary>

```java
EmailCloud api = new EmailCloud(appKey, appSid);

// Prepare parameters:
MapiMessageGetRequest request = Models.mapiMessageGetRequest()
    .format("Eml")
    .fileName("email.eml")
    .folder("folder/on/storage")
    .storage("First Storage")
    .build();

// Call method:
MapiMessageDto result = api.mapi().message().get(request);

// Result example:
result = Models.mapiMessageDto()
    .messageBody("Some body")
    .clientSubmitTime(Calendar.getInstance().getTime())
    .deliveryTime(Calendar.getInstance().getTime())
    .displayTo("To Address")
    .flags(Arrays.<MapiMessageFlag>asList(
        "MsgFlagRead",
        "MsgFlagUnsent",
        "MsgFlagHasAttach"))
    .normalizedSubject("Some subject")
    .senderAddressType("SMTP")
    .senderEmailAddress("from@aspose.com")
    .senderName("From Address")
    .senderSmtpAddress("from@aspose.com")
    .attachments(Arrays.<MapiAttachmentDto>asList(
        Models.mapiAttachmentDto()
            .name("some-file.txt")
            .dataBase64("U29tZSBmaWxlIHRleHQ=")
            .build()))
    .body("Some body")
    .messageClass("IPM.Note")
    .recipients(Arrays.<MapiRecipientDto>asList(
        Models.mapiRecipientDto()
            .emailAddress("to@aspose.com")
            .addressType("SMTP")
            .displayName("To Address")
            .recipientType("MapiTo")
            .build()))
    .subject("Re: Some subject")
    .subjectPrefix("Re: ")
    .build();
```

</details>

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

<a name="save"></a>
## save

Description: Save MAPI message to storage.             

Returns: Returns 200 if update is successful.

Method call example:
```java
api.mapi().message().save(request);
```

### Parameter: request

Description: Message create/update request.

See parameter model documentation at [MapiMessageSaveRequest](MapiMessageSaveRequest.md)

<details>
    <summary>Parameter initialization example:</summary>
    
```java
MapiMessageSaveRequest request = Models.mapiMessageSaveRequest()
    .format("Msg")
    .storageFile(Models.storageFileLocation()
        .fileName("message.msg")
        .storage("First Storage")
        .folderPath("file/location/folder/on/storage")
        .build())
    .value(Models.mapiMessageDto()
        .messageBody("Some body")
        .clientSubmitTime(Calendar.getInstance().getTime())
        .deliveryTime(Calendar.getInstance().getTime())
        .displayTo("To Address")
        .flags(Arrays.<MapiMessageFlag>asList(
            "MsgFlagRead",
            "MsgFlagUnsent",
            "MsgFlagHasAttach"))
        .normalizedSubject("Some subject")
        .senderAddressType("SMTP")
        .senderEmailAddress("from@aspose.com")
        .senderName("From Address")
        .senderSmtpAddress("from@aspose.com")
        .attachments(Arrays.<MapiAttachmentDto>asList(
            Models.mapiAttachmentDto()
                .name("some-file.txt")
                .dataBase64("U29tZSBmaWxlIHRleHQ=")
                .build()))
        .body("Some body")
        .messageClass("IPM.Note")
        .recipients(Arrays.<MapiRecipientDto>asList(
            Models.mapiRecipientDto()
                .emailAddress("to@aspose.com")
                .addressType("SMTP")
                .displayName("To Address")
                .recipientType("MapiTo")
                .build()))
        .subject("Re: Some subject")
        .subjectPrefix("Re: ")
        .build())
    .build();
```

</details>


### Result

Description: Returns 200 if update is successful.

Return type: void (empty response body)


### Complete example

<details>
    <summary>Method call example:</summary>

```java
EmailCloud api = new EmailCloud(appKey, appSid);

// Prepare parameters:
MapiMessageSaveRequest request = Models.mapiMessageSaveRequest()
    .format("Msg")
    .storageFile(Models.storageFileLocation()
        .fileName("message.msg")
        .storage("First Storage")
        .folderPath("file/location/folder/on/storage")
        .build())
    .value(Models.mapiMessageDto()
        .messageBody("Some body")
        .clientSubmitTime(Calendar.getInstance().getTime())
        .deliveryTime(Calendar.getInstance().getTime())
        .displayTo("To Address")
        .flags(Arrays.<MapiMessageFlag>asList(
            "MsgFlagRead",
            "MsgFlagUnsent",
            "MsgFlagHasAttach"))
        .normalizedSubject("Some subject")
        .senderAddressType("SMTP")
        .senderEmailAddress("from@aspose.com")
        .senderName("From Address")
        .senderSmtpAddress("from@aspose.com")
        .attachments(Arrays.<MapiAttachmentDto>asList(
            Models.mapiAttachmentDto()
                .name("some-file.txt")
                .dataBase64("U29tZSBmaWxlIHRleHQ=")
                .build()))
        .body("Some body")
        .messageClass("IPM.Note")
        .recipients(Arrays.<MapiRecipientDto>asList(
            Models.mapiRecipientDto()
                .emailAddress("to@aspose.com")
                .addressType("SMTP")
                .displayName("To Address")
                .recipientType("MapiTo")
                .build()))
        .subject("Re: Some subject")
        .subjectPrefix("Re: ")
        .build())
    .build();

// Call method:
api.mapi().message().save(request);
```

</details>

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)
