/*
 * Центр аутентификации
 * API демонстрационного приложения \"Центр аутентификации\"
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.github.peneksglazami.cassandra.demo.model.rest;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.github.peneksglazami.cassandra.demo.model.rest.UserStatus;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * GetUserResponse
 */


public class GetUserResponse {
  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("login")
  private String login = null;

  @JsonProperty("groupId")
  private String groupId = null;

  @JsonProperty("status")
  private UserStatus status = null;

  public GetUserResponse uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Get uuid
   * @return uuid
  **/
  @Schema(required = true, description = "")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public GetUserResponse login(String login) {
    this.login = login;
    return this;
  }

   /**
   * Get login
   * @return login
  **/
  @Schema(required = true, description = "")
  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public GetUserResponse groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * Get groupId
   * @return groupId
  **/
  @Schema(required = true, description = "")
  public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  public GetUserResponse status(UserStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(required = true, description = "")
  public UserStatus getStatus() {
    return status;
  }

  public void setStatus(UserStatus status) {
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
    GetUserResponse getUserResponse = (GetUserResponse) o;
    return Objects.equals(this.uuid, getUserResponse.uuid) &&
        Objects.equals(this.login, getUserResponse.login) &&
        Objects.equals(this.groupId, getUserResponse.groupId) &&
        Objects.equals(this.status, getUserResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, login, groupId, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUserResponse {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
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
