/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MapiContactPhysicalAddressDto.java">
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
 * Refers to the group of properties that define physical address for a contact.             
 */
public class MapiContactPhysicalAddressDto {
  @JsonProperty("isMailingAddress")
  private Boolean isMailingAddress = null;
  @JsonProperty("street")
  private String street = null;
  @JsonProperty("city")
  private String city = null;
  @JsonProperty("stateOrProvince")
  private String stateOrProvince = null;
  @JsonProperty("postalCode")
  private String postalCode = null;
  @JsonProperty("country")
  private String country = null;
  @JsonProperty("countryCode")
  private String countryCode = null;
  @JsonProperty("address")
  private String address = null;
  @JsonProperty("postOfficeBox")
  private String postOfficeBox = null;

  /**
   * Set isMailingAddress and return this.
   * @param isMailingAddress Gets or sets a value indicating whether this address is mailing address             
   * @return this
  **/
  public MapiContactPhysicalAddressDto isMailingAddress(Boolean isMailingAddress) {
    this.isMailingAddress = isMailingAddress;
    return this;
  }

  /**
   * Gets or sets a value indicating whether this address is mailing address             
   * @return isMailingAddress
  **/
  public Boolean isIsMailingAddress() {
    return isMailingAddress;
  }  

  /**
   * Set isMailingAddress.
   * @param isMailingAddress Gets or sets a value indicating whether this address is mailing address             
  **/
  public void setIsMailingAddress(Boolean isMailingAddress) {
    this.isMailingAddress = isMailingAddress;
  }


  /**
   * Set street and return this.
   * @param street Specifies the street portion of the contact&#39;s address             
   * @return this
  **/
  public MapiContactPhysicalAddressDto street(String street) {
    this.street = street;
    return this;
  }

  /**
   * Specifies the street portion of the contact&#39;s address             
   * @return street
  **/
  public String getStreet() {
    return street;
  }  

  /**
   * Set street.
   * @param street Specifies the street portion of the contact&#39;s address             
  **/
  public void setStreet(String street) {
    this.street = street;
  }


  /**
   * Set city and return this.
   * @param city Specifies the city or locality portion of the contact&#39;s address             
   * @return this
  **/
  public MapiContactPhysicalAddressDto city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Specifies the city or locality portion of the contact&#39;s address             
   * @return city
  **/
  public String getCity() {
    return city;
  }  

  /**
   * Set city.
   * @param city Specifies the city or locality portion of the contact&#39;s address             
  **/
  public void setCity(String city) {
    this.city = city;
  }


  /**
   * Set stateOrProvince and return this.
   * @param stateOrProvince Specifies the state or province portion of the contact&#39;s address             
   * @return this
  **/
  public MapiContactPhysicalAddressDto stateOrProvince(String stateOrProvince) {
    this.stateOrProvince = stateOrProvince;
    return this;
  }

  /**
   * Specifies the state or province portion of the contact&#39;s address             
   * @return stateOrProvince
  **/
  public String getStateOrProvince() {
    return stateOrProvince;
  }  

  /**
   * Set stateOrProvince.
   * @param stateOrProvince Specifies the state or province portion of the contact&#39;s address             
  **/
  public void setStateOrProvince(String stateOrProvince) {
    this.stateOrProvince = stateOrProvince;
  }


  /**
   * Set postalCode and return this.
   * @param postalCode Specifies the postal code (ZIP code) portion of the contact&#39;s address             
   * @return this
  **/
  public MapiContactPhysicalAddressDto postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * Specifies the postal code (ZIP code) portion of the contact&#39;s address             
   * @return postalCode
  **/
  public String getPostalCode() {
    return postalCode;
  }  

  /**
   * Set postalCode.
   * @param postalCode Specifies the postal code (ZIP code) portion of the contact&#39;s address             
  **/
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  /**
   * Set country and return this.
   * @param country Specifies the country or region portion of the contact&#39;s address             
   * @return this
  **/
  public MapiContactPhysicalAddressDto country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Specifies the country or region portion of the contact&#39;s address             
   * @return country
  **/
  public String getCountry() {
    return country;
  }  

  /**
   * Set country.
   * @param country Specifies the country or region portion of the contact&#39;s address             
  **/
  public void setCountry(String country) {
    this.country = country;
  }


  /**
   * Set countryCode and return this.
   * @param countryCode Specifies the country code portion of the contact&#39;s address             
   * @return this
  **/
  public MapiContactPhysicalAddressDto countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * Specifies the country code portion of the contact&#39;s address             
   * @return countryCode
  **/
  public String getCountryCode() {
    return countryCode;
  }  

  /**
   * Set countryCode.
   * @param countryCode Specifies the country code portion of the contact&#39;s address             
  **/
  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  /**
   * Set address and return this.
   * @param address Specifies the complete address of the contact&#39;s address             
   * @return this
  **/
  public MapiContactPhysicalAddressDto address(String address) {
    this.address = address;
    return this;
  }

  /**
   * Specifies the complete address of the contact&#39;s address             
   * @return address
  **/
  public String getAddress() {
    return address;
  }  

  /**
   * Set address.
   * @param address Specifies the complete address of the contact&#39;s address             
  **/
  public void setAddress(String address) {
    this.address = address;
  }


  /**
   * Set postOfficeBox and return this.
   * @param postOfficeBox Gets or sets the post office box             
   * @return this
  **/
  public MapiContactPhysicalAddressDto postOfficeBox(String postOfficeBox) {
    this.postOfficeBox = postOfficeBox;
    return this;
  }

  /**
   * Gets or sets the post office box             
   * @return postOfficeBox
  **/
  public String getPostOfficeBox() {
    return postOfficeBox;
  }  

  /**
   * Set postOfficeBox.
   * @param postOfficeBox Gets or sets the post office box             
  **/
  public void setPostOfficeBox(String postOfficeBox) {
    this.postOfficeBox = postOfficeBox;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    MapiContactPhysicalAddressDto mapiContactPhysicalAddressDto = (MapiContactPhysicalAddressDto) o;
    return ObjectUtils.equals(this.isMailingAddress, mapiContactPhysicalAddressDto.isMailingAddress) &&
    ObjectUtils.equals(this.street, mapiContactPhysicalAddressDto.street) &&
    ObjectUtils.equals(this.city, mapiContactPhysicalAddressDto.city) &&
    ObjectUtils.equals(this.stateOrProvince, mapiContactPhysicalAddressDto.stateOrProvince) &&
    ObjectUtils.equals(this.postalCode, mapiContactPhysicalAddressDto.postalCode) &&
    ObjectUtils.equals(this.country, mapiContactPhysicalAddressDto.country) &&
    ObjectUtils.equals(this.countryCode, mapiContactPhysicalAddressDto.countryCode) &&
    ObjectUtils.equals(this.address, mapiContactPhysicalAddressDto.address) &&
    ObjectUtils.equals(this.postOfficeBox, mapiContactPhysicalAddressDto.postOfficeBox);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(isMailingAddress, street, city, stateOrProvince, postalCode, country, countryCode, address, postOfficeBox);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MapiContactPhysicalAddressDto {\n");
    
    sb.append("    isMailingAddress: ").append(toIndentedString(isIsMailingAddress())).append("\n");
    sb.append("    street: ").append(toIndentedString(getStreet())).append("\n");
    sb.append("    city: ").append(toIndentedString(getCity())).append("\n");
    sb.append("    stateOrProvince: ").append(toIndentedString(getStateOrProvince())).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(getPostalCode())).append("\n");
    sb.append("    country: ").append(toIndentedString(getCountry())).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(getCountryCode())).append("\n");
    sb.append("    address: ").append(toIndentedString(getAddress())).append("\n");
    sb.append("    postOfficeBox: ").append(toIndentedString(getPostOfficeBox())).append("\n");
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

  public MapiContactPhysicalAddressDto() {
    super();
  }

  /**
   * Initializes a new instance of the MapiContactPhysicalAddressDto
   * @param isMailingAddress Gets or sets a value indicating whether this address is mailing address             
   * @param street Specifies the street portion of the contact&#39;s address             
   * @param city Specifies the city or locality portion of the contact&#39;s address             
   * @param stateOrProvince Specifies the state or province portion of the contact&#39;s address             
   * @param postalCode Specifies the postal code (ZIP code) portion of the contact&#39;s address             
   * @param country Specifies the country or region portion of the contact&#39;s address             
   * @param countryCode Specifies the country code portion of the contact&#39;s address             
   * @param address Specifies the complete address of the contact&#39;s address             
   * @param postOfficeBox Gets or sets the post office box             
   */
  public MapiContactPhysicalAddressDto(
    Boolean isMailingAddress,
    String street,
    String city,
    String stateOrProvince,
    String postalCode,
    String country,
    String countryCode,
    String address,
    String postOfficeBox
  ) {
    super();
    setIsMailingAddress(isMailingAddress);
    setStreet(street);
    setCity(city);
    setStateOrProvince(stateOrProvince);
    setPostalCode(postalCode);
    setCountry(country);
    setCountryCode(countryCode);
    setAddress(address);
    setPostOfficeBox(postOfficeBox);
  }

}

