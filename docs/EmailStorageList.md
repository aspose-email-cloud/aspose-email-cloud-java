
# EmailStorageList

Email models list with corresponding storage locations.             

## Properties
Class has no properties

## Parent class

See: [ListResponseOfStorageModelOfEmailDto](ListResponseOfStorageModelOfEmailDto.md)


## Example
```java
EmailStorageList emailStorageList = Models.emailStorageList()
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


[[Back to Model list]](Models.md) [[Back to API README]](README.md)

