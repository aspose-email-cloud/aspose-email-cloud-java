/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="DiscoverEmailConfigRequestBuilder.java">
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
 *  DiscoverEmailConfigRequest builder.
 */
public class DiscoverEmailConfigRequestBuilder {
    private DiscoverEmailConfigRequest model;
    public DiscoverEmailConfigRequestBuilder(DiscoverEmailConfigRequest model) {
        this.model = model;
    }

    /**
     * Build DiscoverEmailConfigRequest instance.
     */
    public DiscoverEmailConfigRequest build() {
        DiscoverEmailConfigRequest tempModel = model;
        model = null;
        return tempModel;
    }
    /**
     * Set DiscoverEmailConfigRequest.address and return builder.
     * @param address Email address to discover.             
     * @return builder
    **/
    public DiscoverEmailConfigRequestBuilder address(String address) {
        this.model.address(address);
        return this;
    }
    /**
     * Set DiscoverEmailConfigRequest.fastProcessing and return builder.
     * @param fastProcessing Turns on fast processing. All discover systems will run in parallel. First discovered result will be returned.             
     * @return builder
    **/
    public DiscoverEmailConfigRequestBuilder fastProcessing(Boolean fastProcessing) {
        this.model.fastProcessing(fastProcessing);
        return this;
    }
    /**
     * Set DiscoverEmailConfigRequest.login and return builder.
     * @param login Email account login. If not specified, address used as a login.             
     * @return builder
    **/
    public DiscoverEmailConfigRequestBuilder login(String login) {
        this.model.login(login);
        return this;
    }
}
