
/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="CalendarApi.java">
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
 * CalendarApi operations.
 */
public class CalendarApi 
{
    /**
     * The configuration
     */
    private final Configuration Configuration;
    
    /**
     * The API invoker
     */
    private final ApiInvoker apiInvoker;
       
    CalendarApi(ApiInvoker apiInvoker, Configuration configuration) {
        this.Configuration = configuration;
        this.apiInvoker = apiInvoker;
    }

            
    /**
     * Convert iCalendar to AlternateView             
     * 
     * @param request iCalendar to AlternateView request
     * @return AlternateView
     * @throws ApiException API error.
     */
    public AlternateView asAlternate(
        CalendarAsAlternateRequest request) throws ApiException 
    {
      try {
         // verify the required parameter 'request' is set
        if (request== null) {
            throw new ApiException(400, "Missing the required parameter 'request' when calling asAlternate");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/Calendar/as-alternate";
        String postBody = null;
        
        postBody = SerializationHelper.serialize(request);
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
        
        return SerializationHelper.deserialize(new String(response), AlternateView.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }

            
    /**
     * Converts calendar model to specified format and returns as file.             
     * 
     * @param request Calendar model and format to convert.
     * @return byte[]
     * @throws ApiException API error.
     */
    public byte[] asFile(
        CalendarAsFileRequest request) throws ApiException 
    {
      try {
         // verify the required parameter 'request' is set
        if (request== null) {
            throw new ApiException(400, "Missing the required parameter 'request' when calling asFile");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/Calendar/as-file";
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
     * Converts CalendarDto to MapiCalendarDto.             
     * 
     * @param calendarDto iCalendar model calendar representation.
     * @return MapiCalendarDto
     * @throws ApiException API error.
     */
    public MapiCalendarDto asMapi(
        CalendarDto calendarDto) throws ApiException 
    {
      try {
         // verify the required parameter 'calendarDto' is set
        if (calendarDto== null) {
            throw new ApiException(400, "Missing the required parameter 'calendarDto' when calling asMapi");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/Calendar/as-mapi";
        String postBody = null;
        
        postBody = SerializationHelper.serialize(calendarDto);
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
        
        return SerializationHelper.deserialize(new String(response), MapiCalendarDto.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }

            
    /**
     * Converts calendar document to specified format and returns as file.             
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws ApiException API error.
     */
    public byte[] convert(CalendarConvertRequest request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.format' is set
        if (request.getFormat() == null) {
            throw new ApiException(400, "Missing the required parameter 'request.format' when calling convert");
        }
         // verify the required parameter 'request.file' is set
        if (request.getFile() == null) {
            throw new ApiException(400, "Missing the required parameter 'request.file' when calling convert");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/Calendar/convert";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "format", request.getFormat());
        
        if (request.getFile() != null) 
        {
            formParams.put("file", this.apiInvoker.toFileInfo(request.getFile(), "File"));
        }
        byte[] response = this.apiInvoker.invokeApi(
            resourcePath, 
            "PUT", 
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
     * Converts calendar document to a model representation.             
     * 
     * @param request Holds parameters for this request invocation.
     * @return CalendarDto
     * @throws ApiException API error.
     */
    public CalendarDto fromFile(CalendarFromFileRequest request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.file' is set
        if (request.getFile() == null) {
            throw new ApiException(400, "Missing the required parameter 'request.file' when calling fromFile");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/Calendar/from-file";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        
        if (request.getFile() != null) 
        {
            formParams.put("file", this.apiInvoker.toFileInfo(request.getFile(), "File"));
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
        
        return SerializationHelper.deserialize(new String(response), CalendarDto.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }

            
    /**
     * Get calendar file from storage.             
     * 
     * @param request Holds parameters for this request invocation.
     * @return CalendarDto
     * @throws ApiException API error.
     */
    public CalendarDto get(CalendarGetRequest request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.fileName' is set
        if (request.getFileName() == null) {
            throw new ApiException(400, "Missing the required parameter 'request.fileName' when calling get");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/Calendar";
        
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
        
        return SerializationHelper.deserialize(new String(response), CalendarDto.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }

            
    /**
     * Get iCalendar from storage as AlternateView             
     * 
     * @param request Holds parameters for this request invocation.
     * @return AlternateView
     * @throws ApiException API error.
     */
    public AlternateView getAsAlternate(CalendarGetAsAlternateRequest request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.fileName' is set
        if (request.getFileName() == null) {
            throw new ApiException(400, "Missing the required parameter 'request.fileName' when calling getAsAlternate");
        }
         // verify the required parameter 'request.calendarAction' is set
        if (request.getCalendarAction() == null) {
            throw new ApiException(400, "Missing the required parameter 'request.calendarAction' when calling getAsAlternate");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/Calendar/as-alternate";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "fileName", request.getFileName());
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "calendarAction", request.getCalendarAction());
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "sequenceId", request.getSequenceId());
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
        
        return SerializationHelper.deserialize(new String(response), AlternateView.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }

            
    /**
     * Converts calendar document from storage to specified format and returns as file.             
     * 
     * @param request Holds parameters for this request invocation.
     * @return byte[]
     * @throws ApiException API error.
     */
    public byte[] getAsFile(CalendarGetAsFileRequest request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.fileName' is set
        if (request.getFileName() == null) {
            throw new ApiException(400, "Missing the required parameter 'request.fileName' when calling getAsFile");
        }
         // verify the required parameter 'request.format' is set
        if (request.getFormat() == null) {
            throw new ApiException(400, "Missing the required parameter 'request.format' when calling getAsFile");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/Calendar/as-file";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "fileName", request.getFileName());
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "format", request.getFormat());
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "storage", request.getStorage());
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.getFolder());
        
        
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
     * Get iCalendar list from storage folder.             
     * 
     * @param request Holds parameters for this request invocation.
     * @return CalendarStorageList
     * @throws ApiException API error.
     */
    public CalendarStorageList getList(CalendarGetListRequest request) throws ApiException 
    {
      try {
         // verify the required parameter 'request.folder' is set
        if (request.getFolder() == null) {
            throw new ApiException(400, "Missing the required parameter 'request.folder' when calling getList");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/Calendar/list";
        
        HashMap<String, Object> formParams = new HashMap<String, Object>();
        
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "folder", request.getFolder());
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "itemsPerPage", request.getItemsPerPage());
        resourcePath = UrlHelper.addQueryParameterToUrl(resourcePath, "pageNumber", request.getPageNumber());
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
        
        return SerializationHelper.deserialize(new String(response), CalendarStorageList.class);
      } catch(ApiException exception) {
        throw exception;
      } catch(Exception exception) {
        throw new ApiException(400, exception.getMessage());
      }
    }

            
    /**
     * Save iCalendar             
     * 
     * @param request iCalendar create/update request
     * @throws ApiException API error.
     */
    public void save(
        CalendarSaveRequest request) throws ApiException 
    {
      try {
         // verify the required parameter 'request' is set
        if (request== null) {
            throw new ApiException(400, "Missing the required parameter 'request' when calling save");
        }
        // create path and map variables
        String resourcePath = this.Configuration.getApiRootUrl() + "/email/Calendar";
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

