/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MailMessageBase64.java">
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
 * Email message represented as file, encoded to Base64 format.             
 */
public class MailMessageBase64 extends MailMessageBase {
  @JsonProperty("valueBase64")
  private String valueBase64 = null;

  @JsonProperty("format")
  private String format = null;

  /**
   * Set valueBase64 and return this.
   * @param valueBase64 Email message file data encoded to Base64 string.             
   * @return this
  **/
  public MailMessageBase64 valueBase64(String valueBase64) {
    this.valueBase64 = valueBase64;
    return this;
  }

  /**
   * Email message file data encoded to Base64 string.             
   * @return valueBase64
  **/
  public String getValueBase64() {
    return valueBase64;
  }  

  /**
   * Set valueBase64.
   * @param valueBase64 Email message file data encoded to Base64 string.             
  **/
  public void setValueBase64(String valueBase64) {
    this.valueBase64 = valueBase64;
  }

  /**
   * Set format and return this.
   * @param format Email document format. Enum, available values: Eml, Msg, MsgUnicode, Mhtml, Html, Tnef
   * @return this
  **/
  public MailMessageBase64 format(String format) {
    this.format = format;
    return this;
  }

  /**
   * Email document format. Enum, available values: Eml, Msg, MsgUnicode, Mhtml, Html, Tnef
   * @return format
  **/
  public String getFormat() {
    return format;
  }  

  /**
   * Set format.
   * @param format Email document format. Enum, available values: Eml, Msg, MsgUnicode, Mhtml, Html, Tnef
  **/
  public void setFormat(String format) {
    this.format = format;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    MailMessageBase64 mailMessageBase64 = (MailMessageBase64) o;
    return ObjectUtils.equals(this.valueBase64, mailMessageBase64.valueBase64) &&
    ObjectUtils.equals(this.format, mailMessageBase64.format) &&
    super.equals(o);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(valueBase64, format, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MailMessageBase64 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    discriminator: ").append(toIndentedString(getDiscriminator())).append("\n");
    sb.append("    valueBase64: ").append(toIndentedString(getValueBase64())).append("\n");
    sb.append("    format: ").append(toIndentedString(getFormat())).append("\n");
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

  public MailMessageBase64() {
    super();
  }

  /**
   * Initializes a new instance of the MailMessageBase64
   * @param valueBase64 Email message file data encoded to Base64 string.             
   * @param format Email document format. Enum, available values: Eml, Msg, MsgUnicode, Mhtml, Html, Tnef
   */
  public MailMessageBase64(
    //,
    String valueBase64,
    String format
  ) {
    super();
    setValueBase64(valueBase64);
    setFormat(format);
  }

}

