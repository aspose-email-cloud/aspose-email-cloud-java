
# AlternateView

Represents the format to view a message.             

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**baseUri** | **String** | Base URI.              |  [optional]
**linkedResources** | [**List&lt;LinkedResource&gt;**](LinkedResource.md) | Embedded resources referred to by this alternate view.              |  [optional]

## Parent class

See: [AttachmentBase](AttachmentBase.md)


## Example
```java
AlternateView alternateView = Models.alternateView()
    .base64Data("<File content represented as Base64 string>")
    .contentId("fa7a8948-4af1-432a-b4d9-ee0c28542e75")
    .contentType(Models.contentType()
        .charSet("utf-8")
        .mediaType("text/calendar")
        .name("meeting.ics")
        .parameters(Arrays.<ContentTypeParameter>asList(
            Models.contentTypeParameter()
                .name("Method")
                .value("REQUEST")
                .build(),
            Models.contentTypeParameter()
                .name("Name")
                .value("meeting.ics")
                .build(),
            Models.contentTypeParameter()
                .name("charset")
                .value("utf-8")
                .build()))
        .build())
    .build();
```


[[Back to Model list]](Models.md) [[Back to API README]](README.md)

