# AiNameComponentList

List of name components             

## Properties
Class has no properties

## Parent class

See: [ListResponseOfAiNameComponent](ListResponseOfAiNameComponent.md)


## Example
```java
AiNameComponentList aiNameComponentList = Models.aiNameComponentList()
    .value(Arrays.<AiNameComponent>asList(
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
