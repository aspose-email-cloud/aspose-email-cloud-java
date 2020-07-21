
/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="AiNameApi.java">
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
package com.aspose.email.cloud.sdk.api;

import com.aspose.email.cloud.sdk.model.*;
import com.aspose.email.cloud.sdk.invoker.*;
import com.aspose.email.cloud.sdk.invoker.internal.*;
import java.io.*;

import java.util.HashMap;

/**
 * AiNameApi operations.
 */
public class AiNameApi 
{
    /**
     * The configuration
     */
    private final Configuration Configuration;
    
    /**
     * The API invoker
     */
    private final ApiInvoker apiInvoker;
       
    AiNameApi(ApiInvoker apiInvoker, Configuration configuration) {
        this.Configuration = configuration;
        this.apiInvoker = apiInvoker;
    }

            
    /**
     * The call proposes k most probable names for given starting characters             
     * 
     * @param request Holds parameters for this request invocation.
     * @return AiNameWeightedVariants
     * @throws ApiException API error.
     */
    public AiNameWeightedVariants complete(AiNameCompleteRequest request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.name' is set
        if (request.name== null) {
            throw new ApiException(400, "Missing the required parameter 'request.name' when calling complete");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/AiName/complete";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "name", request.name);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "language", request.language);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "location", request.location);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "encoding", request.encoding);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "script", request.script);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "style", request.style);
        
        
        byte[] response = this.apiInvoker.invokeApi(
            resourcePath, 
            "GET", 
            null, 
            null, 
            formParams);
            
        
        if (response == null)
        {
            return null;
        }
        
        return SerializationHelper.deserialize(new String(response), AiNameWeightedVariants.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }

            
    /**
     * Expands a person&#39;s name into a list of possible alternatives using options for expanding instructions             
     * 
     * @param request Holds parameters for this request invocation.
     * @return AiNameWeightedVariants
     * @throws ApiException API error.
     */
    public AiNameWeightedVariants expand(AiNameExpandRequest request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.name' is set
        if (request.name== null) {
            throw new ApiException(400, "Missing the required parameter 'request.name' when calling expand");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/AiName/expand";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "name", request.name);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "language", request.language);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "location", request.location);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "encoding", request.encoding);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "script", request.script);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "style", request.style);
        
        
        byte[] response = this.apiInvoker.invokeApi(
            resourcePath, 
            "GET", 
            null, 
            null, 
            formParams);
            
        
        if (response == null)
        {
            return null;
        }
        
        return SerializationHelper.deserialize(new String(response), AiNameWeightedVariants.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }

            
    /**
     * Expands a person&#39;s parsed name into a list of possible alternatives using options for expanding instructions             
     * 
     * @param request Parsed name with options
     * @return AiNameWeightedVariants
     * @throws ApiException API error.
     */
    public AiNameWeightedVariants expandParsed(
        AiNameParsedRequest request) throws ApiException 
    {
      try {
         // verify the required parameter 'request' is set
        if (request== null) {
            throw new ApiException(400, "Missing the required parameter 'request' when calling expandParsed");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/AiName/expand-parsed";
        String postBody = null;
        
        postBody = SerializationHelper.serialize(request);
        byte[] response = this.apiInvoker.invokeApi(
            resourcePath, 
            "POST", 
            postBody, 
            null, 
            null);
            
        
        if (response == null)
        {
            return null;
        }
        
        return SerializationHelper.deserialize(new String(response), AiNameWeightedVariants.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }

            
    /**
     * Formats a person&#39;s name in correct case and name order using options for formatting instructions             
     * 
     * @param request Holds parameters for this request invocation.
     * @return AiNameFormatted
     * @throws ApiException API error.
     */
    public AiNameFormatted format(AiNameFormatRequest request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.name' is set
        if (request.name== null) {
            throw new ApiException(400, "Missing the required parameter 'request.name' when calling format");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/AiName/format";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "name", request.name);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "language", request.language);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "location", request.location);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "encoding", request.encoding);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "script", request.script);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "format", request.format);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "style", request.style);
        
        
        byte[] response = this.apiInvoker.invokeApi(
            resourcePath, 
            "GET", 
            null, 
            null, 
            formParams);
            
        
        if (response == null)
        {
            return null;
        }
        
        return SerializationHelper.deserialize(new String(response), AiNameFormatted.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }

            
    /**
     * Formats a person&#39;s parsed name in correct case and name order using options for formatting instructions             
     * 
     * @param request Parsed name with options
     * @return AiNameFormatted
     * @throws ApiException API error.
     */
    public AiNameFormatted formatParsed(
        AiNameParsedRequest request) throws ApiException 
    {
      try {
         // verify the required parameter 'request' is set
        if (request== null) {
            throw new ApiException(400, "Missing the required parameter 'request' when calling formatParsed");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/AiName/format-parsed";
        String postBody = null;
        
        postBody = SerializationHelper.serialize(request);
        byte[] response = this.apiInvoker.invokeApi(
            resourcePath, 
            "POST", 
            postBody, 
            null, 
            null);
            
        
        if (response == null)
        {
            return null;
        }
        
        return SerializationHelper.deserialize(new String(response), AiNameFormatted.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }

            
    /**
     * Detect person&#39;s gender from name string             
     * 
     * @param request Holds parameters for this request invocation.
     * @return AiNameGenderHypothesisList
     * @throws ApiException API error.
     */
    public AiNameGenderHypothesisList genderize(AiNameGenderizeRequest request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.name' is set
        if (request.name== null) {
            throw new ApiException(400, "Missing the required parameter 'request.name' when calling genderize");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/AiName/genderize";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "name", request.name);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "language", request.language);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "location", request.location);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "encoding", request.encoding);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "script", request.script);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "style", request.style);
        
        
        byte[] response = this.apiInvoker.invokeApi(
            resourcePath, 
            "GET", 
            null, 
            null, 
            formParams);
            
        
        if (response == null)
        {
            return null;
        }
        
        return SerializationHelper.deserialize(new String(response), AiNameGenderHypothesisList.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }

            
    /**
     * Detect person&#39;s gender from parsed name             
     * 
     * @param request Gender detection request data
     * @return AiNameGenderHypothesisList
     * @throws ApiException API error.
     */
    public AiNameGenderHypothesisList genderizeParsed(
        AiNameParsedRequest request) throws ApiException 
    {
      try {
         // verify the required parameter 'request' is set
        if (request== null) {
            throw new ApiException(400, "Missing the required parameter 'request' when calling genderizeParsed");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/AiName/genderize-parsed";
        String postBody = null;
        
        postBody = SerializationHelper.serialize(request);
        byte[] response = this.apiInvoker.invokeApi(
            resourcePath, 
            "POST", 
            postBody, 
            null, 
            null);
            
        
        if (response == null)
        {
            return null;
        }
        
        return SerializationHelper.deserialize(new String(response), AiNameGenderHypothesisList.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }

            
    /**
     * Compare people&#39;s names. Uses options for comparing instructions             
     * 
     * @param request Holds parameters for this request invocation.
     * @return AiNameMatchResult
     * @throws ApiException API error.
     */
    public AiNameMatchResult match(AiNameMatchRequest request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.name' is set
        if (request.name== null) {
            throw new ApiException(400, "Missing the required parameter 'request.name' when calling match");
        }
         // verify the required parameter 'request.otherName' is set
        if (request.otherName== null) {
            throw new ApiException(400, "Missing the required parameter 'request.otherName' when calling match");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/AiName/match";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "name", request.name);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "otherName", request.otherName);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "language", request.language);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "location", request.location);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "encoding", request.encoding);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "script", request.script);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "style", request.style);
        
        
        byte[] response = this.apiInvoker.invokeApi(
            resourcePath, 
            "GET", 
            null, 
            null, 
            formParams);
            
        
        if (response == null)
        {
            return null;
        }
        
        return SerializationHelper.deserialize(new String(response), AiNameMatchResult.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }

            
    /**
     * Compare people&#39;s parsed names and attributes. Uses options for comparing instructions             
     * 
     * @param request Parsed names to match
     * @return AiNameMatchResult
     * @throws ApiException API error.
     */
    public AiNameMatchResult matchParsed(
        AiNameParsedMatchRequest request) throws ApiException 
    {
      try {
         // verify the required parameter 'request' is set
        if (request== null) {
            throw new ApiException(400, "Missing the required parameter 'request' when calling matchParsed");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/AiName/match-parsed";
        String postBody = null;
        
        postBody = SerializationHelper.serialize(request);
        byte[] response = this.apiInvoker.invokeApi(
            resourcePath, 
            "POST", 
            postBody, 
            null, 
            null);
            
        
        if (response == null)
        {
            return null;
        }
        
        return SerializationHelper.deserialize(new String(response), AiNameMatchResult.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }

            
    /**
     * Parse name to components             
     * 
     * @param request Holds parameters for this request invocation.
     * @return AiNameComponentList
     * @throws ApiException API error.
     */
    public AiNameComponentList parse(AiNameParseRequest request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.name' is set
        if (request.name== null) {
            throw new ApiException(400, "Missing the required parameter 'request.name' when calling parse");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/AiName/parse";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "name", request.name);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "language", request.language);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "location", request.location);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "encoding", request.encoding);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "script", request.script);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "style", request.style);
        
        
        byte[] response = this.apiInvoker.invokeApi(
            resourcePath, 
            "GET", 
            null, 
            null, 
            formParams);
            
        
        if (response == null)
        {
            return null;
        }
        
        return SerializationHelper.deserialize(new String(response), AiNameComponentList.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }

            
    /**
     * Parse person&#39;s name out of an email address             
     * 
     * @param request Holds parameters for this request invocation.
     * @return AiNameExtractedList
     * @throws ApiException API error.
     */
    public AiNameExtractedList parseEmailAddress(AiNameParseEmailAddressRequest request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.emailAddress' is set
        if (request.emailAddress== null) {
            throw new ApiException(400, "Missing the required parameter 'request.emailAddress' when calling parseEmailAddress");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/AiName/parse-email-address";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "emailAddress", request.emailAddress);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "language", request.language);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "location", request.location);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "encoding", request.encoding);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "script", request.script);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "style", request.style);
        
        
        byte[] response = this.apiInvoker.invokeApi(
            resourcePath, 
            "GET", 
            null, 
            null, 
            formParams);
            
        
        if (response == null)
        {
            return null;
        }
        
        return SerializationHelper.deserialize(new String(response), AiNameExtractedList.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }

}

