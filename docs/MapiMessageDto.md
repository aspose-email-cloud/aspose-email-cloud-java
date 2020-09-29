
# MapiMessageDto

Represents an Outlook Message format document.             

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**messageBody** | **String** | Message text              |  [optional]
**clientSubmitTime** | [**Date**](Date.md) | Date and time the message sender submitted a message.              | 
**conversationTopic** | **String** | Topic of the first message in a conversation thread.              |  [optional]
**deliveryTime** | [**Date**](Date.md) | Date and time a message was delivered.              | 
**displayBcc** | **String** | List of the display names of any blind carbon copy (BCC) message recipients, separated by semicolons (;).              |  [optional]
**displayCc** | **String** | List of the display names of any carbon copy (CC) message recipients, separated by semicolons (;).              |  [optional]
**displayName** | **String** | Display name for the message.              |  [optional]
**displayNamePrefix** | **String** | Prefix of the display name.              |  [optional]
**displayTo** | **String** | List of the display names of the primary (To) message recipients, separated by semicolons (;).              |  [optional]
**flags** | **List&lt;String&gt;** | Message flags.              Items: Mapi message flags. Enum, available values: MsgFlagZero, MsgFlagRead, MsgFlagUnmodified, MsgFlagSubmit, MsgFlagUnsent, MsgFlagHasAttach, MsgFlagFromMe, MsgFlagAssociated, MsgFlagResend, MsgFlagNotifyRead, MsgFlagNotifyUnread, MsgFlagEverRead, MsgFlagOriginX400, MsgFlagOriginInternet, MsgFlagOriginMiscExt |  [optional]
**headers** | **Map&lt;String, String&gt;** | Transport message headers              |  [optional]
**internetMessageId** | **String** | Internet message id of the message.              |  [optional]
**messageFormat** | **String** | Represents outlook message format. Enum, available values: Ascii, Unicode | 
**normalizedSubject** | **String** | Normalized subject of the message.              |  [optional]
**readReceiptRequested** | **Boolean** | Value indicating whether the read receipt is requested. | 
**replyTo** | **String** | Reply to names. |  [optional]
**senderAddressType** | **String** | Message sender&#39;s e-mail address type. |  [optional]
**senderEmailAddress** | **String** | Message sender&#39;s e-mail address. |  [optional]
**senderName** | **String** | Message sender&#39;s display name. |  [optional]
**senderSmtpAddress** | **String** | Message sender&#39;s e-mail address. |  [optional]
**sentRepresentingAddressType** | **String** | Address type for the messaging user represented by the sender. |  [optional]
**sentRepresentingEmailAddress** | **String** | E-mail address for the messaging user represented by the sender. |  [optional]
**sentRepresentingName** | **String** | Display name for the messaging user represented by the sender. |  [optional]
**sentRepresentingSmtpAddress** | **String** | E-mail address for the messaging user represented by the sender. |  [optional]
**transportMessageHeaders** | **String** | Transport-specific message envelope information. |  [optional]

## Parent class

See: [MapiMessageItemBaseDto](MapiMessageItemBaseDto.md)


## Example
```java
MapiMessageDto mapiMessageDto = Models.mapiMessageDto()
    .messageBody("Some body")
    .clientSubmitTime(Calendar.getInstance().getTime())
    .deliveryTime(Calendar.getInstance().getTime())
    .displayTo("To Address")
    .flags(Arrays.<MapiMessageFlag>asList(
        "MsgFlagRead",
        "MsgFlagUnsent",
        "MsgFlagHasAttach"))
    .normalizedSubject("Some subject")
    .senderAddressType("SMTP")
    .senderEmailAddress("from@aspose.com")
    .senderName("From Address")
    .senderSmtpAddress("from@aspose.com")
    .attachments(Arrays.<MapiAttachmentDto>asList(
        Models.mapiAttachmentDto()
            .name("some-file.txt")
            .dataBase64("U29tZSBmaWxlIHRleHQ=")
            .build()))
    .body("Some body")
    .messageClass("IPM.Note")
    .recipients(Arrays.<MapiRecipientDto>asList(
        Models.mapiRecipientDto()
            .emailAddress("to@aspose.com")
            .addressType("SMTP")
            .displayName("To Address")
            .recipientType("MapiTo")
            .build()))
    .subject("Re: Some subject")
    .subjectPrefix("Re: ")
    .build();
```


[[Back to Model list]](Models.md) [[Back to API README]](README.md)

