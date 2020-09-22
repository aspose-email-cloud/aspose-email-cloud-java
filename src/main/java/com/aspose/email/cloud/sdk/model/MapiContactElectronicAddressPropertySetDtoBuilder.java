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

import java.util.List;

/**
 *  MapiContactElectronicAddressPropertySetDto builder.
 */
public class MapiContactElectronicAddressPropertySetDtoBuilder {
    private final MapiContactElectronicAddressPropertySetDto model;
    public MapiContactElectronicAddressPropertySetDtoBuilder(MapiContactElectronicAddressPropertySetDto model) {
        this.model = model;
    }

    public MapiContactElectronicAddressPropertySetDto build() {
        return model;
    }
    public MapiContactElectronicAddressPropertySetDtoBuilder businessFax(MapiContactElectronicAddressDto businessFax) {
        this.model.businessFax(businessFax);
        return this;
    }
    public MapiContactElectronicAddressPropertySetDtoBuilder defaultEmailAddress(MapiContactElectronicAddressDto defaultEmailAddress) {
        this.model.defaultEmailAddress(defaultEmailAddress);
        return this;
    }
    public MapiContactElectronicAddressPropertySetDtoBuilder email1(MapiContactElectronicAddressDto email1) {
        this.model.email1(email1);
        return this;
    }
    public MapiContactElectronicAddressPropertySetDtoBuilder email2(MapiContactElectronicAddressDto email2) {
        this.model.email2(email2);
        return this;
    }
    public MapiContactElectronicAddressPropertySetDtoBuilder email3(MapiContactElectronicAddressDto email3) {
        this.model.email3(email3);
        return this;
    }
    public MapiContactElectronicAddressPropertySetDtoBuilder homeFax(MapiContactElectronicAddressDto homeFax) {
        this.model.homeFax(homeFax);
        return this;
    }
    public MapiContactElectronicAddressPropertySetDtoBuilder isEmpty(Boolean isEmpty) {
        this.model.isEmpty(isEmpty);
        return this;
    }
    public MapiContactElectronicAddressPropertySetDtoBuilder primaryFax(MapiContactElectronicAddressDto primaryFax) {
        this.model.primaryFax(primaryFax);
        return this;
    }
    public MapiContactElectronicAddressPropertySetDtoBuilder useAutocomplete(Boolean useAutocomplete) {
        this.model.useAutocomplete(useAutocomplete);
        return this;
    }
}
