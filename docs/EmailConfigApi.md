# EmailConfigApi (EmailCloud.emailConfig())

Email server configuration discovery.

<a name="discover"></a>
## discover

Description: Discover email accounts by email address. Does not validate discovered accounts.             

Returns: Discovered account configurations.

Method call example:
```java
EmailAccountConfigList result = api.emailConfig().discover(request);
```


### Parameter: request

Description: discover method request.

See parameter model documentation at [EmailConfigDiscoverRequest](EmailConfigDiscoverRequest.md).

<details>
    <summary>Parameter initialization example:</summary>

```java
EmailConfigDiscoverRequest request = Models.emailConfigDiscoverRequest()
    .address("address@gmail.com")
    .build();
```

</details>

### Result

Description: Discovered account configurations.

Return type: [**EmailAccountConfigList**](EmailAccountConfigList.md)

<details>
    <summary>Result example</summary>

```java
result = Models.emailAccountConfigList()
    .value(Arrays.<EmailAccountConfig>asList(
        Models.emailAccountConfig()
            .displayName("Google Mail")
            .host("imap.gmail.com")
            .port(993)
            .socketType("SSLAuto")
            .authenticationTypes(Arrays.<AuthenticationType>asList(
                "PasswordCleartext",
                "OAuth2"))
            .extraInfo(Arrays.<NameValuePair>asList(
                Models.nameValuePair()
                    .name("Enable: You need to enable IMAP access")
                    .value("https://mail.google.com/mail/?ui=2&shva=1#settings/fwdandpop")
                    .build()))
            .build(),
        Models.emailAccountConfig()
            .displayName("Google Mail")
            .protocolType("SMTP")
            .host("smtp.gmail.com")
            .port(465)
            .socketType("SSLAuto")
            .authenticationTypes(Arrays.<AuthenticationType>asList(
                "PasswordCleartext",
                "OAuth2"))
            .extraInfo(Arrays.<NameValuePair>asList(
                Models.nameValuePair()
                    .name("Enable: You need to enable IMAP access")
                    .value("https://mail.google.com/mail/?ui=2&shva=1#settings/fwdandpop")
                    .build()))
            .build(),
        Models.emailAccountConfig()
            .displayName("Google Mail")
            .protocolType("POP3")
            .host("pop.gmail.com")
            .port(995)
            .socketType("SSLAuto")
            .authenticationTypes(Arrays.<AuthenticationType>asList(
                "PasswordCleartext",
                "OAuth2"))
            .extraInfo(Arrays.<NameValuePair>asList(
                Models.nameValuePair()
                    .name("Enable: You need to enable IMAP access")
                    .value("https://mail.google.com/mail/?ui=2&shva=1#settings/fwdandpop")
                    .build()))
            .build()))
    .build();
```
</details>

### Complete example

<details>
    <summary>Method call example:</summary>

```java
EmailCloud api = new EmailCloud(clientSecret, clientId);

// Prepare parameters:
EmailConfigDiscoverRequest request = Models.emailConfigDiscoverRequest()
    .address("address@gmail.com")
    .build();

// Call method:
EmailAccountConfigList result = api.emailConfig().discover(request);

// Result example:
result = Models.emailAccountConfigList()
    .value(Arrays.<EmailAccountConfig>asList(
        Models.emailAccountConfig()
            .displayName("Google Mail")
            .host("imap.gmail.com")
            .port(993)
            .socketType("SSLAuto")
            .authenticationTypes(Arrays.<AuthenticationType>asList(
                "PasswordCleartext",
                "OAuth2"))
            .extraInfo(Arrays.<NameValuePair>asList(
                Models.nameValuePair()
                    .name("Enable: You need to enable IMAP access")
                    .value("https://mail.google.com/mail/?ui=2&shva=1#settings/fwdandpop")
                    .build()))
            .build(),
        Models.emailAccountConfig()
            .displayName("Google Mail")
            .protocolType("SMTP")
            .host("smtp.gmail.com")
            .port(465)
            .socketType("SSLAuto")
            .authenticationTypes(Arrays.<AuthenticationType>asList(
                "PasswordCleartext",
                "OAuth2"))
            .extraInfo(Arrays.<NameValuePair>asList(
                Models.nameValuePair()
                    .name("Enable: You need to enable IMAP access")
                    .value("https://mail.google.com/mail/?ui=2&shva=1#settings/fwdandpop")
                    .build()))
            .build(),
        Models.emailAccountConfig()
            .displayName("Google Mail")
            .protocolType("POP3")
            .host("pop.gmail.com")
            .port(995)
            .socketType("SSLAuto")
            .authenticationTypes(Arrays.<AuthenticationType>asList(
                "PasswordCleartext",
                "OAuth2"))
            .extraInfo(Arrays.<NameValuePair>asList(
                Models.nameValuePair()
                    .name("Enable: You need to enable IMAP access")
                    .value("https://mail.google.com/mail/?ui=2&shva=1#settings/fwdandpop")
                    .build()))
            .build()))
    .build();

```

</details>

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

<a name="discoverOauth"></a>
## discoverOauth

Description: Discover email accounts by email address. Validates discovered accounts using OAuth 2.0.             

Returns: Discovered account configurations.

Method call example:
```java
EmailAccountConfigList result = api.emailConfig().discoverOauth(request);
```

### Parameter: request

Description: Discover email configuration request.

See parameter model documentation at [EmailConfigDiscoverOauthRequest](EmailConfigDiscoverOauthRequest.md)

<details>
    <summary>Parameter initialization example:</summary>
    
```java
EmailConfigDiscoverOauthRequest request = Models.emailConfigDiscoverOauthRequest()
    .clientId("ClientId")
    .clientSecret("ClientSecret")
    .refreshToken("RefreshToken")
    .address("example@aspose.com")
    .fastProcessing(true)
    .build();
```

</details>


### Result

Description: Discovered account configurations.

Return type: [**EmailAccountConfigList**](EmailAccountConfigList.md)

<details>
    <summary>Result example</summary>

```java
result = Models.emailAccountConfigList()
    .value(Arrays.<EmailAccountConfig>asList(
        Models.emailAccountConfig()
            .displayName("Google Mail")
            .host("imap.gmail.com")
            .port(993)
            .socketType("SSLAuto")
            .authenticationTypes(Arrays.<AuthenticationType>asList(
                "PasswordCleartext",
                "OAuth2"))
            .extraInfo(Arrays.<NameValuePair>asList(
                Models.nameValuePair()
                    .name("Enable: You need to enable IMAP access")
                    .value("https://mail.google.com/mail/?ui=2&shva=1#settings/fwdandpop")
                    .build()))
            .build(),
        Models.emailAccountConfig()
            .displayName("Google Mail")
            .protocolType("SMTP")
            .host("smtp.gmail.com")
            .port(465)
            .socketType("SSLAuto")
            .authenticationTypes(Arrays.<AuthenticationType>asList(
                "PasswordCleartext",
                "OAuth2"))
            .extraInfo(Arrays.<NameValuePair>asList(
                Models.nameValuePair()
                    .name("Enable: You need to enable IMAP access")
                    .value("https://mail.google.com/mail/?ui=2&shva=1#settings/fwdandpop")
                    .build()))
            .build(),
        Models.emailAccountConfig()
            .displayName("Google Mail")
            .protocolType("POP3")
            .host("pop.gmail.com")
            .port(995)
            .socketType("SSLAuto")
            .authenticationTypes(Arrays.<AuthenticationType>asList(
                "PasswordCleartext",
                "OAuth2"))
            .extraInfo(Arrays.<NameValuePair>asList(
                Models.nameValuePair()
                    .name("Enable: You need to enable IMAP access")
                    .value("https://mail.google.com/mail/?ui=2&shva=1#settings/fwdandpop")
                    .build()))
            .build()))
    .build();
```
</details>

### Complete example

<details>
    <summary>Method call example:</summary>

```java
EmailCloud api = new EmailCloud(clientSecret, clientId);

// Prepare parameters:
EmailConfigDiscoverOauthRequest request = Models.emailConfigDiscoverOauthRequest()
    .clientId("ClientId")
    .clientSecret("ClientSecret")
    .refreshToken("RefreshToken")
    .address("example@aspose.com")
    .fastProcessing(true)
    .build();

// Call method:
EmailAccountConfigList result = api.emailConfig().discoverOauth(request);

// Result example:
result = Models.emailAccountConfigList()
    .value(Arrays.<EmailAccountConfig>asList(
        Models.emailAccountConfig()
            .displayName("Google Mail")
            .host("imap.gmail.com")
            .port(993)
            .socketType("SSLAuto")
            .authenticationTypes(Arrays.<AuthenticationType>asList(
                "PasswordCleartext",
                "OAuth2"))
            .extraInfo(Arrays.<NameValuePair>asList(
                Models.nameValuePair()
                    .name("Enable: You need to enable IMAP access")
                    .value("https://mail.google.com/mail/?ui=2&shva=1#settings/fwdandpop")
                    .build()))
            .build(),
        Models.emailAccountConfig()
            .displayName("Google Mail")
            .protocolType("SMTP")
            .host("smtp.gmail.com")
            .port(465)
            .socketType("SSLAuto")
            .authenticationTypes(Arrays.<AuthenticationType>asList(
                "PasswordCleartext",
                "OAuth2"))
            .extraInfo(Arrays.<NameValuePair>asList(
                Models.nameValuePair()
                    .name("Enable: You need to enable IMAP access")
                    .value("https://mail.google.com/mail/?ui=2&shva=1#settings/fwdandpop")
                    .build()))
            .build(),
        Models.emailAccountConfig()
            .displayName("Google Mail")
            .protocolType("POP3")
            .host("pop.gmail.com")
            .port(995)
            .socketType("SSLAuto")
            .authenticationTypes(Arrays.<AuthenticationType>asList(
                "PasswordCleartext",
                "OAuth2"))
            .extraInfo(Arrays.<NameValuePair>asList(
                Models.nameValuePair()
                    .name("Enable: You need to enable IMAP access")
                    .value("https://mail.google.com/mail/?ui=2&shva=1#settings/fwdandpop")
                    .build()))
            .build()))
    .build();
```

</details>

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)
<a name="discoverPassword"></a>
## discoverPassword

Description: Discover email accounts by email address. Validates discovered accounts using login and password.             

Returns: Discovered account configurations.

Method call example:
```java
EmailAccountConfigList result = api.emailConfig().discoverPassword(request);
```

### Parameter: request

Description: Discover email configuration request.

See parameter model documentation at [EmailConfigDiscoverPasswordRequest](EmailConfigDiscoverPasswordRequest.md)

<details>
    <summary>Parameter initialization example:</summary>
    
```java
EmailConfigDiscoverPasswordRequest request = Models.emailConfigDiscoverPasswordRequest()
    .password("password")
    .address("example@aspose.com")
    .fastProcessing(true)
    .build();
```

</details>


### Result

Description: Discovered account configurations.

Return type: [**EmailAccountConfigList**](EmailAccountConfigList.md)

<details>
    <summary>Result example</summary>

```java
result = Models.emailAccountConfigList()
    .value(Arrays.<EmailAccountConfig>asList(
        Models.emailAccountConfig()
            .displayName("Google Mail")
            .host("imap.gmail.com")
            .port(993)
            .socketType("SSLAuto")
            .authenticationTypes(Arrays.<AuthenticationType>asList(
                "PasswordCleartext",
                "OAuth2"))
            .extraInfo(Arrays.<NameValuePair>asList(
                Models.nameValuePair()
                    .name("Enable: You need to enable IMAP access")
                    .value("https://mail.google.com/mail/?ui=2&shva=1#settings/fwdandpop")
                    .build()))
            .build(),
        Models.emailAccountConfig()
            .displayName("Google Mail")
            .protocolType("SMTP")
            .host("smtp.gmail.com")
            .port(465)
            .socketType("SSLAuto")
            .authenticationTypes(Arrays.<AuthenticationType>asList(
                "PasswordCleartext",
                "OAuth2"))
            .extraInfo(Arrays.<NameValuePair>asList(
                Models.nameValuePair()
                    .name("Enable: You need to enable IMAP access")
                    .value("https://mail.google.com/mail/?ui=2&shva=1#settings/fwdandpop")
                    .build()))
            .build(),
        Models.emailAccountConfig()
            .displayName("Google Mail")
            .protocolType("POP3")
            .host("pop.gmail.com")
            .port(995)
            .socketType("SSLAuto")
            .authenticationTypes(Arrays.<AuthenticationType>asList(
                "PasswordCleartext",
                "OAuth2"))
            .extraInfo(Arrays.<NameValuePair>asList(
                Models.nameValuePair()
                    .name("Enable: You need to enable IMAP access")
                    .value("https://mail.google.com/mail/?ui=2&shva=1#settings/fwdandpop")
                    .build()))
            .build()))
    .build();
```
</details>

### Complete example

<details>
    <summary>Method call example:</summary>

```java
EmailCloud api = new EmailCloud(clientSecret, clientId);

// Prepare parameters:
EmailConfigDiscoverPasswordRequest request = Models.emailConfigDiscoverPasswordRequest()
    .password("password")
    .address("example@aspose.com")
    .fastProcessing(true)
    .build();

// Call method:
EmailAccountConfigList result = api.emailConfig().discoverPassword(request);

// Result example:
result = Models.emailAccountConfigList()
    .value(Arrays.<EmailAccountConfig>asList(
        Models.emailAccountConfig()
            .displayName("Google Mail")
            .host("imap.gmail.com")
            .port(993)
            .socketType("SSLAuto")
            .authenticationTypes(Arrays.<AuthenticationType>asList(
                "PasswordCleartext",
                "OAuth2"))
            .extraInfo(Arrays.<NameValuePair>asList(
                Models.nameValuePair()
                    .name("Enable: You need to enable IMAP access")
                    .value("https://mail.google.com/mail/?ui=2&shva=1#settings/fwdandpop")
                    .build()))
            .build(),
        Models.emailAccountConfig()
            .displayName("Google Mail")
            .protocolType("SMTP")
            .host("smtp.gmail.com")
            .port(465)
            .socketType("SSLAuto")
            .authenticationTypes(Arrays.<AuthenticationType>asList(
                "PasswordCleartext",
                "OAuth2"))
            .extraInfo(Arrays.<NameValuePair>asList(
                Models.nameValuePair()
                    .name("Enable: You need to enable IMAP access")
                    .value("https://mail.google.com/mail/?ui=2&shva=1#settings/fwdandpop")
                    .build()))
            .build(),
        Models.emailAccountConfig()
            .displayName("Google Mail")
            .protocolType("POP3")
            .host("pop.gmail.com")
            .port(995)
            .socketType("SSLAuto")
            .authenticationTypes(Arrays.<AuthenticationType>asList(
                "PasswordCleartext",
                "OAuth2"))
            .extraInfo(Arrays.<NameValuePair>asList(
                Models.nameValuePair()
                    .name("Enable: You need to enable IMAP access")
                    .value("https://mail.google.com/mail/?ui=2&shva=1#settings/fwdandpop")
                    .build()))
            .build()))
    .build();
```

</details>

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)
