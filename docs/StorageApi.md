# StorageApi (EmailCloud.cloudStorage().storage())

Storage operations controller

<a name="getDiscUsage"></a>
## getDiscUsage

Description: Get disc usage

Returns: Disc usage.

Method call example:
```java
DiscUsage result = api.cloudStorage().storage().getDiscUsage(request);
```


### Parameter: request

Description: getDiscUsage method request.

See parameter model documentation at [GetDiscUsageRequest](GetDiscUsageRequest.md)

<details>
    <summary>Parameter initialization example:</summary>

```java
GetDiscUsageRequest request = Models.getDiscUsageRequest()
    .storageName("First Storage")
    .build();
```

</details>

### Result

Description: Disc usage.

Return type: [**DiscUsage**](DiscUsage.md)

<details>
    <summary>Result example</summary>

```java
result = Models.discUsage()
    .usedSize(1048576)
    .totalSize(3145728)
    .build();
```
</details>

### Complete example

<details>
    <summary>Method call example:</summary>

```java
EmailCloud api = new EmailCloud(appKey, appSid);

// Prepare parameters:
GetDiscUsageRequest request = Models.getDiscUsageRequest()
    .storageName("First Storage")
    .build();

// Call method:
DiscUsage result = api.cloudStorage().storage().getDiscUsage(request);

// Result example:
result = Models.discUsage()
    .usedSize(1048576)
    .totalSize(3145728)
    .build();
```

</details>

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

<a name="getFileVersions"></a>
## getFileVersions

Description: Get file versions

Returns: File versions.

Method call example:
```java
FileVersions result = api.cloudStorage().storage().getFileVersions(request);
```


### Parameter: request

Description: getFileVersions method request.

See parameter model documentation at [GetFileVersionsRequest](GetFileVersionsRequest.md)

<details>
    <summary>Parameter initialization example:</summary>

```java
GetFileVersionsRequest request = Models.getFileVersionsRequest()
    .path("/storage/path/to/file.ext")
    .storageName("First Storage")
    .build();
```

</details>

### Result

Description: File versions.

Return type: [**FileVersions**](FileVersions.md)

<details>
    <summary>Result example</summary>

```java
result = Models.fileVersions()
    .value(Arrays.<FileVersion>asList(
        Models.fileVersion()
            .versionId("d5afd857-8797-4ca0-b806-a03fdfc3831f")
            .isLatest(true)
            .name("file.ext")
            .modifiedDate(Calendar.getInstance().getTime())
            .size(4096)
            .path("/storage/path/to")
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
GetFileVersionsRequest request = Models.getFileVersionsRequest()
    .path("/storage/path/to/file.ext")
    .storageName("First Storage")
    .build();

// Call method:
FileVersions result = api.cloudStorage().storage().getFileVersions(request);

// Result example:
result = Models.fileVersions()
    .value(Arrays.<FileVersion>asList(
        Models.fileVersion()
            .versionId("d5afd857-8797-4ca0-b806-a03fdfc3831f")
            .isLatest(true)
            .name("file.ext")
            .modifiedDate(Calendar.getInstance().getTime())
            .size(4096)
            .path("/storage/path/to")
            .build()))
    .build();
```

</details>

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

<a name="objectExists"></a>
## objectExists

Description: Check if file or folder exists

Returns: Object exist result.

Method call example:
```java
ObjectExist result = api.cloudStorage().storage().objectExists(request);
```


### Parameter: request

Description: objectExists method request.

See parameter model documentation at [ObjectExistsRequest](ObjectExistsRequest.md)

<details>
    <summary>Parameter initialization example:</summary>

```java
ObjectExistsRequest request = Models.objectExistsRequest()
    .path("/storage/path/to/folder/or/file.ext")
    .storageName("First Storage")
    .build();
```

</details>

### Result

Description: Object exist result.

Return type: [**ObjectExist**](ObjectExist.md)

<details>
    <summary>Result example</summary>

```java
result = Models.objectExist()
    .exists(true)
    .build();
```
</details>

### Complete example

<details>
    <summary>Method call example:</summary>

```java
EmailCloud api = new EmailCloud(appKey, appSid);

// Prepare parameters:
ObjectExistsRequest request = Models.objectExistsRequest()
    .path("/storage/path/to/folder/or/file.ext")
    .storageName("First Storage")
    .build();

// Call method:
ObjectExist result = api.cloudStorage().storage().objectExists(request);

// Result example:
result = Models.objectExist()
    .exists(true)
    .build();
```

</details>

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

<a name="exists"></a>
## exists

Description: Check if storage exists

Returns: Storage exist result.

Method call example:
```java
StorageExist result = api.cloudStorage().storage().exists(request);
```


### Parameter: request

Description: exists method request.

See parameter model documentation at [StorageExistsRequest](StorageExistsRequest.md)

<details>
    <summary>Parameter initialization example:</summary>

```java
StorageExistsRequest request = Models.storageExistsRequest()
    .storageName("First Storage")
    .build();
```

</details>

### Result

Description: Storage exist result.

Return type: [**StorageExist**](StorageExist.md)

<details>
    <summary>Result example</summary>

```java
result = Models.storageExist()
    .exists(true)
    .build();
```
</details>

### Complete example

<details>
    <summary>Method call example:</summary>

```java
EmailCloud api = new EmailCloud(appKey, appSid);

// Prepare parameters:
StorageExistsRequest request = Models.storageExistsRequest()
    .storageName("First Storage")
    .build();

// Call method:
StorageExist result = api.cloudStorage().storage().exists(request);

// Result example:
result = Models.storageExist()
    .exists(true)
    .build();
```

</details>

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

