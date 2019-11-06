/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="AsposeResponse.java">
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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.*;
import com.google.gson.*;
import com.google.gson.stream.*;
import java.io.*;

/**
 * AsposeResponse
 */
public class AsposeResponse {
  /**
   * Gets or Sets code
   */
  @JsonAdapter(CodeEnum.Adapter.class)
  public enum CodeEnum {
    CONTINUE("Continue"),
    
    SWITCHINGPROTOCOLS("SwitchingProtocols"),
    
    PROCESSING("Processing"),
    
    EARLYHINTS("EarlyHints"),
    
    OK("OK"),
    
    CREATED("Created"),
    
    ACCEPTED("Accepted"),
    
    NONAUTHORITATIVEINFORMATION("NonAuthoritativeInformation"),
    
    NOCONTENT("NoContent"),
    
    RESETCONTENT("ResetContent"),
    
    PARTIALCONTENT("PartialContent"),
    
    MULTISTATUS("MultiStatus"),
    
    ALREADYREPORTED("AlreadyReported"),
    
    IMUSED("IMUsed"),
    
    MULTIPLECHOICES("MultipleChoices"),
    
    AMBIGUOUS("Ambiguous"),
    
    MOVEDPERMANENTLY("MovedPermanently"),
    
    MOVED("Moved"),
    
    FOUND("Found"),
    
    REDIRECT("Redirect"),
    
    SEEOTHER("SeeOther"),
    
    REDIRECTMETHOD("RedirectMethod"),
    
    NOTMODIFIED("NotModified"),
    
    USEPROXY("UseProxy"),
    
    UNUSED("Unused"),
    
    TEMPORARYREDIRECT("TemporaryRedirect"),
    
    REDIRECTKEEPVERB("RedirectKeepVerb"),
    
    PERMANENTREDIRECT("PermanentRedirect"),
    
    BADREQUEST("BadRequest"),
    
    UNAUTHORIZED("Unauthorized"),
    
    PAYMENTREQUIRED("PaymentRequired"),
    
    FORBIDDEN("Forbidden"),
    
    NOTFOUND("NotFound"),
    
    METHODNOTALLOWED("MethodNotAllowed"),
    
    NOTACCEPTABLE("NotAcceptable"),
    
    PROXYAUTHENTICATIONREQUIRED("ProxyAuthenticationRequired"),
    
    REQUESTTIMEOUT("RequestTimeout"),
    
    CONFLICT("Conflict"),
    
    GONE("Gone"),
    
    LENGTHREQUIRED("LengthRequired"),
    
    PRECONDITIONFAILED("PreconditionFailed"),
    
    REQUESTENTITYTOOLARGE("RequestEntityTooLarge"),
    
    REQUESTURITOOLONG("RequestUriTooLong"),
    
    UNSUPPORTEDMEDIATYPE("UnsupportedMediaType"),
    
    REQUESTEDRANGENOTSATISFIABLE("RequestedRangeNotSatisfiable"),
    
    EXPECTATIONFAILED("ExpectationFailed"),
    
    MISDIRECTEDREQUEST("MisdirectedRequest"),
    
    UNPROCESSABLEENTITY("UnprocessableEntity"),
    
    LOCKED("Locked"),
    
    FAILEDDEPENDENCY("FailedDependency"),
    
    UPGRADEREQUIRED("UpgradeRequired"),
    
    PRECONDITIONREQUIRED("PreconditionRequired"),
    
    TOOMANYREQUESTS("TooManyRequests"),
    
    REQUESTHEADERFIELDSTOOLARGE("RequestHeaderFieldsTooLarge"),
    
    UNAVAILABLEFORLEGALREASONS("UnavailableForLegalReasons"),
    
    INTERNALSERVERERROR("InternalServerError"),
    
    NOTIMPLEMENTED("NotImplemented"),
    
    BADGATEWAY("BadGateway"),
    
    SERVICEUNAVAILABLE("ServiceUnavailable"),
    
    GATEWAYTIMEOUT("GatewayTimeout"),
    
    HTTPVERSIONNOTSUPPORTED("HttpVersionNotSupported"),
    
    VARIANTALSONEGOTIATES("VariantAlsoNegotiates"),
    
    INSUFFICIENTSTORAGE("InsufficientStorage"),
    
    LOOPDETECTED("LoopDetected"),
    
    NOTEXTENDED("NotExtended"),
    
    NETWORKAUTHENTICATIONREQUIRED("NetworkAuthenticationRequired");

    private String value;

    CodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CodeEnum fromValue(String text) {
      for (CodeEnum b : CodeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CodeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CodeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @JsonProperty("code")
  private CodeEnum code = null;

  @JsonProperty("status")
  private String status = null;

  public AsposeResponse code(CodeEnum code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
  **/
  public CodeEnum getCode() {
    return code;
  }  

  public void setCode(CodeEnum code) {
    this.code = code;
  }

  public AsposeResponse status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  public String getStatus() {
    return status;
  }  

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    AsposeResponse asposeResponse = (AsposeResponse) o;
    return ObjectUtils.equals(this.code, asposeResponse.code) &&
    ObjectUtils.equals(this.status, asposeResponse.status);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(code, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AsposeResponse {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

}

