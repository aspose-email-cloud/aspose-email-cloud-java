# DisposableEmailApi (EmailCloud.disposableEmail())

Check email address is disposable operations

<a name="isDisposable"></a>
## isDisposable

Description: Check email address is disposable             

Returns: true if address is disposable

Method call example:
```java
ValueTOfBoolean result = api.disposableEmail().isDisposable(request);
```


### Parameter: request

Description: isDisposable method request.

See parameter model documentation at [DisposableEmailIsDisposableRequest](DisposableEmailIsDisposableRequest.md).

<details>
    <summary>Parameter initialization example:</summary>

```java
DisposableEmailIsDisposableRequest request = Models.disposableEmailIsDisposableRequest()
    .address("example@mailcatch.com")
    .build();
```

</details>

### Result

Description: true if address is disposable

Return type: [**ValueTOfBoolean**](ValueTOfBoolean.md)

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
DisposableEmailIsDisposableRequest request = Models.disposableEmailIsDisposableRequest()
    .address("example@mailcatch.com")
    .build();

// Call method:
ValueTOfBoolean result = api.disposableEmail().isDisposable(request);

// Result example:
result = ;

```

</details>

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

