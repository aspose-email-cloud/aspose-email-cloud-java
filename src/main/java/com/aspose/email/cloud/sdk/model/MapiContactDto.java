/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MapiContactDto.java">
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
 * Represents outlook contact information.             
 */
public class MapiContactDto extends MapiMessageItemBaseDto {
  @JsonProperty("electronicAddresses")
  private MapiContactElectronicAddressPropertySetDto electronicAddresses = null;
  @JsonProperty("events")
  private MapiContactEventPropertySetDto events = null;
  @JsonProperty("nameInfo")
  private MapiContactNamePropertySetDto nameInfo = null;
  @JsonProperty("otherFields")
  private MapiContactOtherPropertySetDto otherFields = null;
  @JsonProperty("personalInfo")
  private MapiContactPersonalInfoPropertySetDto personalInfo = null;
  @JsonProperty("photo")
  private MapiContactPhotoDto photo = null;
  @JsonProperty("physicalAddresses")
  private MapiContactPhysicalAddressPropertySetDto physicalAddresses = null;
  @JsonProperty("professionalInfo")
  private MapiContactProfessionalPropertySetDto professionalInfo = null;
  @JsonProperty("telephones")
  private MapiContactTelephonePropertySetDto telephones = null;

  /**
   * Set electronicAddresses and return this.
   * @param electronicAddresses Specify properties for up to three different e-mail addresses and three different fax addresses.             
   * @return this
  **/
  public MapiContactDto electronicAddresses(MapiContactElectronicAddressPropertySetDto electronicAddresses) {
    this.electronicAddresses = electronicAddresses;
    return this;
  }

  /**
   * Specify properties for up to three different e-mail addresses and three different fax addresses.             
   * @return electronicAddresses
  **/
  public MapiContactElectronicAddressPropertySetDto getElectronicAddresses() {
    return electronicAddresses;
  }  

  /**
   * Set electronicAddresses.
   * @param electronicAddresses Specify properties for up to three different e-mail addresses and three different fax addresses.             
  **/
  public void setElectronicAddresses(MapiContactElectronicAddressPropertySetDto electronicAddresses) {
    this.electronicAddresses = electronicAddresses;
  }


  /**
   * Set events and return this.
   * @param events Specify events associated with a contact.             
   * @return this
  **/
  public MapiContactDto events(MapiContactEventPropertySetDto events) {
    this.events = events;
    return this;
  }

  /**
   * Specify events associated with a contact.             
   * @return events
  **/
  public MapiContactEventPropertySetDto getEvents() {
    return events;
  }  

  /**
   * Set events.
   * @param events Specify events associated with a contact.             
  **/
  public void setEvents(MapiContactEventPropertySetDto events) {
    this.events = events;
  }


  /**
   * Set nameInfo and return this.
   * @param nameInfo The properties are used to specify the name of the person represented by the contact.             
   * @return this
  **/
  public MapiContactDto nameInfo(MapiContactNamePropertySetDto nameInfo) {
    this.nameInfo = nameInfo;
    return this;
  }

  /**
   * The properties are used to specify the name of the person represented by the contact.             
   * @return nameInfo
  **/
  public MapiContactNamePropertySetDto getNameInfo() {
    return nameInfo;
  }  

  /**
   * Set nameInfo.
   * @param nameInfo The properties are used to specify the name of the person represented by the contact.             
  **/
  public void setNameInfo(MapiContactNamePropertySetDto nameInfo) {
    this.nameInfo = nameInfo;
  }


  /**
   * Set otherFields and return this.
   * @param otherFields Specify other fields of contact.             
   * @return this
  **/
  public MapiContactDto otherFields(MapiContactOtherPropertySetDto otherFields) {
    this.otherFields = otherFields;
    return this;
  }

  /**
   * Specify other fields of contact.             
   * @return otherFields
  **/
  public MapiContactOtherPropertySetDto getOtherFields() {
    return otherFields;
  }  

  /**
   * Set otherFields.
   * @param otherFields Specify other fields of contact.             
  **/
  public void setOtherFields(MapiContactOtherPropertySetDto otherFields) {
    this.otherFields = otherFields;
  }


  /**
   * Set personalInfo and return this.
   * @param personalInfo Specify other additional contact information.             
   * @return this
  **/
  public MapiContactDto personalInfo(MapiContactPersonalInfoPropertySetDto personalInfo) {
    this.personalInfo = personalInfo;
    return this;
  }

  /**
   * Specify other additional contact information.             
   * @return personalInfo
  **/
  public MapiContactPersonalInfoPropertySetDto getPersonalInfo() {
    return personalInfo;
  }  

  /**
   * Set personalInfo.
   * @param personalInfo Specify other additional contact information.             
  **/
  public void setPersonalInfo(MapiContactPersonalInfoPropertySetDto personalInfo) {
    this.personalInfo = personalInfo;
  }


  /**
   * Set photo and return this.
   * @param photo Contact photo.             
   * @return this
  **/
  public MapiContactDto photo(MapiContactPhotoDto photo) {
    this.photo = photo;
    return this;
  }

  /**
   * Contact photo.             
   * @return photo
  **/
  public MapiContactPhotoDto getPhoto() {
    return photo;
  }  

  /**
   * Set photo.
   * @param photo Contact photo.             
  **/
  public void setPhoto(MapiContactPhotoDto photo) {
    this.photo = photo;
  }


  /**
   * Set physicalAddresses and return this.
   * @param physicalAddresses Specify three physical addresses: Home Address, Work Address, and Other Address. One of the addresses can be marked as the Mailing Address.             
   * @return this
  **/
  public MapiContactDto physicalAddresses(MapiContactPhysicalAddressPropertySetDto physicalAddresses) {
    this.physicalAddresses = physicalAddresses;
    return this;
  }

  /**
   * Specify three physical addresses: Home Address, Work Address, and Other Address. One of the addresses can be marked as the Mailing Address.             
   * @return physicalAddresses
  **/
  public MapiContactPhysicalAddressPropertySetDto getPhysicalAddresses() {
    return physicalAddresses;
  }  

  /**
   * Set physicalAddresses.
   * @param physicalAddresses Specify three physical addresses: Home Address, Work Address, and Other Address. One of the addresses can be marked as the Mailing Address.             
  **/
  public void setPhysicalAddresses(MapiContactPhysicalAddressPropertySetDto physicalAddresses) {
    this.physicalAddresses = physicalAddresses;
  }


  /**
   * Set professionalInfo and return this.
   * @param professionalInfo Properties are used to store professional details for the person represented by the contact.             
   * @return this
  **/
  public MapiContactDto professionalInfo(MapiContactProfessionalPropertySetDto professionalInfo) {
    this.professionalInfo = professionalInfo;
    return this;
  }

  /**
   * Properties are used to store professional details for the person represented by the contact.             
   * @return professionalInfo
  **/
  public MapiContactProfessionalPropertySetDto getProfessionalInfo() {
    return professionalInfo;
  }  

  /**
   * Set professionalInfo.
   * @param professionalInfo Properties are used to store professional details for the person represented by the contact.             
  **/
  public void setProfessionalInfo(MapiContactProfessionalPropertySetDto professionalInfo) {
    this.professionalInfo = professionalInfo;
  }


  /**
   * Set telephones and return this.
   * @param telephones Specify telephone numbers for the contact.             
   * @return this
  **/
  public MapiContactDto telephones(MapiContactTelephonePropertySetDto telephones) {
    this.telephones = telephones;
    return this;
  }

  /**
   * Specify telephone numbers for the contact.             
   * @return telephones
  **/
  public MapiContactTelephonePropertySetDto getTelephones() {
    return telephones;
  }  

  /**
   * Set telephones.
   * @param telephones Specify telephone numbers for the contact.             
  **/
  public void setTelephones(MapiContactTelephonePropertySetDto telephones) {
    this.telephones = telephones;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    MapiContactDto mapiContactDto = (MapiContactDto) o;
    return ObjectUtils.equals(this.electronicAddresses, mapiContactDto.electronicAddresses) &&
    ObjectUtils.equals(this.events, mapiContactDto.events) &&
    ObjectUtils.equals(this.nameInfo, mapiContactDto.nameInfo) &&
    ObjectUtils.equals(this.otherFields, mapiContactDto.otherFields) &&
    ObjectUtils.equals(this.personalInfo, mapiContactDto.personalInfo) &&
    ObjectUtils.equals(this.photo, mapiContactDto.photo) &&
    ObjectUtils.equals(this.physicalAddresses, mapiContactDto.physicalAddresses) &&
    ObjectUtils.equals(this.professionalInfo, mapiContactDto.professionalInfo) &&
    ObjectUtils.equals(this.telephones, mapiContactDto.telephones) &&
    super.equals(o);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(electronicAddresses, events, nameInfo, otherFields, personalInfo, photo, physicalAddresses, professionalInfo, telephones, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MapiContactDto {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    attachments: ").append(toIndentedString(getAttachments())).append("\n");
    sb.append("    billing: ").append(toIndentedString(getBilling())).append("\n");
    sb.append("    body: ").append(toIndentedString(getBody())).append("\n");
    sb.append("    bodyHtml: ").append(toIndentedString(getBodyHtml())).append("\n");
    sb.append("    bodyRtf: ").append(toIndentedString(getBodyRtf())).append("\n");
    sb.append("    bodyType: ").append(toIndentedString(getBodyType())).append("\n");
    sb.append("    categories: ").append(toIndentedString(getCategories())).append("\n");
    sb.append("    companies: ").append(toIndentedString(getCompanies())).append("\n");
    sb.append("    itemId: ").append(toIndentedString(getItemId())).append("\n");
    sb.append("    messageClass: ").append(toIndentedString(getMessageClass())).append("\n");
    sb.append("    mileage: ").append(toIndentedString(getMileage())).append("\n");
    sb.append("    recipients: ").append(toIndentedString(getRecipients())).append("\n");
    sb.append("    sensitivity: ").append(toIndentedString(getSensitivity())).append("\n");
    sb.append("    subject: ").append(toIndentedString(getSubject())).append("\n");
    sb.append("    subjectPrefix: ").append(toIndentedString(getSubjectPrefix())).append("\n");
    sb.append("    properties: ").append(toIndentedString(getProperties())).append("\n");
    sb.append("    discriminator: ").append(toIndentedString(getDiscriminator())).append("\n");
    sb.append("    electronicAddresses: ").append(toIndentedString(getElectronicAddresses())).append("\n");
    sb.append("    events: ").append(toIndentedString(getEvents())).append("\n");
    sb.append("    nameInfo: ").append(toIndentedString(getNameInfo())).append("\n");
    sb.append("    otherFields: ").append(toIndentedString(getOtherFields())).append("\n");
    sb.append("    personalInfo: ").append(toIndentedString(getPersonalInfo())).append("\n");
    sb.append("    photo: ").append(toIndentedString(getPhoto())).append("\n");
    sb.append("    physicalAddresses: ").append(toIndentedString(getPhysicalAddresses())).append("\n");
    sb.append("    professionalInfo: ").append(toIndentedString(getProfessionalInfo())).append("\n");
    sb.append("    telephones: ").append(toIndentedString(getTelephones())).append("\n");
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

  public MapiContactDto() {
    super();
  }

  /**
   * Initializes a new instance of the MapiContactDto
   * @param attachments Message item attachments.             
   * @param billing Billing information associated with an item.             
   * @param body Message text.             
   * @param bodyHtml Gets the BodyRtf of the message converted to HTML, if present, otherwise an empty string.             
   * @param bodyRtf RTF formatted message text.             
   * @param bodyType The content type of message body. Enum, available values: PlainText, Html, Rtf
   * @param categories Contains keywords or categories for the message object.             
   * @param companies Contains the names of the companies that are associated with an item.             
   * @param itemId The item id, uses with a server.             
   * @param messageClass Case-sensitive string that identifies the sender-defined message class, such as IPM.Note. The message class specifies the type, purpose, or content of the message.             
   * @param mileage Contains the mileage information that is associated with an item.             
   * @param recipients Recipients of the message.             
   * @param sensitivity Contains values that indicate the message sensitivity. Enum, available values: None, Personal, Private, CompanyConfidential
   * @param subject Subject of the message.             
   * @param subjectPrefix Subject prefix that typically indicates some action on a message, such as \&quot;FW: \&quot; for forwarding.             
   * @param properties List of MAPI properties             
   * @param electronicAddresses Specify properties for up to three different e-mail addresses and three different fax addresses.             
   * @param events Specify events associated with a contact.             
   * @param nameInfo The properties are used to specify the name of the person represented by the contact.             
   * @param otherFields Specify other fields of contact.             
   * @param personalInfo Specify other additional contact information.             
   * @param photo Contact photo.             
   * @param physicalAddresses Specify three physical addresses: Home Address, Work Address, and Other Address. One of the addresses can be marked as the Mailing Address.             
   * @param professionalInfo Properties are used to store professional details for the person represented by the contact.             
   * @param telephones Specify telephone numbers for the contact.             
   */
  public MapiContactDto(
    List<MapiAttachmentDto> attachments,
    String billing,
    String body,
    String bodyHtml,
    String bodyRtf,
    String bodyType,
    List<String> categories,
    List<String> companies,
    String itemId,
    String messageClass,
    String mileage,
    List<MapiRecipientDto> recipients,
    String sensitivity,
    String subject,
    String subjectPrefix,
    List<MapiPropertyDto> properties
    ,
    MapiContactElectronicAddressPropertySetDto electronicAddresses,
    MapiContactEventPropertySetDto events,
    MapiContactNamePropertySetDto nameInfo,
    MapiContactOtherPropertySetDto otherFields,
    MapiContactPersonalInfoPropertySetDto personalInfo,
    MapiContactPhotoDto photo,
    MapiContactPhysicalAddressPropertySetDto physicalAddresses,
    MapiContactProfessionalPropertySetDto professionalInfo,
    MapiContactTelephonePropertySetDto telephones
  ) {
    super();
    setAttachments(attachments);
    setBilling(billing);
    setBody(body);
    setBodyHtml(bodyHtml);
    setBodyRtf(bodyRtf);
    setBodyType(bodyType);
    setCategories(categories);
    setCompanies(companies);
    setItemId(itemId);
    setMessageClass(messageClass);
    setMileage(mileage);
    setRecipients(recipients);
    setSensitivity(sensitivity);
    setSubject(subject);
    setSubjectPrefix(subjectPrefix);
    setProperties(properties);
    setElectronicAddresses(electronicAddresses);
    setEvents(events);
    setNameInfo(nameInfo);
    setOtherFields(otherFields);
    setPersonalInfo(personalInfo);
    setPhoto(photo);
    setPhysicalAddresses(physicalAddresses);
    setProfessionalInfo(professionalInfo);
    setTelephones(telephones);
  }

}

