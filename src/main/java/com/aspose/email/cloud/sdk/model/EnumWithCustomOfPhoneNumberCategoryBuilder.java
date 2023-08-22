/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="EnumWithCustomOfPhoneNumberCategoryBuilder.java">
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
 *  EnumWithCustomOfPhoneNumberCategory builder.
 */
public class EnumWithCustomOfPhoneNumberCategoryBuilder {
    private EnumWithCustomOfPhoneNumberCategory model;
    public EnumWithCustomOfPhoneNumberCategoryBuilder(EnumWithCustomOfPhoneNumberCategory model) {
        this.model = model;
    }

    /**
     * Build EnumWithCustomOfPhoneNumberCategory instance.
     */
    public EnumWithCustomOfPhoneNumberCategory build() {
        EnumWithCustomOfPhoneNumberCategory tempModel = model;
        model = null;
        return tempModel;
    }
    /**
     * Set EnumWithCustomOfPhoneNumberCategory.value and return builder.
     * @param value Phone number category. Enum, available values: Custom, Home, Work, Office, Mobile, Fax, HomeFax, WorkFax, Pager, Car, Isdn, Telex, Callback, Radio, Company, TtyTdd, Assistant, Primary
     * @return builder
    **/
    public EnumWithCustomOfPhoneNumberCategoryBuilder value(String value) {
        this.model.value(value);
        return this;
    }
    /**
     * Set EnumWithCustomOfPhoneNumberCategory.description and return builder.
     * @param description 
     * @return builder
    **/
    public EnumWithCustomOfPhoneNumberCategoryBuilder description(String description) {
        this.model.description(description);
        return this;
    }
}
