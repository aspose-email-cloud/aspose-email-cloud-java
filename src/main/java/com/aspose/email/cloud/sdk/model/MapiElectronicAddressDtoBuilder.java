/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MapiElectronicAddressDtoBuilder.java">
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
 *  MapiElectronicAddressDto builder.
 */
public class MapiElectronicAddressDtoBuilder {
    private MapiElectronicAddressDto model;
    public MapiElectronicAddressDtoBuilder(MapiElectronicAddressDto model) {
        this.model = model;
    }

    /**
     * Build MapiElectronicAddressDto instance.
     */
    public MapiElectronicAddressDto build() {
        MapiElectronicAddressDto tempModel = model;
        model = null;
        return tempModel;
    }
    /**
     * Set MapiElectronicAddressDto.addressType and return builder.
     * @param addressType Address type.             
     * @return builder
    **/
    public MapiElectronicAddressDtoBuilder addressType(String addressType) {
        this.model.addressType(addressType);
        return this;
    }
    /**
     * Set MapiElectronicAddressDto.emailAddress and return builder.
     * @param emailAddress Email address.             
     * @return builder
    **/
    public MapiElectronicAddressDtoBuilder emailAddress(String emailAddress) {
        this.model.emailAddress(emailAddress);
        return this;
    }
    /**
     * Set MapiElectronicAddressDto.displayName and return builder.
     * @param displayName User-readable display name for the e-mail address.             
     * @return builder
    **/
    public MapiElectronicAddressDtoBuilder displayName(String displayName) {
        this.model.displayName(displayName);
        return this;
    }
    /**
     * Set MapiElectronicAddressDto.faxNumber and return builder.
     * @param faxNumber Telephone number of the mail user&#39;s primary fax machine.             
     * @return builder
    **/
    public MapiElectronicAddressDtoBuilder faxNumber(String faxNumber) {
        this.model.faxNumber(faxNumber);
        return this;
    }
    /**
     * Set MapiElectronicAddressDto.originalDisplayName and return builder.
     * @param originalDisplayName SMTP e-mail address that  corresponds to the e-mail address.             
     * @return builder
    **/
    public MapiElectronicAddressDtoBuilder originalDisplayName(String originalDisplayName) {
        this.model.originalDisplayName(originalDisplayName);
        return this;
    }
}
