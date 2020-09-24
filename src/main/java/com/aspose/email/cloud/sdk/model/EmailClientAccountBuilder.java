/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="EmailClientAccountBuilder.java">
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
 *  EmailClientAccount builder.
 */
public class EmailClientAccountBuilder {
    private final EmailClientAccount model;
    public EmailClientAccountBuilder(EmailClientAccount model) {
        this.model = model;
    }

    /**
     * Build EmailClientAccount instance.
     */
    public EmailClientAccount build() {
        EmailClientAccount tempModel = model;
        model = null;
        return tempModel;
    }
    /**
     * Set EmailClientAccount.host and return builder.
     * @param host Mail server host name or IP address             
     * @return builder
    **/
    public EmailClientAccountBuilder host(String host) {
        this.model.host(host);
        return this;
    }
    /**
     * Set EmailClientAccount.port and return builder.
     * @param port Mail server port             
     * @return builder
    **/
    public EmailClientAccountBuilder port(Integer port) {
        this.model.port(port);
        return this;
    }
    /**
     * Set EmailClientAccount.securityOptions and return builder.
     * @param securityOptions Email account security mode Enum, available values: None, SSLExplicit, SSLImplicit, SSLAuto, Auto
     * @return builder
    **/
    public EmailClientAccountBuilder securityOptions(String securityOptions) {
        this.model.securityOptions(securityOptions);
        return this;
    }
    /**
     * Set EmailClientAccount.protocolType and return builder.
     * @param protocolType Type of connection protocol. Enum, available values: IMAP, POP3, SMTP, EWS, WebDav
     * @return builder
    **/
    public EmailClientAccountBuilder protocolType(String protocolType) {
        this.model.protocolType(protocolType);
        return this;
    }
    /**
     * Set EmailClientAccount.credentials and return builder.
     * @param credentials Email client account credentials             
     * @return builder
    **/
    public EmailClientAccountBuilder credentials(EmailClientAccountCredentials credentials) {
        this.model.credentials(credentials);
        return this;
    }
    /**
     * Set EmailClientAccount.cacheFile and return builder.
     * @param cacheFile File with messages cache. Used to provide extra functions, which are not supported by account             
     * @return builder
    **/
    public EmailClientAccountBuilder cacheFile(StorageFileLocation cacheFile) {
        this.model.cacheFile(cacheFile);
        return this;
    }
}
