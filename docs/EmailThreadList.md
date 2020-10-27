# EmailThreadList

List of email threads             

## Properties
Class has no properties

## Parent class

See: [ListResponseOfEmailThread](ListResponseOfEmailThread.md)


## Example
```java
EmailThreadList emailThreadList = Models.emailThreadList()
    .value(Arrays.<EmailThread>asList(
        Models.emailThread()
            .id("123")
            .subject("Some email subject")
            .messages(Arrays.<EmailDto>asList(
                Models.emailDto()
                    .date(Calendar.getInstance().getTime())
                    .from(Models.mailAddress()
                        .address("from@aspose.com")
                        .build())
                    .messageId("1")
                    .subject("Some email subject")
                    .to(Arrays.<MailAddress>asList(
                        Models.mailAddress()
                            .address("to@aspose.com")
                            .build()))
                    .build(),
                Models.emailDto()
                    .date(Calendar.getInstance().getTime())
                    .from(Models.mailAddress()
                        .address("from@aspose.com")
                        .build())
                    .messageId("3")
                    .subject("Re: Some email subject")
                    .to(Arrays.<MailAddress>asList(
                        Models.mailAddress()
                            .address("to@aspose.com")
                            .build()))
                    .build()))
            .build()))
    .build();
```


[[Back to Model list]](Models.md) [[Back to API README]](README.md)
