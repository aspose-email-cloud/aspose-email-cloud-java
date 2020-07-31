package com.aspose.email.cloud.sdk.api;

import com.aspose.email.cloud.sdk.api.utils.TestBase;
import com.aspose.email.cloud.sdk.invoker.ApiException;
import com.aspose.email.cloud.sdk.model.*;
import org.testng.annotations.Test;

import java.io.UnsupportedEncodingException;
import java.util.Date;

public class EmailModelTests extends TestBase {
    private static final String from = "from@aspose.com";
    private static final EmailDto emailDto = new EmailDto()
        .from(new MailAddress().address(from))
        .addToItem(new MailAddress().address("to@aspose.com"))
        .subject("Some subject")
        .body("Some body")
        .date(new Date());

    @Test(groups = {"pipeline"})
    public void convertEmailTest() throws ApiException, UnsupportedEncodingException {
        byte[] mapiBytes = api.email().asFile(new EmailAsFileRequest("Msg", emailDto));
        byte[] emlBytes = api.email().convert(new EmailConvertRequest("Eml", mapiBytes));
        String emlContent = new String(emlBytes, "UTF-8");
        assert emlContent.contains(from);
        EmailDto dto = api.email().fromFile(new EmailFromFileRequest("Eml", emlBytes));
        assert from.equals(dto.getFrom().getAddress());
    }

    @Test(groups = {"pipeline"})
    public void convertModelToMapiModelTest() {
        MapiMessageDto mapiMessageDto = api.email().asMapi(emailDto);
        assert emailDto.getSubject().equals(mapiMessageDto.getSubject());
    }
}
