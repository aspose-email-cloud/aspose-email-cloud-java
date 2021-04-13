# EmailClientAccount

A universal email client account             

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**host** | **String** | Mail server host name or IP address              | 
**port** | **Integer** | Mail server port              | 
**securityOptions** | **String** | Email account security mode Enum, available values: None, SSLExplicit, SSLImplicit, SSLAuto, Auto | 
**protocolType** | **String** | Type of connection protocol. Enum, available values: IMAP, POP3, SMTP, EWS, WebDav | 
**credentials** | [**EmailClientAccountCredentials**](EmailClientAccountCredentials.md) | Email client account credentials              | 
**cacheFile** | [**StorageFileLocation**](StorageFileLocation.md) | File with messages cache. Used to provide extra functions, which are not supported by account              |  [optional]



## Example
```java
EmailClientAccount emailClientAccount = Models.emailClientAccount()
    .host("smtp.example.com")
    .port(465)
    .securityOptions("SSLAuto")
    .protocolType("SMTP")
    .credentials(Models.emailClientAccountOauthCredentials()
        .clientId("clientId")
        .clientSecret("clientSecret")
        .refreshToken("refreshToken")
        .login("example@example.com")
        .build())
    .cacheFile(Models.storageFileLocation()
        .fileName("account.cache")
        .storage("First Storage")
        .folderPath("file/location/folder/on/storage")
        .build())
    .build();
```


[[Back to Model list]](Models.md) [[Back to API README]](README.md)
