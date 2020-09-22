/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MapiContactNamePropertySetDtoBuilder.java">
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
 *  MapiContactNamePropertySetDto builder.
 */
public class MapiContactNamePropertySetDtoBuilder {
    private final MapiContactNamePropertySetDto model;
    public MapiContactNamePropertySetDtoBuilder(MapiContactNamePropertySetDto model) {
        this.model = model;
    }

    public MapiContactNamePropertySetDto build() {
        return model;
    }
    public MapiContactNamePropertySetDtoBuilder displayName(String displayName) {
        this.model.displayName(displayName);
        return this;
    }
    public MapiContactNamePropertySetDtoBuilder displayNamePrefix(String displayNamePrefix) {
        this.model.displayNamePrefix(displayNamePrefix);
        return this;
    }
    public MapiContactNamePropertySetDtoBuilder fileUnder(String fileUnder) {
        this.model.fileUnder(fileUnder);
        return this;
    }
    public MapiContactNamePropertySetDtoBuilder fileUnderId(Long fileUnderId) {
        this.model.fileUnderId(fileUnderId);
        return this;
    }
    public MapiContactNamePropertySetDtoBuilder generation(String generation) {
        this.model.generation(generation);
        return this;
    }
    public MapiContactNamePropertySetDtoBuilder givenName(String givenName) {
        this.model.givenName(givenName);
        return this;
    }
    public MapiContactNamePropertySetDtoBuilder initials(String initials) {
        this.model.initials(initials);
        return this;
    }
    public MapiContactNamePropertySetDtoBuilder middleName(String middleName) {
        this.model.middleName(middleName);
        return this;
    }
    public MapiContactNamePropertySetDtoBuilder nickname(String nickname) {
        this.model.nickname(nickname);
        return this;
    }
    public MapiContactNamePropertySetDtoBuilder surname(String surname) {
        this.model.surname(surname);
        return this;
    }
}
