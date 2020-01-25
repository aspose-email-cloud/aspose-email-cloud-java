package com.aspose.email.cloud.sdk.api;

import java.nio.charset.StandardCharsets;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import com.aspose.email.cloud.sdk.model.*;
import com.aspose.email.cloud.sdk.model.requests.*;
import com.migcomponents.migbase64.Base64;

import org.apache.commons.lang3.time.DateUtils;
import org.apache.commons.io.IOUtils;
import org.testng.annotations.*;

public class EmailApiTests {
    private EmailApi api;
    private String folder;
    private static final String storage = "First Storage";
    private static final DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss'Z'");

    @BeforeClass(alwaysRun = true)
    public void oneTimeSetUp() throws Exception {
        api = new EmailApi(
            System.getenv("appKey"),
            System.getenv("appSid"),
            System.getenv("apiBaseUrl"),
            "v3.0",
            false,
            System.getenv("authUrl"));
        folder = UUID.randomUUID().toString();
        api.createFolder(new CreateFolderRequestData(folder, storage));
    }

    @AfterClass(alwaysRun = true)
    public void oneTimeTearDown() throws Exception {
        api.deleteFolder(new DeleteFolderRequestData(folder, storage, true));
    }

    @Test(groups = { "pipeline" })
    public void hierarchicalTest() throws Exception {
        String fileName = createCalendar();
        HierarchicalObject calendar = api.getCalendar(new GetCalendarRequestData(fileName, folder, storage));
        ArrayList<PrimitiveObject> primitives = new ArrayList<PrimitiveObject>();
        for (BaseObject property : calendar.getInternalProperties()) {
            if (property.getType().equals("PrimitiveObject")) {
                primitives.add((PrimitiveObject) property);
            }
        }
        assert primitives.size() >= 3;
        PrimitiveObject first = primitives.get(0);
        assert first.getValue() != null;
    }

    @Test(groups = { "pipeline" })
    public void dateTest() throws Exception {
        Calendar startDate = Calendar.getInstance();
        startDate.set(Calendar.MILLISECOND, 0);
        String calendarFile = createCalendar(startDate);
        HierarchicalObject calendar = api.getCalendar(new GetCalendarRequestData(calendarFile, folder, storage));
        PrimitiveObject startDateProperty = null;
        for (BaseObject property : calendar.getInternalProperties()) {
            if (property.getName().equals("STARTDATE")) {
                startDateProperty = (PrimitiveObject) property;
            }
        }
        assert startDateProperty != null;
        Calendar factStartDate = Calendar.getInstance();
        factStartDate.setTime(dateFormat.parse(startDateProperty.getValue()));
        assert DateUtils.truncatedEquals(startDate, factStartDate, Calendar.SECOND);
    }

    @Test(groups = { "pipeline" })
    public void fileTest() throws Exception {
        String file = createCalendar();
        byte[] fileBytes = api.downloadFile(new DownloadFileRequestData(folder + "/" + file, storage, null));
        String calendarContent = new String(fileBytes, StandardCharsets.UTF_8);
        assert calendarContent.contains("organizer@am.ru");
        String uploadedName = UUID.randomUUID().toString() + ".ics";
        String path = folder + "/" + uploadedName;
        api.uploadFile(new UploadFileRequestData(path, fileBytes, storage));
        ObjectExist exist = api.objectExists(new ObjectExistsRequestData(path, storage, null));
        assert exist.isExists();
    }

    @Test(groups = { "pipeline" })
    public void contactFormatTest() throws Exception {
        String[] formats = { "vcard", "msg" };
        for (String format : formats) {
            String extension = format.equals("vcard") ? ".vcf" : ".msg";
            String fileName = UUID.randomUUID().toString() + extension;
            api.createContact(new CreateContactRequestData(format, fileName, new HierarchicalObjectRequest(
                    new HierarchicalObject("CONTACT", null, new ArrayList<BaseObject>()),
                    new StorageFolderLocation(storage, folder))));
            String path = folder + "/" + fileName;
            ObjectExist exist = api.objectExists(new ObjectExistsRequestData(path, storage, null));
            assert exist.isExists();
        }
    }

    @Test(groups = { "ai" })
    public void aiNameGenderizeTest() throws Exception {
        ListResponseOfAiNameGenderHypothesis result = api
                .aiNameGenderize(new AiNameGenderizeRequestData("John Cane", null, null, null, null, null));
        assert result.getValue().size() >= 1;
        assert result.getValue().get(0).getGender().equals("Male");
    }

    @Test(groups = { "ai" })
    public void aiNameFormatTest() throws Exception {
        AiNameFormatted result = api.aiNameFormat(
                new AiNameFormatRequestData("Mr. John Michael Cane", null, null, null, null, "%t%L%f%m", null));
        assert result.getName().equals("Mr. Cane J. M.");
    }

    @Test(groups = { "ai" })
    public void aiNameMatchTest() throws Exception {
        final String first = "John Michael Cane";
        final String second = "Cane J.";
        AiNameMatchResult result = api
                .aiNameMatch(new AiNameMatchRequestData(first, second, null, null, null, null, null));
        assert result.getSimilarity() >= 0.5;
    }

    @Test(groups = { "ai" })
    public void aiNameExpandTest() throws Exception {
        String name = "Smith Bobby";
        AiNameWeightedVariants result = api
                .aiNameExpand(new AiNameExpandRequestData(name, null, null, null, null, null));
        ArrayList<String> expandedNames = new ArrayList<String>();
        for (AiNameWeighted weighted : result.getNames()) {
            expandedNames.add(weighted.getName());
        }
        assert expandedNames.contains("Mr. Smith");
        assert expandedNames.contains("B. Smith");
    }

    @Test(groups = { "ai" })
    public void aiNameCompleteTest() throws Exception {
        String prefix = "Dav";
        AiNameWeightedVariants result = api
                .aiNameComplete(new AiNameCompleteRequestData(prefix, null, null, null, null, null));
        ArrayList<String> names = new ArrayList<String>();
        for (AiNameWeighted weighted : result.getNames()) {
            names.add(prefix + weighted.getName());
        }
        assert names.contains("David");
        assert names.contains("Dave");
        assert names.contains("Davis");
    }

    @Test(groups = { "ai" })
    public void aiNameParseEmailAddressTest() throws Exception {
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
        assert "John".equals(givenName);
        assert "Cane".equals(surname);
    }

    @Test(groups = {"ai"})
    public void aiBcrParseStorageTest() throws Exception {
        String fileName = UUID.randomUUID().toString() + ".png";
        String filePath = folder + "/" + fileName;
        byte[] fileBytes = IOUtils.toByteArray(
            this.getClass().getResourceAsStream("test_single_0001.png"));
        // 1) Upload business card image to storage
        api.uploadFile(new UploadFileRequestData(filePath, fileBytes, storage));
        String outFolder = UUID.randomUUID().toString();
        String outFolderPath = folder + "/" + outFolder;
        api.createFolder(new CreateFolderRequestData(outFolderPath, storage));
        // 2) Call business card recognition action
        ListResponseOfStorageFileLocation result = api.aiBcrParseStorage(new AiBcrParseStorageRequestData(
            new AiBcrParseStorageRq(
                null,
                Arrays.asList(new AiBcrImageStorageFile(true, new StorageFileLocation(storage, folder, fileName))),
                new StorageFolderLocation(storage, outFolderPath))));
        // Check that only one file produced
        assert result.getValue().size() == 1;
        // 3) Get file name from recognition result
        StorageFileLocation contactFile = result.getValue().get(0);
        // 4) Download VCard file, produced by recognition method, check it contains text "Thomas"
        byte[] contactBytes = api.downloadFile(new DownloadFileRequestData(
            contactFile.getFolderPath() + "/" + contactFile.getFileName(),
            contactFile.getStorage(),
            null));
        String contactFileContent = new String(contactBytes, StandardCharsets.UTF_8);
        assert contactFileContent.contains("Thomas");
        // 5) Get VCard object properties list, check that there are 3 properties or more
        HierarchicalObject contactProperties = api.getContactProperties(new GetContactPropertiesRequestData(
            "VCard", contactFile.getFileName(), contactFile.getFolderPath(), contactFile.getStorage()));
        ArrayList<PrimitiveObject> primitives = new ArrayList<PrimitiveObject>();
        for (BaseObject property: contactProperties.getInternalProperties()) {
            if (property.getType().equals("PrimitiveObject")) {
                primitives.add((PrimitiveObject)property);
            }
        }
        assert primitives.size() >= 3;
    }

    @Test(groups = {"ai"})
    public void aiBcrParseTest() throws Exception {
        byte[] fileBytes = IOUtils.toByteArray(
            this.getClass().getResourceAsStream("test_single_0001.png"));
        String fileBase64 = Base64.encodeToString(fileBytes, false);
        ListResponseOfHierarchicalObject result = api.aiBcrParse(new AiBcrParseRequestData(
            new AiBcrBase64Rq(null, Arrays.asList(new AiBcrBase64Image(true, fileBase64)))));
        assert result.getValue().size() == 1;
        PrimitiveObject displayName = null;
        for(BaseObject property: result.getValue().get(0).getInternalProperties()) {
            if (property.getName().equals("DISPLAYNAME")) {
                displayName = (PrimitiveObject)property;
                break;
            }
        }
        assert displayName != null;
        assert displayName.getValue().contains("Thomas");
    }

    @Test(groups = { "pipeline" })
    public void createCalendarEmailTest() throws Exception {
        Calendar startDate = Calendar.getInstance();
        Calendar endDate = (Calendar) startDate.clone();
        endDate.set(Calendar.HOUR_OF_DAY, endDate.get(Calendar.HOUR_OF_DAY) + 1);
        CalendarDto calendar = new CalendarDto()
            .addAttendeesItem(new MailAddress("Attendee Name", "attendee@aspose.com", "Accepted"))
            .description("Some description")
            .summary("Some summary")
            .organizer(new MailAddress("Organizer Name", "organizer@aspose.com", "Accepted"))
            .startDate(startDate.getTime())
            .endDate(endDate.getTime())
            .location("Some location");

        StorageFolderLocation folderLocation = new StorageFolderLocation(storage, folder);
        String calendarFile = UUID.randomUUID().toString() + ".ics";
        api.saveCalendarModel(new SaveCalendarModelRequestData(
            calendarFile,
            new StorageModelRqOfCalendarDto(calendar, folderLocation)));

        ObjectExist objectExist = api.objectExists(new ObjectExistsRequestData(
            folder + "/" + calendarFile, storage, null));
        assert objectExist.isExists();

        AlternateView alternate = api.convertCalendarModelToAlternate(
            new ConvertCalendarModelToAlternateRequestData(
                new CalendarDtoAlternateRq(calendar, "Create", null)));

        EmailDto email = new EmailDto()
            .addAlternateViewsItem(alternate)
            .from(new MailAddress("From Name", "organizer@aspose.com", null))
            .addToItem(new MailAddress("To Name", "attendee@aspose.com", null))
            .subject("Some subject")
            .body("Some body");
        String emailFile = UUID.randomUUID().toString() + ".eml";
        api.saveEmailModel(new SaveEmailModelRequestData(
            "Eml", emailFile, new StorageModelRqOfEmailDto(email, folderLocation)));

        byte[] downloaded = api.downloadFile(
            new DownloadFileRequestData(folder + "/" + emailFile, storage, null));
        String calendarContent = new String(downloaded, StandardCharsets.UTF_8);
        assert calendarContent.contains("Some subject");
    }

    @Test(groups = { "pipeline" })
    public void contactModelTest() throws Exception {
        ContactDto contact = new ContactDto()
            .gender("Male")
            .surname("Thomas")
            .givenName("Alex")
            .addEmailAddressesItem(new EmailAddress(
                new EnumWithCustomOfEmailAddressCategory("Work", null),
                "Alex Thomas", true, null, "alex.thomas@work.com"))
            .addPhoneNumbersItem(new PhoneNumber(
                new EnumWithCustomOfPhoneNumberCategory("Work", null),
                "+49211424721", true));
        String contactFile = UUID.randomUUID().toString() + ".vcf";
        api.saveContactModel(new SaveContactModelRequestData(
            "VCard", contactFile, new StorageModelRqOfContactDto(
                contact, new StorageFolderLocation(storage, folder))));

        ObjectExist objectExist = api.objectExists(new ObjectExistsRequestData(
            folder + "/" + contactFile, storage, null));
        assert objectExist.isExists();
    }

    @Test(groups = { "ai" })
    public void aiBcrParseModelTest() throws Exception {
        byte[] fileBytes = IOUtils.toByteArray(
            this.getClass().getResourceAsStream("test_single_0001.png"));
        String fileBase64 = Base64.encodeToString(fileBytes, false);
        ListResponseOfContactDto result = api.aiBcrParseModel(new AiBcrParseModelRequestData(
            new AiBcrBase64Rq(null, Arrays.asList(new AiBcrBase64Image(true, fileBase64)))));
        assert result.getValue().size() == 1;
        ContactDto firstVCard = result.getValue().get(0);
        assert firstVCard.getDisplayName().contains("Thomas");
    }

    private String createCalendar() throws Exception {
        Calendar startDate = Calendar.getInstance();
        return createCalendar(startDate);
    }

    private String createCalendar(Calendar startDate) throws Exception {
        String fileName = UUID.randomUUID().toString() + ".ics";
        Calendar endDate =(Calendar) startDate.clone();
        endDate.set(Calendar.HOUR_OF_DAY, endDate.get(Calendar.HOUR_OF_DAY) + 1);
        api.createCalendar(new CreateCalendarRequestData(fileName, new HierarchicalObjectRequest(
            new HierarchicalObject("CALENDAR", null, Arrays.<BaseObject>asList(
                new PrimitiveObject("LOCATION", null, "location"),
                new PrimitiveObject("STARTDATE", null, dateFormat.format(startDate.getTime())),
                new PrimitiveObject("ENDDATE", null, dateFormat.format(endDate.getTime())),
                new HierarchicalObject("ORGANIZER", null, Arrays.<BaseObject>asList(
                    new PrimitiveObject("ADDRESS", null, "organizer@am.ru"),
                    new PrimitiveObject("DISPLAYNAME", null, "Organizer Name")
                )),
                new HierarchicalObject("ATTENDEES", null, Arrays.<BaseObject>asList(
                    new IndexedHierarchicalObject(
                        "ATTENDEE", null, 0, Arrays.<BaseObject>asList(
                            new PrimitiveObject("ADDRESS", null, "attendee@am.ru"),
                            new PrimitiveObject("DISPLAYNAME", null, "Attendee Name")
                        )
                    )
                ))
            )),
            new StorageFolderLocation(storage, folder))));

        return fileName;
    }
}