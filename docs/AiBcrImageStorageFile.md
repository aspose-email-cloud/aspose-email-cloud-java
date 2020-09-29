
# AiBcrImageStorageFile

Image from storage for recognition             

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**file** | [**StorageFileLocation**](StorageFileLocation.md) | Image location              | 

## Parent class

See: [AiBcrImage](AiBcrImage.md)


## Example
```java
AiBcrImageStorageFile aiBcrImageStorageFile = Models.aiBcrImageStorageFile()
    .file(Models.storageFileLocation()
        .fileName("VCardScanImage.jpg")
        .storage("First Storage")
        .folderPath("image/location/on/storage")
        .build())
    .isSingle(true)
    .build();
```


[[Back to Model list]](Models.md) [[Back to API README]](README.md)

