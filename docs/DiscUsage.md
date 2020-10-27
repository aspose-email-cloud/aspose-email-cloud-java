# DiscUsage

Class for disc space information.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**usedSize** | **Long** | Application used disc space. | 
**totalSize** | **Long** | Total disc space. | 



## Example
```java
DiscUsage discUsage = Models.discUsage()
    .usedSize(1048576)
    .totalSize(3145728)
    .build();
```


[[Back to Model list]](Models.md) [[Back to API README]](README.md)
