# EmailAccountConfigList

List of email accounts             

## Properties
Class has no properties

## Parent class

See: [ListResponseOfEmailAccountConfig](ListResponseOfEmailAccountConfig.md)


## Example
```java
EmailAccountConfigList emailAccountConfigList = Models.emailAccountConfigList()
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


[[Back to Model list]](Models.md) [[Back to API README]](README.md)
