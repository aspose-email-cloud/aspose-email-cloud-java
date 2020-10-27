# MapiMessageItemBaseDto

Base Dto for MapiMessage, MapiCalendar or MapiContact             

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attachments** | [**List&lt;MapiAttachmentDto&gt;**](MapiAttachmentDto.md) | Message item attachments.              |  [optional]
**billing** | **String** | Billing information associated with an item.              |  [optional]
**body** | **String** | Message text.              |  [optional]
**bodyHtml** | **String** | Gets the BodyRtf of the message converted to HTML, if present, otherwise an empty string.              |  [optional]
**bodyRtf** | **String** | RTF formatted message text.              |  [optional]
**bodyType** | **String** | The content type of message body. Enum, available values: PlainText, Html, Rtf | 
**categories** | **List&lt;String&gt;** | Contains keywords or categories for the message object.              |  [optional]
**companies** | **List&lt;String&gt;** | Contains the names of the companies that are associated with an item.              |  [optional]
**itemId** | **String** | The item id, uses with a server.              |  [optional]
**messageClass** | **String** | Case-sensitive string that identifies the sender-defined message class, such as IPM.Note. The message class specifies the type, purpose, or content of the message.              |  [optional]
**mileage** | **String** | Contains the mileage information that is associated with an item.              |  [optional]
**recipients** | [**List&lt;MapiRecipientDto&gt;**](MapiRecipientDto.md) | Recipients of the message.              |  [optional]
**sensitivity** | **String** | Contains values that indicate the message sensitivity. Enum, available values: None, Personal, Private, CompanyConfidential | 
**subject** | **String** | Subject of the message.              |  [optional]
**subjectPrefix** | **String** | Subject prefix that typically indicates some action on a message, such as \&quot;FW: \&quot; for forwarding.              |  [optional]
**properties** | [**List&lt;MapiPropertyDto&gt;**](MapiPropertyDto.md) | List of MAPI properties              |  [optional]
**discriminator** | **String** |  | 




[[Back to Model list]](Models.md) [[Back to API README]](README.md)
