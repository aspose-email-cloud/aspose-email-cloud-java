/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="AiBcrOcrData.java">
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
 * Image OCR results             
 */
public class AiBcrOcrData {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("image")
  private String image = null;

  @JsonProperty("details")
  private Map<String, String> details = null;

  @JsonProperty("data")
  private List<AiBcrOcrDataPart> data = null;

  /**
   * Set id and return this.
   * @param id Image identifier             
   * @return this
  **/
  public AiBcrOcrData id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Image identifier             
   * @return id
  **/
  public String getId() {
    return id;
  }  

  /**
   * Set id.
   * @param id Image identifier             
  **/
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Set image and return this.
   * @param image Image with possible pre-processing in Base64             
   * @return this
  **/
  public AiBcrOcrData image(String image) {
    this.image = image;
    return this;
  }

  /**
   * Image with possible pre-processing in Base64             
   * @return image
  **/
  public String getImage() {
    return image;
  }  

  /**
   * Set image.
   * @param image Image with possible pre-processing in Base64             
  **/
  public void setImage(String image) {
    this.image = image;
  }

  /**
   * Set details and return this.
   * @param details Additional details from OCR engine             
   * @return this
  **/
  public AiBcrOcrData details(Map<String, String> details) {
    this.details = details;
    return this;
  }

  /**
   * Add an item to details and return this.
   * details is: Additional details from OCR engine             
   * @param key An item key
   * @param detailsItem An item value
   * @return this
  **/
  public AiBcrOcrData putDetailsItem(String key, String detailsItem) {
    if (this.details == null) {
      this.details = new HashMap<String, String>();
    }
    this.details.put(key, detailsItem);
    return this;
  }

  /**
   * Additional details from OCR engine             
   * @return details
  **/
  public Map<String, String> getDetails() {
    return details;
  }  

  /**
   * Set details.
   * @param details Additional details from OCR engine             
  **/
  public void setDetails(Map<String, String> details) {
    this.details = details;
  }

  /**
   * Set data and return this.
   * @param data OCR results             
   * @return this
  **/
  public AiBcrOcrData data(List<AiBcrOcrDataPart> data) {
    this.data = data;
    return this;
  }
  /**
   * Add an item to data and return this.
   * @param dataItem An item of: OCR results             
   * @return this
  **/
  public AiBcrOcrData addDataItem(AiBcrOcrDataPart dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<AiBcrOcrDataPart>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * OCR results             
   * @return data
  **/
  public List<AiBcrOcrDataPart> getData() {
    return data;
  }  

  /**
   * Set data.
   * @param data OCR results             
  **/
  public void setData(List<AiBcrOcrDataPart> data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    AiBcrOcrData aiBcrOcrData = (AiBcrOcrData) o;
    return ObjectUtils.equals(this.id, aiBcrOcrData.id) &&
    ObjectUtils.equals(this.image, aiBcrOcrData.image) &&
    ObjectUtils.equals(this.details, aiBcrOcrData.details) &&
    ObjectUtils.equals(this.data, aiBcrOcrData.data);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(id, image, details, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiBcrOcrData {\n");
    
    sb.append("    id: ").append(toIndentedString(getId())).append("\n");
    sb.append("    image: ").append(toIndentedString(getImage())).append("\n");
    sb.append("    details: ").append(toIndentedString(getDetails())).append("\n");
    sb.append("    data: ").append(toIndentedString(getData())).append("\n");
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

  public AiBcrOcrData() {
    super();
  }

  /**
   * Initializes a new instance of the AiBcrOcrData
   * @param id Image identifier             
   * @param image Image with possible pre-processing in Base64             
   * @param details Additional details from OCR engine             
   * @param data OCR results             
   */
  public AiBcrOcrData(String id, String image, Map<String, String> details, List<AiBcrOcrDataPart> data) {
    super();
    setId(id);
    setImage(image);
    setDetails(details);
    setData(data);
  }

}

