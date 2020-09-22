/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="EmailConfigDiscoverOauthRequestBuilder.java">
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
 *  EmailConfigDiscoverOauthRequest builder.
 */
public class EmailConfigDiscoverOauthRequestBuilder {
    private final EmailConfigDiscoverOauthRequest model;
    public EmailConfigDiscoverOauthRequestBuilder(EmailConfigDiscoverOauthRequest model) {
        this.model = model;
    }

    /**
     * Build EmailConfigDiscoverOauthRequest instance.
     */
    public EmailConfigDiscoverOauthRequest build() {
        return model;
    }
    /**
     * Set EmailConfigDiscoverOauthRequest.address and return builder.
     * @param address Email address to discover.             
     * @return builder
    **/
    public EmailConfigDiscoverOauthRequestBuilder address(String address) {
        this.model.address(address);
        return this;
    }
    /**
     * Set EmailConfigDiscoverOauthRequest.fastProcessing and return builder.
     * @param fastProcessing Turns on fast processing. All discover systems will run in parallel. First discovered result will be returned.             
     * @return builder
    **/
    public EmailConfigDiscoverOauthRequestBuilder fastProcessing(Boolean fastProcessing) {
        this.model.fastProcessing(fastProcessing);
        return this;
    }
    /**
     * Set EmailConfigDiscoverOauthRequest.login and return builder.
     * @param login Email account login. If not specified, address used as a login.             
     * @return builder
    **/
    public EmailConfigDiscoverOauthRequestBuilder login(String login) {
        this.model.login(login);
        return this;
    }
    /**
     * Set EmailConfigDiscoverOauthRequest.clientId and return builder.
     * @param clientId OAuth client id.             
     * @return builder
    **/
    public EmailConfigDiscoverOauthRequestBuilder clientId(String clientId) {
        this.model.clientId(clientId);
        return this;
    }
    /**
     * Set EmailConfigDiscoverOauthRequest.clientSecret and return builder.
     * @param clientSecret OAuth client secret.             
     * @return builder
    **/
    public EmailConfigDiscoverOauthRequestBuilder clientSecret(String clientSecret) {
        this.model.clientSecret(clientSecret);
        return this;
    }
    /**
     * Set EmailConfigDiscoverOauthRequest.refreshToken and return builder.
     * @param refreshToken OAuth refresh token.             
     * @return builder
    **/
    public EmailConfigDiscoverOauthRequestBuilder refreshToken(String refreshToken) {
        this.model.refreshToken(refreshToken);
        return this;
    }
    /**
     * Set EmailConfigDiscoverOauthRequest.requestUrl and return builder.
     * @param requestUrl The url to obtain access token. If not specified, will be discovered from email configuration.             
     * @return builder
    **/
    public EmailConfigDiscoverOauthRequestBuilder requestUrl(String requestUrl) {
        this.model.requestUrl(requestUrl);
        return this;
    }
}
