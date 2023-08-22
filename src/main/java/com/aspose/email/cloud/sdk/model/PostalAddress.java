/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="PostalAddress.java">
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
 * A postal address             
 */
public class PostalAddress {
  @JsonProperty("address")
  private String address = null;
  @JsonProperty("category")
  private EnumWithCustomOfPostalAddressCategory category = null;
  @JsonProperty("city")
  private String city = null;
  @JsonProperty("country")
  private String country = null;
  @JsonProperty("countryCode")
  private String countryCode = null;
  @JsonProperty("isMailingAddress")
  private Boolean isMailingAddress = null;
  @JsonProperty("postalCode")
  private String postalCode = null;
  @JsonProperty("postOfficeBox")
  private String postOfficeBox = null;
  @JsonProperty("preferred")
  private Boolean preferred = null;
  @JsonProperty("stateOrProvince")
  private String stateOrProvince = null;
  @JsonProperty("street")
  private String street = null;

  /**
   * Set address and return this.
   * @param address Address.             
   * @return this
  **/
  public PostalAddress address(String address) {
    this.address = address;
    return this;
  }

  /**
   * Address.             
   * @return address
  **/
  public String getAddress() {
    return address;
  }  

  /**
   * Set address.
   * @param address Address.             
  **/
  public void setAddress(String address) {
    this.address = address;
  }


  /**
   * Set category and return this.
   * @param category Address category.             
   * @return this
  **/
  public PostalAddress category(EnumWithCustomOfPostalAddressCategory category) {
    this.category = category;
    return this;
  }

  /**
   * Address category.             
   * @return category
  **/
  public EnumWithCustomOfPostalAddressCategory getCategory() {
    return category;
  }  

  /**
   * Set category.
   * @param category Address category.             
  **/
  public void setCategory(EnumWithCustomOfPostalAddressCategory category) {
    this.category = category;
  }


  /**
   * Set city and return this.
   * @param city Address&#39;s city.             
   * @return this
  **/
  public PostalAddress city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Address&#39;s city.             
   * @return city
  **/
  public String getCity() {
    return city;
  }  

  /**
   * Set city.
   * @param city Address&#39;s city.             
  **/
  public void setCity(String city) {
    this.city = city;
  }


  /**
   * Set country and return this.
   * @param country Address&#39;s country.             
   * @return this
  **/
  public PostalAddress country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Address&#39;s country.             
   * @return country
  **/
  public String getCountry() {
    return country;
  }  

  /**
   * Set country.
   * @param country Address&#39;s country.             
  **/
  public void setCountry(String country) {
    this.country = country;
  }


  /**
   * Set countryCode and return this.
   * @param countryCode Country code.             
   * @return this
  **/
  public PostalAddress countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * Country code.             
   * @return countryCode
  **/
  public String getCountryCode() {
    return countryCode;
  }  

  /**
   * Set countryCode.
   * @param countryCode Country code.             
  **/
  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  /**
   * Set isMailingAddress and return this.
   * @param isMailingAddress Defines whether address may be used for mailing.             
   * @return this
  **/
  public PostalAddress isMailingAddress(Boolean isMailingAddress) {
    this.isMailingAddress = isMailingAddress;
    return this;
  }

  /**
   * Defines whether address may be used for mailing.             
   * @return isMailingAddress
  **/
  public Boolean isIsMailingAddress() {
    return isMailingAddress;
  }  

  /**
   * Set isMailingAddress.
   * @param isMailingAddress Defines whether address may be used for mailing.             
  **/
  public void setIsMailingAddress(Boolean isMailingAddress) {
    this.isMailingAddress = isMailingAddress;
  }


  /**
   * Set postalCode and return this.
   * @param postalCode Postal code.             
   * @return this
  **/
  public PostalAddress postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * Postal code.             
   * @return postalCode
  **/
  public String getPostalCode() {
    return postalCode;
  }  

  /**
   * Set postalCode.
   * @param postalCode Postal code.             
  **/
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  /**
   * Set postOfficeBox and return this.
   * @param postOfficeBox Post Office box.             
   * @return this
  **/
  public PostalAddress postOfficeBox(String postOfficeBox) {
    this.postOfficeBox = postOfficeBox;
    return this;
  }

  /**
   * Post Office box.             
   * @return postOfficeBox
  **/
  public String getPostOfficeBox() {
    return postOfficeBox;
  }  

  /**
   * Set postOfficeBox.
   * @param postOfficeBox Post Office box.             
  **/
  public void setPostOfficeBox(String postOfficeBox) {
    this.postOfficeBox = postOfficeBox;
  }


  /**
   * Set preferred and return this.
   * @param preferred Defines whether postal address is preferred.             
   * @return this
  **/
  public PostalAddress preferred(Boolean preferred) {
    this.preferred = preferred;
    return this;
  }

  /**
   * Defines whether postal address is preferred.             
   * @return preferred
  **/
  public Boolean isPreferred() {
    return preferred;
  }  

  /**
   * Set preferred.
   * @param preferred Defines whether postal address is preferred.             
  **/
  public void setPreferred(Boolean preferred) {
    this.preferred = preferred;
  }


  /**
   * Set stateOrProvince and return this.
   * @param stateOrProvince Address&#39;s region.             
   * @return this
  **/
  public PostalAddress stateOrProvince(String stateOrProvince) {
    this.stateOrProvince = stateOrProvince;
    return this;
  }

  /**
   * Address&#39;s region.             
   * @return stateOrProvince
  **/
  public String getStateOrProvince() {
    return stateOrProvince;
  }  

  /**
   * Set stateOrProvince.
   * @param stateOrProvince Address&#39;s region.             
  **/
  public void setStateOrProvince(String stateOrProvince) {
    this.stateOrProvince = stateOrProvince;
  }


  /**
   * Set street and return this.
   * @param street Address&#39;s street.             
   * @return this
  **/
  public PostalAddress street(String street) {
    this.street = street;
    return this;
  }

  /**
   * Address&#39;s street.             
   * @return street
  **/
  public String getStreet() {
    return street;
  }  

  /**
   * Set street.
   * @param street Address&#39;s street.             
  **/
  public void setStreet(String street) {
    this.street = street;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    PostalAddress postalAddress = (PostalAddress) o;
    return ObjectUtils.equals(this.address, postalAddress.address) &&
    ObjectUtils.equals(this.category, postalAddress.category) &&
    ObjectUtils.equals(this.city, postalAddress.city) &&
    ObjectUtils.equals(this.country, postalAddress.country) &&
    ObjectUtils.equals(this.countryCode, postalAddress.countryCode) &&
    ObjectUtils.equals(this.isMailingAddress, postalAddress.isMailingAddress) &&
    ObjectUtils.equals(this.postalCode, postalAddress.postalCode) &&
    ObjectUtils.equals(this.postOfficeBox, postalAddress.postOfficeBox) &&
    ObjectUtils.equals(this.preferred, postalAddress.preferred) &&
    ObjectUtils.equals(this.stateOrProvince, postalAddress.stateOrProvince) &&
    ObjectUtils.equals(this.street, postalAddress.street);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(address, category, city, country, countryCode, isMailingAddress, postalCode, postOfficeBox, preferred, stateOrProvince, street);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostalAddress {\n");
    
    sb.append("    address: ").append(toIndentedString(getAddress())).append("\n");
    sb.append("    category: ").append(toIndentedString(getCategory())).append("\n");
    sb.append("    city: ").append(toIndentedString(getCity())).append("\n");
    sb.append("    country: ").append(toIndentedString(getCountry())).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(getCountryCode())).append("\n");
    sb.append("    isMailingAddress: ").append(toIndentedString(isIsMailingAddress())).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(getPostalCode())).append("\n");
    sb.append("    postOfficeBox: ").append(toIndentedString(getPostOfficeBox())).append("\n");
    sb.append("    preferred: ").append(toIndentedString(isPreferred())).append("\n");
    sb.append("    stateOrProvince: ").append(toIndentedString(getStateOrProvince())).append("\n");
    sb.append("    street: ").append(toIndentedString(getStreet())).append("\n");
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

  public PostalAddress() {
    super();
  }

  /**
   * Initializes a new instance of the PostalAddress
   * @param address Address.             
   * @param category Address category.             
   * @param city Address&#39;s city.             
   * @param country Address&#39;s country.             
   * @param countryCode Country code.             
   * @param isMailingAddress Defines whether address may be used for mailing.             
   * @param postalCode Postal code.             
   * @param postOfficeBox Post Office box.             
   * @param preferred Defines whether postal address is preferred.             
   * @param stateOrProvince Address&#39;s region.             
   * @param street Address&#39;s street.             
   */
  public PostalAddress(
    String address,
    EnumWithCustomOfPostalAddressCategory category,
    String city,
    String country,
    String countryCode,
    Boolean isMailingAddress,
    String postalCode,
    String postOfficeBox,
    Boolean preferred,
    String stateOrProvince,
    String street
  ) {
    super();
    setAddress(address);
    setCategory(category);
    setCity(city);
    setCountry(country);
    setCountryCode(countryCode);
    setIsMailingAddress(isMailingAddress);
    setPostalCode(postalCode);
    setPostOfficeBox(postOfficeBox);
    setPreferred(preferred);
    setStateOrProvince(stateOrProvince);
    setStreet(street);
  }

}

