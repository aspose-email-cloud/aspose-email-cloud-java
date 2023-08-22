/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="EmailClientAccount.java">
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
 * A universal email client account             
 */
public class EmailClientAccount {
  @JsonProperty("host")
  private String host = null;
  @JsonProperty("port")
  private Integer port = null;
  @JsonProperty("securityOptions")
  private String securityOptions = null;
  @JsonProperty("protocolType")
  private String protocolType = null;
  @JsonProperty("credentials")
  private EmailClientAccountCredentials credentials = null;
  @JsonProperty("cacheFile")
  private StorageFileLocation cacheFile = null;

  /**
   * Set host and return this.
   * @param host Mail server host name or IP address             
   * @return this
  **/
  public EmailClientAccount host(String host) {
    this.host = host;
    return this;
  }

  /**
   * Mail server host name or IP address             
   * @return host
  **/
  public String getHost() {
    return host;
  }  

  /**
   * Set host.
   * @param host Mail server host name or IP address             
  **/
  public void setHost(String host) {
    this.host = host;
  }


  /**
   * Set port and return this.
   * @param port Mail server port             
   * @return this
  **/
  public EmailClientAccount port(Integer port) {
    this.port = port;
    return this;
  }

  /**
   * Mail server port             
   * minimum: 1
   * maximum: 2147483647
   * @return port
  **/
  public Integer getPort() {
    return port;
  }  

  /**
   * Set port.
   * @param port Mail server port             
  **/
  public void setPort(Integer port) {
    this.port = port;
  }


  /**
   * Set securityOptions and return this.
   * @param securityOptions Email account security mode. Enum, available values: None, SSLExplicit, SSLImplicit, SSLAuto, Auto
   * @return this
  **/
  public EmailClientAccount securityOptions(String securityOptions) {
    this.securityOptions = securityOptions;
    return this;
  }

  /**
   * Email account security mode. Enum, available values: None, SSLExplicit, SSLImplicit, SSLAuto, Auto
   * @return securityOptions
  **/
  public String getSecurityOptions() {
    return securityOptions;
  }  

  /**
   * Set securityOptions.
   * @param securityOptions Email account security mode. Enum, available values: None, SSLExplicit, SSLImplicit, SSLAuto, Auto
  **/
  public void setSecurityOptions(String securityOptions) {
    this.securityOptions = securityOptions;
  }


  /**
   * Set protocolType and return this.
   * @param protocolType Type of connection protocol. Enum, available values: IMAP, POP3, SMTP, EWS, WebDav
   * @return this
  **/
  public EmailClientAccount protocolType(String protocolType) {
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
   * Set credentials and return this.
   * @param credentials Email client account credentials             
   * @return this
  **/
  public EmailClientAccount credentials(EmailClientAccountCredentials credentials) {
    this.credentials = credentials;
    return this;
  }

  /**
   * Email client account credentials             
   * @return credentials
  **/
  public EmailClientAccountCredentials getCredentials() {
    return credentials;
  }  

  /**
   * Set credentials.
   * @param credentials Email client account credentials             
  **/
  public void setCredentials(EmailClientAccountCredentials credentials) {
    this.credentials = credentials;
  }


  /**
   * Set cacheFile and return this.
   * @param cacheFile File with messages cache. Used to provide extra functions, which are not supported by account             
   * @return this
  **/
  public EmailClientAccount cacheFile(StorageFileLocation cacheFile) {
    this.cacheFile = cacheFile;
    return this;
  }

  /**
   * File with messages cache. Used to provide extra functions, which are not supported by account             
   * @return cacheFile
  **/
  public StorageFileLocation getCacheFile() {
    return cacheFile;
  }  

  /**
   * Set cacheFile.
   * @param cacheFile File with messages cache. Used to provide extra functions, which are not supported by account             
  **/
  public void setCacheFile(StorageFileLocation cacheFile) {
    this.cacheFile = cacheFile;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    EmailClientAccount emailClientAccount = (EmailClientAccount) o;
    return ObjectUtils.equals(this.host, emailClientAccount.host) &&
    ObjectUtils.equals(this.port, emailClientAccount.port) &&
    ObjectUtils.equals(this.securityOptions, emailClientAccount.securityOptions) &&
    ObjectUtils.equals(this.protocolType, emailClientAccount.protocolType) &&
    ObjectUtils.equals(this.credentials, emailClientAccount.credentials) &&
    ObjectUtils.equals(this.cacheFile, emailClientAccount.cacheFile);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(host, port, securityOptions, protocolType, credentials, cacheFile);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailClientAccount {\n");
    
    sb.append("    host: ").append(toIndentedString(getHost())).append("\n");
    sb.append("    port: ").append(toIndentedString(getPort())).append("\n");
    sb.append("    securityOptions: ").append(toIndentedString(getSecurityOptions())).append("\n");
    sb.append("    protocolType: ").append(toIndentedString(getProtocolType())).append("\n");
    sb.append("    credentials: ").append(toIndentedString(getCredentials())).append("\n");
    sb.append("    cacheFile: ").append(toIndentedString(getCacheFile())).append("\n");
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

  public EmailClientAccount() {
    super();
  }

  /**
   * Initializes a new instance of the EmailClientAccount
   * @param host Mail server host name or IP address             
   * @param port Mail server port             
   * @param securityOptions Email account security mode. Enum, available values: None, SSLExplicit, SSLImplicit, SSLAuto, Auto
   * @param protocolType Type of connection protocol. Enum, available values: IMAP, POP3, SMTP, EWS, WebDav
   * @param credentials Email client account credentials             
   * @param cacheFile File with messages cache. Used to provide extra functions, which are not supported by account             
   */
  public EmailClientAccount(
    String host,
    Integer port,
    String securityOptions,
    String protocolType,
    EmailClientAccountCredentials credentials,
    StorageFileLocation cacheFile
  ) {
    super();
    setHost(host);
    setPort(port);
    setSecurityOptions(securityOptions);
    setProtocolType(protocolType);
    setCredentials(credentials);
    setCacheFile(cacheFile);
  }

}

