/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="AiBcrParseStorageRequest.java">
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
 * Parse business card images from Storage request             
 */
public class AiBcrParseStorageRequest {
  @JsonProperty("outFolder")
  private StorageFolderLocation outFolder = null;

  @JsonProperty("images")
  private List<AiBcrImageStorageFile> images = new ArrayList<AiBcrImageStorageFile>();

  @JsonProperty("options")
  private AiBcrOptions options = null;

  /**
   * Set outFolder and return this.
   * @param outFolder Parse output folder location on storage             
   * @return this
  **/
  public AiBcrParseStorageRequest outFolder(StorageFolderLocation outFolder) {
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

  /**
   * Set images and return this.
   * @param images Images to parse.             
   * @return this
  **/
  public AiBcrParseStorageRequest images(List<AiBcrImageStorageFile> images) {
    this.images = images;
    return this;
  }
  /**
   * Add an item to images and return this.
   * @param imagesItem An item of: Images to parse.             
   * @return this
  **/
  public AiBcrParseStorageRequest addImagesItem(AiBcrImageStorageFile imagesItem) {
    this.images.add(imagesItem);
    return this;
  }

  /**
   * Images to parse.             
   * @return images
  **/
  public List<AiBcrImageStorageFile> getImages() {
    return images;
  }  

  /**
   * Set images.
   * @param images Images to parse.             
  **/
  public void setImages(List<AiBcrImageStorageFile> images) {
    this.images = images;
  }

  /**
   * Set options and return this.
   * @param options Recognition options.             
   * @return this
  **/
  public AiBcrParseStorageRequest options(AiBcrOptions options) {
    this.options = options;
    return this;
  }

  /**
   * Recognition options.             
   * @return options
  **/
  public AiBcrOptions getOptions() {
    return options;
  }  

  /**
   * Set options.
   * @param options Recognition options.             
  **/
  public void setOptions(AiBcrOptions options) {
    this.options = options;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    AiBcrParseStorageRequest aiBcrParseStorageRequest = (AiBcrParseStorageRequest) o;
    return ObjectUtils.equals(this.outFolder, aiBcrParseStorageRequest.outFolder) &&
    ObjectUtils.equals(this.images, aiBcrParseStorageRequest.images) &&
    ObjectUtils.equals(this.options, aiBcrParseStorageRequest.options);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(outFolder, images, options);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiBcrParseStorageRequest {\n");
    
    sb.append("    outFolder: ").append(toIndentedString(getOutFolder())).append("\n");
    sb.append("    images: ").append(toIndentedString(getImages())).append("\n");
    sb.append("    options: ").append(toIndentedString(getOptions())).append("\n");
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

  public AiBcrParseStorageRequest() {
    super();
  }

  /**
   * Initializes a new instance of the AiBcrParseStorageRequest
   * @param outFolder Parse output folder location on storage             
   * @param images Images to parse.             
   * @param options Recognition options.             
   */
  public AiBcrParseStorageRequest(
    StorageFolderLocation outFolder,
    List<AiBcrImageStorageFile> images,
    AiBcrOptions options
  ) {
    super();
    setOutFolder(outFolder);
    setImages(images);
    setOptions(options);
  }

}

