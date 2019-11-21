//part: api/ContactApi.java
/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="ContactApi.java">
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
public class ContactApi 
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
     * Initializes a new instance of the ContactApi class for on-premise deployment service usage.
     *  @param baseUrl The base URL.
     */
    public ContactApi(String baseUrl)
    {
        Configuration config = new Configuration();
        config.setApiBaseUrl(baseUrl);
        config.OnPremise = true;
        this.initContactApi(config);
    }

    /**
     * Initializes a new instance of the ContactApi class for Aspose Cloud-hosted service usage.
     * @param appKey The app key.
     * @param appSid The app SID.
     */
    public ContactApi(String appKey, String appSid)
    {
        Configuration config = new Configuration();
        config.AppKey = appKey;
        config.AppSid = appSid;
        this.initContactApi(config);
    }
    
    /**
     * Initializes a new instance of the ContactApi class for on-premise deployment service usage.
     *  @param baseUrl The base URL.
     *  @param apiVersion API version.
     *  @param debug If debug mode is enabled.
     * @throws Exception 
     */
    public ContactApi(String baseUrl, String apiVersion, Boolean debugMode) throws Exception
    {
        Configuration config = new Configuration();
        config.setApiBaseUrl(baseUrl);
        config.setApiVersion(apiVersion);
        config.setDebugMode(debugMode);
        config.OnPremise = true;
        this.initContactApi(config);
    }

    /**
     * Initializes a new instance of the ContactApi class for Aspose Cloud-hosted service usage.
     * @param appKey The app key.
     * @param appSid The app SID.
     * @param baseUrl The base URL.
     */
    public ContactApi(String appKey, String appSid, String baseUrl)
    {
        Configuration config = new Configuration();
        config.AppKey = appKey;
        config.AppSid = appSid;
        config.setApiBaseUrl(baseUrl);
        this.initContactApi(config);
    }

    /**
     * Initializes a new instance of the ContactApi class for Aspose Cloud-hosted service usage.
     * @param appKey The app key.
     * @param appSid The app SID.
     * @param baseUrl The base URL.
     * @param apiVersion API version.
     */
    public ContactApi(String appKey, String appSid, String baseUrl, String apiVersion) throws Exception
    {
        Configuration config = new Configuration();
        config.AppKey = appKey;
        config.AppSid = appSid;
        config.setApiBaseUrl(baseUrl);
        config.setApiVersion(apiVersion);
        this.initContactApi(config);
    }

    /**
     * Initializes a new instance of the ContactApi class for Aspose Cloud-hosted service usage.
     * @param appKey The app key.
     * @param appSid The app SID.
     * @param baseUrl The base URL.
     * @param apiVersion API version.
     * @param debug If debug mode is enabled.
     */
    public ContactApi(String appKey, String appSid, String baseUrl, String apiVersion, Boolean debug) throws Exception
    {
        Configuration config = new Configuration();
        config.AppKey = appKey;
        config.AppSid = appSid;
        config.setApiBaseUrl(baseUrl);
        config.setApiVersion(apiVersion);
        config.setDebugMode(debug);
        this.initContactApi(config);
    }
    
    /**
     * Initializes a new instance of the ContactApi class.
     * @param configuration Configuration settings.
     */
    private void initContactApi(Configuration configuration)
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
     * Add attachment to contact document
     * 
     * @param request Holds parameters for this request invocation.
     * @throws Exception 
     */
    public void addContactAttachment(AddContactAttachmentRequestData request) throws Exception 
    {
       // verify the required parameter 'request.format' is set
      if (request.format== null) {
        throw new ApiException(400, "Missing the required parameter 'request.format' when calling addContactAttachment");
      }
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling addContactAttachment");
      }
       // verify the required parameter 'request.attachment' is set
      if (request.attachment== null) {
        throw new ApiException(400, "Missing the required parameter 'request.attachment' when calling addContactAttachment");
      }
       // verify the required parameter 'request.request' is set
      if (request.request== null) {
        throw new ApiException(400, "Missing the required parameter 'request.request' when calling addContactAttachment");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/email/Contact/{format}/{name}/attachments/{attachment}";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "format", request.format);
      resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      resourcePath = UrlHelper.addPathParameter(resourcePath, "attachment", request.attachment);
      
      
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
     * Create contact document
     * 
     * @param request Holds parameters for this request invocation.
     * @throws Exception 
     */
    public void createContact(CreateContactRequestData request) throws Exception 
    {
       // verify the required parameter 'request.format' is set
      if (request.format== null) {
        throw new ApiException(400, "Missing the required parameter 'request.format' when calling createContact");
      }
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling createContact");
      }
       // verify the required parameter 'request.request' is set
      if (request.request== null) {
        throw new ApiException(400, "Missing the required parameter 'request.request' when calling createContact");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/email/Contact/{format}/{name}";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "format", request.format);
      resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
      
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
     * Delete property from indexed property list
     * 
     * @param request Holds parameters for this request invocation.
     * @throws Exception 
     */
    public void deleteContactProperty(DeleteContactPropertyRequestData request) throws Exception 
    {
       // verify the required parameter 'request.format' is set
      if (request.format== null) {
        throw new ApiException(400, "Missing the required parameter 'request.format' when calling deleteContactProperty");
      }
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling deleteContactProperty");
      }
       // verify the required parameter 'request.memberName' is set
      if (request.memberName== null) {
        throw new ApiException(400, "Missing the required parameter 'request.memberName' when calling deleteContactProperty");
      }
       // verify the required parameter 'request.index' is set
      if (request.index== null) {
        throw new ApiException(400, "Missing the required parameter 'request.index' when calling deleteContactProperty");
      }
       // verify the required parameter 'request.folder' is set
      if (request.folder== null) {
        throw new ApiException(400, "Missing the required parameter 'request.folder' when calling deleteContactProperty");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/email/Contact/{format}/{name}/properties/{memberName}/{index}";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "format", request.format);
      resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      resourcePath = UrlHelper.addPathParameter(resourcePath, "memberName", request.memberName);
      resourcePath = UrlHelper.addPathParameter(resourcePath, "index", request.index);
      
      
      String postBody = null;
      
      postBody = SerializationHelper.serialize(request.folder);
      
      this.apiInvoker.invokeApi(
          resourcePath, 
          "DELETE", 
          postBody, 
          null, 
          formParams);
          
    }
  
    /**
     * Get attachment file by name
     * 
     * @param request Holds parameters for this request invocation.
     * @return File
     * @throws Exception 
     */
    public File getContactAttachment(GetContactAttachmentRequestData request) throws Exception 
    {
       // verify the required parameter 'request.format' is set
      if (request.format== null) {
        throw new ApiException(400, "Missing the required parameter 'request.format' when calling getContactAttachment");
      }
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling getContactAttachment");
      }
       // verify the required parameter 'request.attachment' is set
      if (request.attachment== null) {
        throw new ApiException(400, "Missing the required parameter 'request.attachment' when calling getContactAttachment");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/email/Contact/{format}/{name}/attachments/{attachment}";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "format", request.format);
      resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      resourcePath = UrlHelper.addPathParameter(resourcePath, "attachment", request.attachment);
      
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
      
      return SerializationHelper.deserialize(new String(response), File.class);
    }
  
    /**
     * Get contact list from storage folder
     * 
     * @param request Holds parameters for this request invocation.
     * @return ListResponseOfHierarchicalObjectResponse
     * @throws Exception 
     */
    public ListResponseOfHierarchicalObjectResponse getContactList(GetContactListRequestData request) throws Exception 
    {
       // verify the required parameter 'request.format' is set
      if (request.format== null) {
        throw new ApiException(400, "Missing the required parameter 'request.format' when calling getContactList");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/email/Contact/{format}";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "format", request.format);
      
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
      
      return SerializationHelper.deserialize(new String(response), ListResponseOfHierarchicalObjectResponse.class);
    }
  
    /**
     * Get contact document properties
     * 
     * @param request Holds parameters for this request invocation.
     * @return HierarchicalObject
     * @throws Exception 
     */
    public HierarchicalObject getContactProperties(GetContactPropertiesRequestData request) throws Exception 
    {
       // verify the required parameter 'request.format' is set
      if (request.format== null) {
        throw new ApiException(400, "Missing the required parameter 'request.format' when calling getContactProperties");
      }
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling getContactProperties");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/email/Contact/{format}/{name}/properties";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "format", request.format);
      resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
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
      
      return SerializationHelper.deserialize(new String(response), HierarchicalObject.class);
    }
  
    /**
     * Update contact document properties
     * 
     * @param request Holds parameters for this request invocation.
     * @throws Exception 
     */
    public void updateContactProperties(UpdateContactPropertiesRequestData request) throws Exception 
    {
       // verify the required parameter 'request.format' is set
      if (request.format== null) {
        throw new ApiException(400, "Missing the required parameter 'request.format' when calling updateContactProperties");
      }
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling updateContactProperties");
      }
       // verify the required parameter 'request.request' is set
      if (request.request== null) {
        throw new ApiException(400, "Missing the required parameter 'request.request' when calling updateContactProperties");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/email/Contact/{format}/{name}/properties";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "format", request.format);
      resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
      
      String postBody = null;
      
      postBody = SerializationHelper.serialize(request.request);
      
      this.apiInvoker.invokeApi(
          resourcePath, 
          "PUT", 
          postBody, 
          null, 
          formParams);
          
    }
  
}

//part: model/requests/AddContactAttachmentRequestData.java
/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="AddContactAttachmentRequestData.java">
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
* Class that holds parameters for ContactApi.addContactAttachment request invocation.
**/   
public class AddContactAttachmentRequestData
{
    /**
    * Initializes a new instance of the AddContactAttachmentRequestData class.   
    * @param format Contact document format
    * @param name Contact document file name
    * @param attachment Attachment name
    * @param request Add attachment request
    **/
    public AddContactAttachmentRequestData(String format, String name, String attachment, AddAttachmentRequest request)             
    {
        this.format = format;
        this.name = name;
        this.attachment = attachment;
        this.request = request;
    }
        
    /**
    * Contact document format
    **/
    public String format;

    /**
    * Contact document file name
    **/
    public String name;

    /**
    * Attachment name
    **/
    public String attachment;

    /**
    * Add attachment request
    **/
    public AddAttachmentRequest request;
}

//part: model/requests/CreateContactRequestData.java
/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="CreateContactRequestData.java">
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
* Class that holds parameters for ContactApi.createContact request invocation.
**/   
public class CreateContactRequestData
{
    /**
    * Initializes a new instance of the CreateContactRequestData class.   
    * @param format Contact document format
    * @param name Contact document file name
    * @param request Create contact request
    **/
    public CreateContactRequestData(String format, String name, HierarchicalObjectRequest request)             
    {
        this.format = format;
        this.name = name;
        this.request = request;
    }
        
    /**
    * Contact document format
    **/
    public String format;

    /**
    * Contact document file name
    **/
    public String name;

    /**
    * Create contact request
    **/
    public HierarchicalObjectRequest request;
}

//part: model/requests/DeleteContactPropertyRequestData.java
/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="DeleteContactPropertyRequestData.java">
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
* Class that holds parameters for ContactApi.deleteContactProperty request invocation.
**/   
public class DeleteContactPropertyRequestData
{
    /**
    * Initializes a new instance of the DeleteContactPropertyRequestData class.   
    * @param format Contact document format
    * @param name Contact document file name
    * @param memberName Indexed property name
    * @param index Property index
    * @param folder Calendar document location in storage information
    **/
    public DeleteContactPropertyRequestData(String format, String name, String memberName, Integer index, StorageFolderLocation folder)             
    {
        this.format = format;
        this.name = name;
        this.memberName = memberName;
        this.index = index;
        this.folder = folder;
    }
        
    /**
    * Contact document format
    **/
    public String format;

    /**
    * Contact document file name
    **/
    public String name;

    /**
    * Indexed property name
    **/
    public String memberName;

    /**
    * Property index
    **/
    public Integer index;

    /**
    * Calendar document location in storage information
    **/
    public StorageFolderLocation folder;
}

//part: model/requests/GetContactAttachmentRequestData.java
/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="GetContactAttachmentRequestData.java">
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
* Class that holds parameters for ContactApi.getContactAttachment request invocation.
**/   
public class GetContactAttachmentRequestData
{
    /**
    * Initializes a new instance of the GetContactAttachmentRequestData class.   
    * @param format Contact document format
    * @param name Contact document file name
    * @param attachment Attachment name or index
    * @param folder Path to folder in storage
    * @param storage Storage name
    **/
    public GetContactAttachmentRequestData(String format, String name, String attachment, String folder, String storage)             
    {
        this.format = format;
        this.name = name;
        this.attachment = attachment;
        this.folder = folder;
        this.storage = storage;
    }
        
    /**
    * Contact document format
    **/
    public String format;

    /**
    * Contact document file name
    **/
    public String name;

    /**
    * Attachment name or index
    **/
    public String attachment;

    /**
    * Path to folder in storage
    **/
    public String folder;

    /**
    * Storage name
    **/
    public String storage;
}

//part: model/requests/GetContactListRequestData.java
/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="GetContactListRequestData.java">
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
* Class that holds parameters for ContactApi.getContactList request invocation.
**/   
public class GetContactListRequestData
{
    /**
    * Initializes a new instance of the GetContactListRequestData class.   
    * @param format Contact document format
    * @param folder Path to folder in storage
    * @param storage Storage name
    * @param itemsPerPage Count of items on page
    * @param pageNumber Page number
    **/
    public GetContactListRequestData(String format, String folder, String storage, Integer itemsPerPage, Integer pageNumber)             
    {
        this.format = format;
        this.folder = folder;
        this.storage = storage;
        this.itemsPerPage = itemsPerPage;
        this.pageNumber = pageNumber;
    }
        
    /**
    * Contact document format
    **/
    public String format;

    /**
    * Path to folder in storage
    **/
    public String folder;

    /**
    * Storage name
    **/
    public String storage;

    /**
    * Count of items on page
    **/
    public Integer itemsPerPage;

    /**
    * Page number
    **/
    public Integer pageNumber;
}

//part: model/requests/GetContactPropertiesRequestData.java
/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="GetContactPropertiesRequestData.java">
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
* Class that holds parameters for ContactApi.getContactProperties request invocation.
**/   
public class GetContactPropertiesRequestData
{
    /**
    * Initializes a new instance of the GetContactPropertiesRequestData class.   
    * @param format Contact document format
    * @param name Contact document file name
    * @param folder Path to folder in storage
    * @param storage Storage name
    **/
    public GetContactPropertiesRequestData(String format, String name, String folder, String storage)             
    {
        this.format = format;
        this.name = name;
        this.folder = folder;
        this.storage = storage;
    }
        
    /**
    * Contact document format
    **/
    public String format;

    /**
    * Contact document file name
    **/
    public String name;

    /**
    * Path to folder in storage
    **/
    public String folder;

    /**
    * Storage name
    **/
    public String storage;
}

//part: model/requests/UpdateContactPropertiesRequestData.java
/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="UpdateContactPropertiesRequestData.java">
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
* Class that holds parameters for ContactApi.updateContactProperties request invocation.
**/   
public class UpdateContactPropertiesRequestData
{
    /**
    * Initializes a new instance of the UpdateContactPropertiesRequestData class.   
    * @param format Contact document format
    * @param name Contact document file name
    * @param request Properties that should be updated/added
    **/
    public UpdateContactPropertiesRequestData(String format, String name, HierarchicalObjectRequest request)             
    {
        this.format = format;
        this.name = name;
        this.request = request;
    }
        
    /**
    * Contact document format
    **/
    public String format;

    /**
    * Contact document file name
    **/
    public String name;

    /**
    * Properties that should be updated/added
    **/
    public HierarchicalObjectRequest request;
}
