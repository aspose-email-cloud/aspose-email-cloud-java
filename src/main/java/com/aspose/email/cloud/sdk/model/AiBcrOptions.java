/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="AiBcrOptions.java">
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
 * Recognition options.             
 */
public class AiBcrOptions {
  @JsonProperty("languages")
  private String languages = null;

  @JsonProperty("countries")
  private String countries = null;

  /**
   * Set languages and return this.
   * @param languages Comma-separated ISO-639 codes of languages (either 639-1 or 639-3; i.e. \&quot;it\&quot; or \&quot;ita\&quot; for Italian); it&#39;s \&quot;\&quot; by default.             
   * @return this
  **/
  public AiBcrOptions languages(String languages) {
    this.languages = languages;
    return this;
  }

  /**
   * Comma-separated ISO-639 codes of languages (either 639-1 or 639-3; i.e. \&quot;it\&quot; or \&quot;ita\&quot; for Italian); it&#39;s \&quot;\&quot; by default.             
   * @return languages
  **/
  public String getLanguages() {
    return languages;
  }  

  /**
   * Set languages.
   * @param languages Comma-separated ISO-639 codes of languages (either 639-1 or 639-3; i.e. \&quot;it\&quot; or \&quot;ita\&quot; for Italian); it&#39;s \&quot;\&quot; by default.             
  **/
  public void setLanguages(String languages) {
    this.languages = languages;
  }

  /**
   * Set countries and return this.
   * @param countries Comma-separated codes of countries.             
   * @return this
  **/
  public AiBcrOptions countries(String countries) {
    this.countries = countries;
    return this;
  }

  /**
   * Comma-separated codes of countries.             
   * @return countries
  **/
  public String getCountries() {
    return countries;
  }  

  /**
   * Set countries.
   * @param countries Comma-separated codes of countries.             
  **/
  public void setCountries(String countries) {
    this.countries = countries;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    AiBcrOptions aiBcrOptions = (AiBcrOptions) o;
    return ObjectUtils.equals(this.languages, aiBcrOptions.languages) &&
    ObjectUtils.equals(this.countries, aiBcrOptions.countries);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(languages, countries);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiBcrOptions {\n");
    
    sb.append("    languages: ").append(toIndentedString(getLanguages())).append("\n");
    sb.append("    countries: ").append(toIndentedString(getCountries())).append("\n");
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

  public AiBcrOptions() {
    super();
  }

  /**
   * Initializes a new instance of the AiBcrOptions
   * @param languages Comma-separated ISO-639 codes of languages (either 639-1 or 639-3; i.e. \&quot;it\&quot; or \&quot;ita\&quot; for Italian); it&#39;s \&quot;\&quot; by default.             
   * @param countries Comma-separated codes of countries.             
   */
  public AiBcrOptions(
    String languages,
    String countries
  ) {
    super();
    setLanguages(languages);
    setCountries(countries);
  }

}

