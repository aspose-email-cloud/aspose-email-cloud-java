package com.aspose.email.cloud.sdk.api;

import com.aspose.email.cloud.sdk.api.utils.TestBase;
import com.aspose.email.cloud.sdk.model.*;
import com.migcomponents.migbase64.Base64;
import org.testng.annotations.Test;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.UUID;

public class MapiMessageTests extends TestBase {
    private static final MapiMessageDto mapiMessage = (MapiMessageDto) new MapiMessageDto()
        .clientSubmitTime(Calendar.getInstance().getTime())
        .senderAddressType("SMTP")
        .senderEmailAddress("from@aspose.com")
        .senderSmtpAddress("from@aspose.com")
        .messageFormat("Ascii")
        .senderName("From Address")
        .messageBody("Some body")
        .displayTo("To Address")
        .deliveryTime(Calendar.getInstance().getTime())
        .normalizedSubject("Some subject")
        .flags(Arrays.asList("MsgFlagRead", "MsgFlagUnsent", "MsgFlagHasAttach"))
        .addRecipientsItem(new MapiRecipientDto()
            .addressType("SMTP")
            .displayName("To address")
            .emailAddress("to@aspose.com")
            .recipientType("MapiTo"))
        .addAttachmentsItem(new MapiAttachmentDto()
            .dataBase64(Base64.encodeToString("Some file text".getBytes(), false))
            .name("some-file.txt"))
        .subjectPrefix("Re: ")
        .messageClass("IPM.Note")
        .body("Some body")
        .subject("Re: Some subject")
        .bodyType("PlainText");

    @Test(groups = {"pipeline"})
    public void ModelToEmailDtoTest() {
        EmailDto emailDto = api.mapi().message().asEmailDto(mapiMessage);
        assert mapiMessage.getSubject().equals(emailDto.getSubject());
        assert mapiMessage.getBody().equals(emailDto.getBody());
    }

    @Test(groups = {"pipeline"})
    public void ModelToFileTest() throws UnsupportedEncodingException {
        byte[] emlBytes =
            api.mapi().message().asFile(new MapiMessageAsFileRequest("Eml", mapiMessage));
        String emlString = new String(emlBytes, "UTF-8");
        assert emlString.contains(mapiMessage.getSubject());
        MapiMessageDto mapiMessageConverted =
            api.mapi().message().fromFile(new MapiMessageFromFileRequest("Eml", emlBytes));
        assert mapiMessage.getSubject().equals(mapiMessageConverted.getSubject());
        boolean subjectFound = false;
        //Subject is also available as MapiPropertyDto:
        for (MapiPropertyDto property : mapiMessageConverted.getProperties()) {
            if (!property.getDescriptor().getDiscriminator().equals("MapiKnownPropertyDescriptor"))
                continue;
            //There are different Property descriptors supported.
            //Some properties are known to the service:
            MapiKnownPropertyDescriptor knownPropertyDescriptor =
                (MapiKnownPropertyDescriptor) property.getDescriptor();
            //We know, that subject is stored in known property with name TagSubject:
            if (!knownPropertyDescriptor.getName().equals("TagSubject"))
                continue;
            //TagSubject is string property:
            MapiStringPropertyDto mapiStringPropertyDto = (MapiStringPropertyDto) property;
            assert mapiStringPropertyDto.getValue().equals(mapiMessage.getSubject());
            subjectFound = true;
        }
        assert subjectFound;
    }

    @Test(groups = {"pipeline"})
    public void StorageTest() {
        String fileName = UUID.randomUUID().toString() + ".msg";
        api.mapi().message().save(
            new MapiMessageSaveRequest(new StorageFileLocation(storage, folder, fileName),
                mapiMessage, "Msg"));
        MapiMessageDto mapiMessageFromStorage =
            api.mapi().message().get(new MapiMessageGetRequest("Msg", fileName, folder, storage));
        assert mapiMessage.getSubject().equals(mapiMessageFromStorage.getSubject());
    }
}
