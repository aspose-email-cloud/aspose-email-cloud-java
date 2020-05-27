/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="AiNameWeighted.java">
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
 * Name with score             
 */
public class AiNameWeighted {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("score")
  private Double score = null;

  /**
   * Set name and return this.
   * @param name Name             
   * @return this
  **/
  public AiNameWeighted name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name             
   * @return name
  **/
  public String getName() {
    return name;
  }  

  /**
   * Set name.
   * @param name Name             
  **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Set score and return this.
   * @param score Score of name             
   * @return this
  **/
  public AiNameWeighted score(Double score) {
    this.score = score;
    return this;
  }

  /**
   * Score of name             
   * @return score
  **/
  public Double getScore() {
    return score;
  }  

  /**
   * Set score.
   * @param score Score of name             
  **/
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
    AiNameWeighted aiNameWeighted = (AiNameWeighted) o;
    return ObjectUtils.equals(this.name, aiNameWeighted.name) &&
    ObjectUtils.equals(this.score, aiNameWeighted.score);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(name, score);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiNameWeighted {\n");
    
    sb.append("    name: ").append(toIndentedString(getName())).append("\n");
    sb.append("    score: ").append(toIndentedString(getScore())).append("\n");
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

  public AiNameWeighted() {
    super();
  }

  /**
   * Initializes a new instance of the AiNameWeighted
   * @param name Name             
   * @param score Score of name             
   */
  public AiNameWeighted(String name, Double score) {
    super();
    setName(name);
    setScore(score);
  }

}

