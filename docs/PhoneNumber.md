# PhoneNumber

A phone number.             

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**category** | [**EnumWithCustomOfPhoneNumberCategory**](EnumWithCustomOfPhoneNumberCategory.md) | Phone number category.              |  [optional]
**number** | **String** | Phone number.              |  [optional]
**preferred** | **Boolean** | Defines whether phone number is preferred.              | 



## Example
```java
PhoneNumber phoneNumber = Models.phoneNumber()
    .category(Models.enumWithCustomOfPhoneNumberCategory()
        .value("Company")
        .build())
    .number("+44 141 628 8900")
    .preferred(true)
    .build();
```


[[Back to Model list]](Models.md) [[Back to API README]](README.md)
