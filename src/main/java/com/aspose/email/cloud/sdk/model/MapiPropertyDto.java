/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MapiPropertyDto.java">
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
 * Mapi property             
 */
public class MapiPropertyDto {
  @JsonProperty("descriptor")
  private MapiPropertyDescriptor descriptor = null;

  @JsonProperty("discriminator")
  private String discriminator = this.getClass().getSimpleName();

  /**
   * Set descriptor and return this.
   * @param descriptor Property descriptor             
   * @return this
  **/
  public MapiPropertyDto descriptor(MapiPropertyDescriptor descriptor) {
    this.descriptor = descriptor;
    return this;
  }

  /**
   * Property descriptor             
   * @return descriptor
  **/
  public MapiPropertyDescriptor getDescriptor() {
    return descriptor;
  }  

  /**
   * Set descriptor.
   * @param descriptor Property descriptor             
  **/
  public void setDescriptor(MapiPropertyDescriptor descriptor) {
    this.descriptor = descriptor;
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
    MapiPropertyDto mapiPropertyDto = (MapiPropertyDto) o;
    return ObjectUtils.equals(this.descriptor, mapiPropertyDto.descriptor) &&
    ObjectUtils.equals(this.discriminator, mapiPropertyDto.discriminator);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(descriptor, discriminator);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MapiPropertyDto {\n");
    
    sb.append("    descriptor: ").append(toIndentedString(getDescriptor())).append("\n");
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

  public MapiPropertyDto() {
    super();
  }

  /**
   * Initializes a new instance of the MapiPropertyDto
   * @param descriptor Property descriptor             
   * @param discriminator 
   */
  public MapiPropertyDto(MapiPropertyDescriptor descriptor, String discriminator) {
    super();
    setDescriptor(descriptor);
    setDiscriminator(discriminator);
  }

}

