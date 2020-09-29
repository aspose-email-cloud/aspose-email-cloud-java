/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MapiContactElectronicAddressDtoBuilder.java">
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
 *  MapiContactElectronicAddressDto builder.
 */
public class MapiContactElectronicAddressDtoBuilder {
    private MapiContactElectronicAddressDto model;
    public MapiContactElectronicAddressDtoBuilder(MapiContactElectronicAddressDto model) {
        this.model = model;
    }

    /**
     * Build MapiContactElectronicAddressDto instance.
     */
    public MapiContactElectronicAddressDto build() {
        MapiContactElectronicAddressDto tempModel = model;
        model = null;
        return tempModel;
    }
    /**
     * Set MapiContactElectronicAddressDto.addressType and return builder.
     * @param addressType Address type of an electronic address
     * @return builder
    **/
    public MapiContactElectronicAddressDtoBuilder addressType(String addressType) {
        this.model.addressType(addressType);
        return this;
    }
    /**
     * Set MapiContactElectronicAddressDto.displayName and return builder.
     * @param displayName User-readable display name for the e-mail address
     * @return builder
    **/
    public MapiContactElectronicAddressDtoBuilder displayName(String displayName) {
        this.model.displayName(displayName);
        return this;
    }
    /**
     * Set MapiContactElectronicAddressDto.emailAddress and return builder.
     * @param emailAddress E-mail address of the contact
     * @return builder
    **/
    public MapiContactElectronicAddressDtoBuilder emailAddress(String emailAddress) {
        this.model.emailAddress(emailAddress);
        return this;
    }
    /**
     * Set MapiContactElectronicAddressDto.faxNumber and return builder.
     * @param faxNumber Telephone number of the mail user&#39;s primary fax machine
     * @return builder
    **/
    public MapiContactElectronicAddressDtoBuilder faxNumber(String faxNumber) {
        this.model.faxNumber(faxNumber);
        return this;
    }
    /**
     * Set MapiContactElectronicAddressDto.isEmpty and return builder.
     * @param isEmpty Shows if MapiContactElectronicAddress is empty
     * @return builder
    **/
    public MapiContactElectronicAddressDtoBuilder isEmpty(Boolean isEmpty) {
        this.model.isEmpty(isEmpty);
        return this;
    }
    /**
     * Set MapiContactElectronicAddressDto.originalDisplayName and return builder.
     * @param originalDisplayName SMTP e-mail address that corresponds to the e-mail address for the Contact object.
     * @return builder
    **/
    public MapiContactElectronicAddressDtoBuilder originalDisplayName(String originalDisplayName) {
        this.model.originalDisplayName(originalDisplayName);
        return this;
    }
}
