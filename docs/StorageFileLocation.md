
# StorageFileLocation

A storage file location information             

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fileName** | **String** | A file name in storage              | 

## Parent class

See: [StorageFolderLocation](StorageFolderLocation.md)


## Example
```java
StorageFileLocation storageFileLocation = Models.storageFileLocation()
    .fileName("fileOnStorage.txt")
    .storage("First Storage")
    .folderPath("file/location/folder/on/storage")
    .build();
```


[[Back to Model list]](Models.md) [[Back to API README]](README.md)

