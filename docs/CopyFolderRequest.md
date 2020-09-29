# copyFolderRequest

Request model for FolderApi.copyFolder

## Properties

Name | Type | Description | Notes
---- | ---- | ----------- | -----
**srcPath** | **String**| Source folder path e.g. &#39;/src&#39; |
**destPath** | **String**| Destination folder path e.g. &#39;/dst&#39; |
**srcStorageName** | **String**| Source storage name | [optional]
**destStorageName** | **String**| Destination storage name | [optional]

## Example
```java
CopyFolderRequest request = Models.copyFolderRequest()
    .srcPath("/storage/path/to/source/folder")
    .destPath("/storage/path/to/destination/folder")
    .srcStorageName("First Storage")
    .destStorageName("Other Storage")
    .build();
```

