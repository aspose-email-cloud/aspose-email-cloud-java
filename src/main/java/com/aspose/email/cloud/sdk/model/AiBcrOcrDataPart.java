/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="AiBcrOcrDataPart.java">
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
 * Recognized text block             
 */
public class AiBcrOcrDataPart {
  @JsonProperty("x")
  private Double x = null;

  @JsonProperty("y")
  private Double y = null;

  @JsonProperty("width")
  private Double width = null;

  @JsonProperty("height")
  private Double height = null;

  @JsonProperty("text")
  private String text = null;

  @JsonProperty("details")
  private Map<String, String> details = null;

  /**
   * Set x and return this.
   * @param x X position of text block             
   * @return this
  **/
  public AiBcrOcrDataPart x(Double x) {
    this.x = x;
    return this;
  }

  /**
   * X position of text block             
   * @return x
  **/
  public Double getX() {
    return x;
  }  

  /**
   * Set x.
   * @param x X position of text block             
  **/
  public void setX(Double x) {
    this.x = x;
  }

  /**
   * Set y and return this.
   * @param y Y position of text block             
   * @return this
  **/
  public AiBcrOcrDataPart y(Double y) {
    this.y = y;
    return this;
  }

  /**
   * Y position of text block             
   * @return y
  **/
  public Double getY() {
    return y;
  }  

  /**
   * Set y.
   * @param y Y position of text block             
  **/
  public void setY(Double y) {
    this.y = y;
  }

  /**
   * Set width and return this.
   * @param width Width of text block             
   * @return this
  **/
  public AiBcrOcrDataPart width(Double width) {
    this.width = width;
    return this;
  }

  /**
   * Width of text block             
   * @return width
  **/
  public Double getWidth() {
    return width;
  }  

  /**
   * Set width.
   * @param width Width of text block             
  **/
  public void setWidth(Double width) {
    this.width = width;
  }

  /**
   * Set height and return this.
   * @param height Height of text block             
   * @return this
  **/
  public AiBcrOcrDataPart height(Double height) {
    this.height = height;
    return this;
  }

  /**
   * Height of text block             
   * @return height
  **/
  public Double getHeight() {
    return height;
  }  

  /**
   * Set height.
   * @param height Height of text block             
  **/
  public void setHeight(Double height) {
    this.height = height;
  }

  /**
   * Set text and return this.
   * @param text Recognized text             
   * @return this
  **/
  public AiBcrOcrDataPart text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Recognized text             
   * @return text
  **/
  public String getText() {
    return text;
  }  

  /**
   * Set text.
   * @param text Recognized text             
  **/
  public void setText(String text) {
    this.text = text;
  }

  /**
   * Set details and return this.
   * @param details Additional recognition result details             
   * @return this
  **/
  public AiBcrOcrDataPart details(Map<String, String> details) {
    this.details = details;
    return this;
  }

  /**
   * Add an item to details and return this.
   * details is: Additional recognition result details             
   * @param key An item key
   * @param detailsItem An item value
   * @return this
  **/
  public AiBcrOcrDataPart putDetailsItem(String key, String detailsItem) {
    if (this.details == null) {
      this.details = new HashMap<String, String>();
    }
    this.details.put(key, detailsItem);
    return this;
  }

  /**
   * Additional recognition result details             
   * @return details
  **/
  public Map<String, String> getDetails() {
    return details;
  }  

  /**
   * Set details.
   * @param details Additional recognition result details             
  **/
  public void setDetails(Map<String, String> details) {
    this.details = details;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    AiBcrOcrDataPart aiBcrOcrDataPart = (AiBcrOcrDataPart) o;
    return ObjectUtils.equals(this.x, aiBcrOcrDataPart.x) &&
    ObjectUtils.equals(this.y, aiBcrOcrDataPart.y) &&
    ObjectUtils.equals(this.width, aiBcrOcrDataPart.width) &&
    ObjectUtils.equals(this.height, aiBcrOcrDataPart.height) &&
    ObjectUtils.equals(this.text, aiBcrOcrDataPart.text) &&
    ObjectUtils.equals(this.details, aiBcrOcrDataPart.details);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(x, y, width, height, text, details);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiBcrOcrDataPart {\n");
    
    sb.append("    x: ").append(toIndentedString(getX())).append("\n");
    sb.append("    y: ").append(toIndentedString(getY())).append("\n");
    sb.append("    width: ").append(toIndentedString(getWidth())).append("\n");
    sb.append("    height: ").append(toIndentedString(getHeight())).append("\n");
    sb.append("    text: ").append(toIndentedString(getText())).append("\n");
    sb.append("    details: ").append(toIndentedString(getDetails())).append("\n");
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

  public AiBcrOcrDataPart() {
    super();
  }

  /**
   * Initializes a new instance of the AiBcrOcrDataPart
   * @param x X position of text block             
   * @param y Y position of text block             
   * @param width Width of text block             
   * @param height Height of text block             
   * @param text Recognized text             
   * @param details Additional recognition result details             
   */
  public AiBcrOcrDataPart(Double x, Double y, Double width, Double height, String text, Map<String, String> details) {
    super();
    setX(x);
    setY(y);
    setWidth(width);
    setHeight(height);
    setText(text);
    setDetails(details);
  }

}

