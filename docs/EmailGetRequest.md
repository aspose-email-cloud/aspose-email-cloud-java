# EmailGetRequest

Request model for EmailApi.get

## Properties

Name | Type | Description | Notes
---- | ---- | ----------- | -----
**format** | **String**| Email document format. Enum, available values: Eml, Msg, MsgUnicode, Mhtml, Html, Tnef, Oft |
**fileName** | **String**| Email document file name. |
**folder** | **String**| Path to folder in storage. | [optional]
**storage** | **String**| Storage name. | [optional]

## Example
```java
EmailGetRequest request = Models.emailGetRequest()
    .format("Eml")
    .fileName("email.eml")
    .folder("folder/on/storage")
    .storage("First Storage")
    .build();
```

