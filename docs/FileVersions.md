# FileVersions

File versions FileVersion.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | [**List&lt;FileVersion&gt;**](FileVersion.md) | File versions FileVersion. |  [optional]



## Example
```java
FileVersions fileVersions = Models.fileVersions()
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


[[Back to Model list]](Models.md) [[Back to API README]](README.md)
