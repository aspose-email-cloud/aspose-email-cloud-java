/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="Error.java">
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

package com.aspose.email.cloud.sdk.model;

import org.apache.commons.lang3.ObjectUtils;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.*;
import com.google.gson.*;
import com.google.gson.stream.*;
import java.io.*;

/**
 * Error
 */
public class Error {
  @JsonProperty("code")
  private String code = null;
  @JsonProperty("message")
  private String message = null;
  @JsonProperty("description")
  private String description = null;
  @JsonProperty("innerError")
  private ErrorDetails innerError = null;

  /**
   * Set code and return this.
   * @param code 
   * @return this
  **/
  public Error code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
  **/
  public String getCode() {
    return code;
  }  

  /**
   * Set code.
   * @param code 
  **/
  public void setCode(String code) {
    this.code = code;
  }


  /**
   * Set message and return this.
   * @param message 
   * @return this
  **/
  public Error message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  **/
  public String getMessage() {
    return message;
  }  

  /**
   * Set message.
   * @param message 
  **/
  public void setMessage(String message) {
    this.message = message;
  }


  /**
   * Set description and return this.
   * @param description 
   * @return this
  **/
  public Error description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  public String getDescription() {
    return description;
  }  

  /**
   * Set description.
   * @param description 
  **/
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * Set innerError and return this.
   * @param innerError 
   * @return this
  **/
  public Error innerError(ErrorDetails innerError) {
    this.innerError = innerError;
    return this;
  }

  /**
   * Get innerError
   * @return innerError
  **/
  public ErrorDetails getInnerError() {
    return innerError;
  }  

  /**
   * Set innerError.
   * @param innerError 
  **/
  public void setInnerError(ErrorDetails innerError) {
    this.innerError = innerError;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    Error error = (Error) o;
    return ObjectUtils.equals(this.code, error.code) &&
    ObjectUtils.equals(this.message, error.message) &&
    ObjectUtils.equals(this.description, error.description) &&
    ObjectUtils.equals(this.innerError, error.innerError);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(code, message, description, innerError);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("    code: ").append(toIndentedString(getCode())).append("\n");
    sb.append("    message: ").append(toIndentedString(getMessage())).append("\n");
    sb.append("    description: ").append(toIndentedString(getDescription())).append("\n");
    sb.append("    innerError: ").append(toIndentedString(getInnerError())).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  public Error() {
    super();
  }

  /**
   * Initializes a new instance of the Error
   * @param code 
   * @param message 
   * @param description 
   * @param innerError 
   */
  public Error(
    String code,
    String message,
    String description,
    ErrorDetails innerError
  ) {
    super();
    setCode(code);
    setMessage(message);
    setDescription(description);
    setInnerError(innerError);
  }

}

