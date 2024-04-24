/*
 * Test Snapshots API
 * Creates a new test snapshot in ThousandEyes.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.snapshots.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.api.snapshots.model.AppAndSelfLinksLinks;
import com.thousandeyes.api.snapshots.model.SnapshotResponseAllOfTest;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * SnapshotResponse
 */
@JsonPropertyOrder({
  SnapshotResponse.JSON_PROPERTY_LINKS,
  SnapshotResponse.JSON_PROPERTY_ID,
  SnapshotResponse.JSON_PROPERTY_START_ROUND_ID,
  SnapshotResponse.JSON_PROPERTY_END_ROUND_ID,
  SnapshotResponse.JSON_PROPERTY_ROUND_ID,
  SnapshotResponse.JSON_PROPERTY_SHARE_DATE,
  SnapshotResponse.JSON_PROPERTY_SOURCE_TEST_ID,
  SnapshotResponse.JSON_PROPERTY_TEST_ID,
  SnapshotResponse.JSON_PROPERTY_UID,
  SnapshotResponse.JSON_PROPERTY_DISPLAY_NAME,
  SnapshotResponse.JSON_PROPERTY_EXTRA_PARAMS,
  SnapshotResponse.JSON_PROPERTY_TEST
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-23T10:36:00.129251+01:00[Europe/London]")
public class SnapshotResponse {
  public static final String JSON_PROPERTY_LINKS = "_links";
  private AppAndSelfLinksLinks links;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_START_ROUND_ID = "startRoundId";
  private Integer startRoundId;

  public static final String JSON_PROPERTY_END_ROUND_ID = "endRoundId";
  private Integer endRoundId;

  public static final String JSON_PROPERTY_ROUND_ID = "roundId";
  private Integer roundId;

  public static final String JSON_PROPERTY_SHARE_DATE = "shareDate";
  private OffsetDateTime shareDate;

  public static final String JSON_PROPERTY_SOURCE_TEST_ID = "sourceTestId";
  private String sourceTestId;

  public static final String JSON_PROPERTY_TEST_ID = "testId";
  private String testId;

  public static final String JSON_PROPERTY_UID = "uid";
  private String uid;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
  private String displayName;

  public static final String JSON_PROPERTY_EXTRA_PARAMS = "extraParams";
  private String extraParams;

  public static final String JSON_PROPERTY_TEST = "test";
  private SnapshotResponseAllOfTest test;

  public SnapshotResponse() { 
  }

  @JsonCreator
  public SnapshotResponse(
    @JsonProperty(JSON_PROPERTY_START_ROUND_ID) Integer startRoundId, 
    @JsonProperty(JSON_PROPERTY_END_ROUND_ID) Integer endRoundId, 
    @JsonProperty(JSON_PROPERTY_ROUND_ID) Integer roundId
  ) {
  this();
    this.startRoundId = startRoundId;
    this.endRoundId = endRoundId;
    this.roundId = roundId;
  }

  public SnapshotResponse links(AppAndSelfLinksLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AppAndSelfLinksLinks getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(AppAndSelfLinksLinks links) {
    this.links = links;
  }


  public SnapshotResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Snapshot ID.
   * @return id
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


   /**
   * The start time of the test snapshot, represented in epoch time format (in seconds).
   * @return startRoundId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_ROUND_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStartRoundId() {
    return startRoundId;
  }




   /**
   * The end time of the test snapshot, represented in epoch time format (in seconds).
   * @return endRoundId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END_ROUND_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getEndRoundId() {
    return endRoundId;
  }




   /**
   * The selected time of the test snapshot, represented in epoch time format (in seconds).
   * @return roundId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROUND_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRoundId() {
    return roundId;
  }




  public SnapshotResponse shareDate(OffsetDateTime shareDate) {
    this.shareDate = shareDate;
    return this;
  }

   /**
   * The date when the test snapshot was created in UTC time, formatted in ISO date-time.
   * @return shareDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHARE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getShareDate() {
    return shareDate;
  }


  @JsonProperty(JSON_PROPERTY_SHARE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShareDate(OffsetDateTime shareDate) {
    this.shareDate = shareDate;
  }


  public SnapshotResponse sourceTestId(String sourceTestId) {
    this.sourceTestId = sourceTestId;
    return this;
  }

   /**
   * Snapshot test ID.
   * @return sourceTestId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE_TEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSourceTestId() {
    return sourceTestId;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE_TEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSourceTestId(String sourceTestId) {
    this.sourceTestId = sourceTestId;
  }


  public SnapshotResponse testId(String testId) {
    this.testId = testId;
    return this;
  }

   /**
   * Snapshot test ID.
   * @return testId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTestId() {
    return testId;
  }


  @JsonProperty(JSON_PROPERTY_TEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTestId(String testId) {
    this.testId = testId;
  }


  public SnapshotResponse uid(String uid) {
    this.uid = uid;
    return this;
  }

   /**
   * User ID.
   * @return uid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUid() {
    return uid;
  }


  @JsonProperty(JSON_PROPERTY_UID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUid(String uid) {
    this.uid = uid;
  }


  public SnapshotResponse displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Snapshot title.
   * @return displayName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDisplayName() {
    return displayName;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public SnapshotResponse extraParams(String extraParams) {
    this.extraParams = extraParams;
    return this;
  }

   /**
   * Extra parameters.
   * @return extraParams
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXTRA_PARAMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExtraParams() {
    return extraParams;
  }


  @JsonProperty(JSON_PROPERTY_EXTRA_PARAMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExtraParams(String extraParams) {
    this.extraParams = extraParams;
  }


  public SnapshotResponse test(SnapshotResponseAllOfTest test) {
    this.test = test;
    return this;
  }

   /**
   * Get test
   * @return test
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SnapshotResponseAllOfTest getTest() {
    return test;
  }


  @JsonProperty(JSON_PROPERTY_TEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTest(SnapshotResponseAllOfTest test) {
    this.test = test;
  }


  /**
   * Return true if this SnapshotResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnapshotResponse snapshotResponse = (SnapshotResponse) o;
    return Objects.equals(this.links, snapshotResponse.links) &&
        Objects.equals(this.id, snapshotResponse.id) &&
        Objects.equals(this.startRoundId, snapshotResponse.startRoundId) &&
        Objects.equals(this.endRoundId, snapshotResponse.endRoundId) &&
        Objects.equals(this.roundId, snapshotResponse.roundId) &&
        Objects.equals(this.shareDate, snapshotResponse.shareDate) &&
        Objects.equals(this.sourceTestId, snapshotResponse.sourceTestId) &&
        Objects.equals(this.testId, snapshotResponse.testId) &&
        Objects.equals(this.uid, snapshotResponse.uid) &&
        Objects.equals(this.displayName, snapshotResponse.displayName) &&
        Objects.equals(this.extraParams, snapshotResponse.extraParams) &&
        Objects.equals(this.test, snapshotResponse.test);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, id, startRoundId, endRoundId, roundId, shareDate, sourceTestId, testId, uid, displayName, extraParams, test);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnapshotResponse {\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    startRoundId: ").append(toIndentedString(startRoundId)).append("\n");
    sb.append("    endRoundId: ").append(toIndentedString(endRoundId)).append("\n");
    sb.append("    roundId: ").append(toIndentedString(roundId)).append("\n");
    sb.append("    shareDate: ").append(toIndentedString(shareDate)).append("\n");
    sb.append("    sourceTestId: ").append(toIndentedString(sourceTestId)).append("\n");
    sb.append("    testId: ").append(toIndentedString(testId)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    extraParams: ").append(toIndentedString(extraParams)).append("\n");
    sb.append("    test: ").append(toIndentedString(test)).append("\n");
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

