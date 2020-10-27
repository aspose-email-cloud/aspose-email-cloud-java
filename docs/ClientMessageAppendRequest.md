# ClientMessageAppendRequest

Email client append message request.             

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**folder** | **String** | Path to folder on email server to append message to.              |  [optional]
**message** | [**MailMessageBase**](MailMessageBase.md) | Message to append.              | 
**markAsSent** | **Boolean** | Determines that appended message should be market as sent or not.              | 

## Parent class

See: [ClientAccountBaseRequest](ClientAccountBaseRequest.md)


## Example
```java
ClientMessageAppendRequest clientMessageAppendRequest = Models.clientMessageAppendRequest()
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


[[Back to Model list]](Models.md) [[Back to API README]](README.md)
