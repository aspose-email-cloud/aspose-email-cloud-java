/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="AiNameOptions.java">
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
 * AiName parser options             
 */
public class AiNameOptions {
  @JsonProperty("language")
  private String language = null;

  @JsonProperty("location")
  private String location = null;

  @JsonProperty("script")
  private String script = null;

  @JsonProperty("encoding")
  private String encoding = null;

  @JsonProperty("style")
  private String style = null;

  public AiNameOptions language(String language) {
    this.language = language;
    return this;
  }

  /**
   * An ISO-639 code of the language; either 639-1 or 639-3 (e.g. \&quot;it\&quot; or \&quot;ita\&quot; for Italian)             
   * @return language
  **/
  public String getLanguage() {
    return language;
  }  

  public void setLanguage(String language) {
    this.language = language;
  }

  public AiNameOptions location(String location) {
    this.location = location;
    return this;
  }

  /**
   * A geographic code such as an ISO-3166 two letter country code, for example \&quot;FR\&quot; for France             
   * @return location
  **/
  public String getLocation() {
    return location;
  }  

  public void setLocation(String location) {
    this.location = location;
  }

  public AiNameOptions script(String script) {
    this.script = script;
    return this;
  }

  /**
   * A writing system code; starts with the ISO-15924 script name             
   * @return script
  **/
  public String getScript() {
    return script;
  }  

  public void setScript(String script) {
    this.script = script;
  }

  public AiNameOptions encoding(String encoding) {
    this.encoding = encoding;
    return this;
  }

  /**
   * A character encoding name             
   * @return encoding
  **/
  public String getEncoding() {
    return encoding;
  }  

  public void setEncoding(String encoding) {
    this.encoding = encoding;
  }

  public AiNameOptions style(String style) {
    this.style = style;
    return this;
  }

  /**
   * Name writing style. Allowed values are: \&quot;Formal\&quot;, \&quot;Informal\&quot;, \&quot;Legal\&quot;, \&quot;Academic\&quot;             
   * @return style
  **/
  public String getStyle() {
    return style;
  }  

  public void setStyle(String style) {
    this.style = style;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    AiNameOptions aiNameOptions = (AiNameOptions) o;
    return ObjectUtils.equals(this.language, aiNameOptions.language) &&
    ObjectUtils.equals(this.location, aiNameOptions.location) &&
    ObjectUtils.equals(this.script, aiNameOptions.script) &&
    ObjectUtils.equals(this.encoding, aiNameOptions.encoding) &&
    ObjectUtils.equals(this.style, aiNameOptions.style);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(language, location, script, encoding, style);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiNameOptions {\n");
    
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    script: ").append(toIndentedString(script)).append("\n");
    sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
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

