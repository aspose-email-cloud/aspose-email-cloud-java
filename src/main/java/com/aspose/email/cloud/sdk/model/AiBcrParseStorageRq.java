/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="AiBcrParseStorageRq.java">
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
 * Parse business card images from Storage request             
 */
public class AiBcrParseStorageRq extends AiBcrStorageImageRq {
  @JsonProperty("outFolder")
  private StorageFolderLocation outFolder = null;

  /**
   * Set outFolder and return this.
   * @param outFolder Parse output folder location on storage             
   * @return this
  **/
  public AiBcrParseStorageRq outFolder(StorageFolderLocation outFolder) {
    this.outFolder = outFolder;
    return this;
  }

  /**
   * Parse output folder location on storage             
   * @return outFolder
  **/
  public StorageFolderLocation getOutFolder() {
    return outFolder;
  }  

  /**
   * Set outFolder.
   * @param outFolder Parse output folder location on storage             
  **/
  public void setOutFolder(StorageFolderLocation outFolder) {
    this.outFolder = outFolder;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    AiBcrParseStorageRq aiBcrParseStorageRq = (AiBcrParseStorageRq) o;
    return ObjectUtils.equals(this.outFolder, aiBcrParseStorageRq.outFolder) &&
    super.equals(o);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(outFolder, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiBcrParseStorageRq {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    options: ").append(toIndentedString(getOptions())).append("\n");
    sb.append("    images: ").append(toIndentedString(getImages())).append("\n");
    sb.append("    outFolder: ").append(toIndentedString(getOutFolder())).append("\n");
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

  public AiBcrParseStorageRq() {
    super();
  }

  /**
   * Initializes a new instance of the AiBcrParseStorageRq
   * @param options Recognition options             
   * @param images List of images with business cards             
   * @param outFolder Parse output folder location on storage             
   */
  public AiBcrParseStorageRq(AiBcrOptions options, List<AiBcrImageStorageFile> images, StorageFolderLocation outFolder) {
    super();
    setOptions(options);
    setImages(images);
    setOutFolder(outFolder);
  }

}

