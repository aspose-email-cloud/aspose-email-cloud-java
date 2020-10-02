# MapiPropertyDto

Mapi property             

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**descriptor** | [**MapiPropertyDescriptor**](MapiPropertyDescriptor.md) | Property descriptor              |  [optional]
**discriminator** | **String** |  | 



## Example
```java
MapiPropertyDto mapiPropertyDto = Models.mapiPropertyDto()
    .descriptor(Models.mapiKnownPropertyDescriptor()
        .name("DisplayName")
        .build())
    .build();
```


[[Back to Model list]](Models.md) [[Back to API README]](README.md)
