/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="AiNameWeightedVariants.java">
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
 * Name variants             
 */
public class AiNameWeightedVariants {
  @JsonProperty("names")
  private List<AiNameWeighted> names = null;

  @JsonProperty("comments")
  private String comments = null;

  /**
   * Set names and return this.
   * @param names List of name variations             
   * @return this
  **/
  public AiNameWeightedVariants names(List<AiNameWeighted> names) {
    this.names = names;
    return this;
  }
  /**
   * Add an item to names and return this.
   * @param namesItem An item of: List of name variations             
   * @return this
  **/
  public AiNameWeightedVariants addNamesItem(AiNameWeighted namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<AiNameWeighted>();
    }
    this.names.add(namesItem);
    return this;
  }

  /**
   * List of name variations             
   * @return names
  **/
  public List<AiNameWeighted> getNames() {
    return names;
  }  

  /**
   * Set names.
   * @param names List of name variations             
  **/
  public void setNames(List<AiNameWeighted> names) {
    this.names = names;
  }

  /**
   * Set comments and return this.
   * @param comments Usually empty; can contain extra message describing some issue occurred during processing             
   * @return this
  **/
  public AiNameWeightedVariants comments(String comments) {
    this.comments = comments;
    return this;
  }

  /**
   * Usually empty; can contain extra message describing some issue occurred during processing             
   * @return comments
  **/
  public String getComments() {
    return comments;
  }  

  /**
   * Set comments.
   * @param comments Usually empty; can contain extra message describing some issue occurred during processing             
  **/
  public void setComments(String comments) {
    this.comments = comments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    AiNameWeightedVariants aiNameWeightedVariants = (AiNameWeightedVariants) o;
    return ObjectUtils.equals(this.names, aiNameWeightedVariants.names) &&
    ObjectUtils.equals(this.comments, aiNameWeightedVariants.comments);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(names, comments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiNameWeightedVariants {\n");
    
    sb.append("    names: ").append(toIndentedString(getNames())).append("\n");
    sb.append("    comments: ").append(toIndentedString(getComments())).append("\n");
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

  public AiNameWeightedVariants() {
    super();
  }

  /**
   * Initializes a new instance of the AiNameWeightedVariants
   * @param names List of name variations             
   * @param comments Usually empty; can contain extra message describing some issue occurred during processing             
   */
  public AiNameWeightedVariants(List<AiNameWeighted> names, String comments) {
    super();
    setNames(names);
    setComments(comments);
  }

}

