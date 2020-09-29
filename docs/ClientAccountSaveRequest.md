
# ClientAccountSaveRequest

Email client account save request             

## Properties
Class has no properties

## Parent class

See: [StorageModelOfEmailClientAccount](StorageModelOfEmailClientAccount.md)


## Example
```java
ClientAccountSaveRequest clientAccountSaveRequest = Models.clientAccountSaveRequest()
    .storageFile(Models.storageFileLocation()
        .fileName("email.account")
        .storage("First Storage")
        .folderPath("file/location/folder/on/storage")
        .build())
    .value(Models.emailClientAccount()
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
        .build())
    .build();
```


[[Back to Model list]](Models.md) [[Back to API README]](README.md)

