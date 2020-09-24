/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="ContactGetListRequestBuilder.java">
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
 *  ContactGetListRequest builder.
 */
public class ContactGetListRequestBuilder {
    private final ContactGetListRequest model;
    public ContactGetListRequestBuilder(ContactGetListRequest model) {
        this.model = model;
    }

    /**
     * Build ContactGetListRequest instance.
     */
    public ContactGetListRequest build() {
        ContactGetListRequest tempModel = model;
        model = null;
        return tempModel;
    }

    /**
     * Setter for: Contact document format. Enum, available values: VCard, WebDav, Msg
     **/
    public ContactGetListRequestBuilder format(String format) {
        this.model.format(format);
        return this;
    }
    /**
     * Setter for: Path to folder in storage.
     **/
    public ContactGetListRequestBuilder folder(String folder) {
        this.model.folder(folder);
        return this;
    }
    /**
     * Setter for: Storage name.
     **/
    public ContactGetListRequestBuilder storage(String storage) {
        this.model.storage(storage);
        return this;
    }
    /**
     * Setter for: Count of items on page.
     **/
    public ContactGetListRequestBuilder itemsPerPage(Integer itemsPerPage) {
        this.model.itemsPerPage(itemsPerPage);
        return this;
    }
    /**
     * Setter for: Page number.
     **/
    public ContactGetListRequestBuilder pageNumber(Integer pageNumber) {
        this.model.pageNumber(pageNumber);
        return this;
    }
}
