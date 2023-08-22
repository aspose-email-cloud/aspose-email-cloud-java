/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="AiNameExtractedComponent.java">
*   Copyright (c) 2018-2023 Aspose Pty Ltd. All rights reserved.
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
 * Extracted name component             
 */
public class AiNameExtractedComponent {
  @JsonProperty("category")
  private String category = null;
  @JsonProperty("value")
  private String value = null;

  /**
   * Set category and return this.
   * @param category Extracted from email address name component category. Enum, available values: Unknown, GivenName, Surname, SomeName, NoName, Initial
   * @return this
  **/
  public AiNameExtractedComponent category(String category) {
    this.category = category;
    return this;
  }

  /**
   * Extracted from email address name component category. Enum, available values: Unknown, GivenName, Surname, SomeName, NoName, Initial
   * @return category
  **/
  public String getCategory() {
    return category;
  }  

  /**
   * Set category.
   * @param category Extracted from email address name component category. Enum, available values: Unknown, GivenName, Surname, SomeName, NoName, Initial
  **/
  public void setCategory(String category) {
    this.category = category;
  }


  /**
   * Set value and return this.
   * @param value Extracted value             
   * @return this
  **/
  public AiNameExtractedComponent value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Extracted value             
   * @return value
  **/
  public String getValue() {
    return value;
  }  

  /**
   * Set value.
   * @param value Extracted value             
  **/
  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    AiNameExtractedComponent aiNameExtractedComponent = (AiNameExtractedComponent) o;
    return ObjectUtils.equals(this.category, aiNameExtractedComponent.category) &&
    ObjectUtils.equals(this.value, aiNameExtractedComponent.value);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(category, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiNameExtractedComponent {\n");
    
    sb.append("    category: ").append(toIndentedString(getCategory())).append("\n");
    sb.append("    value: ").append(toIndentedString(getValue())).append("\n");
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

  public AiNameExtractedComponent() {
    super();
  }

  /**
   * Initializes a new instance of the AiNameExtractedComponent
   * @param category Extracted from email address name component category. Enum, available values: Unknown, GivenName, Surname, SomeName, NoName, Initial
   * @param value Extracted value             
   */
  public AiNameExtractedComponent(
    String category,
    String value
  ) {
    super();
    setCategory(category);
    setValue(value);
  }

}

