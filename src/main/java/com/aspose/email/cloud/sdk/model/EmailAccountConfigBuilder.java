/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="EmailAccountConfigBuilder.java">
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
 *  EmailAccountConfig builder.
 */
public class EmailAccountConfigBuilder {
    private final EmailAccountConfig model;
    public EmailAccountConfigBuilder(EmailAccountConfig model) {
        this.model = model;
    }

    /**
     * Build EmailAccountConfig instance.
     */
    public EmailAccountConfig build() {
        return model;
    }
    /**
     * Set EmailAccountConfig.displayName and return builder.
     * @param displayName Email account display name             
     * @return builder
    **/
    public EmailAccountConfigBuilder displayName(String displayName) {
        this.model.displayName(displayName);
        return this;
    }
    /**
     * Set EmailAccountConfig.protocolType and return builder.
     * @param protocolType Type of connection protocol. Enum, available values: IMAP, POP3, SMTP, EWS, WebDav
     * @return builder
    **/
    public EmailAccountConfigBuilder protocolType(String protocolType) {
        this.model.protocolType(protocolType);
        return this;
    }
    /**
     * Set EmailAccountConfig.host and return builder.
     * @param host Email account host.             
     * @return builder
    **/
    public EmailAccountConfigBuilder host(String host) {
        this.model.host(host);
        return this;
    }
    /**
     * Set EmailAccountConfig.port and return builder.
     * @param port Port.             
     * @return builder
    **/
    public EmailAccountConfigBuilder port(Integer port) {
        this.model.port(port);
        return this;
    }
    /**
     * Set EmailAccountConfig.socketType and return builder.
     * @param socketType Email account security mode Enum, available values: None, SSLExplicit, SSLImplicit, SSLAuto, Auto
     * @return builder
    **/
    public EmailAccountConfigBuilder socketType(String socketType) {
        this.model.socketType(socketType);
        return this;
    }
    /**
     * Set EmailAccountConfig.authenticationTypes and return builder.
     * @param authenticationTypes Supported authentication types.              Items: Email account authentication types. Enum, available values: NoAuth, OAuth2, PasswordCleartext, PasswordEncrypted, SmtpAfterPop, ClientIpAddress
     * @return builder
    **/
    public EmailAccountConfigBuilder authenticationTypes(List<String> authenticationTypes) {
        this.model.authenticationTypes(authenticationTypes);
        return this;
    }
    /**
     * Set EmailAccountConfig.extraInfo and return builder.
     * @param extraInfo Extra account information.             
     * @return builder
    **/
    public EmailAccountConfigBuilder extraInfo(List<NameValuePair> extraInfo) {
        this.model.extraInfo(extraInfo);
        return this;
    }
    /**
     * Set EmailAccountConfig.isValidated and return builder.
     * @param isValidated Determines that configuration validated. Set to false if validation skipped.             
     * @return builder
    **/
    public EmailAccountConfigBuilder isValidated(Boolean isValidated) {
        this.model.isValidated(isValidated);
        return this;
    }
}
