/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="FilesUploadResult.java">
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
 * FilesUploadResult
 */
public class FilesUploadResult {
  @JsonProperty("uploaded")
  private List<String> uploaded = null;

  @JsonProperty("errors")
  private List<Error> errors = null;

  /**
   * Set uploaded and return this.
   * @param uploaded 
   * @return this
  **/
  public FilesUploadResult uploaded(List<String> uploaded) {
    this.uploaded = uploaded;
    return this;
  }
  /**
   * Add an item to uploaded and return this.
   * @param uploadedItem An item of: 
   * @return this
  **/
  public FilesUploadResult addUploadedItem(String uploadedItem) {
    if (this.uploaded == null) {
      this.uploaded = new ArrayList<String>();
    }
    this.uploaded.add(uploadedItem);
    return this;
  }

  /**
   * Get uploaded
   * @return uploaded
  **/
  public List<String> getUploaded() {
    return uploaded;
  }  

  /**
   * Set uploaded.
   * @param uploaded 
  **/
  public void setUploaded(List<String> uploaded) {
    this.uploaded = uploaded;
  }

  /**
   * Set errors and return this.
   * @param errors 
   * @return this
  **/
  public FilesUploadResult errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }
  /**
   * Add an item to errors and return this.
   * @param errorsItem An item of: 
   * @return this
  **/
  public FilesUploadResult addErrorsItem(Error errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<Error>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * Get errors
   * @return errors
  **/
  public List<Error> getErrors() {
    return errors;
  }  

  /**
   * Set errors.
   * @param errors 
  **/
  public void setErrors(List<Error> errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    FilesUploadResult filesUploadResult = (FilesUploadResult) o;
    return ObjectUtils.equals(this.uploaded, filesUploadResult.uploaded) &&
    ObjectUtils.equals(this.errors, filesUploadResult.errors);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(uploaded, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilesUploadResult {\n");
    
    sb.append("    uploaded: ").append(toIndentedString(getUploaded())).append("\n");
    sb.append("    errors: ").append(toIndentedString(getErrors())).append("\n");
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

  public FilesUploadResult() {
    super();
  }

  /**
   * Initializes a new instance of the FilesUploadResult
   * @param uploaded 
   * @param errors 
   */
  public FilesUploadResult(List<String> uploaded, List<Error> errors) {
    super();
    setUploaded(uploaded);
    setErrors(errors);
  }

}

