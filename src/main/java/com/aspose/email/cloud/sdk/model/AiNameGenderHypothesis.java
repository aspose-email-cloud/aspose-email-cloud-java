/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="AiNameGenderHypothesis.java">
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
 * Name gender hypothesis             
 */
public class AiNameGenderHypothesis {
  @JsonProperty("gender")
  private String gender = null;

  @JsonProperty("score")
  private Double score = null;

  public AiNameGenderHypothesis gender(String gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Recognized name gender. Enum, available values: Male, Female, Unknown
   * @return gender
  **/
  public String getGender() {
    return gender;
  }  

  public void setGender(String gender) {
    this.gender = gender;
  }

  public AiNameGenderHypothesis score(Double score) {
    this.score = score;
    return this;
  }

  /**
   * Hypothesis score             
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
    AiNameGenderHypothesis aiNameGenderHypothesis = (AiNameGenderHypothesis) o;
    return ObjectUtils.equals(this.gender, aiNameGenderHypothesis.gender) &&
    ObjectUtils.equals(this.score, aiNameGenderHypothesis.score);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(gender, score);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiNameGenderHypothesis {\n");
    
    sb.append("    gender: ").append(toIndentedString(getGender())).append("\n");
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

  public AiNameGenderHypothesis() {
    super();
  }

  /**
   * Initializes a new instance of the AiNameGenderHypothesis
   * @param gender Recognized name gender. Enum, available values: Male, Female, Unknown
   * @param score Hypothesis score             
   */
  public AiNameGenderHypothesis(String gender, Double score) {
    super();
    setGender(gender);
    setScore(score);
  }

}

