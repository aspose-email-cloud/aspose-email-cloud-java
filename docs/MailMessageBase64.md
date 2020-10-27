# MailMessageBase64

Email message represented as file, encoded to Base64 format.             

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**valueBase64** | **String** | Email message file data encoded to Base64 string.              | 
**format** | **String** | Email document format. Enum, available values: Eml, Msg, MsgUnicode, Mhtml, Html, Tnef, Oft | 

## Parent class

See: [MailMessageBase](MailMessageBase.md)


## Example
```java
MailMessageBase64 mailMessageBase64 = Models.mailMessageBase64()
    .valueBase64("RnJvbTogZkBmLnVzClRvOiB0QHQudXMKU3ViamVjdDogUwoKQm9keQ==")
    .build();
```


[[Back to Model list]](Models.md) [[Back to API README]](README.md)
