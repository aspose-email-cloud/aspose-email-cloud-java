
/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="EmailApi.java">
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
import com.aspose.email.cloud.sdk.model.requests.*;
import com.aspose.email.cloud.sdk.invoker.*;
import com.aspose.email.cloud.sdk.invoker.internal.*;
import com.aspose.email.cloud.sdk.invoker.internal.requesthandlers.*;
import java.io.*;

import java.util.HashMap;

/**
 * Aspose.Email Cloud API
 */
public class EmailApi 
{
    /**
     * Current SDK version
     */
    public static final String Version = "19.9";

    /**
     * The configuration
     */
    public Configuration Configuration;
    
    /**
     * The API invoker
     */
    private ApiInvoker apiInvoker;
       
    /**
     * Initializes a new instance of the EmailApi class for on-premise deployment service usage.
     *  @param baseUrl The base URL.
     */
    public EmailApi(String baseUrl)
    {
        Configuration config = new Configuration();
        config.setApiBaseUrl(baseUrl);
        config.OnPremise = true;
        this.initEmailApi(config);
    }

    /**
     * Initializes a new instance of the EmailApi class for Aspose Cloud-hosted service usage.
     * @param appKey The app key.
     * @param appSid The app SID.
     */
    public EmailApi(String appKey, String appSid)
    {
        Configuration config = new Configuration();
        config.AppKey = appKey;
        config.AppSid = appSid;
        this.initEmailApi(config);
    }
    
    /**
     * Initializes a new instance of the EmailApi class for on-premise deployment service usage.
     *  @param baseUrl The base URL.
     *  @param apiVersion API version.
     *  @param debug If debug mode is enabled.
     * @throws ApiException 
     */
    public EmailApi(String baseUrl, String apiVersion, Boolean debugMode) throws ApiException
    {
        try {
            Configuration config = new Configuration();
            config.setApiBaseUrl(baseUrl);
            config.setApiVersion(apiVersion);
            config.setDebugMode(debugMode);
            config.OnPremise = true;
            this.initEmailApi(config);
        } catch(ApiException exception) {
            throw exception;
        } catch(Exception exception) {
            throw new ApiException(400, exception.getMessage());
        }
    }

    /**
     * Initializes a new instance of the EmailApi class for Aspose Cloud-hosted service usage.
     * @param appKey The app key.
     * @param appSid The app SID.
     * @param baseUrl The base URL.
     */
    public EmailApi(String appKey, String appSid, String baseUrl)
    {
        Configuration config = new Configuration();
        config.AppKey = appKey;
        config.AppSid = appSid;
        config.setApiBaseUrl(baseUrl);
        this.initEmailApi(config);
    }

    /**
     * Initializes a new instance of the EmailApi class for Aspose Cloud-hosted service usage.
     * @param appKey The app key.
     * @param appSid The app SID.
     * @param baseUrl The base URL.
     * @param apiVersion API version.
     */
    public EmailApi(String appKey, String appSid, String baseUrl, String apiVersion) throws ApiException
    {
        try {
            Configuration config = new Configuration();
            config.AppKey = appKey;
            config.AppSid = appSid;
            config.setApiBaseUrl(baseUrl);
            config.setApiVersion(apiVersion);
            this.initEmailApi(config);
        } catch(ApiException exception) {
            throw exception;
        } catch(Exception exception) {
            throw new ApiException(400, exception.getMessage());
        }
    }

    /**
     * Initializes a new instance of the EmailApi class for Aspose Cloud-hosted service usage.
     * @param appKey The app key.
     * @param appSid The app SID.
     * @param baseUrl The base URL.
     * @param apiVersion API version.
     * @param debug If debug mode is enabled.
     */
    public EmailApi(String appKey, String appSid, String baseUrl, String apiVersion, Boolean debug) throws ApiException
    {
        try {
            Configuration config = new Configuration();
            config.AppKey = appKey;
            config.AppSid = appSid;
            config.setApiBaseUrl(baseUrl);
            config.setApiVersion(apiVersion);
            config.setDebugMode(debug);
            this.initEmailApi(config);
        } catch(ApiException exception) {
            throw exception;
        } catch(Exception exception) {
            throw new ApiException(400, exception.getMessage());
        }
    }

    /**
     * Initializes a new instance of the EmailApi class for Aspose Cloud-hosted service usage.
     * @param appKey The app key.
     * @param appSid The app SID.
     * @param baseUrl The base URL.
     * @param apiVersion API version.
     * @param debug If debug mode is enabled.
     * @param authUrl should not be used.
     */
    public EmailApi(String appKey, String appSid, String baseUrl, String apiVersion, Boolean debug, String authUrl) throws ApiException
    {
        try {
            Configuration config = new Configuration();
            config.AppKey = appKey;
            config.AppSid = appSid;
            config.setApiBaseUrl(baseUrl);
            config.setApiVersion(apiVersion);
            config.setDebugMode(debug);
            config.setAuthUrl(authUrl);
            this.initEmailApi(config);
        } catch(ApiException exception) {
            throw exception;
        } catch(Exception exception) {
            throw new ApiException(400, exception.getMessage());
        }
    }
    
    /**
     * Initializes a new instance of the EmailApi class.
     * @param configuration Configuration settings.
     */
    private void initEmailApi(Configuration configuration)
    {
        this.Configuration = configuration;
        int handlersCount = configuration.OnPremise ? 2 : 3;
        IRequestHandler[] requestHandlers = new IRequestHandler[handlersCount];
        requestHandlers[--handlersCount] = new ApiExceptionRequestHandler();
        requestHandlers[--handlersCount] = new DebugLogRequestHandler(this.Configuration);
        if (!configuration.OnPremise)
        {
            requestHandlers[--handlersCount] = new AuthRequestHandler(this.Configuration);
        }
        
        this.apiInvoker = new ApiInvoker(requestHandlers, this.Configuration);
    }
    
    /**
     * Adds an attachment to iCalendar file             
     * 
     * @param request Holds parameters for this request invocation.
     * @throws ApiException 
     */
    public void addCalendarAttachment(AddCalendarAttachmentRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.name' is set
        if (request.name== null) {
            throw new ApiException(400, "Missing the required parameter 'request.name' when calling addCalendarAttachment");
        }
         // verify the required parameter 'request.attachment' is set
        if (request.attachment== null) {
            throw new ApiException(400, "Missing the required parameter 'request.attachment' when calling addCalendarAttachment");
        }
         // verify the required parameter 'request.request' is set
        if (request.request== null) {
            throw new ApiException(400, "Missing the required parameter 'request.request' when calling addCalendarAttachment");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/Calendar/{name}/attachments/{attachment}";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
        resourcePath = UrlHelper.addPathParameter(resourcePath, "attachment", request.attachment);
        
        
        String postBody = null;
        
        postBody = SerializationHelper.serialize(request.request);
        
        this.apiInvoker.invokeApi(
            resourcePath, 
            "PUT", 
            postBody, 
            null, 
            formParams);
            
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Add attachment to contact document             
     * 
     * @param request Holds parameters for this request invocation.
     * @throws ApiException 
     */
    public void addContactAttachment(AddContactAttachmentRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.format' is set
        if (request.format== null) {
            throw new ApiException(400, "Missing the required parameter 'request.format' when calling addContactAttachment");
        }
         // verify the required parameter 'request.name' is set
        if (request.name== null) {
            throw new ApiException(400, "Missing the required parameter 'request.name' when calling addContactAttachment");
        }
         // verify the required parameter 'request.attachment' is set
        if (request.attachment== null) {
            throw new ApiException(400, "Missing the required parameter 'request.attachment' when calling addContactAttachment");
        }
         // verify the required parameter 'request.request' is set
        if (request.request== null) {
            throw new ApiException(400, "Missing the required parameter 'request.request' when calling addContactAttachment");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/Contact/{format}/{name}/attachments/{attachment}";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "format", request.format);
        resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
        resourcePath = UrlHelper.addPathParameter(resourcePath, "attachment", request.attachment);
        
        
        String postBody = null;
        
        postBody = SerializationHelper.serialize(request.request);
        
        this.apiInvoker.invokeApi(
            resourcePath, 
            "PUT", 
            postBody, 
            null, 
            formParams);
            
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Adds an attachment to Email document             
     * 
     * @param request Holds parameters for this request invocation.
     * @return EmailDocumentResponse
     * @throws ApiException 
     */
    public EmailDocumentResponse addEmailAttachment(AddEmailAttachmentRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.attachmentName' is set
        if (request.attachmentName== null) {
            throw new ApiException(400, "Missing the required parameter 'request.attachmentName' when calling addEmailAttachment");
        }
         // verify the required parameter 'request.fileName' is set
        if (request.fileName== null) {
            throw new ApiException(400, "Missing the required parameter 'request.fileName' when calling addEmailAttachment");
        }
         // verify the required parameter 'request.request' is set
        if (request.request== null) {
            throw new ApiException(400, "Missing the required parameter 'request.request' when calling addEmailAttachment");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/{fileName}/attachments/{attachmentName}";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "attachmentName", request.attachmentName);
        resourcePath = UrlHelper.addPathParameter(resourcePath, "fileName", request.fileName);
        
        
        String postBody = null;
        
        postBody = SerializationHelper.serialize(request.request);
        
        byte[] response = this.apiInvoker.invokeApi(
            resourcePath, 
            "POST", 
            postBody, 
            null, 
            formParams);
            
        
        if (response == null)
        {
            return null;
        }
        
        return SerializationHelper.deserialize(new String(response), EmailDocumentResponse.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Add attachment to document             
     * 
     * @param request Holds parameters for this request invocation.
     * @throws ApiException 
     */
    public void addMapiAttachment(AddMapiAttachmentRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.name' is set
        if (request.name== null) {
            throw new ApiException(400, "Missing the required parameter 'request.name' when calling addMapiAttachment");
        }
         // verify the required parameter 'request.attachment' is set
        if (request.attachment== null) {
            throw new ApiException(400, "Missing the required parameter 'request.attachment' when calling addMapiAttachment");
        }
         // verify the required parameter 'request.request' is set
        if (request.request== null) {
            throw new ApiException(400, "Missing the required parameter 'request.request' when calling addMapiAttachment");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/Mapi/{name}/attachments/{attachment}";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
        resourcePath = UrlHelper.addPathParameter(resourcePath, "attachment", request.attachment);
        
        
        String postBody = null;
        
        postBody = SerializationHelper.serialize(request.request);
        
        this.apiInvoker.invokeApi(
            resourcePath, 
            "PUT", 
            postBody, 
            null, 
            formParams);
            
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Ocr images             
     * 
     * @param request Holds parameters for this request invocation.
     * @return ListResponseOfAiBcrOcrData
     * @throws ApiException 
     */
    public ListResponseOfAiBcrOcrData aiBcrOcr(AiBcrOcrRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.rq' is set
        if (request.rq== null) {
            throw new ApiException(400, "Missing the required parameter 'request.rq' when calling aiBcrOcr");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/AiBcr/ocr";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        
        String postBody = null;
        
        postBody = SerializationHelper.serialize(request.rq);
        
        byte[] response = this.apiInvoker.invokeApi(
            resourcePath, 
            "POST", 
            postBody, 
            null, 
            formParams);
            
        
        if (response == null)
        {
            return null;
        }
        
        return SerializationHelper.deserialize(new String(response), ListResponseOfAiBcrOcrData.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Ocr images from storage             
     * 
     * @param request Holds parameters for this request invocation.
     * @return ListResponseOfAiBcrOcrData
     * @throws ApiException 
     */
    public ListResponseOfAiBcrOcrData aiBcrOcrStorage(AiBcrOcrStorageRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.rq' is set
        if (request.rq== null) {
            throw new ApiException(400, "Missing the required parameter 'request.rq' when calling aiBcrOcrStorage");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/AiBcr/ocr-storage";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        
        String postBody = null;
        
        postBody = SerializationHelper.serialize(request.rq);
        
        byte[] response = this.apiInvoker.invokeApi(
            resourcePath, 
            "POST", 
            postBody, 
            null, 
            formParams);
            
        
        if (response == null)
        {
            return null;
        }
        
        return SerializationHelper.deserialize(new String(response), ListResponseOfAiBcrOcrData.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Parse images to vCard properties             
     * 
     * @param request Holds parameters for this request invocation.
     * @return ListResponseOfHierarchicalObject
     * @throws ApiException 
     */
    public ListResponseOfHierarchicalObject aiBcrParse(AiBcrParseRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.rq' is set
        if (request.rq== null) {
            throw new ApiException(400, "Missing the required parameter 'request.rq' when calling aiBcrParse");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/AiBcr/parse";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        
        String postBody = null;
        
        postBody = SerializationHelper.serialize(request.rq);
        
        byte[] response = this.apiInvoker.invokeApi(
            resourcePath, 
            "POST", 
            postBody, 
            null, 
            formParams);
            
        
        if (response == null)
        {
            return null;
        }
        
        return SerializationHelper.deserialize(new String(response), ListResponseOfHierarchicalObject.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Parse images to vCard document models             
     * 
     * @param request Holds parameters for this request invocation.
     * @return ListResponseOfContactDto
     * @throws ApiException 
     */
    public ListResponseOfContactDto aiBcrParseModel(AiBcrParseModelRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.rq' is set
        if (request.rq== null) {
            throw new ApiException(400, "Missing the required parameter 'request.rq' when calling aiBcrParseModel");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/AiBcr/parse-model";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        
        String postBody = null;
        
        postBody = SerializationHelper.serialize(request.rq);
        
        byte[] response = this.apiInvoker.invokeApi(
            resourcePath, 
            "POST", 
            postBody, 
            null, 
            formParams);
            
        
        if (response == null)
        {
            return null;
        }
        
        return SerializationHelper.deserialize(new String(response), ListResponseOfContactDto.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Parse OCR data to vCard document models             
     * 
     * @param request Holds parameters for this request invocation.
     * @return ListResponseOfContactDto
     * @throws ApiException 
     */
    public ListResponseOfContactDto aiBcrParseOcrDataModel(AiBcrParseOcrDataModelRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.rq' is set
        if (request.rq== null) {
            throw new ApiException(400, "Missing the required parameter 'request.rq' when calling aiBcrParseOcrDataModel");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/AiBcr/parse-ocr-data-model";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        
        String postBody = null;
        
        postBody = SerializationHelper.serialize(request.rq);
        
        byte[] response = this.apiInvoker.invokeApi(
            resourcePath, 
            "POST", 
            postBody, 
            null, 
            formParams);
            
        
        if (response == null)
        {
            return null;
        }
        
        return SerializationHelper.deserialize(new String(response), ListResponseOfContactDto.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Parse images from storage to vCard files             
     * 
     * @param request Holds parameters for this request invocation.
     * @return ListResponseOfStorageFileLocation
     * @throws ApiException 
     */
    public ListResponseOfStorageFileLocation aiBcrParseStorage(AiBcrParseStorageRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.rq' is set
        if (request.rq== null) {
            throw new ApiException(400, "Missing the required parameter 'request.rq' when calling aiBcrParseStorage");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/AiBcr/parse-storage";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        
        String postBody = null;
        
        postBody = SerializationHelper.serialize(request.rq);
        
        byte[] response = this.apiInvoker.invokeApi(
            resourcePath, 
            "POST", 
            postBody, 
            null, 
            formParams);
            
        
        if (response == null)
        {
            return null;
        }
        
        return SerializationHelper.deserialize(new String(response), ListResponseOfStorageFileLocation.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * The call proposes k most probable names for given starting characters             
     * 
     * @param request Holds parameters for this request invocation.
     * @return AiNameWeightedVariants
     * @throws ApiException 
     */
    public AiNameWeightedVariants aiNameComplete(AiNameCompleteRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.name' is set
        if (request.name== null) {
            throw new ApiException(400, "Missing the required parameter 'request.name' when calling aiNameComplete");
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
     * @throws ApiException 
     */
    public AiNameWeightedVariants aiNameExpand(AiNameExpandRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.name' is set
        if (request.name== null) {
            throw new ApiException(400, "Missing the required parameter 'request.name' when calling aiNameExpand");
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
     * @param request Holds parameters for this request invocation.
     * @return AiNameWeightedVariants
     * @throws ApiException 
     */
    public AiNameWeightedVariants aiNameExpandParsed(AiNameExpandParsedRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.rq' is set
        if (request.rq== null) {
            throw new ApiException(400, "Missing the required parameter 'request.rq' when calling aiNameExpandParsed");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/AiName/expand-parsed";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        
        String postBody = null;
        
        postBody = SerializationHelper.serialize(request.rq);
        
        byte[] response = this.apiInvoker.invokeApi(
            resourcePath, 
            "POST", 
            postBody, 
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
     * Formats a person&#39;s name in correct case and name order using options for formatting instructions             
     * 
     * @param request Holds parameters for this request invocation.
     * @return AiNameFormatted
     * @throws ApiException 
     */
    public AiNameFormatted aiNameFormat(AiNameFormatRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.name' is set
        if (request.name== null) {
            throw new ApiException(400, "Missing the required parameter 'request.name' when calling aiNameFormat");
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
     * @param request Holds parameters for this request invocation.
     * @return AiNameFormatted
     * @throws ApiException 
     */
    public AiNameFormatted aiNameFormatParsed(AiNameFormatParsedRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.rq' is set
        if (request.rq== null) {
            throw new ApiException(400, "Missing the required parameter 'request.rq' when calling aiNameFormatParsed");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/AiName/format-parsed";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        
        String postBody = null;
        
        postBody = SerializationHelper.serialize(request.rq);
        
        byte[] response = this.apiInvoker.invokeApi(
            resourcePath, 
            "POST", 
            postBody, 
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
     * Detect person&#39;s gender from name string             
     * 
     * @param request Holds parameters for this request invocation.
     * @return ListResponseOfAiNameGenderHypothesis
     * @throws ApiException 
     */
    public ListResponseOfAiNameGenderHypothesis aiNameGenderize(AiNameGenderizeRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.name' is set
        if (request.name== null) {
            throw new ApiException(400, "Missing the required parameter 'request.name' when calling aiNameGenderize");
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
        
        return SerializationHelper.deserialize(new String(response), ListResponseOfAiNameGenderHypothesis.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Detect person&#39;s gender from parsed name             
     * 
     * @param request Holds parameters for this request invocation.
     * @return ListResponseOfAiNameGenderHypothesis
     * @throws ApiException 
     */
    public ListResponseOfAiNameGenderHypothesis aiNameGenderizeParsed(AiNameGenderizeParsedRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.rq' is set
        if (request.rq== null) {
            throw new ApiException(400, "Missing the required parameter 'request.rq' when calling aiNameGenderizeParsed");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/AiName/genderize-parsed";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        
        String postBody = null;
        
        postBody = SerializationHelper.serialize(request.rq);
        
        byte[] response = this.apiInvoker.invokeApi(
            resourcePath, 
            "POST", 
            postBody, 
            null, 
            formParams);
            
        
        if (response == null)
        {
            return null;
        }
        
        return SerializationHelper.deserialize(new String(response), ListResponseOfAiNameGenderHypothesis.class);
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
     * @throws ApiException 
     */
    public AiNameMatchResult aiNameMatch(AiNameMatchRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.name' is set
        if (request.name== null) {
            throw new ApiException(400, "Missing the required parameter 'request.name' when calling aiNameMatch");
        }
         // verify the required parameter 'request.otherName' is set
        if (request.otherName== null) {
            throw new ApiException(400, "Missing the required parameter 'request.otherName' when calling aiNameMatch");
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
     * @param request Holds parameters for this request invocation.
     * @return AiNameMatchResult
     * @throws ApiException 
     */
    public AiNameMatchResult aiNameMatchParsed(AiNameMatchParsedRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.rq' is set
        if (request.rq== null) {
            throw new ApiException(400, "Missing the required parameter 'request.rq' when calling aiNameMatchParsed");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/AiName/match-parsed";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        
        String postBody = null;
        
        postBody = SerializationHelper.serialize(request.rq);
        
        byte[] response = this.apiInvoker.invokeApi(
            resourcePath, 
            "POST", 
            postBody, 
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
     * Parse name to components             
     * 
     * @param request Holds parameters for this request invocation.
     * @return ListResponseOfAiNameComponent
     * @throws ApiException 
     */
    public ListResponseOfAiNameComponent aiNameParse(AiNameParseRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.name' is set
        if (request.name== null) {
            throw new ApiException(400, "Missing the required parameter 'request.name' when calling aiNameParse");
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
        
        return SerializationHelper.deserialize(new String(response), ListResponseOfAiNameComponent.class);
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
     * @return ListResponseOfAiNameExtracted
     * @throws ApiException 
     */
    public ListResponseOfAiNameExtracted aiNameParseEmailAddress(AiNameParseEmailAddressRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.emailAddress' is set
        if (request.emailAddress== null) {
            throw new ApiException(400, "Missing the required parameter 'request.emailAddress' when calling aiNameParseEmailAddress");
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
        
        return SerializationHelper.deserialize(new String(response), ListResponseOfAiNameExtracted.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Adds an email from *.eml file to specified folder in email account             
     * 
     * @param request Holds parameters for this request invocation.
     * @return EmailPropertyResponse
     * @throws ApiException 
     */
    public EmailPropertyResponse appendEmailMessage(AppendEmailMessageRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.request' is set
        if (request.request== null) {
            throw new ApiException(400, "Missing the required parameter 'request.request' when calling appendEmailMessage");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/client/Append";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        
        String postBody = null;
        
        postBody = SerializationHelper.serialize(request.request);
        
        byte[] response = this.apiInvoker.invokeApi(
            resourcePath, 
            "PUT", 
            postBody, 
            null, 
            formParams);
            
        
        if (response == null)
        {
            return null;
        }
        
        return SerializationHelper.deserialize(new String(response), EmailPropertyResponse.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Adds an email from model to specified folder in email account             
     * 
     * @param request Holds parameters for this request invocation.
     * @return ValueResponse
     * @throws ApiException 
     */
    public ValueResponse appendEmailModelMessage(AppendEmailModelMessageRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.rq' is set
        if (request.rq== null) {
            throw new ApiException(400, "Missing the required parameter 'request.rq' when calling appendEmailModelMessage");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/client/AppendModel";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        
        String postBody = null;
        
        postBody = SerializationHelper.serialize(request.rq);
        
        byte[] response = this.apiInvoker.invokeApi(
            resourcePath, 
            "PUT", 
            postBody, 
            null, 
            formParams);
            
        
        if (response == null)
        {
            return null;
        }
        
        return SerializationHelper.deserialize(new String(response), ValueResponse.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Adds an email from MIME to specified folder in email account             
     * 
     * @param request Holds parameters for this request invocation.
     * @return ValueResponse
     * @throws ApiException 
     */
    public ValueResponse appendMimeMessage(AppendMimeMessageRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.request' is set
        if (request.request== null) {
            throw new ApiException(400, "Missing the required parameter 'request.request' when calling appendMimeMessage");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/client/AppendMime";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        
        String postBody = null;
        
        postBody = SerializationHelper.serialize(request.request);
        
        byte[] response = this.apiInvoker.invokeApi(
            resourcePath, 
            "PUT", 
            postBody, 
            null, 
            formParams);
            
        
        if (response == null)
        {
            return null;
        }
        
        return SerializationHelper.deserialize(new String(response), ValueResponse.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Converts calendar document to specified format and returns as file             
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws ApiException 
     */
    public byte[] convertCalendar(ConvertCalendarRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.format' is set
        if (request.format== null) {
            throw new ApiException(400, "Missing the required parameter 'request.format' when calling convertCalendar");
        }
         // verify the required parameter 'request.file' is set
        if (request.File== null) {
            throw new ApiException(400, "Missing the required parameter 'request.file' when calling convertCalendar");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/CalendarModel/convert/{format}";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "format", request.format);
        
        
                if (request.File != null) 
        {
            formParams.put("file", this.apiInvoker.toFileInfo(request.File, "File"));
        }
        byte[] response = this.apiInvoker.invokeApi(
            resourcePath, 
            "PUT", 
            null, 
            null, 
            formParams);
            
        return response;
        
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Convert iCalendar to AlternateView             
     * 
     * @param request Holds parameters for this request invocation.
     * @return AlternateView
     * @throws ApiException 
     */
    public AlternateView convertCalendarModelToAlternate(ConvertCalendarModelToAlternateRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.rq' is set
        if (request.rq== null) {
            throw new ApiException(400, "Missing the required parameter 'request.rq' when calling convertCalendarModelToAlternate");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/CalendarModel/as-alternate";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        
        String postBody = null;
        
        postBody = SerializationHelper.serialize(request.rq);
        
        byte[] response = this.apiInvoker.invokeApi(
            resourcePath, 
            "PUT", 
            postBody, 
            null, 
            formParams);
            
        
        if (response == null)
        {
            return null;
        }
        
        return SerializationHelper.deserialize(new String(response), AlternateView.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Converts calendar model to specified format and returns as file             
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws ApiException 
     */
    public byte[] convertCalendarModelToFile(ConvertCalendarModelToFileRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.format' is set
        if (request.format== null) {
            throw new ApiException(400, "Missing the required parameter 'request.format' when calling convertCalendarModelToFile");
        }
         // verify the required parameter 'request.calendarDto' is set
        if (request.calendarDto== null) {
            throw new ApiException(400, "Missing the required parameter 'request.calendarDto' when calling convertCalendarModelToFile");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/CalendarModel/model-as-file/{format}";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "format", request.format);
        
        
        String postBody = null;
        
        postBody = SerializationHelper.serialize(request.calendarDto);
        
        byte[] response = this.apiInvoker.invokeApi(
            resourcePath, 
            "PUT", 
            postBody, 
            null, 
            formParams);
            
        return response;
        
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Convert CalendarDto to MapiCalendarDto             
     * 
     * @param request Holds parameters for this request invocation.
     * @return MapiCalendarDto
     * @throws ApiException 
     */
    public MapiCalendarDto convertCalendarModelToMapiModel(ConvertCalendarModelToMapiModelRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.calendarDto' is set
        if (request.calendarDto== null) {
            throw new ApiException(400, "Missing the required parameter 'request.calendarDto' when calling convertCalendarModelToMapiModel");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/CalendarModel/model-as-mapi-model";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        
        String postBody = null;
        
        postBody = SerializationHelper.serialize(request.calendarDto);
        
        byte[] response = this.apiInvoker.invokeApi(
            resourcePath, 
            "PUT", 
            postBody, 
            null, 
            formParams);
            
        
        if (response == null)
        {
            return null;
        }
        
        return SerializationHelper.deserialize(new String(response), MapiCalendarDto.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Converts contact document to specified format and returns as file             
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws ApiException 
     */
    public byte[] convertContact(ConvertContactRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.destinationFormat' is set
        if (request.destinationFormat== null) {
            throw new ApiException(400, "Missing the required parameter 'request.destinationFormat' when calling convertContact");
        }
         // verify the required parameter 'request.format' is set
        if (request.format== null) {
            throw new ApiException(400, "Missing the required parameter 'request.format' when calling convertContact");
        }
         // verify the required parameter 'request.file' is set
        if (request.File== null) {
            throw new ApiException(400, "Missing the required parameter 'request.file' when calling convertContact");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/ContactModel/{format}/convert/{destinationFormat}";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "destinationFormat", request.destinationFormat);
        resourcePath = UrlHelper.addPathParameter(resourcePath, "format", request.format);
        
        
                if (request.File != null) 
        {
            formParams.put("file", this.apiInvoker.toFileInfo(request.File, "File"));
        }
        byte[] response = this.apiInvoker.invokeApi(
            resourcePath, 
            "PUT", 
            null, 
            null, 
            formParams);
            
        return response;
        
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Converts contact model to specified format and returns as file             
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws ApiException 
     */
    public byte[] convertContactModelToFile(ConvertContactModelToFileRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.destinationFormat' is set
        if (request.destinationFormat== null) {
            throw new ApiException(400, "Missing the required parameter 'request.destinationFormat' when calling convertContactModelToFile");
        }
         // verify the required parameter 'request.contactDto' is set
        if (request.contactDto== null) {
            throw new ApiException(400, "Missing the required parameter 'request.contactDto' when calling convertContactModelToFile");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/ContactModel/model-as-file/{destinationFormat}";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "destinationFormat", request.destinationFormat);
        
        
        String postBody = null;
        
        postBody = SerializationHelper.serialize(request.contactDto);
        
        byte[] response = this.apiInvoker.invokeApi(
            resourcePath, 
            "PUT", 
            postBody, 
            null, 
            formParams);
            
        return response;
        
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Convert contact model to MAPI model contact representation             
     * 
     * @param request Holds parameters for this request invocation.
     * @return MapiContactDto
     * @throws ApiException 
     */
    public MapiContactDto convertContactModelToMapiModel(ConvertContactModelToMapiModelRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.contactDto' is set
        if (request.contactDto== null) {
            throw new ApiException(400, "Missing the required parameter 'request.contactDto' when calling convertContactModelToMapiModel");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/ContactModel/model-as-mapi-model";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        
        String postBody = null;
        
        postBody = SerializationHelper.serialize(request.contactDto);
        
        byte[] response = this.apiInvoker.invokeApi(
            resourcePath, 
            "PUT", 
            postBody, 
            null, 
            formParams);
            
        
        if (response == null)
        {
            return null;
        }
        
        return SerializationHelper.deserialize(new String(response), MapiContactDto.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Converts email document to specified format and returns as file             
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws ApiException 
     */
    public byte[] convertEmail(ConvertEmailRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.format' is set
        if (request.format== null) {
            throw new ApiException(400, "Missing the required parameter 'request.format' when calling convertEmail");
        }
         // verify the required parameter 'request.file' is set
        if (request.File== null) {
            throw new ApiException(400, "Missing the required parameter 'request.file' when calling convertEmail");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/convert/{format}";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "format", request.format);
        
        
                if (request.File != null) 
        {
            formParams.put("file", this.apiInvoker.toFileInfo(request.File, "File"));
        }
        byte[] response = this.apiInvoker.invokeApi(
            resourcePath, 
            "PUT", 
            null, 
            null, 
            formParams);
            
        return response;
        
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Converts Email model to specified format and returns as file             
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws ApiException 
     */
    public byte[] convertEmailModelToFile(ConvertEmailModelToFileRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.destinationFormat' is set
        if (request.destinationFormat== null) {
            throw new ApiException(400, "Missing the required parameter 'request.destinationFormat' when calling convertEmailModelToFile");
        }
         // verify the required parameter 'request.emailDto' is set
        if (request.emailDto== null) {
            throw new ApiException(400, "Missing the required parameter 'request.emailDto' when calling convertEmailModelToFile");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/model/model-as-file/{destinationFormat}";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "destinationFormat", request.destinationFormat);
        
        
        String postBody = null;
        
        postBody = SerializationHelper.serialize(request.emailDto);
        
        byte[] response = this.apiInvoker.invokeApi(
            resourcePath, 
            "PUT", 
            postBody, 
            null, 
            formParams);
            
        return response;
        
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Converts Email model to MAPI model message representation             
     * 
     * @param request Holds parameters for this request invocation.
     * @return MapiMessageDto
     * @throws ApiException 
     */
    public MapiMessageDto convertEmailModelToMapiModel(ConvertEmailModelToMapiModelRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.emailDto' is set
        if (request.emailDto== null) {
            throw new ApiException(400, "Missing the required parameter 'request.emailDto' when calling convertEmailModelToMapiModel");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/model/model-as-mapi-model";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        
        String postBody = null;
        
        postBody = SerializationHelper.serialize(request.emailDto);
        
        byte[] response = this.apiInvoker.invokeApi(
            resourcePath, 
            "PUT", 
            postBody, 
            null, 
            formParams);
            
        
        if (response == null)
        {
            return null;
        }
        
        return SerializationHelper.deserialize(new String(response), MapiMessageDto.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Converts MAPI calendar model to CalendarDto model             
     * 
     * @param request Holds parameters for this request invocation.
     * @return CalendarDto
     * @throws ApiException 
     */
    public CalendarDto convertMapiCalendarModelToCalendarModel(ConvertMapiCalendarModelToCalendarModelRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.mapiCalendarDto' is set
        if (request.mapiCalendarDto== null) {
            throw new ApiException(400, "Missing the required parameter 'request.mapiCalendarDto' when calling convertMapiCalendarModelToCalendarModel");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/MapiCalendar/model-as-calendar-model";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        
        String postBody = null;
        
        postBody = SerializationHelper.serialize(request.mapiCalendarDto);
        
        byte[] response = this.apiInvoker.invokeApi(
            resourcePath, 
            "PUT", 
            postBody, 
            null, 
            formParams);
            
        
        if (response == null)
        {
            return null;
        }
        
        return SerializationHelper.deserialize(new String(response), CalendarDto.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Converts MAPI calendar model to specified format and returns as file             
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws ApiException 
     */
    public byte[] convertMapiCalendarModelToFile(ConvertMapiCalendarModelToFileRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.destinationFormat' is set
        if (request.destinationFormat== null) {
            throw new ApiException(400, "Missing the required parameter 'request.destinationFormat' when calling convertMapiCalendarModelToFile");
        }
         // verify the required parameter 'request.mapiCalendarDto' is set
        if (request.mapiCalendarDto== null) {
            throw new ApiException(400, "Missing the required parameter 'request.mapiCalendarDto' when calling convertMapiCalendarModelToFile");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/MapiCalendar/model-as-file/{destinationFormat}";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "destinationFormat", request.destinationFormat);
        
        
        String postBody = null;
        
        postBody = SerializationHelper.serialize(request.mapiCalendarDto);
        
        byte[] response = this.apiInvoker.invokeApi(
            resourcePath, 
            "PUT", 
            postBody, 
            null, 
            formParams);
            
        return response;
        
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Converts MAPI contact model to Contact model             
     * 
     * @param request Holds parameters for this request invocation.
     * @return ContactDto
     * @throws ApiException 
     */
    public ContactDto convertMapiContactModelToContactModel(ConvertMapiContactModelToContactModelRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.mapiContactDto' is set
        if (request.mapiContactDto== null) {
            throw new ApiException(400, "Missing the required parameter 'request.mapiContactDto' when calling convertMapiContactModelToContactModel");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/MapiContact/model-as-contact-model";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        
        String postBody = null;
        
        postBody = SerializationHelper.serialize(request.mapiContactDto);
        
        byte[] response = this.apiInvoker.invokeApi(
            resourcePath, 
            "PUT", 
            postBody, 
            null, 
            formParams);
            
        
        if (response == null)
        {
            return null;
        }
        
        return SerializationHelper.deserialize(new String(response), ContactDto.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Converts MAPI contact model to specified format and returns as file             
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws ApiException 
     */
    public byte[] convertMapiContactModelToFile(ConvertMapiContactModelToFileRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.destinationFormat' is set
        if (request.destinationFormat== null) {
            throw new ApiException(400, "Missing the required parameter 'request.destinationFormat' when calling convertMapiContactModelToFile");
        }
         // verify the required parameter 'request.mapiContactDto' is set
        if (request.mapiContactDto== null) {
            throw new ApiException(400, "Missing the required parameter 'request.mapiContactDto' when calling convertMapiContactModelToFile");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/MapiContact/model-as-file/{destinationFormat}";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "destinationFormat", request.destinationFormat);
        
        
        String postBody = null;
        
        postBody = SerializationHelper.serialize(request.mapiContactDto);
        
        byte[] response = this.apiInvoker.invokeApi(
            resourcePath, 
            "PUT", 
            postBody, 
            null, 
            formParams);
            
        return response;
        
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Converts MAPI message model to EmailDto model             
     * 
     * @param request Holds parameters for this request invocation.
     * @return EmailDto
     * @throws ApiException 
     */
    public EmailDto convertMapiMessageModelToEmailModel(ConvertMapiMessageModelToEmailModelRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.mapiMessage' is set
        if (request.mapiMessage== null) {
            throw new ApiException(400, "Missing the required parameter 'request.mapiMessage' when calling convertMapiMessageModelToEmailModel");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/MapiMessage/model-as-email-model";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        
        String postBody = null;
        
        postBody = SerializationHelper.serialize(request.mapiMessage);
        
        byte[] response = this.apiInvoker.invokeApi(
            resourcePath, 
            "PUT", 
            postBody, 
            null, 
            formParams);
            
        
        if (response == null)
        {
            return null;
        }
        
        return SerializationHelper.deserialize(new String(response), EmailDto.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Converts MAPI message model to specified format and returns as file             
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws ApiException 
     */
    public byte[] convertMapiMessageModelToFile(ConvertMapiMessageModelToFileRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.destinationFormat' is set
        if (request.destinationFormat== null) {
            throw new ApiException(400, "Missing the required parameter 'request.destinationFormat' when calling convertMapiMessageModelToFile");
        }
         // verify the required parameter 'request.mapiMessage' is set
        if (request.mapiMessage== null) {
            throw new ApiException(400, "Missing the required parameter 'request.mapiMessage' when calling convertMapiMessageModelToFile");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/MapiMessage/model-as-file/{destinationFormat}";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "destinationFormat", request.destinationFormat);
        
        
        String postBody = null;
        
        postBody = SerializationHelper.serialize(request.mapiMessage);
        
        byte[] response = this.apiInvoker.invokeApi(
            resourcePath, 
            "PUT", 
            postBody, 
            null, 
            formParams);
            
        return response;
        
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * 
     * 
     * @param request Holds parameters for this request invocation.
     * @throws ApiException 
     */
    public void copyFile(CopyFileRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.srcPath' is set
        if (request.srcPath== null) {
            throw new ApiException(400, "Missing the required parameter 'request.srcPath' when calling copyFile");
        }
         // verify the required parameter 'request.destPath' is set
        if (request.destPath== null) {
            throw new ApiException(400, "Missing the required parameter 'request.destPath' when calling copyFile");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/storage/file/copy/{srcPath}";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "srcPath", request.srcPath);
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "destPath", request.destPath);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "srcStorageName", request.srcStorageName);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "destStorageName", request.destStorageName);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "versionId", request.versionId);
        
                
        this.apiInvoker.invokeApi(
            resourcePath, 
            "PUT", 
            null, 
            null, 
            formParams);
            
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * 
     * 
     * @param request Holds parameters for this request invocation.
     * @throws ApiException 
     */
    public void copyFolder(CopyFolderRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.srcPath' is set
        if (request.srcPath== null) {
            throw new ApiException(400, "Missing the required parameter 'request.srcPath' when calling copyFolder");
        }
         // verify the required parameter 'request.destPath' is set
        if (request.destPath== null) {
            throw new ApiException(400, "Missing the required parameter 'request.destPath' when calling copyFolder");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/storage/folder/copy/{srcPath}";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "srcPath", request.srcPath);
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "destPath", request.destPath);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "srcStorageName", request.srcStorageName);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "destStorageName", request.destStorageName);
        
                
        this.apiInvoker.invokeApi(
            resourcePath, 
            "PUT", 
            null, 
            null, 
            formParams);
            
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Create calendar file             
     * 
     * @param request Holds parameters for this request invocation.
     * @throws ApiException 
     */
    public void createCalendar(CreateCalendarRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.name' is set
        if (request.name== null) {
            throw new ApiException(400, "Missing the required parameter 'request.name' when calling createCalendar");
        }
         // verify the required parameter 'request.request' is set
        if (request.request== null) {
            throw new ApiException(400, "Missing the required parameter 'request.request' when calling createCalendar");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/Calendar/{name}";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
        
        
        String postBody = null;
        
        postBody = SerializationHelper.serialize(request.request);
        
        this.apiInvoker.invokeApi(
            resourcePath, 
            "PUT", 
            postBody, 
            null, 
            formParams);
            
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Create contact document             
     * 
     * @param request Holds parameters for this request invocation.
     * @throws ApiException 
     */
    public void createContact(CreateContactRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.format' is set
        if (request.format== null) {
            throw new ApiException(400, "Missing the required parameter 'request.format' when calling createContact");
        }
         // verify the required parameter 'request.name' is set
        if (request.name== null) {
            throw new ApiException(400, "Missing the required parameter 'request.name' when calling createContact");
        }
         // verify the required parameter 'request.request' is set
        if (request.request== null) {
            throw new ApiException(400, "Missing the required parameter 'request.request' when calling createContact");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/Contact/{format}/{name}";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "format", request.format);
        resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
        
        
        String postBody = null;
        
        postBody = SerializationHelper.serialize(request.request);
        
        this.apiInvoker.invokeApi(
            resourcePath, 
            "PUT", 
            postBody, 
            null, 
            formParams);
            
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Create an email document             
     * 
     * @param request Holds parameters for this request invocation.
     * @return EmailDocumentResponse
     * @throws ApiException 
     */
    public EmailDocumentResponse createEmail(CreateEmailRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.fileName' is set
        if (request.fileName== null) {
            throw new ApiException(400, "Missing the required parameter 'request.fileName' when calling createEmail");
        }
         // verify the required parameter 'request.request' is set
        if (request.request== null) {
            throw new ApiException(400, "Missing the required parameter 'request.request' when calling createEmail");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/{fileName}";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "fileName", request.fileName);
        
        
        String postBody = null;
        
        postBody = SerializationHelper.serialize(request.request);
        
        byte[] response = this.apiInvoker.invokeApi(
            resourcePath, 
            "PUT", 
            postBody, 
            null, 
            formParams);
            
        
        if (response == null)
        {
            return null;
        }
        
        return SerializationHelper.deserialize(new String(response), EmailDocumentResponse.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Create new folder in email account             
     * 
     * @param request Holds parameters for this request invocation.
     * @throws ApiException 
     */
    public void createEmailFolder(CreateEmailFolderRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.request' is set
        if (request.request== null) {
            throw new ApiException(400, "Missing the required parameter 'request.request' when calling createEmailFolder");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/client/CreateFolder";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        
        String postBody = null;
        
        postBody = SerializationHelper.serialize(request.request);
        
        this.apiInvoker.invokeApi(
            resourcePath, 
            "PUT", 
            postBody, 
            null, 
            formParams);
            
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * 
     * 
     * @param request Holds parameters for this request invocation.
     * @throws ApiException 
     */
    public void createFolder(CreateFolderRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.path' is set
        if (request.path== null) {
            throw new ApiException(400, "Missing the required parameter 'request.path' when calling createFolder");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/storage/folder/{path}";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "path", request.path);
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storageName", request.storageName);
        
                
        this.apiInvoker.invokeApi(
            resourcePath, 
            "PUT", 
            null, 
            null, 
            formParams);
            
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Create new document             
     * 
     * @param request Holds parameters for this request invocation.
     * @throws ApiException 
     */
    public void createMapi(CreateMapiRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.name' is set
        if (request.name== null) {
            throw new ApiException(400, "Missing the required parameter 'request.name' when calling createMapi");
        }
         // verify the required parameter 'request.request' is set
        if (request.request== null) {
            throw new ApiException(400, "Missing the required parameter 'request.request' when calling createMapi");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/Mapi/{name}";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
        
        
        String postBody = null;
        
        postBody = SerializationHelper.serialize(request.request);
        
        this.apiInvoker.invokeApi(
            resourcePath, 
            "PUT", 
            postBody, 
            null, 
            formParams);
            
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Deletes indexed property by index and name. To delete Reminder attachment, use path ReminderAttachment/{ReminderIndex}/{AttachmentIndex}             
     * 
     * @param request Holds parameters for this request invocation.
     * @throws ApiException 
     */
    public void deleteCalendarProperty(DeleteCalendarPropertyRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.name' is set
        if (request.name== null) {
            throw new ApiException(400, "Missing the required parameter 'request.name' when calling deleteCalendarProperty");
        }
         // verify the required parameter 'request.memberName' is set
        if (request.memberName== null) {
            throw new ApiException(400, "Missing the required parameter 'request.memberName' when calling deleteCalendarProperty");
        }
         // verify the required parameter 'request.index' is set
        if (request.index== null) {
            throw new ApiException(400, "Missing the required parameter 'request.index' when calling deleteCalendarProperty");
        }
         // verify the required parameter 'request.request' is set
        if (request.request== null) {
            throw new ApiException(400, "Missing the required parameter 'request.request' when calling deleteCalendarProperty");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/Calendar/{name}/properties/{memberName}/{index}";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
        resourcePath = UrlHelper.addPathParameter(resourcePath, "memberName", request.memberName);
        resourcePath = UrlHelper.addPathParameter(resourcePath, "index", request.index);
        
        
        String postBody = null;
        
        postBody = SerializationHelper.serialize(request.request);
        
        this.apiInvoker.invokeApi(
            resourcePath, 
            "DELETE", 
            postBody, 
            null, 
            formParams);
            
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Delete property from indexed property list             
     * 
     * @param request Holds parameters for this request invocation.
     * @throws ApiException 
     */
    public void deleteContactProperty(DeleteContactPropertyRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.format' is set
        if (request.format== null) {
            throw new ApiException(400, "Missing the required parameter 'request.format' when calling deleteContactProperty");
        }
         // verify the required parameter 'request.name' is set
        if (request.name== null) {
            throw new ApiException(400, "Missing the required parameter 'request.name' when calling deleteContactProperty");
        }
         // verify the required parameter 'request.memberName' is set
        if (request.memberName== null) {
            throw new ApiException(400, "Missing the required parameter 'request.memberName' when calling deleteContactProperty");
        }
         // verify the required parameter 'request.index' is set
        if (request.index== null) {
            throw new ApiException(400, "Missing the required parameter 'request.index' when calling deleteContactProperty");
        }
         // verify the required parameter 'request.folder' is set
        if (request.folder== null) {
            throw new ApiException(400, "Missing the required parameter 'request.folder' when calling deleteContactProperty");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/Contact/{format}/{name}/properties/{memberName}/{index}";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "format", request.format);
        resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
        resourcePath = UrlHelper.addPathParameter(resourcePath, "memberName", request.memberName);
        resourcePath = UrlHelper.addPathParameter(resourcePath, "index", request.index);
        
        
        String postBody = null;
        
        postBody = SerializationHelper.serialize(request.folder);
        
        this.apiInvoker.invokeApi(
            resourcePath, 
            "DELETE", 
            postBody, 
            null, 
            formParams);
            
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Delete a folder in email account             
     * 
     * @param request Holds parameters for this request invocation.
     * @throws ApiException 
     */
    public void deleteEmailFolder(DeleteEmailFolderRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.request' is set
        if (request.request== null) {
            throw new ApiException(400, "Missing the required parameter 'request.request' when calling deleteEmailFolder");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/client/DeleteFolder";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        
        String postBody = null;
        
        postBody = SerializationHelper.serialize(request.request);
        
        this.apiInvoker.invokeApi(
            resourcePath, 
            "DELETE", 
            postBody, 
            null, 
            formParams);
            
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Delete message from email account by id             
     * 
     * @param request Holds parameters for this request invocation.
     * @throws ApiException 
     */
    public void deleteEmailMessage(DeleteEmailMessageRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.request' is set
        if (request.request== null) {
            throw new ApiException(400, "Missing the required parameter 'request.request' when calling deleteEmailMessage");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/client/DeleteMessage";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        
        String postBody = null;
        
        postBody = SerializationHelper.serialize(request.request);
        
        this.apiInvoker.invokeApi(
            resourcePath, 
            "DELETE", 
            postBody, 
            null, 
            formParams);
            
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Delete thread by id. All messages from thread will also be deleted             
     * 
     * @param request Holds parameters for this request invocation.
     * @throws ApiException 
     */
    public void deleteEmailThread(DeleteEmailThreadRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.threadId' is set
        if (request.threadId== null) {
            throw new ApiException(400, "Missing the required parameter 'request.threadId' when calling deleteEmailThread");
        }
         // verify the required parameter 'request.request' is set
        if (request.request== null) {
            throw new ApiException(400, "Missing the required parameter 'request.request' when calling deleteEmailThread");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/client/threads/{threadId}";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "threadId", request.threadId);
        
        
        String postBody = null;
        
        postBody = SerializationHelper.serialize(request.request);
        
        this.apiInvoker.invokeApi(
            resourcePath, 
            "DELETE", 
            postBody, 
            null, 
            formParams);
            
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * 
     * 
     * @param request Holds parameters for this request invocation.
     * @throws ApiException 
     */
    public void deleteFile(DeleteFileRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.path' is set
        if (request.path== null) {
            throw new ApiException(400, "Missing the required parameter 'request.path' when calling deleteFile");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/storage/file/{path}";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "path", request.path);
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storageName", request.storageName);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "versionId", request.versionId);
        
                
        this.apiInvoker.invokeApi(
            resourcePath, 
            "DELETE", 
            null, 
            null, 
            formParams);
            
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * 
     * 
     * @param request Holds parameters for this request invocation.
     * @throws ApiException 
     */
    public void deleteFolder(DeleteFolderRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.path' is set
        if (request.path== null) {
            throw new ApiException(400, "Missing the required parameter 'request.path' when calling deleteFolder");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/storage/folder/{path}";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "path", request.path);
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storageName", request.storageName);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "recursive", request.recursive);
        
                
        this.apiInvoker.invokeApi(
            resourcePath, 
            "DELETE", 
            null, 
            null, 
            formParams);
            
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Remove attachment from document             
     * 
     * @param request Holds parameters for this request invocation.
     * @throws ApiException 
     */
    public void deleteMapiAttachment(DeleteMapiAttachmentRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.name' is set
        if (request.name== null) {
            throw new ApiException(400, "Missing the required parameter 'request.name' when calling deleteMapiAttachment");
        }
         // verify the required parameter 'request.attachment' is set
        if (request.attachment== null) {
            throw new ApiException(400, "Missing the required parameter 'request.attachment' when calling deleteMapiAttachment");
        }
         // verify the required parameter 'request.storage' is set
        if (request.storage== null) {
            throw new ApiException(400, "Missing the required parameter 'request.storage' when calling deleteMapiAttachment");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/Mapi/{name}/attachments/{attachment}";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
        resourcePath = UrlHelper.addPathParameter(resourcePath, "attachment", request.attachment);
        
        
        String postBody = null;
        
        postBody = SerializationHelper.serialize(request.storage);
        
        this.apiInvoker.invokeApi(
            resourcePath, 
            "DELETE", 
            postBody, 
            null, 
            formParams);
            
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Delete document properties             
     * 
     * @param request Holds parameters for this request invocation.
     * @throws ApiException 
     */
    public void deleteMapiProperties(DeleteMapiPropertiesRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.name' is set
        if (request.name== null) {
            throw new ApiException(400, "Missing the required parameter 'request.name' when calling deleteMapiProperties");
        }
         // verify the required parameter 'request.request' is set
        if (request.request== null) {
            throw new ApiException(400, "Missing the required parameter 'request.request' when calling deleteMapiProperties");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/Mapi/{name}/properties";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
        
        
        String postBody = null;
        
        postBody = SerializationHelper.serialize(request.request);
        
        this.apiInvoker.invokeApi(
            resourcePath, 
            "DELETE", 
            postBody, 
            null, 
            formParams);
            
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Discover email accounts by email address. Does not validate discovered accounts.             
     * 
     * @param request Holds parameters for this request invocation.
     * @return EmailAccountConfigList
     * @throws ApiException 
     */
    public EmailAccountConfigList discoverEmailConfig(DiscoverEmailConfigRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.address' is set
        if (request.address== null) {
            throw new ApiException(400, "Missing the required parameter 'request.address' when calling discoverEmailConfig");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/config/discover";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "address", request.address);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "fastProcessing", request.fastProcessing);
        
                
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
        
        return SerializationHelper.deserialize(new String(response), EmailAccountConfigList.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Discover email accounts by email address. Validates discovered accounts using OAuth 2.0.             
     * 
     * @param request Holds parameters for this request invocation.
     * @return EmailAccountConfigList
     * @throws ApiException 
     */
    public EmailAccountConfigList discoverEmailConfigOauth(DiscoverEmailConfigOauthRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.rq' is set
        if (request.rq== null) {
            throw new ApiException(400, "Missing the required parameter 'request.rq' when calling discoverEmailConfigOauth");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/config/discover/oauth";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        
        String postBody = null;
        
        postBody = SerializationHelper.serialize(request.rq);
        
        byte[] response = this.apiInvoker.invokeApi(
            resourcePath, 
            "POST", 
            postBody, 
            null, 
            formParams);
            
        
        if (response == null)
        {
            return null;
        }
        
        return SerializationHelper.deserialize(new String(response), EmailAccountConfigList.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Discover email accounts by email address. Validates discovered accounts using login and password.             
     * 
     * @param request Holds parameters for this request invocation.
     * @return EmailAccountConfigList
     * @throws ApiException 
     */
    public EmailAccountConfigList discoverEmailConfigPassword(DiscoverEmailConfigPasswordRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.rq' is set
        if (request.rq== null) {
            throw new ApiException(400, "Missing the required parameter 'request.rq' when calling discoverEmailConfigPassword");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/config/discover/password";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        
        String postBody = null;
        
        postBody = SerializationHelper.serialize(request.rq);
        
        byte[] response = this.apiInvoker.invokeApi(
            resourcePath, 
            "POST", 
            postBody, 
            null, 
            formParams);
            
        
        if (response == null)
        {
            return null;
        }
        
        return SerializationHelper.deserialize(new String(response), EmailAccountConfigList.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * 
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws ApiException 
     */
    public byte[] downloadFile(DownloadFileRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.path' is set
        if (request.path== null) {
            throw new ApiException(400, "Missing the required parameter 'request.path' when calling downloadFile");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/storage/file/{path}";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "path", request.path);
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storageName", request.storageName);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "versionId", request.versionId);
        
                
        byte[] response = this.apiInvoker.invokeApi(
            resourcePath, 
            "GET", 
            null, 
            null, 
            formParams);
            
        return response;
        
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Fetch message mime from email account             
     * 
     * @param request Holds parameters for this request invocation.
     * @return MimeResponse
     * @throws ApiException 
     */
    public MimeResponse fetchEmailMessage(FetchEmailMessageRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.messageId' is set
        if (request.messageId== null) {
            throw new ApiException(400, "Missing the required parameter 'request.messageId' when calling fetchEmailMessage");
        }
         // verify the required parameter 'request.firstAccount' is set
        if (request.firstAccount== null) {
            throw new ApiException(400, "Missing the required parameter 'request.firstAccount' when calling fetchEmailMessage");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/client/Fetch";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "messageId", request.messageId);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "firstAccount", request.firstAccount);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "secondAccount", request.secondAccount);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storageFolder", request.storageFolder);
        
                
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
        
        return SerializationHelper.deserialize(new String(response), MimeResponse.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Fetch message model from email account             
     * 
     * @param request Holds parameters for this request invocation.
     * @return EmailDto
     * @throws ApiException 
     */
    public EmailDto fetchEmailModel(FetchEmailModelRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.messageId' is set
        if (request.messageId== null) {
            throw new ApiException(400, "Missing the required parameter 'request.messageId' when calling fetchEmailModel");
        }
         // verify the required parameter 'request.firstAccount' is set
        if (request.firstAccount== null) {
            throw new ApiException(400, "Missing the required parameter 'request.firstAccount' when calling fetchEmailModel");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/client/FetchModel";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "messageId", request.messageId);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "firstAccount", request.firstAccount);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "secondAccount", request.secondAccount);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storageFolder", request.storageFolder);
        
                
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
        
        return SerializationHelper.deserialize(new String(response), EmailDto.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Get messages from thread by id. All messages are fully fetched. For accounts with CacheFile only cached messages will be returned.             
     * 
     * @param request Holds parameters for this request invocation.
     * @return ListResponseOfEmailDto
     * @throws ApiException 
     */
    public ListResponseOfEmailDto fetchEmailThreadMessages(FetchEmailThreadMessagesRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.threadId' is set
        if (request.threadId== null) {
            throw new ApiException(400, "Missing the required parameter 'request.threadId' when calling fetchEmailThreadMessages");
        }
         // verify the required parameter 'request.firstAccount' is set
        if (request.firstAccount== null) {
            throw new ApiException(400, "Missing the required parameter 'request.firstAccount' when calling fetchEmailThreadMessages");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/client/threads/{threadId}/messages";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "threadId", request.threadId);
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "firstAccount", request.firstAccount);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "secondAccount", request.secondAccount);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storageFolder", request.storageFolder);
        
                
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
        
        return SerializationHelper.deserialize(new String(response), ListResponseOfEmailDto.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Get calendar file properties             
     * 
     * @param request Holds parameters for this request invocation.
     * @return HierarchicalObject
     * @throws ApiException 
     */
    public HierarchicalObject getCalendar(GetCalendarRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.name' is set
        if (request.name== null) {
            throw new ApiException(400, "Missing the required parameter 'request.name' when calling getCalendar");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/Calendar/{name}/properties";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
        
                
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
        
        return SerializationHelper.deserialize(new String(response), HierarchicalObject.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Converts calendar document from storage to specified format and returns as file             
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws ApiException 
     */
    public byte[] getCalendarAsFile(GetCalendarAsFileRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.fileName' is set
        if (request.fileName== null) {
            throw new ApiException(400, "Missing the required parameter 'request.fileName' when calling getCalendarAsFile");
        }
         // verify the required parameter 'request.format' is set
        if (request.format== null) {
            throw new ApiException(400, "Missing the required parameter 'request.format' when calling getCalendarAsFile");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/CalendarModel/{fileName}/as-file/{format}";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "fileName", request.fileName);
        resourcePath = UrlHelper.addPathParameter(resourcePath, "format", request.format);
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
        
                
        byte[] response = this.apiInvoker.invokeApi(
            resourcePath, 
            "GET", 
            null, 
            null, 
            formParams);
            
        return response;
        
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Get iCalendar document attachment by name             
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws ApiException 
     */
    public byte[] getCalendarAttachment(GetCalendarAttachmentRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.name' is set
        if (request.name== null) {
            throw new ApiException(400, "Missing the required parameter 'request.name' when calling getCalendarAttachment");
        }
         // verify the required parameter 'request.attachment' is set
        if (request.attachment== null) {
            throw new ApiException(400, "Missing the required parameter 'request.attachment' when calling getCalendarAttachment");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/Calendar/{name}/attachments/{attachment}";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
        resourcePath = UrlHelper.addPathParameter(resourcePath, "attachment", request.attachment);
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
        
                
        byte[] response = this.apiInvoker.invokeApi(
            resourcePath, 
            "GET", 
            null, 
            null, 
            formParams);
            
        return response;
        
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Converts calendar file to a MAPI model representation             
     * 
     * @param request Holds parameters for this request invocation.
     * @return MapiCalendarDto
     * @throws ApiException 
     */
    public MapiCalendarDto getCalendarFileAsMapiModel(GetCalendarFileAsMapiModelRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.file' is set
        if (request.File== null) {
            throw new ApiException(400, "Missing the required parameter 'request.file' when calling getCalendarFileAsMapiModel");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/MapiCalendar/file-as-model";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        
                if (request.File != null) 
        {
            formParams.put("file", this.apiInvoker.toFileInfo(request.File, "File"));
        }
        byte[] response = this.apiInvoker.invokeApi(
            resourcePath, 
            "PUT", 
            null, 
            null, 
            formParams);
            
        
        if (response == null)
        {
            return null;
        }
        
        return SerializationHelper.deserialize(new String(response), MapiCalendarDto.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Converts calendar document to a model representation             
     * 
     * @param request Holds parameters for this request invocation.
     * @return CalendarDto
     * @throws ApiException 
     */
    public CalendarDto getCalendarFileAsModel(GetCalendarFileAsModelRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.file' is set
        if (request.File== null) {
            throw new ApiException(400, "Missing the required parameter 'request.file' when calling getCalendarFileAsModel");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/CalendarModel/file-as-model";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        
                if (request.File != null) 
        {
            formParams.put("file", this.apiInvoker.toFileInfo(request.File, "File"));
        }
        byte[] response = this.apiInvoker.invokeApi(
            resourcePath, 
            "PUT", 
            null, 
            null, 
            formParams);
            
        
        if (response == null)
        {
            return null;
        }
        
        return SerializationHelper.deserialize(new String(response), CalendarDto.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Get iCalendar files list in folder on storage             
     * 
     * @param request Holds parameters for this request invocation.
     * @return ListResponseOfHierarchicalObjectResponse
     * @throws ApiException 
     */
    public ListResponseOfHierarchicalObjectResponse getCalendarList(GetCalendarListRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.folder' is set
        if (request.folder== null) {
            throw new ApiException(400, "Missing the required parameter 'request.folder' when calling getCalendarList");
        }
         // verify the required parameter 'request.itemsPerPage' is set
        if (request.itemsPerPage== null) {
            throw new ApiException(400, "Missing the required parameter 'request.itemsPerPage' when calling getCalendarList");
        }
         // verify the required parameter 'request.pageNumber' is set
        if (request.pageNumber== null) {
            throw new ApiException(400, "Missing the required parameter 'request.pageNumber' when calling getCalendarList");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/Calendar";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "itemsPerPage", request.itemsPerPage);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "pageNumber", request.pageNumber);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
        
                
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
        
        return SerializationHelper.deserialize(new String(response), ListResponseOfHierarchicalObjectResponse.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Get calendar file             
     * 
     * @param request Holds parameters for this request invocation.
     * @return CalendarDto
     * @throws ApiException 
     */
    public CalendarDto getCalendarModel(GetCalendarModelRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.name' is set
        if (request.name== null) {
            throw new ApiException(400, "Missing the required parameter 'request.name' when calling getCalendarModel");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/CalendarModel/{name}";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
        
                
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
        
        return SerializationHelper.deserialize(new String(response), CalendarDto.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Get iCalendar from storage as AlternateView             
     * 
     * @param request Holds parameters for this request invocation.
     * @return AlternateView
     * @throws ApiException 
     */
    public AlternateView getCalendarModelAsAlternate(GetCalendarModelAsAlternateRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.name' is set
        if (request.name== null) {
            throw new ApiException(400, "Missing the required parameter 'request.name' when calling getCalendarModelAsAlternate");
        }
         // verify the required parameter 'request.calendarAction' is set
        if (request.calendarAction== null) {
            throw new ApiException(400, "Missing the required parameter 'request.calendarAction' when calling getCalendarModelAsAlternate");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/CalendarModel/{name}/as-alternate/{calendarAction}";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
        resourcePath = UrlHelper.addPathParameter(resourcePath, "calendarAction", request.calendarAction);
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "sequenceId", request.sequenceId);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
        
                
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
        
        return SerializationHelper.deserialize(new String(response), AlternateView.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Get iCalendar list from storage folder             
     * 
     * @param request Holds parameters for this request invocation.
     * @return CalendarDtoList
     * @throws ApiException 
     */
    public CalendarDtoList getCalendarModelList(GetCalendarModelListRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.folder' is set
        if (request.folder== null) {
            throw new ApiException(400, "Missing the required parameter 'request.folder' when calling getCalendarModelList");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/CalendarModel";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "itemsPerPage", request.itemsPerPage);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "pageNumber", request.pageNumber);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
        
                
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
        
        return SerializationHelper.deserialize(new String(response), CalendarDtoList.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Converts calendar document from storage to specified format and returns as file             
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws ApiException 
     */
    public byte[] getContactAsFile(GetContactAsFileRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.fileName' is set
        if (request.fileName== null) {
            throw new ApiException(400, "Missing the required parameter 'request.fileName' when calling getContactAsFile");
        }
         // verify the required parameter 'request.destinationFormat' is set
        if (request.destinationFormat== null) {
            throw new ApiException(400, "Missing the required parameter 'request.destinationFormat' when calling getContactAsFile");
        }
         // verify the required parameter 'request.format' is set
        if (request.format== null) {
            throw new ApiException(400, "Missing the required parameter 'request.format' when calling getContactAsFile");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/ContactModel/{format}/{fileName}/as-file/{destinationFormat}";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "fileName", request.fileName);
        resourcePath = UrlHelper.addPathParameter(resourcePath, "destinationFormat", request.destinationFormat);
        resourcePath = UrlHelper.addPathParameter(resourcePath, "format", request.format);
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
        
                
        byte[] response = this.apiInvoker.invokeApi(
            resourcePath, 
            "GET", 
            null, 
            null, 
            formParams);
            
        return response;
        
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Get attachment file by name             
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws ApiException 
     */
    public byte[] getContactAttachment(GetContactAttachmentRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.format' is set
        if (request.format== null) {
            throw new ApiException(400, "Missing the required parameter 'request.format' when calling getContactAttachment");
        }
         // verify the required parameter 'request.name' is set
        if (request.name== null) {
            throw new ApiException(400, "Missing the required parameter 'request.name' when calling getContactAttachment");
        }
         // verify the required parameter 'request.attachment' is set
        if (request.attachment== null) {
            throw new ApiException(400, "Missing the required parameter 'request.attachment' when calling getContactAttachment");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/Contact/{format}/{name}/attachments/{attachment}";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "format", request.format);
        resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
        resourcePath = UrlHelper.addPathParameter(resourcePath, "attachment", request.attachment);
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
        
                
        byte[] response = this.apiInvoker.invokeApi(
            resourcePath, 
            "GET", 
            null, 
            null, 
            formParams);
            
        return response;
        
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Converts contact file to a MAPI model representation             
     * 
     * @param request Holds parameters for this request invocation.
     * @return MapiContactDto
     * @throws ApiException 
     */
    public MapiContactDto getContactFileAsMapiModel(GetContactFileAsMapiModelRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.fileFormat' is set
        if (request.fileFormat== null) {
            throw new ApiException(400, "Missing the required parameter 'request.fileFormat' when calling getContactFileAsMapiModel");
        }
         // verify the required parameter 'request.file' is set
        if (request.File== null) {
            throw new ApiException(400, "Missing the required parameter 'request.file' when calling getContactFileAsMapiModel");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/MapiContact/{fileFormat}/file-as-model";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "fileFormat", request.fileFormat);
        
        
                if (request.File != null) 
        {
            formParams.put("file", this.apiInvoker.toFileInfo(request.File, "File"));
        }
        byte[] response = this.apiInvoker.invokeApi(
            resourcePath, 
            "PUT", 
            null, 
            null, 
            formParams);
            
        
        if (response == null)
        {
            return null;
        }
        
        return SerializationHelper.deserialize(new String(response), MapiContactDto.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Converts contact document to a model representation             
     * 
     * @param request Holds parameters for this request invocation.
     * @return ContactDto
     * @throws ApiException 
     */
    public ContactDto getContactFileAsModel(GetContactFileAsModelRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.format' is set
        if (request.format== null) {
            throw new ApiException(400, "Missing the required parameter 'request.format' when calling getContactFileAsModel");
        }
         // verify the required parameter 'request.file' is set
        if (request.File== null) {
            throw new ApiException(400, "Missing the required parameter 'request.file' when calling getContactFileAsModel");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/ContactModel/{format}/file-as-model";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "format", request.format);
        
        
                if (request.File != null) 
        {
            formParams.put("file", this.apiInvoker.toFileInfo(request.File, "File"));
        }
        byte[] response = this.apiInvoker.invokeApi(
            resourcePath, 
            "PUT", 
            null, 
            null, 
            formParams);
            
        
        if (response == null)
        {
            return null;
        }
        
        return SerializationHelper.deserialize(new String(response), ContactDto.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Get contact list from storage folder             
     * 
     * @param request Holds parameters for this request invocation.
     * @return ListResponseOfHierarchicalObjectResponse
     * @throws ApiException 
     */
    public ListResponseOfHierarchicalObjectResponse getContactList(GetContactListRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.format' is set
        if (request.format== null) {
            throw new ApiException(400, "Missing the required parameter 'request.format' when calling getContactList");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/Contact/{format}";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "format", request.format);
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "itemsPerPage", request.itemsPerPage);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "pageNumber", request.pageNumber);
        
                
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
        
        return SerializationHelper.deserialize(new String(response), ListResponseOfHierarchicalObjectResponse.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Get contact document.             
     * 
     * @param request Holds parameters for this request invocation.
     * @return ContactDto
     * @throws ApiException 
     */
    public ContactDto getContactModel(GetContactModelRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.format' is set
        if (request.format== null) {
            throw new ApiException(400, "Missing the required parameter 'request.format' when calling getContactModel");
        }
         // verify the required parameter 'request.name' is set
        if (request.name== null) {
            throw new ApiException(400, "Missing the required parameter 'request.name' when calling getContactModel");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/ContactModel/{format}/{name}";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "format", request.format);
        resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
        
                
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
        
        return SerializationHelper.deserialize(new String(response), ContactDto.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Get contact list from storage folder.             
     * 
     * @param request Holds parameters for this request invocation.
     * @return ContactDtoList
     * @throws ApiException 
     */
    public ContactDtoList getContactModelList(GetContactModelListRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.format' is set
        if (request.format== null) {
            throw new ApiException(400, "Missing the required parameter 'request.format' when calling getContactModelList");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/ContactModel/{format}";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "format", request.format);
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "itemsPerPage", request.itemsPerPage);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "pageNumber", request.pageNumber);
        
                
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
        
        return SerializationHelper.deserialize(new String(response), ContactDtoList.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Get contact document properties             
     * 
     * @param request Holds parameters for this request invocation.
     * @return HierarchicalObject
     * @throws ApiException 
     */
    public HierarchicalObject getContactProperties(GetContactPropertiesRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.format' is set
        if (request.format== null) {
            throw new ApiException(400, "Missing the required parameter 'request.format' when calling getContactProperties");
        }
         // verify the required parameter 'request.name' is set
        if (request.name== null) {
            throw new ApiException(400, "Missing the required parameter 'request.name' when calling getContactProperties");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/Contact/{format}/{name}/properties";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "format", request.format);
        resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
        
                
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
        
        return SerializationHelper.deserialize(new String(response), HierarchicalObject.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * 
     * 
     * @param request Holds parameters for this request invocation.
     * @return DiscUsage
     * @throws ApiException 
     */
    public DiscUsage getDiscUsage(GetDiscUsageRequestData request) throws ApiException 
    {
      try {
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/storage/disc";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storageName", request.storageName);
        
                
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
        
        return SerializationHelper.deserialize(new String(response), DiscUsage.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Get email document             
     * 
     * @param request Holds parameters for this request invocation.
     * @return EmailDocument
     * @throws ApiException 
     */
    public EmailDocument getEmail(GetEmailRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.fileName' is set
        if (request.fileName== null) {
            throw new ApiException(400, "Missing the required parameter 'request.fileName' when calling getEmail");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/{fileName}";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "fileName", request.fileName);
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
        
                
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
        
        return SerializationHelper.deserialize(new String(response), EmailDocument.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Converts email document from storage to specified format and returns as file             
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws ApiException 
     */
    public byte[] getEmailAsFile(GetEmailAsFileRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.fileName' is set
        if (request.fileName== null) {
            throw new ApiException(400, "Missing the required parameter 'request.fileName' when calling getEmailAsFile");
        }
         // verify the required parameter 'request.format' is set
        if (request.format== null) {
            throw new ApiException(400, "Missing the required parameter 'request.format' when calling getEmailAsFile");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/{fileName}/as-file/{format}";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "fileName", request.fileName);
        resourcePath = UrlHelper.addPathParameter(resourcePath, "format", request.format);
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
        
                
        byte[] response = this.apiInvoker.invokeApi(
            resourcePath, 
            "GET", 
            null, 
            null, 
            formParams);
            
        return response;
        
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Get email attachment by name             
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws ApiException 
     */
    public byte[] getEmailAttachment(GetEmailAttachmentRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.attachment' is set
        if (request.attachment== null) {
            throw new ApiException(400, "Missing the required parameter 'request.attachment' when calling getEmailAttachment");
        }
         // verify the required parameter 'request.fileName' is set
        if (request.fileName== null) {
            throw new ApiException(400, "Missing the required parameter 'request.fileName' when calling getEmailAttachment");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/{fileName}/attachments/{attachment}";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "attachment", request.attachment);
        resourcePath = UrlHelper.addPathParameter(resourcePath, "fileName", request.fileName);
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
        
                
        byte[] response = this.apiInvoker.invokeApi(
            resourcePath, 
            "GET", 
            null, 
            null, 
            formParams);
            
        return response;
        
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Get email client account from storage             
     * 
     * @param request Holds parameters for this request invocation.
     * @return EmailClientAccount
     * @throws ApiException 
     */
    public EmailClientAccount getEmailClientAccount(GetEmailClientAccountRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.name' is set
        if (request.name== null) {
            throw new ApiException(400, "Missing the required parameter 'request.name' when calling getEmailClientAccount");
        }
         // verify the required parameter 'request.folder' is set
        if (request.folder== null) {
            throw new ApiException(400, "Missing the required parameter 'request.folder' when calling getEmailClientAccount");
        }
         // verify the required parameter 'request.storage' is set
        if (request.storage== null) {
            throw new ApiException(400, "Missing the required parameter 'request.storage' when calling getEmailClientAccount");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/client/email-client-account";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "name", request.name);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
        
                
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
        
        return SerializationHelper.deserialize(new String(response), EmailClientAccount.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Get email client multi account file (*.multi.account). Will respond error if file extension is not \&quot;.multi.account\&quot;.             
     * 
     * @param request Holds parameters for this request invocation.
     * @return EmailClientMultiAccount
     * @throws ApiException 
     */
    public EmailClientMultiAccount getEmailClientMultiAccount(GetEmailClientMultiAccountRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.name' is set
        if (request.name== null) {
            throw new ApiException(400, "Missing the required parameter 'request.name' when calling getEmailClientMultiAccount");
        }
         // verify the required parameter 'request.folder' is set
        if (request.folder== null) {
            throw new ApiException(400, "Missing the required parameter 'request.folder' when calling getEmailClientMultiAccount");
        }
         // verify the required parameter 'request.storage' is set
        if (request.storage== null) {
            throw new ApiException(400, "Missing the required parameter 'request.storage' when calling getEmailClientMultiAccount");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/client/multi-account";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "name", request.name);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
        
                
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
        
        return SerializationHelper.deserialize(new String(response), EmailClientMultiAccount.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Converts email file to a MAPI model representation             
     * 
     * @param request Holds parameters for this request invocation.
     * @return MapiMessageDto
     * @throws ApiException 
     */
    public MapiMessageDto getEmailFileAsMapiModel(GetEmailFileAsMapiModelRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.fileFormat' is set
        if (request.fileFormat== null) {
            throw new ApiException(400, "Missing the required parameter 'request.fileFormat' when calling getEmailFileAsMapiModel");
        }
         // verify the required parameter 'request.file' is set
        if (request.File== null) {
            throw new ApiException(400, "Missing the required parameter 'request.file' when calling getEmailFileAsMapiModel");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/MapiMessage/{fileFormat}/file-as-model";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "fileFormat", request.fileFormat);
        
        
                if (request.File != null) 
        {
            formParams.put("file", this.apiInvoker.toFileInfo(request.File, "File"));
        }
        byte[] response = this.apiInvoker.invokeApi(
            resourcePath, 
            "PUT", 
            null, 
            null, 
            formParams);
            
        
        if (response == null)
        {
            return null;
        }
        
        return SerializationHelper.deserialize(new String(response), MapiMessageDto.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Converts email document to a model representation             
     * 
     * @param request Holds parameters for this request invocation.
     * @return EmailDto
     * @throws ApiException 
     */
    public EmailDto getEmailFileAsModel(GetEmailFileAsModelRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.file' is set
        if (request.File== null) {
            throw new ApiException(400, "Missing the required parameter 'request.file' when calling getEmailFileAsModel");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/model/file-as-model";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        
                if (request.File != null) 
        {
            formParams.put("file", this.apiInvoker.toFileInfo(request.File, "File"));
        }
        byte[] response = this.apiInvoker.invokeApi(
            resourcePath, 
            "PUT", 
            null, 
            null, 
            formParams);
            
        
        if (response == null)
        {
            return null;
        }
        
        return SerializationHelper.deserialize(new String(response), EmailDto.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Get email document.             
     * 
     * @param request Holds parameters for this request invocation.
     * @return EmailDto
     * @throws ApiException 
     */
    public EmailDto getEmailModel(GetEmailModelRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.format' is set
        if (request.format== null) {
            throw new ApiException(400, "Missing the required parameter 'request.format' when calling getEmailModel");
        }
         // verify the required parameter 'request.name' is set
        if (request.name== null) {
            throw new ApiException(400, "Missing the required parameter 'request.name' when calling getEmailModel");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/model/{format}/{name}";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "format", request.format);
        resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
        
                
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
        
        return SerializationHelper.deserialize(new String(response), EmailDto.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Get email list from storage folder.             
     * 
     * @param request Holds parameters for this request invocation.
     * @return EmailDtoList
     * @throws ApiException 
     */
    public EmailDtoList getEmailModelList(GetEmailModelListRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.format' is set
        if (request.format== null) {
            throw new ApiException(400, "Missing the required parameter 'request.format' when calling getEmailModelList");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/model/{format}";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "format", request.format);
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "itemsPerPage", request.itemsPerPage);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "pageNumber", request.pageNumber);
        
                
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
        
        return SerializationHelper.deserialize(new String(response), EmailDtoList.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Get an email document property by its name             
     * 
     * @param request Holds parameters for this request invocation.
     * @return EmailPropertyResponse
     * @throws ApiException 
     */
    public EmailPropertyResponse getEmailProperty(GetEmailPropertyRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.propertyName' is set
        if (request.propertyName== null) {
            throw new ApiException(400, "Missing the required parameter 'request.propertyName' when calling getEmailProperty");
        }
         // verify the required parameter 'request.fileName' is set
        if (request.fileName== null) {
            throw new ApiException(400, "Missing the required parameter 'request.fileName' when calling getEmailProperty");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/{fileName}/properties/{propertyName}";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "propertyName", request.propertyName);
        resourcePath = UrlHelper.addPathParameter(resourcePath, "fileName", request.fileName);
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
        
                
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
        
        return SerializationHelper.deserialize(new String(response), EmailPropertyResponse.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * 
     * 
     * @param request Holds parameters for this request invocation.
     * @return FileVersions
     * @throws ApiException 
     */
    public FileVersions getFileVersions(GetFileVersionsRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.path' is set
        if (request.path== null) {
            throw new ApiException(400, "Missing the required parameter 'request.path' when calling getFileVersions");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/storage/version/{path}";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "path", request.path);
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storageName", request.storageName);
        
                
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
        
        return SerializationHelper.deserialize(new String(response), FileVersions.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * 
     * 
     * @param request Holds parameters for this request invocation.
     * @return FilesList
     * @throws ApiException 
     */
    public FilesList getFilesList(GetFilesListRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.path' is set
        if (request.path== null) {
            throw new ApiException(400, "Missing the required parameter 'request.path' when calling getFilesList");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/storage/folder/{path}";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "path", request.path);
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storageName", request.storageName);
        
                
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
        
        return SerializationHelper.deserialize(new String(response), FilesList.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Get document attachment as file stream             
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws ApiException 
     */
    public byte[] getMapiAttachment(GetMapiAttachmentRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.name' is set
        if (request.name== null) {
            throw new ApiException(400, "Missing the required parameter 'request.name' when calling getMapiAttachment");
        }
         // verify the required parameter 'request.attachment' is set
        if (request.attachment== null) {
            throw new ApiException(400, "Missing the required parameter 'request.attachment' when calling getMapiAttachment");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/Mapi/{name}/attachments/{attachment}";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
        resourcePath = UrlHelper.addPathParameter(resourcePath, "attachment", request.attachment);
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
        
                
        byte[] response = this.apiInvoker.invokeApi(
            resourcePath, 
            "GET", 
            null, 
            null, 
            formParams);
            
        return response;
        
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Get document attachment list             
     * 
     * @param request Holds parameters for this request invocation.
     * @return ListResponseOfString
     * @throws ApiException 
     */
    public ListResponseOfString getMapiAttachments(GetMapiAttachmentsRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.name' is set
        if (request.name== null) {
            throw new ApiException(400, "Missing the required parameter 'request.name' when calling getMapiAttachments");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/Mapi/{name}/attachments";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
        
                
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
        
        return SerializationHelper.deserialize(new String(response), ListResponseOfString.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Get calendar file             
     * 
     * @param request Holds parameters for this request invocation.
     * @return MapiCalendarDto
     * @throws ApiException 
     */
    public MapiCalendarDto getMapiCalendarModel(GetMapiCalendarModelRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.name' is set
        if (request.name== null) {
            throw new ApiException(400, "Missing the required parameter 'request.name' when calling getMapiCalendarModel");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/MapiCalendar/{name}";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
        
                
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
        
        return SerializationHelper.deserialize(new String(response), MapiCalendarDto.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Get contact document.             
     * 
     * @param request Holds parameters for this request invocation.
     * @return MapiContactDto
     * @throws ApiException 
     */
    public MapiContactDto getMapiContactModel(GetMapiContactModelRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.format' is set
        if (request.format== null) {
            throw new ApiException(400, "Missing the required parameter 'request.format' when calling getMapiContactModel");
        }
         // verify the required parameter 'request.name' is set
        if (request.name== null) {
            throw new ApiException(400, "Missing the required parameter 'request.name' when calling getMapiContactModel");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/MapiContact/{format}/{name}";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "format", request.format);
        resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
        
                
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
        
        return SerializationHelper.deserialize(new String(response), MapiContactDto.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Get document list from storage folder             
     * 
     * @param request Holds parameters for this request invocation.
     * @return ListResponseOfHierarchicalObjectResponse
     * @throws ApiException 
     */
    public ListResponseOfHierarchicalObjectResponse getMapiList(GetMapiListRequestData request) throws ApiException 
    {
      try {
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/Mapi";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "itemsPerPage", request.itemsPerPage);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "pageNumber", request.pageNumber);
        
                
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
        
        return SerializationHelper.deserialize(new String(response), ListResponseOfHierarchicalObjectResponse.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * MAPI message document.             
     * 
     * @param request Holds parameters for this request invocation.
     * @return MapiMessageDto
     * @throws ApiException 
     */
    public MapiMessageDto getMapiMessageModel(GetMapiMessageModelRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.format' is set
        if (request.format== null) {
            throw new ApiException(400, "Missing the required parameter 'request.format' when calling getMapiMessageModel");
        }
         // verify the required parameter 'request.name' is set
        if (request.name== null) {
            throw new ApiException(400, "Missing the required parameter 'request.name' when calling getMapiMessageModel");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/MapiMessage/{format}/{name}";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "format", request.format);
        resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
        
                
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
        
        return SerializationHelper.deserialize(new String(response), MapiMessageDto.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Get document properties             
     * 
     * @param request Holds parameters for this request invocation.
     * @return HierarchicalObjectResponse
     * @throws ApiException 
     */
    public HierarchicalObjectResponse getMapiProperties(GetMapiPropertiesRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.name' is set
        if (request.name== null) {
            throw new ApiException(400, "Missing the required parameter 'request.name' when calling getMapiProperties");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/Mapi/{name}/properties";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
        
                
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
        
        return SerializationHelper.deserialize(new String(response), HierarchicalObjectResponse.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Check email address is disposable             
     * 
     * @param request Holds parameters for this request invocation.
     * @return ValueTOfBoolean
     * @throws ApiException 
     */
    public ValueTOfBoolean isEmailAddressDisposable(IsEmailAddressDisposableRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.address' is set
        if (request.address== null) {
            throw new ApiException(400, "Missing the required parameter 'request.address' when calling isEmailAddressDisposable");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/disposable/isDisposable/{address}";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "address", request.address);
        
        
                
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
        
        return SerializationHelper.deserialize(new String(response), ValueTOfBoolean.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Get folders list in email account             
     * 
     * @param request Holds parameters for this request invocation.
     * @return ListResponseOfMailServerFolder
     * @throws ApiException 
     */
    public ListResponseOfMailServerFolder listEmailFolders(ListEmailFoldersRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.firstAccount' is set
        if (request.firstAccount== null) {
            throw new ApiException(400, "Missing the required parameter 'request.firstAccount' when calling listEmailFolders");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/client/ListFolders";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "firstAccount", request.firstAccount);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "secondAccount", request.secondAccount);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storageFolder", request.storageFolder);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "parentFolder", request.parentFolder);
        
                
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
        
        return SerializationHelper.deserialize(new String(response), ListResponseOfMailServerFolder.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Get messages from folder, filtered by query             
     * The query string should have the following view.      The example of a simple expression:       &#39;&lt;Field name&gt;&#39; &lt;Comparison operator&gt; &#39;&lt;Field value&gt;&#39;,  where &amp;lt;Field Name&amp;gt; - the name of a message field through which filtering is made, &amp;lt;Comparison operator&amp;gt; - comparison operators, as their name implies, allow to compare message field and specified value, &amp;lt;Field value&amp;gt; - value to be compared with a message field.      The number of simple expressions can make a compound one, ex.:     (&lt;Simple expression 1&gt; &amp; &lt;Simple expression 2&gt;) | &lt;Simple expression 3     &gt;,  where \&quot;&amp;amp;\&quot; - logical-AND operator, \&quot;|\&quot; - logical-OR operator      At present the following values are allowed as a field name (&lt;Field name&gt;):  \&quot;To\&quot; - represents a TO field of message, \&quot;Text\&quot; - represents string in the header or body of the message, \&quot;Bcc\&quot; - represents a BCC field of message, \&quot;Body\&quot; - represents a string in the body of message, \&quot;Cc\&quot; - represents a CC field of message, \&quot;From\&quot; - represents a From field of message, \&quot;Subject\&quot; - represents a string in the subject of message, \&quot;InternalDate\&quot; - represents an internal date of message, \&quot;SentDate\&quot; - represents a sent date of message      Additionally, the following field names are allowed for IMAP-protocol:  \&quot;Answered\&quot; - represents an /Answered flag of message \&quot;Seen\&quot; - represents a /Seen flag of message \&quot;Flagged\&quot; - represents a /Flagged flag of message \&quot;Draft\&quot; - represents a /Draft flag of message \&quot;Deleted\&quot; - represents a Deleted/ flag of message \&quot;Recent\&quot; - represents a Deleted/ flag of message \&quot;MessageSize\&quot; - represents a size (in bytes) of message      Additionally, the following field names are allowed for Exchange:  \&quot;IsRead\&quot; - Indicates whether the message has been read \&quot;HasAttachment\&quot; - Indicates whether or not the message has attachments \&quot;IsSubmitted\&quot; - Indicates whether the message has been submitted to the Outbox \&quot;ContentClass\&quot; - represents a content class of item      Additionally, the following field names are allowed for pst/ost files:  \&quot;MessageClass\&quot; - Represents a message class \&quot;ContainerClass\&quot; - Represents a folder container class \&quot;Importance\&quot; - Represents a message importance \&quot;MessageSize\&quot; - represents a size (in bytes) of message \&quot;FolderName\&quot; - represents a folder name \&quot;ContentsCount\&quot; - represents a total number of items in the folder \&quot;UnreadContentsCount\&quot; - represents the number of unread items in the folder. \&quot;Subfolders\&quot; - Indicates whether or not the folder has subfolders \&quot;Read\&quot; - the message is marked as having been read \&quot;HasAttachment\&quot; - the message has at least one attachment \&quot;Unsent\&quot; - the message is still being composed \&quot;Unmodified\&quot; - the message has not been modified since it was first saved (if unsent) or it was delivered (if sent) \&quot;FromMe\&quot; - the user receiving the message was also the user who sent the message \&quot;Resend\&quot; - the message includes a request for a resend operation with a non-delivery report \&quot;NotifyRead\&quot; - the user who sent the message has requested notification when a recipient first reads it \&quot;NotifyUnread\&quot; - the user who sent the message has requested notification when a recipient deletes it before reading or the Message object expires \&quot;EverRead\&quot; - the message has been read at least once      The field value (&lt;Field value&gt;) can take the following values:     For text fields - any string,     For date type fields - the string of \&quot;d-MMM-yyy\&quot; format, ex. \&quot;10-Feb-2009\&quot;,     For flags (fields of boolean type) - either \&quot;True\&quot;, or \&quot;False\&quot;              
     * @param request Holds parameters for this request invocation.
     * @return ListResponseOfString
     * @throws ApiException 
     */
    public ListResponseOfString listEmailMessages(ListEmailMessagesRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.folder' is set
        if (request.folder== null) {
            throw new ApiException(400, "Missing the required parameter 'request.folder' when calling listEmailMessages");
        }
         // verify the required parameter 'request.queryString' is set
        if (request.queryString== null) {
            throw new ApiException(400, "Missing the required parameter 'request.queryString' when calling listEmailMessages");
        }
         // verify the required parameter 'request.firstAccount' is set
        if (request.firstAccount== null) {
            throw new ApiException(400, "Missing the required parameter 'request.firstAccount' when calling listEmailMessages");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/client/ListMessages";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "queryString", request.queryString);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "firstAccount", request.firstAccount);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "secondAccount", request.secondAccount);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storageFolder", request.storageFolder);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "recursive", request.recursive);
        
                
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
        
        return SerializationHelper.deserialize(new String(response), ListResponseOfString.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Get messages from folder, filtered by query             
     * The query string should have the following view.      The example of a simple expression:       &#39;&lt;Field name&gt;&#39; &lt;Comparison operator&gt; &#39;&lt;Field value&gt;&#39;,  where &amp;lt;Field Name&amp;gt; - the name of a message field through which filtering is made, &amp;lt;Comparison operator&amp;gt; - comparison operators, as their name implies, allow to compare message field and specified value, &amp;lt;Field value&amp;gt; - value to be compared with a message field.      The number of simple expressions can make a compound one, ex.:     (&lt;Simple expression 1&gt; &amp; &lt;Simple expression 2&gt;) | &lt;Simple expression 3     &gt;,  where \&quot;&amp;amp;\&quot; - logical-AND operator, \&quot;|\&quot; - logical-OR operator      At present the following values are allowed as a field name (&lt;Field name&gt;):  \&quot;To\&quot; - represents a TO field of message, \&quot;Text\&quot; - represents string in the header or body of the message, \&quot;Bcc\&quot; - represents a BCC field of message, \&quot;Body\&quot; - represents a string in the body of message, \&quot;Cc\&quot; - represents a CC field of message, \&quot;From\&quot; - represents a From field of message, \&quot;Subject\&quot; - represents a string in the subject of message, \&quot;InternalDate\&quot; - represents an internal date of message, \&quot;SentDate\&quot; - represents a sent date of message      Additionally, the following field names are allowed for IMAP-protocol:  \&quot;Answered\&quot; - represents an /Answered flag of message \&quot;Seen\&quot; - represents a /Seen flag of message \&quot;Flagged\&quot; - represents a /Flagged flag of message \&quot;Draft\&quot; - represents a /Draft flag of message \&quot;Deleted\&quot; - represents a Deleted/ flag of message \&quot;Recent\&quot; - represents a Deleted/ flag of message \&quot;MessageSize\&quot; - represents a size (in bytes) of message      Additionally, the following field names are allowed for Exchange:  \&quot;IsRead\&quot; - Indicates whether the message has been read \&quot;HasAttachment\&quot; - Indicates whether or not the message has attachments \&quot;IsSubmitted\&quot; - Indicates whether the message has been submitted to the Outbox \&quot;ContentClass\&quot; - represents a content class of item      Additionally, the following field names are allowed for pst/ost files:  \&quot;MessageClass\&quot; - Represents a message class \&quot;ContainerClass\&quot; - Represents a folder container class \&quot;Importance\&quot; - Represents a message importance \&quot;MessageSize\&quot; - represents a size (in bytes) of message \&quot;FolderName\&quot; - represents a folder name \&quot;ContentsCount\&quot; - represents a total number of items in the folder \&quot;UnreadContentsCount\&quot; - represents the number of unread items in the folder. \&quot;Subfolders\&quot; - Indicates whether or not the folder has subfolders \&quot;Read\&quot; - the message is marked as having been read \&quot;HasAttachment\&quot; - the message has at least one attachment \&quot;Unsent\&quot; - the message is still being composed \&quot;Unmodified\&quot; - the message has not been modified since it was first saved (if unsent) or it was delivered (if sent) \&quot;FromMe\&quot; - the user receiving the message was also the user who sent the message \&quot;Resend\&quot; - the message includes a request for a resend operation with a non-delivery report \&quot;NotifyRead\&quot; - the user who sent the message has requested notification when a recipient first reads it \&quot;NotifyUnread\&quot; - the user who sent the message has requested notification when a recipient deletes it before reading or the Message object expires \&quot;EverRead\&quot; - the message has been read at least once      The field value (&lt;Field value&gt;) can take the following values:     For text fields - any string,     For date type fields - the string of \&quot;d-MMM-yyy\&quot; format, ex. \&quot;10-Feb-2009\&quot;,     For flags (fields of boolean type) - either \&quot;True\&quot;, or \&quot;False\&quot;              
     * @param request Holds parameters for this request invocation.
     * @return ListResponseOfEmailDto
     * @throws ApiException 
     */
    public ListResponseOfEmailDto listEmailModels(ListEmailModelsRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.folder' is set
        if (request.folder== null) {
            throw new ApiException(400, "Missing the required parameter 'request.folder' when calling listEmailModels");
        }
         // verify the required parameter 'request.firstAccount' is set
        if (request.firstAccount== null) {
            throw new ApiException(400, "Missing the required parameter 'request.firstAccount' when calling listEmailModels");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/client/ListMessagesModel";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "firstAccount", request.firstAccount);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "queryString", request.queryString);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "secondAccount", request.secondAccount);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storageFolder", request.storageFolder);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "recursive", request.recursive);
        
                
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
        
        return SerializationHelper.deserialize(new String(response), ListResponseOfEmailDto.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Get message threads from folder. All messages are partly fetched (without email body and other fields)             
     * 
     * @param request Holds parameters for this request invocation.
     * @return EmailThreadList
     * @throws ApiException 
     */
    public EmailThreadList listEmailThreads(ListEmailThreadsRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.folder' is set
        if (request.folder== null) {
            throw new ApiException(400, "Missing the required parameter 'request.folder' when calling listEmailThreads");
        }
         // verify the required parameter 'request.firstAccount' is set
        if (request.firstAccount== null) {
            throw new ApiException(400, "Missing the required parameter 'request.firstAccount' when calling listEmailThreads");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/client/threads";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "firstAccount", request.firstAccount);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "secondAccount", request.secondAccount);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storageFolder", request.storageFolder);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "updateFolderCache", request.updateFolderCache);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "messagesCacheLimit", request.messagesCacheLimit);
        
                
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
        
        return SerializationHelper.deserialize(new String(response), EmailThreadList.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Move message to another folder             
     * 
     * @param request Holds parameters for this request invocation.
     * @throws ApiException 
     */
    public void moveEmailMessage(MoveEmailMessageRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.request' is set
        if (request.request== null) {
            throw new ApiException(400, "Missing the required parameter 'request.request' when calling moveEmailMessage");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/client/move";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        
        String postBody = null;
        
        postBody = SerializationHelper.serialize(request.request);
        
        this.apiInvoker.invokeApi(
            resourcePath, 
            "PUT", 
            postBody, 
            null, 
            formParams);
            
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Move thread to another folder             
     * 
     * @param request Holds parameters for this request invocation.
     * @throws ApiException 
     */
    public void moveEmailThread(MoveEmailThreadRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.threadId' is set
        if (request.threadId== null) {
            throw new ApiException(400, "Missing the required parameter 'request.threadId' when calling moveEmailThread");
        }
         // verify the required parameter 'request.request' is set
        if (request.request== null) {
            throw new ApiException(400, "Missing the required parameter 'request.request' when calling moveEmailThread");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/client/threads/{threadId}/move";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "threadId", request.threadId);
        
        
        String postBody = null;
        
        postBody = SerializationHelper.serialize(request.request);
        
        this.apiInvoker.invokeApi(
            resourcePath, 
            "PUT", 
            postBody, 
            null, 
            formParams);
            
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * 
     * 
     * @param request Holds parameters for this request invocation.
     * @throws ApiException 
     */
    public void moveFile(MoveFileRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.srcPath' is set
        if (request.srcPath== null) {
            throw new ApiException(400, "Missing the required parameter 'request.srcPath' when calling moveFile");
        }
         // verify the required parameter 'request.destPath' is set
        if (request.destPath== null) {
            throw new ApiException(400, "Missing the required parameter 'request.destPath' when calling moveFile");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/storage/file/move/{srcPath}";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "srcPath", request.srcPath);
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "destPath", request.destPath);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "srcStorageName", request.srcStorageName);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "destStorageName", request.destStorageName);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "versionId", request.versionId);
        
                
        this.apiInvoker.invokeApi(
            resourcePath, 
            "PUT", 
            null, 
            null, 
            formParams);
            
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * 
     * 
     * @param request Holds parameters for this request invocation.
     * @throws ApiException 
     */
    public void moveFolder(MoveFolderRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.srcPath' is set
        if (request.srcPath== null) {
            throw new ApiException(400, "Missing the required parameter 'request.srcPath' when calling moveFolder");
        }
         // verify the required parameter 'request.destPath' is set
        if (request.destPath== null) {
            throw new ApiException(400, "Missing the required parameter 'request.destPath' when calling moveFolder");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/storage/folder/move/{srcPath}";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "srcPath", request.srcPath);
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "destPath", request.destPath);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "srcStorageName", request.srcStorageName);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "destStorageName", request.destStorageName);
        
                
        this.apiInvoker.invokeApi(
            resourcePath, 
            "PUT", 
            null, 
            null, 
            formParams);
            
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * 
     * 
     * @param request Holds parameters for this request invocation.
     * @return ObjectExist
     * @throws ApiException 
     */
    public ObjectExist objectExists(ObjectExistsRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.path' is set
        if (request.path== null) {
            throw new ApiException(400, "Missing the required parameter 'request.path' when calling objectExists");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/storage/exist/{path}";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "path", request.path);
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storageName", request.storageName);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "versionId", request.versionId);
        
                
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
        
        return SerializationHelper.deserialize(new String(response), ObjectExist.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Save iCalendar             
     * 
     * @param request Holds parameters for this request invocation.
     * @throws ApiException 
     */
    public void saveCalendarModel(SaveCalendarModelRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.name' is set
        if (request.name== null) {
            throw new ApiException(400, "Missing the required parameter 'request.name' when calling saveCalendarModel");
        }
         // verify the required parameter 'request.rq' is set
        if (request.rq== null) {
            throw new ApiException(400, "Missing the required parameter 'request.rq' when calling saveCalendarModel");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/CalendarModel/{name}";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
        
        
        String postBody = null;
        
        postBody = SerializationHelper.serialize(request.rq);
        
        this.apiInvoker.invokeApi(
            resourcePath, 
            "PUT", 
            postBody, 
            null, 
            formParams);
            
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Save contact.             
     * 
     * @param request Holds parameters for this request invocation.
     * @throws ApiException 
     */
    public void saveContactModel(SaveContactModelRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.format' is set
        if (request.format== null) {
            throw new ApiException(400, "Missing the required parameter 'request.format' when calling saveContactModel");
        }
         // verify the required parameter 'request.name' is set
        if (request.name== null) {
            throw new ApiException(400, "Missing the required parameter 'request.name' when calling saveContactModel");
        }
         // verify the required parameter 'request.rq' is set
        if (request.rq== null) {
            throw new ApiException(400, "Missing the required parameter 'request.rq' when calling saveContactModel");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/ContactModel/{format}/{name}";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "format", request.format);
        resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
        
        
        String postBody = null;
        
        postBody = SerializationHelper.serialize(request.rq);
        
        this.apiInvoker.invokeApi(
            resourcePath, 
            "PUT", 
            postBody, 
            null, 
            formParams);
            
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Create email client account file (*.account) with any of supported credentials             
     * 
     * @param request Holds parameters for this request invocation.
     * @throws ApiException 
     */
    public void saveEmailClientAccount(SaveEmailClientAccountRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.request' is set
        if (request.request== null) {
            throw new ApiException(400, "Missing the required parameter 'request.request' when calling saveEmailClientAccount");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/client/email-client-account";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        
        String postBody = null;
        
        postBody = SerializationHelper.serialize(request.request);
        
        this.apiInvoker.invokeApi(
            resourcePath, 
            "PUT", 
            postBody, 
            null, 
            formParams);
            
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Create email client multi account file (*.multi.account). Will respond error if file extension is not \&quot;.multi.account\&quot;.             
     * 
     * @param request Holds parameters for this request invocation.
     * @throws ApiException 
     */
    public void saveEmailClientMultiAccount(SaveEmailClientMultiAccountRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.request' is set
        if (request.request== null) {
            throw new ApiException(400, "Missing the required parameter 'request.request' when calling saveEmailClientMultiAccount");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/client/multi-account";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        
        String postBody = null;
        
        postBody = SerializationHelper.serialize(request.request);
        
        this.apiInvoker.invokeApi(
            resourcePath, 
            "PUT", 
            postBody, 
            null, 
            formParams);
            
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Save email document.             
     * 
     * @param request Holds parameters for this request invocation.
     * @throws ApiException 
     */
    public void saveEmailModel(SaveEmailModelRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.format' is set
        if (request.format== null) {
            throw new ApiException(400, "Missing the required parameter 'request.format' when calling saveEmailModel");
        }
         // verify the required parameter 'request.name' is set
        if (request.name== null) {
            throw new ApiException(400, "Missing the required parameter 'request.name' when calling saveEmailModel");
        }
         // verify the required parameter 'request.rq' is set
        if (request.rq== null) {
            throw new ApiException(400, "Missing the required parameter 'request.rq' when calling saveEmailModel");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/model/{format}/{name}";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "format", request.format);
        resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
        
        
        String postBody = null;
        
        postBody = SerializationHelper.serialize(request.rq);
        
        this.apiInvoker.invokeApi(
            resourcePath, 
            "PUT", 
            postBody, 
            null, 
            formParams);
            
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Create email account file (*.account) with login/password authentication             
     * 
     * @param request Holds parameters for this request invocation.
     * @throws ApiException 
     */
    public void saveMailAccount(SaveMailAccountRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.request' is set
        if (request.request== null) {
            throw new ApiException(400, "Missing the required parameter 'request.request' when calling saveMailAccount");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/client/SaveMailAccount";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        
        String postBody = null;
        
        postBody = SerializationHelper.serialize(request.request);
        
        this.apiInvoker.invokeApi(
            resourcePath, 
            "POST", 
            postBody, 
            null, 
            formParams);
            
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Create email account file (*.account) with OAuth             
     * 
     * @param request Holds parameters for this request invocation.
     * @throws ApiException 
     */
    public void saveMailOAuthAccount(SaveMailOAuthAccountRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.request' is set
        if (request.request== null) {
            throw new ApiException(400, "Missing the required parameter 'request.request' when calling saveMailOAuthAccount");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/client/SaveMailOAuthAccount";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        
        String postBody = null;
        
        postBody = SerializationHelper.serialize(request.request);
        
        this.apiInvoker.invokeApi(
            resourcePath, 
            "POST", 
            postBody, 
            null, 
            formParams);
            
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Save MAPI Calendar to storage.             
     * 
     * @param request Holds parameters for this request invocation.
     * @throws ApiException 
     */
    public void saveMapiCalendarModel(SaveMapiCalendarModelRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.name' is set
        if (request.name== null) {
            throw new ApiException(400, "Missing the required parameter 'request.name' when calling saveMapiCalendarModel");
        }
         // verify the required parameter 'request.format' is set
        if (request.format== null) {
            throw new ApiException(400, "Missing the required parameter 'request.format' when calling saveMapiCalendarModel");
        }
         // verify the required parameter 'request.rq' is set
        if (request.rq== null) {
            throw new ApiException(400, "Missing the required parameter 'request.rq' when calling saveMapiCalendarModel");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/MapiCalendar/{format}/{name}";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
        resourcePath = UrlHelper.addPathParameter(resourcePath, "format", request.format);
        
        
        String postBody = null;
        
        postBody = SerializationHelper.serialize(request.rq);
        
        this.apiInvoker.invokeApi(
            resourcePath, 
            "PUT", 
            postBody, 
            null, 
            formParams);
            
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Save contact.             
     * 
     * @param request Holds parameters for this request invocation.
     * @throws ApiException 
     */
    public void saveMapiContactModel(SaveMapiContactModelRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.format' is set
        if (request.format== null) {
            throw new ApiException(400, "Missing the required parameter 'request.format' when calling saveMapiContactModel");
        }
         // verify the required parameter 'request.name' is set
        if (request.name== null) {
            throw new ApiException(400, "Missing the required parameter 'request.name' when calling saveMapiContactModel");
        }
         // verify the required parameter 'request.rq' is set
        if (request.rq== null) {
            throw new ApiException(400, "Missing the required parameter 'request.rq' when calling saveMapiContactModel");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/MapiContact/{format}/{name}";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "format", request.format);
        resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
        
        
        String postBody = null;
        
        postBody = SerializationHelper.serialize(request.rq);
        
        this.apiInvoker.invokeApi(
            resourcePath, 
            "PUT", 
            postBody, 
            null, 
            formParams);
            
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Save MAPI message.             
     * 
     * @param request Holds parameters for this request invocation.
     * @throws ApiException 
     */
    public void saveMapiMessageModel(SaveMapiMessageModelRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.format' is set
        if (request.format== null) {
            throw new ApiException(400, "Missing the required parameter 'request.format' when calling saveMapiMessageModel");
        }
         // verify the required parameter 'request.name' is set
        if (request.name== null) {
            throw new ApiException(400, "Missing the required parameter 'request.name' when calling saveMapiMessageModel");
        }
         // verify the required parameter 'request.rq' is set
        if (request.rq== null) {
            throw new ApiException(400, "Missing the required parameter 'request.rq' when calling saveMapiMessageModel");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/MapiMessage/{format}/{name}";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "format", request.format);
        resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
        
        
        String postBody = null;
        
        postBody = SerializationHelper.serialize(request.rq);
        
        this.apiInvoker.invokeApi(
            resourcePath, 
            "PUT", 
            postBody, 
            null, 
            formParams);
            
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Send an email from *.eml file located on storage             
     * 
     * @param request Holds parameters for this request invocation.
     * @throws ApiException 
     */
    public void sendEmail(SendEmailRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.request' is set
        if (request.request== null) {
            throw new ApiException(400, "Missing the required parameter 'request.request' when calling sendEmail");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/client/Send";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        
        String postBody = null;
        
        postBody = SerializationHelper.serialize(request.request);
        
        this.apiInvoker.invokeApi(
            resourcePath, 
            "POST", 
            postBody, 
            null, 
            formParams);
            
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Send an email specified by MIME in request             
     * 
     * @param request Holds parameters for this request invocation.
     * @throws ApiException 
     */
    public void sendEmailMime(SendEmailMimeRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.request' is set
        if (request.request== null) {
            throw new ApiException(400, "Missing the required parameter 'request.request' when calling sendEmailMime");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/client/SendMime";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        
        String postBody = null;
        
        postBody = SerializationHelper.serialize(request.request);
        
        this.apiInvoker.invokeApi(
            resourcePath, 
            "POST", 
            postBody, 
            null, 
            formParams);
            
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Send an email specified by model in request             
     * 
     * @param request Holds parameters for this request invocation.
     * @throws ApiException 
     */
    public void sendEmailModel(SendEmailModelRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.rq' is set
        if (request.rq== null) {
            throw new ApiException(400, "Missing the required parameter 'request.rq' when calling sendEmailModel");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/client/SendModel";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        
        String postBody = null;
        
        postBody = SerializationHelper.serialize(request.rq);
        
        this.apiInvoker.invokeApi(
            resourcePath, 
            "POST", 
            postBody, 
            null, 
            formParams);
            
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Set email document property value             
     * 
     * @param request Holds parameters for this request invocation.
     * @return EmailPropertyResponse
     * @throws ApiException 
     */
    public EmailPropertyResponse setEmailProperty(SetEmailPropertyRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.propertyName' is set
        if (request.propertyName== null) {
            throw new ApiException(400, "Missing the required parameter 'request.propertyName' when calling setEmailProperty");
        }
         // verify the required parameter 'request.fileName' is set
        if (request.fileName== null) {
            throw new ApiException(400, "Missing the required parameter 'request.fileName' when calling setEmailProperty");
        }
         // verify the required parameter 'request.request' is set
        if (request.request== null) {
            throw new ApiException(400, "Missing the required parameter 'request.request' when calling setEmailProperty");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/{fileName}/properties/{propertyName}";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "propertyName", request.propertyName);
        resourcePath = UrlHelper.addPathParameter(resourcePath, "fileName", request.fileName);
        
        
        String postBody = null;
        
        postBody = SerializationHelper.serialize(request.request);
        
        byte[] response = this.apiInvoker.invokeApi(
            resourcePath, 
            "PUT", 
            postBody, 
            null, 
            formParams);
            
        
        if (response == null)
        {
            return null;
        }
        
        return SerializationHelper.deserialize(new String(response), EmailPropertyResponse.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Sets \&quot;Message is read\&quot; flag             
     * 
     * @param request Holds parameters for this request invocation.
     * @throws ApiException 
     */
    public void setEmailReadFlag(SetEmailReadFlagRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.request' is set
        if (request.request== null) {
            throw new ApiException(400, "Missing the required parameter 'request.request' when calling setEmailReadFlag");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/client/SetReadFlag";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        
        String postBody = null;
        
        postBody = SerializationHelper.serialize(request.request);
        
        this.apiInvoker.invokeApi(
            resourcePath, 
            "POST", 
            postBody, 
            null, 
            formParams);
            
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Mark all messages in thread as read or unread             
     * 
     * @param request Holds parameters for this request invocation.
     * @throws ApiException 
     */
    public void setEmailThreadReadFlag(SetEmailThreadReadFlagRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.threadId' is set
        if (request.threadId== null) {
            throw new ApiException(400, "Missing the required parameter 'request.threadId' when calling setEmailThreadReadFlag");
        }
         // verify the required parameter 'request.request' is set
        if (request.request== null) {
            throw new ApiException(400, "Missing the required parameter 'request.request' when calling setEmailThreadReadFlag");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/client/threads/{threadId}/read-flag";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "threadId", request.threadId);
        
        
        String postBody = null;
        
        postBody = SerializationHelper.serialize(request.request);
        
        this.apiInvoker.invokeApi(
            resourcePath, 
            "PUT", 
            postBody, 
            null, 
            formParams);
            
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * 
     * 
     * @param request Holds parameters for this request invocation.
     * @return StorageExist
     * @throws ApiException 
     */
    public StorageExist storageExists(StorageExistsRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.storageName' is set
        if (request.storageName== null) {
            throw new ApiException(400, "Missing the required parameter 'request.storageName' when calling storageExists");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/storage/{storageName}/exist";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "storageName", request.storageName);
        
        
                
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
        
        return SerializationHelper.deserialize(new String(response), StorageExist.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Update calendar file properties             
     * 
     * @param request Holds parameters for this request invocation.
     * @throws ApiException 
     */
    public void updateCalendarProperties(UpdateCalendarPropertiesRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.name' is set
        if (request.name== null) {
            throw new ApiException(400, "Missing the required parameter 'request.name' when calling updateCalendarProperties");
        }
         // verify the required parameter 'request.request' is set
        if (request.request== null) {
            throw new ApiException(400, "Missing the required parameter 'request.request' when calling updateCalendarProperties");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/Calendar/{name}/properties";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
        
        
        String postBody = null;
        
        postBody = SerializationHelper.serialize(request.request);
        
        this.apiInvoker.invokeApi(
            resourcePath, 
            "PUT", 
            postBody, 
            null, 
            formParams);
            
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Update contact document properties             
     * 
     * @param request Holds parameters for this request invocation.
     * @throws ApiException 
     */
    public void updateContactProperties(UpdateContactPropertiesRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.format' is set
        if (request.format== null) {
            throw new ApiException(400, "Missing the required parameter 'request.format' when calling updateContactProperties");
        }
         // verify the required parameter 'request.name' is set
        if (request.name== null) {
            throw new ApiException(400, "Missing the required parameter 'request.name' when calling updateContactProperties");
        }
         // verify the required parameter 'request.request' is set
        if (request.request== null) {
            throw new ApiException(400, "Missing the required parameter 'request.request' when calling updateContactProperties");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/Contact/{format}/{name}/properties";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "format", request.format);
        resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
        
        
        String postBody = null;
        
        postBody = SerializationHelper.serialize(request.request);
        
        this.apiInvoker.invokeApi(
            resourcePath, 
            "PUT", 
            postBody, 
            null, 
            formParams);
            
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * Update document properties             
     * 
     * @param request Holds parameters for this request invocation.
     * @throws ApiException 
     */
    public void updateMapiProperties(UpdateMapiPropertiesRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.name' is set
        if (request.name== null) {
            throw new ApiException(400, "Missing the required parameter 'request.name' when calling updateMapiProperties");
        }
         // verify the required parameter 'request.request' is set
        if (request.request== null) {
            throw new ApiException(400, "Missing the required parameter 'request.request' when calling updateMapiProperties");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/Mapi/{name}/properties";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
        
        
        String postBody = null;
        
        postBody = SerializationHelper.serialize(request.request);
        
        this.apiInvoker.invokeApi(
            resourcePath, 
            "PUT", 
            postBody, 
            null, 
            formParams);
            
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
    /**
     * 
     * 
     * @param request Holds parameters for this request invocation.
     * @return FilesUploadResult
     * @throws ApiException 
     */
    public FilesUploadResult uploadFile(UploadFileRequestData request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.path' is set
        if (request.path== null) {
            throw new ApiException(400, "Missing the required parameter 'request.path' when calling uploadFile");
        }
         // verify the required parameter 'request.file' is set
        if (request.File== null) {
            throw new ApiException(400, "Missing the required parameter 'request.file' when calling uploadFile");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/storage/file/{path}";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "path", request.path);
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storageName", request.storageName);
        
                if (request.File != null) 
        {
            formParams.put("file", this.apiInvoker.toFileInfo(request.File, "File"));
        }
        byte[] response = this.apiInvoker.invokeApi(
            resourcePath, 
            "PUT", 
            null, 
            null, 
            formParams);
            
        
        if (response == null)
        {
            return null;
        }
        
        return SerializationHelper.deserialize(new String(response), FilesUploadResult.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
  
}

