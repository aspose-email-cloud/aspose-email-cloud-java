package com.aspose.email.cloud.sdk.api;

import com.aspose.email.cloud.sdk.api.utils.TestBase;
import com.aspose.email.cloud.sdk.model.*;
import com.aspose.email.cloud.sdk.model.requests.*;
import org.testng.annotations.Test;

import java.io.UnsupportedEncodingException;
import java.util.UUID;

public class MapiContactTests extends TestBase {
    private static final MapiContactDto mapiContact = new MapiContactDto()
        .electronicAddresses(new MapiContactElectronicAddressPropertySetDto()
            .defaultEmailAddress(new MapiContactElectronicAddressDto()
                .emailAddress("email@aspose.com")))
        .nameInfo(new MapiContactNamePropertySetDto()
            .givenName("Alex")
            .surname("Thomas"))
        .personalInfo(new MapiContactPersonalInfoPropertySetDto()
            .businessHomePage("www.aspose.com"))
        .professionalInfo(new MapiContactProfessionalPropertySetDto()
            .profession("GENERAL DIRECTOR"))
        .telephones(new MapiContactTelephonePropertySetDto()
            .primaryTelephoneNumber("+49 211 4247 21"));

    @Test(groups = {"pipeline"})
    public void ModelToContactDtoTest() {
        ContactDto contactDto = api.convertMapiContactModelToContactModel(
            new ConvertMapiContactModelToContactModelRequestData(
                mapiContact));
        assert mapiContact.getNameInfo().getGivenName().equals( contactDto.getGivenName());
        assert mapiContact.getNameInfo().getSurname().equals( contactDto.getSurname());
    }

    @Test(groups = {"pipeline"})
    public void ModelToFileTest() throws UnsupportedEncodingException {
        byte[] vcardBytes = api.convertMapiContactModelToFile(
            new ConvertMapiContactModelToFileRequestData(
                "VCard", mapiContact));
        String vcardString = new String(vcardBytes, "UTF-8");
        assert vcardString.contains(mapiContact.getNameInfo().getGivenName());
        MapiContactDto mapiContactConverted = api.getContactFileAsMapiModel(
            new GetContactFileAsMapiModelRequestData("VCard", vcardBytes));
        assert mapiContact.getNameInfo().getSurname().equals( mapiContactConverted.getNameInfo().getSurname());
    }

    @Test(groups = {"pipeline"})
    public void StorageTest() {
        String fileName = UUID.randomUUID().toString() + ".msg";
        api.saveMapiContactModel(
            new SaveMapiContactModelRequestData(
                "Msg", fileName, new StorageModelRqOfMapiContactDto(
                mapiContact, new StorageFolderLocation(storage, folder))));
        MapiContactDto mapiContactFromStorage = api.getMapiContactModel(
            new GetMapiContactModelRequestData(
                "Msg", fileName, folder, storage));
        assert mapiContact.getNameInfo().getSurname().equals( mapiContactFromStorage.getNameInfo().getSurname());
    }
}
