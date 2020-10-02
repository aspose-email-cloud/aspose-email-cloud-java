# StorageFolderLocation

A storage folder location information             

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**storage** | **String** | A storage name              |  [optional]
**folderPath** | **String** | A path to a folder in specified storage              |  [optional]



## Example
```java
StorageFolderLocation storageFolderLocation = Models.storageFolderLocation()
    .storage("First Storage")
    .folderPath("folder/on/storage")
    .build();
```


[[Back to Model list]](Models.md) [[Back to API README]](README.md)
