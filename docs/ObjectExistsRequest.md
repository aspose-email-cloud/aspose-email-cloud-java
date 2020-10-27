# ObjectExistsRequest

Request model for StorageApi.objectExists

## Properties

Name | Type | Description | Notes
---- | ---- | ----------- | -----
**path** | **String**| File or folder path e.g. '/file.ext' or '/folder' |
**storageName** | **String**| Storage name | [optional]
**versionId** | **String**| File version ID | [optional]

## Example
```java
ObjectExistsRequest request = Models.objectExistsRequest()
    .path("/storage/path/to/folder/or/file.ext")
    .storageName("First Storage")
    .build();
```

