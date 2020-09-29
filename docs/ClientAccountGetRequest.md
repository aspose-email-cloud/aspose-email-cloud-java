# clientAccountGetRequest

Request model for ClientAccountApi.get

## Properties

Name | Type | Description | Notes
---- | ---- | ----------- | -----
**fileName** | **String**| File name on storage. |
**folder** | **String**| Folder on storage. | [optional]
**storage** | **String**| Storage name. | [optional]

## Example
```java
ClientAccountGetRequest request = Models.clientAccountGetRequest()
    .fileName("email.account")
    .folder("email/account/location/on/storage")
    .storage("First Storage")
    .build();
```

