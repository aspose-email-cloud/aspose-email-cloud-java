package com.aspose.email.cloud.sdk.api;

import com.aspose.email.cloud.sdk.invoker.ApiException;
import com.aspose.email.cloud.sdk.model.*;
import com.aspose.email.cloud.sdk.model.requests.*;
import org.testng.annotations.Test;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.UUID;

public class ContactTests extends TestBase {
    private static final String surname = "Thomas";
    private static final ContactDto contactDto = new ContactDto()
        .gender("Male")
        .surname(surname)
        .givenName("Alex")
        .addEmailAddressesItem(new EmailAddress(
            new EnumWithCustomOfEmailAddressCategory("Work", null),
            "Alex Thomas", true, null, "alex.thomas@work.com", null))
        .addPhoneNumbersItem(new PhoneNumber(
            new EnumWithCustomOfPhoneNumberCategory("Work", null),
            "+49211424721", true));

    @Test(groups = {"pipeline"})
    public void contactFormatTest() throws ApiException {
        String[] formats = {"vcard", "msg"};
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

    @Test(groups = {"pipeline"})
    public void contactModelTest() throws ApiException {
        String contactFile = UUID.randomUUID().toString() + ".vcf";
        api.saveContactModel(new SaveContactModelRequestData(
            "VCard", contactFile, new StorageModelRqOfContactDto(
            contactDto, new StorageFolderLocation(storage, folder))));

        ObjectExist objectExist = api.objectExists(new ObjectExistsRequestData(
            folder + "/" + contactFile, storage, null));
        assert objectExist.isExists();
    }

    @Test(groups = {"pipeline"})
    public void convertContactTest() throws ApiException, UnsupportedEncodingException {
        byte[] mapiBytes = api.convertContactModelToFile(
            new ConvertContactModelToFileRequestData(
                "Msg", contactDto));
        byte[] vcardBytes = api.convertContact(new ConvertContactRequestData("VCard", "Msg", mapiBytes));
        String contactContent = new String(vcardBytes, "UTF-8");
        assert contactContent.contains(surname);
        ContactDto dto = api.getContactFileAsModel(
            new GetContactFileAsModelRequestData("VCard", vcardBytes));
        assert surname.equals(dto.getSurname());
    }

    @Test(groups = {"pipeline"})
    public void convertModelToMapiModelTest()
    {
        MapiContactDto mapiContactDto = api.convertContactModelToMapiModel(
            new ConvertContactModelToMapiModelRequestData(contactDto));
        assert contactDto.getSurname().equals(mapiContactDto.getNameInfo().getSurname());
    }
}
