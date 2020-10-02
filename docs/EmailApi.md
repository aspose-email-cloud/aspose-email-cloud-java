# EmailApi (EmailCloud.email())

Email document (*.eml) operations.

<a name="asFile"></a>
## asFile

Description: Converts Email model to specified format and returns as file.             

Returns: File stream in specified format.

Method call example:
```java
byte[] result = api.email().asFile(request);
```

### Parameter: request

Description: Email model and format to convert.

See parameter model documentation at [EmailAsFileRequest](EmailAsFileRequest.md)

<details>
    <summary>Parameter initialization example:</summary>
    
```java
EmailAsFileRequest request = Models.emailAsFileRequest()
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
EmailAsFileRequest request = Models.emailAsFileRequest()
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
    .build();

// Call method:
byte[] result = api.email().asFile(request);
```

</details>

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)
<a name="asMapi"></a>
## asMapi

Description: Converts EmailDto to MapiMessageDto.             

Returns: MAPI model message representation

Method call example:
```java
MapiMessageDto result = api.email().asMapi(emailDto);
```

### Parameter: emailDto

Description: Email model to convert

See parameter model documentation at [EmailDto](EmailDto.md)

<details>
    <summary>Parameter initialization example:</summary>
    
```java
EmailDto emailDto = Models.emailDto()
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


### Result

Description: MAPI model message representation

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
EmailDto emailDto = Models.emailDto()
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

// Call method:
MapiMessageDto result = api.email().asMapi(emailDto);

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
<a name="convert"></a>
## convert

Description: Converts email document to specified format and returns as file             

Returns: File stream in specified format

Method call example:
```java
byte[] result = api.email().convert(request);
```


### Parameter: request

Description: convert method request.

See parameter model documentation at [EmailConvertRequest](EmailConvertRequest.md).

<details>
    <summary>Parameter initialization example:</summary>

```java
EmailConvertRequest request = Models.emailConvertRequest()
    .fromFormat("Msg")
    .toFormat("Mhtml")
    .file(IOUtils.toByteArray(new FileInputStream("/path/to/message.msg")))
    .build();
```

</details>

### Result

Description: File stream in specified format

Return type: **byte[]**

### Complete example

<details>
    <summary>Method call example:</summary>

```java
EmailCloud api = new EmailCloud(appKey, appSid);

// Prepare parameters:
EmailConvertRequest request = Models.emailConvertRequest()
    .fromFormat("Msg")
    .toFormat("Mhtml")
    .file(IOUtils.toByteArray(new FileInputStream("/path/to/message.msg")))
    .build();

// Call method:
byte[] result = api.email().convert(request);
```

</details>

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

<a name="fromFile"></a>
## fromFile

Description: Converts email document to a model representation             

Returns: Email document model

Method call example:
```java
EmailDto result = api.email().fromFile(request);
```


### Parameter: request

Description: fromFile method request.

See parameter model documentation at [EmailFromFileRequest](EmailFromFileRequest.md).

<details>
    <summary>Parameter initialization example:</summary>

```java
EmailFromFileRequest request = Models.emailFromFileRequest()
    .format("Eml")
    .file(IOUtils.toByteArray(new FileInputStream("/path/to/message.eml")))
    .build();
```

</details>

### Result

Description: Email document model

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
EmailFromFileRequest request = Models.emailFromFileRequest()
    .format("Eml")
    .file(IOUtils.toByteArray(new FileInputStream("/path/to/message.eml")))
    .build();

// Call method:
EmailDto result = api.email().fromFile(request);

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

<a name="get"></a>
## get

Description: Get email document from storage.             

Returns: Email document.

Method call example:
```java
EmailDto result = api.email().get(request);
```


### Parameter: request

Description: get method request.

See parameter model documentation at [EmailGetRequest](EmailGetRequest.md).

<details>
    <summary>Parameter initialization example:</summary>

```java
EmailGetRequest request = Models.emailGetRequest()
    .format("Eml")
    .fileName("email.eml")
    .folder("folder/on/storage")
    .storage("First Storage")
    .build();
```

</details>

### Result

Description: Email document.

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
EmailGetRequest request = Models.emailGetRequest()
    .format("Eml")
    .fileName("email.eml")
    .folder("folder/on/storage")
    .storage("First Storage")
    .build();

// Call method:
EmailDto result = api.email().get(request);

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

<a name="getAsFile"></a>
## getAsFile

Description: Converts email document from storage to specified format and returns as file             

Returns: File stream in specified format

Method call example:
```java
byte[] result = api.email().getAsFile(request);
```


### Parameter: request

Description: getAsFile method request.

See parameter model documentation at [EmailGetAsFileRequest](EmailGetAsFileRequest.md).

<details>
    <summary>Parameter initialization example:</summary>

```java
EmailGetAsFileRequest request = Models.emailGetAsFileRequest()
    .fileName("email.eml")
    .format("Mhtml")
    .storage("First Storage")
    .folder("folder/on/storage")
    .build();
```

</details>

### Result

Description: File stream in specified format

Return type: **byte[]**

### Complete example

<details>
    <summary>Method call example:</summary>

```java
EmailCloud api = new EmailCloud(appKey, appSid);

// Prepare parameters:
EmailGetAsFileRequest request = Models.emailGetAsFileRequest()
    .fileName("email.eml")
    .format("Mhtml")
    .storage("First Storage")
    .folder("folder/on/storage")
    .build();

// Call method:
byte[] result = api.email().getAsFile(request);
```

</details>

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

<a name="getList"></a>
## getList

Description: Get email list from storage folder.             

Returns: Email document list.

Method call example:
```java
EmailStorageList result = api.email().getList(request);
```


### Parameter: request

Description: getList method request.

See parameter model documentation at [EmailGetListRequest](EmailGetListRequest.md).

<details>
    <summary>Parameter initialization example:</summary>

```java
EmailGetListRequest request = Models.emailGetListRequest()
    .format("Eml")
    .folder("folder/on/storage")
    .storage("First Storage")
    .itemsPerPage(10)
    .pageNumber(0)
    .build();
```

</details>

### Result

Description: Email document list.

Return type: [**EmailStorageList**](EmailStorageList.md)

<details>
    <summary>Result example</summary>

```java
result = Models.emailStorageList()
    .value(Arrays.<StorageModel<EmailDto>>asList(
        Models.emailSaveRequest()
            .storageFile(Models.storageFileLocation()
                .fileName("message.eml")
                .storage("First Storage")
                .folderPath("file/location/folder/on/storage")
                .build())
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
EmailGetListRequest request = Models.emailGetListRequest()
    .format("Eml")
    .folder("folder/on/storage")
    .storage("First Storage")
    .itemsPerPage(10)
    .pageNumber(0)
    .build();

// Call method:
EmailStorageList result = api.email().getList(request);

// Result example:
result = Models.emailStorageList()
    .value(Arrays.<StorageModel<EmailDto>>asList(
        Models.emailSaveRequest()
            .storageFile(Models.storageFileLocation()
                .fileName("message.eml")
                .storage("First Storage")
                .folderPath("file/location/folder/on/storage")
                .build())
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
            .build()))
    .build();
```

</details>

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

<a name="save"></a>
## save

Description: Save email document to storage.             


Method call example:
```java
api.email().save(request);
```

### Parameter: request

Description: Email document create/update request.

See parameter model documentation at [EmailSaveRequest](EmailSaveRequest.md)

<details>
    <summary>Parameter initialization example:</summary>
    
```java
EmailSaveRequest request = Models.emailSaveRequest()
    .format("Msg")
    .storageFile(Models.storageFileLocation()
        .fileName("email.eml")
        .storage("First Storage")
        .folderPath("file/location/folder/on/storage")
        .build())
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
EmailSaveRequest request = Models.emailSaveRequest()
    .format("Msg")
    .storageFile(Models.storageFileLocation()
        .fileName("email.eml")
        .storage("First Storage")
        .folderPath("file/location/folder/on/storage")
        .build())
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
    .build();

// Call method:
api.email().save(request);
```

</details>

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)
