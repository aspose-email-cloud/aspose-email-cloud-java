
# MapiAttachmentDto

Mapi attachment             

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Attachment&#39;s name              |  [optional]
**dataBase64** | **String** | Attachment data represented as Base64 string.              |  [optional]



## Example
```java
MapiAttachmentDto mapiAttachmentDto = Models.mapiAttachmentDto()
    .name("some-file.txt")
    .dataBase64("U29tZSBmaWxlIHRleHQ=")
    .build();
```


[[Back to Model list]](Models.md) [[Back to API README]](README.md)

