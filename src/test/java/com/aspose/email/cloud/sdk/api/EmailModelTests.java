package com.aspose.email.cloud.sdk.api;

import com.aspose.email.cloud.sdk.invoker.ApiException;
import com.aspose.email.cloud.sdk.model.EmailDto;
import com.aspose.email.cloud.sdk.model.MailAddress;
import com.aspose.email.cloud.sdk.model.requests.ConvertEmailModelToFileRequestData;
import com.aspose.email.cloud.sdk.model.requests.ConvertEmailRequestData;
import com.aspose.email.cloud.sdk.model.requests.GetEmailFileAsModelRequestData;
import org.testng.annotations.Test;

import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.Date;

public class EmailModelTests extends TestBase {
    @Test(groups = {"pipeline"})
    public void ConvertEmailTest() throws ApiException, UnsupportedEncodingException {
        final String from = "from@aspose.com";
        EmailDto emailDto = new EmailDto()
            .from(new MailAddress().address(from))
            .to(Collections.singletonList(new MailAddress().address("to@aspose.com")))
            .subject("Some subject")
            .body("Some body")
            .date(new Date());
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
}
