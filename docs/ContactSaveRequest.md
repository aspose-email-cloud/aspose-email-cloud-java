# ContactSaveRequest

Contact save to storage request             

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**format** | **String** | Enumerates contact formats. Enum, available values: VCard, WebDav, Msg | 

## Parent class

See: [StorageModelOfContactDto](StorageModelOfContactDto.md)


## Example
```java
ContactSaveRequest contactSaveRequest = Models.contactSaveRequest()
    .storageFile(Models.storageFileLocation()
        .fileName("contact.vcf")
        .storage("First Storage")
        .folderPath("file/location/folder/on/storage")
        .build())
    .value(Models.contactDto()
        .attachments(Arrays.<Attachment>asList(
            Models.attachment()
                .name("attachment.txt")
                .base64Data("U29tZSBmaWxlIGNvbnRlbnQ=")
                .build()))
        .displayName("Alex Thomas")
        .emailAddresses(Arrays.<EmailAddress>asList(
            Models.emailAddress()
                .category(Models.enumWithCustomOfEmailAddressCategory()
                    .value("Custom")
                    .description("Partners")
                    .build())
                .displayName("Alex Thomas Partners")
                .preferred(true)
                .address("email@aspose.com")
                .build()))
        .gender("Male")
        .givenName("Alex")
        .phoneNumbers(Arrays.<PhoneNumber>asList(
            Models.phoneNumber()
                .category(Models.enumWithCustomOfPhoneNumberCategory()
                    .value("Office")
                    .build())
                .number("+49 211 4247 21")
                .preferred(true)
                .build()))
        .profession("GENERAL DIRECTOR")
        .surname("Thomas")
        .urls(Arrays.<Url>asList(
            Models.url()
                .category(Models.enumWithCustomOfUrlCategory()
                    .value("Work")
                    .build())
                .preferred(true)
                .href("www.aspose.com")
                .build()))
        .build())
    .build();
```


[[Back to Model list]](Models.md) [[Back to API README]](README.md)
