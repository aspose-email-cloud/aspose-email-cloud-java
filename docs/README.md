<a name="documentation-for-api-endpoints"></a>
## Documentation for API endpoints

All URIs are relative to *https://api.aspose.cloud/v3.0*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*EmailApi* | [**addCalendarAttachment**](EmailApi.md#addcalendarattachment) | **PUT** /email/Calendar/{name}/attachments/{attachment} | Adds an attachment to iCalendar file
*EmailApi* | [**addContactAttachment**](EmailApi.md#addcontactattachment) | **PUT** /email/Contact/{format}/{name}/attachments/{attachment} | Add attachment to contact document
*EmailApi* | [**addEmailAttachment**](EmailApi.md#addemailattachment) | **POST** /email/{fileName}/attachments/{attachmentName} | Adds an attachment to Email document
*EmailApi* | [**addMapiAttachment**](EmailApi.md#addmapiattachment) | **PUT** /email/Mapi/{name}/attachments/{attachment} | Add attachment to document
*EmailApi* | [**appendEmailMessage**](EmailApi.md#appendemailmessage) | **PUT** /email/client/Append | Adds an email from *.eml file to specified folder in email account
*EmailApi* | [**appendMimeMessage**](EmailApi.md#appendmimemessage) | **PUT** /email/client/AppendMime | Adds an email from MIME to specified folder in email account
*EmailApi* | [**copyFile**](EmailApi.md#copyfile) | **PUT** /email/storage/file/copy/{srcPath} | Copy file
*EmailApi* | [**copyFolder**](EmailApi.md#copyfolder) | **PUT** /email/storage/folder/copy/{srcPath} | Copy folder
*EmailApi* | [**createCalendar**](EmailApi.md#createcalendar) | **PUT** /email/Calendar/{name} | Create calendar file
*EmailApi* | [**createContact**](EmailApi.md#createcontact) | **PUT** /email/Contact/{format}/{name} | Create contact document
*EmailApi* | [**createEmail**](EmailApi.md#createemail) | **PUT** /email/{fileName} | Create an email document
*EmailApi* | [**createEmailFolder**](EmailApi.md#createemailfolder) | **PUT** /email/client/CreateFolder | Create new folder in email account
*EmailApi* | [**createFolder**](EmailApi.md#createfolder) | **PUT** /email/storage/folder/{path} | Create the folder
*EmailApi* | [**createMapi**](EmailApi.md#createmapi) | **PUT** /email/Mapi/{name} | Create new document
*EmailApi* | [**deleteCalendarProperty**](EmailApi.md#deletecalendarproperty) | **DELETE** /email/Calendar/{name}/properties/{memberName}/{index} | Deletes indexed property by index and name. To delete Reminder attachment, use path ReminderAttachment/{ReminderIndex}/{AttachmentIndex}
*EmailApi* | [**deleteContactProperty**](EmailApi.md#deletecontactproperty) | **DELETE** /email/Contact/{format}/{name}/properties/{memberName}/{index} | Delete property from indexed property list
*EmailApi* | [**deleteEmailFolder**](EmailApi.md#deleteemailfolder) | **DELETE** /email/client/DeleteFolder | Delete a folder in email account
*EmailApi* | [**deleteEmailMessage**](EmailApi.md#deleteemailmessage) | **DELETE** /email/client/DeleteMessage | Delete message from email account by id
*EmailApi* | [**deleteFile**](EmailApi.md#deletefile) | **DELETE** /email/storage/file/{path} | Delete file
*EmailApi* | [**deleteFolder**](EmailApi.md#deletefolder) | **DELETE** /email/storage/folder/{path} | Delete folder
*EmailApi* | [**deleteMapiAttachment**](EmailApi.md#deletemapiattachment) | **DELETE** /email/Mapi/{name}/attachments/{attachment} | Remove attachment from document
*EmailApi* | [**deleteMapiProperties**](EmailApi.md#deletemapiproperties) | **DELETE** /email/Mapi/{name}/properties | Delete document properties
*EmailApi* | [**downloadFile**](EmailApi.md#downloadfile) | **GET** /email/storage/file/{path} | Download file
*EmailApi* | [**fetchEmailMessage**](EmailApi.md#fetchemailmessage) | **GET** /email/client/Fetch | Fetch message mime from email account
*EmailApi* | [**getCalendar**](EmailApi.md#getcalendar) | **GET** /email/Calendar/{name}/properties | Get calendar file properties
*EmailApi* | [**getCalendarAttachment**](EmailApi.md#getcalendarattachment) | **GET** /email/Calendar/{name}/attachments/{attachment} | Get iCalendar document attachment by name
*EmailApi* | [**getCalendarList**](EmailApi.md#getcalendarlist) | **GET** /email/Calendar | Get iCalendar files list in folder on storage
*EmailApi* | [**getContactAttachment**](EmailApi.md#getcontactattachment) | **GET** /email/Contact/{format}/{name}/attachments/{attachment} | Get attachment file by name
*EmailApi* | [**getContactList**](EmailApi.md#getcontactlist) | **GET** /email/Contact/{format} | Get contact list from storage folder
*EmailApi* | [**getContactProperties**](EmailApi.md#getcontactproperties) | **GET** /email/Contact/{format}/{name}/properties | Get contact document properties
*EmailApi* | [**getDiscUsage**](EmailApi.md#getdiscusage) | **GET** /email/storage/disc | Get disc usage
*EmailApi* | [**getEmail**](EmailApi.md#getemail) | **GET** /email/{fileName} | Get email document
*EmailApi* | [**getEmailAttachment**](EmailApi.md#getemailattachment) | **GET** /email/{fileName}/attachments | Get email attachment by name
*EmailApi* | [**getEmailProperty**](EmailApi.md#getemailproperty) | **GET** /email/{fileName}/properties/{propertyName} | Get an email document property by its name
*EmailApi* | [**getFileVersions**](EmailApi.md#getfileversions) | **GET** /email/storage/version/{path} | Get file versions
*EmailApi* | [**getFilesList**](EmailApi.md#getfileslist) | **GET** /email/storage/folder/{path} | Get all files and folders within a folder
*EmailApi* | [**getMapiAttachment**](EmailApi.md#getmapiattachment) | **GET** /email/Mapi/{name}/attachments/{attachment} | Get document attachment as file stream
*EmailApi* | [**getMapiAttachments**](EmailApi.md#getmapiattachments) | **GET** /email/Mapi/{name}/attachments | Get document attachment list
*EmailApi* | [**getMapiList**](EmailApi.md#getmapilist) | **GET** /email/Mapi | Get document list from storage folder
*EmailApi* | [**getMapiProperties**](EmailApi.md#getmapiproperties) | **GET** /email/Mapi/{name}/properties | Get document properties
*EmailApi* | [**listEmailFolders**](EmailApi.md#listemailfolders) | **GET** /email/client/ListFolders | Get folders list in email account
*EmailApi* | [**listEmailMessages**](EmailApi.md#listemailmessages) | **GET** /email/client/ListMessages | Get messages from folder, filtered by query
*EmailApi* | [**moveFile**](EmailApi.md#movefile) | **PUT** /email/storage/file/move/{srcPath} | Move file
*EmailApi* | [**moveFolder**](EmailApi.md#movefolder) | **PUT** /email/storage/folder/move/{srcPath} | Move folder
*EmailApi* | [**objectExists**](EmailApi.md#objectexists) | **GET** /email/storage/exist/{path} | Check if file or folder exists
*EmailApi* | [**saveMailAccount**](EmailApi.md#savemailaccount) | **POST** /email/client/SaveMailAccount | Create email account file (*.account) with login/password authentication
*EmailApi* | [**saveMailOAuthAccount**](EmailApi.md#savemailoauthaccount) | **POST** /email/client/SaveMailOAuthAccount | Create email account file (*.account) with OAuth
*EmailApi* | [**sendEmail**](EmailApi.md#sendemail) | **POST** /email/client/Send | Send an email from *.eml file located on storage
*EmailApi* | [**sendEmailMime**](EmailApi.md#sendemailmime) | **POST** /email/client/SendMime | Send an email specified by MIME in request
*EmailApi* | [**setEmailProperty**](EmailApi.md#setemailproperty) | **PUT** /email/{fileName}/properties/{propertyName} | Set email document property value
*EmailApi* | [**setEmailReadFlag**](EmailApi.md#setemailreadflag) | **POST** /email/client/SetReadFlag | Sets \&quot;Message is read\&quot; flag
*EmailApi* | [**storageExists**](EmailApi.md#storageexists) | **GET** /email/storage/{storageName}/exist | Check if storage exists
*EmailApi* | [**updateCalendarProperties**](EmailApi.md#updatecalendarproperties) | **PUT** /email/Calendar/{name}/properties | Update calendar file properties
*EmailApi* | [**updateContactProperties**](EmailApi.md#updatecontactproperties) | **PUT** /email/Contact/{format}/{name}/properties | Update contact document properties
*EmailApi* | [**updateMapiProperties**](EmailApi.md#updatemapiproperties) | **PUT** /email/Mapi/{name}/properties | Update document properties
*EmailApi* | [**uploadFile**](EmailApi.md#uploadfile) | **PUT** /email/storage/file/{path} | Upload file


<a name="documentation-for-models"></a>
## Documentation for Models

 - [com.aspose.email.cloud.sdk.model.AccountBaseRequest](AccountBaseRequest.md)
 - [com.aspose.email.cloud.sdk.model.AddAttachmentRequest](AddAttachmentRequest.md)
 - [com.aspose.email.cloud.sdk.model.AsposeResponse](AsposeResponse.md)
 - [com.aspose.email.cloud.sdk.model.BaseObject](BaseObject.md)
 - [com.aspose.email.cloud.sdk.model.ContactFormat](ContactFormat.md)
 - [com.aspose.email.cloud.sdk.model.CreateEmailRequest](CreateEmailRequest.md)
 - [com.aspose.email.cloud.sdk.model.DiscUsage](DiscUsage.md)
 - [com.aspose.email.cloud.sdk.model.EmailAccountRequest](EmailAccountRequest.md)
 - [com.aspose.email.cloud.sdk.model.EmailDocument](EmailDocument.md)
 - [com.aspose.email.cloud.sdk.model.EmailProperties](EmailProperties.md)
 - [com.aspose.email.cloud.sdk.model.EmailProperty](EmailProperty.md)
 - [com.aspose.email.cloud.sdk.model.Error](Error.md)
 - [com.aspose.email.cloud.sdk.model.ErrorDetails](ErrorDetails.md)
 - [com.aspose.email.cloud.sdk.model.FileVersions](FileVersions.md)
 - [com.aspose.email.cloud.sdk.model.FilesList](FilesList.md)
 - [com.aspose.email.cloud.sdk.model.FilesUploadResult](FilesUploadResult.md)
 - [com.aspose.email.cloud.sdk.model.HierarchicalObjectRequest](HierarchicalObjectRequest.md)
 - [com.aspose.email.cloud.sdk.model.HierarchicalObjectResponse](HierarchicalObjectResponse.md)
 - [com.aspose.email.cloud.sdk.model.Link](Link.md)
 - [com.aspose.email.cloud.sdk.model.ListResponseOfHierarchicalObjectResponse](ListResponseOfHierarchicalObjectResponse.md)
 - [com.aspose.email.cloud.sdk.model.ListResponseOfString](ListResponseOfString.md)
 - [com.aspose.email.cloud.sdk.model.MailServerFolder](MailServerFolder.md)
 - [com.aspose.email.cloud.sdk.model.ObjectExist](ObjectExist.md)
 - [com.aspose.email.cloud.sdk.model.SetEmailPropertyRequest](SetEmailPropertyRequest.md)
 - [com.aspose.email.cloud.sdk.model.StorageExist](StorageExist.md)
 - [com.aspose.email.cloud.sdk.model.StorageFile](StorageFile.md)
 - [com.aspose.email.cloud.sdk.model.StorageFolderLocation](StorageFolderLocation.md)
 - [com.aspose.email.cloud.sdk.model.AppendEmailAccountBaseRequest](AppendEmailAccountBaseRequest.md)
 - [com.aspose.email.cloud.sdk.model.CreateFolderBaseRequest](CreateFolderBaseRequest.md)
 - [com.aspose.email.cloud.sdk.model.DeleteFolderBaseRequest](DeleteFolderBaseRequest.md)
 - [com.aspose.email.cloud.sdk.model.DeleteMessageBaseRequest](DeleteMessageBaseRequest.md)
 - [com.aspose.email.cloud.sdk.model.EmailDocumentResponse](EmailDocumentResponse.md)
 - [com.aspose.email.cloud.sdk.model.EmailPropertyResponse](EmailPropertyResponse.md)
 - [com.aspose.email.cloud.sdk.model.FaultResponse](FaultResponse.md)
 - [com.aspose.email.cloud.sdk.model.FileVersion](FileVersion.md)
 - [com.aspose.email.cloud.sdk.model.HierarchicalObject](HierarchicalObject.md)
 - [com.aspose.email.cloud.sdk.model.IndexedHierarchicalObject](IndexedHierarchicalObject.md)
 - [com.aspose.email.cloud.sdk.model.IndexedPrimitiveObject](IndexedPrimitiveObject.md)
 - [com.aspose.email.cloud.sdk.model.ListFoldersResponse](ListFoldersResponse.md)
 - [com.aspose.email.cloud.sdk.model.ListMessagesResponse](ListMessagesResponse.md)
 - [com.aspose.email.cloud.sdk.model.MimeResponse](MimeResponse.md)
 - [com.aspose.email.cloud.sdk.model.PrimitiveObject](PrimitiveObject.md)
 - [com.aspose.email.cloud.sdk.model.SaveEmailAccountRequest](SaveEmailAccountRequest.md)
 - [com.aspose.email.cloud.sdk.model.SaveOAuthEmailAccountRequest](SaveOAuthEmailAccountRequest.md)
 - [com.aspose.email.cloud.sdk.model.SendEmailBaseRequest](SendEmailBaseRequest.md)
 - [com.aspose.email.cloud.sdk.model.SendEmailMimeBaseRequest](SendEmailMimeBaseRequest.md)
 - [com.aspose.email.cloud.sdk.model.SetMessageReadFlagAccountBaseRequest](SetMessageReadFlagAccountBaseRequest.md)
 - [com.aspose.email.cloud.sdk.model.StorageFileLocation](StorageFileLocation.md)
 - [com.aspose.email.cloud.sdk.model.ValueResponse](ValueResponse.md)
 - [com.aspose.email.cloud.sdk.model.AppendEmailBaseRequest](AppendEmailBaseRequest.md)
 - [com.aspose.email.cloud.sdk.model.AppendEmailMimeBaseRequest](AppendEmailMimeBaseRequest.md)

