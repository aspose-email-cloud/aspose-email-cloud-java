
# com.aspose.email.cloud.sdk.model.MapiCalendarExceptionInfoDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attachments** | [**List&lt;MapiAttachmentDto&gt;**](MapiAttachmentDto.md) | Attachments in the recurrence exception.              |  [optional]
**body** | **String** | Body.              |  [optional]
**busyStatus** | **String** | Enumerates the mapi calendar possible busy status Enum, available values: Free, Tentative, Busy, OutOfOffice | 
**endDateTime** | [**Date**](Date.md) | End date.              | 
**hasAttachment** | **Boolean** | Value of this field specifies whether the Exception Embedded Message object contains attachments.              | 
**location** | **String** | Location.              |  [optional]
**meetingType** | **String** | Enumerates the appointment state Enum, available values: Meeting, Received, Canceled | 
**originalStartDate** | [**Date**](Date.md) | Original start date.              | 
**overrideFlags** | **List&lt;String&gt;** | Override flags.              Items: Specifies what data in the MapiCalendarOverride structure has a value different from the recurring series. Enum, available values: Subject, MeetingType, ReminderDelta, Reminder, Location, BusyStatus, Attachment, Subtype, AppointmentColor, ExceptionalBody |  [optional]
**reminderDelta** | **Integer** | Reminder delta.              | 
**reminderSet** | **Boolean** | Value for the PidLidReminderSet property.              | 
**startDateTime** | [**Date**](Date.md) | Start date.              | 
**subject** | **String** | Subject.              |  [optional]
**subType** | **Integer** | SubType.              | 


[[Back to Model list]](README.md#documentation-for-models) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to API README]](README.md)

