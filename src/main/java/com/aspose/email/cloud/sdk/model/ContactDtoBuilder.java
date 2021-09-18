/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="ContactDtoBuilder.java">
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
 *  ContactDto builder.
 */
public class ContactDtoBuilder {
    private ContactDto model;
    public ContactDtoBuilder(ContactDto model) {
        this.model = model;
    }

    /**
     * Build ContactDto instance.
     */
    public ContactDto build() {
        ContactDto tempModel = model;
        model = null;
        return tempModel;
    }
    /**
     * Set ContactDto.associatedPersons and return builder.
     * @param associatedPersons Associated persons.             
     * @return builder
    **/
    public ContactDtoBuilder associatedPersons(List<AssociatedPerson> associatedPersons) {
        this.model.associatedPersons(associatedPersons);
        return this;
    }
    /**
     * Set ContactDto.attachments and return builder.
     * @param attachments Document attachments.             
     * @return builder
    **/
    public ContactDtoBuilder attachments(List<Attachment> attachments) {
        this.model.attachments(attachments);
        return this;
    }
    /**
     * Set ContactDto.companyName and return builder.
     * @param companyName Company name.             
     * @return builder
    **/
    public ContactDtoBuilder companyName(String companyName) {
        this.model.companyName(companyName);
        return this;
    }
    /**
     * Set ContactDto.computerNetworkName and return builder.
     * @param computerNetworkName Computer network.             
     * @return builder
    **/
    public ContactDtoBuilder computerNetworkName(String computerNetworkName) {
        this.model.computerNetworkName(computerNetworkName);
        return this;
    }
    /**
     * Set ContactDto.customerId and return builder.
     * @param customerId Customer id.             
     * @return builder
    **/
    public ContactDtoBuilder customerId(String customerId) {
        this.model.customerId(customerId);
        return this;
    }
    /**
     * Set ContactDto.departmentName and return builder.
     * @param departmentName Department name.             
     * @return builder
    **/
    public ContactDtoBuilder departmentName(String departmentName) {
        this.model.departmentName(departmentName);
        return this;
    }
    /**
     * Set ContactDto.displayName and return builder.
     * @param displayName Display name.             
     * @return builder
    **/
    public ContactDtoBuilder displayName(String displayName) {
        this.model.displayName(displayName);
        return this;
    }
    /**
     * Set ContactDto.emailAddresses and return builder.
     * @param emailAddresses Person&#39;s email addresses.             
     * @return builder
    **/
    public ContactDtoBuilder emailAddresses(List<EmailAddress> emailAddresses) {
        this.model.emailAddresses(emailAddresses);
        return this;
    }
    /**
     * Set ContactDto.events and return builder.
     * @param events Person&#39;s events.             
     * @return builder
    **/
    public ContactDtoBuilder events(List<CustomerEvent> events) {
        this.model.events(events);
        return this;
    }
    /**
     * Set ContactDto.fileAs and return builder.
     * @param fileAs A name used for sorting.             
     * @return builder
    **/
    public ContactDtoBuilder fileAs(String fileAs) {
        this.model.fileAs(fileAs);
        return this;
    }
    /**
     * Set ContactDto.fileAsMapping and return builder.
     * @param fileAsMapping Specifies how to generate and recompute the value of the dispidFileAs property when other contact name properties change. Coincides MS-OXPROPS revision 16.2 from 7/31/2014./nEnum, available values: Empty, DisplayName, FirstName, LastName, Organization, LastFirstMiddle, OrgLastFirstMiddle, LastFirstMiddleOrg, LastFirstMiddle2, LastFirstMiddle3, OrgLastFirstMiddle2, OrgLastFirstMiddle3, LastFirstMiddleOrg2, LastFirstMiddleOrg3, LastFirstMiddleGen, FirstMiddleLastGen, LastFirstMiddleGen2, BestMatch, AccordingToLocale, None
     * @return builder
    **/
    public ContactDtoBuilder fileAsMapping(String fileAsMapping) {
        this.model.fileAsMapping(fileAsMapping);
        return this;
    }
    /**
     * Set ContactDto.freeBusyLocation and return builder.
     * @param freeBusyLocation URL path from which a client can retrieve free/busy information for the contact as an iCal file.             
     * @return builder
    **/
    public ContactDtoBuilder freeBusyLocation(String freeBusyLocation) {
        this.model.freeBusyLocation(freeBusyLocation);
        return this;
    }
    /**
     * Set ContactDto.gender and return builder.
     * @param gender Enum defines gender of a person./nEnum, available values: Unspecified, Female, Male
     * @return builder
    **/
    public ContactDtoBuilder gender(String gender) {
        this.model.gender(gender);
        return this;
    }
    /**
     * Set ContactDto.givenName and return builder.
     * @param givenName Person&#39;s given name.             
     * @return builder
    **/
    public ContactDtoBuilder givenName(String givenName) {
        this.model.givenName(givenName);
        return this;
    }
    /**
     * Set ContactDto.governmentIdNumber and return builder.
     * @param governmentIdNumber Government id number.             
     * @return builder
    **/
    public ContactDtoBuilder governmentIdNumber(String governmentIdNumber) {
        this.model.governmentIdNumber(governmentIdNumber);
        return this;
    }
    /**
     * Set ContactDto.hobbies and return builder.
     * @param hobbies Person&#39;s hobbies.             
     * @return builder
    **/
    public ContactDtoBuilder hobbies(String hobbies) {
        this.model.hobbies(hobbies);
        return this;
    }
    /**
     * Set ContactDto.initials and return builder.
     * @param initials Person&#39;s initials.             
     * @return builder
    **/
    public ContactDtoBuilder initials(String initials) {
        this.model.initials(initials);
        return this;
    }
    /**
     * Set ContactDto.instantMessengers and return builder.
     * @param instantMessengers Person&#39;s instant messenger addresses.             
     * @return builder
    **/
    public ContactDtoBuilder instantMessengers(List<InstantMessengerAddress> instantMessengers) {
        this.model.instantMessengers(instantMessengers);
        return this;
    }
    /**
     * Set ContactDto.jobTitle and return builder.
     * @param jobTitle Person&#39;s job title.             
     * @return builder
    **/
    public ContactDtoBuilder jobTitle(String jobTitle) {
        this.model.jobTitle(jobTitle);
        return this;
    }
    /**
     * Set ContactDto.language and return builder.
     * @param language Language.             
     * @return builder
    **/
    public ContactDtoBuilder language(String language) {
        this.model.language(language);
        return this;
    }
    /**
     * Set ContactDto.location and return builder.
     * @param location Person&#39;s location.             
     * @return builder
    **/
    public ContactDtoBuilder location(String location) {
        this.model.location(location);
        return this;
    }
    /**
     * Set ContactDto.middleName and return builder.
     * @param middleName Person&#39;s middle name.             
     * @return builder
    **/
    public ContactDtoBuilder middleName(String middleName) {
        this.model.middleName(middleName);
        return this;
    }
    /**
     * Set ContactDto.nickname and return builder.
     * @param nickname Person&#39;s nickname.             
     * @return builder
    **/
    public ContactDtoBuilder nickname(String nickname) {
        this.model.nickname(nickname);
        return this;
    }
    /**
     * Set ContactDto.notes and return builder.
     * @param notes Notes.             
     * @return builder
    **/
    public ContactDtoBuilder notes(String notes) {
        this.model.notes(notes);
        return this;
    }
    /**
     * Set ContactDto.notesFormat and return builder.
     * @param notesFormat Defines format of a text./nEnum, available values: Text, Html
     * @return builder
    **/
    public ContactDtoBuilder notesFormat(String notesFormat) {
        this.model.notesFormat(notesFormat);
        return this;
    }
    /**
     * Set ContactDto.officeLocation and return builder.
     * @param officeLocation Office location.             
     * @return builder
    **/
    public ContactDtoBuilder officeLocation(String officeLocation) {
        this.model.officeLocation(officeLocation);
        return this;
    }
    /**
     * Set ContactDto.organizationalIdNumber and return builder.
     * @param organizationalIdNumber Contains an identifier for the mail user used within the mail user&#39;s organization.             
     * @return builder
    **/
    public ContactDtoBuilder organizationalIdNumber(String organizationalIdNumber) {
        this.model.organizationalIdNumber(organizationalIdNumber);
        return this;
    }
    /**
     * Set ContactDto.phoneNumbers and return builder.
     * @param phoneNumbers Person&#39;s phone numbers.             
     * @return builder
    **/
    public ContactDtoBuilder phoneNumbers(List<PhoneNumber> phoneNumbers) {
        this.model.phoneNumbers(phoneNumbers);
        return this;
    }
    /**
     * Set ContactDto.photo and return builder.
     * @param photo Person&#39;s photo.             
     * @return builder
    **/
    public ContactDtoBuilder photo(ContactPhoto photo) {
        this.model.photo(photo);
        return this;
    }
    /**
     * Set ContactDto.physicalAddresses and return builder.
     * @param physicalAddresses Person&#39;s physical addresses.             
     * @return builder
    **/
    public ContactDtoBuilder physicalAddresses(List<PostalAddress> physicalAddresses) {
        this.model.physicalAddresses(physicalAddresses);
        return this;
    }
    /**
     * Set ContactDto.preferredTextEncoding and return builder.
     * @param preferredTextEncoding Encoding for all text properties.             
     * @return builder
    **/
    public ContactDtoBuilder preferredTextEncoding(String preferredTextEncoding) {
        this.model.preferredTextEncoding(preferredTextEncoding);
        return this;
    }
    /**
     * Set ContactDto.prefix and return builder.
     * @param prefix A prefix of a full name such like Mr.(mister), Dr.(doctor) and so on.             
     * @return builder
    **/
    public ContactDtoBuilder prefix(String prefix) {
        this.model.prefix(prefix);
        return this;
    }
    /**
     * Set ContactDto.profession and return builder.
     * @param profession A job position of a person in a company.             
     * @return builder
    **/
    public ContactDtoBuilder profession(String profession) {
        this.model.profession(profession);
        return this;
    }
    /**
     * Set ContactDto.suffix and return builder.
     * @param suffix A suffix of a full name such like Jr.(junior), Sr.(senior) and so on.             
     * @return builder
    **/
    public ContactDtoBuilder suffix(String suffix) {
        this.model.suffix(suffix);
        return this;
    }
    /**
     * Set ContactDto.surname and return builder.
     * @param surname Person&#39;s surname.             
     * @return builder
    **/
    public ContactDtoBuilder surname(String surname) {
        this.model.surname(surname);
        return this;
    }
    /**
     * Set ContactDto.urls and return builder.
     * @param urls Person&#39;s urls.             
     * @return builder
    **/
    public ContactDtoBuilder urls(List<Url> urls) {
        this.model.urls(urls);
        return this;
    }
}
