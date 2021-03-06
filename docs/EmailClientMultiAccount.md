# EmailClientMultiAccount

Email client virtual account, which contains several accounts             

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**receiveAccounts** | [**List&lt;EmailClientAccount&gt;**](EmailClientAccount.md) | Email client receive accounts              | 
**sendAccount** | [**EmailClientAccount**](EmailClientAccount.md) | Email client send account              |  [optional]



## Example
```java
EmailClientMultiAccount emailClientMultiAccount = Models.emailClientMultiAccount()
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
    .build();
```


[[Back to Model list]](Models.md) [[Back to API README]](README.md)
