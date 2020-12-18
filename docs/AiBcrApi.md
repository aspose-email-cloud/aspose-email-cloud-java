# AiBcrApi (EmailCloud.ai().bcr())

AI Business card recognition operations.

<a name="parse"></a>
## parse

Description: Parse images to vCard document models             

Returns: List of vCards

Method call example:
```java
ContactList result = api.ai().bcr().parse(request);
```


### Parameter: request

Description: parse method request.

See parameter model documentation at [AiBcrParseRequest](AiBcrParseRequest.md).

<details>
    <summary>Parameter initialization example:</summary>

```java
AiBcrParseRequest request = Models.aiBcrParseRequest()
    .file(IOUtils.toByteArray(new FileInputStream("/path/to/image.png")))
    .countries("us")
    .languages("en")
    .isSingle(true)
    .build();
```

</details>

### Result

Description: List of vCards

Return type: [**ContactList**](ContactList.md)

<details>
    <summary>Result example</summary>

```java
result = Models.contactList()
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
            .build()))
    .build();
```
</details>

### Complete example

<details>
    <summary>Method call example:</summary>

```java
EmailCloud api = new EmailCloud(clientSecret, clientId);

// Prepare parameters:
AiBcrParseRequest request = Models.aiBcrParseRequest()
    .file(IOUtils.toByteArray(new FileInputStream("/path/to/image.png")))
    .countries("us")
    .languages("en")
    .isSingle(true)
    .build();

// Call method:
ContactList result = api.ai().bcr().parse(request);

// Result example:
result = Models.contactList()
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
            .build()))
    .build();

```

</details>

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

<a name="parseStorage"></a>
## parseStorage

Description: Parse images from storage to vCard files             

Returns: List of vCard files located on storage

Method call example:
```java
StorageFileLocationList result = api.ai().bcr().parseStorage(request);
```

### Parameter: request

Description: Request with images located on storage

See parameter model documentation at [AiBcrParseStorageRequest](AiBcrParseStorageRequest.md)

<details>
    <summary>Parameter initialization example:</summary>
    
```java
AiBcrParseStorageRequest request = Models.aiBcrParseStorageRequest()
    .outFolder(Models.storageFolderLocation()
        .storage("First Storage")
        .folderPath("VCard/files/produced/by/parser/will/be/placed/here")
        .build())
    .images(Arrays.<AiBcrImageStorageFile>asList(
        Models.aiBcrImageStorageFile()
            .file(Models.storageFileLocation()
                .fileName("VCardScanImage.jpg")
                .storage("First Storage")
                .folderPath("image/location/on/storage")
                .build())
            .isSingle(true)
            .build()))
    .build();
```

</details>


### Result

Description: List of vCard files located on storage

Return type: [**StorageFileLocationList**](StorageFileLocationList.md)

<details>
    <summary>Result example</summary>

```java
result = Models.storageFileLocationList()
    .value(Arrays.<StorageFileLocation>asList(
        Models.storageFileLocation()
            .fileName("fileOnStorage.txt")
            .storage("First Storage")
            .folderPath("file/location/folder/on/storage")
            .build()))
    .build();
```
</details>

### Complete example

<details>
    <summary>Method call example:</summary>

```java
EmailCloud api = new EmailCloud(clientSecret, clientId);

// Prepare parameters:
AiBcrParseStorageRequest request = Models.aiBcrParseStorageRequest()
    .outFolder(Models.storageFolderLocation()
        .storage("First Storage")
        .folderPath("VCard/files/produced/by/parser/will/be/placed/here")
        .build())
    .images(Arrays.<AiBcrImageStorageFile>asList(
        Models.aiBcrImageStorageFile()
            .file(Models.storageFileLocation()
                .fileName("VCardScanImage.jpg")
                .storage("First Storage")
                .folderPath("image/location/on/storage")
                .build())
            .isSingle(true)
            .build()))
    .build();

// Call method:
StorageFileLocationList result = api.ai().bcr().parseStorage(request);

// Result example:
result = Models.storageFileLocationList()
    .value(Arrays.<StorageFileLocation>asList(
        Models.storageFileLocation()
            .fileName("fileOnStorage.txt")
            .storage("First Storage")
            .folderPath("file/location/folder/on/storage")
            .build()))
    .build();
```

</details>

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)
