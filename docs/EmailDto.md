
# com.aspose.email.cloud.sdk.model.EmailDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**alternateViews** | [**List&lt;AlternateView&gt;**](AlternateView.md) | Collection of alternate views of message.              |  [optional]
**attachments** | [**List&lt;Attachment&gt;**](Attachment.md) | Email message attachments.              |  [optional]
**bcc** | [**List&lt;MailAddress&gt;**](MailAddress.md) | BCC recipients.              |  [optional]
**body** | **String** | Email message body as plain text.              |  [optional]
**bodyEncoding** | **String** | Body encoding.              |  [optional]
**bodyType** | **String** | The content type of message body. Enum, available values: PlainText, Html, Rtf | 
**cc** | [**List&lt;MailAddress&gt;**](MailAddress.md) | CC recipients.              |  [optional]
**date** | [**Date**](Date.md) | Message date.              | 
**deliveryNotificationOptions** | **List&lt;String&gt;** | Delivery notifications. Items: Email delivery notification options. Enum, available values: Delay, Never, None, OnFailure, OnSuccess |  [optional]
**from** | [**MailAddress**](MailAddress.md) | From address.              |  [optional]
**headers** | **Map&lt;String, String&gt;** | Document headers.              |  [optional]
**htmlBody** | **String** | HTML body.              |  [optional]
**htmlBodyText** | **String** | Html body as plain text. Read only.              |  [optional]
**isBodyHtml** | **Boolean** | Indicates whether the message body is in Html.              | 
**isDraft** | **Boolean** | Indicates whether or not a message has been sent.              | 
**isEncrypted** | **Boolean** | Indicates whether the message is encrypted. Read only.              | 
**isSigned** | **Boolean** | Indicates whether the message is signed. Read only.              | 
**linkedResources** | [**List&lt;LinkedResource&gt;**](LinkedResource.md) | Linked resources of message.              |  [optional]
**messageId** | **String** | Message id.              |  [optional]
**originalIsTnef** | **Boolean** | Indicates whether original EML message is in TNEF format. Read only.              | 
**preferredTextEncoding** | **String** | Preferred encoding.              |  [optional]
**priority** | **String** | Email priority status. Enum, available values: High, Low, Normal | 
**readReceiptTo** | [**List&lt;MailAddress&gt;**](MailAddress.md) | Read receipt addresses.              |  [optional]
**replyToList** | [**List&lt;MailAddress&gt;**](MailAddress.md) | The list of addresses to reply to for the mail message.              |  [optional]
**reversePath** | [**MailAddress**](MailAddress.md) | ReversePath address.              |  [optional]
**sender** | [**MailAddress**](MailAddress.md) | Sender address.              |  [optional]
**sensitivity** | **String** | Specifies the sensitivity of a MailMessage. Enum, available values: None, Normal, Personal, Private, CompanyConfidential | 
**subject** | **String** | Message subject.              |  [optional]
**subjectEncoding** | **String** | Subject encoding.              |  [optional]
**timeZoneOffset** | **Long** | Coordinated Universal Time (UTC) offset for the message dates. This property defines the time zone difference, between the local time and UTC represented as count of ticks (10 000 per millisecond).              |  [optional]
**to** | [**List&lt;MailAddress&gt;**](MailAddress.md) | The address collection that contains the recipients of message.              |  [optional]
**xMailer** | **String** | The X-Mailer the software that created the e-mail message.              |  [optional]


    
    


    
    


    
    


    
    


    
    


    
    


    
    


    
    


    
    


    
    


    
    


    
    


    
    


    
    


    
    


    
    


    
    


    
    


    
    


    
    


    
    


    
    


    
    


    
    


    
    


    
    


    
    


    
    


    
    


    
    


    
    


    
    


[[Back to Model list]](README.md#documentation-for-models) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to API README]](README.md)

