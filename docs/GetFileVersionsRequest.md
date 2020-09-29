# getFileVersionsRequest

Request model for StorageApi.getFileVersions

## Properties

Name | Type | Description | Notes
---- | ---- | ----------- | -----
**path** | **String**| File path e.g. &#39;/file.ext&#39; |
**storageName** | **String**| Storage name | [optional]

## Example
```java
GetFileVersionsRequest request = Models.getFileVersionsRequest()
    .path("/storage/path/to/file.ext")
    .storageName("First Storage")
    .build();
```

