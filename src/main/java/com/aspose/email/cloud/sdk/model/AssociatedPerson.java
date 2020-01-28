/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="AssociatedPerson.java">
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
 * Describes associated person.             
 */
public class AssociatedPerson {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("category")
  private EnumWithCustomOfAssociatedPersonCategory category = null;

  @JsonProperty("preferred")
  private Boolean preferred = null;

  public AssociatedPerson name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Associated person&#39;s name.             
   * @return name
  **/
  public String getName() {
    return name;
  }  

  public void setName(String name) {
    this.name = name;
  }

  public AssociatedPerson category(EnumWithCustomOfAssociatedPersonCategory category) {
    this.category = category;
    return this;
  }

  /**
   * Associated person&#39;s category.             
   * @return category
  **/
  public EnumWithCustomOfAssociatedPersonCategory getCategory() {
    return category;
  }  

  public void setCategory(EnumWithCustomOfAssociatedPersonCategory category) {
    this.category = category;
  }

  public AssociatedPerson preferred(Boolean preferred) {
    this.preferred = preferred;
    return this;
  }

  /**
   * Defines whether associated person is preferred.             
   * @return preferred
  **/
  public Boolean isPreferred() {
    return preferred;
  }  

  public void setPreferred(Boolean preferred) {
    this.preferred = preferred;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    AssociatedPerson associatedPerson = (AssociatedPerson) o;
    return ObjectUtils.equals(this.name, associatedPerson.name) &&
    ObjectUtils.equals(this.category, associatedPerson.category) &&
    ObjectUtils.equals(this.preferred, associatedPerson.preferred);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(name, category, preferred);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssociatedPerson {\n");
    
    sb.append("    name: ").append(toIndentedString(getName())).append("\n");
    sb.append("    category: ").append(toIndentedString(getCategory())).append("\n");
    sb.append("    preferred: ").append(toIndentedString(isPreferred())).append("\n");
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

  public AssociatedPerson() {
    super();
  }

  /**
   * Initializes a new instance of the AssociatedPerson
   * @param name Associated person&#39;s name.             
   * @param category Associated person&#39;s category.             
   * @param preferred Defines whether associated person is preferred.             
   */
  public AssociatedPerson(String name, EnumWithCustomOfAssociatedPersonCategory category, Boolean preferred) {
    super();
    setName(name);
    setCategory(category);
    setPreferred(preferred);
  }

}

