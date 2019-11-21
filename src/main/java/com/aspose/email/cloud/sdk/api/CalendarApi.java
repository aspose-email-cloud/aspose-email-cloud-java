//part: api/CalendarApi.java
/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="CalendarApi.java">
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
public class CalendarApi 
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
     * Initializes a new instance of the CalendarApi class for on-premise deployment service usage.
     *  @param baseUrl The base URL.
     */
    public CalendarApi(String baseUrl)
    {
        Configuration config = new Configuration();
        config.setApiBaseUrl(baseUrl);
        config.OnPremise = true;
        this.initCalendarApi(config);
    }

    /**
     * Initializes a new instance of the CalendarApi class for Aspose Cloud-hosted service usage.
     * @param appKey The app key.
     * @param appSid The app SID.
     */
    public CalendarApi(String appKey, String appSid)
    {
        Configuration config = new Configuration();
        config.AppKey = appKey;
        config.AppSid = appSid;
        this.initCalendarApi(config);
    }
    
    /**
     * Initializes a new instance of the CalendarApi class for on-premise deployment service usage.
     *  @param baseUrl The base URL.
     *  @param apiVersion API version.
     *  @param debug If debug mode is enabled.
     * @throws Exception 
     */
    public CalendarApi(String baseUrl, String apiVersion, Boolean debugMode) throws Exception
    {
        Configuration config = new Configuration();
        config.setApiBaseUrl(baseUrl);
        config.setApiVersion(apiVersion);
        config.setDebugMode(debugMode);
        config.OnPremise = true;
        this.initCalendarApi(config);
    }

    /**
     * Initializes a new instance of the CalendarApi class for Aspose Cloud-hosted service usage.
     * @param appKey The app key.
     * @param appSid The app SID.
     * @param baseUrl The base URL.
     */
    public CalendarApi(String appKey, String appSid, String baseUrl)
    {
        Configuration config = new Configuration();
        config.AppKey = appKey;
        config.AppSid = appSid;
        config.setApiBaseUrl(baseUrl);
        this.initCalendarApi(config);
    }

    /**
     * Initializes a new instance of the CalendarApi class for Aspose Cloud-hosted service usage.
     * @param appKey The app key.
     * @param appSid The app SID.
     * @param baseUrl The base URL.
     * @param apiVersion API version.
     */
    public CalendarApi(String appKey, String appSid, String baseUrl, String apiVersion) throws Exception
    {
        Configuration config = new Configuration();
        config.AppKey = appKey;
        config.AppSid = appSid;
        config.setApiBaseUrl(baseUrl);
        config.setApiVersion(apiVersion);
        this.initCalendarApi(config);
    }

    /**
     * Initializes a new instance of the CalendarApi class for Aspose Cloud-hosted service usage.
     * @param appKey The app key.
     * @param appSid The app SID.
     * @param baseUrl The base URL.
     * @param apiVersion API version.
     * @param debug If debug mode is enabled.
     */
    public CalendarApi(String appKey, String appSid, String baseUrl, String apiVersion, Boolean debug) throws Exception
    {
        Configuration config = new Configuration();
        config.AppKey = appKey;
        config.AppSid = appSid;
        config.setApiBaseUrl(baseUrl);
        config.setApiVersion(apiVersion);
        config.setDebugMode(debug);
        this.initCalendarApi(config);
    }
    
    /**
     * Initializes a new instance of the CalendarApi class.
     * @param configuration Configuration settings.
     */
    private void initCalendarApi(Configuration configuration)
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
     * Adds an attachment to iCalendar file
     * 
     * @param request Holds parameters for this request invocation.
     * @throws Exception 
     */
    public void addCalendarAttachment(AddCalendarAttachmentRequestData request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling addCalendarAttachment");
      }
       // verify the required parameter 'request.attachment' is set
      if (request.attachment== null) {
        throw new ApiException(400, "Missing the required parameter 'request.attachment' when calling addCalendarAttachment");
      }
       // verify the required parameter 'request.request' is set
      if (request.request== null) {
        throw new ApiException(400, "Missing the required parameter 'request.request' when calling addCalendarAttachment");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/email/Calendar/{name}/attachments/{attachment}";
      
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
     * Create calendar file
     * 
     * @param request Holds parameters for this request invocation.
     * @throws Exception 
     */
    public void createCalendar(CreateCalendarRequestData request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling createCalendar");
      }
       // verify the required parameter 'request.request' is set
      if (request.request== null) {
        throw new ApiException(400, "Missing the required parameter 'request.request' when calling createCalendar");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/email/Calendar/{name}";
      
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
     * Deletes indexed property by index and name. To delete Reminder attachment, use path ReminderAttachment/{ReminderIndex}/{AttachmentIndex}
     * 
     * @param request Holds parameters for this request invocation.
     * @throws Exception 
     */
    public void deleteCalendarProperty(DeleteCalendarPropertyRequestData request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling deleteCalendarProperty");
      }
       // verify the required parameter 'request.memberName' is set
      if (request.memberName== null) {
        throw new ApiException(400, "Missing the required parameter 'request.memberName' when calling deleteCalendarProperty");
      }
       // verify the required parameter 'request.index' is set
      if (request.index== null) {
        throw new ApiException(400, "Missing the required parameter 'request.index' when calling deleteCalendarProperty");
      }
       // verify the required parameter 'request.request' is set
      if (request.request== null) {
        throw new ApiException(400, "Missing the required parameter 'request.request' when calling deleteCalendarProperty");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/email/Calendar/{name}/properties/{memberName}/{index}";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "name", request.name);
      resourcePath = UrlHelper.addPathParameter(resourcePath, "memberName", request.memberName);
      resourcePath = UrlHelper.addPathParameter(resourcePath, "index", request.index);
      
      
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
     * Get calendar file properties
     * 
     * @param request Holds parameters for this request invocation.
     * @return HierarchicalObject
     * @throws Exception 
     */
    public HierarchicalObject getCalendar(GetCalendarRequestData request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling getCalendar");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/email/Calendar/{name}/properties";
      
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
      
      return SerializationHelper.deserialize(new String(response), HierarchicalObject.class);
    }
  
    /**
     * Get iCalendar document attachment by name
     * 
     * @param request Holds parameters for this request invocation.
     * @return File
     * @throws Exception 
     */
    public File getCalendarAttachment(GetCalendarAttachmentRequestData request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling getCalendarAttachment");
      }
       // verify the required parameter 'request.attachment' is set
      if (request.attachment== null) {
        throw new ApiException(400, "Missing the required parameter 'request.attachment' when calling getCalendarAttachment");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/email/Calendar/{name}/attachments/{attachment}";
      
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
     * Get iCalendar files list in folder on storage
     * 
     * @param request Holds parameters for this request invocation.
     * @return ListResponseOfHierarchicalObjectResponse
     * @throws Exception 
     */
    public ListResponseOfHierarchicalObjectResponse getCalendarList(GetCalendarListRequestData request) throws Exception 
    {
       // verify the required parameter 'request.folder' is set
      if (request.folder== null) {
        throw new ApiException(400, "Missing the required parameter 'request.folder' when calling getCalendarList");
      }
       // verify the required parameter 'request.itemsPerPage' is set
      if (request.itemsPerPage== null) {
        throw new ApiException(400, "Missing the required parameter 'request.itemsPerPage' when calling getCalendarList");
      }
       // verify the required parameter 'request.pageNumber' is set
      if (request.pageNumber== null) {
        throw new ApiException(400, "Missing the required parameter 'request.pageNumber' when calling getCalendarList");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/email/Calendar";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.folder);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "itemsPerPage", request.itemsPerPage);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "pageNumber", request.pageNumber);
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
      
      return SerializationHelper.deserialize(new String(response), ListResponseOfHierarchicalObjectResponse.class);
    }
  
    /**
     * Update calendar file properties
     * 
     * @param request Holds parameters for this request invocation.
     * @throws Exception 
     */
    public void updateCalendarProperties(UpdateCalendarPropertiesRequestData request) throws Exception 
    {
       // verify the required parameter 'request.name' is set
      if (request.name== null) {
        throw new ApiException(400, "Missing the required parameter 'request.name' when calling updateCalendarProperties");
      }
       // verify the required parameter 'request.request' is set
      if (request.request== null) {
        throw new ApiException(400, "Missing the required parameter 'request.request' when calling updateCalendarProperties");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/email/Calendar/{name}/properties";
      
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

//part: model/requests/AddCalendarAttachmentRequestData.java
/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="AddCalendarAttachmentRequestData.java">
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
* Class that holds parameters for CalendarApi.addCalendarAttachment request invocation.
**/   
public class AddCalendarAttachmentRequestData
{
    /**
    * Initializes a new instance of the AddCalendarAttachmentRequestData class.   
    * @param name Calendar file name in storage
    * @param attachment Attachment file name in storage
    * @param request Storage name and folder path for calendar and attachment files
    **/
    public AddCalendarAttachmentRequestData(String name, String attachment, AddAttachmentRequest request)             
    {
        this.name = name;
        this.attachment = attachment;
        this.request = request;
    }
        
    /**
    * Calendar file name in storage
    **/
    public String name;

    /**
    * Attachment file name in storage
    **/
    public String attachment;

    /**
    * Storage name and folder path for calendar and attachment files
    **/
    public AddAttachmentRequest request;
}

//part: model/requests/CreateCalendarRequestData.java
/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="CreateCalendarRequestData.java">
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
* Class that holds parameters for CalendarApi.createCalendar request invocation.
**/   
public class CreateCalendarRequestData
{
    /**
    * Initializes a new instance of the CreateCalendarRequestData class.   
    * @param name Calendar file name in storage
    * @param request 
    **/
    public CreateCalendarRequestData(String name, HierarchicalObjectRequest request)             
    {
        this.name = name;
        this.request = request;
    }
        
    /**
    * Calendar file name in storage
    **/
    public String name;

    /**
    * Gets or sets request
    **/
    public HierarchicalObjectRequest request;
}

//part: model/requests/DeleteCalendarPropertyRequestData.java
/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="DeleteCalendarPropertyRequestData.java">
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
* Class that holds parameters for CalendarApi.deleteCalendarProperty request invocation.
**/   
public class DeleteCalendarPropertyRequestData
{
    /**
    * Initializes a new instance of the DeleteCalendarPropertyRequestData class.   
    * @param name iCalendar file name in storage
    * @param memberName Indexed property name
    * @param index Property index path
    * @param request Storage detail to specify iCalendar file location
    **/
    public DeleteCalendarPropertyRequestData(String name, String memberName, String index, StorageFolderLocation request)             
    {
        this.name = name;
        this.memberName = memberName;
        this.index = index;
        this.request = request;
    }
        
    /**
    * iCalendar file name in storage
    **/
    public String name;

    /**
    * Indexed property name
    **/
    public String memberName;

    /**
    * Property index path
    **/
    public String index;

    /**
    * Storage detail to specify iCalendar file location
    **/
    public StorageFolderLocation request;
}

//part: model/requests/GetCalendarRequestData.java
/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="GetCalendarRequestData.java">
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
* Class that holds parameters for CalendarApi.getCalendar request invocation.
**/   
public class GetCalendarRequestData
{
    /**
    * Initializes a new instance of the GetCalendarRequestData class.   
    * @param name iCalendar file name in storage
    * @param folder Path to folder in storage
    * @param storage Storage name
    **/
    public GetCalendarRequestData(String name, String folder, String storage)             
    {
        this.name = name;
        this.folder = folder;
        this.storage = storage;
    }
        
    /**
    * iCalendar file name in storage
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

//part: model/requests/GetCalendarAttachmentRequestData.java
/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="GetCalendarAttachmentRequestData.java">
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
* Class that holds parameters for CalendarApi.getCalendarAttachment request invocation.
**/   
public class GetCalendarAttachmentRequestData
{
    /**
    * Initializes a new instance of the GetCalendarAttachmentRequestData class.   
    * @param name iCalendar document file name
    * @param attachment Attachment name or index
    * @param folder Path to folder in storage
    * @param storage Storage name
    **/
    public GetCalendarAttachmentRequestData(String name, String attachment, String folder, String storage)             
    {
        this.name = name;
        this.attachment = attachment;
        this.folder = folder;
        this.storage = storage;
    }
        
    /**
    * iCalendar document file name
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

//part: model/requests/GetCalendarListRequestData.java
/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="GetCalendarListRequestData.java">
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
* Class that holds parameters for CalendarApi.getCalendarList request invocation.
**/   
public class GetCalendarListRequestData
{
    /**
    * Initializes a new instance of the GetCalendarListRequestData class.   
    * @param folder Path to folder in storage
    * @param itemsPerPage Count of items on page
    * @param pageNumber Page number
    * @param storage Storage name
    **/
    public GetCalendarListRequestData(String folder, Integer itemsPerPage, Integer pageNumber, String storage)             
    {
        this.folder = folder;
        this.itemsPerPage = itemsPerPage;
        this.pageNumber = pageNumber;
        this.storage = storage;
    }
        
    /**
    * Path to folder in storage
    **/
    public String folder;

    /**
    * Count of items on page
    **/
    public Integer itemsPerPage;

    /**
    * Page number
    **/
    public Integer pageNumber;

    /**
    * Storage name
    **/
    public String storage;
}

//part: model/requests/UpdateCalendarPropertiesRequestData.java
/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="UpdateCalendarPropertiesRequestData.java">
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
* Class that holds parameters for CalendarApi.updateCalendarProperties request invocation.
**/   
public class UpdateCalendarPropertiesRequestData
{
    /**
    * Initializes a new instance of the UpdateCalendarPropertiesRequestData class.   
    * @param name iCalendar file name in storage
    * @param request Calendar properties update request
    **/
    public UpdateCalendarPropertiesRequestData(String name, HierarchicalObjectRequest request)             
    {
        this.name = name;
        this.request = request;
    }
        
    /**
    * iCalendar file name in storage
    **/
    public String name;

    /**
    * Calendar properties update request
    **/
    public HierarchicalObjectRequest request;
}
