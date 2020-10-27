/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="CalendarGetListRequestBuilder.java">
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

/**
 *  CalendarGetListRequest builder.
 */
public class CalendarGetListRequestBuilder {
    private CalendarGetListRequest model;
    public CalendarGetListRequestBuilder(CalendarGetListRequest model) {
        this.model = model;
    }

    /**
     * Build CalendarGetListRequest instance.
     */
    public CalendarGetListRequest build() {
        CalendarGetListRequest tempModel = model;
        model = null;
        return tempModel;
    }

    /**
     * Setter for: Path to folder in storage.
     **/
    public CalendarGetListRequestBuilder folder(String folder) {
        this.model.folder(folder);
        return this;
    }
    /**
     * Setter for: Count of items on page.
     **/
    public CalendarGetListRequestBuilder itemsPerPage(Integer itemsPerPage) {
        this.model.itemsPerPage(itemsPerPage);
        return this;
    }
    /**
     * Setter for: Page number.
     **/
    public CalendarGetListRequestBuilder pageNumber(Integer pageNumber) {
        this.model.pageNumber(pageNumber);
        return this;
    }
    /**
     * Setter for: Storage name.
     **/
    public CalendarGetListRequestBuilder storage(String storage) {
        this.model.storage(storage);
        return this;
    }
}
