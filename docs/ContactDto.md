
# ContactDto
## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**associatedPersons** | [**List&lt;AssociatedPerson&gt;**](AssociatedPerson.md) | Associated persons.              |  [optional]
**attachments** | [**List&lt;Attachment&gt;**](Attachment.md) | Document attachments.              |  [optional]
**companyName** | **String** | Company name.              |  [optional]
**computerNetworkName** | **String** | Computer network.              |  [optional]
**customerId** | **String** | Customer id.              |  [optional]
**departmentName** | **String** | Department name.              |  [optional]
**displayName** | **String** | Display name.              |  [optional]
**emailAddresses** | [**List&lt;EmailAddress&gt;**](EmailAddress.md) | Person&#39;s email addresses.              |  [optional]
**events** | [**List&lt;CustomerEvent&gt;**](CustomerEvent.md) | Person&#39;s events.              |  [optional]
**fileAs** | **String** | A name used for sorting.              |  [optional]
**fileAsMapping** | **String** | Specifies how to generate and recompute the value of the dispidFileAs property when other contact name properties change. Coincides MS-OXPROPS revision 16.2 from 7/31/2014. Enum, available values: Empty, DisplayName, FirstName, LastName, Organization, LastFirstMiddle, OrgLastFirstMiddle, LastFirstMiddleOrg, LastFirstMiddle2, LastFirstMiddle3, OrgLastFirstMiddle2, OrgLastFirstMiddle3, LastFirstMiddleOrg2, LastFirstMiddleOrg3, LastFirstMiddleGen, FirstMiddleLastGen, LastFirstMiddleGen2, BestMatch, AccordingToLocale, None | 
**freeBusyLocation** | **String** | URL path from which a client can retrieve free/busy information for the contact as an iCal file.              |  [optional]
**gender** | **String** | Enum defines gender of a person. Enum, available values: Unspecified, Female, Male | 
**givenName** | **String** | Person&#39;s given name.              |  [optional]
**governmentIdNumber** | **String** | Government id number.              |  [optional]
**hobbies** | **String** | Person&#39;s hobbies.              |  [optional]
**initials** | **String** | Person&#39;s initials.              |  [optional]
**instantMessengers** | [**List&lt;InstantMessengerAddress&gt;**](InstantMessengerAddress.md) | Person&#39;s instant messenger addresses.              |  [optional]
**jobTitle** | **String** | Person&#39;s job title.              |  [optional]
**language** | **String** | Language.              |  [optional]
**location** | **String** | Person&#39;s location.              |  [optional]
**middleName** | **String** | Person&#39;s middle name.              |  [optional]
**nickname** | **String** | Person&#39;s nickname.              |  [optional]
**notes** | **String** | Notes.              |  [optional]
**notesFormat** | **String** | Defines format of a text. Enum, available values: Text, Html | 
**officeLocation** | **String** | Office location.              |  [optional]
**organizationalIdNumber** | **String** | Contains an identifier for the mail user used within the mail user&#39;s organization.              |  [optional]
**phoneNumbers** | [**List&lt;PhoneNumber&gt;**](PhoneNumber.md) | Person&#39;s phone numbers.              |  [optional]
**photo** | [**ContactPhoto**](ContactPhoto.md) | Person&#39;s photo.              |  [optional]
**physicalAddresses** | [**List&lt;PostalAddress&gt;**](PostalAddress.md) | Person&#39;s physical addresses.              |  [optional]
**preferredTextEncoding** | **String** | Encoding for all text properties.              |  [optional]
**prefix** | **String** | A prefix of a full name such like Mr.(mister), Dr.(doctor) and so on.              |  [optional]
**profession** | **String** | A job position of a person in a company.              |  [optional]
**suffix** | **String** | A suffix of a full name such like Jr.(junior), Sr.(senior) and so on.              |  [optional]
**surname** | **String** | Person&#39;s surname.              |  [optional]
**urls** | [**List&lt;Url&gt;**](Url.md) | Person&#39;s urls.              |  [optional]




[[Back to Model list]](README.md#documentation-for-models) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to API README]](README.md)

