
# MapiStringPropertyDto

Mapi property with string value             

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **String** | Property value              |  [optional]

## Parent class

See: [MapiPropertyDto](MapiPropertyDto.md)


## Example
```java
MapiStringPropertyDto mapiStringPropertyDto = Models.mapiStringPropertyDto()
    .value("SomeName")
    .descriptor(Models.mapiKnownPropertyDescriptor()
        .name("DisplayName")
        .build())
    .build();
```


[[Back to Model list]](Models.md) [[Back to API README]](README.md)

