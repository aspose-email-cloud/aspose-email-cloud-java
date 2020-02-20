/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="EmailAccountRequest.java">
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
 * Email account settings request             
 */
public class EmailAccountRequest {
  @JsonProperty("host")
  private String host = null;

  @JsonProperty("port")
  private Integer port = null;

  @JsonProperty("login")
  private String login = null;

  @JsonProperty("securityOptions")
  private String securityOptions = null;

  @JsonProperty("protocolType")
  private String protocolType = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("storageFile")
  private StorageFileLocation storageFile = null;

  /**
   * Set host and return this.
   * @param host Email account host             
   * @return this
  **/
  public EmailAccountRequest host(String host) {
    this.host = host;
    return this;
  }

  /**
   * Email account host             
   * @return host
  **/
  public String getHost() {
    return host;
  }  

  /**
   * Set host.
   * @param host Email account host             
  **/
  public void setHost(String host) {
    this.host = host;
  }

  /**
   * Set port and return this.
   * @param port Email account port             
   * @return this
  **/
  public EmailAccountRequest port(Integer port) {
    this.port = port;
    return this;
  }

  /**
   * Email account port             
   * @return port
  **/
  public Integer getPort() {
    return port;
  }  

  /**
   * Set port.
   * @param port Email account port             
  **/
  public void setPort(Integer port) {
    this.port = port;
  }

  /**
   * Set login and return this.
   * @param login Email account login             
   * @return this
  **/
  public EmailAccountRequest login(String login) {
    this.login = login;
    return this;
  }

  /**
   * Email account login             
   * @return login
  **/
  public String getLogin() {
    return login;
  }  

  /**
   * Set login.
   * @param login Email account login             
  **/
  public void setLogin(String login) {
    this.login = login;
  }

  /**
   * Set securityOptions and return this.
   * @param securityOptions Security mode for a mail client Enum, available values: None, SSLExplicit, SSLImplicit, SSLAuto, Auto
   * @return this
  **/
  public EmailAccountRequest securityOptions(String securityOptions) {
    this.securityOptions = securityOptions;
    return this;
  }

  /**
   * Security mode for a mail client Enum, available values: None, SSLExplicit, SSLImplicit, SSLAuto, Auto
   * @return securityOptions
  **/
  public String getSecurityOptions() {
    return securityOptions;
  }  

  /**
   * Set securityOptions.
   * @param securityOptions Security mode for a mail client Enum, available values: None, SSLExplicit, SSLImplicit, SSLAuto, Auto
  **/
  public void setSecurityOptions(String securityOptions) {
    this.securityOptions = securityOptions;
  }

  /**
   * Set protocolType and return this.
   * @param protocolType Type of connection protocol. Enum, available values: IMAP, POP3, SMTP, EWS, WebDav
   * @return this
  **/
  public EmailAccountRequest protocolType(String protocolType) {
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

  /**
   * Set protocolType.
   * @param protocolType Type of connection protocol. Enum, available values: IMAP, POP3, SMTP, EWS, WebDav
  **/
  public void setProtocolType(String protocolType) {
    this.protocolType = protocolType;
  }

  /**
   * Set description and return this.
   * @param description Email account description             
   * @return this
  **/
  public EmailAccountRequest description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Email account description             
   * @return description
  **/
  public String getDescription() {
    return description;
  }  

  /**
   * Set description.
   * @param description Email account description             
  **/
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Set storageFile and return this.
   * @param storageFile A storage file location info to store email account             
   * @return this
  **/
  public EmailAccountRequest storageFile(StorageFileLocation storageFile) {
    this.storageFile = storageFile;
    return this;
  }

  /**
   * A storage file location info to store email account             
   * @return storageFile
  **/
  public StorageFileLocation getStorageFile() {
    return storageFile;
  }  

  /**
   * Set storageFile.
   * @param storageFile A storage file location info to store email account             
  **/
  public void setStorageFile(StorageFileLocation storageFile) {
    this.storageFile = storageFile;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    EmailAccountRequest emailAccountRequest = (EmailAccountRequest) o;
    return ObjectUtils.equals(this.host, emailAccountRequest.host) &&
    ObjectUtils.equals(this.port, emailAccountRequest.port) &&
    ObjectUtils.equals(this.login, emailAccountRequest.login) &&
    ObjectUtils.equals(this.securityOptions, emailAccountRequest.securityOptions) &&
    ObjectUtils.equals(this.protocolType, emailAccountRequest.protocolType) &&
    ObjectUtils.equals(this.description, emailAccountRequest.description) &&
    ObjectUtils.equals(this.storageFile, emailAccountRequest.storageFile);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(host, port, login, securityOptions, protocolType, description, storageFile);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailAccountRequest {\n");
    
    sb.append("    host: ").append(toIndentedString(getHost())).append("\n");
    sb.append("    port: ").append(toIndentedString(getPort())).append("\n");
    sb.append("    login: ").append(toIndentedString(getLogin())).append("\n");
    sb.append("    securityOptions: ").append(toIndentedString(getSecurityOptions())).append("\n");
    sb.append("    protocolType: ").append(toIndentedString(getProtocolType())).append("\n");
    sb.append("    description: ").append(toIndentedString(getDescription())).append("\n");
    sb.append("    storageFile: ").append(toIndentedString(getStorageFile())).append("\n");
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

  public EmailAccountRequest() {
    super();
  }

  /**
   * Initializes a new instance of the EmailAccountRequest
   * @param host Email account host             
   * @param port Email account port             
   * @param login Email account login             
   * @param securityOptions Security mode for a mail client Enum, available values: None, SSLExplicit, SSLImplicit, SSLAuto, Auto
   * @param protocolType Type of connection protocol. Enum, available values: IMAP, POP3, SMTP, EWS, WebDav
   * @param description Email account description             
   * @param storageFile A storage file location info to store email account             
   */
  public EmailAccountRequest(String host, Integer port, String login, String securityOptions, String protocolType, String description, StorageFileLocation storageFile) {
    super();
    setHost(host);
    setPort(port);
    setLogin(login);
    setSecurityOptions(securityOptions);
    setProtocolType(protocolType);
    setDescription(description);
    setStorageFile(storageFile);
  }

}

