
/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="EmailConfigDiscoverRequest.java">
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
 * Class that holds parameters for EmailConfigApi.discover request invocation.
 **/   
public class EmailConfigDiscoverRequest
{
    /**
     * Initializes a new instance of the EmailConfigDiscoverRequest class.
     **/
    public EmailConfigDiscoverRequest()
    {
    }

    /**
     * Initializes a new instance of the EmailConfigDiscoverRequest class.   
     * @param address Email address.
     * @param fastProcessing Turns on fast processing. All discover systems will run in parallel. First discovered result will be returned.             
     **/
    public EmailConfigDiscoverRequest(String address, Boolean fastProcessing)             
    {
        this.address = address;
        this.fastProcessing = fastProcessing;
    }
        
    private String address;

    /**
     * Getter for: Email address.
     **/
    public String getAddress() {
        return address;
    }

    /**
     * Setter for: Email address.
     **/
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Setter for: Email address.
     **/
    public EmailConfigDiscoverRequest address(String value) {
        this.address = value;
        return this;
    }

    private Boolean fastProcessing;

    /**
     * Getter for: Turns on fast processing. All discover systems will run in parallel. First discovered result will be returned.             
     **/
    public Boolean getFastProcessing() {
        return fastProcessing;
    }

    /**
     * Setter for: Turns on fast processing. All discover systems will run in parallel. First discovered result will be returned.             
     **/
    public void setFastProcessing(Boolean value) {
        this.fastProcessing = value;
    }

    /**
     * Setter for: Turns on fast processing. All discover systems will run in parallel. First discovered result will be returned.             
     **/
    public EmailConfigDiscoverRequest fastProcessing(Boolean value) {
        this.fastProcessing = value;
        return this;
    }

}
