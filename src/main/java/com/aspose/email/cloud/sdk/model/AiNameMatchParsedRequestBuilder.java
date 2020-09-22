/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="AiNameMatchParsedRequestBuilder.java">
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

import java.util.List;

/**
 *  AiNameMatchParsedRequest builder.
 */
public class AiNameMatchParsedRequestBuilder {
    private final AiNameMatchParsedRequest model;
    public AiNameMatchParsedRequestBuilder(AiNameMatchParsedRequest model) {
        this.model = model;
    }

    public AiNameMatchParsedRequest build() {
        return model;
    }
    public AiNameMatchParsedRequestBuilder culturalContext(AiNameCulturalContext culturalContext) {
        this.model.culturalContext(culturalContext);
        return this;
    }
    public AiNameMatchParsedRequestBuilder format(String format) {
        this.model.format(format);
        return this;
    }
    public AiNameMatchParsedRequestBuilder parsedName(List<AiNameComponent> parsedName) {
        this.model.parsedName(parsedName);
        return this;
    }
    public AiNameMatchParsedRequestBuilder otherParsedName(List<AiNameComponent> otherParsedName) {
        this.model.otherParsedName(otherParsedName);
        return this;
    }
}
