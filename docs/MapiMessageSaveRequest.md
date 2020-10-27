# MapiMessageSaveRequest

MapiMessage save to storage request.             

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**format** | **String** | Email document format. Enum, available values: Eml, Msg, MsgUnicode, Mhtml, Html, Tnef, Oft | 

## Parent class

See: [StorageModelOfMapiMessageDto](StorageModelOfMapiMessageDto.md)


## Example
```java
MapiMessageSaveRequest mapiMessageSaveRequest = Models.mapiMessageSaveRequest()
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


[[Back to Model list]](Models.md) [[Back to API README]](README.md)
