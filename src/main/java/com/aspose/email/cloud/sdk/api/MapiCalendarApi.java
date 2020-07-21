
/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MapiCalendarApi.java">
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
 * MapiCalendarApi operations.
 */
public class MapiCalendarApi 
{
    /**
     * The configuration
     */
    private final Configuration Configuration;
    
    /**
     * The API invoker
     */
    private final ApiInvoker apiInvoker;
       
    MapiCalendarApi(ApiInvoker apiInvoker, Configuration configuration) {
        this.Configuration = configuration;
        this.apiInvoker = apiInvoker;
    }

            
    /**
     * Converts MAPI calendar model to CalendarDto model.             
     * 
     * @param mapiCalendarDto MAPI calendar model to convert.
     * @return CalendarDto
     * @throws ApiException API error.
     */
    public CalendarDto AsCalendarDto(
        MapiCalendarDto mapiCalendarDto) throws ApiException 
    {
      try {
         // verify the required parameter 'mapiCalendarDto' is set
        if (mapiCalendarDto== null) {
            throw new ApiException(400, "Missing the required parameter 'mapiCalendarDto' when calling AsCalendarDto");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/MapiCalendar/as-calendar-dto";
        String postBody = null;
        
        postBody = SerializationHelper.serialize(mapiCalendarDto);
        byte[] response = this.apiInvoker.invokeApi(
            resourcePath, 
            "PUT", 
            postBody, 
            null, 
            null);
            
        
        if (response == null)
        {
            return null;
        }
        
        return SerializationHelper.deserialize(new String(response), CalendarDto.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }

            
    /**
     * Converts MAPI calendar model to specified format and returns as file.             
     * 
     * @param request MAPI calendar model to convert.
     * @return byte[]
     * @throws ApiException API error.
     */
    public byte[] AsFile(
        MapiCalendarAsFileRequest request) throws ApiException 
    {
      try {
         // verify the required parameter 'request' is set
        if (request== null) {
            throw new ApiException(400, "Missing the required parameter 'request' when calling AsFile");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/MapiCalendar/as-file";
        String postBody = null;
        
        postBody = SerializationHelper.serialize(request);
        byte[] response = this.apiInvoker.invokeApi(
            resourcePath, 
            "PUT", 
            postBody, 
            null, 
            null);
            
        return response;
        
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }

            
    /**
     * Converts calendar file to a MAPI model representation.             
     * 
     * @param request Holds parameters for this request invocation.
     * @return MapiCalendarDto
     * @throws ApiException API error.
     */
    public MapiCalendarDto FromFile(MapiCalendarFromFileRequest request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.file' is set
        if (request.File== null) {
            throw new ApiException(400, "Missing the required parameter 'request.file' when calling FromFile");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/MapiCalendar/from-file";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        
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
        
        return SerializationHelper.deserialize(new String(response), MapiCalendarDto.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }

            
    /**
     * Get MAPI calendar document.             
     * 
     * @param request Holds parameters for this request invocation.
     * @return MapiCalendarDto
     * @throws ApiException API error.
     */
    public MapiCalendarDto Get(MapiCalendarGetRequest request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.name' is set
        if (request.name== null) {
            throw new ApiException(400, "Missing the required parameter 'request.name' when calling Get");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/MapiCalendar";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "name", request.name);
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
        
        return SerializationHelper.deserialize(new String(response), MapiCalendarDto.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }

            
    /**
     * Save MAPI Calendar to storage.             
     * 
     * @param request Calendar create/update request.
     * @throws ApiException API error.
     */
    public void Save(
        MapiCalendarSaveRequest request) throws ApiException 
    {
      try {
         // verify the required parameter 'request' is set
        if (request== null) {
            throw new ApiException(400, "Missing the required parameter 'request' when calling Save");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/MapiCalendar";
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

