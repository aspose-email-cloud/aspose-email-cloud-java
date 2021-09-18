/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MailAddressBuilder.java">
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
 *  MailAddress builder.
 */
public class MailAddressBuilder {
    private MailAddress model;
    public MailAddressBuilder(MailAddress model) {
        this.model = model;
    }

    /**
     * Build MailAddress instance.
     */
    public MailAddress build() {
        MailAddress tempModel = model;
        model = null;
        return tempModel;
    }
    /**
     * Set MailAddress.displayName and return builder.
     * @param displayName Display name             
     * @return builder
    **/
    public MailAddressBuilder displayName(String displayName) {
        this.model.displayName(displayName);
        return this;
    }
    /**
     * Set MailAddress.address and return builder.
     * @param address Address             
     * @return builder
    **/
    public MailAddressBuilder address(String address) {
        this.model.address(address);
        return this;
    }
    /**
     * Set MailAddress.participationStatus and return builder.
     * @param participationStatus Identifies the participation status for the calendar user. Enum, available values: NeedsAction, Accepted, Declined, Tentative, Delegated
     * @return builder
    **/
    public MailAddressBuilder participationStatus(String participationStatus) {
        this.model.participationStatus(participationStatus);
        return this;
    }
    /**
     * Set MailAddress.originalAddressString and return builder.
     * @param originalAddressString The original e-mail address string             
     * @return builder
    **/
    public MailAddressBuilder originalAddressString(String originalAddressString) {
        this.model.originalAddressString(originalAddressString);
        return this;
    }
}
