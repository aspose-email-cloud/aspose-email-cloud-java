
/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="ClientAccountApi.java">
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
 * ClientAccountApi operations.
 */
public class ClientAccountApi 
{
    /**
     * The configuration
     */
    private final Configuration Configuration;
    
    /**
     * The API invoker
     */
    private final ApiInvoker apiInvoker;
       
    ClientAccountApi(ApiInvoker apiInvoker, Configuration configuration) {
        this.Configuration = configuration;
        this.apiInvoker = apiInvoker;
    }

            
    /**
     * Get email client account from storage.             
     * 
     * @param request Holds parameters for this request invocation.
     * @return EmailClientAccount
     * @throws ApiException API error.
     */
    public EmailClientAccount get(ClientAccountGetRequest request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.fileName' is set
        if (request.getFileName() == null) {
            throw new ApiException(400, "Missing the required parameter 'request.fileName' when calling get");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/client/account";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
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
     * @throws ApiException API error.
     */
    public EmailClientMultiAccount getMulti(ClientAccountGetMultiRequest request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.fileName' is set
        if (request.getFileName() == null) {
            throw new ApiException(400, "Missing the required parameter 'request.fileName' when calling getMulti");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/client/account/multi";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
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
        
        return SerializationHelper.deserialize(new String(response), EmailClientMultiAccount.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }

            
    /**
     * Create/update email client account file (*.account) with credentials             
     * 
     * @param request Email account information
     * @throws ApiException API error.
     */
    public void save(
        ClientAccountSaveRequest request) throws ApiException 
    {
      try {
         // verify the required parameter 'request' is set
        if (request== null) {
            throw new ApiException(400, "Missing the required parameter 'request' when calling save");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/client/account";
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
     * Create email client multi account file (*.multi.account). Will respond error if file extension is not \&quot;.multi.account\&quot;.             
     * 
     * @param request Email accounts information.
     * @throws ApiException API error.
     */
    public void saveMulti(
        ClientAccountSaveMultiRequest request) throws ApiException 
    {
      try {
         // verify the required parameter 'request' is set
        if (request== null) {
            throw new ApiException(400, "Missing the required parameter 'request' when calling saveMulti");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/client/account/multi";
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

