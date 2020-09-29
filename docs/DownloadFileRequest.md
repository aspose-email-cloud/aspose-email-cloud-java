# downloadFileRequest

Request model for FileApi.downloadFile

## Properties

Name | Type | Description | Notes
---- | ---- | ----------- | -----
**path** | **String**| File path e.g. &#39;/folder/file.ext&#39; |
**storageName** | **String**| Storage name | [optional]
**versionId** | **String**| File version ID to download | [optional]

## Example
```java
DownloadFileRequest request = Models.downloadFileRequest()
    .path("/storage/path/to/file.ext")
    .storageName("First Storage")
    .build();
```

