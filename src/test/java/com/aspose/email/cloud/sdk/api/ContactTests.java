package com.aspose.email.cloud.sdk.api;

import com.aspose.email.cloud.sdk.api.utils.TestBase;
import com.aspose.email.cloud.sdk.invoker.ApiException;
import com.aspose.email.cloud.sdk.model.*;
import org.testng.annotations.Test;

import java.io.UnsupportedEncodingException;
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
    public void contactModelTest() throws ApiException {
        String contactFile = UUID.randomUUID().toString() + ".vcf";
        api.contact().save(
            new ContactSaveRequest(new StorageFileLocation(storage, folder, contactFile),
                contactDto, "VCard"));

        ObjectExist objectExist = api.cloudStorage().storage().objectExists(new ObjectExistsRequest(
            folder + "/" + contactFile, storage, null));
        assert objectExist.isExists();
    }

    @Test(groups = {"pipeline"})
    public void convertContactTest() throws ApiException, UnsupportedEncodingException {
        byte[] mapiBytes = api.contact().asFile(new ContactAsFileRequest("Msg", contactDto));
        byte[] vcardBytes =
            api.contact().convert(new ContactConvertRequest("VCard", "Msg", mapiBytes));
        String contactContent = new String(vcardBytes, "UTF-8");
        assert contactContent.contains(surname);
        ContactDto dto = api.contact().fromFile(new ContactFromFileRequest("VCard", vcardBytes));
        assert surname.equals(dto.getSurname());
    }

    @Test(groups = {"pipeline"})
    public void convertModelToMapiModelTest() {
        MapiContactDto mapiContactDto = api.contact().asMapi(contactDto);
        assert contactDto.getSurname().equals(mapiContactDto.getNameInfo().getSurname());
    }
}
