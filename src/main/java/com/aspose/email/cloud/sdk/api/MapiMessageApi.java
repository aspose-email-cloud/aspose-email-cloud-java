/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MapiMessageApi.java">
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
 * MapiMessageApi operations.
 */
public class MapiMessageApi 
{
    /**
     * The configuration
     */
    private final Configuration Configuration;
    
    /**
     * The API invoker
     */
    private final ApiInvoker apiInvoker;
       
    MapiMessageApi(ApiInvoker apiInvoker, Configuration configuration) {
        this.Configuration = configuration;
        this.apiInvoker = apiInvoker;
    }

    /**
     * Converts MAPI message model to EmailDto model             
     * 
     * @param mapiMessage MAPI message model to convert
     * @return EmailDto
     * @throws ApiException API error.
     */
    public EmailDto asEmailDto(
        MapiMessageDto mapiMessage) throws ApiException 
    {
      try {
         // verify the required parameter 'mapiMessage' is set
        if (mapiMessage== null) {
            throw new ApiException(400, "Missing the required parameter 'mapiMessage' when calling asEmailDto");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/MapiMessage/as-email-dto";
        String postBody = null;
        
        postBody = SerializationHelper.serialize(mapiMessage);
        byte[] response = this.apiInvoker.invokeApi(
            resourcePath, 
            "PUT", 
            postBody, 
            null, 
            null);
            
        
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
     * Converts MAPI message model to specified format and returns as file.             
     * 
     * @param request MAPI message model to convert.
     * @return byte[]
     * @throws ApiException API error.
     */
    public byte[] asFile(
        MapiMessageAsFileRequest request) throws ApiException 
    {
      try {
         // verify the required parameter 'request' is set
        if (request== null) {
            throw new ApiException(400, "Missing the required parameter 'request' when calling asFile");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/MapiMessage/as-file";
        String postBody = null;
        
        postBody = SerializationHelper.serialize(request);
        byte[] response = this.apiInvoker.invokeApi(
            resourcePath, 
            "PUT", 
            postBody, 
            null, 
            null);
            
        return response;
        
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
     * @throws ApiException API error.
     */
    public MapiMessageDto fromFile(MapiMessageFromFileRequest request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.format' is set
        if (request.getFormat() == null) {
            throw new ApiException(400, "Missing the required parameter 'request.format' when calling fromFile");
        }
         // verify the required parameter 'request.file' is set
        if (request.getFile() == null) {
            throw new ApiException(400, "Missing the required parameter 'request.file' when calling fromFile");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/MapiMessage/from-file";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "format", request.getFormat());
        
        if (request.getFile() != null) 
        {
            formParams.put("file", this.apiInvoker.toFileInfo(request.getFile(), "File"));
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
     * Get MAPI message document.             
     * 
     * @param request Holds parameters for this request invocation.
     * @return MapiMessageDto
     * @throws ApiException API error.
     */
    public MapiMessageDto get(MapiMessageGetRequest request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.format' is set
        if (request.getFormat() == null) {
            throw new ApiException(400, "Missing the required parameter 'request.format' when calling get");
        }
         // verify the required parameter 'request.fileName' is set
        if (request.getFileName() == null) {
            throw new ApiException(400, "Missing the required parameter 'request.fileName' when calling get");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/MapiMessage";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "format", request.getFormat());
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "fileName", request.getFileName());
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.getFolder());
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.getStorage());
        
        
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
     * Save MAPI message to storage.             
     * 
     * @param request Message create/update request.
     * @throws ApiException API error.
     */
    public void save(
        MapiMessageSaveRequest request) throws ApiException 
    {
      try {
         // verify the required parameter 'request' is set
        if (request== null) {
            throw new ApiException(400, "Missing the required parameter 'request' when calling save");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/MapiMessage";
        String postBody = null;
        
        postBody = SerializationHelper.serialize(request);
        this.apiInvoker.invokeApi(
            resourcePath, 
            "PUT", 
            postBody, 
            null, 
            null);
            
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
}
