package com.aspose.email.cloud.sdk.api;

import com.aspose.email.cloud.sdk.api.utils.TestBase;
import com.aspose.email.cloud.sdk.invoker.ApiException;
import com.aspose.email.cloud.sdk.model.*;
import com.migcomponents.migbase64.Base64;
import org.apache.commons.io.IOUtils;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.UUID;

public class AiTests extends TestBase {
    @Test(groups = {"ai", "pipeline"})
    public void aiNameGenderizeTest() throws ApiException {
        ListResponseOfAiNameGenderHypothesis result = api.ai().name()
            .genderize(new AiNameGenderizeRequest("John Cane", null, null, null, null, null));
        assert result.getValue().size() >= 1;
        assert result.getValue().get(0).getGender().equals("Male");
    }

    @Test(groups = {"ai", "pipeline"})
    public void aiNameFormatTest() throws ApiException {
        AiNameFormatted result = api.ai().name().format(
            new AiNameFormatRequest("Mr. John Michael Cane", null, null, null, null, "%t%L%f%m",
                null));
        assert result.getName().equals("Mr. Cane J. M.");
    }

    @Test(groups = {"ai", "pipeline"})
    public void aiNameMatchTest() throws ApiException {
        final String first = "John Michael Cane";
        final String second = "Cane J.";
        AiNameMatchResult result = api.ai().name()
            .match(new AiNameMatchRequest(first, second, null, null, null, null, null));
        assert result.getSimilarity() >= 0.5;
    }

    @Test(groups = {"ai", "pipeline"})
    public void aiNameExpandTest() throws ApiException {
        String name = "Smith Bobby";
        AiNameWeightedVariants result =
            api.ai().name().expand(new AiNameExpandRequest(name, null, null, null, null, null));
        ArrayList<String> expandedNames = new ArrayList<String>();
        for (AiNameWeighted weighted : result.getNames()) {
            expandedNames.add(weighted.getName());
        }
        assert expandedNames.contains("Mr. Smith");
        assert expandedNames.contains("B. Smith");
    }

    @Test(groups = {"ai", "pipeline"})
    public void aiNameCompleteTest() throws ApiException {
        String prefix = "Dav";
        AiNameWeightedVariants result = api.ai().name()
            .complete(new AiNameCompleteRequest(prefix, null, null, null, null, null));
        ArrayList<String> names = new ArrayList<String>();
        for (AiNameWeighted weighted : result.getNames()) {
            names.add(prefix + weighted.getName());
        }
        assert names.contains("David");
        assert names.contains("Dave");
        assert names.contains("Davis");
    }

    @Test(groups = {"ai", "pipeline"})
    public void aiNameParseEmailAddressTest() throws ApiException {
        String address = "john-cane@gmail.com";
        ListResponseOfAiNameExtracted result = api.ai().name().parseEmailAddress(
            new AiNameParseEmailAddressRequest(address, null, null, null, null, null));
        String givenName = null;
        String surname = null;
        for (AiNameExtracted extracted : result.getValue()) {
            for (AiNameExtractedComponent component : extracted.getName()) {
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
    public void aiBcrParseStorageTest() throws ApiException, IOException {
        String fileName = UUID.randomUUID().toString() + ".png";
        String filePath = folder + "/" + fileName;
        byte[] fileBytes = IOUtils.toByteArray(
            this.getClass().getResourceAsStream("test_single_0001.png"));
        // 1) Upload business card image to storage
        api.cloudStorage().file().uploadFile(new UploadFileRequest(filePath, fileBytes, storage));
        String outFolder = UUID.randomUUID().toString();
        String outFolderPath = folder + "/" + outFolder;
        api.cloudStorage().folder().createFolder(new CreateFolderRequest(outFolderPath, storage));
        // 2) Call business card recognition action
        ListResponseOfStorageFileLocation result =
            api.ai().bcr().parseStorage(
                new AiBcrParseStorageRequest(new StorageFolderLocation(storage, outFolderPath),
                    Collections.singletonList(new AiBcrImageStorageFile(true,
                        new StorageFileLocation(storage, folder, fileName))), null));
        // Check that only one file produced
        assert result.getValue().size() == 1;
        // 3) Get file name from recognition result
        StorageFileLocation contactFile = result.getValue().get(0);
        // 4) Download VCard file, produced by recognition method, check it contains text "Thomas"
        byte[] contactBytes = api.cloudStorage().file().downloadFile(new DownloadFileRequest(
            contactFile.getFolderPath() + "/" + contactFile.getFileName(),
            contactFile.getStorage(),
            null));
        String contactFileContent = new String(contactBytes, "UTF-8");
        assert contactFileContent.contains("Thomas");
    }

    @Test(groups = {"ai"})
    public void aiBcrParseTest() throws ApiException, IOException {
        byte[] fileBytes = IOUtils.toByteArray(
            this.getClass().getResourceAsStream("test_single_0001.png"));
        ContactList result =
            api.ai().bcr().parse(new AiBcrParseRequest(fileBytes, null, null, true));
        assert result.getValue().size() == 1;
        ContactDto firstVCard = result.getValue().get(0);
        assert firstVCard.getDisplayName().contains("Thomas");
    }
}
