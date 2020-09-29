
# MapiMessageAsFileRequest

Convert MapiMessage to file request.             

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**format** | **String** | Email document format. Enum, available values: Eml, Msg, MsgUnicode, Mhtml, Html, Tnef, Oft | 
**value** | [**MapiMessageDto**](MapiMessageDto.md) | MAPI message model.              | 



## Example
```java
MapiMessageAsFileRequest mapiMessageAsFileRequest = Models.mapiMessageAsFileRequest()
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


[[Back to Model list]](Models.md) [[Back to API README]](README.md)

