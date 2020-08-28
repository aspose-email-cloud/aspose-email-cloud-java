/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="FolderApi.java">
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
 * FolderApi operations.
 */
public class FolderApi 
{
    /**
     * The configuration
     */
    private final Configuration Configuration;
    
    /**
     * The API invoker
     */
    private final ApiInvoker apiInvoker;
       
    FolderApi(ApiInvoker apiInvoker, Configuration configuration) {
        this.Configuration = configuration;
        this.apiInvoker = apiInvoker;
    }

            
    /**
     * Copy folder
     * 
     * @param request Holds parameters for this request invocation.
     * @throws ApiException API error.
     */
    public void copyFolder(CopyFolderRequest request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.srcPath' is set
        if (request.getSrcPath() == null) {
            throw new ApiException(400, "Missing the required parameter 'request.srcPath' when calling copyFolder");
        }
         // verify the required parameter 'request.destPath' is set
        if (request.getDestPath() == null) {
            throw new ApiException(400, "Missing the required parameter 'request.destPath' when calling copyFolder");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/storage/folder/copy/{srcPath}";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "srcPath", request.getSrcPath());
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "destPath", request.getDestPath());
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "srcStorageName", request.getSrcStorageName());
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "destStorageName", request.getDestStorageName());
        
        
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
     * Create the folder
     * 
     * @param request Holds parameters for this request invocation.
     * @throws ApiException API error.
     */
    public void createFolder(CreateFolderRequest request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.path' is set
        if (request.getPath() == null) {
            throw new ApiException(400, "Missing the required parameter 'request.path' when calling createFolder");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/storage/folder/{path}";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "path", request.getPath());
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storageName", request.getStorageName());
        
        
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
     * Delete folder
     * 
     * @param request Holds parameters for this request invocation.
     * @throws ApiException API error.
     */
    public void deleteFolder(DeleteFolderRequest request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.path' is set
        if (request.getPath() == null) {
            throw new ApiException(400, "Missing the required parameter 'request.path' when calling deleteFolder");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/storage/folder/{path}";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "path", request.getPath());
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storageName", request.getStorageName());
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "recursive", request.getRecursive());
        
        
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
     * Get all files and folders within a folder
     * 
     * @param request Holds parameters for this request invocation.
     * @return FilesList
     * @throws ApiException API error.
     */
    public FilesList getFilesList(GetFilesListRequest request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.path' is set
        if (request.getPath() == null) {
            throw new ApiException(400, "Missing the required parameter 'request.path' when calling getFilesList");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/storage/folder/{path}";
        
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
        
        return SerializationHelper.deserialize(new String(response), FilesList.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }

            
    /**
     * Move folder
     * 
     * @param request Holds parameters for this request invocation.
     * @throws ApiException API error.
     */
    public void moveFolder(MoveFolderRequest request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.srcPath' is set
        if (request.getSrcPath() == null) {
            throw new ApiException(400, "Missing the required parameter 'request.srcPath' when calling moveFolder");
        }
         // verify the required parameter 'request.destPath' is set
        if (request.getDestPath() == null) {
            throw new ApiException(400, "Missing the required parameter 'request.destPath' when calling moveFolder");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/storage/folder/move/{srcPath}";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "srcPath", request.getSrcPath());
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "destPath", request.getDestPath());
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "srcStorageName", request.getSrcStorageName());
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "destStorageName", request.getDestStorageName());
        
        
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

}

