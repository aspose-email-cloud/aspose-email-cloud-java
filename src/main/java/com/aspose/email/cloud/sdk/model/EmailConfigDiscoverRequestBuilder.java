/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="EmailConfigDiscoverRequestBuilder.java">
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
 *  EmailConfigDiscoverRequest builder.
 */
public class EmailConfigDiscoverRequestBuilder {
    private EmailConfigDiscoverRequest model;
    public EmailConfigDiscoverRequestBuilder(EmailConfigDiscoverRequest model) {
        this.model = model;
    }

    /**
     * Build EmailConfigDiscoverRequest instance.
     */
    public EmailConfigDiscoverRequest build() {
        EmailConfigDiscoverRequest tempModel = model;
        model = null;
        return tempModel;
    }

    /**
     * Setter for: Email address.
     **/
    public EmailConfigDiscoverRequestBuilder address(String address) {
        this.model.address(address);
        return this;
    }
    /**
     * Setter for: Turns on fast processing. All discover systems will run in parallel. First discovered result will be returned.             
     **/
    public EmailConfigDiscoverRequestBuilder fastProcessing(Boolean fastProcessing) {
        this.model.fastProcessing(fastProcessing);
        return this;
    }
}
