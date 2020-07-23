/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MapiContactPersonalInfoPropertySetDto.java">
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
 * Specify other additional contact information.             
 */
public class MapiContactPersonalInfoPropertySetDto {
  @JsonProperty("spouseName")
  private String spouseName = null;

  @JsonProperty("personalHomePage")
  private String personalHomePage = null;

  @JsonProperty("language")
  private String language = null;

  @JsonProperty("notes")
  private String notes = null;

  @JsonProperty("hobbies")
  private String hobbies = null;

  @JsonProperty("location")
  private String location = null;

  @JsonProperty("instantMessagingAddress")
  private String instantMessagingAddress = null;

  @JsonProperty("organizationalIdNumber")
  private String organizationalIdNumber = null;

  @JsonProperty("customerId")
  private String customerId = null;

  @JsonProperty("governmentIdNumber")
  private String governmentIdNumber = null;

  @JsonProperty("freeBusyLocation")
  private String freeBusyLocation = null;

  @JsonProperty("account")
  private String account = null;

  @JsonProperty("html")
  private String html = null;

  @JsonProperty("businessHomePage")
  private String businessHomePage = null;

  @JsonProperty("ftpSite")
  private String ftpSite = null;

  @JsonProperty("computerNetworkName")
  private String computerNetworkName = null;

  @JsonProperty("gender")
  private String gender = null;

  @JsonProperty("referredByName")
  private String referredByName = null;

  @JsonProperty("children")
  private List<String> children = null;

  /**
   * Set spouseName and return this.
   * @param spouseName Specifies the name of the contact&#39;s spouse/partner             
   * @return this
  **/
  public MapiContactPersonalInfoPropertySetDto spouseName(String spouseName) {
    this.spouseName = spouseName;
    return this;
  }

  /**
   * Specifies the name of the contact&#39;s spouse/partner             
   * @return spouseName
  **/
  public String getSpouseName() {
    return spouseName;
  }  

  /**
   * Set spouseName.
   * @param spouseName Specifies the name of the contact&#39;s spouse/partner             
  **/
  public void setSpouseName(String spouseName) {
    this.spouseName = spouseName;
  }

  /**
   * Set personalHomePage and return this.
   * @param personalHomePage Specifies the contact&#39;s personal web page URL             
   * @return this
  **/
  public MapiContactPersonalInfoPropertySetDto personalHomePage(String personalHomePage) {
    this.personalHomePage = personalHomePage;
    return this;
  }

  /**
   * Specifies the contact&#39;s personal web page URL             
   * @return personalHomePage
  **/
  public String getPersonalHomePage() {
    return personalHomePage;
  }  

  /**
   * Set personalHomePage.
   * @param personalHomePage Specifies the contact&#39;s personal web page URL             
  **/
  public void setPersonalHomePage(String personalHomePage) {
    this.personalHomePage = personalHomePage;
  }

  /**
   * Set language and return this.
   * @param language Specifies the language that the contact uses             
   * @return this
  **/
  public MapiContactPersonalInfoPropertySetDto language(String language) {
    this.language = language;
    return this;
  }

  /**
   * Specifies the language that the contact uses             
   * @return language
  **/
  public String getLanguage() {
    return language;
  }  

  /**
   * Set language.
   * @param language Specifies the language that the contact uses             
  **/
  public void setLanguage(String language) {
    this.language = language;
  }

  /**
   * Set notes and return this.
   * @param notes Specifies the additional notes             
   * @return this
  **/
  public MapiContactPersonalInfoPropertySetDto notes(String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Specifies the additional notes             
   * @return notes
  **/
  public String getNotes() {
    return notes;
  }  

  /**
   * Set notes.
   * @param notes Specifies the additional notes             
  **/
  public void setNotes(String notes) {
    this.notes = notes;
  }

  /**
   * Set hobbies and return this.
   * @param hobbies Specifies the hobbies of the contact             
   * @return this
  **/
  public MapiContactPersonalInfoPropertySetDto hobbies(String hobbies) {
    this.hobbies = hobbies;
    return this;
  }

  /**
   * Specifies the hobbies of the contact             
   * @return hobbies
  **/
  public String getHobbies() {
    return hobbies;
  }  

  /**
   * Set hobbies.
   * @param hobbies Specifies the hobbies of the contact             
  **/
  public void setHobbies(String hobbies) {
    this.hobbies = hobbies;
  }

  /**
   * Set location and return this.
   * @param location Specifies the location of the contact             
   * @return this
  **/
  public MapiContactPersonalInfoPropertySetDto location(String location) {
    this.location = location;
    return this;
  }

  /**
   * Specifies the location of the contact             
   * @return location
  **/
  public String getLocation() {
    return location;
  }  

  /**
   * Set location.
   * @param location Specifies the location of the contact             
  **/
  public void setLocation(String location) {
    this.location = location;
  }

  /**
   * Set instantMessagingAddress and return this.
   * @param instantMessagingAddress Specifies the contact&#39;s instant messaging address             
   * @return this
  **/
  public MapiContactPersonalInfoPropertySetDto instantMessagingAddress(String instantMessagingAddress) {
    this.instantMessagingAddress = instantMessagingAddress;
    return this;
  }

  /**
   * Specifies the contact&#39;s instant messaging address             
   * @return instantMessagingAddress
  **/
  public String getInstantMessagingAddress() {
    return instantMessagingAddress;
  }  

  /**
   * Set instantMessagingAddress.
   * @param instantMessagingAddress Specifies the contact&#39;s instant messaging address             
  **/
  public void setInstantMessagingAddress(String instantMessagingAddress) {
    this.instantMessagingAddress = instantMessagingAddress;
  }

  /**
   * Set organizationalIdNumber and return this.
   * @param organizationalIdNumber Specifies an organizational ID number for the contact             
   * @return this
  **/
  public MapiContactPersonalInfoPropertySetDto organizationalIdNumber(String organizationalIdNumber) {
    this.organizationalIdNumber = organizationalIdNumber;
    return this;
  }

  /**
   * Specifies an organizational ID number for the contact             
   * @return organizationalIdNumber
  **/
  public String getOrganizationalIdNumber() {
    return organizationalIdNumber;
  }  

  /**
   * Set organizationalIdNumber.
   * @param organizationalIdNumber Specifies an organizational ID number for the contact             
  **/
  public void setOrganizationalIdNumber(String organizationalIdNumber) {
    this.organizationalIdNumber = organizationalIdNumber;
  }

  /**
   * Set customerId and return this.
   * @param customerId Specifies the contact&#39;s customer ID number             
   * @return this
  **/
  public MapiContactPersonalInfoPropertySetDto customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * Specifies the contact&#39;s customer ID number             
   * @return customerId
  **/
  public String getCustomerId() {
    return customerId;
  }  

  /**
   * Set customerId.
   * @param customerId Specifies the contact&#39;s customer ID number             
  **/
  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  /**
   * Set governmentIdNumber and return this.
   * @param governmentIdNumber Specifies the contact&#39;s government ID number             
   * @return this
  **/
  public MapiContactPersonalInfoPropertySetDto governmentIdNumber(String governmentIdNumber) {
    this.governmentIdNumber = governmentIdNumber;
    return this;
  }

  /**
   * Specifies the contact&#39;s government ID number             
   * @return governmentIdNumber
  **/
  public String getGovernmentIdNumber() {
    return governmentIdNumber;
  }  

  /**
   * Set governmentIdNumber.
   * @param governmentIdNumber Specifies the contact&#39;s government ID number             
  **/
  public void setGovernmentIdNumber(String governmentIdNumber) {
    this.governmentIdNumber = governmentIdNumber;
  }

  /**
   * Set freeBusyLocation and return this.
   * @param freeBusyLocation Specifies a URL path from which a client can retrieve free/busy information for the contact as an iCal file             
   * @return this
  **/
  public MapiContactPersonalInfoPropertySetDto freeBusyLocation(String freeBusyLocation) {
    this.freeBusyLocation = freeBusyLocation;
    return this;
  }

  /**
   * Specifies a URL path from which a client can retrieve free/busy information for the contact as an iCal file             
   * @return freeBusyLocation
  **/
  public String getFreeBusyLocation() {
    return freeBusyLocation;
  }  

  /**
   * Set freeBusyLocation.
   * @param freeBusyLocation Specifies a URL path from which a client can retrieve free/busy information for the contact as an iCal file             
  **/
  public void setFreeBusyLocation(String freeBusyLocation) {
    this.freeBusyLocation = freeBusyLocation;
  }

  /**
   * Set account and return this.
   * @param account Specifies the account name of the contact             
   * @return this
  **/
  public MapiContactPersonalInfoPropertySetDto account(String account) {
    this.account = account;
    return this;
  }

  /**
   * Specifies the account name of the contact             
   * @return account
  **/
  public String getAccount() {
    return account;
  }  

  /**
   * Set account.
   * @param account Specifies the account name of the contact             
  **/
  public void setAccount(String account) {
    this.account = account;
  }

  /**
   * Set html and return this.
   * @param html Specifies the contact&#39;s business web page URL             
   * @return this
  **/
  public MapiContactPersonalInfoPropertySetDto html(String html) {
    this.html = html;
    return this;
  }

  /**
   * Specifies the contact&#39;s business web page URL             
   * @return html
  **/
  public String getHtml() {
    return html;
  }  

  /**
   * Set html.
   * @param html Specifies the contact&#39;s business web page URL             
  **/
  public void setHtml(String html) {
    this.html = html;
  }

  /**
   * Set businessHomePage and return this.
   * @param businessHomePage Specifies the contact&#39;s business web page URL             
   * @return this
  **/
  public MapiContactPersonalInfoPropertySetDto businessHomePage(String businessHomePage) {
    this.businessHomePage = businessHomePage;
    return this;
  }

  /**
   * Specifies the contact&#39;s business web page URL             
   * @return businessHomePage
  **/
  public String getBusinessHomePage() {
    return businessHomePage;
  }  

  /**
   * Set businessHomePage.
   * @param businessHomePage Specifies the contact&#39;s business web page URL             
  **/
  public void setBusinessHomePage(String businessHomePage) {
    this.businessHomePage = businessHomePage;
  }

  /**
   * Set ftpSite and return this.
   * @param ftpSite Specifies the contact&#39;s File Transfer Protocol (FTP) URL             
   * @return this
  **/
  public MapiContactPersonalInfoPropertySetDto ftpSite(String ftpSite) {
    this.ftpSite = ftpSite;
    return this;
  }

  /**
   * Specifies the contact&#39;s File Transfer Protocol (FTP) URL             
   * @return ftpSite
  **/
  public String getFtpSite() {
    return ftpSite;
  }  

  /**
   * Set ftpSite.
   * @param ftpSite Specifies the contact&#39;s File Transfer Protocol (FTP) URL             
  **/
  public void setFtpSite(String ftpSite) {
    this.ftpSite = ftpSite;
  }

  /**
   * Set computerNetworkName and return this.
   * @param computerNetworkName Specifies the name of the network to which the contact&#39;s computer is connected             
   * @return this
  **/
  public MapiContactPersonalInfoPropertySetDto computerNetworkName(String computerNetworkName) {
    this.computerNetworkName = computerNetworkName;
    return this;
  }

  /**
   * Specifies the name of the network to which the contact&#39;s computer is connected             
   * @return computerNetworkName
  **/
  public String getComputerNetworkName() {
    return computerNetworkName;
  }  

  /**
   * Set computerNetworkName.
   * @param computerNetworkName Specifies the name of the network to which the contact&#39;s computer is connected             
  **/
  public void setComputerNetworkName(String computerNetworkName) {
    this.computerNetworkName = computerNetworkName;
  }

  /**
   * Set gender and return this.
   * @param gender Gender of the contact Enum, available values: Unspecified, Female, Male
   * @return this
  **/
  public MapiContactPersonalInfoPropertySetDto gender(String gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Gender of the contact Enum, available values: Unspecified, Female, Male
   * @return gender
  **/
  public String getGender() {
    return gender;
  }  

  /**
   * Set gender.
   * @param gender Gender of the contact Enum, available values: Unspecified, Female, Male
  **/
  public void setGender(String gender) {
    this.gender = gender;
  }

  /**
   * Set referredByName and return this.
   * @param referredByName Specifies the name of the person who referred this contact to the user             
   * @return this
  **/
  public MapiContactPersonalInfoPropertySetDto referredByName(String referredByName) {
    this.referredByName = referredByName;
    return this;
  }

  /**
   * Specifies the name of the person who referred this contact to the user             
   * @return referredByName
  **/
  public String getReferredByName() {
    return referredByName;
  }  

  /**
   * Set referredByName.
   * @param referredByName Specifies the name of the person who referred this contact to the user             
  **/
  public void setReferredByName(String referredByName) {
    this.referredByName = referredByName;
  }

  /**
   * Set children and return this.
   * @param children Contains a list of names of children.             
   * @return this
  **/
  public MapiContactPersonalInfoPropertySetDto children(List<String> children) {
    this.children = children;
    return this;
  }
  /**
   * Add an item to children and return this.
   * @param childrenItem An item of: Contains a list of names of children.             
   * @return this
  **/
  public MapiContactPersonalInfoPropertySetDto addChildrenItem(String childrenItem) {
    if (this.children == null) {
      this.children = new ArrayList<String>();
    }
    this.children.add(childrenItem);
    return this;
  }

  /**
   * Contains a list of names of children.             
   * @return children
  **/
  public List<String> getChildren() {
    return children;
  }  

  /**
   * Set children.
   * @param children Contains a list of names of children.             
  **/
  public void setChildren(List<String> children) {
    this.children = children;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    MapiContactPersonalInfoPropertySetDto mapiContactPersonalInfoPropertySetDto = (MapiContactPersonalInfoPropertySetDto) o;
    return ObjectUtils.equals(this.spouseName, mapiContactPersonalInfoPropertySetDto.spouseName) &&
    ObjectUtils.equals(this.personalHomePage, mapiContactPersonalInfoPropertySetDto.personalHomePage) &&
    ObjectUtils.equals(this.language, mapiContactPersonalInfoPropertySetDto.language) &&
    ObjectUtils.equals(this.notes, mapiContactPersonalInfoPropertySetDto.notes) &&
    ObjectUtils.equals(this.hobbies, mapiContactPersonalInfoPropertySetDto.hobbies) &&
    ObjectUtils.equals(this.location, mapiContactPersonalInfoPropertySetDto.location) &&
    ObjectUtils.equals(this.instantMessagingAddress, mapiContactPersonalInfoPropertySetDto.instantMessagingAddress) &&
    ObjectUtils.equals(this.organizationalIdNumber, mapiContactPersonalInfoPropertySetDto.organizationalIdNumber) &&
    ObjectUtils.equals(this.customerId, mapiContactPersonalInfoPropertySetDto.customerId) &&
    ObjectUtils.equals(this.governmentIdNumber, mapiContactPersonalInfoPropertySetDto.governmentIdNumber) &&
    ObjectUtils.equals(this.freeBusyLocation, mapiContactPersonalInfoPropertySetDto.freeBusyLocation) &&
    ObjectUtils.equals(this.account, mapiContactPersonalInfoPropertySetDto.account) &&
    ObjectUtils.equals(this.html, mapiContactPersonalInfoPropertySetDto.html) &&
    ObjectUtils.equals(this.businessHomePage, mapiContactPersonalInfoPropertySetDto.businessHomePage) &&
    ObjectUtils.equals(this.ftpSite, mapiContactPersonalInfoPropertySetDto.ftpSite) &&
    ObjectUtils.equals(this.computerNetworkName, mapiContactPersonalInfoPropertySetDto.computerNetworkName) &&
    ObjectUtils.equals(this.gender, mapiContactPersonalInfoPropertySetDto.gender) &&
    ObjectUtils.equals(this.referredByName, mapiContactPersonalInfoPropertySetDto.referredByName) &&
    ObjectUtils.equals(this.children, mapiContactPersonalInfoPropertySetDto.children);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(spouseName, personalHomePage, language, notes, hobbies, location, instantMessagingAddress, organizationalIdNumber, customerId, governmentIdNumber, freeBusyLocation, account, html, businessHomePage, ftpSite, computerNetworkName, gender, referredByName, children);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MapiContactPersonalInfoPropertySetDto {\n");
    
    sb.append("    spouseName: ").append(toIndentedString(getSpouseName())).append("\n");
    sb.append("    personalHomePage: ").append(toIndentedString(getPersonalHomePage())).append("\n");
    sb.append("    language: ").append(toIndentedString(getLanguage())).append("\n");
    sb.append("    notes: ").append(toIndentedString(getNotes())).append("\n");
    sb.append("    hobbies: ").append(toIndentedString(getHobbies())).append("\n");
    sb.append("    location: ").append(toIndentedString(getLocation())).append("\n");
    sb.append("    instantMessagingAddress: ").append(toIndentedString(getInstantMessagingAddress())).append("\n");
    sb.append("    organizationalIdNumber: ").append(toIndentedString(getOrganizationalIdNumber())).append("\n");
    sb.append("    customerId: ").append(toIndentedString(getCustomerId())).append("\n");
    sb.append("    governmentIdNumber: ").append(toIndentedString(getGovernmentIdNumber())).append("\n");
    sb.append("    freeBusyLocation: ").append(toIndentedString(getFreeBusyLocation())).append("\n");
    sb.append("    account: ").append(toIndentedString(getAccount())).append("\n");
    sb.append("    html: ").append(toIndentedString(getHtml())).append("\n");
    sb.append("    businessHomePage: ").append(toIndentedString(getBusinessHomePage())).append("\n");
    sb.append("    ftpSite: ").append(toIndentedString(getFtpSite())).append("\n");
    sb.append("    computerNetworkName: ").append(toIndentedString(getComputerNetworkName())).append("\n");
    sb.append("    gender: ").append(toIndentedString(getGender())).append("\n");
    sb.append("    referredByName: ").append(toIndentedString(getReferredByName())).append("\n");
    sb.append("    children: ").append(toIndentedString(getChildren())).append("\n");
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

  public MapiContactPersonalInfoPropertySetDto() {
    super();
  }

  /**
   * Initializes a new instance of the MapiContactPersonalInfoPropertySetDto
   * @param spouseName Specifies the name of the contact&#39;s spouse/partner             
   * @param personalHomePage Specifies the contact&#39;s personal web page URL             
   * @param language Specifies the language that the contact uses             
   * @param notes Specifies the additional notes             
   * @param hobbies Specifies the hobbies of the contact             
   * @param location Specifies the location of the contact             
   * @param instantMessagingAddress Specifies the contact&#39;s instant messaging address             
   * @param organizationalIdNumber Specifies an organizational ID number for the contact             
   * @param customerId Specifies the contact&#39;s customer ID number             
   * @param governmentIdNumber Specifies the contact&#39;s government ID number             
   * @param freeBusyLocation Specifies a URL path from which a client can retrieve free/busy information for the contact as an iCal file             
   * @param account Specifies the account name of the contact             
   * @param html Specifies the contact&#39;s business web page URL             
   * @param businessHomePage Specifies the contact&#39;s business web page URL             
   * @param ftpSite Specifies the contact&#39;s File Transfer Protocol (FTP) URL             
   * @param computerNetworkName Specifies the name of the network to which the contact&#39;s computer is connected             
   * @param gender Gender of the contact Enum, available values: Unspecified, Female, Male
   * @param referredByName Specifies the name of the person who referred this contact to the user             
   * @param children Contains a list of names of children.             
   */
  public MapiContactPersonalInfoPropertySetDto(String spouseName, String personalHomePage, String language, String notes, String hobbies, String location, String instantMessagingAddress, String organizationalIdNumber, String customerId, String governmentIdNumber, String freeBusyLocation, String account, String html, String businessHomePage, String ftpSite, String computerNetworkName, String gender, String referredByName, List<String> children) {
    super();
    setSpouseName(spouseName);
    setPersonalHomePage(personalHomePage);
    setLanguage(language);
    setNotes(notes);
    setHobbies(hobbies);
    setLocation(location);
    setInstantMessagingAddress(instantMessagingAddress);
    setOrganizationalIdNumber(organizationalIdNumber);
    setCustomerId(customerId);
    setGovernmentIdNumber(governmentIdNumber);
    setFreeBusyLocation(freeBusyLocation);
    setAccount(account);
    setHtml(html);
    setBusinessHomePage(businessHomePage);
    setFtpSite(ftpSite);
    setComputerNetworkName(computerNetworkName);
    setGender(gender);
    setReferredByName(referredByName);
    setChildren(children);
  }

}

