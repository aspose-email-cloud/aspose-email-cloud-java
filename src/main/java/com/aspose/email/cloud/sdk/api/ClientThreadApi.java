
/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="ClientThreadApi.java">
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
 * ClientThreadApi operations.
 */
public class ClientThreadApi 
{
    /**
     * The configuration
     */
    private final Configuration Configuration;
    
    /**
     * The API invoker
     */
    private final ApiInvoker apiInvoker;
       
    ClientThreadApi(ApiInvoker apiInvoker, Configuration configuration) {
        this.Configuration = configuration;
        this.apiInvoker = apiInvoker;
    }

            
    /**
     * Delete thread by id. All messages from thread will also be deleted.             
     * 
     * @param request Delete email thread request.
     * @throws ApiException API error.
     */
    public void delete(
        ClientThreadDeleteRequest request) throws ApiException 
    {
      try {
         // verify the required parameter 'request' is set
        if (request== null) {
            throw new ApiException(400, "Missing the required parameter 'request' when calling delete");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/client/thread";
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
     * Get message threads from folder. All messages are partly fetched (without email body and some other fields).             
     * 
     * @param request Holds parameters for this request invocation.
     * @return EmailThreadList
     * @throws ApiException API error.
     */
    public EmailThreadList getList(ClientThreadGetListRequest request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.folder' is set
        if (request.folder== null) {
            throw new ApiException(400, "Missing the required parameter 'request.folder' when calling getList");
        }
         // verify the required parameter 'request.account' is set
        if (request.account== null) {
            throw new ApiException(400, "Missing the required parameter 'request.account' when calling getList");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/client/thread/list";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "account", request.account);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "accountStorageFolder", request.accountStorageFolder);
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
     * Get messages from thread by id. All messages are fully fetched. For accounts with CacheFile only cached messages will be returned.             
     * 
     * @param request Holds parameters for this request invocation.
     * @return EmailList
     * @throws ApiException API error.
     */
    public EmailList getMessages(ClientThreadGetMessagesRequest request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.threadId' is set
        if (request.threadId== null) {
            throw new ApiException(400, "Missing the required parameter 'request.threadId' when calling getMessages");
        }
         // verify the required parameter 'request.account' is set
        if (request.account== null) {
            throw new ApiException(400, "Missing the required parameter 'request.account' when calling getMessages");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/client/thread/messages";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "threadId", request.threadId);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "account", request.account);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "accountStorageFolder", request.accountStorageFolder);
        
        
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
        
        return SerializationHelper.deserialize(new String(response), EmailList.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }

            
    /**
     * Move thread to another folder.             
     * 
     * @param request Move thread request.
     * @throws ApiException API error.
     */
    public void move(
        ClientThreadMoveRequest request) throws ApiException 
    {
      try {
         // verify the required parameter 'request' is set
        if (request== null) {
            throw new ApiException(400, "Missing the required parameter 'request' when calling move");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/client/thread/move";
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
     * Mark all messages in thread as read or unread.             
     * 
     * @param request Email account specifier and IsRead flag.
     * @throws ApiException API error.
     */
    public void setIsRead(
        ClientThreadSetIsReadRequest request) throws ApiException 
    {
      try {
         // verify the required parameter 'request' is set
        if (request== null) {
            throw new ApiException(400, "Missing the required parameter 'request' when calling setIsRead");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/client/thread/set-is-read";
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

