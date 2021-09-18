/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="AiNameMismatch.java">
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
 * Names mismatch detailed description             
 */
public class AiNameMismatch {
  @JsonProperty("category")
  private String category = null;
  @JsonProperty("similarity")
  private Double similarity = null;
  @JsonProperty("explanation")
  private String explanation = null;

  /**
   * Set category and return this.
   * @param category Mismatch type. Enum, available values: Unknown, FirstName, MiddleName, MiddleLastName, MiddleNickname, Gender, Context
   * @return this
  **/
  public AiNameMismatch category(String category) {
    this.category = category;
    return this;
  }

  /**
   * Mismatch type. Enum, available values: Unknown, FirstName, MiddleName, MiddleLastName, MiddleNickname, Gender, Context
   * @return category
  **/
  public String getCategory() {
    return category;
  }  

  /**
   * Set category.
   * @param category Mismatch type. Enum, available values: Unknown, FirstName, MiddleName, MiddleLastName, MiddleNickname, Gender, Context
  **/
  public void setCategory(String category) {
    this.category = category;
  }


  /**
   * Set similarity and return this.
   * @param similarity Similarity score             
   * @return this
  **/
  public AiNameMismatch similarity(Double similarity) {
    this.similarity = similarity;
    return this;
  }

  /**
   * Similarity score             
   * @return similarity
  **/
  public Double getSimilarity() {
    return similarity;
  }  

  /**
   * Set similarity.
   * @param similarity Similarity score             
  **/
  public void setSimilarity(Double similarity) {
    this.similarity = similarity;
  }


  /**
   * Set explanation and return this.
   * @param explanation Explanation or mismatch subtype             
   * @return this
  **/
  public AiNameMismatch explanation(String explanation) {
    this.explanation = explanation;
    return this;
  }

  /**
   * Explanation or mismatch subtype             
   * @return explanation
  **/
  public String getExplanation() {
    return explanation;
  }  

  /**
   * Set explanation.
   * @param explanation Explanation or mismatch subtype             
  **/
  public void setExplanation(String explanation) {
    this.explanation = explanation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    AiNameMismatch aiNameMismatch = (AiNameMismatch) o;
    return ObjectUtils.equals(this.category, aiNameMismatch.category) &&
    ObjectUtils.equals(this.similarity, aiNameMismatch.similarity) &&
    ObjectUtils.equals(this.explanation, aiNameMismatch.explanation);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(category, similarity, explanation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiNameMismatch {\n");
    
    sb.append("    category: ").append(toIndentedString(getCategory())).append("\n");
    sb.append("    similarity: ").append(toIndentedString(getSimilarity())).append("\n");
    sb.append("    explanation: ").append(toIndentedString(getExplanation())).append("\n");
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

  public AiNameMismatch() {
    super();
  }

  /**
   * Initializes a new instance of the AiNameMismatch
   * @param category Mismatch type. Enum, available values: Unknown, FirstName, MiddleName, MiddleLastName, MiddleNickname, Gender, Context
   * @param similarity Similarity score             
   * @param explanation Explanation or mismatch subtype             
   */
  public AiNameMismatch(
    String category,
    Double similarity,
    String explanation
  ) {
    super();
    setCategory(category);
    setSimilarity(similarity);
    setExplanation(explanation);
  }

}

