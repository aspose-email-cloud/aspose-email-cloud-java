
# AiNameGenderHypothesis

Name gender hypothesis             

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**gender** | **String** | Recognized name gender. Enum, available values: Male, Female, Unknown | 
**score** | **Double** | Hypothesis score              | 



## Example
```java
AiNameGenderHypothesis aiNameGenderHypothesis = Models.aiNameGenderHypothesis()
    .score(0.8)
    .build();
```


[[Back to Model list]](Models.md) [[Back to API README]](README.md)

