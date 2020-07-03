package com.aspose.email.cloud.sdk.api;

import com.aspose.email.cloud.sdk.api.utils.TestBase;
import com.aspose.email.cloud.sdk.invoker.ApiException;
import com.aspose.email.cloud.sdk.model.*;
import com.aspose.email.cloud.sdk.model.requests.*;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.UUID;

public class OtherTests extends TestBase {
    @Test(groups = {"pipeline"})
    public void discoverEmailConfigTest() throws ApiException {
        EmailAccountConfigList configList = api.discoverEmailConfig(
                new DiscoverEmailConfigRequestData("example@gmail.com", true));
        assert configList.getValue().size() >= 2;
        for (EmailAccountConfig config : configList.getValue()) {
            assert !config.getProtocolType().equals("SMTP") || "smtp.gmail.com".equals(config.getHost());
        }
    }

    @Test(groups = {"pipeline"})
    public void isDisposableEmailTest() throws ApiException {
        ValueTOfBoolean disposable = api.isEmailAddressDisposable(
                new IsEmailAddressDisposableRequestData("example@mailcatch.com"));
        assert disposable.isValue();
        ValueTOfBoolean regular = api.isEmailAddressDisposable(
                new IsEmailAddressDisposableRequestData("example@gmail.com"));
        assert !regular.isValue();
    }

    @Test(groups = {"pipeline"})
    public void emailClientAccountTest() throws ApiException {
        EmailClientAccount account = new EmailClientAccount(
                "smtp.gmail.com",
                551,
                "SSLAuto",
                "SMTP",
                new EmailClientAccountPasswordCredentials("login", null, "password"),
                null);
        String fileName = UUID.randomUUID().toString() + ".account";
        api.saveEmailClientAccount(new SaveEmailClientAccountRequestData(
                new StorageFileRqOfEmailClientAccount(
                        account,
                        new StorageFileLocation(storage, folder, fileName))));
        EmailClientAccount response = api.getEmailClientAccount(
                new GetEmailClientAccountRequestData(fileName, folder, storage));
        assert response.getCredentials().getClass().getSimpleName()
                .equals("EmailClientAccountPasswordCredentials");
        assert account.getHost().equals(response.getHost());
    }

    @Test(groups = {"pipeline"})
    public void emailClientMultiAccountTest() throws ApiException {
        EmailClientMultiAccount multiAccount = new EmailClientMultiAccount(
                Arrays.asList(
                        new EmailClientAccount("imap.gmail.com", 993, "SSLAuto", "IMAP",
                                new EmailClientAccountPasswordCredentials("example@gmail.com", null, "password"), null),
                        new EmailClientAccount("exchange.outlook.com", 443, "SSLAuto", "EWS",
                                new EmailClientAccountOauthCredentials(
                                        "example@outlook.com", null, "clientId", "clientSecret", "refreshToken", null), null)),
                new EmailClientAccount("smtp.gmail.com", 465, "SSLAuto", "SMTP",
                        new EmailClientAccountPasswordCredentials("example@gmail.com", null, "password"), null));
        String fileName = UUID.randomUUID().toString() + ".multi.account";
        api.saveEmailClientMultiAccount(new SaveEmailClientMultiAccountRequestData(
                new StorageFileRqOfEmailClientMultiAccount(
                        multiAccount,
                        new StorageFileLocation(storage, folder, fileName))));
        EmailClientMultiAccount multiAccountFromStorage = api.getEmailClientMultiAccount(
                new GetEmailClientMultiAccountRequestData(fileName, folder, storage));
        assert multiAccountFromStorage.getReceiveAccounts().size() == 2;
        assert multiAccountFromStorage.getSendAccount().getCredentials().getDiscriminator().equals(
                multiAccount.getSendAccount().getCredentials().getDiscriminator());
    }
}