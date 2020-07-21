/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="EmailCloud.java">
*   Copyright (c) 2020 Aspose Pty Ltd. All rights reserved.
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

package com.aspose.email.cloud.sdk.api;

import com.aspose.email.cloud.sdk.model.*;
import com.aspose.email.cloud.sdk.invoker.*;
import com.aspose.email.cloud.sdk.invoker.internal.*;
import com.aspose.email.cloud.sdk.invoker.internal.requesthandlers.*;
import java.io.*;

import java.util.HashMap;

/**
 * AI powered operations.             
 */
public class AiGroup {

    private final AiBcrApi bcr;

    private final AiNameApi name;



    /**
     *  AI Business card recognition operations.             
     */
    public AiBcrApi bcr() {
        return bcr;
    }

    /**
     *  AI Name operations.             
     */
    public AiNameApi name() {
        return name;
    }


    AiGroup(ApiInvoker apiInvoker, Configuration configuration)
    {
    
        bcr = new AiBcrApi(apiInvoker, configuration);
    
        name = new AiNameApi(apiInvoker, configuration);
    
    }
}
