/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="PostalAddressBuilder.java">
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
 *  PostalAddress builder.
 */
public class PostalAddressBuilder {
    private final PostalAddress model;
    public PostalAddressBuilder(PostalAddress model) {
        this.model = model;
    }

    public PostalAddress build() {
        return model;
    }
    public PostalAddressBuilder address(String address) {
        this.model.address(address);
        return this;
    }
    public PostalAddressBuilder category(EnumWithCustomOfPostalAddressCategory category) {
        this.model.category(category);
        return this;
    }
    public PostalAddressBuilder city(String city) {
        this.model.city(city);
        return this;
    }
    public PostalAddressBuilder country(String country) {
        this.model.country(country);
        return this;
    }
    public PostalAddressBuilder countryCode(String countryCode) {
        this.model.countryCode(countryCode);
        return this;
    }
    public PostalAddressBuilder isMailingAddress(Boolean isMailingAddress) {
        this.model.isMailingAddress(isMailingAddress);
        return this;
    }
    public PostalAddressBuilder postalCode(String postalCode) {
        this.model.postalCode(postalCode);
        return this;
    }
    public PostalAddressBuilder postOfficeBox(String postOfficeBox) {
        this.model.postOfficeBox(postOfficeBox);
        return this;
    }
    public PostalAddressBuilder preferred(Boolean preferred) {
        this.model.preferred(preferred);
        return this;
    }
    public PostalAddressBuilder stateOrProvince(String stateOrProvince) {
        this.model.stateOrProvince(stateOrProvince);
        return this;
    }
    public PostalAddressBuilder street(String street) {
        this.model.street(street);
        return this;
    }
}
