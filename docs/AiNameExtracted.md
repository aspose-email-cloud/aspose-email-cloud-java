# AiNameExtracted

Extracted name             

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | [**List&lt;AiNameExtractedComponent&gt;**](AiNameExtractedComponent.md) | Extracted name components              |  [optional]
**score** | **Double** | Extracted name score              | 



## Example
```java
AiNameExtracted aiNameExtracted = Models.aiNameExtracted()
    .name(Arrays.<AiNameExtractedComponent>asList(
        Models.aiNameExtractedComponent()
            .category("Surname")
            .value("Cane")
            .build(),
        Models.aiNameExtractedComponent()
            .category("SomeName")
            .value("John")
            .build()))
    .score(0.5)
    .build();
```


[[Back to Model list]](Models.md) [[Back to API README]](README.md)
