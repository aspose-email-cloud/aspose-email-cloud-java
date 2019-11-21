
/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="EmailApi.java">
*   Copyright (c) 2018-2019 Aspose Pty Ltd. All rights reserved.
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
     * @throws Exception 
     */
    public EmailApi(String baseUrl, String apiVersion, Boolean debugMode) throws Exception
    {
        Configuration config = new Configuration();
        config.setApiBaseUrl(baseUrl);
        config.setApiVersion(apiVersion);
        config.setDebugMode(debugMode);
        config.OnPremise = true;
        this.initEmailApi(config);
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
    public EmailApi(String appKey, String appSid, String baseUrl, String apiVersion) throws Exception
    {
        Configuration config = new Configuration();
        config.AppKey = appKey;
        config.AppSid = appSid;
        config.setApiBaseUrl(baseUrl);
        config.setApiVersion(apiVersion);
        this.initEmailApi(config);
    }

    /**
     * Initializes a new instance of the EmailApi class for Aspose Cloud-hosted service usage.
     * @param appKey The app key.
     * @param appSid The app SID.
     * @param baseUrl The base URL.
     * @param apiVersion API version.
     * @param debug If debug mode is enabled.
     */
    public EmailApi(String appKey, String appSid, String baseUrl, String apiVersion, Boolean debug) throws Exception
    {
        Configuration config = new Configuration();
        config.AppKey = appKey;
        config.AppSid = appSid;
        config.setApiBaseUrl(baseUrl);
        config.setApiVersion(apiVersion);
        config.setDebugMode(debug);
        this.initEmailApi(config);
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
     * Adds an attachment to Email document
     * 
     * @param request Holds parameters for this request invocation.
     * @return EmailDocumentResponse
     * @throws Exception 
     */
    public EmailDocumentResponse addEmailAttachment(AddEmailAttachmentRequestData request) throws Exception 
    {
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
    }
  
    /**
     * Create an email document
     * 
     * @param request Holds parameters for this request invocation.
     * @return EmailDocumentResponse
     * @throws Exception 
     */
    public EmailDocumentResponse createEmail(CreateEmailRequestData request) throws Exception 
    {
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
    }
  
    /**
     * Get email document
     * 
     * @param request Holds parameters for this request invocation.
     * @return EmailDocument
     * @throws Exception 
     */
    public EmailDocument getEmail(GetEmailRequestData request) throws Exception 
    {
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
    }
  
    /**
     * Get email attachment by name
     * 
     * @param request Holds parameters for this request invocation.
     * @return File
     * @throws Exception 
     */
    public File getEmailAttachment(GetEmailAttachmentRequestData request) throws Exception 
    {
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
          
      
      if (response == null)
      {
          return null;
      }
      
      return SerializationHelper.deserialize(new String(response), File.class);
    }
  
    /**
     * Get an email document property by its name
     * 
     * @param request Holds parameters for this request invocation.
     * @return EmailPropertyResponse
     * @throws Exception 
     */
    public EmailPropertyResponse getEmailProperty(GetEmailPropertyRequestData request) throws Exception 
    {
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
    }
  
    /**
     * Set email document property value
     * 
     * @param request Holds parameters for this request invocation.
     * @return EmailPropertyResponse
     * @throws Exception 
     */
    public EmailPropertyResponse setEmailProperty(SetEmailPropertyRequestData request) throws Exception 
    {
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
    }
  
}

