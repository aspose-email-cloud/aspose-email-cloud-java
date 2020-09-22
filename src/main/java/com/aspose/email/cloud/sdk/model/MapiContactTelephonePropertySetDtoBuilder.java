/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MapiContactTelephonePropertySetDtoBuilder.java">
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
 *  MapiContactTelephonePropertySetDto builder.
 */
public class MapiContactTelephonePropertySetDtoBuilder {
    private final MapiContactTelephonePropertySetDto model;
    public MapiContactTelephonePropertySetDtoBuilder(MapiContactTelephonePropertySetDto model) {
        this.model = model;
    }

    /**
     * Build MapiContactTelephonePropertySetDto instance.
     */
    public MapiContactTelephonePropertySetDto build() {
        return model;
    }
    /**
     * Set MapiContactTelephonePropertySetDto.isEmpty and return builder.
     * @param isEmpty Shows if MapiContactTelephonePropertySet is empty             
     * @return builder
    **/
    public MapiContactTelephonePropertySetDtoBuilder isEmpty(Boolean isEmpty) {
        this.model.isEmpty(isEmpty);
        return this;
    }
    /**
     * Set MapiContactTelephonePropertySetDto.defaultTelephoneNumber and return builder.
     * @param defaultTelephoneNumber Default value of electronic address Uses when user does not set any electronic address if UseAutocomplete property is set &#39;true&#39;             
     * @return builder
    **/
    public MapiContactTelephonePropertySetDtoBuilder defaultTelephoneNumber(String defaultTelephoneNumber) {
        this.model.defaultTelephoneNumber(defaultTelephoneNumber);
        return this;
    }
    /**
     * Set MapiContactTelephonePropertySetDto.useAutocomplete and return builder.
     * @param useAutocomplete Indicates that one electronic address is completed automatically in case if user does not set any electronic address             
     * @return builder
    **/
    public MapiContactTelephonePropertySetDtoBuilder useAutocomplete(Boolean useAutocomplete) {
        this.model.useAutocomplete(useAutocomplete);
        return this;
    }
    /**
     * Set MapiContactTelephonePropertySetDto.callbackTelephoneNumber and return builder.
     * @param callbackTelephoneNumber Gets or sets the callback telephone number             
     * @return builder
    **/
    public MapiContactTelephonePropertySetDtoBuilder callbackTelephoneNumber(String callbackTelephoneNumber) {
        this.model.callbackTelephoneNumber(callbackTelephoneNumber);
        return this;
    }
    /**
     * Set MapiContactTelephonePropertySetDto.businessTelephoneNumber and return builder.
     * @param businessTelephoneNumber Gets or sets the business telephone number             
     * @return builder
    **/
    public MapiContactTelephonePropertySetDtoBuilder businessTelephoneNumber(String businessTelephoneNumber) {
        this.model.businessTelephoneNumber(businessTelephoneNumber);
        return this;
    }
    /**
     * Set MapiContactTelephonePropertySetDto.homeTelephoneNumber and return builder.
     * @param homeTelephoneNumber Gets or sets the home telephone number             
     * @return builder
    **/
    public MapiContactTelephonePropertySetDtoBuilder homeTelephoneNumber(String homeTelephoneNumber) {
        this.model.homeTelephoneNumber(homeTelephoneNumber);
        return this;
    }
    /**
     * Set MapiContactTelephonePropertySetDto.primaryTelephoneNumber and return builder.
     * @param primaryTelephoneNumber Gets or sets the primary telephone number             
     * @return builder
    **/
    public MapiContactTelephonePropertySetDtoBuilder primaryTelephoneNumber(String primaryTelephoneNumber) {
        this.model.primaryTelephoneNumber(primaryTelephoneNumber);
        return this;
    }
    /**
     * Set MapiContactTelephonePropertySetDto.business2TelephoneNumber and return builder.
     * @param business2TelephoneNumber Gets or sets the second business telephone number             
     * @return builder
    **/
    public MapiContactTelephonePropertySetDtoBuilder business2TelephoneNumber(String business2TelephoneNumber) {
        this.model.business2TelephoneNumber(business2TelephoneNumber);
        return this;
    }
    /**
     * Set MapiContactTelephonePropertySetDto.mobileTelephoneNumber and return builder.
     * @param mobileTelephoneNumber Gets or sets the mobile telephone number             
     * @return builder
    **/
    public MapiContactTelephonePropertySetDtoBuilder mobileTelephoneNumber(String mobileTelephoneNumber) {
        this.model.mobileTelephoneNumber(mobileTelephoneNumber);
        return this;
    }
    /**
     * Set MapiContactTelephonePropertySetDto.radioTelephoneNumber and return builder.
     * @param radioTelephoneNumber Gets or sets the radio telephone number             
     * @return builder
    **/
    public MapiContactTelephonePropertySetDtoBuilder radioTelephoneNumber(String radioTelephoneNumber) {
        this.model.radioTelephoneNumber(radioTelephoneNumber);
        return this;
    }
    /**
     * Set MapiContactTelephonePropertySetDto.carTelephoneNumber and return builder.
     * @param carTelephoneNumber Gets or sets the car telephone number             
     * @return builder
    **/
    public MapiContactTelephonePropertySetDtoBuilder carTelephoneNumber(String carTelephoneNumber) {
        this.model.carTelephoneNumber(carTelephoneNumber);
        return this;
    }
    /**
     * Set MapiContactTelephonePropertySetDto.otherTelephoneNumber and return builder.
     * @param otherTelephoneNumber Gets or sets an alternate telephone number             
     * @return builder
    **/
    public MapiContactTelephonePropertySetDtoBuilder otherTelephoneNumber(String otherTelephoneNumber) {
        this.model.otherTelephoneNumber(otherTelephoneNumber);
        return this;
    }
    /**
     * Set MapiContactTelephonePropertySetDto.assistantTelephoneNumber and return builder.
     * @param assistantTelephoneNumber Gets or sets the telephone number of the contact&#39;s assistant             
     * @return builder
    **/
    public MapiContactTelephonePropertySetDtoBuilder assistantTelephoneNumber(String assistantTelephoneNumber) {
        this.model.assistantTelephoneNumber(assistantTelephoneNumber);
        return this;
    }
    /**
     * Set MapiContactTelephonePropertySetDto.home2TelephoneNumber and return builder.
     * @param home2TelephoneNumber Gets or sets a second home telephone number             
     * @return builder
    **/
    public MapiContactTelephonePropertySetDtoBuilder home2TelephoneNumber(String home2TelephoneNumber) {
        this.model.home2TelephoneNumber(home2TelephoneNumber);
        return this;
    }
    /**
     * Set MapiContactTelephonePropertySetDto.ttyTddPhoneNumber and return builder.
     * @param ttyTddPhoneNumber Gets or sets the telephone number for the contact&#39;s text telephone (TTY) or telecommunication device for the deaf (TDD)             
     * @return builder
    **/
    public MapiContactTelephonePropertySetDtoBuilder ttyTddPhoneNumber(String ttyTddPhoneNumber) {
        this.model.ttyTddPhoneNumber(ttyTddPhoneNumber);
        return this;
    }
    /**
     * Set MapiContactTelephonePropertySetDto.companyMainTelephoneNumber and return builder.
     * @param companyMainTelephoneNumber Gets or sets the company phone number             
     * @return builder
    **/
    public MapiContactTelephonePropertySetDtoBuilder companyMainTelephoneNumber(String companyMainTelephoneNumber) {
        this.model.companyMainTelephoneNumber(companyMainTelephoneNumber);
        return this;
    }
    /**
     * Set MapiContactTelephonePropertySetDto.telexNumber and return builder.
     * @param telexNumber Gets or sets the telex number             
     * @return builder
    **/
    public MapiContactTelephonePropertySetDtoBuilder telexNumber(String telexNumber) {
        this.model.telexNumber(telexNumber);
        return this;
    }
    /**
     * Set MapiContactTelephonePropertySetDto.isdnNumber and return builder.
     * @param isdnNumber Gets or sets the integrated services digital network (ISDN) number             
     * @return builder
    **/
    public MapiContactTelephonePropertySetDtoBuilder isdnNumber(String isdnNumber) {
        this.model.isdnNumber(isdnNumber);
        return this;
    }
    /**
     * Set MapiContactTelephonePropertySetDto.pagerTelephoneNumber and return builder.
     * @param pagerTelephoneNumber Gets or sets a pager telephone number             
     * @return builder
    **/
    public MapiContactTelephonePropertySetDtoBuilder pagerTelephoneNumber(String pagerTelephoneNumber) {
        this.model.pagerTelephoneNumber(pagerTelephoneNumber);
        return this;
    }
}
