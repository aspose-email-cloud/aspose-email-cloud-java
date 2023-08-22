/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="EmailClientAccountPasswordCredentials.java">
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
 * Represents email client account password credentials             
 */
public class EmailClientAccountPasswordCredentials extends EmailClientAccountCredentials {
  @JsonProperty("password")
  private String password = null;

  /**
   * Set password and return this.
   * @param password Email client account password             
   * @return this
  **/
  public EmailClientAccountPasswordCredentials password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Email client account password             
   * @return password
  **/
  public String getPassword() {
    return password;
  }  

  /**
   * Set password.
   * @param password Email client account password             
  **/
  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    EmailClientAccountPasswordCredentials emailClientAccountPasswordCredentials = (EmailClientAccountPasswordCredentials) o;
    return ObjectUtils.equals(this.password, emailClientAccountPasswordCredentials.password) &&
    super.equals(o);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(password, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailClientAccountPasswordCredentials {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    login: ").append(toIndentedString(getLogin())).append("\n");
    sb.append("    discriminator: ").append(toIndentedString(getDiscriminator())).append("\n");
    sb.append("    password: ").append(toIndentedString(getPassword())).append("\n");
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

  public EmailClientAccountPasswordCredentials() {
    super();
  }

  /**
   * Initializes a new instance of the EmailClientAccountPasswordCredentials
   * @param login Email client account login             
   * @param password Email client account password             
   */
  public EmailClientAccountPasswordCredentials(
    String login
    ,
    String password
  ) {
    super();
    setLogin(login);
    setPassword(password);
  }

}

