# MapiCalendarApi (EmailCloud.mapi().calendar())

MAPI calendar operations.

<a name="asCalendarDto"></a>
## asCalendarDto

Description: Converts MAPI calendar model to CalendarDto model.             

Returns: CalendarDto model.

Method call example:
```java
CalendarDto result = api.mapi().calendar().asCalendarDto(mapiCalendarDto);
```

### Parameter: mapiCalendarDto

Description: MAPI calendar model to convert.

See parameter model documentation at [MapiCalendarDto](MapiCalendarDto.md)

<details>
    <summary>Parameter initialization example:</summary>
    
```java
MapiCalendarDto mapiCalendarDto = Models.mapiCalendarDto()
    .attendees(Models.mapiCalendarAttendeesDto()
        .appointmentRecipients(Arrays.<MapiRecipientDto>asList(
            Models.mapiRecipientDto()
                .emailAddress("organizer@aspose.com")
                .addressType("SMTP")
                .displayName("Organizer Name")
                .recipientType("MapiTo")
                .build(),
            Models.mapiRecipientDto()
                .emailAddress("attendee@aspose.com")
                .addressType("SMTP")
                .displayName("Attendee Name")
                .recipientType("MapiTo")
                .build()))
        .build())
    .busyStatus("Tentative")
    .clientIntent(Arrays.<MapiCalendarClientIntent>asList(
        "Manager"))
    .endDate(Calendar.getInstance().getTime())
    .location("Some location")
    .recurrence(Models.mapiCalendarEventRecurrenceDto()
        .recurrencePattern(Models.mapiCalendarDailyRecurrencePatternDto()
            .frequency("Daily")
            .occurrenceCount(10)
            .weekStartDay("Monday")
            .build())
        .build())
    .startDate(Calendar.getInstance().getTime())
    .organizer(Models.mapiElectronicAddressDto()
        .emailAddress("organizer@aspose.com")
        .build())
    .body("Some description")
    .subject("Some summary")
    .build();
```

</details>


### Result

Description: CalendarDto model.

Return type: [**CalendarDto**](CalendarDto.md)

<details>
    <summary>Result example</summary>

```java
result = Models.calendarDto()
    .attendees(Arrays.<MailAddress>asList(
        Models.mailAddress()
            .displayName("Attendee Name")
            .address("attendee@aspose.com")
            .participationStatus("Accepted")
            .build()))
    .description("Some description")
    .endDate(Calendar.getInstance().getTime())
    .location("Some location")
    .organizer(Models.mailAddress()
        .displayName("Organizer Name")
        .address("organizer@aspose.com")
        .build())
    .recurrence(Models.dailyRecurrencePatternDto()
        .interval(-1)
        .occurs(10)
        .weekStart("Monday")
        .build())
    .startDate(Calendar.getInstance().getTime())
    .summary("Some summary")
    .build();
```
</details>

### Complete example

<details>
    <summary>Method call example:</summary>

```java
EmailCloud api = new EmailCloud(appKey, appSid);

// Prepare parameters:
MapiCalendarDto mapiCalendarDto = Models.mapiCalendarDto()
    .attendees(Models.mapiCalendarAttendeesDto()
        .appointmentRecipients(Arrays.<MapiRecipientDto>asList(
            Models.mapiRecipientDto()
                .emailAddress("organizer@aspose.com")
                .addressType("SMTP")
                .displayName("Organizer Name")
                .recipientType("MapiTo")
                .build(),
            Models.mapiRecipientDto()
                .emailAddress("attendee@aspose.com")
                .addressType("SMTP")
                .displayName("Attendee Name")
                .recipientType("MapiTo")
                .build()))
        .build())
    .busyStatus("Tentative")
    .clientIntent(Arrays.<MapiCalendarClientIntent>asList(
        "Manager"))
    .endDate(Calendar.getInstance().getTime())
    .location("Some location")
    .recurrence(Models.mapiCalendarEventRecurrenceDto()
        .recurrencePattern(Models.mapiCalendarDailyRecurrencePatternDto()
            .frequency("Daily")
            .occurrenceCount(10)
            .weekStartDay("Monday")
            .build())
        .build())
    .startDate(Calendar.getInstance().getTime())
    .organizer(Models.mapiElectronicAddressDto()
        .emailAddress("organizer@aspose.com")
        .build())
    .body("Some description")
    .subject("Some summary")
    .build();

// Call method:
CalendarDto result = api.mapi().calendar().asCalendarDto(mapiCalendarDto);

// Result example:
result = Models.calendarDto()
    .attendees(Arrays.<MailAddress>asList(
        Models.mailAddress()
            .displayName("Attendee Name")
            .address("attendee@aspose.com")
            .participationStatus("Accepted")
            .build()))
    .description("Some description")
    .endDate(Calendar.getInstance().getTime())
    .location("Some location")
    .organizer(Models.mailAddress()
        .displayName("Organizer Name")
        .address("organizer@aspose.com")
        .build())
    .recurrence(Models.dailyRecurrencePatternDto()
        .interval(-1)
        .occurs(10)
        .weekStart("Monday")
        .build())
    .startDate(Calendar.getInstance().getTime())
    .summary("Some summary")
    .build();
```

</details>

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)
<a name="asFile"></a>
## asFile

Description: Converts MAPI calendar model to specified format and returns as file.             

Returns: File stream in specified format.

Method call example:
```java
byte[] result = api.mapi().calendar().asFile(request);
```

### Parameter: request

Description: MAPI calendar model to convert.

See parameter model documentation at [MapiCalendarAsFileRequest](MapiCalendarAsFileRequest.md)

<details>
    <summary>Parameter initialization example:</summary>
    
```java
MapiCalendarAsFileRequest request = Models.mapiCalendarAsFileRequest()
    .format("Msg")
    .value(Models.mapiCalendarDto()
        .attendees(Models.mapiCalendarAttendeesDto()
            .appointmentRecipients(Arrays.<MapiRecipientDto>asList(
                Models.mapiRecipientDto()
                    .emailAddress("organizer@aspose.com")
                    .addressType("SMTP")
                    .displayName("Organizer Name")
                    .recipientType("MapiTo")
                    .build(),
                Models.mapiRecipientDto()
                    .emailAddress("attendee@aspose.com")
                    .addressType("SMTP")
                    .displayName("Attendee Name")
                    .recipientType("MapiTo")
                    .build()))
            .build())
        .busyStatus("Tentative")
        .clientIntent(Arrays.<MapiCalendarClientIntent>asList(
            "Manager"))
        .endDate(Calendar.getInstance().getTime())
        .location("Some location")
        .recurrence(Models.mapiCalendarEventRecurrenceDto()
            .recurrencePattern(Models.mapiCalendarDailyRecurrencePatternDto()
                .frequency("Daily")
                .occurrenceCount(10)
                .weekStartDay("Monday")
                .build())
            .build())
        .startDate(Calendar.getInstance().getTime())
        .organizer(Models.mapiElectronicAddressDto()
            .emailAddress("organizer@aspose.com")
            .build())
        .body("Some description")
        .subject("Some summary")
        .build())
    .build();
```

</details>


### Result

Description: File stream in specified format.

Return type: **byte[]**

<details>
    <summary>Result example</summary>

```java
result = ;
```
</details>

### Complete example

<details>
    <summary>Method call example:</summary>

```java
EmailCloud api = new EmailCloud(appKey, appSid);

// Prepare parameters:
MapiCalendarAsFileRequest request = Models.mapiCalendarAsFileRequest()
    .format("Msg")
    .value(Models.mapiCalendarDto()
        .attendees(Models.mapiCalendarAttendeesDto()
            .appointmentRecipients(Arrays.<MapiRecipientDto>asList(
                Models.mapiRecipientDto()
                    .emailAddress("organizer@aspose.com")
                    .addressType("SMTP")
                    .displayName("Organizer Name")
                    .recipientType("MapiTo")
                    .build(),
                Models.mapiRecipientDto()
                    .emailAddress("attendee@aspose.com")
                    .addressType("SMTP")
                    .displayName("Attendee Name")
                    .recipientType("MapiTo")
                    .build()))
            .build())
        .busyStatus("Tentative")
        .clientIntent(Arrays.<MapiCalendarClientIntent>asList(
            "Manager"))
        .endDate(Calendar.getInstance().getTime())
        .location("Some location")
        .recurrence(Models.mapiCalendarEventRecurrenceDto()
            .recurrencePattern(Models.mapiCalendarDailyRecurrencePatternDto()
                .frequency("Daily")
                .occurrenceCount(10)
                .weekStartDay("Monday")
                .build())
            .build())
        .startDate(Calendar.getInstance().getTime())
        .organizer(Models.mapiElectronicAddressDto()
            .emailAddress("organizer@aspose.com")
            .build())
        .body("Some description")
        .subject("Some summary")
        .build())
    .build();

// Call method:
byte[] result = api.mapi().calendar().asFile(request);

// Result example:
result = ;
```

</details>

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)
<a name="fromFile"></a>
## fromFile

Description: Converts calendar file to a MAPI model representation.             

Returns: MAPI model.

Method call example:
```java
MapiCalendarDto result = api.mapi().calendar().fromFile(request);
```


### Parameter: request

Description: fromFile method request.

See parameter model documentation at [MapiCalendarFromFileRequest](MapiCalendarFromFileRequest.md)

<details>
    <summary>Parameter initialization example:</summary>

```java
MapiCalendarFromFileRequest request = Models.mapiCalendarFromFileRequest()
    .file(IOUtils.toByteArray(new FileInputStream("/path/to/calendar.msg")))
    .build();
```

</details>

### Result

Description: MAPI model.

Return type: [**MapiCalendarDto**](MapiCalendarDto.md)

<details>
    <summary>Result example</summary>

```java
result = Models.mapiCalendarDto()
    .attendees(Models.mapiCalendarAttendeesDto()
        .appointmentRecipients(Arrays.<MapiRecipientDto>asList(
            Models.mapiRecipientDto()
                .emailAddress("organizer@aspose.com")
                .addressType("SMTP")
                .displayName("Organizer Name")
                .recipientType("MapiTo")
                .build(),
            Models.mapiRecipientDto()
                .emailAddress("attendee@aspose.com")
                .addressType("SMTP")
                .displayName("Attendee Name")
                .recipientType("MapiTo")
                .build()))
        .build())
    .busyStatus("Tentative")
    .clientIntent(Arrays.<MapiCalendarClientIntent>asList(
        "Manager"))
    .endDate(Calendar.getInstance().getTime())
    .location("Some location")
    .recurrence(Models.mapiCalendarEventRecurrenceDto()
        .recurrencePattern(Models.mapiCalendarDailyRecurrencePatternDto()
            .frequency("Daily")
            .occurrenceCount(10)
            .weekStartDay("Monday")
            .build())
        .build())
    .startDate(Calendar.getInstance().getTime())
    .organizer(Models.mapiElectronicAddressDto()
        .emailAddress("organizer@aspose.com")
        .build())
    .body("Some description")
    .subject("Some summary")
    .build();
```
</details>

### Complete example

<details>
    <summary>Method call example:</summary>

```java
EmailCloud api = new EmailCloud(appKey, appSid);

// Prepare parameters:
MapiCalendarFromFileRequest request = Models.mapiCalendarFromFileRequest()
    .file(IOUtils.toByteArray(new FileInputStream("/path/to/calendar.msg")))
    .build();

// Call method:
MapiCalendarDto result = api.mapi().calendar().fromFile(request);

// Result example:
result = Models.mapiCalendarDto()
    .attendees(Models.mapiCalendarAttendeesDto()
        .appointmentRecipients(Arrays.<MapiRecipientDto>asList(
            Models.mapiRecipientDto()
                .emailAddress("organizer@aspose.com")
                .addressType("SMTP")
                .displayName("Organizer Name")
                .recipientType("MapiTo")
                .build(),
            Models.mapiRecipientDto()
                .emailAddress("attendee@aspose.com")
                .addressType("SMTP")
                .displayName("Attendee Name")
                .recipientType("MapiTo")
                .build()))
        .build())
    .busyStatus("Tentative")
    .clientIntent(Arrays.<MapiCalendarClientIntent>asList(
        "Manager"))
    .endDate(Calendar.getInstance().getTime())
    .location("Some location")
    .recurrence(Models.mapiCalendarEventRecurrenceDto()
        .recurrencePattern(Models.mapiCalendarDailyRecurrencePatternDto()
            .frequency("Daily")
            .occurrenceCount(10)
            .weekStartDay("Monday")
            .build())
        .build())
    .startDate(Calendar.getInstance().getTime())
    .organizer(Models.mapiElectronicAddressDto()
        .emailAddress("organizer@aspose.com")
        .build())
    .body("Some description")
    .subject("Some summary")
    .build();
```

</details>

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

<a name="get"></a>
## get

Description: Get MAPI calendar document.             

Returns: MAPI Calendar model.

Method call example:
```java
MapiCalendarDto result = api.mapi().calendar().get(request);
```


### Parameter: request

Description: get method request.

See parameter model documentation at [MapiCalendarGetRequest](MapiCalendarGetRequest.md)

<details>
    <summary>Parameter initialization example:</summary>

```java
MapiCalendarGetRequest request = Models.mapiCalendarGetRequest()
    .fileName("calendar.msg")
    .folder("calendar/location/on/storage")
    .storage("First Storage")
    .build();
```

</details>

### Result

Description: MAPI Calendar model.

Return type: [**MapiCalendarDto**](MapiCalendarDto.md)

<details>
    <summary>Result example</summary>

```java
result = Models.mapiCalendarDto()
    .attendees(Models.mapiCalendarAttendeesDto()
        .appointmentRecipients(Arrays.<MapiRecipientDto>asList(
            Models.mapiRecipientDto()
                .emailAddress("organizer@aspose.com")
                .addressType("SMTP")
                .displayName("Organizer Name")
                .recipientType("MapiTo")
                .build(),
            Models.mapiRecipientDto()
                .emailAddress("attendee@aspose.com")
                .addressType("SMTP")
                .displayName("Attendee Name")
                .recipientType("MapiTo")
                .build()))
        .build())
    .busyStatus("Tentative")
    .clientIntent(Arrays.<MapiCalendarClientIntent>asList(
        "Manager"))
    .endDate(Calendar.getInstance().getTime())
    .location("Some location")
    .recurrence(Models.mapiCalendarEventRecurrenceDto()
        .recurrencePattern(Models.mapiCalendarDailyRecurrencePatternDto()
            .frequency("Daily")
            .occurrenceCount(10)
            .weekStartDay("Monday")
            .build())
        .build())
    .startDate(Calendar.getInstance().getTime())
    .organizer(Models.mapiElectronicAddressDto()
        .emailAddress("organizer@aspose.com")
        .build())
    .body("Some description")
    .subject("Some summary")
    .build();
```
</details>

### Complete example

<details>
    <summary>Method call example:</summary>

```java
EmailCloud api = new EmailCloud(appKey, appSid);

// Prepare parameters:
MapiCalendarGetRequest request = Models.mapiCalendarGetRequest()
    .fileName("calendar.msg")
    .folder("calendar/location/on/storage")
    .storage("First Storage")
    .build();

// Call method:
MapiCalendarDto result = api.mapi().calendar().get(request);

// Result example:
result = Models.mapiCalendarDto()
    .attendees(Models.mapiCalendarAttendeesDto()
        .appointmentRecipients(Arrays.<MapiRecipientDto>asList(
            Models.mapiRecipientDto()
                .emailAddress("organizer@aspose.com")
                .addressType("SMTP")
                .displayName("Organizer Name")
                .recipientType("MapiTo")
                .build(),
            Models.mapiRecipientDto()
                .emailAddress("attendee@aspose.com")
                .addressType("SMTP")
                .displayName("Attendee Name")
                .recipientType("MapiTo")
                .build()))
        .build())
    .busyStatus("Tentative")
    .clientIntent(Arrays.<MapiCalendarClientIntent>asList(
        "Manager"))
    .endDate(Calendar.getInstance().getTime())
    .location("Some location")
    .recurrence(Models.mapiCalendarEventRecurrenceDto()
        .recurrencePattern(Models.mapiCalendarDailyRecurrencePatternDto()
            .frequency("Daily")
            .occurrenceCount(10)
            .weekStartDay("Monday")
            .build())
        .build())
    .startDate(Calendar.getInstance().getTime())
    .organizer(Models.mapiElectronicAddressDto()
        .emailAddress("organizer@aspose.com")
        .build())
    .body("Some description")
    .subject("Some summary")
    .build();
```

</details>

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

<a name="save"></a>
## save

Description: Save MAPI Calendar to storage.             

Returns: Returns 200 if update is successful.

Method call example:
```java
api.mapi().calendar().save(request);
```

### Parameter: request

Description: Calendar create/update request.

See parameter model documentation at [MapiCalendarSaveRequest](MapiCalendarSaveRequest.md)

<details>
    <summary>Parameter initialization example:</summary>
    
```java
MapiCalendarSaveRequest request = Models.mapiCalendarSaveRequest()
    .format("Msg")
    .storageFile(Models.storageFileLocation()
        .fileName("calendar.msg")
        .storage("First Storage")
        .folderPath("file/location/folder/on/storage")
        .build())
    .value(Models.mapiCalendarDto()
        .attendees(Models.mapiCalendarAttendeesDto()
            .appointmentRecipients(Arrays.<MapiRecipientDto>asList(
                Models.mapiRecipientDto()
                    .emailAddress("organizer@aspose.com")
                    .addressType("SMTP")
                    .displayName("Organizer Name")
                    .recipientType("MapiTo")
                    .build(),
                Models.mapiRecipientDto()
                    .emailAddress("attendee@aspose.com")
                    .addressType("SMTP")
                    .displayName("Attendee Name")
                    .recipientType("MapiTo")
                    .build()))
            .build())
        .busyStatus("Tentative")
        .clientIntent(Arrays.<MapiCalendarClientIntent>asList(
            "Manager"))
        .endDate(Calendar.getInstance().getTime())
        .location("Some location")
        .recurrence(Models.mapiCalendarEventRecurrenceDto()
            .recurrencePattern(Models.mapiCalendarDailyRecurrencePatternDto()
                .frequency("Daily")
                .occurrenceCount(10)
                .weekStartDay("Monday")
                .build())
            .build())
        .startDate(Calendar.getInstance().getTime())
        .organizer(Models.mapiElectronicAddressDto()
            .emailAddress("organizer@aspose.com")
            .build())
        .body("Some description")
        .subject("Some summary")
        .build())
    .build();
```

</details>


### Result

Description: Returns 200 if update is successful.

Return type: void (empty response body)

<details>
    <summary>Result example</summary>

```java
result = ;
```
</details>

### Complete example

<details>
    <summary>Method call example:</summary>

```java
EmailCloud api = new EmailCloud(appKey, appSid);

// Prepare parameters:
MapiCalendarSaveRequest request = Models.mapiCalendarSaveRequest()
    .format("Msg")
    .storageFile(Models.storageFileLocation()
        .fileName("calendar.msg")
        .storage("First Storage")
        .folderPath("file/location/folder/on/storage")
        .build())
    .value(Models.mapiCalendarDto()
        .attendees(Models.mapiCalendarAttendeesDto()
            .appointmentRecipients(Arrays.<MapiRecipientDto>asList(
                Models.mapiRecipientDto()
                    .emailAddress("organizer@aspose.com")
                    .addressType("SMTP")
                    .displayName("Organizer Name")
                    .recipientType("MapiTo")
                    .build(),
                Models.mapiRecipientDto()
                    .emailAddress("attendee@aspose.com")
                    .addressType("SMTP")
                    .displayName("Attendee Name")
                    .recipientType("MapiTo")
                    .build()))
            .build())
        .busyStatus("Tentative")
        .clientIntent(Arrays.<MapiCalendarClientIntent>asList(
            "Manager"))
        .endDate(Calendar.getInstance().getTime())
        .location("Some location")
        .recurrence(Models.mapiCalendarEventRecurrenceDto()
            .recurrencePattern(Models.mapiCalendarDailyRecurrencePatternDto()
                .frequency("Daily")
                .occurrenceCount(10)
                .weekStartDay("Monday")
                .build())
            .build())
        .startDate(Calendar.getInstance().getTime())
        .organizer(Models.mapiElectronicAddressDto()
            .emailAddress("organizer@aspose.com")
            .build())
        .body("Some description")
        .subject("Some summary")
        .build())
    .build();

// Call method:
api.mapi().calendar().save(request);
```

</details>

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)
