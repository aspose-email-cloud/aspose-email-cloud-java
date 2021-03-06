/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MapiContactPhysicalAddressDtoBuilder.java">
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
 *  MapiContactPhysicalAddressDto builder.
 */
public class MapiContactPhysicalAddressDtoBuilder {
    private MapiContactPhysicalAddressDto model;
    public MapiContactPhysicalAddressDtoBuilder(MapiContactPhysicalAddressDto model) {
        this.model = model;
    }

    /**
     * Build MapiContactPhysicalAddressDto instance.
     */
    public MapiContactPhysicalAddressDto build() {
        MapiContactPhysicalAddressDto tempModel = model;
        model = null;
        return tempModel;
    }
    /**
     * Set MapiContactPhysicalAddressDto.isMailingAddress and return builder.
     * @param isMailingAddress Gets or sets a value indicating whether this address is mailing address             
     * @return builder
    **/
    public MapiContactPhysicalAddressDtoBuilder isMailingAddress(Boolean isMailingAddress) {
        this.model.isMailingAddress(isMailingAddress);
        return this;
    }
    /**
     * Set MapiContactPhysicalAddressDto.street and return builder.
     * @param street Specifies the street portion of the contact&#39;s address             
     * @return builder
    **/
    public MapiContactPhysicalAddressDtoBuilder street(String street) {
        this.model.street(street);
        return this;
    }
    /**
     * Set MapiContactPhysicalAddressDto.city and return builder.
     * @param city Specifies the city or locality portion of the contact&#39;s address             
     * @return builder
    **/
    public MapiContactPhysicalAddressDtoBuilder city(String city) {
        this.model.city(city);
        return this;
    }
    /**
     * Set MapiContactPhysicalAddressDto.stateOrProvince and return builder.
     * @param stateOrProvince Specifies the state or province portion of the contact&#39;s address             
     * @return builder
    **/
    public MapiContactPhysicalAddressDtoBuilder stateOrProvince(String stateOrProvince) {
        this.model.stateOrProvince(stateOrProvince);
        return this;
    }
    /**
     * Set MapiContactPhysicalAddressDto.postalCode and return builder.
     * @param postalCode Specifies the postal code (ZIP code) portion of the contact&#39;s address             
     * @return builder
    **/
    public MapiContactPhysicalAddressDtoBuilder postalCode(String postalCode) {
        this.model.postalCode(postalCode);
        return this;
    }
    /**
     * Set MapiContactPhysicalAddressDto.country and return builder.
     * @param country Specifies the country or region portion of the contact&#39;s address             
     * @return builder
    **/
    public MapiContactPhysicalAddressDtoBuilder country(String country) {
        this.model.country(country);
        return this;
    }
    /**
     * Set MapiContactPhysicalAddressDto.countryCode and return builder.
     * @param countryCode Specifies the country code portion of the contact&#39;s address             
     * @return builder
    **/
    public MapiContactPhysicalAddressDtoBuilder countryCode(String countryCode) {
        this.model.countryCode(countryCode);
        return this;
    }
    /**
     * Set MapiContactPhysicalAddressDto.address and return builder.
     * @param address Specifies the complete address of the contact&#39;s address             
     * @return builder
    **/
    public MapiContactPhysicalAddressDtoBuilder address(String address) {
        this.model.address(address);
        return this;
    }
    /**
     * Set MapiContactPhysicalAddressDto.postOfficeBox and return builder.
     * @param postOfficeBox Gets or sets the post office box             
     * @return builder
    **/
    public MapiContactPhysicalAddressDtoBuilder postOfficeBox(String postOfficeBox) {
        this.model.postOfficeBox(postOfficeBox);
        return this;
    }
}
