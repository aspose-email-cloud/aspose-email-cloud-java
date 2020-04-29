/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="EmailClientMultiAccount.java">
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
 * Email client virtual account, which contains several accounts             
 */
public class EmailClientMultiAccount {
  @JsonProperty("receiveAccounts")
  private List<EmailClientAccount> receiveAccounts = new ArrayList<EmailClientAccount>();

  @JsonProperty("sendAccount")
  private EmailClientAccount sendAccount = null;

  /**
   * Set receiveAccounts and return this.
   * @param receiveAccounts Email client receive accounts             
   * @return this
  **/
  public EmailClientMultiAccount receiveAccounts(List<EmailClientAccount> receiveAccounts) {
    this.receiveAccounts = receiveAccounts;
    return this;
  }
  /**
   * Add an item to receiveAccounts and return this.
   * @param receiveAccountsItem An item of: Email client receive accounts             
   * @return this
  **/
  public EmailClientMultiAccount addReceiveAccountsItem(EmailClientAccount receiveAccountsItem) {
    this.receiveAccounts.add(receiveAccountsItem);
    return this;
  }

  /**
   * Email client receive accounts             
   * @return receiveAccounts
  **/
  public List<EmailClientAccount> getReceiveAccounts() {
    return receiveAccounts;
  }  

  /**
   * Set receiveAccounts.
   * @param receiveAccounts Email client receive accounts             
  **/
  public void setReceiveAccounts(List<EmailClientAccount> receiveAccounts) {
    this.receiveAccounts = receiveAccounts;
  }

  /**
   * Set sendAccount and return this.
   * @param sendAccount Email client send account             
   * @return this
  **/
  public EmailClientMultiAccount sendAccount(EmailClientAccount sendAccount) {
    this.sendAccount = sendAccount;
    return this;
  }

  /**
   * Email client send account             
   * @return sendAccount
  **/
  public EmailClientAccount getSendAccount() {
    return sendAccount;
  }  

  /**
   * Set sendAccount.
   * @param sendAccount Email client send account             
  **/
  public void setSendAccount(EmailClientAccount sendAccount) {
    this.sendAccount = sendAccount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    EmailClientMultiAccount emailClientMultiAccount = (EmailClientMultiAccount) o;
    return ObjectUtils.equals(this.receiveAccounts, emailClientMultiAccount.receiveAccounts) &&
    ObjectUtils.equals(this.sendAccount, emailClientMultiAccount.sendAccount);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(receiveAccounts, sendAccount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailClientMultiAccount {\n");
    
    sb.append("    receiveAccounts: ").append(toIndentedString(getReceiveAccounts())).append("\n");
    sb.append("    sendAccount: ").append(toIndentedString(getSendAccount())).append("\n");
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

  public EmailClientMultiAccount() {
    super();
  }

  /**
   * Initializes a new instance of the EmailClientMultiAccount
   * @param receiveAccounts Email client receive accounts             
   * @param sendAccount Email client send account             
   */
  public EmailClientMultiAccount(List<EmailClientAccount> receiveAccounts, EmailClientAccount sendAccount) {
    super();
    setReceiveAccounts(receiveAccounts);
    setSendAccount(sendAccount);
  }

}

