package com.aspose.email.cloud.sdk.api;

import com.aspose.email.cloud.sdk.api.utils.TestBase;
import com.aspose.email.cloud.sdk.model.*;
import org.testng.annotations.Test;

import java.io.UnsupportedEncodingException;
import java.util.UUID;

public class MapiContactTests extends TestBase {
    private static final MapiContactDto mapiContact = Models.mapiContactDto()
        .electronicAddresses(Models.mapiContactElectronicAddressPropertySetDto()
            .defaultEmailAddress(Models.mapiContactElectronicAddressDto()
                .emailAddress("email@aspose.com")
                .build())
            .build())
        .nameInfo(Models.mapiContactNamePropertySetDto()
            .givenName("Alex")
            .surname("Thomas")
            .build())
        .personalInfo(Models.mapiContactPersonalInfoPropertySetDto()
            .businessHomePage("www.aspose.com")
            .build())
        .professionalInfo(Models.mapiContactProfessionalPropertySetDto()
            .profession("GENERAL DIRECTOR")
            .build())
        .telephones(Models.mapiContactTelephonePropertySetDto()
            .primaryTelephoneNumber("+49 211 4247 21")
            .build())
        .build();

    @Test(groups = {"pipeline"})
    public void ModelToContactDtoTest() {
        ContactDto contactDto = api.mapi().contact().asContactDto(mapiContact);
        assert mapiContact.getNameInfo().getGivenName().equals(contactDto.getGivenName());
        assert mapiContact.getNameInfo().getSurname().equals(contactDto.getSurname());
    }

    @Test(groups = {"pipeline"})
    public void ModelToFileTest() throws UnsupportedEncodingException {
        byte[] vcardBytes =
            api.mapi().contact().asFile(new MapiContactAsFileRequest("VCard", mapiContact));
        String vcardString = new String(vcardBytes, "UTF-8");
        assert vcardString.contains(mapiContact.getNameInfo().getGivenName());
        MapiContactDto mapiContactConverted =
            api.mapi().contact().fromFile(
                Models.mapiContactFromFileRequest()
                    .format("VCard")
                    .file(vcardBytes)
                    .build());
        assert mapiContact.getNameInfo().getSurname()
            .equals(mapiContactConverted.getNameInfo().getSurname());
    }

    @Test(groups = {"pipeline"})
    public void StorageTest() {
        String fileName = UUID.randomUUID().toString() + ".msg";
        api.mapi().contact().save(
            new MapiContactSaveRequest(new StorageFileLocation(storage, folder, fileName),
                mapiContact, "Msg"));
        MapiContactDto mapiContactFromStorage =
            api.mapi().contact().get(new MapiContactGetRequest("Msg", fileName, folder, storage));
        assert mapiContact.getNameInfo().getSurname()
            .equals(mapiContactFromStorage.getNameInfo().getSurname());
    }
}
