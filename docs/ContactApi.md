# ContactApi (EmailCloud.contact())

Contact document operations. Supported formats: VCard, MSG, WebDav

<a name="asFile"></a>
## asFile

Description: Converts contact model to specified format and returns as file             

Returns: File stream in specified format

Method call example:
```java
byte[] result = api.contact().asFile(request);
```

### Parameter: request

Description: Contact model and format to convert

See parameter model documentation at [ContactAsFileRequest](ContactAsFileRequest.md)

<details>
    <summary>Parameter initialization example:</summary>
    
```java
ContactAsFileRequest request = Models.contactAsFileRequest()
    .value(Models.contactDto()
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
        .build())
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
ContactAsFileRequest request = Models.contactAsFileRequest()
    .value(Models.contactDto()
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
        .build())
    .build();

// Call method:
byte[] result = api.contact().asFile(request);
```

</details>

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)
<a name="asMapi"></a>
## asMapi

Description: Converts ContactDto to MapiContactDto.             

Returns: MAPI model contact representation

Method call example:
```java
MapiContactDto result = api.contact().asMapi(contactDto);
```

### Parameter: contactDto

Description: Contact model to convert

See parameter model documentation at [ContactDto](ContactDto.md)

<details>
    <summary>Parameter initialization example:</summary>
    
```java
ContactDto contactDto = Models.contactDto()
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
    .build();
```

</details>


### Result

Description: MAPI model contact representation

Return type: [**MapiContactDto**](MapiContactDto.md)

<details>
    <summary>Result example</summary>

```java
result = Models.mapiContactDto()
    .electronicAddresses(Models.mapiContactElectronicAddressPropertySetDto()
        .defaultEmailAddress(Models.mapiContactElectronicAddressDto()
            .emailAddress("email@aspose.com")
            .build())
        .build())
    .nameInfo(Models.mapiContactNamePropertySetDto()
        .givenName("Alex")
        .surname("Thomas")
        .build())
    .personalInfo(Models.mapiContactPersonalInfoPropertySetDto()
        .businessHomePage("www.aspose.com")
        .build())
    .professionalInfo(Models.mapiContactProfessionalPropertySetDto()
        .profession("GENERAL DIRECTOR")
        .build())
    .telephones(Models.mapiContactTelephonePropertySetDto()
        .primaryTelephoneNumber("+49 211 4247 21")
        .build())
    .build();
```
</details>

### Complete example

<details>
    <summary>Method call example:</summary>

```java
EmailCloud api = new EmailCloud(appKey, appSid);

// Prepare parameters:
ContactDto contactDto = Models.contactDto()
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
    .build();

// Call method:
MapiContactDto result = api.contact().asMapi(contactDto);

// Result example:
result = Models.mapiContactDto()
    .electronicAddresses(Models.mapiContactElectronicAddressPropertySetDto()
        .defaultEmailAddress(Models.mapiContactElectronicAddressDto()
            .emailAddress("email@aspose.com")
            .build())
        .build())
    .nameInfo(Models.mapiContactNamePropertySetDto()
        .givenName("Alex")
        .surname("Thomas")
        .build())
    .personalInfo(Models.mapiContactPersonalInfoPropertySetDto()
        .businessHomePage("www.aspose.com")
        .build())
    .professionalInfo(Models.mapiContactProfessionalPropertySetDto()
        .profession("GENERAL DIRECTOR")
        .build())
    .telephones(Models.mapiContactTelephonePropertySetDto()
        .primaryTelephoneNumber("+49 211 4247 21")
        .build())
    .build();
```

</details>

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)
<a name="convert"></a>
## convert

Description: Converts contact document to specified format and returns as file             

Returns: File stream in specified destination format

Method call example:
```java
byte[] result = api.contact().convert(request);
```


### Parameter: request

Description: convert method request.

See parameter model documentation at [ContactConvertRequest](ContactConvertRequest.md)

<details>
    <summary>Parameter initialization example:</summary>

```java
ContactConvertRequest request = Models.contactConvertRequest()
    .toFormat("VCard")
    .fromFormat("Msg")
    .file(IOUtils.toByteArray(new FileInputStream("/path/to/contact.msg")))
    .build();
```

</details>

### Result

Description: File stream in specified destination format

Return type: **byte[]**

### Complete example

<details>
    <summary>Method call example:</summary>

```java
EmailCloud api = new EmailCloud(appKey, appSid);

// Prepare parameters:
ContactConvertRequest request = Models.contactConvertRequest()
    .toFormat("VCard")
    .fromFormat("Msg")
    .file(IOUtils.toByteArray(new FileInputStream("/path/to/contact.msg")))
    .build();

// Call method:
byte[] result = api.contact().convert(request);
```

</details>

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

<a name="fromFile"></a>
## fromFile

Description: Converts contact document to a model representation             

Returns: Contact model

Method call example:
```java
ContactDto result = api.contact().fromFile(request);
```


### Parameter: request

Description: fromFile method request.

See parameter model documentation at [ContactFromFileRequest](ContactFromFileRequest.md)

<details>
    <summary>Parameter initialization example:</summary>

```java
ContactFromFileRequest request = Models.contactFromFileRequest()
    .format("Msg")
    .file(IOUtils.toByteArray(new FileInputStream("/path/to/contact.msg")))
    .build();
```

</details>

### Result

Description: Contact model

Return type: [**ContactDto**](ContactDto.md)

<details>
    <summary>Result example</summary>

```java
result = Models.contactDto()
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
    .build();
```
</details>

### Complete example

<details>
    <summary>Method call example:</summary>

```java
EmailCloud api = new EmailCloud(appKey, appSid);

// Prepare parameters:
ContactFromFileRequest request = Models.contactFromFileRequest()
    .format("Msg")
    .file(IOUtils.toByteArray(new FileInputStream("/path/to/contact.msg")))
    .build();

// Call method:
ContactDto result = api.contact().fromFile(request);

// Result example:
result = Models.contactDto()
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
    .build();
```

</details>

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

<a name="get"></a>
## get

Description: Get contact document from storage.             

Returns: Contact document.

Method call example:
```java
ContactDto result = api.contact().get(request);
```


### Parameter: request

Description: get method request.

See parameter model documentation at [ContactGetRequest](ContactGetRequest.md)

<details>
    <summary>Parameter initialization example:</summary>

```java
ContactGetRequest request = Models.contactGetRequest()
    .format("VCard")
    .fileName("contact.vcf")
    .folder("folder/on/storage")
    .storage("First Storage")
    .build();
```

</details>

### Result

Description: Contact document.

Return type: [**ContactDto**](ContactDto.md)

<details>
    <summary>Result example</summary>

```java
result = Models.contactDto()
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
    .build();
```
</details>

### Complete example

<details>
    <summary>Method call example:</summary>

```java
EmailCloud api = new EmailCloud(appKey, appSid);

// Prepare parameters:
ContactGetRequest request = Models.contactGetRequest()
    .format("VCard")
    .fileName("contact.vcf")
    .folder("folder/on/storage")
    .storage("First Storage")
    .build();

// Call method:
ContactDto result = api.contact().get(request);

// Result example:
result = Models.contactDto()
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
    .build();
```

</details>

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

<a name="getAsFile"></a>
## getAsFile

Description: Converts contact document from storage to specified format and returns as file             

Returns: File stream in specified format

Method call example:
```java
byte[] result = api.contact().getAsFile(request);
```


### Parameter: request

Description: getAsFile method request.

See parameter model documentation at [ContactGetAsFileRequest](ContactGetAsFileRequest.md)

<details>
    <summary>Parameter initialization example:</summary>

```java
ContactGetAsFileRequest request = Models.contactGetAsFileRequest()
    .fileName("contact.msg")
    .toFormat("VCard")
    .fromFormat("Msg")
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
ContactGetAsFileRequest request = Models.contactGetAsFileRequest()
    .fileName("contact.msg")
    .toFormat("VCard")
    .fromFormat("Msg")
    .storage("First Storage")
    .folder("folder/on/storage")
    .build();

// Call method:
byte[] result = api.contact().getAsFile(request);
```

</details>

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

<a name="getList"></a>
## getList

Description: Get contact list from storage folder.             

Returns: Contact list.

Method call example:
```java
ContactStorageList result = api.contact().getList(request);
```


### Parameter: request

Description: getList method request.

See parameter model documentation at [ContactGetListRequest](ContactGetListRequest.md)

<details>
    <summary>Parameter initialization example:</summary>

```java
ContactGetListRequest request = Models.contactGetListRequest()
    .format("VCard")
    .folder("folder/on/storage")
    .storage("First Storage")
    .itemsPerPage(10)
    .pageNumber(0)
    .build();
```

</details>

### Result

Description: Contact list.

Return type: [**ContactStorageList**](ContactStorageList.md)

<details>
    <summary>Result example</summary>

```java
result = Models.contactStorageList()
    .value(Arrays.<StorageModel<ContactDto>>asList(
        Models.storageModel<ContactDto>()
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
ContactGetListRequest request = Models.contactGetListRequest()
    .format("VCard")
    .folder("folder/on/storage")
    .storage("First Storage")
    .itemsPerPage(10)
    .pageNumber(0)
    .build();

// Call method:
ContactStorageList result = api.contact().getList(request);

// Result example:
result = Models.contactStorageList()
    .value(Arrays.<StorageModel<ContactDto>>asList(
        Models.storageModel<ContactDto>()
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
                .build())
            .build()))
    .build();
```

</details>

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

<a name="save"></a>
## save

Description: Save contact to storage.             


Method call example:
```java
api.contact().save(request);
```

### Parameter: request

Description: Create/Update contact request.

See parameter model documentation at [ContactSaveRequest](ContactSaveRequest.md)

<details>
    <summary>Parameter initialization example:</summary>
    
```java
ContactSaveRequest request = Models.contactSaveRequest()
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
ContactSaveRequest request = Models.contactSaveRequest()
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
        .build())
    .build();

// Call method:
api.contact().save(request);
```

</details>

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)
