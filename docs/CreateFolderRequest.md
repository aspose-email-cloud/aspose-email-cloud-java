# CreateFolderRequest

Request model for FolderApi.createFolder

## Properties

Name | Type | Description | Notes
---- | ---- | ----------- | -----
**path** | **String**| Folder path to create e.g. 'folder_1/folder_2/' |
**storageName** | **String**| Storage name | [optional]

## Example
```java
CreateFolderRequest request = Models.createFolderRequest()
    .path("/storage/path/to/new/folder")
    .storageName("First Storage")
    .build();
```

