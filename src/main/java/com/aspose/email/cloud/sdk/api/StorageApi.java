/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="StorageApi.java">
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
 * StorageApi operations.
 */
public class StorageApi 
{
    /**
     * The configuration
     */
    private final Configuration Configuration;
    
    /**
     * The API invoker
     */
    private final ApiInvoker apiInvoker;
       
    StorageApi(ApiInvoker apiInvoker, Configuration configuration) {
        this.Configuration = configuration;
        this.apiInvoker = apiInvoker;
    }

    /**
     * Get disc usage
     * 
     * @param request Holds parameters for this request invocation.
     * @return DiscUsage
     * @throws ApiException API error.
     */
    public DiscUsage getDiscUsage(GetDiscUsageRequest request) throws ApiException 
    {
      try {
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/storage/disc";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storageName", request.getStorageName());
        
        
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
     * Get file versions
     * 
     * @param request Holds parameters for this request invocation.
     * @return FileVersions
     * @throws ApiException API error.
     */
    public FileVersions getFileVersions(GetFileVersionsRequest request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.path' is set
        if (request.getPath() == null) {
            throw new ApiException(400, "Missing the required parameter 'request.path' when calling getFileVersions");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/storage/version/{path}";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "path", request.getPath());
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storageName", request.getStorageName());
        
        
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
     * Check if file or folder exists
     * 
     * @param request Holds parameters for this request invocation.
     * @return ObjectExist
     * @throws ApiException API error.
     */
    public ObjectExist objectExists(ObjectExistsRequest request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.path' is set
        if (request.getPath() == null) {
            throw new ApiException(400, "Missing the required parameter 'request.path' when calling objectExists");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/storage/exist/{path}";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "path", request.getPath());
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storageName", request.getStorageName());
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "versionId", request.getVersionId());
        
        
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
     * Check if storage exists
     * 
     * @param request Holds parameters for this request invocation.
     * @return StorageExist
     * @throws ApiException API error.
     */
    public StorageExist exists(StorageExistsRequest request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.storageName' is set
        if (request.getStorageName() == null) {
            throw new ApiException(400, "Missing the required parameter 'request.storageName' when calling exists");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/storage/{storageName}/exist";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "storageName", request.getStorageName());
        
        
        
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
}
