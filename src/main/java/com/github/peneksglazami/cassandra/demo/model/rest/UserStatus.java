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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets userStatus
 */
public enum UserStatus {
  ACTIVE("ACTIVE"),
  BLOCKED("BLOCKED"),
  CLOSED("CLOSED");

  private String value;

  UserStatus(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static UserStatus fromValue(String text) {
    for (UserStatus b : UserStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}