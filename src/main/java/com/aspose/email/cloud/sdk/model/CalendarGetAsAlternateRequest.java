/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="CalendarGetAsAlternateRequest.java">
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
 * Class that holds parameters for CalendarApi.getAsAlternate request invocation.
 **/   
public class CalendarGetAsAlternateRequest
{
    /**
     * Initializes a new instance of the CalendarGetAsAlternateRequest class.
     **/
    public CalendarGetAsAlternateRequest()
    {
    }

    /**
     * Initializes a new instance of the CalendarGetAsAlternateRequest class.   
     * @param fileName iCalendar file name in storage
     * @param calendarAction iCalendar method type. Enum, available values: Create, Update, Cancel
     * @param sequenceId The sequence id
     * @param folder Path to folder in storage
     * @param storage Storage name
     **/
    public CalendarGetAsAlternateRequest(String fileName, String calendarAction, String sequenceId, String folder, String storage)             
    {
        this.fileName = fileName;
        this.calendarAction = calendarAction;
        this.sequenceId = sequenceId;
        this.folder = folder;
        this.storage = storage;
    }
        
    private String fileName;

    /**
     * Getter for: iCalendar file name in storage
     **/
    public String getFileName() {
        return fileName;
    }

    /**
     * Setter for: iCalendar file name in storage
     **/
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Setter for: iCalendar file name in storage
     **/
    public CalendarGetAsAlternateRequest fileName(String value) {
        this.fileName = value;
        return this;
    }

    private String calendarAction;

    /**
     * Getter for: iCalendar method type. Enum, available values: Create, Update, Cancel
     **/
    public String getCalendarAction() {
        return calendarAction;
    }

    /**
     * Setter for: iCalendar method type. Enum, available values: Create, Update, Cancel
     **/
    public void setCalendarAction(String value) {
        this.calendarAction = value;
    }

    /**
     * Setter for: iCalendar method type. Enum, available values: Create, Update, Cancel
     **/
    public CalendarGetAsAlternateRequest calendarAction(String value) {
        this.calendarAction = value;
        return this;
    }

    private String sequenceId;

    /**
     * Getter for: The sequence id
     **/
    public String getSequenceId() {
        return sequenceId;
    }

    /**
     * Setter for: The sequence id
     **/
    public void setSequenceId(String value) {
        this.sequenceId = value;
    }

    /**
     * Setter for: The sequence id
     **/
    public CalendarGetAsAlternateRequest sequenceId(String value) {
        this.sequenceId = value;
        return this;
    }

    private String folder;

    /**
     * Getter for: Path to folder in storage
     **/
    public String getFolder() {
        return folder;
    }

    /**
     * Setter for: Path to folder in storage
     **/
    public void setFolder(String value) {
        this.folder = value;
    }

    /**
     * Setter for: Path to folder in storage
     **/
    public CalendarGetAsAlternateRequest folder(String value) {
        this.folder = value;
        return this;
    }

    private String storage;

    /**
     * Getter for: Storage name
     **/
    public String getStorage() {
        return storage;
    }

    /**
     * Setter for: Storage name
     **/
    public void setStorage(String value) {
        this.storage = value;
    }

    /**
     * Setter for: Storage name
     **/
    public CalendarGetAsAlternateRequest storage(String value) {
        this.storage = value;
        return this;
    }

}

