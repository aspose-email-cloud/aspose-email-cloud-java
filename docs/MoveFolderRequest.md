# moveFolderRequest

Request model for FolderApi.moveFolder

## Properties

Name | Type | Description | Notes
---- | ---- | ----------- | -----
**srcPath** | **String**| Folder path to move e.g. &#39;/folder&#39; |
**destPath** | **String**| Destination folder path to move to e.g &#39;/dst&#39; |
**srcStorageName** | **String**| Source storage name | [optional]
**destStorageName** | **String**| Destination storage name | [optional]

## Example
```java
MoveFolderRequest request = Models.moveFolderRequest()
    .srcPath("/storage/path/to/source/folder")
    .destPath("/storage/path/to/destination/folder")
    .srcStorageName("First Storage")
    .destStorageName("Other Storage")
    .build();
```

