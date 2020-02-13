
# com.aspose.email.cloud.sdk.model.EmailAccountConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | Email account display name              |  [optional]
**type** | **String** | Type of connection protocol. Enum, available values: IMAP, POP3, SMTP, EWS, WebDav | 
**host** | **String** | Email account host.              |  [optional]
**port** | **Integer** | Port.              |  [optional]
**socketType** | **String** | Enum, available values: None, SSLExplicit, SSLImplicit, SSLAuto, Auto | 
**authenticationTypes** | **List&lt;String&gt;** | Supported authentication types.              Items: Email account authentication types. Enum, available values: NoAuth, OAuth2, PasswordCleartext, PasswordEncrypted, SmtpAfterPop, ClientIpAddress |  [optional]
**extraInfo** | [**List&lt;NameValuePair&gt;**](NameValuePair.md) | Extra account information.              |  [optional]
**isValidated** | **Boolean** | Determines that configuration validated. Set to false if validation skipped.              | 


[[Back to Model list]](README.md#documentation-for-models) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to API README]](README.md)
