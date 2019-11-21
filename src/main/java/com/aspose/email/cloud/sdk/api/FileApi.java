//part: api/FileApi.java
/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="FileApi.java">
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
public class FileApi 
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
     * Initializes a new instance of the FileApi class for on-premise deployment service usage.
     *  @param baseUrl The base URL.
     */
    public FileApi(String baseUrl)
    {
        Configuration config = new Configuration();
        config.setApiBaseUrl(baseUrl);
        config.OnPremise = true;
        this.initFileApi(config);
    }

    /**
     * Initializes a new instance of the FileApi class for Aspose Cloud-hosted service usage.
     * @param appKey The app key.
     * @param appSid The app SID.
     */
    public FileApi(String appKey, String appSid)
    {
        Configuration config = new Configuration();
        config.AppKey = appKey;
        config.AppSid = appSid;
        this.initFileApi(config);
    }
    
    /**
     * Initializes a new instance of the FileApi class for on-premise deployment service usage.
     *  @param baseUrl The base URL.
     *  @param apiVersion API version.
     *  @param debug If debug mode is enabled.
     * @throws Exception 
     */
    public FileApi(String baseUrl, String apiVersion, Boolean debugMode) throws Exception
    {
        Configuration config = new Configuration();
        config.setApiBaseUrl(baseUrl);
        config.setApiVersion(apiVersion);
        config.setDebugMode(debugMode);
        config.OnPremise = true;
        this.initFileApi(config);
    }

    /**
     * Initializes a new instance of the FileApi class for Aspose Cloud-hosted service usage.
     * @param appKey The app key.
     * @param appSid The app SID.
     * @param baseUrl The base URL.
     */
    public FileApi(String appKey, String appSid, String baseUrl)
    {
        Configuration config = new Configuration();
        config.AppKey = appKey;
        config.AppSid = appSid;
        config.setApiBaseUrl(baseUrl);
        this.initFileApi(config);
    }

    /**
     * Initializes a new instance of the FileApi class for Aspose Cloud-hosted service usage.
     * @param appKey The app key.
     * @param appSid The app SID.
     * @param baseUrl The base URL.
     * @param apiVersion API version.
     */
    public FileApi(String appKey, String appSid, String baseUrl, String apiVersion) throws Exception
    {
        Configuration config = new Configuration();
        config.AppKey = appKey;
        config.AppSid = appSid;
        config.setApiBaseUrl(baseUrl);
        config.setApiVersion(apiVersion);
        this.initFileApi(config);
    }

    /**
     * Initializes a new instance of the FileApi class for Aspose Cloud-hosted service usage.
     * @param appKey The app key.
     * @param appSid The app SID.
     * @param baseUrl The base URL.
     * @param apiVersion API version.
     * @param debug If debug mode is enabled.
     */
    public FileApi(String appKey, String appSid, String baseUrl, String apiVersion, Boolean debug) throws Exception
    {
        Configuration config = new Configuration();
        config.AppKey = appKey;
        config.AppSid = appSid;
        config.setApiBaseUrl(baseUrl);
        config.setApiVersion(apiVersion);
        config.setDebugMode(debug);
        this.initFileApi(config);
    }
    
    /**
     * Initializes a new instance of the FileApi class.
     * @param configuration Configuration settings.
     */
    private void initFileApi(Configuration configuration)
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
     * Copy file
     * 
     * @param request Holds parameters for this request invocation.
     * @throws Exception 
     */
    public void copyFile(CopyFileRequestData request) throws Exception 
    {
       // verify the required parameter 'request.srcPath' is set
      if (request.srcPath== null) {
        throw new ApiException(400, "Missing the required parameter 'request.srcPath' when calling copyFile");
      }
       // verify the required parameter 'request.destPath' is set
      if (request.destPath== null) {
        throw new ApiException(400, "Missing the required parameter 'request.destPath' when calling copyFile");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/email/storage/file/copy/{srcPath}";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "srcPath", request.srcPath);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "destPath", request.destPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "srcStorageName", request.srcStorageName);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "destStorageName", request.destStorageName);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "versionId", request.versionId);
      
            
      this.apiInvoker.invokeApi(
          resourcePath, 
          "PUT", 
          null, 
          null, 
          formParams);
          
    }
  
    /**
     * Delete file
     * 
     * @param request Holds parameters for this request invocation.
     * @throws Exception 
     */
    public void deleteFile(DeleteFileRequestData request) throws Exception 
    {
       // verify the required parameter 'request.path' is set
      if (request.path== null) {
        throw new ApiException(400, "Missing the required parameter 'request.path' when calling deleteFile");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/email/storage/file/{path}";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "path", request.path);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storageName", request.storageName);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "versionId", request.versionId);
      
            
      this.apiInvoker.invokeApi(
          resourcePath, 
          "DELETE", 
          null, 
          null, 
          formParams);
          
    }
  
    /**
     * Download file
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws Exception 
     */
    public byte[] downloadFile(DownloadFileRequestData request) throws Exception 
    {
       // verify the required parameter 'request.path' is set
      if (request.path== null) {
        throw new ApiException(400, "Missing the required parameter 'request.path' when calling downloadFile");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/email/storage/file/{path}";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "path", request.path);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storageName", request.storageName);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "versionId", request.versionId);
      
            
      byte[] response = this.apiInvoker.invokeApi(
          resourcePath, 
          "GET", 
          null, 
          null, 
          formParams);
          
      return response;
      
    }
  
    /**
     * Move file
     * 
     * @param request Holds parameters for this request invocation.
     * @throws Exception 
     */
    public void moveFile(MoveFileRequestData request) throws Exception 
    {
       // verify the required parameter 'request.srcPath' is set
      if (request.srcPath== null) {
        throw new ApiException(400, "Missing the required parameter 'request.srcPath' when calling moveFile");
      }
       // verify the required parameter 'request.destPath' is set
      if (request.destPath== null) {
        throw new ApiException(400, "Missing the required parameter 'request.destPath' when calling moveFile");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/email/storage/file/move/{srcPath}";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "srcPath", request.srcPath);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "destPath", request.destPath);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "srcStorageName", request.srcStorageName);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "destStorageName", request.destStorageName);
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "versionId", request.versionId);
      
            
      this.apiInvoker.invokeApi(
          resourcePath, 
          "PUT", 
          null, 
          null, 
          formParams);
          
    }
  
    /**
     * Upload file
     * 
     * @param request Holds parameters for this request invocation.
     * @return FilesUploadResult
     * @throws Exception 
     */
    public FilesUploadResult uploadFile(UploadFileRequestData request) throws Exception 
    {
       // verify the required parameter 'request.path' is set
      if (request.path== null) {
        throw new ApiException(400, "Missing the required parameter 'request.path' when calling uploadFile");
      }
       // verify the required parameter 'request.file' is set
      if (request.File== null) {
        throw new ApiException(400, "Missing the required parameter 'request.file' when calling uploadFile");
      }
      // create path and map variables
      String resourcePath = this.Configuration.getApiRootUrl() + "/email/storage/file/{path}";
      
      HashMap<String, Object> formParams = new HashMap<String, Object>();
      resourcePath = UrlHelper.addPathParameter(resourcePath, "path", request.path);
      
      resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storageName", request.storageName);
      
            if (request.File != null) 
      {
          formParams.put("file", this.apiInvoker.toFileInfo(request.File, "File"));
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
    }
  
}

//part: model/requests/CopyFileRequestData.java
/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="CopyFileRequestData.java">
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
* Class that holds parameters for FileApi.copyFile request invocation.
**/   
public class CopyFileRequestData
{
    /**
    * Initializes a new instance of the CopyFileRequestData class.   
    * @param srcPath Source file path e.g. &#39;/folder/file.ext&#39;
    * @param destPath Destination file path
    * @param srcStorageName Source storage name
    * @param destStorageName Destination storage name
    * @param versionId File version ID to copy
    **/
    public CopyFileRequestData(String srcPath, String destPath, String srcStorageName, String destStorageName, String versionId)             
    {
        this.srcPath = srcPath;
        this.destPath = destPath;
        this.srcStorageName = srcStorageName;
        this.destStorageName = destStorageName;
        this.versionId = versionId;
    }
        
    /**
    * Source file path e.g. '/folder/file.ext'
    **/
    public String srcPath;

    /**
    * Destination file path
    **/
    public String destPath;

    /**
    * Source storage name
    **/
    public String srcStorageName;

    /**
    * Destination storage name
    **/
    public String destStorageName;

    /**
    * File version ID to copy
    **/
    public String versionId;
}

//part: model/requests/DeleteFileRequestData.java
/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="DeleteFileRequestData.java">
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
* Class that holds parameters for FileApi.deleteFile request invocation.
**/   
public class DeleteFileRequestData
{
    /**
    * Initializes a new instance of the DeleteFileRequestData class.   
    * @param path File path e.g. &#39;/folder/file.ext&#39;
    * @param storageName Storage name
    * @param versionId File version ID to delete
    **/
    public DeleteFileRequestData(String path, String storageName, String versionId)             
    {
        this.path = path;
        this.storageName = storageName;
        this.versionId = versionId;
    }
        
    /**
    * File path e.g. '/folder/file.ext'
    **/
    public String path;

    /**
    * Storage name
    **/
    public String storageName;

    /**
    * File version ID to delete
    **/
    public String versionId;
}

//part: model/requests/DownloadFileRequestData.java
/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="DownloadFileRequestData.java">
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
* Class that holds parameters for FileApi.downloadFile request invocation.
**/   
public class DownloadFileRequestData
{
    /**
    * Initializes a new instance of the DownloadFileRequestData class.   
    * @param path File path e.g. &#39;/folder/file.ext&#39;
    * @param storageName Storage name
    * @param versionId File version ID to download
    **/
    public DownloadFileRequestData(String path, String storageName, String versionId)             
    {
        this.path = path;
        this.storageName = storageName;
        this.versionId = versionId;
    }
        
    /**
    * File path e.g. '/folder/file.ext'
    **/
    public String path;

    /**
    * Storage name
    **/
    public String storageName;

    /**
    * File version ID to download
    **/
    public String versionId;
}

//part: model/requests/MoveFileRequestData.java
/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MoveFileRequestData.java">
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
* Class that holds parameters for FileApi.moveFile request invocation.
**/   
public class MoveFileRequestData
{
    /**
    * Initializes a new instance of the MoveFileRequestData class.   
    * @param srcPath Source file path e.g. &#39;/src.ext&#39;
    * @param destPath Destination file path e.g. &#39;/dest.ext&#39;
    * @param srcStorageName Source storage name
    * @param destStorageName Destination storage name
    * @param versionId File version ID to move
    **/
    public MoveFileRequestData(String srcPath, String destPath, String srcStorageName, String destStorageName, String versionId)             
    {
        this.srcPath = srcPath;
        this.destPath = destPath;
        this.srcStorageName = srcStorageName;
        this.destStorageName = destStorageName;
        this.versionId = versionId;
    }
        
    /**
    * Source file path e.g. '/src.ext'
    **/
    public String srcPath;

    /**
    * Destination file path e.g. '/dest.ext'
    **/
    public String destPath;

    /**
    * Source storage name
    **/
    public String srcStorageName;

    /**
    * Destination storage name
    **/
    public String destStorageName;

    /**
    * File version ID to move
    **/
    public String versionId;
}

//part: model/requests/UploadFileRequestData.java
/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="UploadFileRequestData.java">
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
* Class that holds parameters for FileApi.uploadFile request invocation.
**/   
public class UploadFileRequestData
{
    /**
    * Initializes a new instance of the UploadFileRequestData class.   
    * @param path Path where to upload including filename and extension e.g. /file.ext or /Folder 1/file.ext             If the content is multipart and path does not contains the file name it tries to get them from filename parameter             from Content-Disposition header.             
    * @param file File to upload
    * @param storageName Storage name
    **/
    public UploadFileRequestData(String path, byte[] file, String storageName)             
    {
        this.path = path;
        this.File = file;
        this.storageName = storageName;
    }
        
    /**
    * Path where to upload including filename and extension e.g. /file.ext or /Folder 1/file.ext             If the content is multipart and path does not contains the file name it tries to get them from filename parameter             from Content-Disposition header.             
    **/
    public String path;

    /**
    * File to upload
    **/
    public byte[] File;

    /**
    * Storage name
    **/
    public String storageName;
}
