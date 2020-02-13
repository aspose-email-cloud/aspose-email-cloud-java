/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="SaveOAuthEmailAccountRequest.java">
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
 * Save email account settings with OAuth request             
 */
public class SaveOAuthEmailAccountRequest extends EmailAccountRequest {
  @JsonProperty("clientId")
  private String clientId = null;

  @JsonProperty("clientSecret")
  private String clientSecret = null;

  @JsonProperty("refreshToken")
  private String refreshToken = null;

  public SaveOAuthEmailAccountRequest clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * OAuth client identifier             
   * @return clientId
  **/
  public String getClientId() {
    return clientId;
  }  

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public SaveOAuthEmailAccountRequest clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

  /**
   * OAuth client secret             
   * @return clientSecret
  **/
  public String getClientSecret() {
    return clientSecret;
  }  

  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }

  public SaveOAuthEmailAccountRequest refreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

  /**
   * OAuth refresh token             
   * @return refreshToken
  **/
  public String getRefreshToken() {
    return refreshToken;
  }  

  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    SaveOAuthEmailAccountRequest saveOAuthEmailAccountRequest = (SaveOAuthEmailAccountRequest) o;
    return ObjectUtils.equals(this.clientId, saveOAuthEmailAccountRequest.clientId) &&
    ObjectUtils.equals(this.clientSecret, saveOAuthEmailAccountRequest.clientSecret) &&
    ObjectUtils.equals(this.refreshToken, saveOAuthEmailAccountRequest.refreshToken) &&
    super.equals(o);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(clientId, clientSecret, refreshToken, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaveOAuthEmailAccountRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    host: ").append(toIndentedString(getHost())).append("\n");
    sb.append("    port: ").append(toIndentedString(getPort())).append("\n");
    sb.append("    login: ").append(toIndentedString(getLogin())).append("\n");
    sb.append("    securityOptions: ").append(toIndentedString(getSecurityOptions())).append("\n");
    sb.append("    protocolType: ").append(toIndentedString(getProtocolType())).append("\n");
    sb.append("    description: ").append(toIndentedString(getDescription())).append("\n");
    sb.append("    storageFile: ").append(toIndentedString(getStorageFile())).append("\n");
    sb.append("    clientId: ").append(toIndentedString(getClientId())).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(getClientSecret())).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(getRefreshToken())).append("\n");
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

  public SaveOAuthEmailAccountRequest() {
    super();
  }

  /**
   * Initializes a new instance of the SaveOAuthEmailAccountRequest
   * @param host Email account host             
   * @param port Email account port             
   * @param login Email account login             
   * @param securityOptions Security mode for a mail client Enum, available values: None, SSLExplicit, SSLImplicit, SSLAuto, Auto
   * @param protocolType Type of connection protocol. Enum, available values: IMAP, POP3, SMTP, EWS, WebDav
   * @param description Email account description             
   * @param storageFile A storage file location info to store email account             
   * @param clientId OAuth client identifier             
   * @param clientSecret OAuth client secret             
   * @param refreshToken OAuth refresh token             
   */
  public SaveOAuthEmailAccountRequest(String host, Integer port, String login, String securityOptions, String protocolType, String description, StorageFileLocation storageFile, String clientId, String clientSecret, String refreshToken) {
    super();
    setHost(host);
    setPort(port);
    setLogin(login);
    setSecurityOptions(securityOptions);
    setProtocolType(protocolType);
    setDescription(description);
    setStorageFile(storageFile);
    setClientId(clientId);
    setClientSecret(clientSecret);
    setRefreshToken(refreshToken);
  }

}

