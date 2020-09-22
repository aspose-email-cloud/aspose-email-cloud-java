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

import java.util.List;

/**
 *  EmailAccountConfig builder.
 */
public class EmailAccountConfigBuilder {
    private final EmailAccountConfig model;
    public EmailAccountConfigBuilder(EmailAccountConfig model) {
        this.model = model;
    }

    public EmailAccountConfig build() {
        return model;
    }
    public EmailAccountConfigBuilder displayName(String displayName) {
        this.model.displayName(displayName);
        return this;
    }
    public EmailAccountConfigBuilder protocolType(String protocolType) {
        this.model.protocolType(protocolType);
        return this;
    }
    public EmailAccountConfigBuilder host(String host) {
        this.model.host(host);
        return this;
    }
    public EmailAccountConfigBuilder port(Integer port) {
        this.model.port(port);
        return this;
    }
    public EmailAccountConfigBuilder socketType(String socketType) {
        this.model.socketType(socketType);
        return this;
    }
    public EmailAccountConfigBuilder authenticationTypes(List<String> authenticationTypes) {
        this.model.authenticationTypes(authenticationTypes);
        return this;
    }
    public EmailAccountConfigBuilder extraInfo(List<NameValuePair> extraInfo) {
        this.model.extraInfo(extraInfo);
        return this;
    }
    public EmailAccountConfigBuilder isValidated(Boolean isValidated) {
        this.model.isValidated(isValidated);
        return this;
    }
}
