/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MapiMessageItemBaseDto.java">
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
 * Base Dto for MapiMessage, MapiCalendar or MapiContact             
 */
public class MapiMessageItemBaseDto {
  @JsonProperty("attachments")
  private List<MapiAttachmentDto> attachments = null;
  @JsonProperty("billing")
  private String billing = null;
  @JsonProperty("body")
  private String body = null;
  @JsonProperty("bodyHtml")
  private String bodyHtml = null;
  @JsonProperty("bodyRtf")
  private String bodyRtf = null;
  @JsonProperty("bodyType")
  private String bodyType = null;
  @JsonProperty("categories")
  private List<String> categories = null;
  @JsonProperty("companies")
  private List<String> companies = null;
  @JsonProperty("itemId")
  private String itemId = null;
  @JsonProperty("messageClass")
  private String messageClass = null;
  @JsonProperty("mileage")
  private String mileage = null;
  @JsonProperty("recipients")
  private List<MapiRecipientDto> recipients = null;
  @JsonProperty("sensitivity")
  private String sensitivity = null;
  @JsonProperty("subject")
  private String subject = null;
  @JsonProperty("subjectPrefix")
  private String subjectPrefix = null;
  @JsonProperty("properties")
  private List<MapiPropertyDto> properties = null;
  @JsonProperty("discriminator")
  private String discriminator = this.getClass().getSimpleName();

  /**
   * Set attachments and return this.
   * @param attachments Message item attachments.             
   * @return this
  **/
  public MapiMessageItemBaseDto attachments(List<MapiAttachmentDto> attachments) {
    this.attachments = attachments;
    return this;
  }
  /**
   * Add an item to attachments and return this.
   * @param attachmentsItem An item of: Message item attachments.             
   * @return this
  **/
  public MapiMessageItemBaseDto addAttachmentsItem(MapiAttachmentDto attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<MapiAttachmentDto>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

  /**
   * Message item attachments.             
   * @return attachments
  **/
  public List<MapiAttachmentDto> getAttachments() {
    return attachments;
  }  

  /**
   * Set attachments.
   * @param attachments Message item attachments.             
  **/
  public void setAttachments(List<MapiAttachmentDto> attachments) {
    this.attachments = attachments;
  }


  /**
   * Set billing and return this.
   * @param billing Billing information associated with an item.             
   * @return this
  **/
  public MapiMessageItemBaseDto billing(String billing) {
    this.billing = billing;
    return this;
  }

  /**
   * Billing information associated with an item.             
   * @return billing
  **/
  public String getBilling() {
    return billing;
  }  

  /**
   * Set billing.
   * @param billing Billing information associated with an item.             
  **/
  public void setBilling(String billing) {
    this.billing = billing;
  }


  /**
   * Set body and return this.
   * @param body Message text.             
   * @return this
  **/
  public MapiMessageItemBaseDto body(String body) {
    this.body = body;
    return this;
  }

  /**
   * Message text.             
   * @return body
  **/
  public String getBody() {
    return body;
  }  

  /**
   * Set body.
   * @param body Message text.             
  **/
  public void setBody(String body) {
    this.body = body;
  }


  /**
   * Set bodyHtml and return this.
   * @param bodyHtml Gets the BodyRtf of the message converted to HTML, if present, otherwise an empty string.             
   * @return this
  **/
  public MapiMessageItemBaseDto bodyHtml(String bodyHtml) {
    this.bodyHtml = bodyHtml;
    return this;
  }

  /**
   * Gets the BodyRtf of the message converted to HTML, if present, otherwise an empty string.             
   * @return bodyHtml
  **/
  public String getBodyHtml() {
    return bodyHtml;
  }  

  /**
   * Set bodyHtml.
   * @param bodyHtml Gets the BodyRtf of the message converted to HTML, if present, otherwise an empty string.             
  **/
  public void setBodyHtml(String bodyHtml) {
    this.bodyHtml = bodyHtml;
  }


  /**
   * Set bodyRtf and return this.
   * @param bodyRtf RTF formatted message text.             
   * @return this
  **/
  public MapiMessageItemBaseDto bodyRtf(String bodyRtf) {
    this.bodyRtf = bodyRtf;
    return this;
  }

  /**
   * RTF formatted message text.             
   * @return bodyRtf
  **/
  public String getBodyRtf() {
    return bodyRtf;
  }  

  /**
   * Set bodyRtf.
   * @param bodyRtf RTF formatted message text.             
  **/
  public void setBodyRtf(String bodyRtf) {
    this.bodyRtf = bodyRtf;
  }


  /**
   * Set bodyType and return this.
   * @param bodyType The content type of message body. Enum, available values: PlainText, Html, Rtf
   * @return this
  **/
  public MapiMessageItemBaseDto bodyType(String bodyType) {
    this.bodyType = bodyType;
    return this;
  }

  /**
   * The content type of message body. Enum, available values: PlainText, Html, Rtf
   * @return bodyType
  **/
  public String getBodyType() {
    return bodyType;
  }  

  /**
   * Set bodyType.
   * @param bodyType The content type of message body. Enum, available values: PlainText, Html, Rtf
  **/
  public void setBodyType(String bodyType) {
    this.bodyType = bodyType;
  }


  /**
   * Set categories and return this.
   * @param categories Contains keywords or categories for the message object.             
   * @return this
  **/
  public MapiMessageItemBaseDto categories(List<String> categories) {
    this.categories = categories;
    return this;
  }
  /**
   * Add an item to categories and return this.
   * @param categoriesItem An item of: Contains keywords or categories for the message object.             
   * @return this
  **/
  public MapiMessageItemBaseDto addCategoriesItem(String categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<String>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

  /**
   * Contains keywords or categories for the message object.             
   * @return categories
  **/
  public List<String> getCategories() {
    return categories;
  }  

  /**
   * Set categories.
   * @param categories Contains keywords or categories for the message object.             
  **/
  public void setCategories(List<String> categories) {
    this.categories = categories;
  }


  /**
   * Set companies and return this.
   * @param companies Contains the names of the companies that are associated with an item.             
   * @return this
  **/
  public MapiMessageItemBaseDto companies(List<String> companies) {
    this.companies = companies;
    return this;
  }
  /**
   * Add an item to companies and return this.
   * @param companiesItem An item of: Contains the names of the companies that are associated with an item.             
   * @return this
  **/
  public MapiMessageItemBaseDto addCompaniesItem(String companiesItem) {
    if (this.companies == null) {
      this.companies = new ArrayList<String>();
    }
    this.companies.add(companiesItem);
    return this;
  }

  /**
   * Contains the names of the companies that are associated with an item.             
   * @return companies
  **/
  public List<String> getCompanies() {
    return companies;
  }  

  /**
   * Set companies.
   * @param companies Contains the names of the companies that are associated with an item.             
  **/
  public void setCompanies(List<String> companies) {
    this.companies = companies;
  }


  /**
   * Set itemId and return this.
   * @param itemId The item id, uses with a server.             
   * @return this
  **/
  public MapiMessageItemBaseDto itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

  /**
   * The item id, uses with a server.             
   * @return itemId
  **/
  public String getItemId() {
    return itemId;
  }  

  /**
   * Set itemId.
   * @param itemId The item id, uses with a server.             
  **/
  public void setItemId(String itemId) {
    this.itemId = itemId;
  }


  /**
   * Set messageClass and return this.
   * @param messageClass Case-sensitive string that identifies the sender-defined message class, such as IPM.Note. The message class specifies the type, purpose, or content of the message.             
   * @return this
  **/
  public MapiMessageItemBaseDto messageClass(String messageClass) {
    this.messageClass = messageClass;
    return this;
  }

  /**
   * Case-sensitive string that identifies the sender-defined message class, such as IPM.Note. The message class specifies the type, purpose, or content of the message.             
   * @return messageClass
  **/
  public String getMessageClass() {
    return messageClass;
  }  

  /**
   * Set messageClass.
   * @param messageClass Case-sensitive string that identifies the sender-defined message class, such as IPM.Note. The message class specifies the type, purpose, or content of the message.             
  **/
  public void setMessageClass(String messageClass) {
    this.messageClass = messageClass;
  }


  /**
   * Set mileage and return this.
   * @param mileage Contains the mileage information that is associated with an item.             
   * @return this
  **/
  public MapiMessageItemBaseDto mileage(String mileage) {
    this.mileage = mileage;
    return this;
  }

  /**
   * Contains the mileage information that is associated with an item.             
   * @return mileage
  **/
  public String getMileage() {
    return mileage;
  }  

  /**
   * Set mileage.
   * @param mileage Contains the mileage information that is associated with an item.             
  **/
  public void setMileage(String mileage) {
    this.mileage = mileage;
  }


  /**
   * Set recipients and return this.
   * @param recipients Recipients of the message.             
   * @return this
  **/
  public MapiMessageItemBaseDto recipients(List<MapiRecipientDto> recipients) {
    this.recipients = recipients;
    return this;
  }
  /**
   * Add an item to recipients and return this.
   * @param recipientsItem An item of: Recipients of the message.             
   * @return this
  **/
  public MapiMessageItemBaseDto addRecipientsItem(MapiRecipientDto recipientsItem) {
    if (this.recipients == null) {
      this.recipients = new ArrayList<MapiRecipientDto>();
    }
    this.recipients.add(recipientsItem);
    return this;
  }

  /**
   * Recipients of the message.             
   * @return recipients
  **/
  public List<MapiRecipientDto> getRecipients() {
    return recipients;
  }  

  /**
   * Set recipients.
   * @param recipients Recipients of the message.             
  **/
  public void setRecipients(List<MapiRecipientDto> recipients) {
    this.recipients = recipients;
  }


  /**
   * Set sensitivity and return this.
   * @param sensitivity Contains values that indicate the message sensitivity. Enum, available values: None, Personal, Private, CompanyConfidential
   * @return this
  **/
  public MapiMessageItemBaseDto sensitivity(String sensitivity) {
    this.sensitivity = sensitivity;
    return this;
  }

  /**
   * Contains values that indicate the message sensitivity. Enum, available values: None, Personal, Private, CompanyConfidential
   * @return sensitivity
  **/
  public String getSensitivity() {
    return sensitivity;
  }  

  /**
   * Set sensitivity.
   * @param sensitivity Contains values that indicate the message sensitivity. Enum, available values: None, Personal, Private, CompanyConfidential
  **/
  public void setSensitivity(String sensitivity) {
    this.sensitivity = sensitivity;
  }


  /**
   * Set subject and return this.
   * @param subject Subject of the message.             
   * @return this
  **/
  public MapiMessageItemBaseDto subject(String subject) {
    this.subject = subject;
    return this;
  }

  /**
   * Subject of the message.             
   * @return subject
  **/
  public String getSubject() {
    return subject;
  }  

  /**
   * Set subject.
   * @param subject Subject of the message.             
  **/
  public void setSubject(String subject) {
    this.subject = subject;
  }


  /**
   * Set subjectPrefix and return this.
   * @param subjectPrefix Subject prefix that typically indicates some action on a message, such as \&quot;FW: \&quot; for forwarding.             
   * @return this
  **/
  public MapiMessageItemBaseDto subjectPrefix(String subjectPrefix) {
    this.subjectPrefix = subjectPrefix;
    return this;
  }

  /**
   * Subject prefix that typically indicates some action on a message, such as \&quot;FW: \&quot; for forwarding.             
   * @return subjectPrefix
  **/
  public String getSubjectPrefix() {
    return subjectPrefix;
  }  

  /**
   * Set subjectPrefix.
   * @param subjectPrefix Subject prefix that typically indicates some action on a message, such as \&quot;FW: \&quot; for forwarding.             
  **/
  public void setSubjectPrefix(String subjectPrefix) {
    this.subjectPrefix = subjectPrefix;
  }


  /**
   * Set properties and return this.
   * @param properties List of MAPI properties             
   * @return this
  **/
  public MapiMessageItemBaseDto properties(List<MapiPropertyDto> properties) {
    this.properties = properties;
    return this;
  }
  /**
   * Add an item to properties and return this.
   * @param propertiesItem An item of: List of MAPI properties             
   * @return this
  **/
  public MapiMessageItemBaseDto addPropertiesItem(MapiPropertyDto propertiesItem) {
    if (this.properties == null) {
      this.properties = new ArrayList<MapiPropertyDto>();
    }
    this.properties.add(propertiesItem);
    return this;
  }

  /**
   * List of MAPI properties             
   * @return properties
  **/
  public List<MapiPropertyDto> getProperties() {
    return properties;
  }  

  /**
   * Set properties.
   * @param properties List of MAPI properties             
  **/
  public void setProperties(List<MapiPropertyDto> properties) {
    this.properties = properties;
  }



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
  public void setDiscriminator(String discriminator) {
    //do nothing
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    MapiMessageItemBaseDto mapiMessageItemBaseDto = (MapiMessageItemBaseDto) o;
    return ObjectUtils.equals(this.attachments, mapiMessageItemBaseDto.attachments) &&
    ObjectUtils.equals(this.billing, mapiMessageItemBaseDto.billing) &&
    ObjectUtils.equals(this.body, mapiMessageItemBaseDto.body) &&
    ObjectUtils.equals(this.bodyHtml, mapiMessageItemBaseDto.bodyHtml) &&
    ObjectUtils.equals(this.bodyRtf, mapiMessageItemBaseDto.bodyRtf) &&
    ObjectUtils.equals(this.bodyType, mapiMessageItemBaseDto.bodyType) &&
    ObjectUtils.equals(this.categories, mapiMessageItemBaseDto.categories) &&
    ObjectUtils.equals(this.companies, mapiMessageItemBaseDto.companies) &&
    ObjectUtils.equals(this.itemId, mapiMessageItemBaseDto.itemId) &&
    ObjectUtils.equals(this.messageClass, mapiMessageItemBaseDto.messageClass) &&
    ObjectUtils.equals(this.mileage, mapiMessageItemBaseDto.mileage) &&
    ObjectUtils.equals(this.recipients, mapiMessageItemBaseDto.recipients) &&
    ObjectUtils.equals(this.sensitivity, mapiMessageItemBaseDto.sensitivity) &&
    ObjectUtils.equals(this.subject, mapiMessageItemBaseDto.subject) &&
    ObjectUtils.equals(this.subjectPrefix, mapiMessageItemBaseDto.subjectPrefix) &&
    ObjectUtils.equals(this.properties, mapiMessageItemBaseDto.properties) &&
    ObjectUtils.equals(this.discriminator, mapiMessageItemBaseDto.discriminator);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(attachments, billing, body, bodyHtml, bodyRtf, bodyType, categories, companies, itemId, messageClass, mileage, recipients, sensitivity, subject, subjectPrefix, properties, discriminator);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MapiMessageItemBaseDto {\n");
    
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

  public MapiMessageItemBaseDto() {
    super();
  }

  /**
   * Initializes a new instance of the MapiMessageItemBaseDto
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
   */
  public MapiMessageItemBaseDto(
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
  }

}

