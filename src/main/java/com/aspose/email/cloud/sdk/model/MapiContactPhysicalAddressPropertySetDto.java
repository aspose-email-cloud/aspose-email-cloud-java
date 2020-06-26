/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MapiContactPhysicalAddressPropertySetDto.java">
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
 * Specify three physical addresses: Home Address, Work Address, and Other Address. One of the addresses can be marked as the Mailing Address             
 */
public class MapiContactPhysicalAddressPropertySetDto {
  @JsonProperty("workAddress")
  private MapiContactPhysicalAddressDto workAddress = null;

  @JsonProperty("homeAddress")
  private MapiContactPhysicalAddressDto homeAddress = null;

  @JsonProperty("otherAddress")
  private MapiContactPhysicalAddressDto otherAddress = null;

  /**
   * Set workAddress and return this.
   * @param workAddress Specifies the address of the contact&#39;s work             
   * @return this
  **/
  public MapiContactPhysicalAddressPropertySetDto workAddress(MapiContactPhysicalAddressDto workAddress) {
    this.workAddress = workAddress;
    return this;
  }

  /**
   * Specifies the address of the contact&#39;s work             
   * @return workAddress
  **/
  public MapiContactPhysicalAddressDto getWorkAddress() {
    return workAddress;
  }  

  /**
   * Set workAddress.
   * @param workAddress Specifies the address of the contact&#39;s work             
  **/
  public void setWorkAddress(MapiContactPhysicalAddressDto workAddress) {
    this.workAddress = workAddress;
  }

  /**
   * Set homeAddress and return this.
   * @param homeAddress Specifies the address of the contact&#39;s home             
   * @return this
  **/
  public MapiContactPhysicalAddressPropertySetDto homeAddress(MapiContactPhysicalAddressDto homeAddress) {
    this.homeAddress = homeAddress;
    return this;
  }

  /**
   * Specifies the address of the contact&#39;s home             
   * @return homeAddress
  **/
  public MapiContactPhysicalAddressDto getHomeAddress() {
    return homeAddress;
  }  

  /**
   * Set homeAddress.
   * @param homeAddress Specifies the address of the contact&#39;s home             
  **/
  public void setHomeAddress(MapiContactPhysicalAddressDto homeAddress) {
    this.homeAddress = homeAddress;
  }

  /**
   * Set otherAddress and return this.
   * @param otherAddress Specifies the other contact&#39;s address             
   * @return this
  **/
  public MapiContactPhysicalAddressPropertySetDto otherAddress(MapiContactPhysicalAddressDto otherAddress) {
    this.otherAddress = otherAddress;
    return this;
  }

  /**
   * Specifies the other contact&#39;s address             
   * @return otherAddress
  **/
  public MapiContactPhysicalAddressDto getOtherAddress() {
    return otherAddress;
  }  

  /**
   * Set otherAddress.
   * @param otherAddress Specifies the other contact&#39;s address             
  **/
  public void setOtherAddress(MapiContactPhysicalAddressDto otherAddress) {
    this.otherAddress = otherAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    MapiContactPhysicalAddressPropertySetDto mapiContactPhysicalAddressPropertySetDto = (MapiContactPhysicalAddressPropertySetDto) o;
    return ObjectUtils.equals(this.workAddress, mapiContactPhysicalAddressPropertySetDto.workAddress) &&
    ObjectUtils.equals(this.homeAddress, mapiContactPhysicalAddressPropertySetDto.homeAddress) &&
    ObjectUtils.equals(this.otherAddress, mapiContactPhysicalAddressPropertySetDto.otherAddress);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(workAddress, homeAddress, otherAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MapiContactPhysicalAddressPropertySetDto {\n");
    
    sb.append("    workAddress: ").append(toIndentedString(getWorkAddress())).append("\n");
    sb.append("    homeAddress: ").append(toIndentedString(getHomeAddress())).append("\n");
    sb.append("    otherAddress: ").append(toIndentedString(getOtherAddress())).append("\n");
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

  public MapiContactPhysicalAddressPropertySetDto() {
    super();
  }

  /**
   * Initializes a new instance of the MapiContactPhysicalAddressPropertySetDto
   * @param workAddress Specifies the address of the contact&#39;s work             
   * @param homeAddress Specifies the address of the contact&#39;s home             
   * @param otherAddress Specifies the other contact&#39;s address             
   */
  public MapiContactPhysicalAddressPropertySetDto(MapiContactPhysicalAddressDto workAddress, MapiContactPhysicalAddressDto homeAddress, MapiContactPhysicalAddressDto otherAddress) {
    super();
    setWorkAddress(workAddress);
    setHomeAddress(homeAddress);
    setOtherAddress(otherAddress);
  }

}

