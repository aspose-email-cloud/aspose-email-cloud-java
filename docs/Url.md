
# Url

Url and its category.             

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**category** | [**EnumWithCustomOfUrlCategory**](EnumWithCustomOfUrlCategory.md) | Url category.              |  [optional]
**preferred** | **Boolean** | Defines whether url is preferred.              | 
**href** | **String** | URL.              |  [optional]



## Example
```java
Url url = Models.url()
    .category(Models.enumWithCustom<UrlCategory>()
        .value("Work")
        .build())
    .preferred(true)
    .href("https://products.aspose.cloud/email")
    .build();
```


[[Back to Model list]](Models.md) [[Back to API README]](README.md)

