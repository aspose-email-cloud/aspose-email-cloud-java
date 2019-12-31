# Aspose.Email Cloud SDK for Java [![Maven](https://img.shields.io/maven-metadata/v?metadataUrl=https%3A%2F%2Frepository.aspose.cloud%2Frepo%2Fcom%2Faspose%2Faspose-email-cloud%2Fmaven-metadata.xml)](https://repository.aspose.cloud/repo/com/aspose/aspose-email-cloud/) [![License](https://img.shields.io/github/license/aspose-email-cloud/aspose-email-cloud-java)](https://repository.aspose.cloud/repo/com/aspose/aspose-email-cloud/)
This repository contains Aspose.Email Cloud SDK for Java source code. This SDK allows you to work with Aspose.Email Cloud REST APIs in your Java applications quickly and easily, with zero initial cost.

[Aspose.Email Cloud home](https://products.aspose.cloud/email/family "Aspose.Email Cloud")  
[API Reference](https://apireference.aspose.cloud/email/)  




## How to use the SDK?
The complete source code is available in the GIT repository.

Use reference documentation, available [**here**](docs/README.md)

### Prerequisites
To use these SDK, you need an App SID and an App Key; they can be looked up at [Aspose Cloud Dashboard](https://dashboard.aspose.cloud/#/apps) (it requires free registration in Aspose Cloud for this).

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

### Usage examples
To use the API, you should create an EmailApi object:
```java
EmailApi api = new EmailApi("Your App Key", "Your App SID");
```

#### Business cards recognition API
See examples below:

<details open>
    <summary>Parse business card images to VCard contact files</summary>

```java
// Upload business card image to storage
String storage = "First Storage"; //Your storage name
String fileName = "someFileName.png"; //Supports different image formats: PNG, JPEG, BMP, TIFF, GIF, etc.
String folder = "some/folder/path/on/storage";
String filePath = folder + "/" + fileName;
byte[] fileBytes = IOUtils.toByteArray(
    new FileInputStream("some/business/card/image/on/disk.png"));
api.uploadFile(new UploadFileRequestData(
    filePath,
    fileBytes,
    storage));
String outFolderPath = "some/other/folder/path/on/storage"; //Business card recognition results will be saved here
api.createFolder(new CreateFolderRequestData(outFolderPath, storage));
// Call business card recognition action
ListResponseOfStorageFileLocation result = api.aiBcrParseStorage(new AiBcrParseStorageRequestData(
    new AiBcrParseStorageRq(
        null,
        //We can process multiple images in one request
        Arrays.asList(new AiBcrImageStorageFile(
            true, //Flag isSingle determines that image contains single VCard or more.
                  //Only single VCard on image variant is supported in current version.
            new StorageFileLocation(storage, folder, fileName))),
        new StorageFolderLocation(storage, outFolderPath))));
// Get file name from recognition result
StorageFileLocation contactFile = result.getValue().get(0); //result.getValue() can contain multiple files, if we sent multicard images or multiple images
//  You can download the VCard file, which produced by the recognition method ...
byte[] contactBytes = api.downloadFile(new DownloadFileRequestData(
    contactFile.getFolderPath() + "/" + contactFile.getFileName(),
    contactFile.getStorage(),
    null));
String contactFileContent = new String(contactBytes, StandardCharsets.UTF_8);
//... and print it
System.out.println(contactFileContent);
// Also, you can get VCard object properties’ list using Contact API
HierarchicalObject contactProperties = api.getContactProperties(
    new GetContactPropertiesRequestData(
        "VCard",
        contactFile.getFileName(),
        contactFile.getFolderPath(),
        contactFile.getStorage()));
//All VCard’s properties are available as a list. Complex properties are represented as hierarchical structures.
//Let's print all primitive properties’ values:
for (BaseObject property: contactProperties.getInternalProperties()) {
    if (property.getType().equals("PrimitiveObject")) {
        PrimitiveObject primitive = (PrimitiveObject)property;
        System.out.println("Property name: " +
            primitive.getName() +
            " value: " +
            primitive.getValue());
    }
}
```
</details>


<details>
    <summary>Parse images directly, without the using of a storage</summary>

```java
//Read image from file and convert it to Base64 string
byte[] fileBytes = IOUtils.toByteArray(
    new FileInputStream("some/business/card/image/on/disk.png"));
String fileBase64 = Base64.encodeToString(fileBytes, false);
ListResponseOfHierarchicalObject result = api.aiBcrParse(new AiBcrParseRequestData(
    new AiBcrBase64Rq(null, Arrays.asList(new AiBcrBase64Image(true, fileBase64)))));
//Result contains all recognized VCard objects (only the one in our case)
HierarchicalObject contactProperties = result.getValue().get(0);
//VCard object is available as a list of properties, without any external calls:
for (BaseObject property: contactProperties.getInternalProperties()) {
    if (property.getType().equals("PrimitiveObject")) {
        PrimitiveObject primitive = (PrimitiveObject)property;
        System.out.println("Property name: " +
            primitive.getName() +
            " value: " +
            primitive.getValue());
    }
}
```
</details>


#### Name API
See examples below:
<details open>
    <summary>Detect a person's gender by name</summary>

```java
ListResponseOfAiNameGenderHypothesis result = api
        .aiNameGenderize(new AiNameGenderizeRequestData("John Cane", null, null, null, null, null));
// the result contains a list of hypothesis about a person's gender.
// all hypothesis include score, so you can use the most scored version,
// which will be the first in a list:
System.out.println(result.getValue().get(0).getGender()); //prints "Male"
```
</details>

<details>
    <summary>Format person's name using defined format</summary>

```java
AiNameFormatted result = api.aiNameFormat(
        new AiNameFormatRequestData("Mr. John Michael Cane", null, null, null, null, "%t%L%f%m", null));
System.out.println(result.getName()) // prints "Mr. Cane J. M."
```
</details>

<details>
    <summary>Compare the names to find out if they belong to the same person or not</summary>

```java
final String first = "John Michael Cane";
final String second = "Cane J.";
AiNameMatchResult result = api
        .aiNameMatch(new AiNameMatchRequestData(first, second, null, null, null, null, null));
System.out.println(result.getSimilarity() >= 0.5); //prints "true", names look similar
```
</details>

<details>
    <summary>Expand a person's name into a list of possible alternatives</summary>


```java
String name = "Smith Bobby";
AiNameWeightedVariants result = api
        .aiNameExpand(new AiNameExpandRequestData(name, null, null, null, null, null));
for (AiNameWeighted weighted : result.getNames()) {
    System.out.println(weighted.getName()); //prints "Mr. Smith", "B. Smith", etc.
}
```
</details>

<details>
    <summary>Get k most probable names for given starting characters</summary>

```java
String prefix = "Dav";
AiNameWeightedVariants result = api
        .aiNameComplete(new AiNameCompleteRequestData(prefix, null, null, null, null, null));
for (AiNameWeighted weighted : result.getNames()) {
    System.out.println(prefix + weighted.getName()); //prints "David", "Dave", "Davis", etc.
}
```
</details>

<details>
    <summary>Parse out a person's name from an email address.</summary>

```java
String address = "john-cane@gmail.com";
ListResponseOfAiNameExtracted result = api
        .aiNameParseEmailAddress(new AiNameParseEmailAddressRequestData(address, null, null, null, null, null));
String givenName = null;
String surname = null;
for(AiNameExtracted extracted: result.getValue()) {
    for(AiNameExtractedComponent component: extracted.getName()) {
        if (component.getCategory().equals("GivenName")) {
            givenName = component.getValue();
        }
        if (component.getCategory().equals("Surname")) {
            surname = component.getValue();
        }
    }
}
System.out.println("Given name is " + givenName); // "John"
System.out.println("Surname is " + surname); // "Cane"
```
</details>

# Licensing
All Aspose.Email for Cloud SDKs, helper scripts and templates are licensed under [MIT License](LICENSE).

# Resources
+ [**SDK Reference documentation**](docs/README.md)
+ [**Website**](https://www.aspose.cloud)
+ [**Product Home**](https://products.aspose.cloud/Email/cloud)
+ [**Documentation**](https://docs.aspose.cloud/display/Emailcloud/Home)
+ [**API Reference**](https://apireference.aspose.cloud/email/)
+ [**Free Support Forum**](https://forum.aspose.cloud/c/email)
+ [**Paid Support Helpdesk**](https://helpdesk.aspose.cloud/)
+ [**Blog**](https://blog.aspose.cloud/category/aspose-products/aspose-email-cloud/)
+ [**Git repository: Aspose.Email Cloud SDK for .Net**](https://github.com/aspose-email-cloud/aspose-email-cloud-dotnet)
+ [**Git repository: Aspose.Email Cloud SDK for Ruby**](https://github.com/aspose-email-cloud/aspose-email-cloud-ruby)
+ [**Git repository: Aspose.Email Cloud SDK for Python**](https://github.com/aspose-email-cloud/aspose-email-cloud-python)
+ [**Git repository: Aspose.Email Cloud SDK for PHP**](https://github.com/aspose-email-cloud/aspose-email-cloud-php)
+ [**Git repository: Aspose.Email Cloud SDK for Typescript**](https://github.com/aspose-email-cloud/aspose-email-cloud-node)
+ [**Git repository: Aspose.Email Cloud SDK for Java**](https://github.com/aspose-email-cloud/aspose-email-cloud-java)