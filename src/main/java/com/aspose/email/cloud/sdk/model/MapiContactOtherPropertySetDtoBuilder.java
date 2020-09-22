/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MapiContactOtherPropertySetDtoBuilder.java">
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
 *  MapiContactOtherPropertySetDto builder.
 */
public class MapiContactOtherPropertySetDtoBuilder {
    private final MapiContactOtherPropertySetDto model;
    public MapiContactOtherPropertySetDtoBuilder(MapiContactOtherPropertySetDto model) {
        this.model = model;
    }

    public MapiContactOtherPropertySetDto build() {
        return model;
    }
    public MapiContactOtherPropertySetDtoBuilder _private(Boolean _private) {
        this.model._private(_private);
        return this;
    }
    public MapiContactOtherPropertySetDtoBuilder journal(Boolean journal) {
        this.model.journal(journal);
        return this;
    }
    public MapiContactOtherPropertySetDtoBuilder reminderTime(Date reminderTime) {
        this.model.reminderTime(reminderTime);
        return this;
    }
    public MapiContactOtherPropertySetDtoBuilder reminderTopic(String reminderTopic) {
        this.model.reminderTopic(reminderTopic);
        return this;
    }
    public MapiContactOtherPropertySetDtoBuilder userField1(String userField1) {
        this.model.userField1(userField1);
        return this;
    }
    public MapiContactOtherPropertySetDtoBuilder userField2(String userField2) {
        this.model.userField2(userField2);
        return this;
    }
    public MapiContactOtherPropertySetDtoBuilder userField3(String userField3) {
        this.model.userField3(userField3);
        return this;
    }
    public MapiContactOtherPropertySetDtoBuilder userField4(String userField4) {
        this.model.userField4(userField4);
        return this;
    }
}
