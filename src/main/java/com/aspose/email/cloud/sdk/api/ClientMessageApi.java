/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="ClientMessageApi.java">
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
 * ClientMessageApi operations.
 */
public class ClientMessageApi 
{
    /**
     * The configuration
     */
    private final Configuration Configuration;
    
    /**
     * The API invoker
     */
    private final ApiInvoker apiInvoker;
       
    ClientMessageApi(ApiInvoker apiInvoker, Configuration configuration) {
        this.Configuration = configuration;
        this.apiInvoker = apiInvoker;
    }

    /**
     * Add email message to specified folder in email account.             
     * 
     * @param request Append email request.
     * @return ValueTOfString
     * @throws ApiException API error.
     */
    public ValueTOfString append(
        ClientMessageAppendRequest request) throws ApiException 
    {
      try {
         // verify the required parameter 'request' is set
        if (request== null) {
            throw new ApiException(400, "Missing the required parameter 'request' when calling append");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/client/message/append";
        String postBody = null;
        
        postBody = SerializationHelper.serialize(request);
        byte[] response = this.apiInvoker.invokeApi(
            resourcePath, 
            "POST", 
            postBody, 
            null, 
            null);
            
        
        if (response == null)
        {
            return null;
        }
        
        return SerializationHelper.deserialize(new String(response), ValueTOfString.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }

    /**
     * Add email message from file to specified folder in email account.             
     * 
     * @param request Holds parameters for this request invocation.
     * @return ValueTOfString
     * @throws ApiException API error.
     */
    public ValueTOfString appendFile(ClientMessageAppendFileRequest request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.account' is set
        if (request.getAccount() == null) {
            throw new ApiException(400, "Missing the required parameter 'request.account' when calling appendFile");
        }
         // verify the required parameter 'request.file' is set
        if (request.getFile() == null) {
            throw new ApiException(400, "Missing the required parameter 'request.file' when calling appendFile");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/client/message/file/append";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "account", request.getAccount());
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.getStorage());
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "accountStorageFolder", request.getAccountStorageFolder());
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "format", request.getFormat());
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.getFolder());
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "markAsSent", request.getMarkAsSent());
        
        if (request.getFile() != null) 
        {
            formParams.put("file", this.apiInvoker.toFileInfo(request.getFile(), "File"));
        }
        byte[] response = this.apiInvoker.invokeApi(
            resourcePath, 
            "POST", 
            null, 
            null, 
            formParams);
            
        
        if (response == null)
        {
            return null;
        }
        
        return SerializationHelper.deserialize(new String(response), ValueTOfString.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }

    /**
     * Delete message.             
     * 
     * @param request Delete message request.
     * @throws ApiException API error.
     */
    public void delete(
        ClientMessageDeleteRequest request) throws ApiException 
    {
      try {
         // verify the required parameter 'request' is set
        if (request== null) {
            throw new ApiException(400, "Missing the required parameter 'request' when calling delete");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/client/message";
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
     * Fetch message from email account             
     * 
     * @param request Holds parameters for this request invocation.
     * @return MailMessageBase
     * @throws ApiException API error.
     */
    public MailMessageBase fetch(ClientMessageFetchRequest request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.messageId' is set
        if (request.getMessageId() == null) {
            throw new ApiException(400, "Missing the required parameter 'request.messageId' when calling fetch");
        }
         // verify the required parameter 'request.account' is set
        if (request.getAccount() == null) {
            throw new ApiException(400, "Missing the required parameter 'request.account' when calling fetch");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/client/message";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "messageId", request.getMessageId());
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "account", request.getAccount());
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.getFolder());
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.getStorage());
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "accountStorageFolder", request.getAccountStorageFolder());
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "type", request.getType());
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "format", request.getFormat());
        
        
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
        
        return SerializationHelper.deserialize(new String(response), MailMessageBase.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }

    /**
     * Fetch message as file from email account             
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws ApiException API error.
     */
    public byte[] fetchFile(ClientMessageFetchFileRequest request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.messageId' is set
        if (request.getMessageId() == null) {
            throw new ApiException(400, "Missing the required parameter 'request.messageId' when calling fetchFile");
        }
         // verify the required parameter 'request.account' is set
        if (request.getAccount() == null) {
            throw new ApiException(400, "Missing the required parameter 'request.account' when calling fetchFile");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/client/message/file";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "messageId", request.getMessageId());
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "account", request.getAccount());
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.getFolder());
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.getStorage());
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "accountStorageFolder", request.getAccountStorageFolder());
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "format", request.getFormat());
        
        
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
     * Get messages from folder, filtered by query             
     * The query string should have the following view.      The example of a simple expression:       &#39;&lt;Field name&gt;&#39; &lt;Comparison operator&gt; &#39;&lt;Field value&gt;&#39;,  where &amp;lt;Field Name&amp;gt; - the name of a message field through which filtering is made, &amp;lt;Comparison operator&amp;gt; - comparison operators, as their name implies, allow to compare message field and specified value, &amp;lt;Field value&amp;gt; - value to be compared with a message field.      The number of simple expressions can make a compound one, ex.:     (&lt;Simple expression 1&gt; &amp; &lt;Simple expression 2&gt;) | &lt;Simple expression 3     &gt;,  where \&quot;&amp;amp;\&quot; - logical-AND operator, \&quot;|\&quot; - logical-OR operator      At present the following values are allowed as a field name (&lt;Field name&gt;):  \&quot;To\&quot; - represents a TO field of message, \&quot;Text\&quot; - represents string in the header or body of the message, \&quot;Bcc\&quot; - represents a BCC field of message, \&quot;Body\&quot; - represents a string in the body of message, \&quot;Cc\&quot; - represents a CC field of message, \&quot;From\&quot; - represents a From field of message, \&quot;Subject\&quot; - represents a string in the subject of message, \&quot;InternalDate\&quot; - represents an internal date of message, \&quot;SentDate\&quot; - represents a sent date of message      Additionally, the following field names are allowed for IMAP-protocol:  \&quot;Answered\&quot; - represents an /Answered flag of message \&quot;Seen\&quot; - represents a /Seen flag of message \&quot;Flagged\&quot; - represents a /Flagged flag of message \&quot;Draft\&quot; - represents a /Draft flag of message \&quot;Deleted\&quot; - represents a Deleted/ flag of message \&quot;Recent\&quot; - represents a Deleted/ flag of message \&quot;MessageSize\&quot; - represents a size (in bytes) of message      Additionally, the following field names are allowed for Exchange:  \&quot;IsRead\&quot; - Indicates whether the message has been read \&quot;HasAttachment\&quot; - Indicates whether or not the message has attachments \&quot;IsSubmitted\&quot; - Indicates whether the message has been submitted to the Outbox \&quot;ContentClass\&quot; - represents a content class of item      The field value (&lt;Field value&gt;) can take the following values:     For text fields - any string,     For date type fields - the string of \&quot;d-MMM-yyy\&quot; format, ex. \&quot;10-Feb-2009\&quot;,     For flags (fields of boolean type) - either \&quot;True\&quot;, or \&quot;False\&quot;              
     * @param request Holds parameters for this request invocation.
     * @return MailMessageBaseList
     * @throws ApiException API error.
     */
    public MailMessageBaseList list(ClientMessageListRequest request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.folder' is set
        if (request.getFolder() == null) {
            throw new ApiException(400, "Missing the required parameter 'request.folder' when calling list");
        }
         // verify the required parameter 'request.account' is set
        if (request.getAccount() == null) {
            throw new ApiException(400, "Missing the required parameter 'request.account' when calling list");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/client/message/list";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.getFolder());
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "account", request.getAccount());
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "queryString", request.getQueryString());
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.getStorage());
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "accountStorageFolder", request.getAccountStorageFolder());
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "recursive", request.getRecursive());
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "type", request.getType());
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "format", request.getFormat());
        
        
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
        
        return SerializationHelper.deserialize(new String(response), MailMessageBaseList.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }

    /**
     * Move message to another folder.             
     * 
     * @param request Move message request.
     * @throws ApiException API error.
     */
    public void move(
        ClientMessageMoveRequest request) throws ApiException 
    {
      try {
         // verify the required parameter 'request' is set
        if (request== null) {
            throw new ApiException(400, "Missing the required parameter 'request' when calling move");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/client/message/move";
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
     * Send an email specified by model in request.             
     * 
     * @param request Send email request.
     * @throws ApiException API error.
     */
    public void send(
        ClientMessageSendRequest request) throws ApiException 
    {
      try {
         // verify the required parameter 'request' is set
        if (request== null) {
            throw new ApiException(400, "Missing the required parameter 'request' when calling send");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/client/message";
        String postBody = null;
        
        postBody = SerializationHelper.serialize(request);
        this.apiInvoker.invokeApi(
            resourcePath, 
            "POST", 
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
     * Send an email file.             
     * 
     * @param request Holds parameters for this request invocation.
     * @throws ApiException API error.
     */
    public void sendFile(ClientMessageSendFileRequest request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.account' is set
        if (request.getAccount() == null) {
            throw new ApiException(400, "Missing the required parameter 'request.account' when calling sendFile");
        }
         // verify the required parameter 'request.file' is set
        if (request.getFile() == null) {
            throw new ApiException(400, "Missing the required parameter 'request.file' when calling sendFile");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/client/message/file";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "account", request.getAccount());
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.getStorage());
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "accountStorageFolder", request.getAccountStorageFolder());
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "format", request.getFormat());
        
        if (request.getFile() != null) 
        {
            formParams.put("file", this.apiInvoker.toFileInfo(request.getFile(), "File"));
        }
        this.apiInvoker.invokeApi(
            resourcePath, 
            "POST", 
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
     * Mark message as read or unread.             
     * 
     * @param request Delete message request.
     * @throws ApiException API error.
     */
    public void setIsRead(
        ClientMessageSetIsReadRequest request) throws ApiException 
    {
      try {
         // verify the required parameter 'request' is set
        if (request== null) {
            throw new ApiException(400, "Missing the required parameter 'request' when calling setIsRead");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/client/message/set-is-read";
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
