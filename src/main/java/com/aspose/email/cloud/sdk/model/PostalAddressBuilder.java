/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="PostalAddressBuilder.java">
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
 *  PostalAddress builder.
 */
public class PostalAddressBuilder {
    private PostalAddress model;
    public PostalAddressBuilder(PostalAddress model) {
        this.model = model;
    }

    /**
     * Build PostalAddress instance.
     */
    public PostalAddress build() {
        PostalAddress tempModel = model;
        model = null;
        return tempModel;
    }
    /**
     * Set PostalAddress.address and return builder.
     * @param address Address.             
     * @return builder
    **/
    public PostalAddressBuilder address(String address) {
        this.model.address(address);
        return this;
    }
    /**
     * Set PostalAddress.category and return builder.
     * @param category Address category.             
     * @return builder
    **/
    public PostalAddressBuilder category(EnumWithCustomOfPostalAddressCategory category) {
        this.model.category(category);
        return this;
    }
    /**
     * Set PostalAddress.city and return builder.
     * @param city Address&#39;s city.             
     * @return builder
    **/
    public PostalAddressBuilder city(String city) {
        this.model.city(city);
        return this;
    }
    /**
     * Set PostalAddress.country and return builder.
     * @param country Address&#39;s country.             
     * @return builder
    **/
    public PostalAddressBuilder country(String country) {
        this.model.country(country);
        return this;
    }
    /**
     * Set PostalAddress.countryCode and return builder.
     * @param countryCode Country code.             
     * @return builder
    **/
    public PostalAddressBuilder countryCode(String countryCode) {
        this.model.countryCode(countryCode);
        return this;
    }
    /**
     * Set PostalAddress.isMailingAddress and return builder.
     * @param isMailingAddress Defines whether address may be used for mailing.             
     * @return builder
    **/
    public PostalAddressBuilder isMailingAddress(Boolean isMailingAddress) {
        this.model.isMailingAddress(isMailingAddress);
        return this;
    }
    /**
     * Set PostalAddress.postalCode and return builder.
     * @param postalCode Postal code.             
     * @return builder
    **/
    public PostalAddressBuilder postalCode(String postalCode) {
        this.model.postalCode(postalCode);
        return this;
    }
    /**
     * Set PostalAddress.postOfficeBox and return builder.
     * @param postOfficeBox Post Office box.             
     * @return builder
    **/
    public PostalAddressBuilder postOfficeBox(String postOfficeBox) {
        this.model.postOfficeBox(postOfficeBox);
        return this;
    }
    /**
     * Set PostalAddress.preferred and return builder.
     * @param preferred Defines whether postal address is preferred.             
     * @return builder
    **/
    public PostalAddressBuilder preferred(Boolean preferred) {
        this.model.preferred(preferred);
        return this;
    }
    /**
     * Set PostalAddress.stateOrProvince and return builder.
     * @param stateOrProvince Address&#39;s region.             
     * @return builder
    **/
    public PostalAddressBuilder stateOrProvince(String stateOrProvince) {
        this.model.stateOrProvince(stateOrProvince);
        return this;
    }
    /**
     * Set PostalAddress.street and return builder.
     * @param street Address&#39;s street.             
     * @return builder
    **/
    public PostalAddressBuilder street(String street) {
        this.model.street(street);
        return this;
    }
}
