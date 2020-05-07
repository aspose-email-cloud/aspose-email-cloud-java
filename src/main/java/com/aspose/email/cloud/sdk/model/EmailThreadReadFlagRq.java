/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="EmailThreadReadFlagRq.java">
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
 * Request to mark all messages in thread as read or unread             
 */
public class EmailThreadReadFlagRq extends AccountBaseRequest {
  @JsonProperty("isRead")
  private Boolean isRead = null;

  @JsonProperty("folder")
  private String folder = null;

  /**
   * Set isRead and return this.
   * @param isRead Read flag to set. \&quot;true\&quot; by default             
   * @return this
  **/
  public EmailThreadReadFlagRq isRead(Boolean isRead) {
    this.isRead = isRead;
    return this;
  }

  /**
   * Read flag to set. \&quot;true\&quot; by default             
   * @return isRead
  **/
  public Boolean isIsRead() {
    return isRead;
  }  

  /**
   * Set isRead.
   * @param isRead Read flag to set. \&quot;true\&quot; by default             
  **/
  public void setIsRead(Boolean isRead) {
    this.isRead = isRead;
  }

  /**
   * Set folder and return this.
   * @param folder Specifies account folder to get thread from             
   * @return this
  **/
  public EmailThreadReadFlagRq folder(String folder) {
    this.folder = folder;
    return this;
  }

  /**
   * Specifies account folder to get thread from             
   * @return folder
  **/
  public String getFolder() {
    return folder;
  }  

  /**
   * Set folder.
   * @param folder Specifies account folder to get thread from             
  **/
  public void setFolder(String folder) {
    this.folder = folder;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    EmailThreadReadFlagRq emailThreadReadFlagRq = (EmailThreadReadFlagRq) o;
    return ObjectUtils.equals(this.isRead, emailThreadReadFlagRq.isRead) &&
    ObjectUtils.equals(this.folder, emailThreadReadFlagRq.folder) &&
    super.equals(o);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(isRead, folder, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailThreadReadFlagRq {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    firstAccount: ").append(toIndentedString(getFirstAccount())).append("\n");
    sb.append("    secondAccount: ").append(toIndentedString(getSecondAccount())).append("\n");
    sb.append("    storageFolder: ").append(toIndentedString(getStorageFolder())).append("\n");
    sb.append("    isRead: ").append(toIndentedString(isIsRead())).append("\n");
    sb.append("    folder: ").append(toIndentedString(getFolder())).append("\n");
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

  public EmailThreadReadFlagRq() {
    super();
  }

  /**
   * Initializes a new instance of the EmailThreadReadFlagRq
   * @param firstAccount First account storage file name             
   * @param secondAccount Additional email account (for example, FirstAccount could be IMAP, and second one could be SMTP)             
   * @param storageFolder Storage folder location of account files             
   * @param isRead Read flag to set. \&quot;true\&quot; by default             
   * @param folder Specifies account folder to get thread from             
   */
  public EmailThreadReadFlagRq(String firstAccount, String secondAccount, StorageFolderLocation storageFolder, Boolean isRead, String folder) {
    super();
    setFirstAccount(firstAccount);
    setSecondAccount(secondAccount);
    setStorageFolder(storageFolder);
    setIsRead(isRead);
    setFolder(folder);
  }

}

