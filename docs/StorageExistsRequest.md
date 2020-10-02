# StorageExistsRequest

Request model for StorageApi.exists

## Properties

Name | Type | Description | Notes
---- | ---- | ----------- | -----
**storageName** | **String**| Storage name |

## Example
```java
StorageExistsRequest request = Models.storageExistsRequest()
    .storageName("First Storage")
    .build();
```

