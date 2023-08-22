/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="EmailConfigDiscoverOauthRequest.java">
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
 * EmailConfigDiscoverOauthRequest
 */
public class EmailConfigDiscoverOauthRequest extends DiscoverEmailConfigRequest {
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
   * @param clientId OAuth client id.             
   * @return this
  **/
  public EmailConfigDiscoverOauthRequest clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * OAuth client id.             
   * @return clientId
  **/
  public String getClientId() {
    return clientId;
  }  

  /**
   * Set clientId.
   * @param clientId OAuth client id.             
  **/
  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  /**
   * Set clientSecret and return this.
   * @param clientSecret OAuth client secret.             
   * @return this
  **/
  public EmailConfigDiscoverOauthRequest clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

  /**
   * OAuth client secret.             
   * @return clientSecret
  **/
  public String getClientSecret() {
    return clientSecret;
  }  

  /**
   * Set clientSecret.
   * @param clientSecret OAuth client secret.             
  **/
  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }


  /**
   * Set refreshToken and return this.
   * @param refreshToken OAuth refresh token.             
   * @return this
  **/
  public EmailConfigDiscoverOauthRequest refreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

  /**
   * OAuth refresh token.             
   * @return refreshToken
  **/
  public String getRefreshToken() {
    return refreshToken;
  }  

  /**
   * Set refreshToken.
   * @param refreshToken OAuth refresh token.             
  **/
  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }


  /**
   * Set requestUrl and return this.
   * @param requestUrl The url to obtain access token. If not specified, will be discovered from email configuration.             
   * @return this
  **/
  public EmailConfigDiscoverOauthRequest requestUrl(String requestUrl) {
    this.requestUrl = requestUrl;
    return this;
  }

  /**
   * The url to obtain access token. If not specified, will be discovered from email configuration.             
   * @return requestUrl
  **/
  public String getRequestUrl() {
    return requestUrl;
  }  

  /**
   * Set requestUrl.
   * @param requestUrl The url to obtain access token. If not specified, will be discovered from email configuration.             
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
    EmailConfigDiscoverOauthRequest emailConfigDiscoverOauthRequest = (EmailConfigDiscoverOauthRequest) o;
    return ObjectUtils.equals(this.clientId, emailConfigDiscoverOauthRequest.clientId) &&
    ObjectUtils.equals(this.clientSecret, emailConfigDiscoverOauthRequest.clientSecret) &&
    ObjectUtils.equals(this.refreshToken, emailConfigDiscoverOauthRequest.refreshToken) &&
    ObjectUtils.equals(this.requestUrl, emailConfigDiscoverOauthRequest.requestUrl) &&
    super.equals(o);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(clientId, clientSecret, refreshToken, requestUrl, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailConfigDiscoverOauthRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    address: ").append(toIndentedString(getAddress())).append("\n");
    sb.append("    fastProcessing: ").append(toIndentedString(isFastProcessing())).append("\n");
    sb.append("    login: ").append(toIndentedString(getLogin())).append("\n");
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

  public EmailConfigDiscoverOauthRequest() {
    super();
  }

  /**
   * Initializes a new instance of the EmailConfigDiscoverOauthRequest
   * @param address Email address to discover.             
   * @param fastProcessing Turns on fast processing. All discover systems will run in parallel. First discovered result will be returned.             
   * @param login Email account login. If not specified, address used as a login.             
   * @param clientId OAuth client id.             
   * @param clientSecret OAuth client secret.             
   * @param refreshToken OAuth refresh token.             
   * @param requestUrl The url to obtain access token. If not specified, will be discovered from email configuration.             
   */
  public EmailConfigDiscoverOauthRequest(
    String address,
    Boolean fastProcessing,
    String login,
    String clientId,
    String clientSecret,
    String refreshToken,
    String requestUrl
  ) {
    super();
    setAddress(address);
    setFastProcessing(fastProcessing);
    setLogin(login);
    setClientId(clientId);
    setClientSecret(clientSecret);
    setRefreshToken(refreshToken);
    setRequestUrl(requestUrl);
  }

}

