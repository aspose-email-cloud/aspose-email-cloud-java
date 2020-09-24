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
 *  MapiContactNamePropertySetDto builder.
 */
public class MapiContactNamePropertySetDtoBuilder {
    private final MapiContactNamePropertySetDto model;
    public MapiContactNamePropertySetDtoBuilder(MapiContactNamePropertySetDto model) {
        this.model = model;
    }

    /**
     * Build MapiContactNamePropertySetDto instance.
     */
    public MapiContactNamePropertySetDto build() {
        MapiContactNamePropertySetDto tempModel = model;
        model = null;
        return tempModel;
    }
    /**
     * Set MapiContactNamePropertySetDto.displayName and return builder.
     * @param displayName Full name of the contact             
     * @return builder
    **/
    public MapiContactNamePropertySetDtoBuilder displayName(String displayName) {
        this.model.displayName(displayName);
        return this;
    }
    /**
     * Set MapiContactNamePropertySetDto.displayNamePrefix and return builder.
     * @param displayNamePrefix Title of the contact             
     * @return builder
    **/
    public MapiContactNamePropertySetDtoBuilder displayNamePrefix(String displayNamePrefix) {
        this.model.displayNamePrefix(displayNamePrefix);
        return this;
    }
    /**
     * Set MapiContactNamePropertySetDto.fileUnder and return builder.
     * @param fileUnder Name under which to file this contact when displaying a list of contacts             
     * @return builder
    **/
    public MapiContactNamePropertySetDtoBuilder fileUnder(String fileUnder) {
        this.model.fileUnder(fileUnder);
        return this;
    }
    /**
     * Set MapiContactNamePropertySetDto.fileUnderId and return builder.
     * @param fileUnderId Value specifying how to generate and recompute the property when other properties are changed             
     * @return builder
    **/
    public MapiContactNamePropertySetDtoBuilder fileUnderId(Long fileUnderId) {
        this.model.fileUnderId(fileUnderId);
        return this;
    }
    /**
     * Set MapiContactNamePropertySetDto.generation and return builder.
     * @param generation Generation suffix of the contact             
     * @return builder
    **/
    public MapiContactNamePropertySetDtoBuilder generation(String generation) {
        this.model.generation(generation);
        return this;
    }
    /**
     * Set MapiContactNamePropertySetDto.givenName and return builder.
     * @param givenName Given name (first name) of the contact             
     * @return builder
    **/
    public MapiContactNamePropertySetDtoBuilder givenName(String givenName) {
        this.model.givenName(givenName);
        return this;
    }
    /**
     * Set MapiContactNamePropertySetDto.initials and return builder.
     * @param initials Initials of the contact             
     * @return builder
    **/
    public MapiContactNamePropertySetDtoBuilder initials(String initials) {
        this.model.initials(initials);
        return this;
    }
    /**
     * Set MapiContactNamePropertySetDto.middleName and return builder.
     * @param middleName Middle name of the contact             
     * @return builder
    **/
    public MapiContactNamePropertySetDtoBuilder middleName(String middleName) {
        this.model.middleName(middleName);
        return this;
    }
    /**
     * Set MapiContactNamePropertySetDto.nickname and return builder.
     * @param nickname Nickname of the contact             
     * @return builder
    **/
    public MapiContactNamePropertySetDtoBuilder nickname(String nickname) {
        this.model.nickname(nickname);
        return this;
    }
    /**
     * Set MapiContactNamePropertySetDto.surname and return builder.
     * @param surname Surname (family name) of the contact             
     * @return builder
    **/
    public MapiContactNamePropertySetDtoBuilder surname(String surname) {
        this.model.surname(surname);
        return this;
    }
}
