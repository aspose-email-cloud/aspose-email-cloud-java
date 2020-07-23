/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="ContactPhoto.java">
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
 * Person&#39;s photo.             
 */
public class ContactPhoto {
  @JsonProperty("photoImageFormat")
  private String photoImageFormat = null;

  @JsonProperty("base64Data")
  private String base64Data = null;

  @JsonProperty("discriminator")
  private String discriminator = this.getClass().getSimpleName();

  /**
   * Set photoImageFormat and return this.
   * @param photoImageFormat MapiContact photo image format. Enum, available values: Undefined, Jpeg, Gif, Wmf, Bmp, Tiff
   * @return this
  **/
  public ContactPhoto photoImageFormat(String photoImageFormat) {
    this.photoImageFormat = photoImageFormat;
    return this;
  }

  /**
   * MapiContact photo image format. Enum, available values: Undefined, Jpeg, Gif, Wmf, Bmp, Tiff
   * @return photoImageFormat
  **/
  public String getPhotoImageFormat() {
    return photoImageFormat;
  }  

  /**
   * Set photoImageFormat.
   * @param photoImageFormat MapiContact photo image format. Enum, available values: Undefined, Jpeg, Gif, Wmf, Bmp, Tiff
  **/
  public void setPhotoImageFormat(String photoImageFormat) {
    this.photoImageFormat = photoImageFormat;
  }

  /**
   * Set base64Data and return this.
   * @param base64Data Photo serialized as base64 string.             
   * @return this
  **/
  public ContactPhoto base64Data(String base64Data) {
    this.base64Data = base64Data;
    return this;
  }

  /**
   * Photo serialized as base64 string.             
   * @return base64Data
  **/
  public String getBase64Data() {
    return base64Data;
  }  

  /**
   * Set base64Data.
   * @param base64Data Photo serialized as base64 string.             
  **/
  public void setBase64Data(String base64Data) {
    this.base64Data = base64Data;
  }

  /**
   * Set discriminator and return this.
   * @param discriminator 
   * @return this
  **/


  /**
   * Get discriminator
   * @return discriminator
  **/
  public String getDiscriminator() {
    return discriminator;
  }  

  /**
   * Set discriminator.
   * @param discriminator 
  **/
  public void setDiscriminator(String type) {/* do nothing */}


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    ContactPhoto contactPhoto = (ContactPhoto) o;
    return ObjectUtils.equals(this.photoImageFormat, contactPhoto.photoImageFormat) &&
    ObjectUtils.equals(this.base64Data, contactPhoto.base64Data) &&
    ObjectUtils.equals(this.discriminator, contactPhoto.discriminator);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(photoImageFormat, base64Data, discriminator);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactPhoto {\n");
    
    sb.append("    photoImageFormat: ").append(toIndentedString(getPhotoImageFormat())).append("\n");
    sb.append("    base64Data: ").append(toIndentedString(getBase64Data())).append("\n");
    sb.append("    discriminator: ").append(toIndentedString(getDiscriminator())).append("\n");
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

  public ContactPhoto() {
    super();
  }

  /**
   * Initializes a new instance of the ContactPhoto
   * @param photoImageFormat MapiContact photo image format. Enum, available values: Undefined, Jpeg, Gif, Wmf, Bmp, Tiff
   * @param base64Data Photo serialized as base64 string.             
   * @param discriminator 
   */
  public ContactPhoto(String photoImageFormat, String base64Data, String discriminator) {
    super();
    setPhotoImageFormat(photoImageFormat);
    setBase64Data(base64Data);
    setDiscriminator(discriminator);
  }

}

