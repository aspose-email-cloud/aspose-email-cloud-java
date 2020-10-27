# DeleteFileRequest

Request model for FileApi.deleteFile

## Properties

Name | Type | Description | Notes
---- | ---- | ----------- | -----
**path** | **String**| File path e.g. '/folder/file.ext' |
**storageName** | **String**| Storage name | [optional]
**versionId** | **String**| File version ID to delete | [optional]

## Example
```java
DeleteFileRequest request = Models.deleteFileRequest()
    .path("/storage/path/to/file.ext")
    .storageName("First Storage")
    .build();
```

