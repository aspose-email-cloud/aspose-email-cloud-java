/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="EmailClientAccountOauthCredentialsBuilder.java">
*   Copyright (c) 2018-2020 Aspose Pty Ltd. All rights reserved.
* </copyright>
* <summary>
*   Permission is hereby granted, free of charge, to any person obtaining a copy
*  of this software and associated documentation files (the "Software"), to deal
*  in the Software without restriction, including without limitation the rights
*  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
*  copies of the Software, and to permit persons to whom the Software is
*  furnished to do so, subject to the following conditions:
* 
*  The above copyright notice and this permission notice shall be included in all
*  copies or substantial portions of the Software.
* 
*  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
*  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
*  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
*  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
*  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
*  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
*  SOFTWARE.
* </summary>
* --------------------------------------------------------------------------------------------------------------------
*/

package com.aspose.email.cloud.sdk.model;

    import org.apache.commons.lang3.ObjectUtils;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.*;
import com.google.gson.*;
import com.google.gson.stream.*;
import java.io.*;

/**
 *  EmailClientAccountOauthCredentials builder.
 */
public class EmailClientAccountOauthCredentialsBuilder {
    private EmailClientAccountOauthCredentials model;
    public EmailClientAccountOauthCredentialsBuilder(EmailClientAccountOauthCredentials model) {
        this.model = model;
    }

    /**
     * Build EmailClientAccountOauthCredentials instance.
     */
    public EmailClientAccountOauthCredentials build() {
        EmailClientAccountOauthCredentials tempModel = model;
        model = null;
        return tempModel;
    }
    /**
     * Set EmailClientAccountOauthCredentials.login and return builder.
     * @param login Email client account login             
     * @return builder
    **/
    public EmailClientAccountOauthCredentialsBuilder login(String login) {
        this.model.login(login);
        return this;
    }
    /**
     * Set EmailClientAccountOauthCredentials.clientId and return builder.
     * @param clientId The client ID obtained from the Google Cloud Console during application registration.             
     * @return builder
    **/
    public EmailClientAccountOauthCredentialsBuilder clientId(String clientId) {
        this.model.clientId(clientId);
        return this;
    }
    /**
     * Set EmailClientAccountOauthCredentials.clientSecret and return builder.
     * @param clientSecret The client secret obtained during application registration.             
     * @return builder
    **/
    public EmailClientAccountOauthCredentialsBuilder clientSecret(String clientSecret) {
        this.model.clientSecret(clientSecret);
        return this;
    }
    /**
     * Set EmailClientAccountOauthCredentials.refreshToken and return builder.
     * @param refreshToken OAuth 2.0 refresh token             
     * @return builder
    **/
    public EmailClientAccountOauthCredentialsBuilder refreshToken(String refreshToken) {
        this.model.refreshToken(refreshToken);
        return this;
    }
    /**
     * Set EmailClientAccountOauthCredentials.requestUrl and return builder.
     * @param requestUrl The url to obtain access token. If not specified, will try to discover from email client account host.             
     * @return builder
    **/
    public EmailClientAccountOauthCredentialsBuilder requestUrl(String requestUrl) {
        this.model.requestUrl(requestUrl);
        return this;
    }
}
