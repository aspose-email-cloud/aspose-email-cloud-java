# uploadFileRequest

Request model for FileApi.uploadFile

## Properties

Name | Type | Description | Notes
---- | ---- | ----------- | -----
**path** | **String**| Path where to upload including filename and extension e.g. /file.ext or /Folder 1/file.ext             If the content is multipart and path does not contains the file name it tries to get them from filename parameter             from Content-Disposition header.              |
**file** | **byte[]**| File to upload |
**storageName** | **String**| Storage name | [optional]

## Example
```java
UploadFileRequest request = Models.uploadFileRequest()
    .path("/storage/path/to/file.ext")
    .file(IOUtils.toByteArray(new FileInputStream("/local/file/system/path/to/file.ext")))
    .storageName("First Storage")
    .build();
```

