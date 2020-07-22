# com.aspose.email.cloud.sdk.api.ClientAccountApi

            ﻿
<a name="get"></a>
# **get**
> [EmailClientAccount](EmailClientAccount.md) get(ClientAccountGetRequest request)

Get email client account from storage.             

### **ClientAccountGetRequest** Parameters
```java
public ClientAccountGetRequest(
    String name, 
    String folder, 
    String storage)
```

Name | Type | Description | Notes
---- | ---- | ----------- | -----
 **name** | **String**| File name on storage. |
 **folder** | **String**| Folder on storage. | [optional]
 **storage** | **String**| Storage name. | [optional]

### Return type

[**EmailClientAccount**](EmailClientAccount.md)

[[Back to top]](#) [[Back to Model list]](Model.md) [[Back to API README]](README.md)

            ﻿
<a name="getMulti"></a>
# **getMulti**
> [EmailClientMultiAccount](EmailClientMultiAccount.md) getMulti(ClientAccountGetMultiRequest request)

Get email client multi account file (*.multi.account). Will respond error if file extension is not \&quot;.multi.account\&quot;.             

### **ClientAccountGetMultiRequest** Parameters
```java
public ClientAccountGetMultiRequest(
    String name, 
    String folder, 
    String storage)
```

Name | Type | Description | Notes
---- | ---- | ----------- | -----
 **name** | **String**| File name on storage |
 **folder** | **String**| Folder on storage | [optional]
 **storage** | **String**| Storage name | [optional]

### Return type

[**EmailClientMultiAccount**](EmailClientMultiAccount.md)

[[Back to top]](#) [[Back to Model list]](Model.md) [[Back to API README]](README.md)

            ﻿
<a name="save"></a>
# save
> void save([EmailClientAccountSaveRequest](EmailClientAccountSaveRequest.md) request)

Create/update email client account file (*.account) with credentials             

### request Parameter

See parameter model documentation at [EmailClientAccountSaveRequest](EmailClientAccountSaveRequest.md)

### Return type

void (empty response body)

[[Back to top]](#) [[Back to Model list]](Model.md) [[Back to API README]](README.md)
            ﻿
<a name="saveMulti"></a>
# saveMulti
> void saveMulti([EmailClientMultiAccountSaveRequest](EmailClientMultiAccountSaveRequest.md) request)

Create email client multi account file (*.multi.account). Will respond error if file extension is not \&quot;.multi.account\&quot;.             

### request Parameter

See parameter model documentation at [EmailClientMultiAccountSaveRequest](EmailClientMultiAccountSaveRequest.md)

### Return type

void (empty response body)

[[Back to top]](#) [[Back to Model list]](Model.md) [[Back to API README]](README.md)
