# mapiContactGetRequest

Request model for MapiContactApi.get

## Properties

Name | Type | Description | Notes
---- | ---- | ----------- | -----
**format** | **String**| Contact document format. Enum, available values: VCard, WebDav, Msg |
**fileName** | **String**| Contact document file name. |
**folder** | **String**| Path to folder in storage. | [optional]
**storage** | **String**| Storage name. | [optional]

## Example
```java
MapiContactGetRequest request = Models.mapiContactGetRequest()
    .format("VCard")
    .fileName("contact.vcf")
    .folder("folder/on/storage")
    .storage("First Storage")
    .build();
```

