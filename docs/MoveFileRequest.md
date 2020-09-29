# moveFileRequest

Request model for FileApi.moveFile

## Properties

Name | Type | Description | Notes
---- | ---- | ----------- | -----
**srcPath** | **String**| Source file path e.g. &#39;/src.ext&#39; |
**destPath** | **String**| Destination file path e.g. &#39;/dest.ext&#39; |
**srcStorageName** | **String**| Source storage name | [optional]
**destStorageName** | **String**| Destination storage name | [optional]
**versionId** | **String**| File version ID to move | [optional]

## Example
```java
MoveFileRequest request = Models.moveFileRequest()
    .srcPath("/storage/path/to/source/file.ext")
    .destPath("/storage/path/to/destination/file.ext")
    .srcStorageName("First Storage")
    .destStorageName("Other Storage")
    .build();
```

