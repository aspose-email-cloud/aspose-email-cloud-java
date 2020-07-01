package com.aspose.email.cloud.sdk.api;

import com.aspose.email.cloud.sdk.invoker.ApiException;
import com.aspose.email.cloud.sdk.model.*;
import com.aspose.email.cloud.sdk.model.requests.*;
import org.testng.annotations.Test;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.UUID;

public class ContactTests extends TestBase {
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
        ContactDto contact = new ContactDto()
            .gender("Male")
            .surname("Thomas")
            .givenName("Alex")
            .addEmailAddressesItem(new EmailAddress(
                new EnumWithCustomOfEmailAddressCategory("Work", null),
                "Alex Thomas", true, null, "alex.thomas@work.com", null))
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

    @Test(groups = {"pipeline"})
    public void ConvertContactTest() throws ApiException, UnsupportedEncodingException {
        final String surname = "Cane";
        ContactDto contactDto = new ContactDto()
            .surname(surname)
            .givenName("John")
            .gender("Male")
            .emailAddresses(Collections.singletonList(new EmailAddress().address("address@aspose.com")))
            .phoneNumbers(Collections.singletonList(new PhoneNumber().number("+472343234542342")));
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
}
