# PostalAddress

A postal address             

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | **String** | Address.              |  [optional]
**category** | [**EnumWithCustomOfPostalAddressCategory**](EnumWithCustomOfPostalAddressCategory.md) | Address category.              |  [optional]
**city** | **String** | Address&#39;s city.              |  [optional]
**country** | **String** | Address&#39;s country.              |  [optional]
**countryCode** | **String** | Country code.              |  [optional]
**isMailingAddress** | **Boolean** | Defines whether address may be used for mailing.              | 
**postalCode** | **String** | Postal code.              |  [optional]
**postOfficeBox** | **String** | Post Office box.              |  [optional]
**preferred** | **Boolean** | Defines whether postal address is preferred.              | 
**stateOrProvince** | **String** | Address&#39;s region.              |  [optional]
**street** | **String** | Address&#39;s street.              |  [optional]



## Example
```java
PostalAddress postalAddress = Models.postalAddress()
    .address("221b")
    .category(Models.enumWithCustomOfPostalAddressCategory()
        
        .build())
    .city("London")
    .country("United Kingdom")
    .isMailingAddress(true)
    .postalCode("NW1 6XE")
    .preferred(true)
    .street("Baker St")
    .build();
```


[[Back to Model list]](Models.md) [[Back to API README]](README.md)
