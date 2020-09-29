# MapiContactApi (EmailCloud.mapi().contact())

MAPI contact operations

<a name="asContactDto"></a>
## asContactDto

Description: Converts MAPI contact model to ContactDto model.             

Returns: Contact model.

Method call example:
```java
ContactDto result = api.mapi().contact().asContactDto(mapiContactDto);
```

### Parameter: mapiContactDto

Description: MAPI contact model to convert.

See parameter model documentation at [MapiContactDto](MapiContactDto.md)

<details>
    <summary>Parameter initialization example:</summary>
    
```java
MapiContactDto mapiContactDto = Models.mapiContactDto()
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


### Result

Description: Contact model.

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
MapiContactDto mapiContactDto = Models.mapiContactDto()
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

// Call method:
ContactDto result = api.mapi().contact().asContactDto(mapiContactDto);

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
<a name="asFile"></a>
## asFile

Description: Converts MAPI contact model to specified format and returns as file.             

Returns: File stream in specified format.

Method call example:
```java
byte[] result = api.mapi().contact().asFile(request);
```

### Parameter: request

Description: MAPI contact model to convert.

See parameter model documentation at [MapiContactAsFileRequest](MapiContactAsFileRequest.md)

<details>
    <summary>Parameter initialization example:</summary>
    
```java
MapiContactAsFileRequest request = Models.mapiContactAsFileRequest()
    .format("Msg")
    .value(Models.mapiContactDto()
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
        .build())
    .build();
```

</details>


### Result

Description: File stream in specified format.

Return type: **byte[]**

<details>
    <summary>Result example</summary>

```java
result = ;
```
</details>

### Complete example

<details>
    <summary>Method call example:</summary>

```java
EmailCloud api = new EmailCloud(appKey, appSid);

// Prepare parameters:
MapiContactAsFileRequest request = Models.mapiContactAsFileRequest()
    .format("Msg")
    .value(Models.mapiContactDto()
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
        .build())
    .build();

// Call method:
byte[] result = api.mapi().contact().asFile(request);

// Result example:
result = ;
```

</details>

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)
<a name="fromFile"></a>
## fromFile

Description: Converts contact file to a MAPI model representation.             

Returns: MAPI model

Method call example:
```java
MapiContactDto result = api.mapi().contact().fromFile(request);
```


### Parameter: request

Description: fromFile method request.

See parameter model documentation at [MapiContactFromFileRequest](MapiContactFromFileRequest.md)

<details>
    <summary>Parameter initialization example:</summary>

```java
MapiContactFromFileRequest request = Models.mapiContactFromFileRequest()
    .format("Msg")
    .file(IOUtils.toByteArray(new FileInputStream("/path/to/contact.msg")))
    .build();
```

</details>

### Result

Description: MAPI model

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
MapiContactFromFileRequest request = Models.mapiContactFromFileRequest()
    .format("Msg")
    .file(IOUtils.toByteArray(new FileInputStream("/path/to/contact.msg")))
    .build();

// Call method:
MapiContactDto result = api.mapi().contact().fromFile(request);

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

<a name="get"></a>
## get

Description: Get MAPI contact document.             

Returns: Contact model.

Method call example:
```java
MapiContactDto result = api.mapi().contact().get(request);
```


### Parameter: request

Description: get method request.

See parameter model documentation at [MapiContactGetRequest](MapiContactGetRequest.md)

<details>
    <summary>Parameter initialization example:</summary>

```java
MapiContactGetRequest request = Models.mapiContactGetRequest()
    .format("VCard")
    .fileName("contact.vcf")
    .folder("folder/on/storage")
    .storage("First Storage")
    .build();
```

</details>

### Result

Description: Contact model.

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
MapiContactGetRequest request = Models.mapiContactGetRequest()
    .format("VCard")
    .fileName("contact.vcf")
    .folder("folder/on/storage")
    .storage("First Storage")
    .build();

// Call method:
MapiContactDto result = api.mapi().contact().get(request);

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

<a name="save"></a>
## save

Description: Save MAPI Contact to storage.             

Returns: Returns 200 if create is successful.

Method call example:
```java
api.mapi().contact().save(request);
```

### Parameter: request

Description: Create/Update contact request.

See parameter model documentation at [MapiContactSaveRequest](MapiContactSaveRequest.md)

<details>
    <summary>Parameter initialization example:</summary>
    
```java
MapiContactSaveRequest request = Models.mapiContactSaveRequest()
    .format("Msg")
    .storageFile(Models.storageFileLocation()
        .fileName("contact.msg")
        .storage("First Storage")
        .folderPath("file/location/folder/on/storage")
        .build())
    .value(Models.mapiContactDto()
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
        .build())
    .build();
```

</details>


### Result

Description: Returns 200 if create is successful.

Return type: void (empty response body)

<details>
    <summary>Result example</summary>

```java
result = ;
```
</details>

### Complete example

<details>
    <summary>Method call example:</summary>

```java
EmailCloud api = new EmailCloud(appKey, appSid);

// Prepare parameters:
MapiContactSaveRequest request = Models.mapiContactSaveRequest()
    .format("Msg")
    .storageFile(Models.storageFileLocation()
        .fileName("contact.msg")
        .storage("First Storage")
        .folderPath("file/location/folder/on/storage")
        .build())
    .value(Models.mapiContactDto()
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
        .build())
    .build();

// Call method:
api.mapi().contact().save(request);
```

</details>

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)
