# MapiResponseTypePropertyDto

Mapi property with response type value             

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **String** | Represents the types of recipient responses that are received for a meeting. Enum, available values: Unknown, Organizer, Tentative, Accept, Decline, NoResponseReceived | 

## Parent class

See: [MapiPropertyDto](MapiPropertyDto.md)


## Example
```java
MapiResponseTypePropertyDto mapiResponseTypePropertyDto = Models.mapiResponseTypePropertyDto()
    .value("Accept")
    .descriptor(Models.mapiKnownPropertyDescriptor()
        .name("ResponseStatus")
        .build())
    .build();
```


[[Back to Model list]](Models.md) [[Back to API README]](README.md)
