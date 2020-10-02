# ContactList

List of VCard documents             

## Properties
Class has no properties

## Parent class

See: [ListResponseOfContactDto](ListResponseOfContactDto.md)


## Example
```java
ContactList contactList = Models.contactList()
    .value(Arrays.<ContactDto>asList(
        Models.contactDto()
            .attachments(Arrays.<Attachment>asList(
                Models.attachment()
                    .name("attachment.txt")
                    .base64Data("U29tZSBmaWxlIGNvbnRlbnQ=")
                    .build()))
            .displayName("Alex Thomas")
            .emailAddresses(Arrays.<EmailAddress>asList(
                Models.emailAddress()
                    .category(Models.enumWithCustom<EmailAddressCategory>()
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
                    .category(Models.enumWithCustom<PhoneNumberCategory>()
                        .value("Office")
                        .build())
                    .number("+49 211 4247 21")
                    .preferred(true)
                    .build()))
            .profession("GENERAL DIRECTOR")
            .surname("Thomas")
            .urls(Arrays.<Url>asList(
                Models.url()
                    .category(Models.enumWithCustom<UrlCategory>()
                        .value("Work")
                        .build())
                    .preferred(true)
                    .href("www.aspose.com")
                    .build()))
            .build()))
    .build();
```


[[Back to Model list]](Models.md) [[Back to API README]](README.md)
