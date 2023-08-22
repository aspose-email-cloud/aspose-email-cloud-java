/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="DisposableEmailIsDisposableRequest.java">
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

/**
 * Class that holds parameters for DisposableEmailApi.isDisposable request invocation.
 **/   
public class DisposableEmailIsDisposableRequest
{
    /**
     * Initializes a new instance of the DisposableEmailIsDisposableRequest class.
     **/
    public DisposableEmailIsDisposableRequest()
    {
    }

    /**
     * Initializes a new instance of the DisposableEmailIsDisposableRequest class.   
     * @param address An email address to check
     **/
    public DisposableEmailIsDisposableRequest(String address)             
    {
        this.address = address;
    }
        
    private String address;

    /**
     * Getter for: An email address to check
     **/
    public String getAddress() {
        return address;
    }

    /**
     * Setter for: An email address to check
     **/
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Setter for: An email address to check
     **/
    public DisposableEmailIsDisposableRequest address(String value) {
        this.address = value;
        return this;
    }

}


