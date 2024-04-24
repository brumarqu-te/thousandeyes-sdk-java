/*
 * Agents API
 *  ## Overview Manage all agents available to your account in ThousandEyes, including both Cloud and Enterprise Agents.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.agents.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.api.agents.model.AlertEmail;
import com.thousandeyes.api.agents.model.AlertIntegrationBase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Alert notification object.
 */
@JsonPropertyOrder({
  Notification.JSON_PROPERTY_EMAIL,
  Notification.JSON_PROPERTY_THIRD_PARTY,
  Notification.JSON_PROPERTY_WEBHOOK
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-24T13:50:10.086263+01:00[Europe/Lisbon]")
public class Notification {
  public static final String JSON_PROPERTY_EMAIL = "email";
  private AlertEmail email;

  public static final String JSON_PROPERTY_THIRD_PARTY = "thirdParty";
  private List<AlertIntegrationBase> thirdParty = new ArrayList<>();

  public static final String JSON_PROPERTY_WEBHOOK = "webhook";
  private List<AlertIntegrationBase> webhook = new ArrayList<>();

  public Notification() { 
  }

  public Notification email(AlertEmail email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AlertEmail getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmail(AlertEmail email) {
    this.email = email;
  }


  public Notification thirdParty(List<AlertIntegrationBase> thirdParty) {
    this.thirdParty = thirdParty;
    return this;
  }

  public Notification addThirdPartyItem(AlertIntegrationBase thirdPartyItem) {
    if (this.thirdParty == null) {
      this.thirdParty = new ArrayList<>();
    }
    this.thirdParty.add(thirdPartyItem);
    return this;
  }

   /**
   * Get thirdParty
   * @return thirdParty
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_THIRD_PARTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AlertIntegrationBase> getThirdParty() {
    return thirdParty;
  }


  @JsonProperty(JSON_PROPERTY_THIRD_PARTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThirdParty(List<AlertIntegrationBase> thirdParty) {
    this.thirdParty = thirdParty;
  }


  public Notification webhook(List<AlertIntegrationBase> webhook) {
    this.webhook = webhook;
    return this;
  }

  public Notification addWebhookItem(AlertIntegrationBase webhookItem) {
    if (this.webhook == null) {
      this.webhook = new ArrayList<>();
    }
    this.webhook.add(webhookItem);
    return this;
  }

   /**
   * Get webhook
   * @return webhook
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WEBHOOK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AlertIntegrationBase> getWebhook() {
    return webhook;
  }


  @JsonProperty(JSON_PROPERTY_WEBHOOK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebhook(List<AlertIntegrationBase> webhook) {
    this.webhook = webhook;
  }


  /**
   * Return true if this Notification object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Notification notification = (Notification) o;
    return Objects.equals(this.email, notification.email) &&
        Objects.equals(this.thirdParty, notification.thirdParty) &&
        Objects.equals(this.webhook, notification.webhook);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, thirdParty, webhook);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Notification {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    thirdParty: ").append(toIndentedString(thirdParty)).append("\n");
    sb.append("    webhook: ").append(toIndentedString(webhook)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

