package com.aspose.email.cloud.sdk.api;

import com.aspose.email.cloud.sdk.api.utils.TestBase;
import com.aspose.email.cloud.sdk.invoker.ApiException;
import com.aspose.email.cloud.sdk.model.*;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.UUID;

public class OtherTests extends TestBase {
    @Test(groups = {"pipeline"})
    public void discoverEmailConfigTest() throws ApiException {
        EmailAccountConfigList configList =
            api.emailConfig().discover(new EmailConfigDiscoverRequest("example@gmail.com", true));
        assert configList.getValue().size() >= 2;
        for (EmailAccountConfig config : configList.getValue()) {
            assert !config.getProtocolType().equals("SMTP") ||
                "smtp.gmail.com".equals(config.getHost());
        }
    }

    @Test(groups = {"pipeline"})
    public void isDisposableEmailTest() throws ApiException {
        ValueTOfBoolean disposable = api.disposableEmail()
            .isDisposable(new DisposableEmailIsDisposableRequest("example@mailcatch.com"));
        assert disposable.isValue();
        ValueTOfBoolean regular = api.disposableEmail()
            .isDisposable(new DisposableEmailIsDisposableRequest("example@gmail.com"));
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
        api.client().account().save(
            new EmailClientAccountSaveRequest(new StorageFileLocation(storage, folder, fileName),
                account));
        EmailClientAccount response =
            api.client().account().get(
                new ClientAccountGetRequest()
                    .fileName(fileName)
                    .folder(folder)
                    .storage(storage));
        assert response.getCredentials().getClass().getSimpleName()
            .equals("EmailClientAccountPasswordCredentials");
        assert account.getHost().equals(response.getHost());
    }

    @Test(groups = {"pipeline"})
    public void emailClientMultiAccountTest() throws ApiException {
        EmailClientMultiAccount multiAccount = new EmailClientMultiAccount(
            Arrays.asList(
                new EmailClientAccount("imap.gmail.com", 993, "SSLAuto", "IMAP",
                    new EmailClientAccountPasswordCredentials("example@gmail.com", null,
                        "password"), null),
                new EmailClientAccount("exchange.outlook.com", 443, "SSLAuto", "EWS",
                    new EmailClientAccountOauthCredentials(
                        "example@outlook.com", null, "clientId", "clientSecret", "refreshToken",
                        null), null)),
            new EmailClientAccount("smtp.gmail.com", 465, "SSLAuto", "SMTP",
                new EmailClientAccountPasswordCredentials("example@gmail.com", null, "password"),
                null));
        String fileName = UUID.randomUUID().toString() + ".multi.account";
        api.client().account().saveMulti(new EmailClientMultiAccountSaveRequest(
            new StorageFileLocation(storage, folder, fileName), multiAccount));
        EmailClientMultiAccount multiAccountFromStorage = api.client().account()
            .getMulti(new ClientAccountGetMultiRequest(fileName, folder, storage));
        assert multiAccountFromStorage.getReceiveAccounts().size() == 2;
        assert multiAccountFromStorage.getSendAccount().getCredentials().getDiscriminator().equals(
            multiAccount.getSendAccount().getCredentials().getDiscriminator());
    }
}