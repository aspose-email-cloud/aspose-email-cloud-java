/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="FileApi.java">
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
 * FileApi operations.
 */
public class FileApi 
{
    /**
     * The configuration
     */
    private final Configuration Configuration;
    
    /**
     * The API invoker
     */
    private final ApiInvoker apiInvoker;
       
    FileApi(ApiInvoker apiInvoker, Configuration configuration) {
        this.Configuration = configuration;
        this.apiInvoker = apiInvoker;
    }

            
    /**
     * Copy file
     * 
     * @param request Holds parameters for this request invocation.
     * @throws ApiException API error.
     */
    public void copyFile(CopyFileRequest request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.srcPath' is set
        if (request.getSrcPath() == null) {
            throw new ApiException(400, "Missing the required parameter 'request.srcPath' when calling copyFile");
        }
         // verify the required parameter 'request.destPath' is set
        if (request.getDestPath() == null) {
            throw new ApiException(400, "Missing the required parameter 'request.destPath' when calling copyFile");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/storage/file/copy/{srcPath}";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "srcPath", request.getSrcPath());
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "destPath", request.getDestPath());
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "srcStorageName", request.getSrcStorageName());
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "destStorageName", request.getDestStorageName());
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "versionId", request.getVersionId());
        
        
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
     * Delete file
     * 
     * @param request Holds parameters for this request invocation.
     * @throws ApiException API error.
     */
    public void deleteFile(DeleteFileRequest request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.path' is set
        if (request.getPath() == null) {
            throw new ApiException(400, "Missing the required parameter 'request.path' when calling deleteFile");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/storage/file/{path}";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "path", request.getPath());
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storageName", request.getStorageName());
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "versionId", request.getVersionId());
        
        
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
     * Download file
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws ApiException API error.
     */
    public byte[] downloadFile(DownloadFileRequest request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.path' is set
        if (request.getPath() == null) {
            throw new ApiException(400, "Missing the required parameter 'request.path' when calling downloadFile");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/storage/file/{path}";
        
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
            
        return response;
        
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }

            
    /**
     * Move file
     * 
     * @param request Holds parameters for this request invocation.
     * @throws ApiException API error.
     */
    public void moveFile(MoveFileRequest request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.srcPath' is set
        if (request.getSrcPath() == null) {
            throw new ApiException(400, "Missing the required parameter 'request.srcPath' when calling moveFile");
        }
         // verify the required parameter 'request.destPath' is set
        if (request.getDestPath() == null) {
            throw new ApiException(400, "Missing the required parameter 'request.destPath' when calling moveFile");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/storage/file/move/{srcPath}";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "srcPath", request.getSrcPath());
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "destPath", request.getDestPath());
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "srcStorageName", request.getSrcStorageName());
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "destStorageName", request.getDestStorageName());
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "versionId", request.getVersionId());
        
        
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
     * Upload file
     * 
     * @param request Holds parameters for this request invocation.
     * @return FilesUploadResult
     * @throws ApiException API error.
     */
    public FilesUploadResult uploadFile(UploadFileRequest request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.path' is set
        if (request.getPath() == null) {
            throw new ApiException(400, "Missing the required parameter 'request.path' when calling uploadFile");
        }
         // verify the required parameter 'request.file' is set
        if (request.getFile() == null) {
            throw new ApiException(400, "Missing the required parameter 'request.file' when calling uploadFile");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/storage/file/{path}";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        resourcePath = UrlHelper.addPathParameter(resourcePath, "path", request.getPath());
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storageName", request.getStorageName());
        
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
        
        return SerializationHelper.deserialize(new String(response), FilesUploadResult.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }

}

