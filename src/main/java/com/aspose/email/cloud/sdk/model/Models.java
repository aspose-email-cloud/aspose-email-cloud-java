/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="Models.java">
*   Copyright (c) 2018-2023 Aspose Pty Ltd. All rights reserved.
* </copyright>
* <summary>
*   Permission is hereby granted, free of charge, to any person obtaining a copy
*  of this software and associated documentation files (the "Software"), to deal
*  in the Software without restriction, including without limitation the rights
*  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
*  copies of the Software, and to permit persons to whom the Software is
*  furnished to do so, subject to the following conditions:
* 
*  The above copyright notice and this permission notice shall be included in all
*  copies or substantial portions of the Software.
* 
*  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
*  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
*  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
*  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
*  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
*  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
*  SOFTWARE.
* </summary>
* --------------------------------------------------------------------------------------------------------------------
*/

package com.aspose.email.cloud.sdk.model;

public class Models {
    /**
     * Image for recognition             
     */
    public static AiBcrImageBuilder aiBcrImage() {
        return new AiBcrImageBuilder(new AiBcrImage());
    }
    /**
     * Recognition options.             
     */
    public static AiBcrOptionsBuilder aiBcrOptions() {
        return new AiBcrOptionsBuilder(new AiBcrOptions());
    }
    /**
     * Parse business card images from Storage request             
     */
    public static AiBcrParseStorageRequestBuilder aiBcrParseStorageRequest() {
        return new AiBcrParseStorageRequestBuilder(new AiBcrParseStorageRequest());
    }
    /**
     * Parsed name component             
     */
    public static AiNameComponentBuilder aiNameComponent() {
        return new AiNameComponentBuilder(new AiNameComponent());
    }
    /**
     * AiName cultural context             
     */
    public static AiNameCulturalContextBuilder aiNameCulturalContext() {
        return new AiNameCulturalContextBuilder(new AiNameCulturalContext());
    }
    /**
     * Extracted name             
     */
    public static AiNameExtractedBuilder aiNameExtracted() {
        return new AiNameExtractedBuilder(new AiNameExtracted());
    }
    /**
     * Extracted name component             
     */
    public static AiNameExtractedComponentBuilder aiNameExtractedComponent() {
        return new AiNameExtractedComponentBuilder(new AiNameExtractedComponent());
    }
    /**
     * Formatted name             
     */
    public static AiNameFormattedBuilder aiNameFormatted() {
        return new AiNameFormattedBuilder(new AiNameFormatted());
    }
    /**
     * Name gender hypothesis             
     */
    public static AiNameGenderHypothesisBuilder aiNameGenderHypothesis() {
        return new AiNameGenderHypothesisBuilder(new AiNameGenderHypothesis());
    }
    /**
     * Two names match result             
     */
    public static AiNameMatchResultBuilder aiNameMatchResult() {
        return new AiNameMatchResultBuilder(new AiNameMatchResult());
    }
    /**
     * Names mismatch detailed description             
     */
    public static AiNameMismatchBuilder aiNameMismatch() {
        return new AiNameMismatchBuilder(new AiNameMismatch());
    }
    /**
     * Parsed name request model             
     */
    public static AiNameParsedRequestBuilder aiNameParsedRequest() {
        return new AiNameParsedRequestBuilder(new AiNameParsedRequest());
    }
    /**
     * Name with score             
     */
    public static AiNameWeightedBuilder aiNameWeighted() {
        return new AiNameWeightedBuilder(new AiNameWeighted());
    }
    /**
     * Name variants             
     */
    public static AiNameWeightedVariantsBuilder aiNameWeightedVariants() {
        return new AiNameWeightedVariantsBuilder(new AiNameWeightedVariants());
    }
    /**
     * Describes associated person.             
     */
    public static AssociatedPersonBuilder associatedPerson() {
        return new AssociatedPersonBuilder(new AssociatedPerson());
    }
    /**
     * AttachmentBase class             
     */
    public static AttachmentBaseBuilder attachmentBase() {
        return new AttachmentBaseBuilder(new AttachmentBase());
    }
    /**
     * Convert iCalendar to AlternateView request             
     */
    public static CalendarAsAlternateRequestBuilder calendarAsAlternateRequest() {
        return new CalendarAsAlternateRequestBuilder(new CalendarAsAlternateRequest());
    }
    /**
     * iCalendar model to file request.             
     */
    public static CalendarAsFileRequestBuilder calendarAsFileRequest() {
        return new CalendarAsFileRequestBuilder(new CalendarAsFileRequest());
    }
    /**
     * iCalendar document representation.             
     */
    public static CalendarDtoBuilder calendarDto() {
        return new CalendarDtoBuilder(new CalendarDto());
    }
    /**
     * Provides a grouping of component properties that define an alarm.             
     */
    public static CalendarReminderBuilder calendarReminder() {
        return new CalendarReminderBuilder(new CalendarReminder());
    }
    /**
     * Base request for Email client. Stores information about email account location.             
     */
    public static ClientAccountBaseRequestBuilder clientAccountBaseRequest() {
        return new ClientAccountBaseRequestBuilder(new ClientAccountBaseRequest());
    }
    /**
     * Convert contact model to file request.             
     */
    public static ContactAsFileRequestBuilder contactAsFileRequest() {
        return new ContactAsFileRequestBuilder(new ContactAsFileRequest());
    }
    /**
     * VCard document representation.             
     */
    public static ContactDtoBuilder contactDto() {
        return new ContactDtoBuilder(new ContactDto());
    }
    /**
     * Person&#39;s photo.             
     */
    public static ContactPhotoBuilder contactPhoto() {
        return new ContactPhotoBuilder(new ContactPhoto());
    }
    /**
     * Represents a Content-Type header.             
     */
    public static ContentTypeBuilder contentType() {
        return new ContentTypeBuilder(new ContentType());
    }
    /**
     * Content-Type header parameter             
     */
    public static ContentTypeParameterBuilder contentTypeParameter() {
        return new ContentTypeParameterBuilder(new ContentTypeParameter());
    }
    /**
     * Event.             
     */
    public static CustomerEventBuilder customerEvent() {
        return new CustomerEventBuilder(new CustomerEvent());
    }
    /**
     * Class for disc space information.
     */
    public static DiscUsageBuilder discUsage() {
        return new DiscUsageBuilder(new DiscUsage());
    }
    /**
     * Discover email configuration request.             
     */
    public static DiscoverEmailConfigRequestBuilder discoverEmailConfigRequest() {
        return new DiscoverEmailConfigRequestBuilder(new DiscoverEmailConfigRequest());
    }
    /**
     * Email account configuration.             
     */
    public static EmailAccountConfigBuilder emailAccountConfig() {
        return new EmailAccountConfigBuilder(new EmailAccountConfig());
    }
    /**
     * Email address.             
     */
    public static EmailAddressBuilder emailAddress() {
        return new EmailAddressBuilder(new EmailAddress());
    }
    /**
     * Convert email model to file request.             
     */
    public static EmailAsFileRequestBuilder emailAsFileRequest() {
        return new EmailAsFileRequestBuilder(new EmailAsFileRequest());
    }
    /**
     * A universal email client account             
     */
    public static EmailClientAccountBuilder emailClientAccount() {
        return new EmailClientAccountBuilder(new EmailClientAccount());
    }
    /**
     * Represents email client account credentials             
     */
    public static EmailClientAccountCredentialsBuilder emailClientAccountCredentials() {
        return new EmailClientAccountCredentialsBuilder(new EmailClientAccountCredentials());
    }
    /**
     * Email client virtual account, which contains several accounts             
     */
    public static EmailClientMultiAccountBuilder emailClientMultiAccount() {
        return new EmailClientMultiAccountBuilder(new EmailClientMultiAccount());
    }
    /**
     * Email message representation.             
     */
    public static EmailDtoBuilder emailDto() {
        return new EmailDtoBuilder(new EmailDto());
    }
    /**
     * Email messages thread             
     */
    public static EmailThreadBuilder emailThread() {
        return new EmailThreadBuilder(new EmailThread());
    }
    /**
     * EnumWithCustomOfAssociatedPersonCategory
     */
    public static EnumWithCustomOfAssociatedPersonCategoryBuilder enumWithCustomOfAssociatedPersonCategory() {
        return new EnumWithCustomOfAssociatedPersonCategoryBuilder(new EnumWithCustomOfAssociatedPersonCategory());
    }
    /**
     * EnumWithCustomOfEmailAddressCategory
     */
    public static EnumWithCustomOfEmailAddressCategoryBuilder enumWithCustomOfEmailAddressCategory() {
        return new EnumWithCustomOfEmailAddressCategoryBuilder(new EnumWithCustomOfEmailAddressCategory());
    }
    /**
     * EnumWithCustomOfEventCategory
     */
    public static EnumWithCustomOfEventCategoryBuilder enumWithCustomOfEventCategory() {
        return new EnumWithCustomOfEventCategoryBuilder(new EnumWithCustomOfEventCategory());
    }
    /**
     * EnumWithCustomOfInstantMessengerCategory
     */
    public static EnumWithCustomOfInstantMessengerCategoryBuilder enumWithCustomOfInstantMessengerCategory() {
        return new EnumWithCustomOfInstantMessengerCategoryBuilder(new EnumWithCustomOfInstantMessengerCategory());
    }
    /**
     * EnumWithCustomOfPhoneNumberCategory
     */
    public static EnumWithCustomOfPhoneNumberCategoryBuilder enumWithCustomOfPhoneNumberCategory() {
        return new EnumWithCustomOfPhoneNumberCategoryBuilder(new EnumWithCustomOfPhoneNumberCategory());
    }
    /**
     * EnumWithCustomOfPostalAddressCategory
     */
    public static EnumWithCustomOfPostalAddressCategoryBuilder enumWithCustomOfPostalAddressCategory() {
        return new EnumWithCustomOfPostalAddressCategoryBuilder(new EnumWithCustomOfPostalAddressCategory());
    }
    /**
     * EnumWithCustomOfUrlCategory
     */
    public static EnumWithCustomOfUrlCategoryBuilder enumWithCustomOfUrlCategory() {
        return new EnumWithCustomOfUrlCategoryBuilder(new EnumWithCustomOfUrlCategory());
    }
    /**
     * Error
     */
    public static ErrorBuilder error() {
        return new ErrorBuilder(new Error());
    }
    /**
     * The error details
     */
    public static ErrorDetailsBuilder errorDetails() {
        return new ErrorDetailsBuilder(new ErrorDetails());
    }
    /**
     * File versions FileVersion.
     */
    public static FileVersionsBuilder fileVersions() {
        return new FileVersionsBuilder(new FileVersions());
    }
    /**
     * Files list
     */
    public static FilesListBuilder filesList() {
        return new FilesListBuilder(new FilesList());
    }
    /**
     * File upload result
     */
    public static FilesUploadResultBuilder filesUploadResult() {
        return new FilesUploadResultBuilder(new FilesUploadResult());
    }
    /**
     * Instant messenger address.             
     */
    public static InstantMessengerAddressBuilder instantMessengerAddress() {
        return new InstantMessengerAddressBuilder(new InstantMessengerAddress());
    }
    /**
     * ListResponseOfAiNameComponent
     */
    public static ListResponseOfAiNameComponentBuilder listResponseOfAiNameComponent() {
        return new ListResponseOfAiNameComponentBuilder(new ListResponseOfAiNameComponent());
    }
    /**
     * ListResponseOfAiNameExtracted
     */
    public static ListResponseOfAiNameExtractedBuilder listResponseOfAiNameExtracted() {
        return new ListResponseOfAiNameExtractedBuilder(new ListResponseOfAiNameExtracted());
    }
    /**
     * ListResponseOfAiNameGenderHypothesis
     */
    public static ListResponseOfAiNameGenderHypothesisBuilder listResponseOfAiNameGenderHypothesis() {
        return new ListResponseOfAiNameGenderHypothesisBuilder(new ListResponseOfAiNameGenderHypothesis());
    }
    /**
     * ListResponseOfContactDto
     */
    public static ListResponseOfContactDtoBuilder listResponseOfContactDto() {
        return new ListResponseOfContactDtoBuilder(new ListResponseOfContactDto());
    }
    /**
     * ListResponseOfEmailAccountConfig
     */
    public static ListResponseOfEmailAccountConfigBuilder listResponseOfEmailAccountConfig() {
        return new ListResponseOfEmailAccountConfigBuilder(new ListResponseOfEmailAccountConfig());
    }
    /**
     * ListResponseOfEmailDto
     */
    public static ListResponseOfEmailDtoBuilder listResponseOfEmailDto() {
        return new ListResponseOfEmailDtoBuilder(new ListResponseOfEmailDto());
    }
    /**
     * ListResponseOfEmailThread
     */
    public static ListResponseOfEmailThreadBuilder listResponseOfEmailThread() {
        return new ListResponseOfEmailThreadBuilder(new ListResponseOfEmailThread());
    }
    /**
     * ListResponseOfMailMessageBase
     */
    public static ListResponseOfMailMessageBaseBuilder listResponseOfMailMessageBase() {
        return new ListResponseOfMailMessageBaseBuilder(new ListResponseOfMailMessageBase());
    }
    /**
     * ListResponseOfMailServerFolder
     */
    public static ListResponseOfMailServerFolderBuilder listResponseOfMailServerFolder() {
        return new ListResponseOfMailServerFolderBuilder(new ListResponseOfMailServerFolder());
    }
    /**
     * ListResponseOfStorageFileLocation
     */
    public static ListResponseOfStorageFileLocationBuilder listResponseOfStorageFileLocation() {
        return new ListResponseOfStorageFileLocationBuilder(new ListResponseOfStorageFileLocation());
    }
    /**
     * ListResponseOfStorageModelOfCalendarDto
     */
    public static ListResponseOfStorageModelOfCalendarDtoBuilder listResponseOfStorageModelOfCalendarDto() {
        return new ListResponseOfStorageModelOfCalendarDtoBuilder(new ListResponseOfStorageModelOfCalendarDto());
    }
    /**
     * ListResponseOfStorageModelOfContactDto
     */
    public static ListResponseOfStorageModelOfContactDtoBuilder listResponseOfStorageModelOfContactDto() {
        return new ListResponseOfStorageModelOfContactDtoBuilder(new ListResponseOfStorageModelOfContactDto());
    }
    /**
     * ListResponseOfStorageModelOfEmailDto
     */
    public static ListResponseOfStorageModelOfEmailDtoBuilder listResponseOfStorageModelOfEmailDto() {
        return new ListResponseOfStorageModelOfEmailDtoBuilder(new ListResponseOfStorageModelOfEmailDto());
    }
    /**
     * Represents the address of a message.
     */
    public static MailAddressBuilder mailAddress() {
        return new MailAddressBuilder(new MailAddress());
    }
    /**
     * Universal object that stores email messages in different formats.             
     */
    public static MailMessageBaseBuilder mailMessageBase() {
        return new MailMessageBaseBuilder(new MailMessageBase());
    }
    /**
     * Email account folder             
     */
    public static MailServerFolderBuilder mailServerFolder() {
        return new MailServerFolderBuilder(new MailServerFolder());
    }
    /**
     * Mapi attachment             
     */
    public static MapiAttachmentDtoBuilder mapiAttachmentDto() {
        return new MapiAttachmentDtoBuilder(new MapiAttachmentDto());
    }
    /**
     * Convert MapiCalendar to file request.             
     */
    public static MapiCalendarAsFileRequestBuilder mapiCalendarAsFileRequest() {
        return new MapiCalendarAsFileRequestBuilder(new MapiCalendarAsFileRequest());
    }
    /**
     * Mapi calendar attendees.             
     */
    public static MapiCalendarAttendeesDtoBuilder mapiCalendarAttendeesDto() {
        return new MapiCalendarAttendeesDtoBuilder(new MapiCalendarAttendeesDto());
    }
    /**
     * Recurrence properties of calendar object.             
     */
    public static MapiCalendarEventRecurrenceDtoBuilder mapiCalendarEventRecurrenceDto() {
        return new MapiCalendarEventRecurrenceDtoBuilder(new MapiCalendarEventRecurrenceDto());
    }
    /**
     * An exception specifies changes to an instance of a recurring series.             
     */
    public static MapiCalendarExceptionInfoDtoBuilder mapiCalendarExceptionInfoDto() {
        return new MapiCalendarExceptionInfoDtoBuilder(new MapiCalendarExceptionInfoDto());
    }
    /**
     * Mapi recurrence pattern.             
     */
    public static MapiCalendarRecurrencePatternDtoBuilder mapiCalendarRecurrencePatternDto() {
        return new MapiCalendarRecurrencePatternDtoBuilder(new MapiCalendarRecurrencePatternDto());
    }
    /**
     * Represents the mapi calendar time zone information.             
     */
    public static MapiCalendarTimeZoneDtoBuilder mapiCalendarTimeZoneDto() {
        return new MapiCalendarTimeZoneDtoBuilder(new MapiCalendarTimeZoneDto());
    }
    /**
     * Represents the mapi calendar time zone rule.             
     */
    public static MapiCalendarTimeZoneInfoDtoBuilder mapiCalendarTimeZoneInfoDto() {
        return new MapiCalendarTimeZoneInfoDtoBuilder(new MapiCalendarTimeZoneInfoDto());
    }
    /**
     * Represents time zone rule that indicate when to begin using the Standard/Daylight time.             
     */
    public static MapiCalendarTimeZoneRuleDtoBuilder mapiCalendarTimeZoneRuleDto() {
        return new MapiCalendarTimeZoneRuleDtoBuilder(new MapiCalendarTimeZoneRuleDto());
    }
    /**
     * Convert MapiContact to file request.             
     */
    public static MapiContactAsFileRequestBuilder mapiContactAsFileRequest() {
        return new MapiContactAsFileRequestBuilder(new MapiContactAsFileRequest());
    }
    /**
     * Refers to the group of properties that define the e-mail address or fax address for a contact.             
     */
    public static MapiContactElectronicAddressDtoBuilder mapiContactElectronicAddressDto() {
        return new MapiContactElectronicAddressDtoBuilder(new MapiContactElectronicAddressDto());
    }
    /**
     * Specify properties for up to three different e-mail addresses (Email1, Email2, and Email3) and three different fax addresses (Primary Fax, Business Fax, and Home Fax)             
     */
    public static MapiContactElectronicAddressPropertySetDtoBuilder mapiContactElectronicAddressPropertySetDto() {
        return new MapiContactElectronicAddressPropertySetDtoBuilder(new MapiContactElectronicAddressPropertySetDto());
    }
    /**
     * Specify events associated with a contact.             
     */
    public static MapiContactEventPropertySetDtoBuilder mapiContactEventPropertySetDto() {
        return new MapiContactEventPropertySetDtoBuilder(new MapiContactEventPropertySetDto());
    }
    /**
     * The properties are used to specify the name of the person represented by the contact             
     */
    public static MapiContactNamePropertySetDtoBuilder mapiContactNamePropertySetDto() {
        return new MapiContactNamePropertySetDtoBuilder(new MapiContactNamePropertySetDto());
    }
    /**
     * The properties are used to specify additional properties of contact.             
     */
    public static MapiContactOtherPropertySetDtoBuilder mapiContactOtherPropertySetDto() {
        return new MapiContactOtherPropertySetDtoBuilder(new MapiContactOtherPropertySetDto());
    }
    /**
     * Specify other additional contact information.             
     */
    public static MapiContactPersonalInfoPropertySetDtoBuilder mapiContactPersonalInfoPropertySetDto() {
        return new MapiContactPersonalInfoPropertySetDtoBuilder(new MapiContactPersonalInfoPropertySetDto());
    }
    /**
     * Refers to the group of properties that define physical address for a contact.             
     */
    public static MapiContactPhysicalAddressDtoBuilder mapiContactPhysicalAddressDto() {
        return new MapiContactPhysicalAddressDtoBuilder(new MapiContactPhysicalAddressDto());
    }
    /**
     * Specify three physical addresses: Home Address, Work Address, and Other Address. One of the addresses can be marked as the Mailing Address             
     */
    public static MapiContactPhysicalAddressPropertySetDtoBuilder mapiContactPhysicalAddressPropertySetDto() {
        return new MapiContactPhysicalAddressPropertySetDtoBuilder(new MapiContactPhysicalAddressPropertySetDto());
    }
    /**
     * Properties are used to store professional details for the person represented by the contact             
     */
    public static MapiContactProfessionalPropertySetDtoBuilder mapiContactProfessionalPropertySetDto() {
        return new MapiContactProfessionalPropertySetDtoBuilder(new MapiContactProfessionalPropertySetDto());
    }
    /**
     * Specify optional telephone numbers for the contact.             
     */
    public static MapiContactTelephonePropertySetDtoBuilder mapiContactTelephonePropertySetDto() {
        return new MapiContactTelephonePropertySetDtoBuilder(new MapiContactTelephonePropertySetDto());
    }
    /**
     * Refers to the group of properties that define the e-mail address or fax address.             
     */
    public static MapiElectronicAddressDtoBuilder mapiElectronicAddressDto() {
        return new MapiElectronicAddressDtoBuilder(new MapiElectronicAddressDto());
    }
    /**
     * Convert MapiMessage to file request.             
     */
    public static MapiMessageAsFileRequestBuilder mapiMessageAsFileRequest() {
        return new MapiMessageAsFileRequestBuilder(new MapiMessageAsFileRequest());
    }
    /**
     * Base Dto for MapiMessage, MapiCalendar or MapiContact             
     */
    public static MapiMessageItemBaseDtoBuilder mapiMessageItemBaseDto() {
        return new MapiMessageItemBaseDtoBuilder(new MapiMessageItemBaseDto());
    }
    /**
     * Mapi property descriptor             
     */
    public static MapiPropertyDescriptorBuilder mapiPropertyDescriptor() {
        return new MapiPropertyDescriptorBuilder(new MapiPropertyDescriptor());
    }
    /**
     * Mapi property             
     */
    public static MapiPropertyDtoBuilder mapiPropertyDto() {
        return new MapiPropertyDtoBuilder(new MapiPropertyDto());
    }
    /**
     * Represents the recipient information in the Microsoft Outlook Message.             
     */
    public static MapiRecipientDtoBuilder mapiRecipientDto() {
        return new MapiRecipientDtoBuilder(new MapiRecipientDto());
    }
    /**
     * Name-Value property             
     */
    public static NameValuePairBuilder nameValuePair() {
        return new NameValuePairBuilder(new NameValuePair());
    }
    /**
     * Object exists
     */
    public static ObjectExistBuilder objectExist() {
        return new ObjectExistBuilder(new ObjectExist());
    }
    /**
     * A phone number.             
     */
    public static PhoneNumberBuilder phoneNumber() {
        return new PhoneNumberBuilder(new PhoneNumber());
    }
    /**
     * A postal address             
     */
    public static PostalAddressBuilder postalAddress() {
        return new PostalAddressBuilder(new PostalAddress());
    }
    /**
     * iCalendar recurrence pattern.             
     */
    public static RecurrencePatternDtoBuilder recurrencePatternDto() {
        return new RecurrencePatternDtoBuilder(new RecurrencePatternDto());
    }
    /**
     * Defines an \&quot;Attendee\&quot; within a alarm.
     */
    public static ReminderAttendeeBuilder reminderAttendee() {
        return new ReminderAttendeeBuilder(new ReminderAttendee());
    }
    /**
     * Specifies when an alarm will trigger.
     */
    public static ReminderTriggerBuilder reminderTrigger() {
        return new ReminderTriggerBuilder(new ReminderTrigger());
    }
    /**
     * Storage exists
     */
    public static StorageExistBuilder storageExist() {
        return new StorageExistBuilder(new StorageExist());
    }
    /**
     * File or folder information
     */
    public static StorageFileBuilder storageFile() {
        return new StorageFileBuilder(new StorageFile());
    }
    /**
     * A storage folder location information             
     */
    public static StorageFolderLocationBuilder storageFolderLocation() {
        return new StorageFolderLocationBuilder(new StorageFolderLocation());
    }
    /**
     * StorageModelOfCalendarDto
     */
    public static StorageModelOfCalendarDtoBuilder storageModelOfCalendarDto() {
        return new StorageModelOfCalendarDtoBuilder(new StorageModelOfCalendarDto());
    }
    /**
     * StorageModelOfContactDto
     */
    public static StorageModelOfContactDtoBuilder storageModelOfContactDto() {
        return new StorageModelOfContactDtoBuilder(new StorageModelOfContactDto());
    }
    /**
     * StorageModelOfEmailClientAccount
     */
    public static StorageModelOfEmailClientAccountBuilder storageModelOfEmailClientAccount() {
        return new StorageModelOfEmailClientAccountBuilder(new StorageModelOfEmailClientAccount());
    }
    /**
     * StorageModelOfEmailClientMultiAccount
     */
    public static StorageModelOfEmailClientMultiAccountBuilder storageModelOfEmailClientMultiAccount() {
        return new StorageModelOfEmailClientMultiAccountBuilder(new StorageModelOfEmailClientMultiAccount());
    }
    /**
     * StorageModelOfEmailDto
     */
    public static StorageModelOfEmailDtoBuilder storageModelOfEmailDto() {
        return new StorageModelOfEmailDtoBuilder(new StorageModelOfEmailDto());
    }
    /**
     * StorageModelOfMapiCalendarDto
     */
    public static StorageModelOfMapiCalendarDtoBuilder storageModelOfMapiCalendarDto() {
        return new StorageModelOfMapiCalendarDtoBuilder(new StorageModelOfMapiCalendarDto());
    }
    /**
     * StorageModelOfMapiContactDto
     */
    public static StorageModelOfMapiContactDtoBuilder storageModelOfMapiContactDto() {
        return new StorageModelOfMapiContactDtoBuilder(new StorageModelOfMapiContactDto());
    }
    /**
     * StorageModelOfMapiMessageDto
     */
    public static StorageModelOfMapiMessageDtoBuilder storageModelOfMapiMessageDto() {
        return new StorageModelOfMapiMessageDtoBuilder(new StorageModelOfMapiMessageDto());
    }
    /**
     * Url and its category.             
     */
    public static UrlBuilder url() {
        return new UrlBuilder(new Url());
    }
    /**
     * ValueTOfBoolean
     */
    public static ValueTOfBooleanBuilder valueTOfBoolean() {
        return new ValueTOfBooleanBuilder(new ValueTOfBoolean());
    }
    /**
     * ValueTOfString
     */
    public static ValueTOfStringBuilder valueTOfString() {
        return new ValueTOfStringBuilder(new ValueTOfString());
    }
    /**
     * Image from storage for recognition             
     */
    public static AiBcrImageStorageFileBuilder aiBcrImageStorageFile() {
        return new AiBcrImageStorageFileBuilder(new AiBcrImageStorageFile());
    }
    /**
     * List of name components             
     */
    public static AiNameComponentListBuilder aiNameComponentList() {
        return new AiNameComponentListBuilder(new AiNameComponentList());
    }
    /**
     * Extracted name list.             
     */
    public static AiNameExtractedListBuilder aiNameExtractedList() {
        return new AiNameExtractedListBuilder(new AiNameExtractedList());
    }
    /**
     * Hypotheses about person&#39;s gender             
     */
    public static AiNameGenderHypothesisListBuilder aiNameGenderHypothesisList() {
        return new AiNameGenderHypothesisListBuilder(new AiNameGenderHypothesisList());
    }
    /**
     * Two parsed names to match request             
     */
    public static AiNameMatchParsedRequestBuilder aiNameMatchParsedRequest() {
        return new AiNameMatchParsedRequestBuilder(new AiNameMatchParsedRequest());
    }
    /**
     * Represents the format to view a message.             
     */
    public static AlternateViewBuilder alternateView() {
        return new AlternateViewBuilder(new AlternateView());
    }
    /**
     * Document attachment.             
     */
    public static AttachmentBuilder attachment() {
        return new AttachmentBuilder(new Attachment());
    }
    /**
     * Save iCalendar to storage request.             
     */
    public static CalendarSaveRequestBuilder calendarSaveRequest() {
        return new CalendarSaveRequestBuilder(new CalendarSaveRequest());
    }
    /**
     * iCalendar models list with corresponding storage locations.             
     */
    public static CalendarStorageListBuilder calendarStorageList() {
        return new CalendarStorageListBuilder(new CalendarStorageList());
    }
    /**
     * Email client multi account save request.             
     */
    public static ClientAccountSaveMultiRequestBuilder clientAccountSaveMultiRequest() {
        return new ClientAccountSaveMultiRequestBuilder(new ClientAccountSaveMultiRequest());
    }
    /**
     * Email client account save request             
     */
    public static ClientAccountSaveRequestBuilder clientAccountSaveRequest() {
        return new ClientAccountSaveRequestBuilder(new ClientAccountSaveRequest());
    }
    /**
     * Email Client create folder request.             
     */
    public static ClientFolderCreateRequestBuilder clientFolderCreateRequest() {
        return new ClientFolderCreateRequestBuilder(new ClientFolderCreateRequest());
    }
    /**
     * Email client delete folder request.             
     */
    public static ClientFolderDeleteRequestBuilder clientFolderDeleteRequest() {
        return new ClientFolderDeleteRequestBuilder(new ClientFolderDeleteRequest());
    }
    /**
     * Email client append message request.             
     */
    public static ClientMessageAppendRequestBuilder clientMessageAppendRequest() {
        return new ClientMessageAppendRequestBuilder(new ClientMessageAppendRequest());
    }
    /**
     * Email client message request.             
     */
    public static ClientMessageBaseRequestBuilder clientMessageBaseRequest() {
        return new ClientMessageBaseRequestBuilder(new ClientMessageBaseRequest());
    }
    /**
     * Email client send message request.             
     */
    public static ClientMessageSendRequestBuilder clientMessageSendRequest() {
        return new ClientMessageSendRequestBuilder(new ClientMessageSendRequest());
    }
    /**
     * Email client thread request.             
     */
    public static ClientThreadBaseRequestBuilder clientThreadBaseRequest() {
        return new ClientThreadBaseRequestBuilder(new ClientThreadBaseRequest());
    }
    /**
     * List of VCard documents             
     */
    public static ContactListBuilder contactList() {
        return new ContactListBuilder(new ContactList());
    }
    /**
     * Contact save to storage request             
     */
    public static ContactSaveRequestBuilder contactSaveRequest() {
        return new ContactSaveRequestBuilder(new ContactSaveRequest());
    }
    /**
     * Contact models list with corresponding storage locations.             
     */
    public static ContactStorageListBuilder contactStorageList() {
        return new ContactStorageListBuilder(new ContactStorageList());
    }
    /**
     * Daily recurrence.             
     */
    public static DailyRecurrencePatternDtoBuilder dailyRecurrencePatternDto() {
        return new DailyRecurrencePatternDtoBuilder(new DailyRecurrencePatternDto());
    }
    /**
     * List of email accounts             
     */
    public static EmailAccountConfigListBuilder emailAccountConfigList() {
        return new EmailAccountConfigListBuilder(new EmailAccountConfigList());
    }
    /**
     * Represents email client account OAuth 2.0 credentials             
     */
    public static EmailClientAccountOauthCredentialsBuilder emailClientAccountOauthCredentials() {
        return new EmailClientAccountOauthCredentialsBuilder(new EmailClientAccountOauthCredentials());
    }
    /**
     * Represents email client account password credentials             
     */
    public static EmailClientAccountPasswordCredentialsBuilder emailClientAccountPasswordCredentials() {
        return new EmailClientAccountPasswordCredentialsBuilder(new EmailClientAccountPasswordCredentials());
    }
    /**
     * EmailConfigDiscoverOauthRequest
     */
    public static EmailConfigDiscoverOauthRequestBuilder emailConfigDiscoverOauthRequest() {
        return new EmailConfigDiscoverOauthRequestBuilder(new EmailConfigDiscoverOauthRequest());
    }
    /**
     * EmailConfigDiscoverPasswordRequest
     */
    public static EmailConfigDiscoverPasswordRequestBuilder emailConfigDiscoverPasswordRequest() {
        return new EmailConfigDiscoverPasswordRequestBuilder(new EmailConfigDiscoverPasswordRequest());
    }
    /**
     * Email document list.             
     */
    public static EmailListBuilder emailList() {
        return new EmailListBuilder(new EmailList());
    }
    /**
     * Email save to storage request             
     */
    public static EmailSaveRequestBuilder emailSaveRequest() {
        return new EmailSaveRequestBuilder(new EmailSaveRequest());
    }
    /**
     * Email models list with corresponding storage locations.             
     */
    public static EmailStorageListBuilder emailStorageList() {
        return new EmailStorageListBuilder(new EmailStorageList());
    }
    /**
     * List of email threads             
     */
    public static EmailThreadListBuilder emailThreadList() {
        return new EmailThreadListBuilder(new EmailThreadList());
    }
    /**
     * File Version
     */
    public static FileVersionBuilder fileVersion() {
        return new FileVersionBuilder(new FileVersion());
    }
    /**
     * Represents an embedded resource in a message.             
     */
    public static LinkedResourceBuilder linkedResource() {
        return new LinkedResourceBuilder(new LinkedResource());
    }
    /**
     * Email message represented as file, encoded to Base64 format.             
     */
    public static MailMessageBase64Builder mailMessageBase64() {
        return new MailMessageBase64Builder(new MailMessageBase64());
    }
    /**
     * List of messages.             
     */
    public static MailMessageBaseListBuilder mailMessageBaseList() {
        return new MailMessageBaseListBuilder(new MailMessageBaseList());
    }
    /**
     * Represents email message, stored as an EmailDto object.             
     */
    public static MailMessageDtoBuilder mailMessageDto() {
        return new MailMessageDtoBuilder(new MailMessageDto());
    }
    /**
     * Email message represented as MAPI object.             
     */
    public static MailMessageMapiBuilder mailMessageMapi() {
        return new MailMessageMapiBuilder(new MailMessageMapi());
    }
    /**
     * List of email client folders.             
     */
    public static MailServerFolderListBuilder mailServerFolderList() {
        return new MailServerFolderListBuilder(new MailServerFolderList());
    }
    /**
     * Mapi property with Binary value represented as a Base64 string             
     */
    public static MapiBinaryPropertyDtoBuilder mapiBinaryPropertyDto() {
        return new MapiBinaryPropertyDtoBuilder(new MapiBinaryPropertyDto());
    }
    /**
     * Mapi property with Boolean value             
     */
    public static MapiBooleanPropertyDtoBuilder mapiBooleanPropertyDto() {
        return new MapiBooleanPropertyDtoBuilder(new MapiBooleanPropertyDto());
    }
    /**
     * Represents the daily recurrence pattern of the mapi calendar.             
     */
    public static MapiCalendarDailyRecurrencePatternDtoBuilder mapiCalendarDailyRecurrencePatternDto() {
        return new MapiCalendarDailyRecurrencePatternDtoBuilder(new MapiCalendarDailyRecurrencePatternDto());
    }
    /**
     * Represents the mapi calendar object             
     */
    public static MapiCalendarDtoBuilder mapiCalendarDto() {
        return new MapiCalendarDtoBuilder(new MapiCalendarDto());
    }
    /**
     * Save MapiCalendar to storage request.             
     */
    public static MapiCalendarSaveRequestBuilder mapiCalendarSaveRequest() {
        return new MapiCalendarSaveRequestBuilder(new MapiCalendarSaveRequest());
    }
    /**
     * Represents the weekly recurrence pattern of the mapi calendar             
     */
    public static MapiCalendarWeeklyRecurrencePatternDtoBuilder mapiCalendarWeeklyRecurrencePatternDto() {
        return new MapiCalendarWeeklyRecurrencePatternDtoBuilder(new MapiCalendarWeeklyRecurrencePatternDto());
    }
    /**
     * Represents the yearly and monthly recurrence pattern of the mapi calendar             
     */
    public static MapiCalendarYearlyAndMonthlyRecurrencePatternDtoBuilder mapiCalendarYearlyAndMonthlyRecurrencePatternDto() {
        return new MapiCalendarYearlyAndMonthlyRecurrencePatternDtoBuilder(new MapiCalendarYearlyAndMonthlyRecurrencePatternDto());
    }
    /**
     * Represents outlook contact information.             
     */
    public static MapiContactDtoBuilder mapiContactDto() {
        return new MapiContactDtoBuilder(new MapiContactDto());
    }
    /**
     * Contains data and type of contact&#39;s photo.             
     */
    public static MapiContactPhotoDtoBuilder mapiContactPhotoDto() {
        return new MapiContactPhotoDtoBuilder(new MapiContactPhotoDto());
    }
    /**
     * MapiContact save to storage request.             
     */
    public static MapiContactSaveRequestBuilder mapiContactSaveRequest() {
        return new MapiContactSaveRequestBuilder(new MapiContactSaveRequest());
    }
    /**
     * Mapi property with DateTime value             
     */
    public static MapiDateTimePropertyDtoBuilder mapiDateTimePropertyDto() {
        return new MapiDateTimePropertyDtoBuilder(new MapiDateTimePropertyDto());
    }
    /**
     * Mapi property with FileAsMapping value             
     */
    public static MapiFileAsPropertyDtoBuilder mapiFileAsPropertyDto() {
        return new MapiFileAsPropertyDtoBuilder(new MapiFileAsPropertyDto());
    }
    /**
     * Mapi property with ImportanceChoicesType value             
     */
    public static MapiImportancePropertyDtoBuilder mapiImportancePropertyDto() {
        return new MapiImportancePropertyDtoBuilder(new MapiImportancePropertyDto());
    }
    /**
     * Mapi property with Integer value             
     */
    public static MapiIntPropertyDtoBuilder mapiIntPropertyDto() {
        return new MapiIntPropertyDtoBuilder(new MapiIntPropertyDto());
    }
    /**
     * Known Mapi Property descriptor             
     */
    public static MapiKnownPropertyDescriptorBuilder mapiKnownPropertyDescriptor() {
        return new MapiKnownPropertyDescriptorBuilder(new MapiKnownPropertyDescriptor());
    }
    /**
     * Mapi property with LegacyFreeBusyType value             
     */
    public static MapiLegacyFreeBusyPropertyDtoBuilder mapiLegacyFreeBusyPropertyDto() {
        return new MapiLegacyFreeBusyPropertyDtoBuilder(new MapiLegacyFreeBusyPropertyDto());
    }
    /**
     * Represents an Outlook Message format document.             
     */
    public static MapiMessageDtoBuilder mapiMessageDto() {
        return new MapiMessageDtoBuilder(new MapiMessageDto());
    }
    /**
     * MapiMessage save to storage request.             
     */
    public static MapiMessageSaveRequestBuilder mapiMessageSaveRequest() {
        return new MapiMessageSaveRequestBuilder(new MapiMessageSaveRequest());
    }
    /**
     * Mapi property with Multiple Integer values             
     */
    public static MapiMultiIntPropertyDtoBuilder mapiMultiIntPropertyDto() {
        return new MapiMultiIntPropertyDtoBuilder(new MapiMultiIntPropertyDto());
    }
    /**
     * Mapi property with Multiple String values             
     */
    public static MapiMultiStringPropertyDtoBuilder mapiMultiStringPropertyDto() {
        return new MapiMultiStringPropertyDtoBuilder(new MapiMultiStringPropertyDto());
    }
    /**
     * Mapi property with PhysicalAddressIndexType value             
     */
    public static MapiPhysicalAddressIndexPropertyDtoBuilder mapiPhysicalAddressIndexPropertyDto() {
        return new MapiPhysicalAddressIndexPropertyDtoBuilder(new MapiPhysicalAddressIndexPropertyDto());
    }
    /**
     * Mapi pid property descriptor base class             
     */
    public static MapiPidPropertyDescriptorBuilder mapiPidPropertyDescriptor() {
        return new MapiPidPropertyDescriptorBuilder(new MapiPidPropertyDescriptor());
    }
    /**
     * Mapi property with response type value             
     */
    public static MapiResponseTypePropertyDtoBuilder mapiResponseTypePropertyDto() {
        return new MapiResponseTypePropertyDtoBuilder(new MapiResponseTypePropertyDto());
    }
    /**
     * Mapi property with string value             
     */
    public static MapiStringPropertyDtoBuilder mapiStringPropertyDto() {
        return new MapiStringPropertyDtoBuilder(new MapiStringPropertyDto());
    }
    /**
     * Monthly recurrence pattern.             
     */
    public static MonthlyRecurrencePatternDtoBuilder monthlyRecurrencePatternDto() {
        return new MonthlyRecurrencePatternDtoBuilder(new MonthlyRecurrencePatternDto());
    }
    /**
     * A storage file location information             
     */
    public static StorageFileLocationBuilder storageFileLocation() {
        return new StorageFileLocationBuilder(new StorageFileLocation());
    }
    /**
     * List of files located on storage.             
     */
    public static StorageFileLocationListBuilder storageFileLocationList() {
        return new StorageFileLocationListBuilder(new StorageFileLocationList());
    }
    /**
     * Represents the regenerating recurrence pattern that specifies how many days, weeks, months or years after the completion of the current task the next occurrence will be due.             
     */
    public static TaskRegeneratingPatternDtoBuilder taskRegeneratingPatternDto() {
        return new TaskRegeneratingPatternDtoBuilder(new TaskRegeneratingPatternDto());
    }
    /**
     * Weekly recurrence pattern.             
     */
    public static WeeklyRecurrencePatternDtoBuilder weeklyRecurrencePatternDto() {
        return new WeeklyRecurrencePatternDtoBuilder(new WeeklyRecurrencePatternDto());
    }
    /**
     * Yearly recurrence pattern.             
     */
    public static YearlyRecurrencePatternDtoBuilder yearlyRecurrencePatternDto() {
        return new YearlyRecurrencePatternDtoBuilder(new YearlyRecurrencePatternDto());
    }
    /**
     * Email client delete message request.             
     */
    public static ClientMessageDeleteRequestBuilder clientMessageDeleteRequest() {
        return new ClientMessageDeleteRequestBuilder(new ClientMessageDeleteRequest());
    }
    /**
     * Email client move message request.             
     */
    public static ClientMessageMoveRequestBuilder clientMessageMoveRequest() {
        return new ClientMessageMoveRequestBuilder(new ClientMessageMoveRequest());
    }
    /**
     * Email client mark message is read/unread request.             
     */
    public static ClientMessageSetIsReadRequestBuilder clientMessageSetIsReadRequest() {
        return new ClientMessageSetIsReadRequestBuilder(new ClientMessageSetIsReadRequest());
    }
    /**
     * Delete email client thread request.             
     */
    public static ClientThreadDeleteRequestBuilder clientThreadDeleteRequest() {
        return new ClientThreadDeleteRequestBuilder(new ClientThreadDeleteRequest());
    }
    /**
     * Email client move thread request.             
     */
    public static ClientThreadMoveRequestBuilder clientThreadMoveRequest() {
        return new ClientThreadMoveRequestBuilder(new ClientThreadMoveRequest());
    }
    /**
     * Mark thread messages as read or unread request.             
     */
    public static ClientThreadSetIsReadRequestBuilder clientThreadSetIsReadRequest() {
        return new ClientThreadSetIsReadRequestBuilder(new ClientThreadSetIsReadRequest());
    }
    /**
     * Property identified by an unsigned 32-bit quantity along with a property set             
     */
    public static MapiPidLidPropertyDescriptorBuilder mapiPidLidPropertyDescriptor() {
        return new MapiPidLidPropertyDescriptorBuilder(new MapiPidLidPropertyDescriptor());
    }
    /**
     * Property identified by a string name along with a property set             
     */
    public static MapiPidNamePropertyDescriptorBuilder mapiPidNamePropertyDescriptor() {
        return new MapiPidNamePropertyDescriptorBuilder(new MapiPidNamePropertyDescriptor());
    }
    /**
     * A property that is defined by a 16-bit property ID and a 16-bit property type. The property ID for a tagged property is in the range 0x001 - 0x7FFF. Property IDs in the range 0x8000 - 0x8FFF are reserved for assignment to named properties             
     */
    public static MapiPidTagPropertyDescriptorBuilder mapiPidTagPropertyDescriptor() {
        return new MapiPidTagPropertyDescriptorBuilder(new MapiPidTagPropertyDescriptor());
    }
    /**
     * Request builder for AiBcrApi.parse method.
     **/
    public static AiBcrParseRequestBuilder aiBcrParseRequest() {
        return new AiBcrParseRequestBuilder(new AiBcrParseRequest());
    }
    /**
     * Request builder for AiNameApi.complete method.
     **/
    public static AiNameCompleteRequestBuilder aiNameCompleteRequest() {
        return new AiNameCompleteRequestBuilder(new AiNameCompleteRequest());
    }
    /**
     * Request builder for AiNameApi.expand method.
     **/
    public static AiNameExpandRequestBuilder aiNameExpandRequest() {
        return new AiNameExpandRequestBuilder(new AiNameExpandRequest());
    }
    /**
     * Request builder for AiNameApi.format method.
     **/
    public static AiNameFormatRequestBuilder aiNameFormatRequest() {
        return new AiNameFormatRequestBuilder(new AiNameFormatRequest());
    }
    /**
     * Request builder for AiNameApi.genderize method.
     **/
    public static AiNameGenderizeRequestBuilder aiNameGenderizeRequest() {
        return new AiNameGenderizeRequestBuilder(new AiNameGenderizeRequest());
    }
    /**
     * Request builder for AiNameApi.match method.
     **/
    public static AiNameMatchRequestBuilder aiNameMatchRequest() {
        return new AiNameMatchRequestBuilder(new AiNameMatchRequest());
    }
    /**
     * Request builder for AiNameApi.parse method.
     **/
    public static AiNameParseRequestBuilder aiNameParseRequest() {
        return new AiNameParseRequestBuilder(new AiNameParseRequest());
    }
    /**
     * Request builder for AiNameApi.parseEmailAddress method.
     **/
    public static AiNameParseEmailAddressRequestBuilder aiNameParseEmailAddressRequest() {
        return new AiNameParseEmailAddressRequestBuilder(new AiNameParseEmailAddressRequest());
    }
    /**
     * Request builder for CalendarApi.convert method.
     **/
    public static CalendarConvertRequestBuilder calendarConvertRequest() {
        return new CalendarConvertRequestBuilder(new CalendarConvertRequest());
    }
    /**
     * Request builder for CalendarApi.fromFile method.
     **/
    public static CalendarFromFileRequestBuilder calendarFromFileRequest() {
        return new CalendarFromFileRequestBuilder(new CalendarFromFileRequest());
    }
    /**
     * Request builder for CalendarApi.get method.
     **/
    public static CalendarGetRequestBuilder calendarGetRequest() {
        return new CalendarGetRequestBuilder(new CalendarGetRequest());
    }
    /**
     * Request builder for CalendarApi.getAsAlternate method.
     **/
    public static CalendarGetAsAlternateRequestBuilder calendarGetAsAlternateRequest() {
        return new CalendarGetAsAlternateRequestBuilder(new CalendarGetAsAlternateRequest());
    }
    /**
     * Request builder for CalendarApi.getAsFile method.
     **/
    public static CalendarGetAsFileRequestBuilder calendarGetAsFileRequest() {
        return new CalendarGetAsFileRequestBuilder(new CalendarGetAsFileRequest());
    }
    /**
     * Request builder for CalendarApi.getList method.
     **/
    public static CalendarGetListRequestBuilder calendarGetListRequest() {
        return new CalendarGetListRequestBuilder(new CalendarGetListRequest());
    }
    /**
     * Request builder for ClientAccountApi.get method.
     **/
    public static ClientAccountGetRequestBuilder clientAccountGetRequest() {
        return new ClientAccountGetRequestBuilder(new ClientAccountGetRequest());
    }
    /**
     * Request builder for ClientAccountApi.getMulti method.
     **/
    public static ClientAccountGetMultiRequestBuilder clientAccountGetMultiRequest() {
        return new ClientAccountGetMultiRequestBuilder(new ClientAccountGetMultiRequest());
    }
    /**
     * Request builder for ClientFolderApi.getList method.
     **/
    public static ClientFolderGetListRequestBuilder clientFolderGetListRequest() {
        return new ClientFolderGetListRequestBuilder(new ClientFolderGetListRequest());
    }
    /**
     * Request builder for ClientMessageApi.appendFile method.
     **/
    public static ClientMessageAppendFileRequestBuilder clientMessageAppendFileRequest() {
        return new ClientMessageAppendFileRequestBuilder(new ClientMessageAppendFileRequest());
    }
    /**
     * Request builder for ClientMessageApi.fetch method.
     **/
    public static ClientMessageFetchRequestBuilder clientMessageFetchRequest() {
        return new ClientMessageFetchRequestBuilder(new ClientMessageFetchRequest());
    }
    /**
     * Request builder for ClientMessageApi.fetchFile method.
     **/
    public static ClientMessageFetchFileRequestBuilder clientMessageFetchFileRequest() {
        return new ClientMessageFetchFileRequestBuilder(new ClientMessageFetchFileRequest());
    }
    /**
     * Request builder for ClientMessageApi.list method.
     **/
    public static ClientMessageListRequestBuilder clientMessageListRequest() {
        return new ClientMessageListRequestBuilder(new ClientMessageListRequest());
    }
    /**
     * Request builder for ClientMessageApi.sendFile method.
     **/
    public static ClientMessageSendFileRequestBuilder clientMessageSendFileRequest() {
        return new ClientMessageSendFileRequestBuilder(new ClientMessageSendFileRequest());
    }
    /**
     * Request builder for ClientThreadApi.getList method.
     **/
    public static ClientThreadGetListRequestBuilder clientThreadGetListRequest() {
        return new ClientThreadGetListRequestBuilder(new ClientThreadGetListRequest());
    }
    /**
     * Request builder for ClientThreadApi.getMessages method.
     **/
    public static ClientThreadGetMessagesRequestBuilder clientThreadGetMessagesRequest() {
        return new ClientThreadGetMessagesRequestBuilder(new ClientThreadGetMessagesRequest());
    }
    /**
     * Request builder for ContactApi.convert method.
     **/
    public static ContactConvertRequestBuilder contactConvertRequest() {
        return new ContactConvertRequestBuilder(new ContactConvertRequest());
    }
    /**
     * Request builder for ContactApi.fromFile method.
     **/
    public static ContactFromFileRequestBuilder contactFromFileRequest() {
        return new ContactFromFileRequestBuilder(new ContactFromFileRequest());
    }
    /**
     * Request builder for ContactApi.get method.
     **/
    public static ContactGetRequestBuilder contactGetRequest() {
        return new ContactGetRequestBuilder(new ContactGetRequest());
    }
    /**
     * Request builder for ContactApi.getAsFile method.
     **/
    public static ContactGetAsFileRequestBuilder contactGetAsFileRequest() {
        return new ContactGetAsFileRequestBuilder(new ContactGetAsFileRequest());
    }
    /**
     * Request builder for ContactApi.getList method.
     **/
    public static ContactGetListRequestBuilder contactGetListRequest() {
        return new ContactGetListRequestBuilder(new ContactGetListRequest());
    }
    /**
     * Request builder for DisposableEmailApi.isDisposable method.
     **/
    public static DisposableEmailIsDisposableRequestBuilder disposableEmailIsDisposableRequest() {
        return new DisposableEmailIsDisposableRequestBuilder(new DisposableEmailIsDisposableRequest());
    }
    /**
     * Request builder for EmailApi.convert method.
     **/
    public static EmailConvertRequestBuilder emailConvertRequest() {
        return new EmailConvertRequestBuilder(new EmailConvertRequest());
    }
    /**
     * Request builder for EmailApi.fromFile method.
     **/
    public static EmailFromFileRequestBuilder emailFromFileRequest() {
        return new EmailFromFileRequestBuilder(new EmailFromFileRequest());
    }
    /**
     * Request builder for EmailApi.get method.
     **/
    public static EmailGetRequestBuilder emailGetRequest() {
        return new EmailGetRequestBuilder(new EmailGetRequest());
    }
    /**
     * Request builder for EmailApi.getAsFile method.
     **/
    public static EmailGetAsFileRequestBuilder emailGetAsFileRequest() {
        return new EmailGetAsFileRequestBuilder(new EmailGetAsFileRequest());
    }
    /**
     * Request builder for EmailApi.getList method.
     **/
    public static EmailGetListRequestBuilder emailGetListRequest() {
        return new EmailGetListRequestBuilder(new EmailGetListRequest());
    }
    /**
     * Request builder for EmailConfigApi.discover method.
     **/
    public static EmailConfigDiscoverRequestBuilder emailConfigDiscoverRequest() {
        return new EmailConfigDiscoverRequestBuilder(new EmailConfigDiscoverRequest());
    }
    /**
     * Request builder for FileApi.copyFile method.
     **/
    public static CopyFileRequestBuilder copyFileRequest() {
        return new CopyFileRequestBuilder(new CopyFileRequest());
    }
    /**
     * Request builder for FileApi.deleteFile method.
     **/
    public static DeleteFileRequestBuilder deleteFileRequest() {
        return new DeleteFileRequestBuilder(new DeleteFileRequest());
    }
    /**
     * Request builder for FileApi.downloadFile method.
     **/
    public static DownloadFileRequestBuilder downloadFileRequest() {
        return new DownloadFileRequestBuilder(new DownloadFileRequest());
    }
    /**
     * Request builder for FileApi.moveFile method.
     **/
    public static MoveFileRequestBuilder moveFileRequest() {
        return new MoveFileRequestBuilder(new MoveFileRequest());
    }
    /**
     * Request builder for FileApi.uploadFile method.
     **/
    public static UploadFileRequestBuilder uploadFileRequest() {
        return new UploadFileRequestBuilder(new UploadFileRequest());
    }
    /**
     * Request builder for FolderApi.copyFolder method.
     **/
    public static CopyFolderRequestBuilder copyFolderRequest() {
        return new CopyFolderRequestBuilder(new CopyFolderRequest());
    }
    /**
     * Request builder for FolderApi.createFolder method.
     **/
    public static CreateFolderRequestBuilder createFolderRequest() {
        return new CreateFolderRequestBuilder(new CreateFolderRequest());
    }
    /**
     * Request builder for FolderApi.deleteFolder method.
     **/
    public static DeleteFolderRequestBuilder deleteFolderRequest() {
        return new DeleteFolderRequestBuilder(new DeleteFolderRequest());
    }
    /**
     * Request builder for FolderApi.getFilesList method.
     **/
    public static GetFilesListRequestBuilder getFilesListRequest() {
        return new GetFilesListRequestBuilder(new GetFilesListRequest());
    }
    /**
     * Request builder for FolderApi.moveFolder method.
     **/
    public static MoveFolderRequestBuilder moveFolderRequest() {
        return new MoveFolderRequestBuilder(new MoveFolderRequest());
    }
    /**
     * Request builder for MapiCalendarApi.fromFile method.
     **/
    public static MapiCalendarFromFileRequestBuilder mapiCalendarFromFileRequest() {
        return new MapiCalendarFromFileRequestBuilder(new MapiCalendarFromFileRequest());
    }
    /**
     * Request builder for MapiCalendarApi.get method.
     **/
    public static MapiCalendarGetRequestBuilder mapiCalendarGetRequest() {
        return new MapiCalendarGetRequestBuilder(new MapiCalendarGetRequest());
    }
    /**
     * Request builder for MapiContactApi.fromFile method.
     **/
    public static MapiContactFromFileRequestBuilder mapiContactFromFileRequest() {
        return new MapiContactFromFileRequestBuilder(new MapiContactFromFileRequest());
    }
    /**
     * Request builder for MapiContactApi.get method.
     **/
    public static MapiContactGetRequestBuilder mapiContactGetRequest() {
        return new MapiContactGetRequestBuilder(new MapiContactGetRequest());
    }
    /**
     * Request builder for MapiMessageApi.fromFile method.
     **/
    public static MapiMessageFromFileRequestBuilder mapiMessageFromFileRequest() {
        return new MapiMessageFromFileRequestBuilder(new MapiMessageFromFileRequest());
    }
    /**
     * Request builder for MapiMessageApi.get method.
     **/
    public static MapiMessageGetRequestBuilder mapiMessageGetRequest() {
        return new MapiMessageGetRequestBuilder(new MapiMessageGetRequest());
    }
    /**
     * Request builder for StorageApi.getDiscUsage method.
     **/
    public static GetDiscUsageRequestBuilder getDiscUsageRequest() {
        return new GetDiscUsageRequestBuilder(new GetDiscUsageRequest());
    }
    /**
     * Request builder for StorageApi.getFileVersions method.
     **/
    public static GetFileVersionsRequestBuilder getFileVersionsRequest() {
        return new GetFileVersionsRequestBuilder(new GetFileVersionsRequest());
    }
    /**
     * Request builder for StorageApi.objectExists method.
     **/
    public static ObjectExistsRequestBuilder objectExistsRequest() {
        return new ObjectExistsRequestBuilder(new ObjectExistsRequest());
    }
    /**
     * Request builder for StorageApi.exists method.
     **/
    public static StorageExistsRequestBuilder storageExistsRequest() {
        return new StorageExistsRequestBuilder(new StorageExistsRequest());
    }
}
