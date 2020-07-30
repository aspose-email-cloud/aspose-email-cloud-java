/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="AiNameComponent.java">
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
 * Parsed name component             
 */
public class AiNameComponent {
  @JsonProperty("value")
  private String value = null;
  @JsonProperty("category")
  private String category = null;
  @JsonProperty("score")
  private Double score = null;
  @JsonProperty("position")
  private Integer position = null;

  /**
   * Set value and return this.
   * @param value Component value             
   * @return this
  **/
  public AiNameComponent value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Component value             
   * @return value
  **/
  public String getValue() {
    return value;
  }  

  /**
   * Set value.
   * @param value Component value             
  **/
  public void setValue(String value) {
    this.value = value;
  }


  /**
   * Set category and return this.
   * @param category Name component category. Enum, available values: Unknown, Mononym, Score, Format, FirstInitial, FirstName, MiddleInitial, MiddleName, MiddleNickname, MiddleSobriquet, MiddleMaidenName, MiddlePatronym, MiddleMatronym, LastInitial, LastName, LastNobiliaryParticle, LastNominalConjunction, LastPaternalSurname, LastMaternalSurname, PrefixTitle, PostfixGenerationalTitle, PostfixPostnominalLetters, ArabicIsm, ArabicKunya, ArabicNasab, ArabicSlaqab, ArabicNisbah
   * @return this
  **/
  public AiNameComponent category(String category) {
    this.category = category;
    return this;
  }

  /**
   * Name component category. Enum, available values: Unknown, Mononym, Score, Format, FirstInitial, FirstName, MiddleInitial, MiddleName, MiddleNickname, MiddleSobriquet, MiddleMaidenName, MiddlePatronym, MiddleMatronym, LastInitial, LastName, LastNobiliaryParticle, LastNominalConjunction, LastPaternalSurname, LastMaternalSurname, PrefixTitle, PostfixGenerationalTitle, PostfixPostnominalLetters, ArabicIsm, ArabicKunya, ArabicNasab, ArabicSlaqab, ArabicNisbah
   * @return category
  **/
  public String getCategory() {
    return category;
  }  

  /**
   * Set category.
   * @param category Name component category. Enum, available values: Unknown, Mononym, Score, Format, FirstInitial, FirstName, MiddleInitial, MiddleName, MiddleNickname, MiddleSobriquet, MiddleMaidenName, MiddlePatronym, MiddleMatronym, LastInitial, LastName, LastNobiliaryParticle, LastNominalConjunction, LastPaternalSurname, LastMaternalSurname, PrefixTitle, PostfixGenerationalTitle, PostfixPostnominalLetters, ArabicIsm, ArabicKunya, ArabicNasab, ArabicSlaqab, ArabicNisbah
  **/
  public void setCategory(String category) {
    this.category = category;
  }


  /**
   * Set score and return this.
   * @param score Score from 0.0 to 1.0             
   * @return this
  **/
  public AiNameComponent score(Double score) {
    this.score = score;
    return this;
  }

  /**
   * Score from 0.0 to 1.0             
   * @return score
  **/
  public Double getScore() {
    return score;
  }  

  /**
   * Set score.
   * @param score Score from 0.0 to 1.0             
  **/
  public void setScore(Double score) {
    this.score = score;
  }


  /**
   * Set position and return this.
   * @param position Component position from 0             
   * @return this
  **/
  public AiNameComponent position(Integer position) {
    this.position = position;
    return this;
  }

  /**
   * Component position from 0             
   * @return position
  **/
  public Integer getPosition() {
    return position;
  }  

  /**
   * Set position.
   * @param position Component position from 0             
  **/
  public void setPosition(Integer position) {
    this.position = position;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    AiNameComponent aiNameComponent = (AiNameComponent) o;
    return ObjectUtils.equals(this.value, aiNameComponent.value) &&
    ObjectUtils.equals(this.category, aiNameComponent.category) &&
    ObjectUtils.equals(this.score, aiNameComponent.score) &&
    ObjectUtils.equals(this.position, aiNameComponent.position);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(value, category, score, position);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiNameComponent {\n");
    
    sb.append("    value: ").append(toIndentedString(getValue())).append("\n");
    sb.append("    category: ").append(toIndentedString(getCategory())).append("\n");
    sb.append("    score: ").append(toIndentedString(getScore())).append("\n");
    sb.append("    position: ").append(toIndentedString(getPosition())).append("\n");
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

  public AiNameComponent() {
    super();
  }

  /**
   * Initializes a new instance of the AiNameComponent
   * @param value Component value             
   * @param category Name component category. Enum, available values: Unknown, Mononym, Score, Format, FirstInitial, FirstName, MiddleInitial, MiddleName, MiddleNickname, MiddleSobriquet, MiddleMaidenName, MiddlePatronym, MiddleMatronym, LastInitial, LastName, LastNobiliaryParticle, LastNominalConjunction, LastPaternalSurname, LastMaternalSurname, PrefixTitle, PostfixGenerationalTitle, PostfixPostnominalLetters, ArabicIsm, ArabicKunya, ArabicNasab, ArabicSlaqab, ArabicNisbah
   * @param score Score from 0.0 to 1.0             
   * @param position Component position from 0             
   */
  public AiNameComponent(
    String value,
    String category,
    Double score,
    Integer position
  ) {
    super();
    setValue(value);
    setCategory(category);
    setScore(score);
    setPosition(position);
  }

}

