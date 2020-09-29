
# StorageFileLocationList

List of files located on storage.             

## Properties
Class has no properties

## Parent class

See: [ListResponseOfStorageFileLocation](ListResponseOfStorageFileLocation.md)


## Example
```java
StorageFileLocationList storageFileLocationList = Models.storageFileLocationList()
    .value(Arrays.<StorageFileLocation>asList(
        Models.storageFileLocation()
            .fileName("fileOnStorage.txt")
            .storage("First Storage")
            .folderPath("file/location/folder/on/storage")
            .build()))
    .build();
```


[[Back to Model list]](Models.md) [[Back to API README]](README.md)

