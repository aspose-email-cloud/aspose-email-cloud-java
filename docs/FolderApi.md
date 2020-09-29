# FolderApi (EmailCloud.cloudStorage().folder())

Folder operations controller

<a name="copyFolder"></a>
## copyFolder

Description: Copy folder

Returns: Returns 200 if the copy is successful.

Method call example:
```java
api.cloudStorage().folder().copyFolder(request);
```


### Parameter: request

Description: copyFolder method request.

See parameter model documentation at [CopyFolderRequest](CopyFolderRequest.md)

<details>
    <summary>Parameter initialization example:</summary>

```java
CopyFolderRequest request = Models.copyFolderRequest()
    .srcPath("/storage/path/to/source/folder")
    .destPath("/storage/path/to/destination/folder")
    .srcStorageName("First Storage")
    .destStorageName("Other Storage")
    .build();
```

</details>

### Result

Description: Returns 200 if the copy is successful.

Return type: void (empty response body)

<details>
    <summary>Result example</summary>

```java
result = ;
```
</details>

### Complete example

<details>
    <summary>Method call example:</summary>

```java
EmailCloud api = new EmailCloud(appKey, appSid);

// Prepare parameters:
CopyFolderRequest request = Models.copyFolderRequest()
    .srcPath("/storage/path/to/source/folder")
    .destPath("/storage/path/to/destination/folder")
    .srcStorageName("First Storage")
    .destStorageName("Other Storage")
    .build();

// Call method:
api.cloudStorage().folder().copyFolder(request);
```

</details>

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

<a name="createFolder"></a>
## createFolder

Description: Create the folder

Returns: Returns 200 if the create is successful.

Method call example:
```java
api.cloudStorage().folder().createFolder(request);
```


### Parameter: request

Description: createFolder method request.

See parameter model documentation at [CreateFolderRequest](CreateFolderRequest.md)

<details>
    <summary>Parameter initialization example:</summary>

```java
CreateFolderRequest request = Models.createFolderRequest()
    .path("/storage/path/to/new/folder")
    .storageName("First Storage")
    .build();
```

</details>

### Result

Description: Returns 200 if the create is successful.

Return type: void (empty response body)

<details>
    <summary>Result example</summary>

```java
result = ;
```
</details>

### Complete example

<details>
    <summary>Method call example:</summary>

```java
EmailCloud api = new EmailCloud(appKey, appSid);

// Prepare parameters:
CreateFolderRequest request = Models.createFolderRequest()
    .path("/storage/path/to/new/folder")
    .storageName("First Storage")
    .build();

// Call method:
api.cloudStorage().folder().createFolder(request);
```

</details>

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

<a name="deleteFolder"></a>
## deleteFolder

Description: Delete folder

Returns: Returns 200 if the delete is successful.

Method call example:
```java
api.cloudStorage().folder().deleteFolder(request);
```


### Parameter: request

Description: deleteFolder method request.

See parameter model documentation at [DeleteFolderRequest](DeleteFolderRequest.md)

<details>
    <summary>Parameter initialization example:</summary>

```java
DeleteFolderRequest request = Models.deleteFolderRequest()
    .path("/storage/path/to/folder")
    .storageName("First Storage")
    .recursive(true)
    .build();
```

</details>

### Result

Description: Returns 200 if the delete is successful.

Return type: void (empty response body)

<details>
    <summary>Result example</summary>

```java
result = ;
```
</details>

### Complete example

<details>
    <summary>Method call example:</summary>

```java
EmailCloud api = new EmailCloud(appKey, appSid);

// Prepare parameters:
DeleteFolderRequest request = Models.deleteFolderRequest()
    .path("/storage/path/to/folder")
    .storageName("First Storage")
    .recursive(true)
    .build();

// Call method:
api.cloudStorage().folder().deleteFolder(request);
```

</details>

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

<a name="getFilesList"></a>
## getFilesList

Description: Get all files and folders within a folder

Returns: Returns all files and folders contained by the folder.

Method call example:
```java
FilesList result = api.cloudStorage().folder().getFilesList(request);
```


### Parameter: request

Description: getFilesList method request.

See parameter model documentation at [GetFilesListRequest](GetFilesListRequest.md)

<details>
    <summary>Parameter initialization example:</summary>

```java
GetFilesListRequest request = Models.getFilesListRequest()
    .path("/storage/path/to/folder")
    .storageName("First Storage")
    .build();
```

</details>

### Result

Description: Returns all files and folders contained by the folder.

Return type: [**FilesList**](FilesList.md)

<details>
    <summary>Result example</summary>

```java
result = Models.filesList()
    .value(Arrays.<StorageFile>asList(
        Models.storageFile()
            .name("file.ext")
            .modifiedDate(Calendar.getInstance().getTime())
            .size(1024)
            .path("/path/to/file/on/storage")
            .build()))
    .build();
```
</details>

### Complete example

<details>
    <summary>Method call example:</summary>

```java
EmailCloud api = new EmailCloud(appKey, appSid);

// Prepare parameters:
GetFilesListRequest request = Models.getFilesListRequest()
    .path("/storage/path/to/folder")
    .storageName("First Storage")
    .build();

// Call method:
FilesList result = api.cloudStorage().folder().getFilesList(request);

// Result example:
result = Models.filesList()
    .value(Arrays.<StorageFile>asList(
        Models.storageFile()
            .name("file.ext")
            .modifiedDate(Calendar.getInstance().getTime())
            .size(1024)
            .path("/path/to/file/on/storage")
            .build()))
    .build();
```

</details>

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

<a name="moveFolder"></a>
## moveFolder

Description: Move folder

Returns: Returns 200 if the move is successful.

Method call example:
```java
api.cloudStorage().folder().moveFolder(request);
```


### Parameter: request

Description: moveFolder method request.

See parameter model documentation at [MoveFolderRequest](MoveFolderRequest.md)

<details>
    <summary>Parameter initialization example:</summary>

```java
MoveFolderRequest request = Models.moveFolderRequest()
    .srcPath("/storage/path/to/source/folder")
    .destPath("/storage/path/to/destination/folder")
    .srcStorageName("First Storage")
    .destStorageName("Other Storage")
    .build();
```

</details>

### Result

Description: Returns 200 if the move is successful.

Return type: void (empty response body)

<details>
    <summary>Result example</summary>

```java
result = ;
```
</details>

### Complete example

<details>
    <summary>Method call example:</summary>

```java
EmailCloud api = new EmailCloud(appKey, appSid);

// Prepare parameters:
MoveFolderRequest request = Models.moveFolderRequest()
    .srcPath("/storage/path/to/source/folder")
    .destPath("/storage/path/to/destination/folder")
    .srcStorageName("First Storage")
    .destStorageName("Other Storage")
    .build();

// Call method:
api.cloudStorage().folder().moveFolder(request);
```

</details>

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

