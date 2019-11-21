<a name="documentation-for-api-endpoints"></a>
## Documentation for API endpoints

All URIs are relative to *https://api.aspose.cloud/v3.0*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CalendarApi* | [**addCalendarAttachment**](CalendarApi.md#addcalendarattachment) | **PUT** /email/Calendar/{name}/attachments/{attachment} | Adds an attachment to iCalendar file
*CalendarApi* | [**createCalendar**](CalendarApi.md#createcalendar) | **PUT** /email/Calendar/{name} | Create calendar file
*CalendarApi* | [**deleteCalendarProperty**](CalendarApi.md#deletecalendarproperty) | **DELETE** /email/Calendar/{name}/properties/{memberName}/{index} | Deletes indexed property by index and name. To delete Reminder attachment, use path ReminderAttachment/{ReminderIndex}/{AttachmentIndex}
*CalendarApi* | [**getCalendar**](CalendarApi.md#getcalendar) | **GET** /email/Calendar/{name}/properties | Get calendar file properties
*CalendarApi* | [**getCalendarAttachment**](CalendarApi.md#getcalendarattachment) | **GET** /email/Calendar/{name}/attachments/{attachment} | Get iCalendar document attachment by name
*CalendarApi* | [**getCalendarList**](CalendarApi.md#getcalendarlist) | **GET** /email/Calendar | Get iCalendar files list in folder on storage
*CalendarApi* | [**updateCalendarProperties**](CalendarApi.md#updatecalendarproperties) | **PUT** /email/Calendar/{name}/properties | Update calendar file properties
*ContactApi* | [**addContactAttachment**](ContactApi.md#addcontactattachment) | **PUT** /email/Contact/{format}/{name}/attachments/{attachment} | Add attachment to contact document
*ContactApi* | [**createContact**](ContactApi.md#createcontact) | **PUT** /email/Contact/{format}/{name} | Create contact document
*ContactApi* | [**deleteContactProperty**](ContactApi.md#deletecontactproperty) | **DELETE** /email/Contact/{format}/{name}/properties/{memberName}/{index} | Delete property from indexed property list
*ContactApi* | [**getContactAttachment**](ContactApi.md#getcontactattachment) | **GET** /email/Contact/{format}/{name}/attachments/{attachment} | Get attachment file by name
*ContactApi* | [**getContactList**](ContactApi.md#getcontactlist) | **GET** /email/Contact/{format} | Get contact list from storage folder
*ContactApi* | [**getContactProperties**](ContactApi.md#getcontactproperties) | **GET** /email/Contact/{format}/{name}/properties | Get contact document properties
*ContactApi* | [**updateContactProperties**](ContactApi.md#updatecontactproperties) | **PUT** /email/Contact/{format}/{name}/properties | Update contact document properties
*EmailApi* | [**addEmailAttachment**](EmailApi.md#addemailattachment) | **POST** /email/{fileName}/attachments/{attachmentName} | Adds an attachment to Email document
*EmailApi* | [**createEmail**](EmailApi.md#createemail) | **PUT** /email/{fileName} | Create an email document
*EmailApi* | [**getEmail**](EmailApi.md#getemail) | **GET** /email/{fileName} | Get email document
*EmailApi* | [**getEmailAttachment**](EmailApi.md#getemailattachment) | **GET** /email/{fileName}/attachments/{attachment} | Get email attachment by name
*EmailApi* | [**getEmailProperty**](EmailApi.md#getemailproperty) | **GET** /email/{fileName}/properties/{propertyName} | Get an email document property by its name
*EmailApi* | [**setEmailProperty**](EmailApi.md#setemailproperty) | **PUT** /email/{fileName}/properties/{propertyName} | Set email document property value
*EmailClientApi* | [**appendEmailMessage**](EmailClientApi.md#appendemailmessage) | **PUT** /email/client/Append | Adds an email from *.eml file to specified folder in email account
*EmailClientApi* | [**appendMimeMessage**](EmailClientApi.md#appendmimemessage) | **PUT** /email/client/AppendMime | Adds an email from MIME to specified folder in email account
*EmailClientApi* | [**createEmailFolder**](EmailClientApi.md#createemailfolder) | **PUT** /email/client/CreateFolder | Create new folder in email account
*EmailClientApi* | [**deleteEmailFolder**](EmailClientApi.md#deleteemailfolder) | **DELETE** /email/client/DeleteFolder | Delete a folder in email account
*EmailClientApi* | [**deleteEmailMessage**](EmailClientApi.md#deleteemailmessage) | **DELETE** /email/client/DeleteMessage | Delete message from email account by id
*EmailClientApi* | [**fetchEmailMessage**](EmailClientApi.md#fetchemailmessage) | **GET** /email/client/Fetch | Fetch message mime from email account
*EmailClientApi* | [**listEmailFolders**](EmailClientApi.md#listemailfolders) | **GET** /email/client/ListFolders | Get folders list in email account
*EmailClientApi* | [**listEmailMessages**](EmailClientApi.md#listemailmessages) | **GET** /email/client/ListMessages | Get messages from folder, filtered by query
*EmailClientApi* | [**saveMailAccount**](EmailClientApi.md#savemailaccount) | **POST** /email/client/SaveMailAccount | Create email account file (*.account) with login/password authentication
*EmailClientApi* | [**saveMailOAuthAccount**](EmailClientApi.md#savemailoauthaccount) | **POST** /email/client/SaveMailOAuthAccount | Create email account file (*.account) with OAuth
*EmailClientApi* | [**sendEmail**](EmailClientApi.md#sendemail) | **POST** /email/client/Send | Send an email from *.eml file located on storage
*EmailClientApi* | [**sendEmailMime**](EmailClientApi.md#sendemailmime) | **POST** /email/client/SendMime | Send an email specified by MIME in request
*EmailClientApi* | [**setEmailReadFlag**](EmailClientApi.md#setemailreadflag) | **POST** /email/client/SetReadFlag | Sets \&quot;Message is read\&quot; flag
*FileApi* | [**copyFile**](FileApi.md#copyfile) | **PUT** /email/storage/file/copy/{srcPath} | Copy file
*FileApi* | [**deleteFile**](FileApi.md#deletefile) | **DELETE** /email/storage/file/{path} | Delete file
*FileApi* | [**downloadFile**](FileApi.md#downloadfile) | **GET** /email/storage/file/{path} | Download file
*FileApi* | [**moveFile**](FileApi.md#movefile) | **PUT** /email/storage/file/move/{srcPath} | Move file
*FileApi* | [**uploadFile**](FileApi.md#uploadfile) | **PUT** /email/storage/file/{path} | Upload file
*FolderApi* | [**copyFolder**](FolderApi.md#copyfolder) | **PUT** /email/storage/folder/copy/{srcPath} | Copy folder
*FolderApi* | [**createFolder**](FolderApi.md#createfolder) | **PUT** /email/storage/folder/{path} | Create the folder
*FolderApi* | [**deleteFolder**](FolderApi.md#deletefolder) | **DELETE** /email/storage/folder/{path} | Delete folder
*FolderApi* | [**getFilesList**](FolderApi.md#getfileslist) | **GET** /email/storage/folder/{path} | Get all files and folders within a folder
*FolderApi* | [**moveFolder**](FolderApi.md#movefolder) | **PUT** /email/storage/folder/move/{srcPath} | Move folder
*MapiApi* | [**addMapiAttachment**](MapiApi.md#addmapiattachment) | **PUT** /email/Mapi/{name}/attachments/{attachment} | Add attachment to document
*MapiApi* | [**createMapi**](MapiApi.md#createmapi) | **PUT** /email/Mapi/{name} | Create new document
*MapiApi* | [**deleteMapiAttachment**](MapiApi.md#deletemapiattachment) | **DELETE** /email/Mapi/{name}/attachments/{attachment} | Remove attachment from document
*MapiApi* | [**deleteMapiProperties**](MapiApi.md#deletemapiproperties) | **DELETE** /email/Mapi/{name}/properties | Delete document properties
*MapiApi* | [**getMapiAttachment**](MapiApi.md#getmapiattachment) | **GET** /email/Mapi/{name}/attachments/{attachment} | Get document attachment as file stream
*MapiApi* | [**getMapiAttachments**](MapiApi.md#getmapiattachments) | **GET** /email/Mapi/{name}/attachments | Get document attachment list
*MapiApi* | [**getMapiList**](MapiApi.md#getmapilist) | **GET** /email/Mapi | Get document list from storage folder
*MapiApi* | [**getMapiProperties**](MapiApi.md#getmapiproperties) | **GET** /email/Mapi/{name}/properties | Get document properties
*MapiApi* | [**updateMapiProperties**](MapiApi.md#updatemapiproperties) | **PUT** /email/Mapi/{name}/properties | Update document properties
*StorageApi* | [**getDiscUsage**](StorageApi.md#getdiscusage) | **GET** /email/storage/disc | Get disc usage
*StorageApi* | [**getFileVersions**](StorageApi.md#getfileversions) | **GET** /email/storage/version/{path} | Get file versions
*StorageApi* | [**objectExists**](StorageApi.md#objectexists) | **GET** /email/storage/exist/{path} | Check if file or folder exists
*StorageApi* | [**storageExists**](StorageApi.md#storageexists) | **GET** /email/storage/{storageName}/exist | Check if storage exists


<a name="documentation-for-models"></a>
## Documentation for Models

 - [com.aspose.email.cloud.sdk.model.AccountBaseRequest](AccountBaseRequest.md)
 - [com.aspose.email.cloud.sdk.model.AddAttachmentRequest](AddAttachmentRequest.md)
 - [com.aspose.email.cloud.sdk.model.BaseObject](BaseObject.md)
 - [com.aspose.email.cloud.sdk.model.ContactFormat](ContactFormat.md)
 - [com.aspose.email.cloud.sdk.model.CreateEmailRequest](CreateEmailRequest.md)
 - [com.aspose.email.cloud.sdk.model.DiscUsage](DiscUsage.md)
 - [com.aspose.email.cloud.sdk.model.EmailAccountRequest](EmailAccountRequest.md)
 - [com.aspose.email.cloud.sdk.model.EmailDocument](EmailDocument.md)
 - [com.aspose.email.cloud.sdk.model.EmailDocumentResponse](EmailDocumentResponse.md)
 - [com.aspose.email.cloud.sdk.model.EmailProperties](EmailProperties.md)
 - [com.aspose.email.cloud.sdk.model.EmailProperty](EmailProperty.md)
 - [com.aspose.email.cloud.sdk.model.EmailPropertyResponse](EmailPropertyResponse.md)
 - [com.aspose.email.cloud.sdk.model.Error](Error.md)
 - [com.aspose.email.cloud.sdk.model.ErrorDetails](ErrorDetails.md)
 - [com.aspose.email.cloud.sdk.model.FileVersions](FileVersions.md)
 - [com.aspose.email.cloud.sdk.model.FilesList](FilesList.md)
 - [com.aspose.email.cloud.sdk.model.FilesUploadResult](FilesUploadResult.md)
 - [com.aspose.email.cloud.sdk.model.HierarchicalObjectRequest](HierarchicalObjectRequest.md)
 - [com.aspose.email.cloud.sdk.model.HierarchicalObjectResponse](HierarchicalObjectResponse.md)
 - [com.aspose.email.cloud.sdk.model.Link](Link.md)
 - [com.aspose.email.cloud.sdk.model.ListResponseOfHierarchicalObjectResponse](ListResponseOfHierarchicalObjectResponse.md)
 - [com.aspose.email.cloud.sdk.model.ListResponseOfMailServerFolder](ListResponseOfMailServerFolder.md)
 - [com.aspose.email.cloud.sdk.model.ListResponseOfString](ListResponseOfString.md)
 - [com.aspose.email.cloud.sdk.model.MailServerFolder](MailServerFolder.md)
 - [com.aspose.email.cloud.sdk.model.MimeResponse](MimeResponse.md)
 - [com.aspose.email.cloud.sdk.model.ObjectExist](ObjectExist.md)
 - [com.aspose.email.cloud.sdk.model.SetEmailPropertyRequest](SetEmailPropertyRequest.md)
 - [com.aspose.email.cloud.sdk.model.StorageExist](StorageExist.md)
 - [com.aspose.email.cloud.sdk.model.StorageFile](StorageFile.md)
 - [com.aspose.email.cloud.sdk.model.StorageFolderLocation](StorageFolderLocation.md)
 - [com.aspose.email.cloud.sdk.model.ValueResponse](ValueResponse.md)
 - [com.aspose.email.cloud.sdk.model.AppendEmailAccountBaseRequest](AppendEmailAccountBaseRequest.md)
 - [com.aspose.email.cloud.sdk.model.CreateFolderBaseRequest](CreateFolderBaseRequest.md)
 - [com.aspose.email.cloud.sdk.model.DeleteFolderBaseRequest](DeleteFolderBaseRequest.md)
 - [com.aspose.email.cloud.sdk.model.DeleteMessageBaseRequest](DeleteMessageBaseRequest.md)
 - [com.aspose.email.cloud.sdk.model.FileVersion](FileVersion.md)
 - [com.aspose.email.cloud.sdk.model.HierarchicalObject](HierarchicalObject.md)
 - [com.aspose.email.cloud.sdk.model.IndexedHierarchicalObject](IndexedHierarchicalObject.md)
 - [com.aspose.email.cloud.sdk.model.IndexedPrimitiveObject](IndexedPrimitiveObject.md)
 - [com.aspose.email.cloud.sdk.model.PrimitiveObject](PrimitiveObject.md)
 - [com.aspose.email.cloud.sdk.model.SaveEmailAccountRequest](SaveEmailAccountRequest.md)
 - [com.aspose.email.cloud.sdk.model.SaveOAuthEmailAccountRequest](SaveOAuthEmailAccountRequest.md)
 - [com.aspose.email.cloud.sdk.model.SendEmailBaseRequest](SendEmailBaseRequest.md)
 - [com.aspose.email.cloud.sdk.model.SendEmailMimeBaseRequest](SendEmailMimeBaseRequest.md)
 - [com.aspose.email.cloud.sdk.model.SetMessageReadFlagAccountBaseRequest](SetMessageReadFlagAccountBaseRequest.md)
 - [com.aspose.email.cloud.sdk.model.StorageFileLocation](StorageFileLocation.md)
 - [com.aspose.email.cloud.sdk.model.AppendEmailBaseRequest](AppendEmailBaseRequest.md)
 - [com.aspose.email.cloud.sdk.model.AppendEmailMimeBaseRequest](AppendEmailMimeBaseRequest.md)

