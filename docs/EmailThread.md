# EmailThread

Email messages thread             

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Thread identifier              |  [optional]
**subject** | **String** | Thread subject              |  [optional]
**messages** | [**List&lt;EmailDto&gt;**](EmailDto.md) | List of messages in thread              |  [optional]
**folder** | **String** | Thread folder location              |  [optional]



## Example
```java
EmailThread emailThread = Models.emailThread()
    .id("5")
    .subject("Some subject")
    .messages(Arrays.<EmailDto>asList(
        Models.emailDto()
            .attachments(Arrays.<Attachment>asList(
                Models.attachment()
                    .name("some-file.txt")
                    .base64Data("U29tZSBmaWxlIGNvbnRlbnQ=")
                    .build()))
            .body("Some body")
            .bodyType("Html")
            .date(Calendar.getInstance().getTime())
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
            .build(),
        Models.emailDto()
            .attachments(Arrays.<Attachment>asList(
                Models.attachment()
                    .name("some-file.txt")
                    .base64Data("U29tZSBmaWxlIGNvbnRlbnQ=")
                    .build()))
            .body("Other body")
            .bodyType("Html")
            .date(Calendar.getInstance().getTime())
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
            .build()))
    .build();
```


[[Back to Model list]](Models.md) [[Back to API README]](README.md)
