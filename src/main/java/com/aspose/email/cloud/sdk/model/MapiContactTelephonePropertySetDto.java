/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MapiContactTelephonePropertySetDto.java">
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
 * Specify optional telephone numbers for the contact.             
 */
public class MapiContactTelephonePropertySetDto {
  @JsonProperty("isEmpty")
  private Boolean isEmpty = null;

  @JsonProperty("defaultTelephoneNumber")
  private String defaultTelephoneNumber = null;

  @JsonProperty("useAutocomplete")
  private Boolean useAutocomplete = null;

  @JsonProperty("callbackTelephoneNumber")
  private String callbackTelephoneNumber = null;

  @JsonProperty("businessTelephoneNumber")
  private String businessTelephoneNumber = null;

  @JsonProperty("homeTelephoneNumber")
  private String homeTelephoneNumber = null;

  @JsonProperty("primaryTelephoneNumber")
  private String primaryTelephoneNumber = null;

  @JsonProperty("business2TelephoneNumber")
  private String business2TelephoneNumber = null;

  @JsonProperty("mobileTelephoneNumber")
  private String mobileTelephoneNumber = null;

  @JsonProperty("radioTelephoneNumber")
  private String radioTelephoneNumber = null;

  @JsonProperty("carTelephoneNumber")
  private String carTelephoneNumber = null;

  @JsonProperty("otherTelephoneNumber")
  private String otherTelephoneNumber = null;

  @JsonProperty("assistantTelephoneNumber")
  private String assistantTelephoneNumber = null;

  @JsonProperty("home2TelephoneNumber")
  private String home2TelephoneNumber = null;

  @JsonProperty("ttyTddPhoneNumber")
  private String ttyTddPhoneNumber = null;

  @JsonProperty("companyMainTelephoneNumber")
  private String companyMainTelephoneNumber = null;

  @JsonProperty("telexNumber")
  private String telexNumber = null;

  @JsonProperty("isdnNumber")
  private String isdnNumber = null;

  @JsonProperty("pagerTelephoneNumber")
  private String pagerTelephoneNumber = null;

  /**
   * Set isEmpty and return this.
   * @param isEmpty Shows if MapiContactTelephonePropertySet is empty             
   * @return this
  **/
  public MapiContactTelephonePropertySetDto isEmpty(Boolean isEmpty) {
    this.isEmpty = isEmpty;
    return this;
  }

  /**
   * Shows if MapiContactTelephonePropertySet is empty             
   * @return isEmpty
  **/
  public Boolean isIsEmpty() {
    return isEmpty;
  }  

  /**
   * Set isEmpty.
   * @param isEmpty Shows if MapiContactTelephonePropertySet is empty             
  **/
  public void setIsEmpty(Boolean isEmpty) {
    this.isEmpty = isEmpty;
  }

  /**
   * Set defaultTelephoneNumber and return this.
   * @param defaultTelephoneNumber Default value of electronic address Uses when user does not set any electronic address if UseAutocomplete property is set &#39;true&#39;             
   * @return this
  **/
  public MapiContactTelephonePropertySetDto defaultTelephoneNumber(String defaultTelephoneNumber) {
    this.defaultTelephoneNumber = defaultTelephoneNumber;
    return this;
  }

  /**
   * Default value of electronic address Uses when user does not set any electronic address if UseAutocomplete property is set &#39;true&#39;             
   * @return defaultTelephoneNumber
  **/
  public String getDefaultTelephoneNumber() {
    return defaultTelephoneNumber;
  }  

  /**
   * Set defaultTelephoneNumber.
   * @param defaultTelephoneNumber Default value of electronic address Uses when user does not set any electronic address if UseAutocomplete property is set &#39;true&#39;             
  **/
  public void setDefaultTelephoneNumber(String defaultTelephoneNumber) {
    this.defaultTelephoneNumber = defaultTelephoneNumber;
  }

  /**
   * Set useAutocomplete and return this.
   * @param useAutocomplete Indicates that one electronic address is completed automatically in case if user does not set any electronic address             
   * @return this
  **/
  public MapiContactTelephonePropertySetDto useAutocomplete(Boolean useAutocomplete) {
    this.useAutocomplete = useAutocomplete;
    return this;
  }

  /**
   * Indicates that one electronic address is completed automatically in case if user does not set any electronic address             
   * @return useAutocomplete
  **/
  public Boolean isUseAutocomplete() {
    return useAutocomplete;
  }  

  /**
   * Set useAutocomplete.
   * @param useAutocomplete Indicates that one electronic address is completed automatically in case if user does not set any electronic address             
  **/
  public void setUseAutocomplete(Boolean useAutocomplete) {
    this.useAutocomplete = useAutocomplete;
  }

  /**
   * Set callbackTelephoneNumber and return this.
   * @param callbackTelephoneNumber Gets or sets the callback telephone number             
   * @return this
  **/
  public MapiContactTelephonePropertySetDto callbackTelephoneNumber(String callbackTelephoneNumber) {
    this.callbackTelephoneNumber = callbackTelephoneNumber;
    return this;
  }

  /**
   * Gets or sets the callback telephone number             
   * @return callbackTelephoneNumber
  **/
  public String getCallbackTelephoneNumber() {
    return callbackTelephoneNumber;
  }  

  /**
   * Set callbackTelephoneNumber.
   * @param callbackTelephoneNumber Gets or sets the callback telephone number             
  **/
  public void setCallbackTelephoneNumber(String callbackTelephoneNumber) {
    this.callbackTelephoneNumber = callbackTelephoneNumber;
  }

  /**
   * Set businessTelephoneNumber and return this.
   * @param businessTelephoneNumber Gets or sets the business telephone number             
   * @return this
  **/
  public MapiContactTelephonePropertySetDto businessTelephoneNumber(String businessTelephoneNumber) {
    this.businessTelephoneNumber = businessTelephoneNumber;
    return this;
  }

  /**
   * Gets or sets the business telephone number             
   * @return businessTelephoneNumber
  **/
  public String getBusinessTelephoneNumber() {
    return businessTelephoneNumber;
  }  

  /**
   * Set businessTelephoneNumber.
   * @param businessTelephoneNumber Gets or sets the business telephone number             
  **/
  public void setBusinessTelephoneNumber(String businessTelephoneNumber) {
    this.businessTelephoneNumber = businessTelephoneNumber;
  }

  /**
   * Set homeTelephoneNumber and return this.
   * @param homeTelephoneNumber Gets or sets the home telephone number             
   * @return this
  **/
  public MapiContactTelephonePropertySetDto homeTelephoneNumber(String homeTelephoneNumber) {
    this.homeTelephoneNumber = homeTelephoneNumber;
    return this;
  }

  /**
   * Gets or sets the home telephone number             
   * @return homeTelephoneNumber
  **/
  public String getHomeTelephoneNumber() {
    return homeTelephoneNumber;
  }  

  /**
   * Set homeTelephoneNumber.
   * @param homeTelephoneNumber Gets or sets the home telephone number             
  **/
  public void setHomeTelephoneNumber(String homeTelephoneNumber) {
    this.homeTelephoneNumber = homeTelephoneNumber;
  }

  /**
   * Set primaryTelephoneNumber and return this.
   * @param primaryTelephoneNumber Gets or sets the primary telephone number             
   * @return this
  **/
  public MapiContactTelephonePropertySetDto primaryTelephoneNumber(String primaryTelephoneNumber) {
    this.primaryTelephoneNumber = primaryTelephoneNumber;
    return this;
  }

  /**
   * Gets or sets the primary telephone number             
   * @return primaryTelephoneNumber
  **/
  public String getPrimaryTelephoneNumber() {
    return primaryTelephoneNumber;
  }  

  /**
   * Set primaryTelephoneNumber.
   * @param primaryTelephoneNumber Gets or sets the primary telephone number             
  **/
  public void setPrimaryTelephoneNumber(String primaryTelephoneNumber) {
    this.primaryTelephoneNumber = primaryTelephoneNumber;
  }

  /**
   * Set business2TelephoneNumber and return this.
   * @param business2TelephoneNumber Gets or sets the second business telephone number             
   * @return this
  **/
  public MapiContactTelephonePropertySetDto business2TelephoneNumber(String business2TelephoneNumber) {
    this.business2TelephoneNumber = business2TelephoneNumber;
    return this;
  }

  /**
   * Gets or sets the second business telephone number             
   * @return business2TelephoneNumber
  **/
  public String getBusiness2TelephoneNumber() {
    return business2TelephoneNumber;
  }  

  /**
   * Set business2TelephoneNumber.
   * @param business2TelephoneNumber Gets or sets the second business telephone number             
  **/
  public void setBusiness2TelephoneNumber(String business2TelephoneNumber) {
    this.business2TelephoneNumber = business2TelephoneNumber;
  }

  /**
   * Set mobileTelephoneNumber and return this.
   * @param mobileTelephoneNumber Gets or sets the mobile telephone number             
   * @return this
  **/
  public MapiContactTelephonePropertySetDto mobileTelephoneNumber(String mobileTelephoneNumber) {
    this.mobileTelephoneNumber = mobileTelephoneNumber;
    return this;
  }

  /**
   * Gets or sets the mobile telephone number             
   * @return mobileTelephoneNumber
  **/
  public String getMobileTelephoneNumber() {
    return mobileTelephoneNumber;
  }  

  /**
   * Set mobileTelephoneNumber.
   * @param mobileTelephoneNumber Gets or sets the mobile telephone number             
  **/
  public void setMobileTelephoneNumber(String mobileTelephoneNumber) {
    this.mobileTelephoneNumber = mobileTelephoneNumber;
  }

  /**
   * Set radioTelephoneNumber and return this.
   * @param radioTelephoneNumber Gets or sets the radio telephone number             
   * @return this
  **/
  public MapiContactTelephonePropertySetDto radioTelephoneNumber(String radioTelephoneNumber) {
    this.radioTelephoneNumber = radioTelephoneNumber;
    return this;
  }

  /**
   * Gets or sets the radio telephone number             
   * @return radioTelephoneNumber
  **/
  public String getRadioTelephoneNumber() {
    return radioTelephoneNumber;
  }  

  /**
   * Set radioTelephoneNumber.
   * @param radioTelephoneNumber Gets or sets the radio telephone number             
  **/
  public void setRadioTelephoneNumber(String radioTelephoneNumber) {
    this.radioTelephoneNumber = radioTelephoneNumber;
  }

  /**
   * Set carTelephoneNumber and return this.
   * @param carTelephoneNumber Gets or sets the car telephone number             
   * @return this
  **/
  public MapiContactTelephonePropertySetDto carTelephoneNumber(String carTelephoneNumber) {
    this.carTelephoneNumber = carTelephoneNumber;
    return this;
  }

  /**
   * Gets or sets the car telephone number             
   * @return carTelephoneNumber
  **/
  public String getCarTelephoneNumber() {
    return carTelephoneNumber;
  }  

  /**
   * Set carTelephoneNumber.
   * @param carTelephoneNumber Gets or sets the car telephone number             
  **/
  public void setCarTelephoneNumber(String carTelephoneNumber) {
    this.carTelephoneNumber = carTelephoneNumber;
  }

  /**
   * Set otherTelephoneNumber and return this.
   * @param otherTelephoneNumber Gets or sets an alternate telephone number             
   * @return this
  **/
  public MapiContactTelephonePropertySetDto otherTelephoneNumber(String otherTelephoneNumber) {
    this.otherTelephoneNumber = otherTelephoneNumber;
    return this;
  }

  /**
   * Gets or sets an alternate telephone number             
   * @return otherTelephoneNumber
  **/
  public String getOtherTelephoneNumber() {
    return otherTelephoneNumber;
  }  

  /**
   * Set otherTelephoneNumber.
   * @param otherTelephoneNumber Gets or sets an alternate telephone number             
  **/
  public void setOtherTelephoneNumber(String otherTelephoneNumber) {
    this.otherTelephoneNumber = otherTelephoneNumber;
  }

  /**
   * Set assistantTelephoneNumber and return this.
   * @param assistantTelephoneNumber Gets or sets the telephone number of the contact&#39;s assistant             
   * @return this
  **/
  public MapiContactTelephonePropertySetDto assistantTelephoneNumber(String assistantTelephoneNumber) {
    this.assistantTelephoneNumber = assistantTelephoneNumber;
    return this;
  }

  /**
   * Gets or sets the telephone number of the contact&#39;s assistant             
   * @return assistantTelephoneNumber
  **/
  public String getAssistantTelephoneNumber() {
    return assistantTelephoneNumber;
  }  

  /**
   * Set assistantTelephoneNumber.
   * @param assistantTelephoneNumber Gets or sets the telephone number of the contact&#39;s assistant             
  **/
  public void setAssistantTelephoneNumber(String assistantTelephoneNumber) {
    this.assistantTelephoneNumber = assistantTelephoneNumber;
  }

  /**
   * Set home2TelephoneNumber and return this.
   * @param home2TelephoneNumber Gets or sets a second home telephone number             
   * @return this
  **/
  public MapiContactTelephonePropertySetDto home2TelephoneNumber(String home2TelephoneNumber) {
    this.home2TelephoneNumber = home2TelephoneNumber;
    return this;
  }

  /**
   * Gets or sets a second home telephone number             
   * @return home2TelephoneNumber
  **/
  public String getHome2TelephoneNumber() {
    return home2TelephoneNumber;
  }  

  /**
   * Set home2TelephoneNumber.
   * @param home2TelephoneNumber Gets or sets a second home telephone number             
  **/
  public void setHome2TelephoneNumber(String home2TelephoneNumber) {
    this.home2TelephoneNumber = home2TelephoneNumber;
  }

  /**
   * Set ttyTddPhoneNumber and return this.
   * @param ttyTddPhoneNumber Gets or sets the telephone number for the contact&#39;s text telephone (TTY) or telecommunication device for the deaf (TDD)             
   * @return this
  **/
  public MapiContactTelephonePropertySetDto ttyTddPhoneNumber(String ttyTddPhoneNumber) {
    this.ttyTddPhoneNumber = ttyTddPhoneNumber;
    return this;
  }

  /**
   * Gets or sets the telephone number for the contact&#39;s text telephone (TTY) or telecommunication device for the deaf (TDD)             
   * @return ttyTddPhoneNumber
  **/
  public String getTtyTddPhoneNumber() {
    return ttyTddPhoneNumber;
  }  

  /**
   * Set ttyTddPhoneNumber.
   * @param ttyTddPhoneNumber Gets or sets the telephone number for the contact&#39;s text telephone (TTY) or telecommunication device for the deaf (TDD)             
  **/
  public void setTtyTddPhoneNumber(String ttyTddPhoneNumber) {
    this.ttyTddPhoneNumber = ttyTddPhoneNumber;
  }

  /**
   * Set companyMainTelephoneNumber and return this.
   * @param companyMainTelephoneNumber Gets or sets the company phone number             
   * @return this
  **/
  public MapiContactTelephonePropertySetDto companyMainTelephoneNumber(String companyMainTelephoneNumber) {
    this.companyMainTelephoneNumber = companyMainTelephoneNumber;
    return this;
  }

  /**
   * Gets or sets the company phone number             
   * @return companyMainTelephoneNumber
  **/
  public String getCompanyMainTelephoneNumber() {
    return companyMainTelephoneNumber;
  }  

  /**
   * Set companyMainTelephoneNumber.
   * @param companyMainTelephoneNumber Gets or sets the company phone number             
  **/
  public void setCompanyMainTelephoneNumber(String companyMainTelephoneNumber) {
    this.companyMainTelephoneNumber = companyMainTelephoneNumber;
  }

  /**
   * Set telexNumber and return this.
   * @param telexNumber Gets or sets the telex number             
   * @return this
  **/
  public MapiContactTelephonePropertySetDto telexNumber(String telexNumber) {
    this.telexNumber = telexNumber;
    return this;
  }

  /**
   * Gets or sets the telex number             
   * @return telexNumber
  **/
  public String getTelexNumber() {
    return telexNumber;
  }  

  /**
   * Set telexNumber.
   * @param telexNumber Gets or sets the telex number             
  **/
  public void setTelexNumber(String telexNumber) {
    this.telexNumber = telexNumber;
  }

  /**
   * Set isdnNumber and return this.
   * @param isdnNumber Gets or sets the integrated services digital network (ISDN) number             
   * @return this
  **/
  public MapiContactTelephonePropertySetDto isdnNumber(String isdnNumber) {
    this.isdnNumber = isdnNumber;
    return this;
  }

  /**
   * Gets or sets the integrated services digital network (ISDN) number             
   * @return isdnNumber
  **/
  public String getIsdnNumber() {
    return isdnNumber;
  }  

  /**
   * Set isdnNumber.
   * @param isdnNumber Gets or sets the integrated services digital network (ISDN) number             
  **/
  public void setIsdnNumber(String isdnNumber) {
    this.isdnNumber = isdnNumber;
  }

  /**
   * Set pagerTelephoneNumber and return this.
   * @param pagerTelephoneNumber Gets or sets a pager telephone number             
   * @return this
  **/
  public MapiContactTelephonePropertySetDto pagerTelephoneNumber(String pagerTelephoneNumber) {
    this.pagerTelephoneNumber = pagerTelephoneNumber;
    return this;
  }

  /**
   * Gets or sets a pager telephone number             
   * @return pagerTelephoneNumber
  **/
  public String getPagerTelephoneNumber() {
    return pagerTelephoneNumber;
  }  

  /**
   * Set pagerTelephoneNumber.
   * @param pagerTelephoneNumber Gets or sets a pager telephone number             
  **/
  public void setPagerTelephoneNumber(String pagerTelephoneNumber) {
    this.pagerTelephoneNumber = pagerTelephoneNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    MapiContactTelephonePropertySetDto mapiContactTelephonePropertySetDto = (MapiContactTelephonePropertySetDto) o;
    return ObjectUtils.equals(this.isEmpty, mapiContactTelephonePropertySetDto.isEmpty) &&
    ObjectUtils.equals(this.defaultTelephoneNumber, mapiContactTelephonePropertySetDto.defaultTelephoneNumber) &&
    ObjectUtils.equals(this.useAutocomplete, mapiContactTelephonePropertySetDto.useAutocomplete) &&
    ObjectUtils.equals(this.callbackTelephoneNumber, mapiContactTelephonePropertySetDto.callbackTelephoneNumber) &&
    ObjectUtils.equals(this.businessTelephoneNumber, mapiContactTelephonePropertySetDto.businessTelephoneNumber) &&
    ObjectUtils.equals(this.homeTelephoneNumber, mapiContactTelephonePropertySetDto.homeTelephoneNumber) &&
    ObjectUtils.equals(this.primaryTelephoneNumber, mapiContactTelephonePropertySetDto.primaryTelephoneNumber) &&
    ObjectUtils.equals(this.business2TelephoneNumber, mapiContactTelephonePropertySetDto.business2TelephoneNumber) &&
    ObjectUtils.equals(this.mobileTelephoneNumber, mapiContactTelephonePropertySetDto.mobileTelephoneNumber) &&
    ObjectUtils.equals(this.radioTelephoneNumber, mapiContactTelephonePropertySetDto.radioTelephoneNumber) &&
    ObjectUtils.equals(this.carTelephoneNumber, mapiContactTelephonePropertySetDto.carTelephoneNumber) &&
    ObjectUtils.equals(this.otherTelephoneNumber, mapiContactTelephonePropertySetDto.otherTelephoneNumber) &&
    ObjectUtils.equals(this.assistantTelephoneNumber, mapiContactTelephonePropertySetDto.assistantTelephoneNumber) &&
    ObjectUtils.equals(this.home2TelephoneNumber, mapiContactTelephonePropertySetDto.home2TelephoneNumber) &&
    ObjectUtils.equals(this.ttyTddPhoneNumber, mapiContactTelephonePropertySetDto.ttyTddPhoneNumber) &&
    ObjectUtils.equals(this.companyMainTelephoneNumber, mapiContactTelephonePropertySetDto.companyMainTelephoneNumber) &&
    ObjectUtils.equals(this.telexNumber, mapiContactTelephonePropertySetDto.telexNumber) &&
    ObjectUtils.equals(this.isdnNumber, mapiContactTelephonePropertySetDto.isdnNumber) &&
    ObjectUtils.equals(this.pagerTelephoneNumber, mapiContactTelephonePropertySetDto.pagerTelephoneNumber);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(isEmpty, defaultTelephoneNumber, useAutocomplete, callbackTelephoneNumber, businessTelephoneNumber, homeTelephoneNumber, primaryTelephoneNumber, business2TelephoneNumber, mobileTelephoneNumber, radioTelephoneNumber, carTelephoneNumber, otherTelephoneNumber, assistantTelephoneNumber, home2TelephoneNumber, ttyTddPhoneNumber, companyMainTelephoneNumber, telexNumber, isdnNumber, pagerTelephoneNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MapiContactTelephonePropertySetDto {\n");
    
    sb.append("    isEmpty: ").append(toIndentedString(isIsEmpty())).append("\n");
    sb.append("    defaultTelephoneNumber: ").append(toIndentedString(getDefaultTelephoneNumber())).append("\n");
    sb.append("    useAutocomplete: ").append(toIndentedString(isUseAutocomplete())).append("\n");
    sb.append("    callbackTelephoneNumber: ").append(toIndentedString(getCallbackTelephoneNumber())).append("\n");
    sb.append("    businessTelephoneNumber: ").append(toIndentedString(getBusinessTelephoneNumber())).append("\n");
    sb.append("    homeTelephoneNumber: ").append(toIndentedString(getHomeTelephoneNumber())).append("\n");
    sb.append("    primaryTelephoneNumber: ").append(toIndentedString(getPrimaryTelephoneNumber())).append("\n");
    sb.append("    business2TelephoneNumber: ").append(toIndentedString(getBusiness2TelephoneNumber())).append("\n");
    sb.append("    mobileTelephoneNumber: ").append(toIndentedString(getMobileTelephoneNumber())).append("\n");
    sb.append("    radioTelephoneNumber: ").append(toIndentedString(getRadioTelephoneNumber())).append("\n");
    sb.append("    carTelephoneNumber: ").append(toIndentedString(getCarTelephoneNumber())).append("\n");
    sb.append("    otherTelephoneNumber: ").append(toIndentedString(getOtherTelephoneNumber())).append("\n");
    sb.append("    assistantTelephoneNumber: ").append(toIndentedString(getAssistantTelephoneNumber())).append("\n");
    sb.append("    home2TelephoneNumber: ").append(toIndentedString(getHome2TelephoneNumber())).append("\n");
    sb.append("    ttyTddPhoneNumber: ").append(toIndentedString(getTtyTddPhoneNumber())).append("\n");
    sb.append("    companyMainTelephoneNumber: ").append(toIndentedString(getCompanyMainTelephoneNumber())).append("\n");
    sb.append("    telexNumber: ").append(toIndentedString(getTelexNumber())).append("\n");
    sb.append("    isdnNumber: ").append(toIndentedString(getIsdnNumber())).append("\n");
    sb.append("    pagerTelephoneNumber: ").append(toIndentedString(getPagerTelephoneNumber())).append("\n");
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

  public MapiContactTelephonePropertySetDto() {
    super();
  }

  /**
   * Initializes a new instance of the MapiContactTelephonePropertySetDto
   * @param isEmpty Shows if MapiContactTelephonePropertySet is empty             
   * @param defaultTelephoneNumber Default value of electronic address Uses when user does not set any electronic address if UseAutocomplete property is set &#39;true&#39;             
   * @param useAutocomplete Indicates that one electronic address is completed automatically in case if user does not set any electronic address             
   * @param callbackTelephoneNumber Gets or sets the callback telephone number             
   * @param businessTelephoneNumber Gets or sets the business telephone number             
   * @param homeTelephoneNumber Gets or sets the home telephone number             
   * @param primaryTelephoneNumber Gets or sets the primary telephone number             
   * @param business2TelephoneNumber Gets or sets the second business telephone number             
   * @param mobileTelephoneNumber Gets or sets the mobile telephone number             
   * @param radioTelephoneNumber Gets or sets the radio telephone number             
   * @param carTelephoneNumber Gets or sets the car telephone number             
   * @param otherTelephoneNumber Gets or sets an alternate telephone number             
   * @param assistantTelephoneNumber Gets or sets the telephone number of the contact&#39;s assistant             
   * @param home2TelephoneNumber Gets or sets a second home telephone number             
   * @param ttyTddPhoneNumber Gets or sets the telephone number for the contact&#39;s text telephone (TTY) or telecommunication device for the deaf (TDD)             
   * @param companyMainTelephoneNumber Gets or sets the company phone number             
   * @param telexNumber Gets or sets the telex number             
   * @param isdnNumber Gets or sets the integrated services digital network (ISDN) number             
   * @param pagerTelephoneNumber Gets or sets a pager telephone number             
   */
  public MapiContactTelephonePropertySetDto(
    Boolean isEmpty,
    String defaultTelephoneNumber,
    Boolean useAutocomplete,
    String callbackTelephoneNumber,
    String businessTelephoneNumber,
    String homeTelephoneNumber,
    String primaryTelephoneNumber,
    String business2TelephoneNumber,
    String mobileTelephoneNumber,
    String radioTelephoneNumber,
    String carTelephoneNumber,
    String otherTelephoneNumber,
    String assistantTelephoneNumber,
    String home2TelephoneNumber,
    String ttyTddPhoneNumber,
    String companyMainTelephoneNumber,
    String telexNumber,
    String isdnNumber,
    String pagerTelephoneNumber
  ) {
    super();
    setIsEmpty(isEmpty);
    setDefaultTelephoneNumber(defaultTelephoneNumber);
    setUseAutocomplete(useAutocomplete);
    setCallbackTelephoneNumber(callbackTelephoneNumber);
    setBusinessTelephoneNumber(businessTelephoneNumber);
    setHomeTelephoneNumber(homeTelephoneNumber);
    setPrimaryTelephoneNumber(primaryTelephoneNumber);
    setBusiness2TelephoneNumber(business2TelephoneNumber);
    setMobileTelephoneNumber(mobileTelephoneNumber);
    setRadioTelephoneNumber(radioTelephoneNumber);
    setCarTelephoneNumber(carTelephoneNumber);
    setOtherTelephoneNumber(otherTelephoneNumber);
    setAssistantTelephoneNumber(assistantTelephoneNumber);
    setHome2TelephoneNumber(home2TelephoneNumber);
    setTtyTddPhoneNumber(ttyTddPhoneNumber);
    setCompanyMainTelephoneNumber(companyMainTelephoneNumber);
    setTelexNumber(telexNumber);
    setIsdnNumber(isdnNumber);
    setPagerTelephoneNumber(pagerTelephoneNumber);
  }

}

