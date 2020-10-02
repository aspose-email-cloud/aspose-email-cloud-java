# CopyFolderRequest

Request model for FolderApi.copyFolder

## Properties

Name | Type | Description | Notes
---- | ---- | ----------- | -----
**srcPath** | **String**| Source folder path e.g. '/src' |
**destPath** | **String**| Destination folder path e.g. '/dst' |
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

