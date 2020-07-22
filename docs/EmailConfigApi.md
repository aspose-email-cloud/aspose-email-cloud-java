# com.aspose.email.cloud.sdk.api.EmailConfigApi

            ﻿
<a name="discover"></a>
# **discover**
> [EmailAccountConfigList](EmailAccountConfigList.md) discover(EmailConfigDiscoverRequest request)

Discover email accounts by email address. Does not validate discovered accounts.             

### **EmailConfigDiscoverRequest** Parameters
```java
public EmailConfigDiscoverRequest(
    String address, 
    Boolean fastProcessing)
```

Name | Type | Description | Notes
---- | ---- | ----------- | -----
 **address** | **String**| Email address. |
 **fastProcessing** | **Boolean**| Turns on fast processing. All discover systems will run in parallel. First discovered result will be returned.              | [optional] [default to false]

### Return type

[**EmailAccountConfigList**](EmailAccountConfigList.md)

[[Back to top]](#) [[Back to Model list]](Model.md) [[Back to API README]](README.md)

            ﻿
<a name="discoverOauth"></a>
# discoverOauth
> [EmailAccountConfigList](EmailAccountConfigList.md) discoverOauth([DiscoverEmailConfigOauth](DiscoverEmailConfigOauth.md) request)

Discover email accounts by email address. Validates discovered accounts using OAuth 2.0.             

### request Parameter

See parameter model documentation at [DiscoverEmailConfigOauth](DiscoverEmailConfigOauth.md)

### Return type

[**EmailAccountConfigList**](EmailAccountConfigList.md)

[[Back to top]](#) [[Back to Model list]](Model.md) [[Back to API README]](README.md)
            ﻿
<a name="discoverPassword"></a>
# discoverPassword
> [EmailAccountConfigList](EmailAccountConfigList.md) discoverPassword([DiscoverEmailConfigPassword](DiscoverEmailConfigPassword.md) request)

Discover email accounts by email address. Validates discovered accounts using login and password.             

### request Parameter

See parameter model documentation at [DiscoverEmailConfigPassword](DiscoverEmailConfigPassword.md)

### Return type

[**EmailAccountConfigList**](EmailAccountConfigList.md)

[[Back to top]](#) [[Back to Model list]](Model.md) [[Back to API README]](README.md)
