/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="AiNameExtracted.java">
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
 * Extracted name             
 */
public class AiNameExtracted {
  @JsonProperty("name")
  private List<AiNameExtractedComponent> name = null;

  @JsonProperty("score")
  private Double score = null;

  public AiNameExtracted name(List<AiNameExtractedComponent> name) {
    this.name = name;
    return this;
  }

  public AiNameExtracted addNameItem(AiNameExtractedComponent nameItem) {
    if (this.name == null) {
      this.name = new ArrayList<AiNameExtractedComponent>();
    }
    this.name.add(nameItem);
    return this;
  }

  /**
   * Extracted name components             
   * @return name
  **/
  public List<AiNameExtractedComponent> getName() {
    return name;
  }  

  public void setName(List<AiNameExtractedComponent> name) {
    this.name = name;
  }

  public AiNameExtracted score(Double score) {
    this.score = score;
    return this;
  }

  /**
   * Extracted name score             
   * @return score
  **/
  public Double getScore() {
    return score;
  }  

  public void setScore(Double score) {
    this.score = score;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    AiNameExtracted aiNameExtracted = (AiNameExtracted) o;
    return ObjectUtils.equals(this.name, aiNameExtracted.name) &&
    ObjectUtils.equals(this.score, aiNameExtracted.score);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(name, score);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiNameExtracted {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
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

}

