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

import java.util.List;

/**
 *  MapiContactPersonalInfoPropertySetDto builder.
 */
public class MapiContactPersonalInfoPropertySetDtoBuilder {
    private final MapiContactPersonalInfoPropertySetDto model;
    public MapiContactPersonalInfoPropertySetDtoBuilder(MapiContactPersonalInfoPropertySetDto model) {
        this.model = model;
    }

    public MapiContactPersonalInfoPropertySetDto build() {
        return model;
    }
    public MapiContactPersonalInfoPropertySetDtoBuilder spouseName(String spouseName) {
        this.model.spouseName(spouseName);
        return this;
    }
    public MapiContactPersonalInfoPropertySetDtoBuilder personalHomePage(String personalHomePage) {
        this.model.personalHomePage(personalHomePage);
        return this;
    }
    public MapiContactPersonalInfoPropertySetDtoBuilder language(String language) {
        this.model.language(language);
        return this;
    }
    public MapiContactPersonalInfoPropertySetDtoBuilder notes(String notes) {
        this.model.notes(notes);
        return this;
    }
    public MapiContactPersonalInfoPropertySetDtoBuilder hobbies(String hobbies) {
        this.model.hobbies(hobbies);
        return this;
    }
    public MapiContactPersonalInfoPropertySetDtoBuilder location(String location) {
        this.model.location(location);
        return this;
    }
    public MapiContactPersonalInfoPropertySetDtoBuilder instantMessagingAddress(String instantMessagingAddress) {
        this.model.instantMessagingAddress(instantMessagingAddress);
        return this;
    }
    public MapiContactPersonalInfoPropertySetDtoBuilder organizationalIdNumber(String organizationalIdNumber) {
        this.model.organizationalIdNumber(organizationalIdNumber);
        return this;
    }
    public MapiContactPersonalInfoPropertySetDtoBuilder customerId(String customerId) {
        this.model.customerId(customerId);
        return this;
    }
    public MapiContactPersonalInfoPropertySetDtoBuilder governmentIdNumber(String governmentIdNumber) {
        this.model.governmentIdNumber(governmentIdNumber);
        return this;
    }
    public MapiContactPersonalInfoPropertySetDtoBuilder freeBusyLocation(String freeBusyLocation) {
        this.model.freeBusyLocation(freeBusyLocation);
        return this;
    }
    public MapiContactPersonalInfoPropertySetDtoBuilder account(String account) {
        this.model.account(account);
        return this;
    }
    public MapiContactPersonalInfoPropertySetDtoBuilder html(String html) {
        this.model.html(html);
        return this;
    }
    public MapiContactPersonalInfoPropertySetDtoBuilder businessHomePage(String businessHomePage) {
        this.model.businessHomePage(businessHomePage);
        return this;
    }
    public MapiContactPersonalInfoPropertySetDtoBuilder ftpSite(String ftpSite) {
        this.model.ftpSite(ftpSite);
        return this;
    }
    public MapiContactPersonalInfoPropertySetDtoBuilder computerNetworkName(String computerNetworkName) {
        this.model.computerNetworkName(computerNetworkName);
        return this;
    }
    public MapiContactPersonalInfoPropertySetDtoBuilder gender(String gender) {
        this.model.gender(gender);
        return this;
    }
    public MapiContactPersonalInfoPropertySetDtoBuilder referredByName(String referredByName) {
        this.model.referredByName(referredByName);
        return this;
    }
    public MapiContactPersonalInfoPropertySetDtoBuilder children(List<String> children) {
        this.model.children(children);
        return this;
    }
}
