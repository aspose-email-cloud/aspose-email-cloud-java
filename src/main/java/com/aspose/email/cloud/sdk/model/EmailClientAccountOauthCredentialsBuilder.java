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

import java.util.List;

/**
 *  EmailClientAccountOauthCredentials builder.
 */
public class EmailClientAccountOauthCredentialsBuilder {
    private final EmailClientAccountOauthCredentials model;
    public EmailClientAccountOauthCredentialsBuilder(EmailClientAccountOauthCredentials model) {
        this.model = model;
    }

    public EmailClientAccountOauthCredentials build() {
        return model;
    }
    public EmailClientAccountOauthCredentialsBuilder login(String login) {
        this.model.login(login);
        return this;
    }
    public EmailClientAccountOauthCredentialsBuilder clientId(String clientId) {
        this.model.clientId(clientId);
        return this;
    }
    public EmailClientAccountOauthCredentialsBuilder clientSecret(String clientSecret) {
        this.model.clientSecret(clientSecret);
        return this;
    }
    public EmailClientAccountOauthCredentialsBuilder refreshToken(String refreshToken) {
        this.model.refreshToken(refreshToken);
        return this;
    }
    public EmailClientAccountOauthCredentialsBuilder requestUrl(String requestUrl) {
        this.model.requestUrl(requestUrl);
        return this;
    }
}
