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
    private final MapiContactPhysicalAddressDto model;
    public MapiContactPhysicalAddressDtoBuilder(MapiContactPhysicalAddressDto model) {
        this.model = model;
    }

    public MapiContactPhysicalAddressDto build() {
        return model;
    }
    public MapiContactPhysicalAddressDtoBuilder isMailingAddress(Boolean isMailingAddress) {
        this.model.isMailingAddress(isMailingAddress);
        return this;
    }
    public MapiContactPhysicalAddressDtoBuilder street(String street) {
        this.model.street(street);
        return this;
    }
    public MapiContactPhysicalAddressDtoBuilder city(String city) {
        this.model.city(city);
        return this;
    }
    public MapiContactPhysicalAddressDtoBuilder stateOrProvince(String stateOrProvince) {
        this.model.stateOrProvince(stateOrProvince);
        return this;
    }
    public MapiContactPhysicalAddressDtoBuilder postalCode(String postalCode) {
        this.model.postalCode(postalCode);
        return this;
    }
    public MapiContactPhysicalAddressDtoBuilder country(String country) {
        this.model.country(country);
        return this;
    }
    public MapiContactPhysicalAddressDtoBuilder countryCode(String countryCode) {
        this.model.countryCode(countryCode);
        return this;
    }
    public MapiContactPhysicalAddressDtoBuilder address(String address) {
        this.model.address(address);
        return this;
    }
    public MapiContactPhysicalAddressDtoBuilder postOfficeBox(String postOfficeBox) {
        this.model.postOfficeBox(postOfficeBox);
        return this;
    }
}
