/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MapiContactElectronicAddressPropertySetDtoBuilder.java">
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
 *  MapiContactElectronicAddressPropertySetDto builder.
 */
public class MapiContactElectronicAddressPropertySetDtoBuilder {
    private MapiContactElectronicAddressPropertySetDto model;
    public MapiContactElectronicAddressPropertySetDtoBuilder(MapiContactElectronicAddressPropertySetDto model) {
        this.model = model;
    }

    /**
     * Build MapiContactElectronicAddressPropertySetDto instance.
     */
    public MapiContactElectronicAddressPropertySetDto build() {
        MapiContactElectronicAddressPropertySetDto tempModel = model;
        model = null;
        return tempModel;
    }
    /**
     * Set MapiContactElectronicAddressPropertySetDto.businessFax and return builder.
     * @param businessFax Refers to the group of properties that define the business fax address for a contact.
     * @return builder
    **/
    public MapiContactElectronicAddressPropertySetDtoBuilder businessFax(MapiContactElectronicAddressDto businessFax) {
        this.model.businessFax(businessFax);
        return this;
    }
    /**
     * Set MapiContactElectronicAddressPropertySetDto.defaultEmailAddress and return builder.
     * @param defaultEmailAddress Default value of electronic address Uses when user does not set any electronic address if UseAutocomplete property is set &#39;true&#39;             
     * @return builder
    **/
    public MapiContactElectronicAddressPropertySetDtoBuilder defaultEmailAddress(MapiContactElectronicAddressDto defaultEmailAddress) {
        this.model.defaultEmailAddress(defaultEmailAddress);
        return this;
    }
    /**
     * Set MapiContactElectronicAddressPropertySetDto.email1 and return builder.
     * @param email1 Refers to the group of properties that define the first e-mail address for a contact.             
     * @return builder
    **/
    public MapiContactElectronicAddressPropertySetDtoBuilder email1(MapiContactElectronicAddressDto email1) {
        this.model.email1(email1);
        return this;
    }
    /**
     * Set MapiContactElectronicAddressPropertySetDto.email2 and return builder.
     * @param email2 Refers to the group of properties that define the second e-mail address for a contact.             
     * @return builder
    **/
    public MapiContactElectronicAddressPropertySetDtoBuilder email2(MapiContactElectronicAddressDto email2) {
        this.model.email2(email2);
        return this;
    }
    /**
     * Set MapiContactElectronicAddressPropertySetDto.email3 and return builder.
     * @param email3 Refers to the group of properties that define the third e-mail address for a contact.             
     * @return builder
    **/
    public MapiContactElectronicAddressPropertySetDtoBuilder email3(MapiContactElectronicAddressDto email3) {
        this.model.email3(email3);
        return this;
    }
    /**
     * Set MapiContactElectronicAddressPropertySetDto.homeFax and return builder.
     * @param homeFax Refers to the group of properties that define the home fax address for a contact.             
     * @return builder
    **/
    public MapiContactElectronicAddressPropertySetDtoBuilder homeFax(MapiContactElectronicAddressDto homeFax) {
        this.model.homeFax(homeFax);
        return this;
    }
    /**
     * Set MapiContactElectronicAddressPropertySetDto.isEmpty and return builder.
     * @param isEmpty Shows if MapiContactElectronicAddressPropertySetDto is empty
     * @return builder
    **/
    public MapiContactElectronicAddressPropertySetDtoBuilder isEmpty(Boolean isEmpty) {
        this.model.isEmpty(isEmpty);
        return this;
    }
    /**
     * Set MapiContactElectronicAddressPropertySetDto.primaryFax and return builder.
     * @param primaryFax Refers to the group of properties that define the primary fax address for a contact.             
     * @return builder
    **/
    public MapiContactElectronicAddressPropertySetDtoBuilder primaryFax(MapiContactElectronicAddressDto primaryFax) {
        this.model.primaryFax(primaryFax);
        return this;
    }
    /**
     * Set MapiContactElectronicAddressPropertySetDto.useAutocomplete and return builder.
     * @param useAutocomplete Indicates that one electronic address is completed automatically in case if user does not set any electronic address             
     * @return builder
    **/
    public MapiContactElectronicAddressPropertySetDtoBuilder useAutocomplete(Boolean useAutocomplete) {
        this.model.useAutocomplete(useAutocomplete);
        return this;
    }
}
