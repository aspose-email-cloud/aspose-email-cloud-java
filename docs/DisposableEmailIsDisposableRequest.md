# disposableEmailIsDisposableRequest

Request model for DisposableEmailApi.isDisposable

## Properties

Name | Type | Description | Notes
---- | ---- | ----------- | -----
**address** | **String**| An email address to check |

## Example
```java
DisposableEmailIsDisposableRequest request = Models.disposableEmailIsDisposableRequest()
    .address("example@mailcatch.com")
    .build();
```

