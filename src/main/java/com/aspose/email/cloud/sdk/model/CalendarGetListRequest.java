
/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="CalendarGetListRequest.java">
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
 * Class that holds parameters for CalendarApi.getList request invocation.
 **/   
public class CalendarGetListRequest
{
    /**
     * Initializes a new instance of the CalendarGetListRequest class.
     **/
    public CalendarGetListRequest()
    {
    }

    /**
     * Initializes a new instance of the CalendarGetListRequest class.   
     * @param folder Path to folder in storage.
     * @param itemsPerPage Count of items on page.
     * @param pageNumber Page number.
     * @param storage Storage name.
     **/
    public CalendarGetListRequest(String folder, Integer itemsPerPage, Integer pageNumber, String storage)             
    {
        this.folder = folder;
        this.itemsPerPage = itemsPerPage;
        this.pageNumber = pageNumber;
        this.storage = storage;
    }
        
    private String folder;

    /**
     * Getter for: Path to folder in storage.
     **/
    public String getFolder() {
        return folder;
    }

    /**
     * Setter for: Path to folder in storage.
     **/
    public void setFolder(String value) {
        this.folder = value;
    }

    /**
     * Setter for: Path to folder in storage.
     **/
    public CalendarGetListRequest folder(String value) {
        this.folder = value;
        return this;
    }

    private Integer itemsPerPage;

    /**
     * Getter for: Count of items on page.
     **/
    public Integer getItemsPerPage() {
        return itemsPerPage;
    }

    /**
     * Setter for: Count of items on page.
     **/
    public void setItemsPerPage(Integer value) {
        this.itemsPerPage = value;
    }

    /**
     * Setter for: Count of items on page.
     **/
    public CalendarGetListRequest itemsPerPage(Integer value) {
        this.itemsPerPage = value;
        return this;
    }

    private Integer pageNumber;

    /**
     * Getter for: Page number.
     **/
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * Setter for: Page number.
     **/
    public void setPageNumber(Integer value) {
        this.pageNumber = value;
    }

    /**
     * Setter for: Page number.
     **/
    public CalendarGetListRequest pageNumber(Integer value) {
        this.pageNumber = value;
        return this;
    }

    private String storage;

    /**
     * Getter for: Storage name.
     **/
    public String getStorage() {
        return storage;
    }

    /**
     * Setter for: Storage name.
     **/
    public void setStorage(String value) {
        this.storage = value;
    }

    /**
     * Setter for: Storage name.
     **/
    public CalendarGetListRequest storage(String value) {
        this.storage = value;
        return this;
    }

}
