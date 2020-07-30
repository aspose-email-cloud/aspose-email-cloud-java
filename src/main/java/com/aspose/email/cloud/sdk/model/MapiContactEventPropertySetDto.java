/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MapiContactEventPropertySetDto.java">
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
 * Specify events associated with a contact.             
 */
public class MapiContactEventPropertySetDto {
  @JsonProperty("birthday")
  private Date birthday = null;

  @JsonProperty("weddingAnniversary")
  private Date weddingAnniversary = null;

  /**
   * Set birthday and return this.
   * @param birthday Specifies the birthday of the contact.
   * @return this
  **/
  public MapiContactEventPropertySetDto birthday(Date birthday) {
    this.birthday = birthday;
    return this;
  }

  /**
   * Specifies the birthday of the contact.
   * @return birthday
  **/
  public Date getBirthday() {
    return birthday;
  }  

  /**
   * Set birthday.
   * @param birthday Specifies the birthday of the contact.
  **/
  public void setBirthday(Date birthday) {
    this.birthday = birthday;
  }

  /**
   * Set weddingAnniversary and return this.
   * @param weddingAnniversary Specifies the wedding anniversary of the contact.             
   * @return this
  **/
  public MapiContactEventPropertySetDto weddingAnniversary(Date weddingAnniversary) {
    this.weddingAnniversary = weddingAnniversary;
    return this;
  }

  /**
   * Specifies the wedding anniversary of the contact.             
   * @return weddingAnniversary
  **/
  public Date getWeddingAnniversary() {
    return weddingAnniversary;
  }  

  /**
   * Set weddingAnniversary.
   * @param weddingAnniversary Specifies the wedding anniversary of the contact.             
  **/
  public void setWeddingAnniversary(Date weddingAnniversary) {
    this.weddingAnniversary = weddingAnniversary;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    MapiContactEventPropertySetDto mapiContactEventPropertySetDto = (MapiContactEventPropertySetDto) o;
    return ObjectUtils.equals(this.birthday, mapiContactEventPropertySetDto.birthday) &&
    ObjectUtils.equals(this.weddingAnniversary, mapiContactEventPropertySetDto.weddingAnniversary);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(birthday, weddingAnniversary);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MapiContactEventPropertySetDto {\n");
    
    sb.append("    birthday: ").append(toIndentedString(getBirthday())).append("\n");
    sb.append("    weddingAnniversary: ").append(toIndentedString(getWeddingAnniversary())).append("\n");
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

  public MapiContactEventPropertySetDto() {
    super();
  }

  /**
   * Initializes a new instance of the MapiContactEventPropertySetDto
   * @param birthday Specifies the birthday of the contact.
   * @param weddingAnniversary Specifies the wedding anniversary of the contact.             
   */
  public MapiContactEventPropertySetDto(
    Date birthday,
    Date weddingAnniversary
  ) {
    super();
    setBirthday(birthday);
    setWeddingAnniversary(weddingAnniversary);
  }

}

