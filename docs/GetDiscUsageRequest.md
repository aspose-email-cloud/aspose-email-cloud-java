# GetDiscUsageRequest

Request model for StorageApi.getDiscUsage

## Properties

Name | Type | Description | Notes
---- | ---- | ----------- | -----
**storageName** | **String**| Storage name | [optional]

## Example
```java
GetDiscUsageRequest request = Models.getDiscUsageRequest()
    .storageName("First Storage")
    .build();
```

