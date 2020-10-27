# AiNameWeightedVariants

Name variants             

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**names** | [**List&lt;AiNameWeighted&gt;**](AiNameWeighted.md) | List of name variations              |  [optional]
**comments** | **String** | Usually empty; can contain extra message describing some issue occurred during processing              |  [optional]



## Example
```java
AiNameWeightedVariants aiNameWeightedVariants = Models.aiNameWeightedVariants()
    .names(Arrays.<AiNameWeighted>asList(
        Models.aiNameWeighted()
            .name("J. Cane")
            .score(1)
            .build(),
        Models.aiNameWeighted()
            .name("Mr. Cane")
            .score(0.75)
            .build()))
    .build();
```


[[Back to Model list]](Models.md) [[Back to API README]](README.md)
