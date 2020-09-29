
# StorageFile

File or folder information

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | File or folder name. |  [optional]
**isFolder** | **Boolean** | True if it is a folder. | 
**modifiedDate** | [**Date**](Date.md) | File or folder last modified DateTime. |  [optional]
**size** | **Long** | File or folder size. | 
**path** | **String** | File or folder path. |  [optional]



## Example
```java
StorageFile storageFile = Models.storageFile()
    .name("file.ext")
    .modifiedDate(Calendar.getInstance().getTime())
    .size(4096)
    .path("/storage/path/to")
    .build();
```


[[Back to Model list]](Models.md) [[Back to API README]](README.md)

