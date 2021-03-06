# MapiContactDto

Represents outlook contact information.             

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**electronicAddresses** | [**MapiContactElectronicAddressPropertySetDto**](MapiContactElectronicAddressPropertySetDto.md) | Specify properties for up to three different e-mail addresses and three different fax addresses.              |  [optional]
**events** | [**MapiContactEventPropertySetDto**](MapiContactEventPropertySetDto.md) | Specify events associated with a contact.              |  [optional]
**nameInfo** | [**MapiContactNamePropertySetDto**](MapiContactNamePropertySetDto.md) | The properties are used to specify the name of the person represented by the contact.              |  [optional]
**otherFields** | [**MapiContactOtherPropertySetDto**](MapiContactOtherPropertySetDto.md) | Specify other fields of contact.              |  [optional]
**personalInfo** | [**MapiContactPersonalInfoPropertySetDto**](MapiContactPersonalInfoPropertySetDto.md) | Specify other additional contact information.              |  [optional]
**photo** | [**MapiContactPhotoDto**](MapiContactPhotoDto.md) | Contact photo.              |  [optional]
**physicalAddresses** | [**MapiContactPhysicalAddressPropertySetDto**](MapiContactPhysicalAddressPropertySetDto.md) | Specify three physical addresses: Home Address, Work Address, and Other Address. One of the addresses can be marked as the Mailing Address.              |  [optional]
**professionalInfo** | [**MapiContactProfessionalPropertySetDto**](MapiContactProfessionalPropertySetDto.md) | Properties are used to store professional details for the person represented by the contact.              |  [optional]
**telephones** | [**MapiContactTelephonePropertySetDto**](MapiContactTelephonePropertySetDto.md) | Specify telephone numbers for the contact.              |  [optional]

## Parent class

See: [MapiMessageItemBaseDto](MapiMessageItemBaseDto.md)


## Example
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


[[Back to Model list]](Models.md) [[Back to API README]](README.md)
