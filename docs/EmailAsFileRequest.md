
# EmailAsFileRequest

Convert email model to file request.             

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**format** | **String** | Email document format. Enum, available values: Eml, Msg, MsgUnicode, Mhtml, Html, Tnef, Oft | 
**value** | [**EmailDto**](EmailDto.md) | Email model.              | 



## Example
```java
EmailAsFileRequest emailAsFileRequest = Models.emailAsFileRequest()
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

