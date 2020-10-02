# MailMessageDto

Represents email message, stored as an EmailDto object.             

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | [**EmailDto**](EmailDto.md) | Message document object.              | 

## Parent class

See: [MailMessageBase](MailMessageBase.md)


## Example
```java
MailMessageDto mailMessageDto = Models.mailMessageDto()
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


[[Back to Model list]](Models.md) [[Back to API README]](README.md)
