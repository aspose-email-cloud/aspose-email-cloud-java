# FileApi (EmailCloud.cloudStorage().file())

File operations controller

<a name="copyFile"></a>
## copyFile

Description: Copy file


Method call example:
```java
api.cloudStorage().file().copyFile(request);
```


### Parameter: request

Description: copyFile method request.

See parameter model documentation at [CopyFileRequest](CopyFileRequest.md).

<details>
    <summary>Parameter initialization example:</summary>

```java
CopyFileRequest request = Models.copyFileRequest()
    .srcPath("/storage/path/to/source/file.ext")
    .destPath("/storage/path/to/destination/file.ext")
    .srcStorageName("First Storage")
    .destStorageName("Other Storage")
    .build();
```

</details>

### Result

Return type: void (empty response body)

### Complete example

<details>
    <summary>Method call example:</summary>

```java
EmailCloud api = new EmailCloud(appKey, appSid);

// Prepare parameters:
CopyFileRequest request = Models.copyFileRequest()
    .srcPath("/storage/path/to/source/file.ext")
    .destPath("/storage/path/to/destination/file.ext")
    .srcStorageName("First Storage")
    .destStorageName("Other Storage")
    .build();

// Call method:
api.cloudStorage().file().copyFile(request);
```

</details>

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

<a name="deleteFile"></a>
## deleteFile

Description: Delete file


Method call example:
```java
api.cloudStorage().file().deleteFile(request);
```


### Parameter: request

Description: deleteFile method request.

See parameter model documentation at [DeleteFileRequest](DeleteFileRequest.md).

<details>
    <summary>Parameter initialization example:</summary>

```java
DeleteFileRequest request = Models.deleteFileRequest()
    .path("/storage/path/to/file.ext")
    .storageName("First Storage")
    .build();
```

</details>

### Result

Return type: void (empty response body)

### Complete example

<details>
    <summary>Method call example:</summary>

```java
EmailCloud api = new EmailCloud(appKey, appSid);

// Prepare parameters:
DeleteFileRequest request = Models.deleteFileRequest()
    .path("/storage/path/to/file.ext")
    .storageName("First Storage")
    .build();

// Call method:
api.cloudStorage().file().deleteFile(request);
```

</details>

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

<a name="downloadFile"></a>
## downloadFile

Description: Download file

Returns: The raw data of the file.

Method call example:
```java
byte[] result = api.cloudStorage().file().downloadFile(request);
```


### Parameter: request

Description: downloadFile method request.

See parameter model documentation at [DownloadFileRequest](DownloadFileRequest.md).

<details>
    <summary>Parameter initialization example:</summary>

```java
DownloadFileRequest request = Models.downloadFileRequest()
    .path("/storage/path/to/file.ext")
    .storageName("First Storage")
    .build();
```

</details>

### Result

Description: The raw data of the file.

Return type: **byte[]**

### Complete example

<details>
    <summary>Method call example:</summary>

```java
EmailCloud api = new EmailCloud(appKey, appSid);

// Prepare parameters:
DownloadFileRequest request = Models.downloadFileRequest()
    .path("/storage/path/to/file.ext")
    .storageName("First Storage")
    .build();

// Call method:
byte[] result = api.cloudStorage().file().downloadFile(request);
```

</details>

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

<a name="moveFile"></a>
## moveFile

Description: Move file


Method call example:
```java
api.cloudStorage().file().moveFile(request);
```


### Parameter: request

Description: moveFile method request.

See parameter model documentation at [MoveFileRequest](MoveFileRequest.md).

<details>
    <summary>Parameter initialization example:</summary>

```java
MoveFileRequest request = Models.moveFileRequest()
    .srcPath("/storage/path/to/source/file.ext")
    .destPath("/storage/path/to/destination/file.ext")
    .srcStorageName("First Storage")
    .destStorageName("Other Storage")
    .build();
```

</details>

### Result

Return type: void (empty response body)

### Complete example

<details>
    <summary>Method call example:</summary>

```java
EmailCloud api = new EmailCloud(appKey, appSid);

// Prepare parameters:
MoveFileRequest request = Models.moveFileRequest()
    .srcPath("/storage/path/to/source/file.ext")
    .destPath("/storage/path/to/destination/file.ext")
    .srcStorageName("First Storage")
    .destStorageName("Other Storage")
    .build();

// Call method:
api.cloudStorage().file().moveFile(request);
```

</details>

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

<a name="uploadFile"></a>
## uploadFile

Description: Upload file

Returns: Empty error list if the upload is successful.

Method call example:
```java
FilesUploadResult result = api.cloudStorage().file().uploadFile(request);
```


### Parameter: request

Description: uploadFile method request.

See parameter model documentation at [UploadFileRequest](UploadFileRequest.md).

<details>
    <summary>Parameter initialization example:</summary>

```java
UploadFileRequest request = Models.uploadFileRequest()
    .path("/storage/path/to/file.ext")
    .file(IOUtils.toByteArray(new FileInputStream("/local/file/system/path/to/file.ext")))
    .storageName("First Storage")
    .build();
```

</details>

### Result

Description: Empty error list if the upload is successful.

Return type: [**FilesUploadResult**](FilesUploadResult.md)

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
UploadFileRequest request = Models.uploadFileRequest()
    .path("/storage/path/to/file.ext")
    .file(IOUtils.toByteArray(new FileInputStream("/local/file/system/path/to/file.ext")))
    .storageName("First Storage")
    .build();

// Call method:
FilesUploadResult result = api.cloudStorage().file().uploadFile(request);

// Result example:
result = ;

```

</details>

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

