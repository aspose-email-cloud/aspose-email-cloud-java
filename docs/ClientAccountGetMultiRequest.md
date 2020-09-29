# clientAccountGetMultiRequest

Request model for ClientAccountApi.getMulti

## Properties

Name | Type | Description | Notes
---- | ---- | ----------- | -----
**fileName** | **String**| File name on storage |
**folder** | **String**| Folder on storage | [optional]
**storage** | **String**| Storage name | [optional]

## Example
```java
ClientAccountGetMultiRequest request = Models.clientAccountGetMultiRequest()
    .fileName("email.multi.account")
    .folder("email/account/location/on/storage")
    .storage("First Storage")
    .build();
```

