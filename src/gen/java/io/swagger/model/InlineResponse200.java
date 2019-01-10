package io.swagger.model;

import java.util.UUID;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class InlineResponse200  {
  
  @ApiModelProperty(example = "200", value = "Status code")
 /**
   * Status code
  **/
  private Integer status = null;

  @ApiModelProperty(example = "3110-78-8832", value = "ID from DB")
 /**
   * ID from DB
  **/
  private UUID UUID = null;

  @ApiModelProperty(example = "James", value = "Users first name")
 /**
   * Users first name
  **/
  private String firstName = null;

  @ApiModelProperty(example = "Stevens", value = "Users last name")
 /**
   * Users last name
  **/
  private String lastName = null;

  @ApiModelProperty(example = "j_stevens@sb.com", value = "Users email")
 /**
   * Users email
  **/
  private String email = null;

  @ApiModelProperty(example = "1511884800", value = "Unix timestamp of user posted to DB")
 /**
   * Unix timestamp of user posted to DB
  **/
  private String joinDate = null;
 /**
   * Status code
   * @return status
  **/
  @JsonProperty("status")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public InlineResponse200 status(Integer status) {
    this.status = status;
    return this;
  }

 /**
   * ID from DB
   * @return UUID
  **/
  @JsonProperty("UUID")
  public UUID getUUID() {
    return UUID;
  }

  public void setUUID(UUID UUID) {
    this.UUID = UUID;
  }

  public InlineResponse200 UUID(UUID UUID) {
    this.UUID = UUID;
    return this;
  }

 /**
   * Users first name
   * @return firstName
  **/
  @JsonProperty("first_name")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public InlineResponse200 firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

 /**
   * Users last name
   * @return lastName
  **/
  @JsonProperty("last_name")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public InlineResponse200 lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

 /**
   * Users email
   * @return email
  **/
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public InlineResponse200 email(String email) {
    this.email = email;
    return this;
  }

 /**
   * Unix timestamp of user posted to DB
   * @return joinDate
  **/
  @JsonProperty("join_date")
  public String getJoinDate() {
    return joinDate;
  }

  public void setJoinDate(String joinDate) {
    this.joinDate = joinDate;
  }

  public InlineResponse200 joinDate(String joinDate) {
    this.joinDate = joinDate;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    UUID: ").append(toIndentedString(UUID)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    joinDate: ").append(toIndentedString(joinDate)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

