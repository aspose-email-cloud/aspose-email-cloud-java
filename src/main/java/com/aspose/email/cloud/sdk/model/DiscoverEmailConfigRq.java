/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="DiscoverEmailConfigRq.java">
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
 * Discover email configuration request.             
 */
public class DiscoverEmailConfigRq {
  @JsonProperty("address")
  private String address = null;

  @JsonProperty("fastProcessing")
  private Boolean fastProcessing = null;

  @JsonProperty("login")
  private String login = null;

  /**
   * Set address and return this.
   * @param address Email address to discover.             
   * @return this
  **/
  public DiscoverEmailConfigRq address(String address) {
    this.address = address;
    return this;
  }

  /**
   * Email address to discover.             
   * @return address
  **/
  public String getAddress() {
    return address;
  }  

  /**
   * Set address.
   * @param address Email address to discover.             
  **/
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   * Set fastProcessing and return this.
   * @param fastProcessing Turns on fast processing. All discover systems will run in parallel. First discovered result will be returned.             
   * @return this
  **/
  public DiscoverEmailConfigRq fastProcessing(Boolean fastProcessing) {
    this.fastProcessing = fastProcessing;
    return this;
  }

  /**
   * Turns on fast processing. All discover systems will run in parallel. First discovered result will be returned.             
   * @return fastProcessing
  **/
  public Boolean isFastProcessing() {
    return fastProcessing;
  }  

  /**
   * Set fastProcessing.
   * @param fastProcessing Turns on fast processing. All discover systems will run in parallel. First discovered result will be returned.             
  **/
  public void setFastProcessing(Boolean fastProcessing) {
    this.fastProcessing = fastProcessing;
  }

  /**
   * Set login and return this.
   * @param login Email account login. If not specified, address used as a login.             
   * @return this
  **/
  public DiscoverEmailConfigRq login(String login) {
    this.login = login;
    return this;
  }

  /**
   * Email account login. If not specified, address used as a login.             
   * @return login
  **/
  public String getLogin() {
    return login;
  }  

  /**
   * Set login.
   * @param login Email account login. If not specified, address used as a login.             
  **/
  public void setLogin(String login) {
    this.login = login;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    DiscoverEmailConfigRq discoverEmailConfigRq = (DiscoverEmailConfigRq) o;
    return ObjectUtils.equals(this.address, discoverEmailConfigRq.address) &&
    ObjectUtils.equals(this.fastProcessing, discoverEmailConfigRq.fastProcessing) &&
    ObjectUtils.equals(this.login, discoverEmailConfigRq.login);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(address, fastProcessing, login);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiscoverEmailConfigRq {\n");
    
    sb.append("    address: ").append(toIndentedString(getAddress())).append("\n");
    sb.append("    fastProcessing: ").append(toIndentedString(isFastProcessing())).append("\n");
    sb.append("    login: ").append(toIndentedString(getLogin())).append("\n");
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

  public DiscoverEmailConfigRq() {
    super();
  }

  /**
   * Initializes a new instance of the DiscoverEmailConfigRq
   * @param address Email address to discover.             
   * @param fastProcessing Turns on fast processing. All discover systems will run in parallel. First discovered result will be returned.             
   * @param login Email account login. If not specified, address used as a login.             
   */
  public DiscoverEmailConfigRq(String address, Boolean fastProcessing, String login) {
    super();
    setAddress(address);
    setFastProcessing(fastProcessing);
    setLogin(login);
  }

}

