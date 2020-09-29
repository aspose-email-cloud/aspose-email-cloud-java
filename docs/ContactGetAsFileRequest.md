# contactGetAsFileRequest

Request model for ContactApi.getAsFile

## Properties

Name | Type | Description | Notes
---- | ---- | ----------- | -----
**fileName** | **String**| Calendar document file name |
**toFormat** | **String**| File format Enum, available values: VCard, WebDav, Msg |
**fromFormat** | **String**| File format to convert from Enum, available values: VCard, WebDav, Msg |
**storage** | **String**| Storage name | [optional]
**folder** | **String**| Path to folder in storage | [optional]

## Example
```java
ContactGetAsFileRequest request = Models.contactGetAsFileRequest()
    .fileName("contact.msg")
    .toFormat("VCard")
    .fromFormat("Msg")
    .storage("First Storage")
    .folder("folder/on/storage")
    .build();
```

