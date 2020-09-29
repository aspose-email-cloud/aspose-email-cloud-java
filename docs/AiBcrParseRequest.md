# aiBcrParseRequest

Request model for AiBcrApi.parse

## Properties

Name | Type | Description | Notes
---- | ---- | ----------- | -----
**file** | **byte[]**| File to parse |
**countries** | **String**| Comma-separated codes of countries. | [optional] [default to ]
**languages** | **String**| Comma-separated ISO-639 codes of languages (either 639-1 or 639-3; i.e. \&quot;it\&quot; or \&quot;ita\&quot; for Italian); it&#39;s \&quot;\&quot; by default.              | [optional] [default to ]
**isSingle** | **Boolean**| Determines that image contains single VCard or more. | [optional] [default to true]

## Example
```java
AiBcrParseRequest request = Models.aiBcrParseRequest()
    .file(IOUtils.toByteArray(new FileInputStream("/path/to/image.png")))
    .countries("us")
    .languages("en")
    .isSingle(true)
    .build();
```

