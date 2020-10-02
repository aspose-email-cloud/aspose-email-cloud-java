# AiBcrParseStorageRequest

Parse business card images from Storage request             

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**outFolder** | [**StorageFolderLocation**](StorageFolderLocation.md) | Parse output folder location on storage              | 
**images** | [**List&lt;AiBcrImageStorageFile&gt;**](AiBcrImageStorageFile.md) | Images to parse.              | 
**options** | [**AiBcrOptions**](AiBcrOptions.md) | Recognition options.              |  [optional]



## Example
```java
AiBcrParseStorageRequest aiBcrParseStorageRequest = Models.aiBcrParseStorageRequest()
    .outFolder(Models.storageFolderLocation()
        .storage("First Storage")
        .folderPath("VCard/files/produced/by/parser/will/be/placed/here")
        .build())
    .images(Arrays.<AiBcrImageStorageFile>asList(
        Models.aiBcrImageStorageFile()
            .file(Models.storageFileLocation()
                .fileName("VCardScanImage.jpg")
                .storage("First Storage")
                .folderPath("image/location/on/storage")
                .build())
            .isSingle(true)
            .build()))
    .build();
```


[[Back to Model list]](Models.md) [[Back to API README]](README.md)
