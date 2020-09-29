# objectExistsRequest

Request model for StorageApi.objectExists

## Properties

Name | Type | Description | Notes
---- | ---- | ----------- | -----
**path** | **String**| File or folder path e.g. &#39;/file.ext&#39; or &#39;/folder&#39; |
**storageName** | **String**| Storage name | [optional]
**versionId** | **String**| File version ID | [optional]

## Example
```java
ObjectExistsRequest request = Models.objectExistsRequest()
    .path("/storage/path/to/folder/or/file.ext")
    .storageName("First Storage")
    .build();
```

