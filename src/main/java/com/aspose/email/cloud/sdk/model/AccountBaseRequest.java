/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="AccountBaseRequest.java">
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
 * EmailClient accounts request             
 */
public class AccountBaseRequest {
  @JsonProperty("firstAccount")
  private String firstAccount = null;

  @JsonProperty("secondAccount")
  private String secondAccount = null;

  @JsonProperty("storageFolder")
  private StorageFolderLocation storageFolder = null;

  /**
   * Set firstAccount and return this.
   * @param firstAccount First account storage file name             
   * @return this
  **/
  public AccountBaseRequest firstAccount(String firstAccount) {
    this.firstAccount = firstAccount;
    return this;
  }

  /**
   * First account storage file name             
   * @return firstAccount
  **/
  public String getFirstAccount() {
    return firstAccount;
  }  

  /**
   * Set firstAccount.
   * @param firstAccount First account storage file name             
  **/
  public void setFirstAccount(String firstAccount) {
    this.firstAccount = firstAccount;
  }

  /**
   * Set secondAccount and return this.
   * @param secondAccount Additional email account (for example, FirstAccount could be IMAP, and second one could be SMTP)             
   * @return this
  **/
  public AccountBaseRequest secondAccount(String secondAccount) {
    this.secondAccount = secondAccount;
    return this;
  }

  /**
   * Additional email account (for example, FirstAccount could be IMAP, and second one could be SMTP)             
   * @return secondAccount
  **/
  public String getSecondAccount() {
    return secondAccount;
  }  

  /**
   * Set secondAccount.
   * @param secondAccount Additional email account (for example, FirstAccount could be IMAP, and second one could be SMTP)             
  **/
  public void setSecondAccount(String secondAccount) {
    this.secondAccount = secondAccount;
  }

  /**
   * Set storageFolder and return this.
   * @param storageFolder Storage folder location of account files             
   * @return this
  **/
  public AccountBaseRequest storageFolder(StorageFolderLocation storageFolder) {
    this.storageFolder = storageFolder;
    return this;
  }

  /**
   * Storage folder location of account files             
   * @return storageFolder
  **/
  public StorageFolderLocation getStorageFolder() {
    return storageFolder;
  }  

  /**
   * Set storageFolder.
   * @param storageFolder Storage folder location of account files             
  **/
  public void setStorageFolder(StorageFolderLocation storageFolder) {
    this.storageFolder = storageFolder;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    AccountBaseRequest accountBaseRequest = (AccountBaseRequest) o;
    return ObjectUtils.equals(this.firstAccount, accountBaseRequest.firstAccount) &&
    ObjectUtils.equals(this.secondAccount, accountBaseRequest.secondAccount) &&
    ObjectUtils.equals(this.storageFolder, accountBaseRequest.storageFolder);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(firstAccount, secondAccount, storageFolder);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountBaseRequest {\n");
    
    sb.append("    firstAccount: ").append(toIndentedString(getFirstAccount())).append("\n");
    sb.append("    secondAccount: ").append(toIndentedString(getSecondAccount())).append("\n");
    sb.append("    storageFolder: ").append(toIndentedString(getStorageFolder())).append("\n");
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

  public AccountBaseRequest() {
    super();
  }

  /**
   * Initializes a new instance of the AccountBaseRequest
   * @param firstAccount First account storage file name             
   * @param secondAccount Additional email account (for example, FirstAccount could be IMAP, and second one could be SMTP)             
   * @param storageFolder Storage folder location of account files             
   */
  public AccountBaseRequest(String firstAccount, String secondAccount, StorageFolderLocation storageFolder) {
    super();
    setFirstAccount(firstAccount);
    setSecondAccount(secondAccount);
    setStorageFolder(storageFolder);
  }

}

