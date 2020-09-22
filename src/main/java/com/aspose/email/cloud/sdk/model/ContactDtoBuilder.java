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

import java.util.List;

/**
 *  ContactDto builder.
 */
public class ContactDtoBuilder {
    private final ContactDto model;
    public ContactDtoBuilder(ContactDto model) {
        this.model = model;
    }

    public ContactDto build() {
        return model;
    }
    public ContactDtoBuilder associatedPersons(List<AssociatedPerson> associatedPersons) {
        this.model.associatedPersons(associatedPersons);
        return this;
    }
    public ContactDtoBuilder attachments(List<Attachment> attachments) {
        this.model.attachments(attachments);
        return this;
    }
    public ContactDtoBuilder companyName(String companyName) {
        this.model.companyName(companyName);
        return this;
    }
    public ContactDtoBuilder computerNetworkName(String computerNetworkName) {
        this.model.computerNetworkName(computerNetworkName);
        return this;
    }
    public ContactDtoBuilder customerId(String customerId) {
        this.model.customerId(customerId);
        return this;
    }
    public ContactDtoBuilder departmentName(String departmentName) {
        this.model.departmentName(departmentName);
        return this;
    }
    public ContactDtoBuilder displayName(String displayName) {
        this.model.displayName(displayName);
        return this;
    }
    public ContactDtoBuilder emailAddresses(List<EmailAddress> emailAddresses) {
        this.model.emailAddresses(emailAddresses);
        return this;
    }
    public ContactDtoBuilder events(List<CustomerEvent> events) {
        this.model.events(events);
        return this;
    }
    public ContactDtoBuilder fileAs(String fileAs) {
        this.model.fileAs(fileAs);
        return this;
    }
    public ContactDtoBuilder fileAsMapping(String fileAsMapping) {
        this.model.fileAsMapping(fileAsMapping);
        return this;
    }
    public ContactDtoBuilder freeBusyLocation(String freeBusyLocation) {
        this.model.freeBusyLocation(freeBusyLocation);
        return this;
    }
    public ContactDtoBuilder gender(String gender) {
        this.model.gender(gender);
        return this;
    }
    public ContactDtoBuilder givenName(String givenName) {
        this.model.givenName(givenName);
        return this;
    }
    public ContactDtoBuilder governmentIdNumber(String governmentIdNumber) {
        this.model.governmentIdNumber(governmentIdNumber);
        return this;
    }
    public ContactDtoBuilder hobbies(String hobbies) {
        this.model.hobbies(hobbies);
        return this;
    }
    public ContactDtoBuilder initials(String initials) {
        this.model.initials(initials);
        return this;
    }
    public ContactDtoBuilder instantMessengers(List<InstantMessengerAddress> instantMessengers) {
        this.model.instantMessengers(instantMessengers);
        return this;
    }
    public ContactDtoBuilder jobTitle(String jobTitle) {
        this.model.jobTitle(jobTitle);
        return this;
    }
    public ContactDtoBuilder language(String language) {
        this.model.language(language);
        return this;
    }
    public ContactDtoBuilder location(String location) {
        this.model.location(location);
        return this;
    }
    public ContactDtoBuilder middleName(String middleName) {
        this.model.middleName(middleName);
        return this;
    }
    public ContactDtoBuilder nickname(String nickname) {
        this.model.nickname(nickname);
        return this;
    }
    public ContactDtoBuilder notes(String notes) {
        this.model.notes(notes);
        return this;
    }
    public ContactDtoBuilder notesFormat(String notesFormat) {
        this.model.notesFormat(notesFormat);
        return this;
    }
    public ContactDtoBuilder officeLocation(String officeLocation) {
        this.model.officeLocation(officeLocation);
        return this;
    }
    public ContactDtoBuilder organizationalIdNumber(String organizationalIdNumber) {
        this.model.organizationalIdNumber(organizationalIdNumber);
        return this;
    }
    public ContactDtoBuilder phoneNumbers(List<PhoneNumber> phoneNumbers) {
        this.model.phoneNumbers(phoneNumbers);
        return this;
    }
    public ContactDtoBuilder photo(ContactPhoto photo) {
        this.model.photo(photo);
        return this;
    }
    public ContactDtoBuilder physicalAddresses(List<PostalAddress> physicalAddresses) {
        this.model.physicalAddresses(physicalAddresses);
        return this;
    }
    public ContactDtoBuilder preferredTextEncoding(String preferredTextEncoding) {
        this.model.preferredTextEncoding(preferredTextEncoding);
        return this;
    }
    public ContactDtoBuilder prefix(String prefix) {
        this.model.prefix(prefix);
        return this;
    }
    public ContactDtoBuilder profession(String profession) {
        this.model.profession(profession);
        return this;
    }
    public ContactDtoBuilder suffix(String suffix) {
        this.model.suffix(suffix);
        return this;
    }
    public ContactDtoBuilder surname(String surname) {
        this.model.surname(surname);
        return this;
    }
    public ContactDtoBuilder urls(List<Url> urls) {
        this.model.urls(urls);
        return this;
    }
}
