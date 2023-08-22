/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="AiNameParsedRequest.java">
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
 * Parsed name request model             
 */
public class AiNameParsedRequest {
  @JsonProperty("culturalContext")
  private AiNameCulturalContext culturalContext = null;
  @JsonProperty("format")
  private String format = null;
  @JsonProperty("parsedName")
  private List<AiNameComponent> parsedName = new ArrayList<AiNameComponent>();

  /**
   * Set culturalContext and return this.
   * @param culturalContext AiName parser cultural context             
   * @return this
  **/
  public AiNameParsedRequest culturalContext(AiNameCulturalContext culturalContext) {
    this.culturalContext = culturalContext;
    return this;
  }

  /**
   * AiName parser cultural context             
   * @return culturalContext
  **/
  public AiNameCulturalContext getCulturalContext() {
    return culturalContext;
  }  

  /**
   * Set culturalContext.
   * @param culturalContext AiName parser cultural context             
  **/
  public void setCulturalContext(AiNameCulturalContext culturalContext) {
    this.culturalContext = culturalContext;
  }


  /**
   * Set format and return this.
   * @param format Format of the name. Predefined format can be used by ID, or custom format can be specified. Predefined formats:      /format/default/ (&#x3D; &#39;%t%F%m%N%L%p&#39;)     /format/FN+LN/ (&#x3D; &#39;%F%L&#39;)     /format/title+FN+LN/ (&#x3D; &#39;%t%F%L&#39;)     /format/FN+MN+LN/ (&#x3D; &#39;%F%M%N%L&#39;)     /format/title+FN+MN+LN/ (&#x3D; &#39;%t%F%M%N%L&#39;)     /format/FN+MI+LN/ (&#x3D; &#39;%F%m%N%L&#39;)     /format/title+FN+MI+LN/ (&#x3D; &#39;%t%F%m%N%L&#39;)     /format/LN/ (&#x3D; &#39;%L&#39;)     /format/title+LN/ (&#x3D; &#39;%t%L&#39;)     /format/LN+FN+MN/ (&#x3D; &#39;%L,%F%M%N&#39;)     /format/LN+title+FN+MN/ (&#x3D; &#39;%L,%t%F%M%N&#39;)     /format/LN+FN+MI/ (&#x3D; &#39;%L,%F%m%N&#39;)     /format/LN+title+FN+MI/ (&#x3D; &#39;%L,%t%F%m%N&#39;)  Custom format string - custom combination of characters and the next term placeholders:      &#39;%t&#39; - Title (prefix)     &#39;%F&#39; - First name     &#39;%f&#39; - First initial     &#39;%M&#39; - Middle name(s)     &#39;%m&#39; - Middle initial(s)     &#39;%N&#39; - Nickname     &#39;%L&#39; - Last name     &#39;%l&#39; - Last initial     &#39;%p&#39; - Postfix  If no value for format option was provided, its default value is &#39;%t%F%m%N%L%p&#39;             
   * @return this
  **/
  public AiNameParsedRequest format(String format) {
    this.format = format;
    return this;
  }

  /**
   * Format of the name. Predefined format can be used by ID, or custom format can be specified. Predefined formats:      /format/default/ (&#x3D; &#39;%t%F%m%N%L%p&#39;)     /format/FN+LN/ (&#x3D; &#39;%F%L&#39;)     /format/title+FN+LN/ (&#x3D; &#39;%t%F%L&#39;)     /format/FN+MN+LN/ (&#x3D; &#39;%F%M%N%L&#39;)     /format/title+FN+MN+LN/ (&#x3D; &#39;%t%F%M%N%L&#39;)     /format/FN+MI+LN/ (&#x3D; &#39;%F%m%N%L&#39;)     /format/title+FN+MI+LN/ (&#x3D; &#39;%t%F%m%N%L&#39;)     /format/LN/ (&#x3D; &#39;%L&#39;)     /format/title+LN/ (&#x3D; &#39;%t%L&#39;)     /format/LN+FN+MN/ (&#x3D; &#39;%L,%F%M%N&#39;)     /format/LN+title+FN+MN/ (&#x3D; &#39;%L,%t%F%M%N&#39;)     /format/LN+FN+MI/ (&#x3D; &#39;%L,%F%m%N&#39;)     /format/LN+title+FN+MI/ (&#x3D; &#39;%L,%t%F%m%N&#39;)  Custom format string - custom combination of characters and the next term placeholders:      &#39;%t&#39; - Title (prefix)     &#39;%F&#39; - First name     &#39;%f&#39; - First initial     &#39;%M&#39; - Middle name(s)     &#39;%m&#39; - Middle initial(s)     &#39;%N&#39; - Nickname     &#39;%L&#39; - Last name     &#39;%l&#39; - Last initial     &#39;%p&#39; - Postfix  If no value for format option was provided, its default value is &#39;%t%F%m%N%L%p&#39;             
   * @return format
  **/
  public String getFormat() {
    return format;
  }  

  /**
   * Set format.
   * @param format Format of the name. Predefined format can be used by ID, or custom format can be specified. Predefined formats:      /format/default/ (&#x3D; &#39;%t%F%m%N%L%p&#39;)     /format/FN+LN/ (&#x3D; &#39;%F%L&#39;)     /format/title+FN+LN/ (&#x3D; &#39;%t%F%L&#39;)     /format/FN+MN+LN/ (&#x3D; &#39;%F%M%N%L&#39;)     /format/title+FN+MN+LN/ (&#x3D; &#39;%t%F%M%N%L&#39;)     /format/FN+MI+LN/ (&#x3D; &#39;%F%m%N%L&#39;)     /format/title+FN+MI+LN/ (&#x3D; &#39;%t%F%m%N%L&#39;)     /format/LN/ (&#x3D; &#39;%L&#39;)     /format/title+LN/ (&#x3D; &#39;%t%L&#39;)     /format/LN+FN+MN/ (&#x3D; &#39;%L,%F%M%N&#39;)     /format/LN+title+FN+MN/ (&#x3D; &#39;%L,%t%F%M%N&#39;)     /format/LN+FN+MI/ (&#x3D; &#39;%L,%F%m%N&#39;)     /format/LN+title+FN+MI/ (&#x3D; &#39;%L,%t%F%m%N&#39;)  Custom format string - custom combination of characters and the next term placeholders:      &#39;%t&#39; - Title (prefix)     &#39;%F&#39; - First name     &#39;%f&#39; - First initial     &#39;%M&#39; - Middle name(s)     &#39;%m&#39; - Middle initial(s)     &#39;%N&#39; - Nickname     &#39;%L&#39; - Last name     &#39;%l&#39; - Last initial     &#39;%p&#39; - Postfix  If no value for format option was provided, its default value is &#39;%t%F%m%N%L%p&#39;             
  **/
  public void setFormat(String format) {
    this.format = format;
  }


  /**
   * Set parsedName and return this.
   * @param parsedName Parsed name             
   * @return this
  **/
  public AiNameParsedRequest parsedName(List<AiNameComponent> parsedName) {
    this.parsedName = parsedName;
    return this;
  }
  /**
   * Add an item to parsedName and return this.
   * @param parsedNameItem An item of: Parsed name             
   * @return this
  **/
  public AiNameParsedRequest addParsedNameItem(AiNameComponent parsedNameItem) {
    this.parsedName.add(parsedNameItem);
    return this;
  }

  /**
   * Parsed name             
   * @return parsedName
  **/
  public List<AiNameComponent> getParsedName() {
    return parsedName;
  }  

  /**
   * Set parsedName.
   * @param parsedName Parsed name             
  **/
  public void setParsedName(List<AiNameComponent> parsedName) {
    this.parsedName = parsedName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    AiNameParsedRequest aiNameParsedRequest = (AiNameParsedRequest) o;
    return ObjectUtils.equals(this.culturalContext, aiNameParsedRequest.culturalContext) &&
    ObjectUtils.equals(this.format, aiNameParsedRequest.format) &&
    ObjectUtils.equals(this.parsedName, aiNameParsedRequest.parsedName);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(culturalContext, format, parsedName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiNameParsedRequest {\n");
    
    sb.append("    culturalContext: ").append(toIndentedString(getCulturalContext())).append("\n");
    sb.append("    format: ").append(toIndentedString(getFormat())).append("\n");
    sb.append("    parsedName: ").append(toIndentedString(getParsedName())).append("\n");
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

  public AiNameParsedRequest() {
    super();
  }

  /**
   * Initializes a new instance of the AiNameParsedRequest
   * @param culturalContext AiName parser cultural context             
   * @param format Format of the name. Predefined format can be used by ID, or custom format can be specified. Predefined formats:      /format/default/ (&#x3D; &#39;%t%F%m%N%L%p&#39;)     /format/FN+LN/ (&#x3D; &#39;%F%L&#39;)     /format/title+FN+LN/ (&#x3D; &#39;%t%F%L&#39;)     /format/FN+MN+LN/ (&#x3D; &#39;%F%M%N%L&#39;)     /format/title+FN+MN+LN/ (&#x3D; &#39;%t%F%M%N%L&#39;)     /format/FN+MI+LN/ (&#x3D; &#39;%F%m%N%L&#39;)     /format/title+FN+MI+LN/ (&#x3D; &#39;%t%F%m%N%L&#39;)     /format/LN/ (&#x3D; &#39;%L&#39;)     /format/title+LN/ (&#x3D; &#39;%t%L&#39;)     /format/LN+FN+MN/ (&#x3D; &#39;%L,%F%M%N&#39;)     /format/LN+title+FN+MN/ (&#x3D; &#39;%L,%t%F%M%N&#39;)     /format/LN+FN+MI/ (&#x3D; &#39;%L,%F%m%N&#39;)     /format/LN+title+FN+MI/ (&#x3D; &#39;%L,%t%F%m%N&#39;)  Custom format string - custom combination of characters and the next term placeholders:      &#39;%t&#39; - Title (prefix)     &#39;%F&#39; - First name     &#39;%f&#39; - First initial     &#39;%M&#39; - Middle name(s)     &#39;%m&#39; - Middle initial(s)     &#39;%N&#39; - Nickname     &#39;%L&#39; - Last name     &#39;%l&#39; - Last initial     &#39;%p&#39; - Postfix  If no value for format option was provided, its default value is &#39;%t%F%m%N%L%p&#39;             
   * @param parsedName Parsed name             
   */
  public AiNameParsedRequest(
    AiNameCulturalContext culturalContext,
    String format,
    List<AiNameComponent> parsedName
  ) {
    super();
    setCulturalContext(culturalContext);
    setFormat(format);
    setParsedName(parsedName);
  }

}

