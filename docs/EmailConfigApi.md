# com.aspose.email.cloud.sdk.api.EmailConfigApi

<a name="emailConfigDiscover"></a>
## **emailConfigDiscover**
> [EmailAccountConfigList](EmailAccountConfigList.md) emailConfigDiscover(EmailConfigDiscoverRequestData request)

Discover email accounts by email address. Does not validate discovered accounts.             

### **EmailConfigDiscoverRequestData** Parameters
```java
public EmailConfigDiscoverRequestData(
    String address, 
    Boolean fastProcessing)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **String**| Email address. |
 **fastProcessing** | **Boolean**| Turns on fast processing. All discover systems will run in parallel. First discovered result will be returned.              | [optional] [default to false]

### Return type

[**EmailAccountConfigList**](EmailAccountConfigList.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="emailConfigDiscoverOauth"></a>
## **emailConfigDiscoverOauth**
> [EmailAccountConfigList](EmailAccountConfigList.md) emailConfigDiscoverOauth(EmailConfigDiscoverOauthRequestData request)

Discover email accounts by email address. Validates discovered accounts using OAuth 2.0.             

### **EmailConfigDiscoverOauthRequestData** Parameters
```java
public EmailConfigDiscoverOauthRequestData(
    DiscoverEmailConfigOauth request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**DiscoverEmailConfigOauth**](DiscoverEmailConfigOauth.md)| Discover email configuration request. |

### Return type

[**EmailAccountConfigList**](EmailAccountConfigList.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="emailConfigDiscoverPassword"></a>
## **emailConfigDiscoverPassword**
> [EmailAccountConfigList](EmailAccountConfigList.md) emailConfigDiscoverPassword(EmailConfigDiscoverPasswordRequestData request)

Discover email accounts by email address. Validates discovered accounts using login and password.             

### **EmailConfigDiscoverPasswordRequestData** Parameters
```java
public EmailConfigDiscoverPasswordRequestData(
    DiscoverEmailConfigPassword request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**DiscoverEmailConfigPassword**](DiscoverEmailConfigPassword.md)| Discover email configuration request. |

### Return type

[**EmailAccountConfigList**](EmailAccountConfigList.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

