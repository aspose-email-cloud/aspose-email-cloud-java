/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="ClientFolderApi.java">
*   Copyright (c) 2018-2023 Aspose Pty Ltd. All rights reserved.
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
 * ClientFolderApi operations.
 */
public class ClientFolderApi 
{
    /**
     * The configuration
     */
    private final Configuration Configuration;
    
    /**
     * The API invoker
     */
    private final ApiInvoker apiInvoker;
       
    ClientFolderApi(ApiInvoker apiInvoker, Configuration configuration) {
        this.Configuration = configuration;
        this.apiInvoker = apiInvoker;
    }

    /**
     * Create new folder in email account             
     * 
     * @param request Create folder request
     * @throws ApiException API error.
     */
    public void create(
        ClientFolderCreateRequest request) throws ApiException 
    {
      try {
         // verify the required parameter 'request' is set
        if (request== null) {
            throw new ApiException(400, "Missing the required parameter 'request' when calling create");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/client/folder";
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

    /**
     * Delete a folder in email account             
     * 
     * @param request Delete folder request
     * @throws ApiException API error.
     */
    public void delete(
        ClientFolderDeleteRequest request) throws ApiException 
    {
      try {
         // verify the required parameter 'request' is set
        if (request== null) {
            throw new ApiException(400, "Missing the required parameter 'request' when calling delete");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/client/folder";
        String postBody = null;
        
        postBody = SerializationHelper.serialize(request);
        this.apiInvoker.invokeApi(
            resourcePath, 
            "DELETE", 
            postBody, 
            null, 
            null);
            
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
     * @return MailServerFolderList
     * @throws ApiException API error.
     */
    public MailServerFolderList getList(ClientFolderGetListRequest request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.account' is set
        if (request.getAccount() == null) {
            throw new ApiException(400, "Missing the required parameter 'request.account' when calling getList");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/client/folder/list";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "account", request.getAccount());
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.getStorage());
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "accountStorageFolder", request.getAccountStorageFolder());
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "parentFolder", request.getParentFolder());
        
        
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
        
        return SerializationHelper.deserialize(new String(response), MailServerFolderList.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }
}
