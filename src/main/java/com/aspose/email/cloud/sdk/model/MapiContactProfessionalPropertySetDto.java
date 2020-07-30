/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="MapiContactProfessionalPropertySetDto.java">
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
 * Properties are used to store professional details for the person represented by the contact             
 */
public class MapiContactProfessionalPropertySetDto {
  @JsonProperty("title")
  private String title = null;

  @JsonProperty("companyName")
  private String companyName = null;

  @JsonProperty("departmentName")
  private String departmentName = null;

  @JsonProperty("officeLocation")
  private String officeLocation = null;

  @JsonProperty("managerName")
  private String managerName = null;

  @JsonProperty("assistant")
  private String assistant = null;

  @JsonProperty("profession")
  private String profession = null;

  /**
   * Set title and return this.
   * @param title Gets or sets the job title of the contact             
   * @return this
  **/
  public MapiContactProfessionalPropertySetDto title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Gets or sets the job title of the contact             
   * @return title
  **/
  public String getTitle() {
    return title;
  }  

  /**
   * Set title.
   * @param title Gets or sets the job title of the contact             
  **/
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Set companyName and return this.
   * @param companyName Gets or sets the company that employs the contact             
   * @return this
  **/
  public MapiContactProfessionalPropertySetDto companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

  /**
   * Gets or sets the company that employs the contact             
   * @return companyName
  **/
  public String getCompanyName() {
    return companyName;
  }  

  /**
   * Set companyName.
   * @param companyName Gets or sets the company that employs the contact             
  **/
  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  /**
   * Set departmentName and return this.
   * @param departmentName Gets or sets the name of the department to which the contact belongs             
   * @return this
  **/
  public MapiContactProfessionalPropertySetDto departmentName(String departmentName) {
    this.departmentName = departmentName;
    return this;
  }

  /**
   * Gets or sets the name of the department to which the contact belongs             
   * @return departmentName
  **/
  public String getDepartmentName() {
    return departmentName;
  }  

  /**
   * Set departmentName.
   * @param departmentName Gets or sets the name of the department to which the contact belongs             
  **/
  public void setDepartmentName(String departmentName) {
    this.departmentName = departmentName;
  }

  /**
   * Set officeLocation and return this.
   * @param officeLocation Gets or sets the location of the office that the contact works in             
   * @return this
  **/
  public MapiContactProfessionalPropertySetDto officeLocation(String officeLocation) {
    this.officeLocation = officeLocation;
    return this;
  }

  /**
   * Gets or sets the location of the office that the contact works in             
   * @return officeLocation
  **/
  public String getOfficeLocation() {
    return officeLocation;
  }  

  /**
   * Set officeLocation.
   * @param officeLocation Gets or sets the location of the office that the contact works in             
  **/
  public void setOfficeLocation(String officeLocation) {
    this.officeLocation = officeLocation;
  }

  /**
   * Set managerName and return this.
   * @param managerName Gets or sets the name of the contact&#39;s manager             
   * @return this
  **/
  public MapiContactProfessionalPropertySetDto managerName(String managerName) {
    this.managerName = managerName;
    return this;
  }

  /**
   * Gets or sets the name of the contact&#39;s manager             
   * @return managerName
  **/
  public String getManagerName() {
    return managerName;
  }  

  /**
   * Set managerName.
   * @param managerName Gets or sets the name of the contact&#39;s manager             
  **/
  public void setManagerName(String managerName) {
    this.managerName = managerName;
  }

  /**
   * Set assistant and return this.
   * @param assistant Gets or sets the name of the contact&#39;s assistant             
   * @return this
  **/
  public MapiContactProfessionalPropertySetDto assistant(String assistant) {
    this.assistant = assistant;
    return this;
  }

  /**
   * Gets or sets the name of the contact&#39;s assistant             
   * @return assistant
  **/
  public String getAssistant() {
    return assistant;
  }  

  /**
   * Set assistant.
   * @param assistant Gets or sets the name of the contact&#39;s assistant             
  **/
  public void setAssistant(String assistant) {
    this.assistant = assistant;
  }

  /**
   * Set profession and return this.
   * @param profession Gets or sets the profession of the contact             
   * @return this
  **/
  public MapiContactProfessionalPropertySetDto profession(String profession) {
    this.profession = profession;
    return this;
  }

  /**
   * Gets or sets the profession of the contact             
   * @return profession
  **/
  public String getProfession() {
    return profession;
  }  

  /**
   * Set profession.
   * @param profession Gets or sets the profession of the contact             
  **/
  public void setProfession(String profession) {
    this.profession = profession;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    MapiContactProfessionalPropertySetDto mapiContactProfessionalPropertySetDto = (MapiContactProfessionalPropertySetDto) o;
    return ObjectUtils.equals(this.title, mapiContactProfessionalPropertySetDto.title) &&
    ObjectUtils.equals(this.companyName, mapiContactProfessionalPropertySetDto.companyName) &&
    ObjectUtils.equals(this.departmentName, mapiContactProfessionalPropertySetDto.departmentName) &&
    ObjectUtils.equals(this.officeLocation, mapiContactProfessionalPropertySetDto.officeLocation) &&
    ObjectUtils.equals(this.managerName, mapiContactProfessionalPropertySetDto.managerName) &&
    ObjectUtils.equals(this.assistant, mapiContactProfessionalPropertySetDto.assistant) &&
    ObjectUtils.equals(this.profession, mapiContactProfessionalPropertySetDto.profession);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(title, companyName, departmentName, officeLocation, managerName, assistant, profession);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MapiContactProfessionalPropertySetDto {\n");
    
    sb.append("    title: ").append(toIndentedString(getTitle())).append("\n");
    sb.append("    companyName: ").append(toIndentedString(getCompanyName())).append("\n");
    sb.append("    departmentName: ").append(toIndentedString(getDepartmentName())).append("\n");
    sb.append("    officeLocation: ").append(toIndentedString(getOfficeLocation())).append("\n");
    sb.append("    managerName: ").append(toIndentedString(getManagerName())).append("\n");
    sb.append("    assistant: ").append(toIndentedString(getAssistant())).append("\n");
    sb.append("    profession: ").append(toIndentedString(getProfession())).append("\n");
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

  public MapiContactProfessionalPropertySetDto() {
    super();
  }

  /**
   * Initializes a new instance of the MapiContactProfessionalPropertySetDto
   * @param title Gets or sets the job title of the contact             
   * @param companyName Gets or sets the company that employs the contact             
   * @param departmentName Gets or sets the name of the department to which the contact belongs             
   * @param officeLocation Gets or sets the location of the office that the contact works in             
   * @param managerName Gets or sets the name of the contact&#39;s manager             
   * @param assistant Gets or sets the name of the contact&#39;s assistant             
   * @param profession Gets or sets the profession of the contact             
   */
  public MapiContactProfessionalPropertySetDto(
    String title,
    String companyName,
    String departmentName,
    String officeLocation,
    String managerName,
    String assistant,
    String profession
  ) {
    super();
    setTitle(title);
    setCompanyName(companyName);
    setDepartmentName(departmentName);
    setOfficeLocation(officeLocation);
    setManagerName(managerName);
    setAssistant(assistant);
    setProfession(profession);
  }

}

