/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="EmailClientAccountOauthCredentials.java">
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
 * Represents email client account OAuth 2.0 credentials             
 */
public class EmailClientAccountOauthCredentials extends EmailClientAccountCredentials {
  @JsonProperty("clientId")
  private String clientId = null;
  @JsonProperty("clientSecret")
  private String clientSecret = null;
  @JsonProperty("refreshToken")
  private String refreshToken = null;
  @JsonProperty("requestUrl")
  private String requestUrl = null;

  /**
   * Set clientId and return this.
   * @param clientId The client ID obtained from the Google Cloud Console during application registration.             
   * @return this
  **/
  public EmailClientAccountOauthCredentials clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * The client ID obtained from the Google Cloud Console during application registration.             
   * @return clientId
  **/
  public String getClientId() {
    return clientId;
  }  

  /**
   * Set clientId.
   * @param clientId The client ID obtained from the Google Cloud Console during application registration.             
  **/
  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  /**
   * Set clientSecret and return this.
   * @param clientSecret The client secret obtained during application registration.             
   * @return this
  **/
  public EmailClientAccountOauthCredentials clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

  /**
   * The client secret obtained during application registration.             
   * @return clientSecret
  **/
  public String getClientSecret() {
    return clientSecret;
  }  

  /**
   * Set clientSecret.
   * @param clientSecret The client secret obtained during application registration.             
  **/
  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }


  /**
   * Set refreshToken and return this.
   * @param refreshToken OAuth 2.0 refresh token             
   * @return this
  **/
  public EmailClientAccountOauthCredentials refreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

  /**
   * OAuth 2.0 refresh token             
   * @return refreshToken
  **/
  public String getRefreshToken() {
    return refreshToken;
  }  

  /**
   * Set refreshToken.
   * @param refreshToken OAuth 2.0 refresh token             
  **/
  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }


  /**
   * Set requestUrl and return this.
   * @param requestUrl The url to obtain access token. If not specified, will try to discover from email client account host.             
   * @return this
  **/
  public EmailClientAccountOauthCredentials requestUrl(String requestUrl) {
    this.requestUrl = requestUrl;
    return this;
  }

  /**
   * The url to obtain access token. If not specified, will try to discover from email client account host.             
   * @return requestUrl
  **/
  public String getRequestUrl() {
    return requestUrl;
  }  

  /**
   * Set requestUrl.
   * @param requestUrl The url to obtain access token. If not specified, will try to discover from email client account host.             
  **/
  public void setRequestUrl(String requestUrl) {
    this.requestUrl = requestUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    EmailClientAccountOauthCredentials emailClientAccountOauthCredentials = (EmailClientAccountOauthCredentials) o;
    return ObjectUtils.equals(this.clientId, emailClientAccountOauthCredentials.clientId) &&
    ObjectUtils.equals(this.clientSecret, emailClientAccountOauthCredentials.clientSecret) &&
    ObjectUtils.equals(this.refreshToken, emailClientAccountOauthCredentials.refreshToken) &&
    ObjectUtils.equals(this.requestUrl, emailClientAccountOauthCredentials.requestUrl) &&
    super.equals(o);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(clientId, clientSecret, refreshToken, requestUrl, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailClientAccountOauthCredentials {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    login: ").append(toIndentedString(getLogin())).append("\n");
    sb.append("    discriminator: ").append(toIndentedString(getDiscriminator())).append("\n");
    sb.append("    clientId: ").append(toIndentedString(getClientId())).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(getClientSecret())).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(getRefreshToken())).append("\n");
    sb.append("    requestUrl: ").append(toIndentedString(getRequestUrl())).append("\n");
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

  public EmailClientAccountOauthCredentials() {
    super();
  }

  /**
   * Initializes a new instance of the EmailClientAccountOauthCredentials
   * @param login Email client account login             
   * @param clientId The client ID obtained from the Google Cloud Console during application registration.             
   * @param clientSecret The client secret obtained during application registration.             
   * @param refreshToken OAuth 2.0 refresh token             
   * @param requestUrl The url to obtain access token. If not specified, will try to discover from email client account host.             
   */
  public EmailClientAccountOauthCredentials(
    String login
    ,
    String clientId,
    String clientSecret,
    String refreshToken,
    String requestUrl
  ) {
    super();
    setLogin(login);
    setClientId(clientId);
    setClientSecret(clientSecret);
    setRefreshToken(refreshToken);
    setRequestUrl(requestUrl);
  }

}

