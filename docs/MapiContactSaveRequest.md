
# MapiContactSaveRequest

MapiContact save to storage request.             

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**format** | **String** | Enumerates contact formats. Enum, available values: VCard, WebDav, Msg | 

## Parent class

See: [StorageModelOfMapiContactDto](StorageModelOfMapiContactDto.md)


## Example
```java
MapiContactSaveRequest mapiContactSaveRequest = Models.mapiContactSaveRequest()
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


[[Back to Model list]](Models.md) [[Back to API README]](README.md)

