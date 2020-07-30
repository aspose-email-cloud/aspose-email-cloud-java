/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="AiNameMatchResult.java">
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
 * Two names match result             
 */
public class AiNameMatchResult {
  @JsonProperty("similarity")
  private Double similarity = null;
  @JsonProperty("mismatches")
  private List<AiNameMismatch> mismatches = null;

  /**
   * Set similarity and return this.
   * @param similarity Similarity score             
   * @return this
  **/
  public AiNameMatchResult similarity(Double similarity) {
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
   * Set mismatches and return this.
   * @param mismatches Detailed description of mismatches             
   * @return this
  **/
  public AiNameMatchResult mismatches(List<AiNameMismatch> mismatches) {
    this.mismatches = mismatches;
    return this;
  }
  /**
   * Add an item to mismatches and return this.
   * @param mismatchesItem An item of: Detailed description of mismatches             
   * @return this
  **/
  public AiNameMatchResult addMismatchesItem(AiNameMismatch mismatchesItem) {
    if (this.mismatches == null) {
      this.mismatches = new ArrayList<AiNameMismatch>();
    }
    this.mismatches.add(mismatchesItem);
    return this;
  }

  /**
   * Detailed description of mismatches             
   * @return mismatches
  **/
  public List<AiNameMismatch> getMismatches() {
    return mismatches;
  }  

  /**
   * Set mismatches.
   * @param mismatches Detailed description of mismatches             
  **/
  public void setMismatches(List<AiNameMismatch> mismatches) {
    this.mismatches = mismatches;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    AiNameMatchResult aiNameMatchResult = (AiNameMatchResult) o;
    return ObjectUtils.equals(this.similarity, aiNameMatchResult.similarity) &&
    ObjectUtils.equals(this.mismatches, aiNameMatchResult.mismatches);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(similarity, mismatches);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiNameMatchResult {\n");
    
    sb.append("    similarity: ").append(toIndentedString(getSimilarity())).append("\n");
    sb.append("    mismatches: ").append(toIndentedString(getMismatches())).append("\n");
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

  public AiNameMatchResult() {
    super();
  }

  /**
   * Initializes a new instance of the AiNameMatchResult
   * @param similarity Similarity score             
   * @param mismatches Detailed description of mismatches             
   */
  public AiNameMatchResult(
    Double similarity,
    List<AiNameMismatch> mismatches
  ) {
    super();
    setSimilarity(similarity);
    setMismatches(mismatches);
  }

}

