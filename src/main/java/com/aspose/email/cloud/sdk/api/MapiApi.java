//part: api/MapiApi.java
/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MapiApi.java">
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
public class MapiApi 
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
     * Initializes a new instance of the MapiApi class for on-premise deployment service usage.
     *  @param baseUrl The base URL.
     */
    public MapiApi(String baseUrl)
    {
        Configuration config = new Configuration();
        config.setApiBaseUrl(baseUrl);
        config.OnPremise = true;
        this.initMapiApi(config);
    }

    /**
     * Initializes a new instance of the MapiApi class for Aspose Cloud-hosted service usage.
     * @param appKey The app key.
     * @param appSid The app SID.
     */
    public MapiApi(String appKey, String appSid)
    {
        Configuration config = new Configuration();
        config.AppKey = appKey;
        config.AppSid = appSid;
        this.initMapiApi(config);
    }
    
    /**
     * Initializes a new instance of the MapiApi class for on-premise deployment service usage.
     *  @param baseUrl The base URL.
     *  @param apiVersion API version.
     *  @param debug If debug mode is enabled.
     * @throws Exception 
     */
    public MapiApi(String baseUrl, String apiVersion, Boolean debugMode) throws Exception
    {
        Configuration config = new Configuration();
        config.setApiBaseUrl(baseUrl);
        config.setApiVersion(apiVersion);
        config.setDebugMode(debugMode);
        config.OnPremise = true;
        this.initMapiApi(config);
    }

    /**
     * Initializes a new instance of the MapiApi class for Aspose Cloud-hosted service usage.
     * @param appKey The app key.
     * @param appSid The app SID.
     * @param baseUrl The base URL.
     */
    public MapiApi(String appKey, String appSid, String baseUrl)
    {
        Configuration config = new Configuration();
        config.AppKey = appKey;
        config.AppSid = appSid;
        config.setApiBaseUrl(baseUrl);
        this.initMapiApi(config);
    }

    /**
     * Initializes a new instance of the MapiApi class for Aspose Cloud-hosted service usage.
     * @param appKey The app key.
     * @param appSid The app SID.
     * @param baseUrl The base URL.
     * @param apiVersion API version.
     */
    public MapiApi(String appKey, String appSid, String baseUrl, String apiVersion) throws Exception
    {
        Configuration config = new Configuration();
        config.AppKey = appKey;
        config.AppSid = appSid;
        config.setApiBaseUrl(baseUrl);
        config.setApiVersion(apiVersion);
        this.initMapiApi(config);
    }

    /**
     * Initializes a new instance of the MapiApi class for Aspose Cloud-hosted service usage.
     * @param appKey The app key.
     * @param appSid The app SID.
     * @param baseUrl The base URL.
     * @param apiVersion API version.
     * @param debug If debug mode is enabled.
     */
    public MapiApi(String appKey, String appSid, String baseUrl, String apiVersion, Boolean debug) throws Exception
    {
        Configuration config = new Configuration();
        config.AppKey = appKey;
        config.AppSid = appSid;
        config.setApiBaseUrl(baseUrl);
        config.setApiVersion(apiVersion);
        config.setDebugMode(debug);
        this.initMapiApi(config);
    }
    
    /**
     * Initializes a new instance of the MapiApi class.
     * @param configuration Configuration settings.
     */
    private void initMapiApi(Configuration configuration)
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
     * Add attachment to document
     * 
     * @param request Holds parameters for this request invocation.
     * @throws Exception 
     */
    public void addMapiAttachment(AddMapiAttachmentRequestData request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling addMapiAttachment");
      }
       // verify the required parameter 'request.attachment' is set
      if (request.attachment== null) {
        throw new ApiException(400, "Missing the required parameter 'request.attachment' when calling addMapiAttachment");
      }
       // verify the required parameter 'request.request' is set
      if (request.request== null) {
        throw new ApiException(400, "Missing the required parameter 'request.request' when calling addMapiAttachment");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/email/Mapi/{name}/attachments/{attachment}";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
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
     * Create new document
     * 
     * @param request Holds parameters for this request invocation.
     * @throws Exception 
     */
    public void createMapi(CreateMapiRequestData request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling createMapi");
      }
       // verify the required parameter 'request.request' is set
      if (request.request== null) {
        throw new ApiException(400, "Missing the required parameter 'request.request' when calling createMapi");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/email/Mapi/{name}";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
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
     * Remove attachment from document
     * 
     * @param request Holds parameters for this request invocation.
     * @throws Exception 
     */
    public void deleteMapiAttachment(DeleteMapiAttachmentRequestData request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling deleteMapiAttachment");
      }
       // verify the required parameter 'request.attachment' is set
      if (request.attachment== null) {
        throw new ApiException(400, "Missing the required parameter 'request.attachment' when calling deleteMapiAttachment");
      }
       // verify the required parameter 'request.storage' is set
      if (request.storage== null) {
        throw new ApiException(400, "Missing the required parameter 'request.storage' when calling deleteMapiAttachment");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/email/Mapi/{name}/attachments/{attachment}";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      resourcePath = UrlHelper.addPathParameter(resourcePath, "attachment", request.attachment);
      
      
      String postBody = null;
      
      postBody = SerializationHelper.serialize(request.storage);
      
      this.apiInvoker.invokeApi(
          resourcePath, 
          "DELETE", 
          postBody, 
          null, 
          formParams);
          
    }
  
    /**
     * Delete document properties
     * 
     * @param request Holds parameters for this request invocation.
     * @throws Exception 
     */
    public void deleteMapiProperties(DeleteMapiPropertiesRequestData request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling deleteMapiProperties");
      }
       // verify the required parameter 'request.request' is set
      if (request.request== null) {
        throw new ApiException(400, "Missing the required parameter 'request.request' when calling deleteMapiProperties");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/email/Mapi/{name}/properties";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      
      
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
     * Get document attachment as file stream
     * 
     * @param request Holds parameters for this request invocation.
     * @return File
     * @throws Exception 
     */
    public File getMapiAttachment(GetMapiAttachmentRequestData request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling getMapiAttachment");
      }
       // verify the required parameter 'request.attachment' is set
      if (request.attachment== null) {
        throw new ApiException(400, "Missing the required parameter 'request.attachment' when calling getMapiAttachment");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/email/Mapi/{name}/attachments/{attachment}";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
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
     * Get document attachment list
     * 
     * @param request Holds parameters for this request invocation.
     * @return ListResponseOfString
     * @throws Exception 
     */
    public ListResponseOfString getMapiAttachments(GetMapiAttachmentsRequestData request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling getMapiAttachments");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/email/Mapi/{name}/attachments";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
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
      
      return SerializationHelper.deserialize(new String(response), ListResponseOfString.class);
    }
  
    /**
     * Get document list from storage folder
     * 
     * @param request Holds parameters for this request invocation.
     * @return ListResponseOfHierarchicalObjectResponse
     * @throws Exception 
     */
    public ListResponseOfHierarchicalObjectResponse getMapiList(GetMapiListRequestData request) throws Exception 
    {
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/email/Mapi";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      
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
     * Get document properties
     * 
     * @param request Holds parameters for this request invocation.
     * @return HierarchicalObjectResponse
     * @throws Exception 
     */
    public HierarchicalObjectResponse getMapiProperties(GetMapiPropertiesRequestData request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling getMapiProperties");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/email/Mapi/{name}/properties";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
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
      
      return SerializationHelper.deserialize(new String(response), HierarchicalObjectResponse.class);
    }
  
    /**
     * Update document properties
     * 
     * @param request Holds parameters for this request invocation.
     * @throws Exception 
     */
    public void updateMapiProperties(UpdateMapiPropertiesRequestData request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling updateMapiProperties");
      }
       // verify the required parameter 'request.request' is set
      if (request.request== null) {
        throw new ApiException(400, "Missing the required parameter 'request.request' when calling updateMapiProperties");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/email/Mapi/{name}/properties";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
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

//part: model/requests/AddMapiAttachmentRequestData.java
/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="AddMapiAttachmentRequestData.java">
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
* Class that holds parameters for MapiApi.addMapiAttachment request invocation.
**/   
public class AddMapiAttachmentRequestData
{
    /**
    * Initializes a new instance of the AddMapiAttachmentRequestData class.   
    * @param name Document file name
    * @param attachment Attachment file name
    * @param request Add attachment request
    **/
    public AddMapiAttachmentRequestData(String name, String attachment, AddAttachmentRequest request)             
    {
        this.name = name;
        this.attachment = attachment;
        this.request = request;
    }
        
    /**
    * Document file name
    **/
    public String name;

    /**
    * Attachment file name
    **/
    public String attachment;

    /**
    * Add attachment request
    **/
    public AddAttachmentRequest request;
}

//part: model/requests/CreateMapiRequestData.java
/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="CreateMapiRequestData.java">
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
* Class that holds parameters for MapiApi.createMapi request invocation.
**/   
public class CreateMapiRequestData
{
    /**
    * Initializes a new instance of the CreateMapiRequestData class.   
    * @param name Document file name
    * @param request Create document request
    **/
    public CreateMapiRequestData(String name, HierarchicalObjectRequest request)             
    {
        this.name = name;
        this.request = request;
    }
        
    /**
    * Document file name
    **/
    public String name;

    /**
    * Create document request
    **/
    public HierarchicalObjectRequest request;
}

//part: model/requests/DeleteMapiAttachmentRequestData.java
/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="DeleteMapiAttachmentRequestData.java">
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
* Class that holds parameters for MapiApi.deleteMapiAttachment request invocation.
**/   
public class DeleteMapiAttachmentRequestData
{
    /**
    * Initializes a new instance of the DeleteMapiAttachmentRequestData class.   
    * @param name Document file name
    * @param attachment Attachment name or index
    * @param storage Document file storage location info
    **/
    public DeleteMapiAttachmentRequestData(String name, String attachment, StorageFolderLocation storage)             
    {
        this.name = name;
        this.attachment = attachment;
        this.storage = storage;
    }
        
    /**
    * Document file name
    **/
    public String name;

    /**
    * Attachment name or index
    **/
    public String attachment;

    /**
    * Document file storage location info
    **/
    public StorageFolderLocation storage;
}

//part: model/requests/DeleteMapiPropertiesRequestData.java
/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="DeleteMapiPropertiesRequestData.java">
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
* Class that holds parameters for MapiApi.deleteMapiProperties request invocation.
**/   
public class DeleteMapiPropertiesRequestData
{
    /**
    * Initializes a new instance of the DeleteMapiPropertiesRequestData class.   
    * @param name Document file name
    * @param request Properties that should be deleted
    **/
    public DeleteMapiPropertiesRequestData(String name, HierarchicalObjectRequest request)             
    {
        this.name = name;
        this.request = request;
    }
        
    /**
    * Document file name
    **/
    public String name;

    /**
    * Properties that should be deleted
    **/
    public HierarchicalObjectRequest request;
}

//part: model/requests/GetMapiAttachmentRequestData.java
/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="GetMapiAttachmentRequestData.java">
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
* Class that holds parameters for MapiApi.getMapiAttachment request invocation.
**/   
public class GetMapiAttachmentRequestData
{
    /**
    * Initializes a new instance of the GetMapiAttachmentRequestData class.   
    * @param name Document file name
    * @param attachment Attachment name or index
    * @param folder Path to folder in storage
    * @param storage Storage name
    **/
    public GetMapiAttachmentRequestData(String name, String attachment, String folder, String storage)             
    {
        this.name = name;
        this.attachment = attachment;
        this.folder = folder;
        this.storage = storage;
    }
        
    /**
    * Document file name
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

//part: model/requests/GetMapiAttachmentsRequestData.java
/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="GetMapiAttachmentsRequestData.java">
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
* Class that holds parameters for MapiApi.getMapiAttachments request invocation.
**/   
public class GetMapiAttachmentsRequestData
{
    /**
    * Initializes a new instance of the GetMapiAttachmentsRequestData class.   
    * @param name Document file name
    * @param folder Path to folder in storage
    * @param storage Storage name
    **/
    public GetMapiAttachmentsRequestData(String name, String folder, String storage)             
    {
        this.name = name;
        this.folder = folder;
        this.storage = storage;
    }
        
    /**
    * Document file name
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

//part: model/requests/GetMapiListRequestData.java
/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="GetMapiListRequestData.java">
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
* Class that holds parameters for MapiApi.getMapiList request invocation.
**/   
public class GetMapiListRequestData
{
    /**
    * Initializes a new instance of the GetMapiListRequestData class.   
    * @param folder Path to folder in storage
    * @param storage Storage name
    * @param itemsPerPage Count of items on page
    * @param pageNumber Page number
    **/
    public GetMapiListRequestData(String folder, String storage, Integer itemsPerPage, Integer pageNumber)             
    {
        this.folder = folder;
        this.storage = storage;
        this.itemsPerPage = itemsPerPage;
        this.pageNumber = pageNumber;
    }
        
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

//part: model/requests/GetMapiPropertiesRequestData.java
/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="GetMapiPropertiesRequestData.java">
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
* Class that holds parameters for MapiApi.getMapiProperties request invocation.
**/   
public class GetMapiPropertiesRequestData
{
    /**
    * Initializes a new instance of the GetMapiPropertiesRequestData class.   
    * @param name Document file name
    * @param folder Path to folder in storage
    * @param storage Storage name
    **/
    public GetMapiPropertiesRequestData(String name, String folder, String storage)             
    {
        this.name = name;
        this.folder = folder;
        this.storage = storage;
    }
        
    /**
    * Document file name
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

//part: model/requests/UpdateMapiPropertiesRequestData.java
/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="UpdateMapiPropertiesRequestData.java">
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
* Class that holds parameters for MapiApi.updateMapiProperties request invocation.
**/   
public class UpdateMapiPropertiesRequestData
{
    /**
    * Initializes a new instance of the UpdateMapiPropertiesRequestData class.   
    * @param name Document file name
    * @param request Properties that should be updated/added
    **/
    public UpdateMapiPropertiesRequestData(String name, HierarchicalObjectRequest request)             
    {
        this.name = name;
        this.request = request;
    }
        
    /**
    * Document file name
    **/
    public String name;

    /**
    * Properties that should be updated/added
    **/
    public HierarchicalObjectRequest request;
}
