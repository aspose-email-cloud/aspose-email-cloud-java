/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MapiRecipientDtoBuilder.java">
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
 *  MapiRecipientDto builder.
 */
public class MapiRecipientDtoBuilder {
    private MapiRecipientDto model;
    public MapiRecipientDtoBuilder(MapiRecipientDto model) {
        this.model = model;
    }

    /**
     * Build MapiRecipientDto instance.
     */
    public MapiRecipientDto build() {
        MapiRecipientDto tempModel = model;
        model = null;
        return tempModel;
    }
    /**
     * Set MapiRecipientDto.emailAddress and return builder.
     * @param emailAddress Email address of the message recipient or sender.             
     * @return builder
    **/
    public MapiRecipientDtoBuilder emailAddress(String emailAddress) {
        this.model.emailAddress(emailAddress);
        return this;
    }
    /**
     * Set MapiRecipientDto.addressType and return builder.
     * @param addressType Type of the address of the message recipient or sender.             
     * @return builder
    **/
    public MapiRecipientDtoBuilder addressType(String addressType) {
        this.model.addressType(addressType);
        return this;
    }
    /**
     * Set MapiRecipientDto.displayName and return builder.
     * @param displayName Display name of the message recipient or sender.             
     * @return builder
    **/
    public MapiRecipientDtoBuilder displayName(String displayName) {
        this.model.displayName(displayName);
        return this;
    }
    /**
     * Set MapiRecipientDto.recipientType and return builder.
     * @param recipientType Represent the PR_RECIPIENT_TYPE property which contains the recipient type for a message recipient. Enum, available values: Unknown, MapiBcc, MapiCc, MapiP1, MapiSubmitted, MapiTo
     * @return builder
    **/
    public MapiRecipientDtoBuilder recipientType(String recipientType) {
        this.model.recipientType(recipientType);
        return this;
    }
}
