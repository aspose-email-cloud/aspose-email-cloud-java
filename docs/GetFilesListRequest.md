# getFilesListRequest

Request model for FolderApi.getFilesList

## Properties

Name | Type | Description | Notes
---- | ---- | ----------- | -----
**path** | **String**| Folder path e.g. &#39;/folder&#39; |
**storageName** | **String**| Storage name | [optional]

## Example
```java
GetFilesListRequest request = Models.getFilesListRequest()
    .path("/storage/path/to/folder")
    .storageName("First Storage")
    .build();
```

