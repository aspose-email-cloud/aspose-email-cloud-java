# AiNameMatchParsedRequest

Two parsed names to match request             

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**otherParsedName** | [**List&lt;AiNameComponent&gt;**](AiNameComponent.md) | Other parsed name to match              | 

## Parent class

See: [AiNameParsedRequest](AiNameParsedRequest.md)


## Example
```java
AiNameMatchParsedRequest aiNameMatchParsedRequest = Models.aiNameMatchParsedRequest()
    .otherParsedName(Arrays.<AiNameComponent>asList(
        Models.aiNameComponent()
            .value("J")
            .category("FirstInitial")
            .score(1)
            .build(),
        Models.aiNameComponent()
            .value("Cane")
            .category("LastName")
            .score(0.5)
            .position(3)
            .build(),
        Models.aiNameComponent()
            .value("%f%L")
            .category("Format")
            .build(),
        Models.aiNameComponent()
            .value("0.5")
            .category("Score")
            .score(0.5)
            .build()))
    .parsedName(Arrays.<AiNameComponent>asList(
        Models.aiNameComponent()
            .value("John")
            .category("FirstName")
            .score(0.95)
            .build(),
        Models.aiNameComponent()
            .value("Cane")
            .category("LastName")
            .score(0.5)
            .position(5)
            .build(),
        Models.aiNameComponent()
            .value("%F%L")
            .category("Format")
            .build(),
        Models.aiNameComponent()
            .value("0.5")
            .category("Score")
            .score(0.5)
            .build()))
    .build();
```


[[Back to Model list]](Models.md) [[Back to API README]](README.md)
