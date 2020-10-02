# AiNameFormatted

Formatted name             

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Formatted name value              |  [optional]
**comments** | **String** | Usually empty; can contain extra message describing some issue occurred during the formatting              |  [optional]



## Example
```java
AiNameFormatted aiNameFormatted = Models.aiNameFormatted()
    .name("Mr. Cane J. M.")
    .comments("format: %t%L%f%m; source: parsed format")
    .build();
```


[[Back to Model list]](Models.md) [[Back to API README]](README.md)
