# AiNameMismatch

Names mismatch detailed description             

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**category** | **String** | Mismatch type. Enum, available values: Unknown, FirstName, MiddleName, MiddleLastName, MiddleNickname, Gender, Context | 
**similarity** | **Double** | Similarity score              | 
**explanation** | **String** | Explanation or mismatch subtype              |  [optional]



## Example
```java
AiNameMismatch aiNameMismatch = Models.aiNameMismatch()
    .category("Gender")
    .explanation("no_match")
    .build();
```


[[Back to Model list]](Models.md) [[Back to API README]](README.md)
