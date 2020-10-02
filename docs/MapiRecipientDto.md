# MapiRecipientDto

Represents the recipient information in the Microsoft Outlook Message.             

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**emailAddress** | **String** | Email address of the message recipient or sender.              |  [optional]
**addressType** | **String** | Type of the address of the message recipient or sender.              |  [optional]
**displayName** | **String** | Display name of the message recipient or sender.              |  [optional]
**recipientType** | **String** | Represent the PR_RECIPIENT_TYPE property which contains the recipient type for a message recipient. Enum, available values: Unknown, MapiBcc, MapiCc, MapiP1, MapiSubmitted, MapiTo | 



## Example
```java
MapiRecipientDto mapiRecipientDto = Models.mapiRecipientDto()
    .emailAddress("to@aspose.com")
    .addressType("SMTP")
    .displayName("To Address")
    .recipientType("MapiTo")
    .build();
```


[[Back to Model list]](Models.md) [[Back to API README]](README.md)
