
# AiNameMatchResult

Two names match result             

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**similarity** | **Double** | Similarity score              | 
**mismatches** | [**List&lt;AiNameMismatch&gt;**](AiNameMismatch.md) | Detailed description of mismatches              |  [optional]



## Example
```java
AiNameMatchResult aiNameMatchResult = Models.aiNameMatchResult()
    .similarity(0.6)
    .mismatches(Arrays.<AiNameMismatch>asList(
        Models.aiNameMismatch()
            .category("Gender")
            .explanation("no_match")
            .build()))
    .build();
```


[[Back to Model list]](Models.md) [[Back to API README]](README.md)

