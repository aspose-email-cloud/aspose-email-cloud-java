
# FilesList

Files list

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | [**List&lt;StorageFile&gt;**](StorageFile.md) | Files and folders contained by folder StorageFile. |  [optional]



## Example
```java
FilesList filesList = Models.filesList()
    .value(Arrays.<StorageFile>asList(
        Models.storageFile()
            .name("file.ext")
            .modifiedDate(Calendar.getInstance().getTime())
            .size(1024)
            .path("/path/to/file/on/storage")
            .build()))
    .build();
```


[[Back to Model list]](Models.md) [[Back to API README]](README.md)

