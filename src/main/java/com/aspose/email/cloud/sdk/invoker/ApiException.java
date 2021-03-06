/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="ApiException.java">
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
package com.aspose.email.cloud.sdk.invoker;

/**
 * Email API Exception
 */
public class ApiException extends RuntimeException 
{
      /**
       * Initializes a new instance of the ApiException class.
       */ 
      public ApiException() {}

      /**
       * The error code.
       */ 
      public int errorCode;
      
      /**
       * API error.
       */
      public com.aspose.email.cloud.sdk.model.Error error;

      /**
       * Initializes a new instance of the ApiException class.
       * 
       * @param errorCode
       * @param message
       */
      public ApiException(int errorCode, String message) 
      {
          super(message);
          this.errorCode = errorCode;
      }
      
      /**
       * Initializes a new instance of the ApiException class.
       * 
       * @param errorCode
       * @param message
       * @param error
       */
      public ApiException(int errorCode, String message, com.aspose.email.cloud.sdk.model.Error error) 
      {
          this(errorCode, message);
          this.error = error;
      }
      
      /**
       * Returns error code.
       * @return Error code.
       */
      public int getErrorCode()
      {
          return this.errorCode;
      }
      
      /**
       * Returns API error.
       * @return API error.
       */
      public com.aspose.email.cloud.sdk.model.Error getApiError()
      {
          return this.error;
      }
}