//part: api/EmailClientApi.java
/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="EmailClientApi.java">
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
public class EmailClientApi 
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
     * Initializes a new instance of the EmailClientApi class for on-premise deployment service usage.
     *  @param baseUrl The base URL.
     */
    public EmailClientApi(String baseUrl)
    {
        Configuration config = new Configuration();
        config.setApiBaseUrl(baseUrl);
        config.OnPremise = true;
        this.initEmailClientApi(config);
    }

    /**
     * Initializes a new instance of the EmailClientApi class for Aspose Cloud-hosted service usage.
     * @param appKey The app key.
     * @param appSid The app SID.
     */
    public EmailClientApi(String appKey, String appSid)
    {
        Configuration config = new Configuration();
        config.AppKey = appKey;
        config.AppSid = appSid;
        this.initEmailClientApi(config);
    }
    
    /**
     * Initializes a new instance of the EmailClientApi class for on-premise deployment service usage.
     *  @param baseUrl The base URL.
     *  @param apiVersion API version.
     *  @param debug If debug mode is enabled.
     * @throws Exception 
     */
    public EmailClientApi(String baseUrl, String apiVersion, Boolean debugMode) throws Exception
    {
        Configuration config = new Configuration();
        config.setApiBaseUrl(baseUrl);
        config.setApiVersion(apiVersion);
        config.setDebugMode(debugMode);
        config.OnPremise = true;
        this.initEmailClientApi(config);
    }

    /**
     * Initializes a new instance of the EmailClientApi class for Aspose Cloud-hosted service usage.
     * @param appKey The app key.
     * @param appSid The app SID.
     * @param baseUrl The base URL.
     */
    public EmailClientApi(String appKey, String appSid, String baseUrl)
    {
        Configuration config = new Configuration();
        config.AppKey = appKey;
        config.AppSid = appSid;
        config.setApiBaseUrl(baseUrl);
        this.initEmailClientApi(config);
    }

    /**
     * Initializes a new instance of the EmailClientApi class for Aspose Cloud-hosted service usage.
     * @param appKey The app key.
     * @param appSid The app SID.
     * @param baseUrl The base URL.
     * @param apiVersion API version.
     */
    public EmailClientApi(String appKey, String appSid, String baseUrl, String apiVersion) throws Exception
    {
        Configuration config = new Configuration();
        config.AppKey = appKey;
        config.AppSid = appSid;
        config.setApiBaseUrl(baseUrl);
        config.setApiVersion(apiVersion);
        this.initEmailClientApi(config);
    }

    /**
     * Initializes a new instance of the EmailClientApi class for Aspose Cloud-hosted service usage.
     * @param appKey The app key.
     * @param appSid The app SID.
     * @param baseUrl The base URL.
     * @param apiVersion API version.
     * @param debug If debug mode is enabled.
     */
    public EmailClientApi(String appKey, String appSid, String baseUrl, String apiVersion, Boolean debug) throws Exception
    {
        Configuration config = new Configuration();
        config.AppKey = appKey;
        config.AppSid = appSid;
        config.setApiBaseUrl(baseUrl);
        config.setApiVersion(apiVersion);
        config.setDebugMode(debug);
        this.initEmailClientApi(config);
    }
    
    /**
     * Initializes a new instance of the EmailClientApi class.
     * @param configuration Configuration settings.
     */
    private void initEmailClientApi(Configuration configuration)
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
     * Adds an email from *.eml file to specified folder in email account
     * 
     * @param request Holds parameters for this request invocation.
     * @return EmailPropertyResponse
     * @throws Exception 
     */
    public EmailPropertyResponse appendEmailMessage(AppendEmailMessageRequestData request) throws Exception 
    {
       // verify the required parameter 'request.request' is set
      if (request.request== null) {
        throw new ApiException(400, "Missing the required parameter 'request.request' when calling appendEmailMessage");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/email/client/Append";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      
      
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
  
    /**
     * Adds an email from MIME to specified folder in email account
     * 
     * @param request Holds parameters for this request invocation.
     * @return ValueResponse
     * @throws Exception 
     */
    public ValueResponse appendMimeMessage(AppendMimeMessageRequestData request) throws Exception 
    {
       // verify the required parameter 'request.request' is set
      if (request.request== null) {
        throw new ApiException(400, "Missing the required parameter 'request.request' when calling appendMimeMessage");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/email/client/AppendMime";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      
      
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
      
      return SerializationHelper.deserialize(new String(response), ValueResponse.class);
    }
  
    /**
     * Create new folder in email account
     * 
     * @param request Holds parameters for this request invocation.
     * @throws Exception 
     */
    public void createEmailFolder(CreateEmailFolderRequestData request) throws Exception 
    {
       // verify the required parameter 'request.request' is set
      if (request.request== null) {
        throw new ApiException(400, "Missing the required parameter 'request.request' when calling createEmailFolder");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/email/client/CreateFolder";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      
      
      String postBody = null;
      
      postBody = SerializationHelper.serialize(request.request);
      
      this.apiInvoker.invokeApi(
          resourcePath, 
          "PUT", 
          postBody, 
          null, 
          formParams);
          
    }
  
    /**
     * Delete a folder in email account
     * 
     * @param request Holds parameters for this request invocation.
     * @throws Exception 
     */
    public void deleteEmailFolder(DeleteEmailFolderRequestData request) throws Exception 
    {
       // verify the required parameter 'request.request' is set
      if (request.request== null) {
        throw new ApiException(400, "Missing the required parameter 'request.request' when calling deleteEmailFolder");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/email/client/DeleteFolder";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      
      
      String postBody = null;
      
      postBody = SerializationHelper.serialize(request.request);
      
      this.apiInvoker.invokeApi(
          resourcePath, 
          "DELETE", 
          postBody, 
          null, 
          formParams);
          
    }
  
    /**
     * Delete message from email account by id
     * 
     * @param request Holds parameters for this request invocation.
     * @throws Exception 
     */
    public void deleteEmailMessage(DeleteEmailMessageRequestData request) throws Exception 
    {
       // verify the required parameter 'request.request' is set
      if (request.request== null) {
        throw new ApiException(400, "Missing the required parameter 'request.request' when calling deleteEmailMessage");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/email/client/DeleteMessage";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      
      
      String postBody = null;
      
      postBody = SerializationHelper.serialize(request.request);
      
      this.apiInvoker.invokeApi(
          resourcePath, 
          "DELETE", 
          postBody, 
          null, 
          formParams);
          
    }
  
    /**
     * Fetch message mime from email account
     * 
     * @param request Holds parameters for this request invocation.
     * @return MimeResponse
     * @throws Exception 
     */
    public MimeResponse fetchEmailMessage(FetchEmailMessageRequestData request) throws Exception 
    {
       // verify the required parameter 'request.messageId' is set
      if (request.messageId== null) {
        throw new ApiException(400, "Missing the required parameter 'request.messageId' when calling fetchEmailMessage");
      }
       // verify the required parameter 'request.firstAccount' is set
      if (request.firstAccount== null) {
        throw new ApiException(400, "Missing the required parameter 'request.firstAccount' when calling fetchEmailMessage");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/email/client/Fetch";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "messageId", request.messageId);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "firstAccount", request.firstAccount);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "secondAccount", request.secondAccount);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storageFolder", request.storageFolder);
      
            
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
      
      return SerializationHelper.deserialize(new String(response), MimeResponse.class);
    }
  
    /**
     * Get folders list in email account
     * 
     * @param request Holds parameters for this request invocation.
     * @return ListResponseOfMailServerFolder
     * @throws Exception 
     */
    public ListResponseOfMailServerFolder listEmailFolders(ListEmailFoldersRequestData request) throws Exception 
    {
       // verify the required parameter 'request.firstAccount' is set
      if (request.firstAccount== null) {
        throw new ApiException(400, "Missing the required parameter 'request.firstAccount' when calling listEmailFolders");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/email/client/ListFolders";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "firstAccount", request.firstAccount);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "secondAccount", request.secondAccount);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storageFolder", request.storageFolder);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "parentFolder", request.parentFolder);
      
            
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
      
      return SerializationHelper.deserialize(new String(response), ListResponseOfMailServerFolder.class);
    }
  
    /**
     * Get messages from folder, filtered by query
     * The query string should have the following view.  The example of a simple expression:   &#39;&lt;Field name&gt;&#39; &lt;Comparison operator&gt; &#39;&lt;Field value&gt;&#39;,  where &amp;lt;Field Name&amp;gt; - the name of a message field through which filtering is made, &amp;lt;Comparison operator&amp;gt; - comparison operators, as their name implies, allow to compare message field and specified value, &amp;lt;Field value&amp;gt; - value to be compared with a message field.  The number of simple expressions can make a compound one, ex.: (&lt;Simple expression 1&gt; &amp; &lt;Simple expression 2&gt;) | &lt;Simple expression 3&gt;,  where \&quot;&amp;amp;\&quot; - logical-AND operator, \&quot;|\&quot; - logical-OR operator  At present the following values are allowed as a field name (&lt;Field name&gt;):  \&quot;To\&quot; - represents a TO field of message, \&quot;Text\&quot; - represents string in the header or body of the message, \&quot;Bcc\&quot; - represents a BCC field of message, \&quot;Body\&quot; - represents a string in the body of message, \&quot;Cc\&quot; - represents a CC field of message, \&quot;From\&quot; - represents a From field of message, \&quot;Subject\&quot; - represents a string in the subject of message, \&quot;InternalDate\&quot; - represents an internal date of message, \&quot;SentDate\&quot; - represents a sent date of message  Additionally, the following field names are allowed for IMAP-protocol:  \&quot;Answered\&quot; - represents an /Answered flag of message \&quot;Seen\&quot; - represents a /Seen flag of message \&quot;Flagged\&quot; - represents a /Flagged flag of message \&quot;Draft\&quot; - represents a /Draft flag of message \&quot;Deleted\&quot; - represents a Deleted/ flag of message \&quot;Recent\&quot; - represents a Deleted/ flag of message \&quot;MessageSize\&quot; - represents a size (in bytes) of message  Additionally, the following field names are allowed for Exchange:  \&quot;IsRead\&quot; - Indicates whether the message has been read \&quot;HasAttachment\&quot; - Indicates whether or not the message has attachments \&quot;IsSubmitted\&quot; - Indicates whether the message has been submitted to the Outbox \&quot;ContentClass\&quot; - represents a content class of item  Additionally, the following field names are allowed for pst/ost files:  \&quot;MessageClass\&quot; - Represents a message class \&quot;ContainerClass\&quot; - Represents a folder container class \&quot;Importance\&quot; - Represents a message importance \&quot;MessageSize\&quot; - represents a size (in bytes) of message \&quot;FolderName\&quot; - represents a folder name \&quot;ContentsCount\&quot; - represents a total number of items in the folder \&quot;UnreadContentsCount\&quot; - represents the number of unread items in the folder. \&quot;Subfolders\&quot; - Indicates whether or not the folder has subfolders \&quot;Read\&quot; - the message is marked as having been read \&quot;HasAttachment\&quot; - the message has at least one attachment \&quot;Unsent\&quot; - the message is still being composed \&quot;Unmodified\&quot; - the message has not been modified since it was first saved (if unsent) or it was delivered (if sent) \&quot;FromMe\&quot; - the user receiving the message was also the user who sent the message \&quot;Resend\&quot; - the message includes a request for a resend operation with a non-delivery report \&quot;NotifyRead\&quot; - the user who sent the message has requested notification when a recipient first reads it \&quot;NotifyUnread\&quot; - the user who sent the message has requested notification when a recipient deletes it before reading or the Message object expires \&quot;EverRead\&quot; - the message has been read at least once  The field value (&lt;Field value&gt;) can take the following values: For text fields - any string, For date type fields - the string of \&quot;d-MMM-yyy\&quot; format, ex. \&quot;10-Feb-2009\&quot;, For flags (fields of boolean type) - either \&quot;True\&quot;, or \&quot;False\&quot;
     * @param request Holds parameters for this request invocation.
     * @return ListResponseOfString
     * @throws Exception 
     */
    public ListResponseOfString listEmailMessages(ListEmailMessagesRequestData request) throws Exception 
    {
       // verify the required parameter 'request.folder' is set
      if (request.folder== null) {
        throw new ApiException(400, "Missing the required parameter 'request.folder' when calling listEmailMessages");
      }
       // verify the required parameter 'request.queryString' is set
      if (request.queryString== null) {
        throw new ApiException(400, "Missing the required parameter 'request.queryString' when calling listEmailMessages");
      }
       // verify the required parameter 'request.firstAccount' is set
      if (request.firstAccount== null) {
        throw new ApiException(400, "Missing the required parameter 'request.firstAccount' when calling listEmailMessages");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/email/client/ListMessages";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "queryString", request.queryString);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "firstAccount", request.firstAccount);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "secondAccount", request.secondAccount);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.storage);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storageFolder", request.storageFolder);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "recursive", request.recursive);
      
            
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
      
      return SerializationHelper.deserialize(new String(response), ListResponseOfString.class);
    }
  
    /**
     * Create email account file (*.account) with login/password authentication
     * 
     * @param request Holds parameters for this request invocation.
     * @throws Exception 
     */
    public void saveMailAccount(SaveMailAccountRequestData request) throws Exception 
    {
       // verify the required parameter 'request.request' is set
      if (request.request== null) {
        throw new ApiException(400, "Missing the required parameter 'request.request' when calling saveMailAccount");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/email/client/SaveMailAccount";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      
      
      String postBody = null;
      
      postBody = SerializationHelper.serialize(request.request);
      
      this.apiInvoker.invokeApi(
          resourcePath, 
          "POST", 
          postBody, 
          null, 
          formParams);
          
    }
  
    /**
     * Create email account file (*.account) with OAuth
     * 
     * @param request Holds parameters for this request invocation.
     * @throws Exception 
     */
    public void saveMailOAuthAccount(SaveMailOAuthAccountRequestData request) throws Exception 
    {
       // verify the required parameter 'request.request' is set
      if (request.request== null) {
        throw new ApiException(400, "Missing the required parameter 'request.request' when calling saveMailOAuthAccount");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/email/client/SaveMailOAuthAccount";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      
      
      String postBody = null;
      
      postBody = SerializationHelper.serialize(request.request);
      
      this.apiInvoker.invokeApi(
          resourcePath, 
          "POST", 
          postBody, 
          null, 
          formParams);
          
    }
  
    /**
     * Send an email from *.eml file located on storage
     * 
     * @param request Holds parameters for this request invocation.
     * @throws Exception 
     */
    public void sendEmail(SendEmailRequestData request) throws Exception 
    {
       // verify the required parameter 'request.request' is set
      if (request.request== null) {
        throw new ApiException(400, "Missing the required parameter 'request.request' when calling sendEmail");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/email/client/Send";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      
      
      String postBody = null;
      
      postBody = SerializationHelper.serialize(request.request);
      
      this.apiInvoker.invokeApi(
          resourcePath, 
          "POST", 
          postBody, 
          null, 
          formParams);
          
    }
  
    /**
     * Send an email specified by MIME in request
     * 
     * @param request Holds parameters for this request invocation.
     * @throws Exception 
     */
    public void sendEmailMime(SendEmailMimeRequestData request) throws Exception 
    {
       // verify the required parameter 'request.request' is set
      if (request.request== null) {
        throw new ApiException(400, "Missing the required parameter 'request.request' when calling sendEmailMime");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/email/client/SendMime";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      
      
      String postBody = null;
      
      postBody = SerializationHelper.serialize(request.request);
      
      this.apiInvoker.invokeApi(
          resourcePath, 
          "POST", 
          postBody, 
          null, 
          formParams);
          
    }
  
    /**
     * Sets \&quot;Message is read\&quot; flag
     * 
     * @param request Holds parameters for this request invocation.
     * @throws Exception 
     */
    public void setEmailReadFlag(SetEmailReadFlagRequestData request) throws Exception 
    {
       // verify the required parameter 'request.request' is set
      if (request.request== null) {
        throw new ApiException(400, "Missing the required parameter 'request.request' when calling setEmailReadFlag");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/email/client/SetReadFlag";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      
      
      String postBody = null;
      
      postBody = SerializationHelper.serialize(request.request);
      
      this.apiInvoker.invokeApi(
          resourcePath, 
          "POST", 
          postBody, 
          null, 
          formParams);
          
    }
  
}

//part: model/requests/AppendEmailMessageRequestData.java
/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="AppendEmailMessageRequestData.java">
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

package com.aspose.email.cloud.sdk.model.requests;
import com.aspose.email.cloud.sdk.model.*;

/**
* Class that holds parameters for EmailClientApi.appendEmailMessage request invocation.
**/   
public class AppendEmailMessageRequestData
{
    /**
    * Initializes a new instance of the AppendEmailMessageRequestData class.   
    * @param request Append email request
    **/
    public AppendEmailMessageRequestData(AppendEmailBaseRequest request)             
    {
        this.request = request;
    }
        
    /**
    * Append email request
    **/
    public AppendEmailBaseRequest request;
}

//part: model/requests/AppendMimeMessageRequestData.java
/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="AppendMimeMessageRequestData.java">
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

package com.aspose.email.cloud.sdk.model.requests;
import com.aspose.email.cloud.sdk.model.*;

/**
* Class that holds parameters for EmailClientApi.appendMimeMessage request invocation.
**/   
public class AppendMimeMessageRequestData
{
    /**
    * Initializes a new instance of the AppendMimeMessageRequestData class.   
    * @param request Append email request
    **/
    public AppendMimeMessageRequestData(AppendEmailMimeBaseRequest request)             
    {
        this.request = request;
    }
        
    /**
    * Append email request
    **/
    public AppendEmailMimeBaseRequest request;
}

//part: model/requests/CreateEmailFolderRequestData.java
/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="CreateEmailFolderRequestData.java">
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

package com.aspose.email.cloud.sdk.model.requests;
import com.aspose.email.cloud.sdk.model.*;

/**
* Class that holds parameters for EmailClientApi.createEmailFolder request invocation.
**/   
public class CreateEmailFolderRequestData
{
    /**
    * Initializes a new instance of the CreateEmailFolderRequestData class.   
    * @param request Create folder request
    **/
    public CreateEmailFolderRequestData(CreateFolderBaseRequest request)             
    {
        this.request = request;
    }
        
    /**
    * Create folder request
    **/
    public CreateFolderBaseRequest request;
}

//part: model/requests/DeleteEmailFolderRequestData.java
/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="DeleteEmailFolderRequestData.java">
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

package com.aspose.email.cloud.sdk.model.requests;
import com.aspose.email.cloud.sdk.model.*;

/**
* Class that holds parameters for EmailClientApi.deleteEmailFolder request invocation.
**/   
public class DeleteEmailFolderRequestData
{
    /**
    * Initializes a new instance of the DeleteEmailFolderRequestData class.   
    * @param request Delete folder request
    **/
    public DeleteEmailFolderRequestData(DeleteFolderBaseRequest request)             
    {
        this.request = request;
    }
        
    /**
    * Delete folder request
    **/
    public DeleteFolderBaseRequest request;
}

//part: model/requests/DeleteEmailMessageRequestData.java
/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="DeleteEmailMessageRequestData.java">
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

package com.aspose.email.cloud.sdk.model.requests;
import com.aspose.email.cloud.sdk.model.*;

/**
* Class that holds parameters for EmailClientApi.deleteEmailMessage request invocation.
**/   
public class DeleteEmailMessageRequestData
{
    /**
    * Initializes a new instance of the DeleteEmailMessageRequestData class.   
    * @param request Delete message request
    **/
    public DeleteEmailMessageRequestData(DeleteMessageBaseRequest request)             
    {
        this.request = request;
    }
        
    /**
    * Delete message request
    **/
    public DeleteMessageBaseRequest request;
}

//part: model/requests/FetchEmailMessageRequestData.java
/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="FetchEmailMessageRequestData.java">
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

package com.aspose.email.cloud.sdk.model.requests;
import com.aspose.email.cloud.sdk.model.*;

/**
* Class that holds parameters for EmailClientApi.fetchEmailMessage request invocation.
**/   
public class FetchEmailMessageRequestData
{
    /**
    * Initializes a new instance of the FetchEmailMessageRequestData class.   
    * @param messageId Message identifier
    * @param firstAccount Email account
    * @param secondAccount Additional email account (should be specified for POP/IMAP accounts and should be SMTP account)
    * @param storage Storage name where account file(s) located
    * @param storageFolder Folder in storage where account file(s) located
    **/
    public FetchEmailMessageRequestData(String messageId, String firstAccount, String secondAccount, String storage, String storageFolder)             
    {
        this.messageId = messageId;
        this.firstAccount = firstAccount;
        this.secondAccount = secondAccount;
        this.storage = storage;
        this.storageFolder = storageFolder;
    }
        
    /**
    * Message identifier
    **/
    public String messageId;

    /**
    * Email account
    **/
    public String firstAccount;

    /**
    * Additional email account (should be specified for POP/IMAP accounts and should be SMTP account)
    **/
    public String secondAccount;

    /**
    * Storage name where account file(s) located
    **/
    public String storage;

    /**
    * Folder in storage where account file(s) located
    **/
    public String storageFolder;
}

//part: model/requests/ListEmailFoldersRequestData.java
/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="ListEmailFoldersRequestData.java">
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

package com.aspose.email.cloud.sdk.model.requests;
import com.aspose.email.cloud.sdk.model.*;

/**
* Class that holds parameters for EmailClientApi.listEmailFolders request invocation.
**/   
public class ListEmailFoldersRequestData
{
    /**
    * Initializes a new instance of the ListEmailFoldersRequestData class.   
    * @param firstAccount Email account
    * @param secondAccount Additional email account (should be specified for POP/IMAP accounts and should be SMTP account)
    * @param storage Storage name where account file(s) located
    * @param storageFolder Folder in storage where account file(s) located
    * @param parentFolder Folder in which subfolders should be listed
    **/
    public ListEmailFoldersRequestData(String firstAccount, String secondAccount, String storage, String storageFolder, String parentFolder)             
    {
        this.firstAccount = firstAccount;
        this.secondAccount = secondAccount;
        this.storage = storage;
        this.storageFolder = storageFolder;
        this.parentFolder = parentFolder;
    }
        
    /**
    * Email account
    **/
    public String firstAccount;

    /**
    * Additional email account (should be specified for POP/IMAP accounts and should be SMTP account)
    **/
    public String secondAccount;

    /**
    * Storage name where account file(s) located
    **/
    public String storage;

    /**
    * Folder in storage where account file(s) located
    **/
    public String storageFolder;

    /**
    * Folder in which subfolders should be listed
    **/
    public String parentFolder;
}

//part: model/requests/ListEmailMessagesRequestData.java
/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="ListEmailMessagesRequestData.java">
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

package com.aspose.email.cloud.sdk.model.requests;
import com.aspose.email.cloud.sdk.model.*;

/**
* Class that holds parameters for EmailClientApi.listEmailMessages request invocation.
**/   
public class ListEmailMessagesRequestData
{
    /**
    * Initializes a new instance of the ListEmailMessagesRequestData class.   
    * @param folder A folder in email account
    * @param queryString A MailQuery search string
    * @param firstAccount Email account
    * @param secondAccount Additional email account (should be specified for POP/IMAP accounts and should be SMTP account)
    * @param storage Storage name where account file(s) located
    * @param storageFolder Folder in storage where account file(s) located
    * @param recursive Specifies that should message be searched in subfolders recursively
    **/
    public ListEmailMessagesRequestData(String folder, String queryString, String firstAccount, String secondAccount, String storage, String storageFolder, Boolean recursive)             
    {
        this.folder = folder;
        this.queryString = queryString;
        this.firstAccount = firstAccount;
        this.secondAccount = secondAccount;
        this.storage = storage;
        this.storageFolder = storageFolder;
        this.recursive = recursive;
    }
        
    /**
    * A folder in email account
    **/
    public String folder;

    /**
    * A MailQuery search string
    **/
    public String queryString;

    /**
    * Email account
    **/
    public String firstAccount;

    /**
    * Additional email account (should be specified for POP/IMAP accounts and should be SMTP account)
    **/
    public String secondAccount;

    /**
    * Storage name where account file(s) located
    **/
    public String storage;

    /**
    * Folder in storage where account file(s) located
    **/
    public String storageFolder;

    /**
    * Specifies that should message be searched in subfolders recursively
    **/
    public Boolean recursive;
}

//part: model/requests/SaveMailAccountRequestData.java
/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="SaveMailAccountRequestData.java">
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

package com.aspose.email.cloud.sdk.model.requests;
import com.aspose.email.cloud.sdk.model.*;

/**
* Class that holds parameters for EmailClientApi.saveMailAccount request invocation.
**/   
public class SaveMailAccountRequestData
{
    /**
    * Initializes a new instance of the SaveMailAccountRequestData class.   
    * @param request Email account information
    **/
    public SaveMailAccountRequestData(SaveEmailAccountRequest request)             
    {
        this.request = request;
    }
        
    /**
    * Email account information
    **/
    public SaveEmailAccountRequest request;
}

//part: model/requests/SaveMailOAuthAccountRequestData.java
/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="SaveMailOAuthAccountRequestData.java">
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

package com.aspose.email.cloud.sdk.model.requests;
import com.aspose.email.cloud.sdk.model.*;

/**
* Class that holds parameters for EmailClientApi.saveMailOAuthAccount request invocation.
**/   
public class SaveMailOAuthAccountRequestData
{
    /**
    * Initializes a new instance of the SaveMailOAuthAccountRequestData class.   
    * @param request Email account information
    **/
    public SaveMailOAuthAccountRequestData(SaveOAuthEmailAccountRequest request)             
    {
        this.request = request;
    }
        
    /**
    * Email account information
    **/
    public SaveOAuthEmailAccountRequest request;
}

//part: model/requests/SendEmailRequestData.java
/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="SendEmailRequestData.java">
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

package com.aspose.email.cloud.sdk.model.requests;
import com.aspose.email.cloud.sdk.model.*;

/**
* Class that holds parameters for EmailClientApi.sendEmail request invocation.
**/   
public class SendEmailRequestData
{
    /**
    * Initializes a new instance of the SendEmailRequestData class.   
    * @param request Send email request
    **/
    public SendEmailRequestData(SendEmailBaseRequest request)             
    {
        this.request = request;
    }
        
    /**
    * Send email request
    **/
    public SendEmailBaseRequest request;
}

//part: model/requests/SendEmailMimeRequestData.java
/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="SendEmailMimeRequestData.java">
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

package com.aspose.email.cloud.sdk.model.requests;
import com.aspose.email.cloud.sdk.model.*;

/**
* Class that holds parameters for EmailClientApi.sendEmailMime request invocation.
**/   
public class SendEmailMimeRequestData
{
    /**
    * Initializes a new instance of the SendEmailMimeRequestData class.   
    * @param request Send email request
    **/
    public SendEmailMimeRequestData(SendEmailMimeBaseRequest request)             
    {
        this.request = request;
    }
        
    /**
    * Send email request
    **/
    public SendEmailMimeBaseRequest request;
}

//part: model/requests/SetEmailReadFlagRequestData.java
/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="SetEmailReadFlagRequestData.java">
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

package com.aspose.email.cloud.sdk.model.requests;
import com.aspose.email.cloud.sdk.model.*;

/**
* Class that holds parameters for EmailClientApi.setEmailReadFlag request invocation.
**/   
public class SetEmailReadFlagRequestData
{
    /**
    * Initializes a new instance of the SetEmailReadFlagRequestData class.   
    * @param request Message is read request
    **/
    public SetEmailReadFlagRequestData(SetMessageReadFlagAccountBaseRequest request)             
    {
        this.request = request;
    }
        
    /**
    * Message is read request
    **/
    public SetMessageReadFlagAccountBaseRequest request;
}
