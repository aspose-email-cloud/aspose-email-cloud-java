/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="EmailConfigDiscoverPasswordRequestBuilder.java">
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
 *  EmailConfigDiscoverPasswordRequest builder.
 */
public class EmailConfigDiscoverPasswordRequestBuilder {
    private final EmailConfigDiscoverPasswordRequest model;
    public EmailConfigDiscoverPasswordRequestBuilder(EmailConfigDiscoverPasswordRequest model) {
        this.model = model;
    }

    /**
     * Build EmailConfigDiscoverPasswordRequest instance.
     */
    public EmailConfigDiscoverPasswordRequest build() {
        return model;
    }
    /**
     * Set EmailConfigDiscoverPasswordRequest.address and return builder.
     * @param address Email address to discover.             
     * @return builder
    **/
    public EmailConfigDiscoverPasswordRequestBuilder address(String address) {
        this.model.address(address);
        return this;
    }
    /**
     * Set EmailConfigDiscoverPasswordRequest.fastProcessing and return builder.
     * @param fastProcessing Turns on fast processing. All discover systems will run in parallel. First discovered result will be returned.             
     * @return builder
    **/
    public EmailConfigDiscoverPasswordRequestBuilder fastProcessing(Boolean fastProcessing) {
        this.model.fastProcessing(fastProcessing);
        return this;
    }
    /**
     * Set EmailConfigDiscoverPasswordRequest.login and return builder.
     * @param login Email account login. If not specified, address used as a login.             
     * @return builder
    **/
    public EmailConfigDiscoverPasswordRequestBuilder login(String login) {
        this.model.login(login);
        return this;
    }
    /**
     * Set EmailConfigDiscoverPasswordRequest.password and return builder.
     * @param password Email account password.             
     * @return builder
    **/
    public EmailConfigDiscoverPasswordRequestBuilder password(String password) {
        this.model.password(password);
        return this;
    }
}
