# Manage Emails in Cloud via Java REST SDK
[![Maven](https://img.shields.io/maven-metadata/v?metadataUrl=https%3A%2F%2Frepository.aspose.cloud%2Frepo%2Fcom%2Faspose%2Faspose-email-cloud%2Fmaven-metadata.xml)](https://repository.aspose.cloud/repo/com/aspose/aspose-email-cloud/) [![License](https://img.shields.io/github/license/aspose-email-cloud/aspose-email-cloud-java)](https://repository.aspose.cloud/repo/com/aspose/aspose-email-cloud/) ![tests](https://github.com/aspose-email-cloud/aspose-email-cloud-java/workflows/tests/badge.svg)

[Aspose.Email Cloud SDK for Java](https://products.aspose.cloud/email/java) is a REST API SDK for creating email applications that work with standard email file formats such as Outlook MSG, EML, iCalendar files and VCard.

This SDK allows you to work with Aspose.Email Cloud REST APIs in your Java applications quickly and easily, with zero initial cost.

[Aspose.Email Cloud home](https://products.aspose.cloud/email/family)  
[API Reference](https://apireference.aspose.cloud/email/)  

# Cloud Email Processing Features
Aspose.Email Cloud is a REST API for creating email applications that work with standard email file formats. This SDK:
- Lets developers manipulate different emails' formats such as Outlook MSG, EML, VCard, and iCalendar files.
- Supports AI functions:
    - The Business card recognition.
    - The Name API for parsing and handling personal names.
- Has a built-in email client. This client provides:
    - Unified REST API for different email protocols: IMAP, POP3, SMTP, EWS, WebDav.
    - Virtual multi-account.
    - Message threads (POP3 accounts are also supported).
- Email configuration discovery.
- Disposable email address detection.

## New features in version 20.9

Aspose.Email Cloud SDK 20.9.0 is based on a new v4.0 REST API.

- All SDK functions are divided into groups (Email, Calendar, Contact, Client, Ai, Mapi, etc.).
- Unified file API provided for supported file types (Save, Get, Convert, AsFile, FromFile, AsMapi/AsDto).
- HierarchicalObject based API is removed.
- All models are stored in one folder/namespace.
- The request models are simplified.

See [Release notes](https://docs.aspose.cloud/email/aspose-email-cloud-20-9-release-notes/).

## How to use the SDK?
The complete source code is available in the [GIT repository](https://github.com/aspose-email-cloud/aspose-email-cloud-java/tree/master/src/main/java/com/aspose/email/cloud/sdk).

Use [SDK tutorials](https://docs.aspose.cloud/email/sdk-tutorials/).

SDK reference documentation is available in [this README](https://github.com/aspose-email-cloud/aspose-email-cloud-java/blob/master/docs/README.md).

### Prerequisites
To use this SDK, you need an App SID and an App Key; they can be looked up at [Aspose Cloud Dashboard](https://dashboard.aspose.cloud/#/apps) (it requires free registration in Aspose Cloud for this).

### Installation
You can either directly use it in your project via jar file or add it as Maven dependency ([see repo](https://repository.aspose.cloud/repo/com/aspose/aspose-email-cloud/)):

First, you should add a repository:
```xml
<repository>
    <id>aspose-cloud</id>
    <name>Aspose.Cloud repository</name>
    <url>https://repository.aspose.cloud</url>
</repository>
```
Then, add a dependency:
```xml
<dependency>
    <groupId>com.aspose</groupId>
    <artifactId>aspose-email-cloud</artifactId>
</dependency>
```

See more details about SDK installation in this tutorial: [SDK setup](https://docs.aspose.cloud/email/sdk-setup/).

### Usage examples
To use the API, you should create an EmailCloud object:
```java
EmailCloud api = new EmailCloud("Your App Key", "Your App SID");
```

#### Business cards recognition API
Use `AiBcrApi.parse` method to parse business card image to VCard DTO:

```java
byte[] fileBytes = IOUtils.toByteArray(new FileInputStream("/tmp/alex.png"));
ContactList result = api.ai().bcr().parse(new AiBcrParseRequest(
    fileBytes, null, null, true));
ContactDto contact = result.getValue().get(0);
assert contact.getDisplayName().contains("Parsed Display Name");
```

[Product Page](https://products.aspose.cloud/email/java) | [Documentation](https://docs.aspose.cloud/email/) | [Demo](https://products.aspose.app/email/family) | [API Reference](https://apireference.aspose.cloud/email/) | [Blog](https://blog.aspose.cloud/category/email/) | [Free support](https://forum.aspose.cloud/c/email) | [Free trial](https://dashboard.aspose.cloud/#/apps)
