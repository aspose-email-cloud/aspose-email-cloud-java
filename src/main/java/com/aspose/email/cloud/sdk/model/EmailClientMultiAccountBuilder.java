/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="EmailClientMultiAccountBuilder.java">
*   Copyright (c) 2018-2023 Aspose Pty Ltd. All rights reserved.
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
 *  EmailClientMultiAccount builder.
 */
public class EmailClientMultiAccountBuilder {
    private EmailClientMultiAccount model;
    public EmailClientMultiAccountBuilder(EmailClientMultiAccount model) {
        this.model = model;
    }

    /**
     * Build EmailClientMultiAccount instance.
     */
    public EmailClientMultiAccount build() {
        EmailClientMultiAccount tempModel = model;
        model = null;
        return tempModel;
    }
    /**
     * Set EmailClientMultiAccount.receiveAccounts and return builder.
     * @param receiveAccounts Email client receive accounts             
     * @return builder
    **/
    public EmailClientMultiAccountBuilder receiveAccounts(List<EmailClientAccount> receiveAccounts) {
        this.model.receiveAccounts(receiveAccounts);
        return this;
    }
    /**
     * Set EmailClientMultiAccount.sendAccount and return builder.
     * @param sendAccount Email client send account             
     * @return builder
    **/
    public EmailClientMultiAccountBuilder sendAccount(EmailClientAccount sendAccount) {
        this.model.sendAccount(sendAccount);
        return this;
    }
}
