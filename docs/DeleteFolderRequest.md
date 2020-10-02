# DeleteFolderRequest

Request model for FolderApi.deleteFolder

## Properties

Name | Type | Description | Notes
---- | ---- | ----------- | -----
**path** | **String**| Folder path e.g. '/folder' |
**storageName** | **String**| Storage name | [optional]
**recursive** | **Boolean**| Enable to delete folders, subfolders and files | [optional] [default to false]

## Example
```java
DeleteFolderRequest request = Models.deleteFolderRequest()
    .path("/storage/path/to/folder")
    .storageName("First Storage")
    .recursive(true)
    .build();
```

