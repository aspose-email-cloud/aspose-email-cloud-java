/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MapiContactPersonalInfoPropertySetDtoBuilder.java">
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
 *  MapiContactPersonalInfoPropertySetDto builder.
 */
public class MapiContactPersonalInfoPropertySetDtoBuilder {
    private MapiContactPersonalInfoPropertySetDto model;
    public MapiContactPersonalInfoPropertySetDtoBuilder(MapiContactPersonalInfoPropertySetDto model) {
        this.model = model;
    }

    /**
     * Build MapiContactPersonalInfoPropertySetDto instance.
     */
    public MapiContactPersonalInfoPropertySetDto build() {
        MapiContactPersonalInfoPropertySetDto tempModel = model;
        model = null;
        return tempModel;
    }
    /**
     * Set MapiContactPersonalInfoPropertySetDto.spouseName and return builder.
     * @param spouseName Specifies the name of the contact&#39;s spouse/partner             
     * @return builder
    **/
    public MapiContactPersonalInfoPropertySetDtoBuilder spouseName(String spouseName) {
        this.model.spouseName(spouseName);
        return this;
    }
    /**
     * Set MapiContactPersonalInfoPropertySetDto.personalHomePage and return builder.
     * @param personalHomePage Specifies the contact&#39;s personal web page URL             
     * @return builder
    **/
    public MapiContactPersonalInfoPropertySetDtoBuilder personalHomePage(String personalHomePage) {
        this.model.personalHomePage(personalHomePage);
        return this;
    }
    /**
     * Set MapiContactPersonalInfoPropertySetDto.language and return builder.
     * @param language Specifies the language that the contact uses             
     * @return builder
    **/
    public MapiContactPersonalInfoPropertySetDtoBuilder language(String language) {
        this.model.language(language);
        return this;
    }
    /**
     * Set MapiContactPersonalInfoPropertySetDto.notes and return builder.
     * @param notes Specifies the additional notes             
     * @return builder
    **/
    public MapiContactPersonalInfoPropertySetDtoBuilder notes(String notes) {
        this.model.notes(notes);
        return this;
    }
    /**
     * Set MapiContactPersonalInfoPropertySetDto.hobbies and return builder.
     * @param hobbies Specifies the hobbies of the contact             
     * @return builder
    **/
    public MapiContactPersonalInfoPropertySetDtoBuilder hobbies(String hobbies) {
        this.model.hobbies(hobbies);
        return this;
    }
    /**
     * Set MapiContactPersonalInfoPropertySetDto.location and return builder.
     * @param location Specifies the location of the contact             
     * @return builder
    **/
    public MapiContactPersonalInfoPropertySetDtoBuilder location(String location) {
        this.model.location(location);
        return this;
    }
    /**
     * Set MapiContactPersonalInfoPropertySetDto.instantMessagingAddress and return builder.
     * @param instantMessagingAddress Specifies the contact&#39;s instant messaging address             
     * @return builder
    **/
    public MapiContactPersonalInfoPropertySetDtoBuilder instantMessagingAddress(String instantMessagingAddress) {
        this.model.instantMessagingAddress(instantMessagingAddress);
        return this;
    }
    /**
     * Set MapiContactPersonalInfoPropertySetDto.organizationalIdNumber and return builder.
     * @param organizationalIdNumber Specifies an organizational ID number for the contact             
     * @return builder
    **/
    public MapiContactPersonalInfoPropertySetDtoBuilder organizationalIdNumber(String organizationalIdNumber) {
        this.model.organizationalIdNumber(organizationalIdNumber);
        return this;
    }
    /**
     * Set MapiContactPersonalInfoPropertySetDto.customerId and return builder.
     * @param customerId Specifies the contact&#39;s customer ID number             
     * @return builder
    **/
    public MapiContactPersonalInfoPropertySetDtoBuilder customerId(String customerId) {
        this.model.customerId(customerId);
        return this;
    }
    /**
     * Set MapiContactPersonalInfoPropertySetDto.governmentIdNumber and return builder.
     * @param governmentIdNumber Specifies the contact&#39;s government ID number             
     * @return builder
    **/
    public MapiContactPersonalInfoPropertySetDtoBuilder governmentIdNumber(String governmentIdNumber) {
        this.model.governmentIdNumber(governmentIdNumber);
        return this;
    }
    /**
     * Set MapiContactPersonalInfoPropertySetDto.freeBusyLocation and return builder.
     * @param freeBusyLocation Specifies a URL path from which a client can retrieve free/busy information for the contact as an iCal file             
     * @return builder
    **/
    public MapiContactPersonalInfoPropertySetDtoBuilder freeBusyLocation(String freeBusyLocation) {
        this.model.freeBusyLocation(freeBusyLocation);
        return this;
    }
    /**
     * Set MapiContactPersonalInfoPropertySetDto.account and return builder.
     * @param account Specifies the account name of the contact             
     * @return builder
    **/
    public MapiContactPersonalInfoPropertySetDtoBuilder account(String account) {
        this.model.account(account);
        return this;
    }
    /**
     * Set MapiContactPersonalInfoPropertySetDto.html and return builder.
     * @param html Specifies the contact&#39;s business web page URL             
     * @return builder
    **/
    public MapiContactPersonalInfoPropertySetDtoBuilder html(String html) {
        this.model.html(html);
        return this;
    }
    /**
     * Set MapiContactPersonalInfoPropertySetDto.businessHomePage and return builder.
     * @param businessHomePage Specifies the contact&#39;s business web page URL             
     * @return builder
    **/
    public MapiContactPersonalInfoPropertySetDtoBuilder businessHomePage(String businessHomePage) {
        this.model.businessHomePage(businessHomePage);
        return this;
    }
    /**
     * Set MapiContactPersonalInfoPropertySetDto.ftpSite and return builder.
     * @param ftpSite Specifies the contact&#39;s File Transfer Protocol (FTP) URL             
     * @return builder
    **/
    public MapiContactPersonalInfoPropertySetDtoBuilder ftpSite(String ftpSite) {
        this.model.ftpSite(ftpSite);
        return this;
    }
    /**
     * Set MapiContactPersonalInfoPropertySetDto.computerNetworkName and return builder.
     * @param computerNetworkName Specifies the name of the network to which the contact&#39;s computer is connected             
     * @return builder
    **/
    public MapiContactPersonalInfoPropertySetDtoBuilder computerNetworkName(String computerNetworkName) {
        this.model.computerNetworkName(computerNetworkName);
        return this;
    }
    /**
     * Set MapiContactPersonalInfoPropertySetDto.gender and return builder.
     * @param gender Gender of the contact Enum, available values: Unspecified, Female, Male
     * @return builder
    **/
    public MapiContactPersonalInfoPropertySetDtoBuilder gender(String gender) {
        this.model.gender(gender);
        return this;
    }
    /**
     * Set MapiContactPersonalInfoPropertySetDto.referredByName and return builder.
     * @param referredByName Specifies the name of the person who referred this contact to the user             
     * @return builder
    **/
    public MapiContactPersonalInfoPropertySetDtoBuilder referredByName(String referredByName) {
        this.model.referredByName(referredByName);
        return this;
    }
    /**
     * Set MapiContactPersonalInfoPropertySetDto.children and return builder.
     * @param children Contains a list of names of children.             
     * @return builder
    **/
    public MapiContactPersonalInfoPropertySetDtoBuilder children(List<String> children) {
        this.model.children(children);
        return this;
    }
}
