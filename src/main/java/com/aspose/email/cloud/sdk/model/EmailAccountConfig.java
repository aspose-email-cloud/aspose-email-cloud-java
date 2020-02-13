/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="EmailAccountConfig.java">
*   Copyright (c) 2018-2019 Aspose Pty Ltd. All rights reserved.
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
 * Email account configuration.             
 */
public class EmailAccountConfig {
  @JsonProperty("displayName")
  private String displayName = null;

  @JsonProperty("protocolType")
  private String protocolType = null;

  @JsonProperty("host")
  private String host = null;

  @JsonProperty("port")
  private Integer port = null;

  @JsonProperty("socketType")
  private String socketType = null;

  @JsonProperty("authenticationTypes")
  private List<String> authenticationTypes = null;

  @JsonProperty("extraInfo")
  private List<NameValuePair> extraInfo = null;

  @JsonProperty("isValidated")
  private Boolean isValidated = null;

  public EmailAccountConfig displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Email account display name             
   * @return displayName
  **/
  public String getDisplayName() {
    return displayName;
  }  

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public EmailAccountConfig protocolType(String protocolType) {
    this.protocolType = protocolType;
    return this;
  }

  /**
   * Type of connection protocol. Enum, available values: IMAP, POP3, SMTP, EWS, WebDav
   * @return protocolType
  **/
  public String getProtocolType() {
    return protocolType;
  }  

  public void setProtocolType(String protocolType) {
    this.protocolType = protocolType;
  }

  public EmailAccountConfig host(String host) {
    this.host = host;
    return this;
  }

  /**
   * Email account host.             
   * @return host
  **/
  public String getHost() {
    return host;
  }  

  public void setHost(String host) {
    this.host = host;
  }

  public EmailAccountConfig port(Integer port) {
    this.port = port;
    return this;
  }

  /**
   * Port.             
   * @return port
  **/
  public Integer getPort() {
    return port;
  }  

  public void setPort(Integer port) {
    this.port = port;
  }

  public EmailAccountConfig socketType(String socketType) {
    this.socketType = socketType;
    return this;
  }

  /**
   * Security mode for a mail client Enum, available values: None, SSLExplicit, SSLImplicit, SSLAuto, Auto
   * @return socketType
  **/
  public String getSocketType() {
    return socketType;
  }  

  public void setSocketType(String socketType) {
    this.socketType = socketType;
  }

  public EmailAccountConfig authenticationTypes(List<String> authenticationTypes) {
    this.authenticationTypes = authenticationTypes;
    return this;
  }

  public EmailAccountConfig addAuthenticationTypesItem(String authenticationTypesItem) {
    if (this.authenticationTypes == null) {
      this.authenticationTypes = new ArrayList<String>();
    }
    this.authenticationTypes.add(authenticationTypesItem);
    return this;
  }

  /**
   * Supported authentication types.              Items: Email account authentication types. Enum, available values: NoAuth, OAuth2, PasswordCleartext, PasswordEncrypted, SmtpAfterPop, ClientIpAddress
   * @return authenticationTypes
  **/
  public List<String> getAuthenticationTypes() {
    return authenticationTypes;
  }  

  public void setAuthenticationTypes(List<String> authenticationTypes) {
    this.authenticationTypes = authenticationTypes;
  }

  public EmailAccountConfig extraInfo(List<NameValuePair> extraInfo) {
    this.extraInfo = extraInfo;
    return this;
  }

  public EmailAccountConfig addExtraInfoItem(NameValuePair extraInfoItem) {
    if (this.extraInfo == null) {
      this.extraInfo = new ArrayList<NameValuePair>();
    }
    this.extraInfo.add(extraInfoItem);
    return this;
  }

  /**
   * Extra account information.             
   * @return extraInfo
  **/
  public List<NameValuePair> getExtraInfo() {
    return extraInfo;
  }  

  public void setExtraInfo(List<NameValuePair> extraInfo) {
    this.extraInfo = extraInfo;
  }

  public EmailAccountConfig isValidated(Boolean isValidated) {
    this.isValidated = isValidated;
    return this;
  }

  /**
   * Determines that configuration validated. Set to false if validation skipped.             
   * @return isValidated
  **/
  public Boolean isIsValidated() {
    return isValidated;
  }  

  public void setIsValidated(Boolean isValidated) {
    this.isValidated = isValidated;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    EmailAccountConfig emailAccountConfig = (EmailAccountConfig) o;
    return ObjectUtils.equals(this.displayName, emailAccountConfig.displayName) &&
    ObjectUtils.equals(this.protocolType, emailAccountConfig.protocolType) &&
    ObjectUtils.equals(this.host, emailAccountConfig.host) &&
    ObjectUtils.equals(this.port, emailAccountConfig.port) &&
    ObjectUtils.equals(this.socketType, emailAccountConfig.socketType) &&
    ObjectUtils.equals(this.authenticationTypes, emailAccountConfig.authenticationTypes) &&
    ObjectUtils.equals(this.extraInfo, emailAccountConfig.extraInfo) &&
    ObjectUtils.equals(this.isValidated, emailAccountConfig.isValidated);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(displayName, protocolType, host, port, socketType, authenticationTypes, extraInfo, isValidated);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailAccountConfig {\n");
    
    sb.append("    displayName: ").append(toIndentedString(getDisplayName())).append("\n");
    sb.append("    protocolType: ").append(toIndentedString(getProtocolType())).append("\n");
    sb.append("    host: ").append(toIndentedString(getHost())).append("\n");
    sb.append("    port: ").append(toIndentedString(getPort())).append("\n");
    sb.append("    socketType: ").append(toIndentedString(getSocketType())).append("\n");
    sb.append("    authenticationTypes: ").append(toIndentedString(getAuthenticationTypes())).append("\n");
    sb.append("    extraInfo: ").append(toIndentedString(getExtraInfo())).append("\n");
    sb.append("    isValidated: ").append(toIndentedString(isIsValidated())).append("\n");
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

  public EmailAccountConfig() {
    super();
  }

  /**
   * Initializes a new instance of the EmailAccountConfig
   * @param displayName Email account display name             
   * @param protocolType Type of connection protocol. Enum, available values: IMAP, POP3, SMTP, EWS, WebDav
   * @param host Email account host.             
   * @param port Port.             
   * @param socketType Security mode for a mail client Enum, available values: None, SSLExplicit, SSLImplicit, SSLAuto, Auto
   * @param authenticationTypes Supported authentication types.              Items: Email account authentication types. Enum, available values: NoAuth, OAuth2, PasswordCleartext, PasswordEncrypted, SmtpAfterPop, ClientIpAddress
   * @param extraInfo Extra account information.             
   * @param isValidated Determines that configuration validated. Set to false if validation skipped.             
   */
  public EmailAccountConfig(String displayName, String protocolType, String host, Integer port, String socketType, List<String> authenticationTypes, List<NameValuePair> extraInfo, Boolean isValidated) {
    super();
    setDisplayName(displayName);
    setProtocolType(protocolType);
    setHost(host);
    setPort(port);
    setSocketType(socketType);
    setAuthenticationTypes(authenticationTypes);
    setExtraInfo(extraInfo);
    setIsValidated(isValidated);
  }

}

