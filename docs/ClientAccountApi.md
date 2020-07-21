# com.aspose.email.cloud.sdk.api.ClientAccountApi

<a name="clientAccountGet"></a>
## **clientAccountGet**
> [EmailClientAccount](EmailClientAccount.md) clientAccountGet(ClientAccountGetRequestData request)

Get email client account from storage.             

### **ClientAccountGetRequestData** Parameters
```java
public ClientAccountGetRequestData(
    String name, 
    String folder, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| File name on storage. |
 **folder** | **String**| Folder on storage. | [optional]
 **storage** | **String**| Storage name. | [optional]

### Return type

[**EmailClientAccount**](EmailClientAccount.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="clientAccountGetMulti"></a>
## **clientAccountGetMulti**
> [EmailClientMultiAccount](EmailClientMultiAccount.md) clientAccountGetMulti(ClientAccountGetMultiRequestData request)

Get email client multi account file (*.multi.account). Will respond error if file extension is not \&quot;.multi.account\&quot;.             

### **ClientAccountGetMultiRequestData** Parameters
```java
public ClientAccountGetMultiRequestData(
    String name, 
    String folder, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| File name on storage |
 **folder** | **String**| Folder on storage | [optional]
 **storage** | **String**| Storage name | [optional]

### Return type

[**EmailClientMultiAccount**](EmailClientMultiAccount.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="clientAccountSave"></a>
## **clientAccountSave**
> void clientAccountSave(ClientAccountSaveRequestData request)

Create/update email client account file (*.account) with credentials             

### **ClientAccountSaveRequestData** Parameters
```java
public ClientAccountSaveRequestData(
    EmailClientAccountSaveRequest request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**EmailClientAccountSaveRequest**](EmailClientAccountSaveRequest.md)| Email account information |

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="clientAccountSaveMulti"></a>
## **clientAccountSaveMulti**
> void clientAccountSaveMulti(ClientAccountSaveMultiRequestData request)

Create email client multi account file (*.multi.account). Will respond error if file extension is not \&quot;.multi.account\&quot;.             

### **ClientAccountSaveMultiRequestData** Parameters
```java
public ClientAccountSaveMultiRequestData(
    EmailClientMultiAccountSaveRequest request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**EmailClientMultiAccountSaveRequest**](EmailClientMultiAccountSaveRequest.md)| Email accounts information. |

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

