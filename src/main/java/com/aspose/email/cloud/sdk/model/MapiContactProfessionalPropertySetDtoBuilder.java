/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MapiContactProfessionalPropertySetDtoBuilder.java">
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
 *  MapiContactProfessionalPropertySetDto builder.
 */
public class MapiContactProfessionalPropertySetDtoBuilder {
    private MapiContactProfessionalPropertySetDto model;
    public MapiContactProfessionalPropertySetDtoBuilder(MapiContactProfessionalPropertySetDto model) {
        this.model = model;
    }

    /**
     * Build MapiContactProfessionalPropertySetDto instance.
     */
    public MapiContactProfessionalPropertySetDto build() {
        MapiContactProfessionalPropertySetDto tempModel = model;
        model = null;
        return tempModel;
    }
    /**
     * Set MapiContactProfessionalPropertySetDto.title and return builder.
     * @param title Gets or sets the job title of the contact             
     * @return builder
    **/
    public MapiContactProfessionalPropertySetDtoBuilder title(String title) {
        this.model.title(title);
        return this;
    }
    /**
     * Set MapiContactProfessionalPropertySetDto.companyName and return builder.
     * @param companyName Gets or sets the company that employs the contact             
     * @return builder
    **/
    public MapiContactProfessionalPropertySetDtoBuilder companyName(String companyName) {
        this.model.companyName(companyName);
        return this;
    }
    /**
     * Set MapiContactProfessionalPropertySetDto.departmentName and return builder.
     * @param departmentName Gets or sets the name of the department to which the contact belongs             
     * @return builder
    **/
    public MapiContactProfessionalPropertySetDtoBuilder departmentName(String departmentName) {
        this.model.departmentName(departmentName);
        return this;
    }
    /**
     * Set MapiContactProfessionalPropertySetDto.officeLocation and return builder.
     * @param officeLocation Gets or sets the location of the office that the contact works in             
     * @return builder
    **/
    public MapiContactProfessionalPropertySetDtoBuilder officeLocation(String officeLocation) {
        this.model.officeLocation(officeLocation);
        return this;
    }
    /**
     * Set MapiContactProfessionalPropertySetDto.managerName and return builder.
     * @param managerName Gets or sets the name of the contact&#39;s manager             
     * @return builder
    **/
    public MapiContactProfessionalPropertySetDtoBuilder managerName(String managerName) {
        this.model.managerName(managerName);
        return this;
    }
    /**
     * Set MapiContactProfessionalPropertySetDto.assistant and return builder.
     * @param assistant Gets or sets the name of the contact&#39;s assistant             
     * @return builder
    **/
    public MapiContactProfessionalPropertySetDtoBuilder assistant(String assistant) {
        this.model.assistant(assistant);
        return this;
    }
    /**
     * Set MapiContactProfessionalPropertySetDto.profession and return builder.
     * @param profession Gets or sets the profession of the contact             
     * @return builder
    **/
    public MapiContactProfessionalPropertySetDtoBuilder profession(String profession) {
        this.model.profession(profession);
        return this;
    }
}
