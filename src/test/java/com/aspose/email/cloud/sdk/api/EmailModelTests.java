package com.aspose.email.cloud.sdk.api;

import com.aspose.email.cloud.sdk.api.utils.TestBase;
import com.aspose.email.cloud.sdk.invoker.ApiException;
import com.aspose.email.cloud.sdk.model.EmailDto;
import com.aspose.email.cloud.sdk.model.MailAddress;
import com.aspose.email.cloud.sdk.model.MapiMessageDto;
import com.aspose.email.cloud.sdk.model.requests.ConvertEmailModelToFileRequestData;
import com.aspose.email.cloud.sdk.model.requests.ConvertEmailModelToMapiModelRequestData;
import com.aspose.email.cloud.sdk.model.requests.ConvertEmailRequestData;
import com.aspose.email.cloud.sdk.model.requests.GetEmailFileAsModelRequestData;
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
        byte[] mapiBytes = api.convertEmailModelToFile(
            new ConvertEmailModelToFileRequestData(
                "Msg", emailDto));
        byte[] emlBytes = api.convertEmail(new ConvertEmailRequestData("Eml", mapiBytes));
        String emlContent = new String(emlBytes, "UTF-8");
        assert emlContent.contains(from);
        EmailDto dto = api.getEmailFileAsModel(
            new GetEmailFileAsModelRequestData(emlBytes));
        assert from.equals(dto.getFrom().getAddress());
    }

    @Test(groups = {"pipeline"})
    public void convertModelToMapiModelTest()
    {
        MapiMessageDto mapiMessageDto = api.convertEmailModelToMapiModel(
            new ConvertEmailModelToMapiModelRequestData(emailDto));
        assert emailDto.getSubject().equals(mapiMessageDto.getSubject());
    }
}
