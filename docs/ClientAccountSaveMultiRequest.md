
# ClientAccountSaveMultiRequest

Email client multi account save request.             

## Properties
Class has no properties

## Parent class

See: [StorageModelOfEmailClientMultiAccount](StorageModelOfEmailClientMultiAccount.md)


## Example
```java
ClientAccountSaveMultiRequest clientAccountSaveMultiRequest = Models.clientAccountSaveMultiRequest()
    .storageFile(Models.storageFileLocation()
        .fileName("email.multi.account")
        .storage("First Storage")
        .folderPath("file/location/folder/on/storage")
        .build())
    .value(Models.emailClientMultiAccount()
        .receiveAccounts(Arrays.<EmailClientAccount>asList(
            Models.emailClientAccount()
                .host("imap.gmail.com")
                .port(993)
                .securityOptions("SSLAuto")
                .credentials(Models.emailClientAccountPasswordCredentials()
                    .password("password")
                    .login("example@gmail.com")
                    .build())
                .build(),
            Models.emailClientAccount()
                .host("exchange@outlook.com")
                .port(443)
                .protocolType("EWS")
                .credentials(Models.emailClientAccountOauthCredentials()
                    .clientId("clientId")
                    .clientSecret("clientSecret")
                    .refreshToken("refreshToken")
                    .login("example@outlook.com")
                    .build())
                .build()))
        .sendAccount(Models.emailClientAccount()
            .host("smtp.gmail.com")
            .port(465)
            .securityOptions("SSLAuto")
            .protocolType("SMTP")
            .credentials(Models.emailClientAccountPasswordCredentials()
                .password("password")
                .login("example@gmail.com")
                .build())
            .build())
        .build())
    .build();
```


[[Back to Model list]](Models.md) [[Back to API README]](README.md)

