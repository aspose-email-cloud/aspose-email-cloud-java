/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="ContactDto.java">
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
 * VCard document representation.             
 */
public class ContactDto {
  @JsonProperty("associatedPersons")
  private List<AssociatedPerson> associatedPersons = null;

  @JsonProperty("attachments")
  private List<Attachment> attachments = null;

  @JsonProperty("companyName")
  private String companyName = null;

  @JsonProperty("computerNetworkName")
  private String computerNetworkName = null;

  @JsonProperty("customerId")
  private String customerId = null;

  @JsonProperty("departmentName")
  private String departmentName = null;

  @JsonProperty("displayName")
  private String displayName = null;

  @JsonProperty("emailAddresses")
  private List<EmailAddress> emailAddresses = null;

  @JsonProperty("events")
  private List<CustomerEvent> events = null;

  @JsonProperty("fileAs")
  private String fileAs = null;

  @JsonProperty("fileAsMapping")
  private String fileAsMapping = null;

  @JsonProperty("freeBusyLocation")
  private String freeBusyLocation = null;

  @JsonProperty("gender")
  private String gender = null;

  @JsonProperty("givenName")
  private String givenName = null;

  @JsonProperty("governmentIdNumber")
  private String governmentIdNumber = null;

  @JsonProperty("hobbies")
  private String hobbies = null;

  @JsonProperty("initials")
  private String initials = null;

  @JsonProperty("instantMessengers")
  private List<InstantMessengerAddress> instantMessengers = null;

  @JsonProperty("jobTitle")
  private String jobTitle = null;

  @JsonProperty("language")
  private String language = null;

  @JsonProperty("location")
  private String location = null;

  @JsonProperty("middleName")
  private String middleName = null;

  @JsonProperty("nickname")
  private String nickname = null;

  @JsonProperty("notes")
  private String notes = null;

  @JsonProperty("notesFormat")
  private String notesFormat = null;

  @JsonProperty("officeLocation")
  private String officeLocation = null;

  @JsonProperty("organizationalIdNumber")
  private String organizationalIdNumber = null;

  @JsonProperty("phoneNumbers")
  private List<PhoneNumber> phoneNumbers = null;

  @JsonProperty("photo")
  private ContactPhoto photo = null;

  @JsonProperty("physicalAddresses")
  private List<PostalAddress> physicalAddresses = null;

  @JsonProperty("preferredTextEncoding")
  private String preferredTextEncoding = null;

  @JsonProperty("prefix")
  private String prefix = null;

  @JsonProperty("profession")
  private String profession = null;

  @JsonProperty("suffix")
  private String suffix = null;

  @JsonProperty("surname")
  private String surname = null;

  @JsonProperty("urls")
  private List<Url> urls = null;

  /**
   * Set associatedPersons and return this.
   * @param associatedPersons Associated persons.             
   * @return this
  **/
  public ContactDto associatedPersons(List<AssociatedPerson> associatedPersons) {
    this.associatedPersons = associatedPersons;
    return this;
  }
  /**
   * Add an item to associatedPersons and return this.
   * @param associatedPersonsItem An item of: Associated persons.             
   * @return this
  **/
  public ContactDto addAssociatedPersonsItem(AssociatedPerson associatedPersonsItem) {
    if (this.associatedPersons == null) {
      this.associatedPersons = new ArrayList<AssociatedPerson>();
    }
    this.associatedPersons.add(associatedPersonsItem);
    return this;
  }

  /**
   * Associated persons.             
   * @return associatedPersons
  **/
  public List<AssociatedPerson> getAssociatedPersons() {
    return associatedPersons;
  }  

  /**
   * Set associatedPersons.
   * @param associatedPersons Associated persons.             
  **/
  public void setAssociatedPersons(List<AssociatedPerson> associatedPersons) {
    this.associatedPersons = associatedPersons;
  }

  /**
   * Set attachments and return this.
   * @param attachments Document attachments.             
   * @return this
  **/
  public ContactDto attachments(List<Attachment> attachments) {
    this.attachments = attachments;
    return this;
  }
  /**
   * Add an item to attachments and return this.
   * @param attachmentsItem An item of: Document attachments.             
   * @return this
  **/
  public ContactDto addAttachmentsItem(Attachment attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<Attachment>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

  /**
   * Document attachments.             
   * @return attachments
  **/
  public List<Attachment> getAttachments() {
    return attachments;
  }  

  /**
   * Set attachments.
   * @param attachments Document attachments.             
  **/
  public void setAttachments(List<Attachment> attachments) {
    this.attachments = attachments;
  }

  /**
   * Set companyName and return this.
   * @param companyName Company name.             
   * @return this
  **/
  public ContactDto companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

  /**
   * Company name.             
   * @return companyName
  **/
  public String getCompanyName() {
    return companyName;
  }  

  /**
   * Set companyName.
   * @param companyName Company name.             
  **/
  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  /**
   * Set computerNetworkName and return this.
   * @param computerNetworkName Computer network.             
   * @return this
  **/
  public ContactDto computerNetworkName(String computerNetworkName) {
    this.computerNetworkName = computerNetworkName;
    return this;
  }

  /**
   * Computer network.             
   * @return computerNetworkName
  **/
  public String getComputerNetworkName() {
    return computerNetworkName;
  }  

  /**
   * Set computerNetworkName.
   * @param computerNetworkName Computer network.             
  **/
  public void setComputerNetworkName(String computerNetworkName) {
    this.computerNetworkName = computerNetworkName;
  }

  /**
   * Set customerId and return this.
   * @param customerId Customer id.             
   * @return this
  **/
  public ContactDto customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * Customer id.             
   * @return customerId
  **/
  public String getCustomerId() {
    return customerId;
  }  

  /**
   * Set customerId.
   * @param customerId Customer id.             
  **/
  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  /**
   * Set departmentName and return this.
   * @param departmentName Department name.             
   * @return this
  **/
  public ContactDto departmentName(String departmentName) {
    this.departmentName = departmentName;
    return this;
  }

  /**
   * Department name.             
   * @return departmentName
  **/
  public String getDepartmentName() {
    return departmentName;
  }  

  /**
   * Set departmentName.
   * @param departmentName Department name.             
  **/
  public void setDepartmentName(String departmentName) {
    this.departmentName = departmentName;
  }

  /**
   * Set displayName and return this.
   * @param displayName Display name.             
   * @return this
  **/
  public ContactDto displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Display name.             
   * @return displayName
  **/
  public String getDisplayName() {
    return displayName;
  }  

  /**
   * Set displayName.
   * @param displayName Display name.             
  **/
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  /**
   * Set emailAddresses and return this.
   * @param emailAddresses Person&#39;s email addresses.             
   * @return this
  **/
  public ContactDto emailAddresses(List<EmailAddress> emailAddresses) {
    this.emailAddresses = emailAddresses;
    return this;
  }
  /**
   * Add an item to emailAddresses and return this.
   * @param emailAddressesItem An item of: Person&#39;s email addresses.             
   * @return this
  **/
  public ContactDto addEmailAddressesItem(EmailAddress emailAddressesItem) {
    if (this.emailAddresses == null) {
      this.emailAddresses = new ArrayList<EmailAddress>();
    }
    this.emailAddresses.add(emailAddressesItem);
    return this;
  }

  /**
   * Person&#39;s email addresses.             
   * @return emailAddresses
  **/
  public List<EmailAddress> getEmailAddresses() {
    return emailAddresses;
  }  

  /**
   * Set emailAddresses.
   * @param emailAddresses Person&#39;s email addresses.             
  **/
  public void setEmailAddresses(List<EmailAddress> emailAddresses) {
    this.emailAddresses = emailAddresses;
  }

  /**
   * Set events and return this.
   * @param events Person&#39;s events.             
   * @return this
  **/
  public ContactDto events(List<CustomerEvent> events) {
    this.events = events;
    return this;
  }
  /**
   * Add an item to events and return this.
   * @param eventsItem An item of: Person&#39;s events.             
   * @return this
  **/
  public ContactDto addEventsItem(CustomerEvent eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<CustomerEvent>();
    }
    this.events.add(eventsItem);
    return this;
  }

  /**
   * Person&#39;s events.             
   * @return events
  **/
  public List<CustomerEvent> getEvents() {
    return events;
  }  

  /**
   * Set events.
   * @param events Person&#39;s events.             
  **/
  public void setEvents(List<CustomerEvent> events) {
    this.events = events;
  }

  /**
   * Set fileAs and return this.
   * @param fileAs A name used for sorting.             
   * @return this
  **/
  public ContactDto fileAs(String fileAs) {
    this.fileAs = fileAs;
    return this;
  }

  /**
   * A name used for sorting.             
   * @return fileAs
  **/
  public String getFileAs() {
    return fileAs;
  }  

  /**
   * Set fileAs.
   * @param fileAs A name used for sorting.             
  **/
  public void setFileAs(String fileAs) {
    this.fileAs = fileAs;
  }

  /**
   * Set fileAsMapping and return this.
   * @param fileAsMapping Specifies how to generate and recompute the value of the dispidFileAs property when other contact name properties change. Coincides MS-OXPROPS revision 16.2 from 7/31/2014. Enum, available values: Empty, DisplayName, FirstName, LastName, Organization, LastFirstMiddle, OrgLastFirstMiddle, LastFirstMiddleOrg, LastFirstMiddle2, LastFirstMiddle3, OrgLastFirstMiddle2, OrgLastFirstMiddle3, LastFirstMiddleOrg2, LastFirstMiddleOrg3, LastFirstMiddleGen, FirstMiddleLastGen, LastFirstMiddleGen2, BestMatch, AccordingToLocale, None
   * @return this
  **/
  public ContactDto fileAsMapping(String fileAsMapping) {
    this.fileAsMapping = fileAsMapping;
    return this;
  }

  /**
   * Specifies how to generate and recompute the value of the dispidFileAs property when other contact name properties change. Coincides MS-OXPROPS revision 16.2 from 7/31/2014. Enum, available values: Empty, DisplayName, FirstName, LastName, Organization, LastFirstMiddle, OrgLastFirstMiddle, LastFirstMiddleOrg, LastFirstMiddle2, LastFirstMiddle3, OrgLastFirstMiddle2, OrgLastFirstMiddle3, LastFirstMiddleOrg2, LastFirstMiddleOrg3, LastFirstMiddleGen, FirstMiddleLastGen, LastFirstMiddleGen2, BestMatch, AccordingToLocale, None
   * @return fileAsMapping
  **/
  public String getFileAsMapping() {
    return fileAsMapping;
  }  

  /**
   * Set fileAsMapping.
   * @param fileAsMapping Specifies how to generate and recompute the value of the dispidFileAs property when other contact name properties change. Coincides MS-OXPROPS revision 16.2 from 7/31/2014. Enum, available values: Empty, DisplayName, FirstName, LastName, Organization, LastFirstMiddle, OrgLastFirstMiddle, LastFirstMiddleOrg, LastFirstMiddle2, LastFirstMiddle3, OrgLastFirstMiddle2, OrgLastFirstMiddle3, LastFirstMiddleOrg2, LastFirstMiddleOrg3, LastFirstMiddleGen, FirstMiddleLastGen, LastFirstMiddleGen2, BestMatch, AccordingToLocale, None
  **/
  public void setFileAsMapping(String fileAsMapping) {
    this.fileAsMapping = fileAsMapping;
  }

  /**
   * Set freeBusyLocation and return this.
   * @param freeBusyLocation URL path from which a client can retrieve free/busy information for the contact as an iCal file.             
   * @return this
  **/
  public ContactDto freeBusyLocation(String freeBusyLocation) {
    this.freeBusyLocation = freeBusyLocation;
    return this;
  }

  /**
   * URL path from which a client can retrieve free/busy information for the contact as an iCal file.             
   * @return freeBusyLocation
  **/
  public String getFreeBusyLocation() {
    return freeBusyLocation;
  }  

  /**
   * Set freeBusyLocation.
   * @param freeBusyLocation URL path from which a client can retrieve free/busy information for the contact as an iCal file.             
  **/
  public void setFreeBusyLocation(String freeBusyLocation) {
    this.freeBusyLocation = freeBusyLocation;
  }

  /**
   * Set gender and return this.
   * @param gender Enum defines gender of a person. Enum, available values: Unspecified, Female, Male
   * @return this
  **/
  public ContactDto gender(String gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Enum defines gender of a person. Enum, available values: Unspecified, Female, Male
   * @return gender
  **/
  public String getGender() {
    return gender;
  }  

  /**
   * Set gender.
   * @param gender Enum defines gender of a person. Enum, available values: Unspecified, Female, Male
  **/
  public void setGender(String gender) {
    this.gender = gender;
  }

  /**
   * Set givenName and return this.
   * @param givenName Person&#39;s given name.             
   * @return this
  **/
  public ContactDto givenName(String givenName) {
    this.givenName = givenName;
    return this;
  }

  /**
   * Person&#39;s given name.             
   * @return givenName
  **/
  public String getGivenName() {
    return givenName;
  }  

  /**
   * Set givenName.
   * @param givenName Person&#39;s given name.             
  **/
  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }

  /**
   * Set governmentIdNumber and return this.
   * @param governmentIdNumber Government id number.             
   * @return this
  **/
  public ContactDto governmentIdNumber(String governmentIdNumber) {
    this.governmentIdNumber = governmentIdNumber;
    return this;
  }

  /**
   * Government id number.             
   * @return governmentIdNumber
  **/
  public String getGovernmentIdNumber() {
    return governmentIdNumber;
  }  

  /**
   * Set governmentIdNumber.
   * @param governmentIdNumber Government id number.             
  **/
  public void setGovernmentIdNumber(String governmentIdNumber) {
    this.governmentIdNumber = governmentIdNumber;
  }

  /**
   * Set hobbies and return this.
   * @param hobbies Person&#39;s hobbies.             
   * @return this
  **/
  public ContactDto hobbies(String hobbies) {
    this.hobbies = hobbies;
    return this;
  }

  /**
   * Person&#39;s hobbies.             
   * @return hobbies
  **/
  public String getHobbies() {
    return hobbies;
  }  

  /**
   * Set hobbies.
   * @param hobbies Person&#39;s hobbies.             
  **/
  public void setHobbies(String hobbies) {
    this.hobbies = hobbies;
  }

  /**
   * Set initials and return this.
   * @param initials Person&#39;s initials.             
   * @return this
  **/
  public ContactDto initials(String initials) {
    this.initials = initials;
    return this;
  }

  /**
   * Person&#39;s initials.             
   * @return initials
  **/
  public String getInitials() {
    return initials;
  }  

  /**
   * Set initials.
   * @param initials Person&#39;s initials.             
  **/
  public void setInitials(String initials) {
    this.initials = initials;
  }

  /**
   * Set instantMessengers and return this.
   * @param instantMessengers Person&#39;s instant messenger addresses.             
   * @return this
  **/
  public ContactDto instantMessengers(List<InstantMessengerAddress> instantMessengers) {
    this.instantMessengers = instantMessengers;
    return this;
  }
  /**
   * Add an item to instantMessengers and return this.
   * @param instantMessengersItem An item of: Person&#39;s instant messenger addresses.             
   * @return this
  **/
  public ContactDto addInstantMessengersItem(InstantMessengerAddress instantMessengersItem) {
    if (this.instantMessengers == null) {
      this.instantMessengers = new ArrayList<InstantMessengerAddress>();
    }
    this.instantMessengers.add(instantMessengersItem);
    return this;
  }

  /**
   * Person&#39;s instant messenger addresses.             
   * @return instantMessengers
  **/
  public List<InstantMessengerAddress> getInstantMessengers() {
    return instantMessengers;
  }  

  /**
   * Set instantMessengers.
   * @param instantMessengers Person&#39;s instant messenger addresses.             
  **/
  public void setInstantMessengers(List<InstantMessengerAddress> instantMessengers) {
    this.instantMessengers = instantMessengers;
  }

  /**
   * Set jobTitle and return this.
   * @param jobTitle Person&#39;s job title.             
   * @return this
  **/
  public ContactDto jobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
    return this;
  }

  /**
   * Person&#39;s job title.             
   * @return jobTitle
  **/
  public String getJobTitle() {
    return jobTitle;
  }  

  /**
   * Set jobTitle.
   * @param jobTitle Person&#39;s job title.             
  **/
  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }

  /**
   * Set language and return this.
   * @param language Language.             
   * @return this
  **/
  public ContactDto language(String language) {
    this.language = language;
    return this;
  }

  /**
   * Language.             
   * @return language
  **/
  public String getLanguage() {
    return language;
  }  

  /**
   * Set language.
   * @param language Language.             
  **/
  public void setLanguage(String language) {
    this.language = language;
  }

  /**
   * Set location and return this.
   * @param location Person&#39;s location.             
   * @return this
  **/
  public ContactDto location(String location) {
    this.location = location;
    return this;
  }

  /**
   * Person&#39;s location.             
   * @return location
  **/
  public String getLocation() {
    return location;
  }  

  /**
   * Set location.
   * @param location Person&#39;s location.             
  **/
  public void setLocation(String location) {
    this.location = location;
  }

  /**
   * Set middleName and return this.
   * @param middleName Person&#39;s middle name.             
   * @return this
  **/
  public ContactDto middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

  /**
   * Person&#39;s middle name.             
   * @return middleName
  **/
  public String getMiddleName() {
    return middleName;
  }  

  /**
   * Set middleName.
   * @param middleName Person&#39;s middle name.             
  **/
  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  /**
   * Set nickname and return this.
   * @param nickname Person&#39;s nickname.             
   * @return this
  **/
  public ContactDto nickname(String nickname) {
    this.nickname = nickname;
    return this;
  }

  /**
   * Person&#39;s nickname.             
   * @return nickname
  **/
  public String getNickname() {
    return nickname;
  }  

  /**
   * Set nickname.
   * @param nickname Person&#39;s nickname.             
  **/
  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  /**
   * Set notes and return this.
   * @param notes Notes.             
   * @return this
  **/
  public ContactDto notes(String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Notes.             
   * @return notes
  **/
  public String getNotes() {
    return notes;
  }  

  /**
   * Set notes.
   * @param notes Notes.             
  **/
  public void setNotes(String notes) {
    this.notes = notes;
  }

  /**
   * Set notesFormat and return this.
   * @param notesFormat Defines format of a text. Enum, available values: Text, Html
   * @return this
  **/
  public ContactDto notesFormat(String notesFormat) {
    this.notesFormat = notesFormat;
    return this;
  }

  /**
   * Defines format of a text. Enum, available values: Text, Html
   * @return notesFormat
  **/
  public String getNotesFormat() {
    return notesFormat;
  }  

  /**
   * Set notesFormat.
   * @param notesFormat Defines format of a text. Enum, available values: Text, Html
  **/
  public void setNotesFormat(String notesFormat) {
    this.notesFormat = notesFormat;
  }

  /**
   * Set officeLocation and return this.
   * @param officeLocation Office location.             
   * @return this
  **/
  public ContactDto officeLocation(String officeLocation) {
    this.officeLocation = officeLocation;
    return this;
  }

  /**
   * Office location.             
   * @return officeLocation
  **/
  public String getOfficeLocation() {
    return officeLocation;
  }  

  /**
   * Set officeLocation.
   * @param officeLocation Office location.             
  **/
  public void setOfficeLocation(String officeLocation) {
    this.officeLocation = officeLocation;
  }

  /**
   * Set organizationalIdNumber and return this.
   * @param organizationalIdNumber Contains an identifier for the mail user used within the mail user&#39;s organization.             
   * @return this
  **/
  public ContactDto organizationalIdNumber(String organizationalIdNumber) {
    this.organizationalIdNumber = organizationalIdNumber;
    return this;
  }

  /**
   * Contains an identifier for the mail user used within the mail user&#39;s organization.             
   * @return organizationalIdNumber
  **/
  public String getOrganizationalIdNumber() {
    return organizationalIdNumber;
  }  

  /**
   * Set organizationalIdNumber.
   * @param organizationalIdNumber Contains an identifier for the mail user used within the mail user&#39;s organization.             
  **/
  public void setOrganizationalIdNumber(String organizationalIdNumber) {
    this.organizationalIdNumber = organizationalIdNumber;
  }

  /**
   * Set phoneNumbers and return this.
   * @param phoneNumbers Person&#39;s phone numbers.             
   * @return this
  **/
  public ContactDto phoneNumbers(List<PhoneNumber> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
    return this;
  }
  /**
   * Add an item to phoneNumbers and return this.
   * @param phoneNumbersItem An item of: Person&#39;s phone numbers.             
   * @return this
  **/
  public ContactDto addPhoneNumbersItem(PhoneNumber phoneNumbersItem) {
    if (this.phoneNumbers == null) {
      this.phoneNumbers = new ArrayList<PhoneNumber>();
    }
    this.phoneNumbers.add(phoneNumbersItem);
    return this;
  }

  /**
   * Person&#39;s phone numbers.             
   * @return phoneNumbers
  **/
  public List<PhoneNumber> getPhoneNumbers() {
    return phoneNumbers;
  }  

  /**
   * Set phoneNumbers.
   * @param phoneNumbers Person&#39;s phone numbers.             
  **/
  public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }

  /**
   * Set photo and return this.
   * @param photo Person&#39;s photo.             
   * @return this
  **/
  public ContactDto photo(ContactPhoto photo) {
    this.photo = photo;
    return this;
  }

  /**
   * Person&#39;s photo.             
   * @return photo
  **/
  public ContactPhoto getPhoto() {
    return photo;
  }  

  /**
   * Set photo.
   * @param photo Person&#39;s photo.             
  **/
  public void setPhoto(ContactPhoto photo) {
    this.photo = photo;
  }

  /**
   * Set physicalAddresses and return this.
   * @param physicalAddresses Person&#39;s physical addresses.             
   * @return this
  **/
  public ContactDto physicalAddresses(List<PostalAddress> physicalAddresses) {
    this.physicalAddresses = physicalAddresses;
    return this;
  }
  /**
   * Add an item to physicalAddresses and return this.
   * @param physicalAddressesItem An item of: Person&#39;s physical addresses.             
   * @return this
  **/
  public ContactDto addPhysicalAddressesItem(PostalAddress physicalAddressesItem) {
    if (this.physicalAddresses == null) {
      this.physicalAddresses = new ArrayList<PostalAddress>();
    }
    this.physicalAddresses.add(physicalAddressesItem);
    return this;
  }

  /**
   * Person&#39;s physical addresses.             
   * @return physicalAddresses
  **/
  public List<PostalAddress> getPhysicalAddresses() {
    return physicalAddresses;
  }  

  /**
   * Set physicalAddresses.
   * @param physicalAddresses Person&#39;s physical addresses.             
  **/
  public void setPhysicalAddresses(List<PostalAddress> physicalAddresses) {
    this.physicalAddresses = physicalAddresses;
  }

  /**
   * Set preferredTextEncoding and return this.
   * @param preferredTextEncoding Encoding for all text properties.             
   * @return this
  **/
  public ContactDto preferredTextEncoding(String preferredTextEncoding) {
    this.preferredTextEncoding = preferredTextEncoding;
    return this;
  }

  /**
   * Encoding for all text properties.             
   * @return preferredTextEncoding
  **/
  public String getPreferredTextEncoding() {
    return preferredTextEncoding;
  }  

  /**
   * Set preferredTextEncoding.
   * @param preferredTextEncoding Encoding for all text properties.             
  **/
  public void setPreferredTextEncoding(String preferredTextEncoding) {
    this.preferredTextEncoding = preferredTextEncoding;
  }

  /**
   * Set prefix and return this.
   * @param prefix A prefix of a full name such like Mr.(mister), Dr.(doctor) and so on.             
   * @return this
  **/
  public ContactDto prefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

  /**
   * A prefix of a full name such like Mr.(mister), Dr.(doctor) and so on.             
   * @return prefix
  **/
  public String getPrefix() {
    return prefix;
  }  

  /**
   * Set prefix.
   * @param prefix A prefix of a full name such like Mr.(mister), Dr.(doctor) and so on.             
  **/
  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  /**
   * Set profession and return this.
   * @param profession A job position of a person in a company.             
   * @return this
  **/
  public ContactDto profession(String profession) {
    this.profession = profession;
    return this;
  }

  /**
   * A job position of a person in a company.             
   * @return profession
  **/
  public String getProfession() {
    return profession;
  }  

  /**
   * Set profession.
   * @param profession A job position of a person in a company.             
  **/
  public void setProfession(String profession) {
    this.profession = profession;
  }

  /**
   * Set suffix and return this.
   * @param suffix A suffix of a full name such like Jr.(junior), Sr.(senior) and so on.             
   * @return this
  **/
  public ContactDto suffix(String suffix) {
    this.suffix = suffix;
    return this;
  }

  /**
   * A suffix of a full name such like Jr.(junior), Sr.(senior) and so on.             
   * @return suffix
  **/
  public String getSuffix() {
    return suffix;
  }  

  /**
   * Set suffix.
   * @param suffix A suffix of a full name such like Jr.(junior), Sr.(senior) and so on.             
  **/
  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }

  /**
   * Set surname and return this.
   * @param surname Person&#39;s surname.             
   * @return this
  **/
  public ContactDto surname(String surname) {
    this.surname = surname;
    return this;
  }

  /**
   * Person&#39;s surname.             
   * @return surname
  **/
  public String getSurname() {
    return surname;
  }  

  /**
   * Set surname.
   * @param surname Person&#39;s surname.             
  **/
  public void setSurname(String surname) {
    this.surname = surname;
  }

  /**
   * Set urls and return this.
   * @param urls Person&#39;s urls.             
   * @return this
  **/
  public ContactDto urls(List<Url> urls) {
    this.urls = urls;
    return this;
  }
  /**
   * Add an item to urls and return this.
   * @param urlsItem An item of: Person&#39;s urls.             
   * @return this
  **/
  public ContactDto addUrlsItem(Url urlsItem) {
    if (this.urls == null) {
      this.urls = new ArrayList<Url>();
    }
    this.urls.add(urlsItem);
    return this;
  }

  /**
   * Person&#39;s urls.             
   * @return urls
  **/
  public List<Url> getUrls() {
    return urls;
  }  

  /**
   * Set urls.
   * @param urls Person&#39;s urls.             
  **/
  public void setUrls(List<Url> urls) {
    this.urls = urls;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    ContactDto contactDto = (ContactDto) o;
    return ObjectUtils.equals(this.associatedPersons, contactDto.associatedPersons) &&
    ObjectUtils.equals(this.attachments, contactDto.attachments) &&
    ObjectUtils.equals(this.companyName, contactDto.companyName) &&
    ObjectUtils.equals(this.computerNetworkName, contactDto.computerNetworkName) &&
    ObjectUtils.equals(this.customerId, contactDto.customerId) &&
    ObjectUtils.equals(this.departmentName, contactDto.departmentName) &&
    ObjectUtils.equals(this.displayName, contactDto.displayName) &&
    ObjectUtils.equals(this.emailAddresses, contactDto.emailAddresses) &&
    ObjectUtils.equals(this.events, contactDto.events) &&
    ObjectUtils.equals(this.fileAs, contactDto.fileAs) &&
    ObjectUtils.equals(this.fileAsMapping, contactDto.fileAsMapping) &&
    ObjectUtils.equals(this.freeBusyLocation, contactDto.freeBusyLocation) &&
    ObjectUtils.equals(this.gender, contactDto.gender) &&
    ObjectUtils.equals(this.givenName, contactDto.givenName) &&
    ObjectUtils.equals(this.governmentIdNumber, contactDto.governmentIdNumber) &&
    ObjectUtils.equals(this.hobbies, contactDto.hobbies) &&
    ObjectUtils.equals(this.initials, contactDto.initials) &&
    ObjectUtils.equals(this.instantMessengers, contactDto.instantMessengers) &&
    ObjectUtils.equals(this.jobTitle, contactDto.jobTitle) &&
    ObjectUtils.equals(this.language, contactDto.language) &&
    ObjectUtils.equals(this.location, contactDto.location) &&
    ObjectUtils.equals(this.middleName, contactDto.middleName) &&
    ObjectUtils.equals(this.nickname, contactDto.nickname) &&
    ObjectUtils.equals(this.notes, contactDto.notes) &&
    ObjectUtils.equals(this.notesFormat, contactDto.notesFormat) &&
    ObjectUtils.equals(this.officeLocation, contactDto.officeLocation) &&
    ObjectUtils.equals(this.organizationalIdNumber, contactDto.organizationalIdNumber) &&
    ObjectUtils.equals(this.phoneNumbers, contactDto.phoneNumbers) &&
    ObjectUtils.equals(this.photo, contactDto.photo) &&
    ObjectUtils.equals(this.physicalAddresses, contactDto.physicalAddresses) &&
    ObjectUtils.equals(this.preferredTextEncoding, contactDto.preferredTextEncoding) &&
    ObjectUtils.equals(this.prefix, contactDto.prefix) &&
    ObjectUtils.equals(this.profession, contactDto.profession) &&
    ObjectUtils.equals(this.suffix, contactDto.suffix) &&
    ObjectUtils.equals(this.surname, contactDto.surname) &&
    ObjectUtils.equals(this.urls, contactDto.urls);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(associatedPersons, attachments, companyName, computerNetworkName, customerId, departmentName, displayName, emailAddresses, events, fileAs, fileAsMapping, freeBusyLocation, gender, givenName, governmentIdNumber, hobbies, initials, instantMessengers, jobTitle, language, location, middleName, nickname, notes, notesFormat, officeLocation, organizationalIdNumber, phoneNumbers, photo, physicalAddresses, preferredTextEncoding, prefix, profession, suffix, surname, urls);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactDto {\n");
    
    sb.append("    associatedPersons: ").append(toIndentedString(getAssociatedPersons())).append("\n");
    sb.append("    attachments: ").append(toIndentedString(getAttachments())).append("\n");
    sb.append("    companyName: ").append(toIndentedString(getCompanyName())).append("\n");
    sb.append("    computerNetworkName: ").append(toIndentedString(getComputerNetworkName())).append("\n");
    sb.append("    customerId: ").append(toIndentedString(getCustomerId())).append("\n");
    sb.append("    departmentName: ").append(toIndentedString(getDepartmentName())).append("\n");
    sb.append("    displayName: ").append(toIndentedString(getDisplayName())).append("\n");
    sb.append("    emailAddresses: ").append(toIndentedString(getEmailAddresses())).append("\n");
    sb.append("    events: ").append(toIndentedString(getEvents())).append("\n");
    sb.append("    fileAs: ").append(toIndentedString(getFileAs())).append("\n");
    sb.append("    fileAsMapping: ").append(toIndentedString(getFileAsMapping())).append("\n");
    sb.append("    freeBusyLocation: ").append(toIndentedString(getFreeBusyLocation())).append("\n");
    sb.append("    gender: ").append(toIndentedString(getGender())).append("\n");
    sb.append("    givenName: ").append(toIndentedString(getGivenName())).append("\n");
    sb.append("    governmentIdNumber: ").append(toIndentedString(getGovernmentIdNumber())).append("\n");
    sb.append("    hobbies: ").append(toIndentedString(getHobbies())).append("\n");
    sb.append("    initials: ").append(toIndentedString(getInitials())).append("\n");
    sb.append("    instantMessengers: ").append(toIndentedString(getInstantMessengers())).append("\n");
    sb.append("    jobTitle: ").append(toIndentedString(getJobTitle())).append("\n");
    sb.append("    language: ").append(toIndentedString(getLanguage())).append("\n");
    sb.append("    location: ").append(toIndentedString(getLocation())).append("\n");
    sb.append("    middleName: ").append(toIndentedString(getMiddleName())).append("\n");
    sb.append("    nickname: ").append(toIndentedString(getNickname())).append("\n");
    sb.append("    notes: ").append(toIndentedString(getNotes())).append("\n");
    sb.append("    notesFormat: ").append(toIndentedString(getNotesFormat())).append("\n");
    sb.append("    officeLocation: ").append(toIndentedString(getOfficeLocation())).append("\n");
    sb.append("    organizationalIdNumber: ").append(toIndentedString(getOrganizationalIdNumber())).append("\n");
    sb.append("    phoneNumbers: ").append(toIndentedString(getPhoneNumbers())).append("\n");
    sb.append("    photo: ").append(toIndentedString(getPhoto())).append("\n");
    sb.append("    physicalAddresses: ").append(toIndentedString(getPhysicalAddresses())).append("\n");
    sb.append("    preferredTextEncoding: ").append(toIndentedString(getPreferredTextEncoding())).append("\n");
    sb.append("    prefix: ").append(toIndentedString(getPrefix())).append("\n");
    sb.append("    profession: ").append(toIndentedString(getProfession())).append("\n");
    sb.append("    suffix: ").append(toIndentedString(getSuffix())).append("\n");
    sb.append("    surname: ").append(toIndentedString(getSurname())).append("\n");
    sb.append("    urls: ").append(toIndentedString(getUrls())).append("\n");
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

  public ContactDto() {
    super();
  }

  /**
   * Initializes a new instance of the ContactDto
   * @param associatedPersons Associated persons.             
   * @param attachments Document attachments.             
   * @param companyName Company name.             
   * @param computerNetworkName Computer network.             
   * @param customerId Customer id.             
   * @param departmentName Department name.             
   * @param displayName Display name.             
   * @param emailAddresses Person&#39;s email addresses.             
   * @param events Person&#39;s events.             
   * @param fileAs A name used for sorting.             
   * @param fileAsMapping Specifies how to generate and recompute the value of the dispidFileAs property when other contact name properties change. Coincides MS-OXPROPS revision 16.2 from 7/31/2014. Enum, available values: Empty, DisplayName, FirstName, LastName, Organization, LastFirstMiddle, OrgLastFirstMiddle, LastFirstMiddleOrg, LastFirstMiddle2, LastFirstMiddle3, OrgLastFirstMiddle2, OrgLastFirstMiddle3, LastFirstMiddleOrg2, LastFirstMiddleOrg3, LastFirstMiddleGen, FirstMiddleLastGen, LastFirstMiddleGen2, BestMatch, AccordingToLocale, None
   * @param freeBusyLocation URL path from which a client can retrieve free/busy information for the contact as an iCal file.             
   * @param gender Enum defines gender of a person. Enum, available values: Unspecified, Female, Male
   * @param givenName Person&#39;s given name.             
   * @param governmentIdNumber Government id number.             
   * @param hobbies Person&#39;s hobbies.             
   * @param initials Person&#39;s initials.             
   * @param instantMessengers Person&#39;s instant messenger addresses.             
   * @param jobTitle Person&#39;s job title.             
   * @param language Language.             
   * @param location Person&#39;s location.             
   * @param middleName Person&#39;s middle name.             
   * @param nickname Person&#39;s nickname.             
   * @param notes Notes.             
   * @param notesFormat Defines format of a text. Enum, available values: Text, Html
   * @param officeLocation Office location.             
   * @param organizationalIdNumber Contains an identifier for the mail user used within the mail user&#39;s organization.             
   * @param phoneNumbers Person&#39;s phone numbers.             
   * @param photo Person&#39;s photo.             
   * @param physicalAddresses Person&#39;s physical addresses.             
   * @param preferredTextEncoding Encoding for all text properties.             
   * @param prefix A prefix of a full name such like Mr.(mister), Dr.(doctor) and so on.             
   * @param profession A job position of a person in a company.             
   * @param suffix A suffix of a full name such like Jr.(junior), Sr.(senior) and so on.             
   * @param surname Person&#39;s surname.             
   * @param urls Person&#39;s urls.             
   */
  public ContactDto(
    List<AssociatedPerson> associatedPersons,
    List<Attachment> attachments,
    String companyName,
    String computerNetworkName,
    String customerId,
    String departmentName,
    String displayName,
    List<EmailAddress> emailAddresses,
    List<CustomerEvent> events,
    String fileAs,
    String fileAsMapping,
    String freeBusyLocation,
    String gender,
    String givenName,
    String governmentIdNumber,
    String hobbies,
    String initials,
    List<InstantMessengerAddress> instantMessengers,
    String jobTitle,
    String language,
    String location,
    String middleName,
    String nickname,
    String notes,
    String notesFormat,
    String officeLocation,
    String organizationalIdNumber,
    List<PhoneNumber> phoneNumbers,
    ContactPhoto photo,
    List<PostalAddress> physicalAddresses,
    String preferredTextEncoding,
    String prefix,
    String profession,
    String suffix,
    String surname,
    List<Url> urls
  ) {
    super();
    setAssociatedPersons(associatedPersons);
    setAttachments(attachments);
    setCompanyName(companyName);
    setComputerNetworkName(computerNetworkName);
    setCustomerId(customerId);
    setDepartmentName(departmentName);
    setDisplayName(displayName);
    setEmailAddresses(emailAddresses);
    setEvents(events);
    setFileAs(fileAs);
    setFileAsMapping(fileAsMapping);
    setFreeBusyLocation(freeBusyLocation);
    setGender(gender);
    setGivenName(givenName);
    setGovernmentIdNumber(governmentIdNumber);
    setHobbies(hobbies);
    setInitials(initials);
    setInstantMessengers(instantMessengers);
    setJobTitle(jobTitle);
    setLanguage(language);
    setLocation(location);
    setMiddleName(middleName);
    setNickname(nickname);
    setNotes(notes);
    setNotesFormat(notesFormat);
    setOfficeLocation(officeLocation);
    setOrganizationalIdNumber(organizationalIdNumber);
    setPhoneNumbers(phoneNumbers);
    setPhoto(photo);
    setPhysicalAddresses(physicalAddresses);
    setPreferredTextEncoding(preferredTextEncoding);
    setPrefix(prefix);
    setProfession(profession);
    setSuffix(suffix);
    setSurname(surname);
    setUrls(urls);
  }

}

