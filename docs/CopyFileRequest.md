# copyFileRequest

Request model for FileApi.copyFile

## Properties

Name | Type | Description | Notes
---- | ---- | ----------- | -----
**srcPath** | **String**| Source file path e.g. &#39;/folder/file.ext&#39; |
**destPath** | **String**| Destination file path |
**srcStorageName** | **String**| Source storage name | [optional]
**destStorageName** | **String**| Destination storage name | [optional]
**versionId** | **String**| File version ID to copy | [optional]

## Example
```java
CopyFileRequest request = Models.copyFileRequest()
    .srcPath("/storage/path/to/source/file.ext")
    .destPath("/storage/path/to/destination/file.ext")
    .srcStorageName("First Storage")
    .destStorageName("Other Storage")
    .build();
```

