
# EmailConfigDiscoverOauthRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clientId** | **String** | OAuth client id.              | 
**clientSecret** | **String** | OAuth client secret.              | 
**refreshToken** | **String** | OAuth refresh token.              | 
**requestUrl** | **String** | The url to obtain access token. If not specified, will be discovered from email configuration.              |  [optional]

## Parent class

See: [DiscoverEmailConfigRequest](DiscoverEmailConfigRequest.md)


## Example
```java
EmailConfigDiscoverOauthRequest emailConfigDiscoverOauthRequest = Models.emailConfigDiscoverOauthRequest()
    .clientId("ClientId")
    .clientSecret("ClientSecret")
    .refreshToken("RefreshToken")
    .address("example@aspose.com")
    .fastProcessing(true)
    .build();
```


[[Back to Model list]](Models.md) [[Back to API README]](README.md)

