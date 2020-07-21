
/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="ContactApi.java">
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
 * ContactApi operations.
 */
public class ContactApi 
{
    /**
     * The configuration
     */
    private final Configuration Configuration;
    
    /**
     * The API invoker
     */
    private final ApiInvoker apiInvoker;
       
    ContactApi(ApiInvoker apiInvoker, Configuration configuration) {
        this.Configuration = configuration;
        this.apiInvoker = apiInvoker;
    }

            
    /**
     * Converts contact model to specified format and returns as file             
     * 
     * @param request Contact model and format to convert
     * @return byte[]
     * @throws ApiException API error.
     */
    public byte[] AsFile(
        ContactAsFileRequest request) throws ApiException 
    {
      try {
         // verify the required parameter 'request' is set
        if (request== null) {
            throw new ApiException(400, "Missing the required parameter 'request' when calling AsFile");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/Contact/as-file";
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
     * Converts ContactDto to MapiContactDto.             
     * 
     * @param contactDto Contact model to convert
     * @return MapiContactDto
     * @throws ApiException API error.
     */
    public MapiContactDto AsMapi(
        ContactDto contactDto) throws ApiException 
    {
      try {
         // verify the required parameter 'contactDto' is set
        if (contactDto== null) {
            throw new ApiException(400, "Missing the required parameter 'contactDto' when calling AsMapi");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/Contact/as-mapi";
        String postBody = null;
        
        postBody = SerializationHelper.serialize(contactDto);
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
        
        return SerializationHelper.deserialize(new String(response), MapiContactDto.class);
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
     * @throws ApiException API error.
     */
    public byte[] Convert(ContactConvertRequest request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.toFormat' is set
        if (request.toFormat== null) {
            throw new ApiException(400, "Missing the required parameter 'request.toFormat' when calling Convert");
        }
         // verify the required parameter 'request.fromFormat' is set
        if (request.fromFormat== null) {
            throw new ApiException(400, "Missing the required parameter 'request.fromFormat' when calling Convert");
        }
         // verify the required parameter 'request.file' is set
        if (request.File== null) {
            throw new ApiException(400, "Missing the required parameter 'request.file' when calling Convert");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/Contact/convert";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "toFormat", request.toFormat);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "fromFormat", request.fromFormat);
        
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
     * Converts contact document to a model representation             
     * 
     * @param request Holds parameters for this request invocation.
     * @return ContactDto
     * @throws ApiException API error.
     */
    public ContactDto FromFile(ContactFromFileRequest request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.format' is set
        if (request.format== null) {
            throw new ApiException(400, "Missing the required parameter 'request.format' when calling FromFile");
        }
         // verify the required parameter 'request.file' is set
        if (request.File== null) {
            throw new ApiException(400, "Missing the required parameter 'request.file' when calling FromFile");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/Contact/from-file";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "format", request.format);
        
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
     * Get contact document from storage.             
     * 
     * @param request Holds parameters for this request invocation.
     * @return ContactDto
     * @throws ApiException API error.
     */
    public ContactDto Get(ContactGetRequest request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.format' is set
        if (request.format== null) {
            throw new ApiException(400, "Missing the required parameter 'request.format' when calling Get");
        }
         // verify the required parameter 'request.name' is set
        if (request.name== null) {
            throw new ApiException(400, "Missing the required parameter 'request.name' when calling Get");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/Contact";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "format", request.format);
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
        
        return SerializationHelper.deserialize(new String(response), ContactDto.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }

            
    /**
     * Converts contact document from storage to specified format and returns as file             
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws ApiException API error.
     */
    public byte[] GetAsFile(ContactGetAsFileRequest request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.fileName' is set
        if (request.fileName== null) {
            throw new ApiException(400, "Missing the required parameter 'request.fileName' when calling GetAsFile");
        }
         // verify the required parameter 'request.toFormat' is set
        if (request.toFormat== null) {
            throw new ApiException(400, "Missing the required parameter 'request.toFormat' when calling GetAsFile");
        }
         // verify the required parameter 'request.fromFormat' is set
        if (request.fromFormat== null) {
            throw new ApiException(400, "Missing the required parameter 'request.fromFormat' when calling GetAsFile");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/Contact/as-file";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "fileName", request.fileName);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "toFormat", request.toFormat);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "fromFormat", request.fromFormat);
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
     * Get contact list from storage folder.             
     * 
     * @param request Holds parameters for this request invocation.
     * @return ContactStorageList
     * @throws ApiException API error.
     */
    public ContactStorageList GetList(ContactGetListRequest request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.format' is set
        if (request.format== null) {
            throw new ApiException(400, "Missing the required parameter 'request.format' when calling GetList");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/Contact/list";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "format", request.format);
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
        
        return SerializationHelper.deserialize(new String(response), ContactStorageList.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }

            
    /**
     * Save contact to storage.             
     * 
     * @param request Create/Update contact request.
     * @throws ApiException API error.
     */
    public void Save(
        ContactSaveRequest request) throws ApiException 
    {
      try {
         // verify the required parameter 'request' is set
        if (request== null) {
            throw new ApiException(400, "Missing the required parameter 'request' when calling Save");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/Contact";
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

