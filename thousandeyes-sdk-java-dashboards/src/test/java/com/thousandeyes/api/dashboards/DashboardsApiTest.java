/*
 * Dashboards API
 * Manage ThousandEyes Dashboards.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.dashboards;

import com.thousandeyes.api.dashboards.model.ApiDashboard;
import java.math.BigDecimal;
import com.thousandeyes.api.dashboards.model.Dashboard;
import com.thousandeyes.api.dashboards.model.DashboardOrder;
import com.thousandeyes.api.dashboards.model.Error;
import com.thousandeyes.api.dashboards.model.GetDashboardData200Response;
import java.time.OffsetDateTime;
import java.net.URI;
import com.thousandeyes.api.dashboards.model.UnauthorizedError;
import com.thousandeyes.api.dashboards.model.ValidationError;
import static com.thousandeyes.api.serialization.JSON.getDefault;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * Request and Response model deserialization tests for DashboardsApi
 */
public class DashboardsApiTest {
    // private final DashboardsApi api = new DashboardsApi();
    private final ObjectMapper mapper = getDefault()
            .getMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
    
    /**
     * Create dashboard
     * <p>
     * Creates a new dashboard in your account group. To create a dashboard,  you must have one of the following permissions: * &#x60;Edit dashboard templates for all users in account group&#x60; permission (Account Admin).  * &#x60;Edit own dashboard templates&#x60; permission (Regular User). 
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void createDashboardRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {
        String requestBodyJson = """
                {
                  "isMigratedReport" : false,
                  "_links" : {
                    "snapshots" : {
                      "hreflang" : "hreflang",
                      "templated" : true,
                      "profile" : "profile",
                      "name" : "name",
                      "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                      "type" : "type",
                      "deprecation" : "deprecation",
                      "title" : "title"
                    },
                    "self" : {
                      "hreflang" : "hreflang",
                      "templated" : true,
                      "profile" : "profile",
                      "name" : "name",
                      "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                      "type" : "type",
                      "deprecation" : "deprecation",
                      "title" : "title"
                    }
                  },
                  "isDefaultForAccount" : false,
                  "isDefaultForUser" : true,
                  "description" : "HTTP Server Widgets",
                  "isPrivate" : true,
                  "title" : "HTTP Server Widgets",
                  "isBuiltIn" : true,
                  "widgets" : [ {
                    "type" : "Agent Status",
                    "dataSource" : "ENDPOINT_AGENTS"
                  }, {
                    "type" : "Agent Status",
                    "dataSource" : "ENDPOINT_AGENTS"
                  } ],
                  "defaultTimespan" : {
                    "duration" : 7200,
                    "timespanDuration" : 7200,
                    "start" : "2023-05-16T10:14:28Z",
                    "end" : "2023-05-16T11:14:28Z",
                    "timespanStart" : "2023-05-16 10:14:28",
                    "timespanEnd" : "2023-05-16 11:14:28"
                  },
                  "globalFilterId" : "65babd9bb90bf55b17c96c8d",
                  "dashboardId" : "5e1f7a99143ae6004fdc3bb4",
                  "createdBy" : "1",
                  "modifiedDate" : "2023-05-16T10:14:28Z",
                  "modifiedBy" : "1",
                  "isGlobalOverride" : true,
                  "aid" : "1234"
                }
                                 """;
        Dashboard mappedRequest = 
                mapper.readValue(requestBodyJson, Dashboard.class);
        assertNotNull(mappedRequest);

        String responseBodyJson = """
                {
                  "isMigratedReport" : false,
                  "_links" : {
                    "snapshots" : {
                      "hreflang" : "hreflang",
                      "templated" : true,
                      "profile" : "profile",
                      "name" : "name",
                      "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                      "type" : "type",
                      "deprecation" : "deprecation",
                      "title" : "title"
                    },
                    "self" : {
                      "hreflang" : "hreflang",
                      "templated" : true,
                      "profile" : "profile",
                      "name" : "name",
                      "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                      "type" : "type",
                      "deprecation" : "deprecation",
                      "title" : "title"
                    }
                  },
                  "isDefaultForAccount" : false,
                  "isDefaultForUser" : true,
                  "description" : "HTTP Server Widgets",
                  "isPrivate" : true,
                  "title" : "HTTP Server Widgets",
                  "isBuiltIn" : true,
                  "widgets" : [ {
                    "type" : "Agent Status",
                    "dataSource" : "ENDPOINT_AGENTS"
                  }, {
                    "type" : "Agent Status",
                    "dataSource" : "ENDPOINT_AGENTS"
                  } ],
                  "defaultTimespan" : {
                    "duration" : 7200,
                    "timespanDuration" : 7200,
                    "start" : "2023-05-16T10:14:28Z",
                    "end" : "2023-05-16T11:14:28Z",
                    "timespanStart" : "2023-05-16 10:14:28",
                    "timespanEnd" : "2023-05-16 11:14:28"
                  },
                  "globalFilterId" : "65babd9bb90bf55b17c96c8d",
                  "dashboardId" : "5e1f7a99143ae6004fdc3bb4",
                  "createdBy" : "1",
                  "modifiedDate" : "2023-05-16T10:14:28Z",
                  "modifiedBy" : "1",
                  "isGlobalOverride" : true,
                  "aid" : "1234"
                }
                                  """;
        Dashboard mappedResponse = 
                mapper.readValue(responseBodyJson, Dashboard.class);
        assertNotNull(mappedResponse);
    }
    
    /**
     * Delete dashboard
     * <p>
     * Deletes a dashboard using the &#x60;dashboardId&#x60; provided in the request.  **Note**: * Users with the &#x60;Edit dashboard templates for all users in account group&#x60; permission (Account Admin) can delete any dashboard. * Users with the &#x60;Edit own dashboard templates&#x60; permission (Regular User) can only delete the dashboards they have created themselves. 
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    @Disabled
    @Test
    public void deleteDashboardRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {

    }
    
    /**
     * Retrieve dashboard
     * <p>
     * Returns a list of widgets within a dashboard, along with the dashboard&#39;s metadata. 
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void getDashboardByIdRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {

        String responseBodyJson = """
                {
                  "isMigratedReport" : false,
                  "dashboardCreatedBy" : "1",
                  "_links" : {
                    "snapshots" : {
                      "hreflang" : "hreflang",
                      "templated" : true,
                      "profile" : "profile",
                      "name" : "name",
                      "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                      "type" : "type",
                      "deprecation" : "deprecation",
                      "title" : "title"
                    },
                    "self" : {
                      "hreflang" : "hreflang",
                      "templated" : true,
                      "profile" : "profile",
                      "name" : "name",
                      "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                      "type" : "type",
                      "deprecation" : "deprecation",
                      "title" : "title"
                    }
                  },
                  "dashboardModifiedBy" : "1",
                  "migratedReport" : false,
                  "isDefaultForAccount" : false,
                  "isDefaultForUser" : true,
                  "description" : "HTTP Server Widgets",
                  "isPrivate" : true,
                  "title" : "HTTP Server Widgets",
                  "isBuiltIn" : true,
                  "widgets" : [ {
                    "type" : "Agent Status",
                    "dataSource" : "ENDPOINT_AGENTS"
                  }, {
                    "type" : "Agent Status",
                    "dataSource" : "ENDPOINT_AGENTS"
                  } ],
                  "defaultTimespan" : {
                    "duration" : 7200,
                    "timespanDuration" : 7200,
                    "start" : "2023-05-16T10:14:28Z",
                    "end" : "2023-05-16T11:14:28Z",
                    "timespanStart" : "2023-05-16 10:14:28",
                    "timespanEnd" : "2023-05-16 11:14:28"
                  },
                  "globalFilterId" : "65babd9bb90bf55b17c96c8d",
                  "accountId" : 1234,
                  "apiLink" : [ {
                    "key" : ""
                  }, {
                    "key" : ""
                  } ],
                  "dashboardId" : "5e1f7a99143ae6004fdc3bb4",
                  "createdBy" : 1,
                  "globalOverride" : true,
                  "modifiedDate" : "2023-05-16 10:14:28",
                  "modifiedBy" : 1,
                  "isGlobalOverride" : true,
                  "aid" : "1234",
                  "dashboardModifiedDate" : "2023-05-16T10:14:28Z"
                }
                                  """;
        ApiDashboard mappedResponse = 
                mapper.readValue(responseBodyJson, ApiDashboard.class);
        assertNotNull(mappedResponse);
    }
    
    /**
     * Retrieve dashboard widget data
     * <p>
     * Returns the raw data displayed within a widget in the dashboard. 
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void getDashboardDataRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {

        String responseBodyJson = """
                {
                  "groupLabels" : [ {
                    "groupProperty" : "AGENT",
                    "groupLabels" : [ {
                      "groupId" : "2565",
                      "groupLabel" : "San Francisco, CA"
                    }, {
                      "groupId" : "2565",
                      "groupLabel" : "San Francisco, CA"
                    } ]
                  }, {
                    "groupProperty" : "AGENT",
                    "groupLabels" : [ {
                      "groupId" : "2565",
                      "groupLabel" : "San Francisco, CA"
                    }, {
                      "groupId" : "2565",
                      "groupLabel" : "San Francisco, CA"
                    } ]
                  } ],
                  "data" : {
                    "alerts" : [ {
                      "durationInSeconds" : 25,
                      "alertSource" : "Http Test",
                      "active" : true,
                      "testId" : "56512",
                      "startTime" : "2023-06-02T08:54:00Z",
                      "alertId" : "2004945",
                      "ruleId" : "281724",
                      "alertRule" : "Http Test Rule"
                    }, {
                      "durationInSeconds" : 25,
                      "alertSource" : "Http Test",
                      "active" : true,
                      "testId" : "56512",
                      "startTime" : "2023-06-02T08:54:00Z",
                      "alertId" : "2004945",
                      "ruleId" : "281724",
                      "alertRule" : "Http Test Rule"
                    } ],
                    "summary" : {
                      "offline" : 2,
                      "online" : 10,
                      "disabled" : 3
                    },
                    "totalAlerts" : 500,
                    "cards" : [ {
                      "numberOfDataPoints" : 24192,
                      "endDate" : "2023-05-16T10:14:28Z",
                      "cardId" : "lrxxr",
                      "alertSuppressionWindows" : [ {
                        "testIds" : [ "281474976710661" ],
                        "repeatUnit" : "week",
                        "durationInSeconds" : 7200,
                        "repeat" : "custom",
                        "name" : "Test dashboards",
                        "repeatEvery" : 5,
                        "id" : "281474976710662",
                        "startTimes" : [ "2023-05-16T10:14:28Z" ]
                      }, {
                        "testIds" : [ "281474976710661" ],
                        "repeatUnit" : "week",
                        "durationInSeconds" : 7200,
                        "repeat" : "custom",
                        "name" : "Test dashboards",
                        "repeatEvery" : 5,
                        "id" : "281474976710662",
                        "startTimes" : [ "2023-05-16T10:14:28Z" ]
                      } ],
                      "binSize" : 3600,
                      "previousValue" : 500.0,
                      "value" : 100.0,
                      "startDate" : "2023-05-16T10:14:28Z",
                      "timestamp" : 1567620000,
                      "status" : "No data"
                    }, {
                      "numberOfDataPoints" : 24192,
                      "endDate" : "2023-05-16T10:14:28Z",
                      "cardId" : "lrxxr",
                      "alertSuppressionWindows" : [ {
                        "testIds" : [ "281474976710661" ],
                        "repeatUnit" : "week",
                        "durationInSeconds" : 7200,
                        "repeat" : "custom",
                        "name" : "Test dashboards",
                        "repeatEvery" : 5,
                        "id" : "281474976710662",
                        "startTimes" : [ "2023-05-16T10:14:28Z" ]
                      }, {
                        "testIds" : [ "281474976710661" ],
                        "repeatUnit" : "week",
                        "durationInSeconds" : 7200,
                        "repeat" : "custom",
                        "name" : "Test dashboards",
                        "repeatEvery" : 5,
                        "id" : "281474976710662",
                        "startTimes" : [ "2023-05-16T10:14:28Z" ]
                      } ],
                      "binSize" : 3600,
                      "previousValue" : 500.0,
                      "value" : 100.0,
                      "startDate" : "2023-05-16T10:14:28Z",
                      "timestamp" : 1567620000,
                      "status" : "No data"
                    } ],
                    "tests" : [ {
                      "graphlets" : [ {
                        "metric" : "Availability",
                        "testId" : "68257",
                        "points" : [ {
                          "x" : 1580403900,
                          "y" : 128.249
                        }, {
                          "x" : 1580403900,
                          "y" : 128.249
                        } ]
                      }, {
                        "metric" : "Availability",
                        "testId" : "68257",
                        "points" : [ {
                          "x" : 1580403900,
                          "y" : 128.249
                        }, {
                          "x" : 1580403900,
                          "y" : 128.249
                        } ]
                      } ],
                      "alertCount" : 398,
                      "testType" : "Web - HTTP Server",
                      "testId" : "68256",
                      "isShared" : true,
                      "testName" : "Http Test Name",
                      "target" : "www.google.com"
                    }, {
                      "graphlets" : [ {
                        "metric" : "Availability",
                        "testId" : "68257",
                        "points" : [ {
                          "x" : 1580403900,
                          "y" : 128.249
                        }, {
                          "x" : 1580403900,
                          "y" : 128.249
                        } ]
                      }, {
                        "metric" : "Availability",
                        "testId" : "68257",
                        "points" : [ {
                          "x" : 1580403900,
                          "y" : 128.249
                        }, {
                          "x" : 1580403900,
                          "y" : 128.249
                        } ]
                      } ],
                      "alertCount" : 398,
                      "testType" : "Web - HTTP Server",
                      "testId" : "68256",
                      "isShared" : true,
                      "testName" : "Http Test Name",
                      "target" : "www.google.com"
                    } ],
                    "columns" : [ {
                      "columnId" : "938to",
                      "alertSuppressionWindows" : [ {
                        "testIds" : [ "281474976710661" ],
                        "repeatUnit" : "week",
                        "durationInSeconds" : 7200,
                        "repeat" : "custom",
                        "name" : "Test dashboards",
                        "repeatEvery" : 5,
                        "id" : "281474976710662",
                        "startTimes" : [ "2023-05-16T10:14:28Z" ]
                      }, {
                        "testIds" : [ "281474976710661" ],
                        "repeatUnit" : "week",
                        "durationInSeconds" : 7200,
                        "repeat" : "custom",
                        "name" : "Test dashboards",
                        "repeatEvery" : 5,
                        "id" : "281474976710662",
                        "startTimes" : [ "2023-05-16T10:14:28Z" ]
                      } ],
                      "binSize" : 3600,
                      "points" : [ {
                        "numberOfDataPoints" : 23304,
                        "groups" : [ {
                          "groupProperty" : "COUNTRY",
                          "groupValue" : "US"
                        }, {
                          "groupProperty" : "COUNTRY",
                          "groupValue" : "US"
                        } ],
                        "value" : 100.0,
                        "timestamp" : 1567620000
                      }, {
                        "numberOfDataPoints" : 23304,
                        "groups" : [ {
                          "groupProperty" : "COUNTRY",
                          "groupValue" : "US"
                        }, {
                          "groupProperty" : "COUNTRY",
                          "groupValue" : "US"
                        } ],
                        "value" : 100.0,
                        "timestamp" : 1567620000
                      } ],
                      "status" : "No data"
                    }, {
                      "columnId" : "938to",
                      "alertSuppressionWindows" : [ {
                        "testIds" : [ "281474976710661" ],
                        "repeatUnit" : "week",
                        "durationInSeconds" : 7200,
                        "repeat" : "custom",
                        "name" : "Test dashboards",
                        "repeatEvery" : 5,
                        "id" : "281474976710662",
                        "startTimes" : [ "2023-05-16T10:14:28Z" ]
                      }, {
                        "testIds" : [ "281474976710661" ],
                        "repeatUnit" : "week",
                        "durationInSeconds" : 7200,
                        "repeat" : "custom",
                        "name" : "Test dashboards",
                        "repeatEvery" : 5,
                        "id" : "281474976710662",
                        "startTimes" : [ "2023-05-16T10:14:28Z" ]
                      } ],
                      "binSize" : 3600,
                      "points" : [ {
                        "numberOfDataPoints" : 23304,
                        "groups" : [ {
                          "groupProperty" : "COUNTRY",
                          "groupValue" : "US"
                        }, {
                          "groupProperty" : "COUNTRY",
                          "groupValue" : "US"
                        } ],
                        "value" : 100.0,
                        "timestamp" : 1567620000
                      }, {
                        "numberOfDataPoints" : 23304,
                        "groups" : [ {
                          "groupProperty" : "COUNTRY",
                          "groupValue" : "US"
                        }, {
                          "groupProperty" : "COUNTRY",
                          "groupValue" : "US"
                        } ],
                        "value" : 100.0,
                        "timestamp" : 1567620000
                      } ],
                      "status" : "No data"
                    } ],
                    "alertSuppressionWindows" : [ {
                      "testIds" : [ "281474976710661" ],
                      "repeatUnit" : "week",
                      "durationInSeconds" : 7200,
                      "repeat" : "custom",
                      "name" : "Test dashboards",
                      "repeatEvery" : 5,
                      "id" : "281474976710662",
                      "startTimes" : [ "2023-05-16T10:14:28Z" ]
                    }, {
                      "testIds" : [ "281474976710661" ],
                      "repeatUnit" : "week",
                      "durationInSeconds" : 7200,
                      "repeat" : "custom",
                      "name" : "Test dashboards",
                      "repeatEvery" : 5,
                      "id" : "281474976710662",
                      "startTimes" : [ "2023-05-16T10:14:28Z" ]
                    } ],
                    "activeAlerts" : 483,
                    "startRound" : 1384309800,
                    "points" : [ {
                      "numberOfDataPoints" : 23304,
                      "groups" : [ {
                        "groupProperty" : "COUNTRY",
                        "groupValue" : "US"
                      }, {
                        "groupProperty" : "COUNTRY",
                        "groupValue" : "US"
                      } ],
                      "value" : 100.0,
                      "timestamp" : 1567620000
                    }, {
                      "numberOfDataPoints" : 23304,
                      "groups" : [ {
                        "groupProperty" : "COUNTRY",
                        "groupValue" : "US"
                      }, {
                        "groupProperty" : "COUNTRY",
                        "groupValue" : "US"
                      } ],
                      "value" : 100.0,
                      "timestamp" : 1567620000
                    } ],
                    "agents" : [ {
                      "agentId" : "6522",
                      "agentName" : "0c3898000117",
                      "location" : {
                        "locationName" : "San Francisco, California, US",
                        "latitude" : 37.77493,
                        "longitude" : -122.41942
                      },
                      "ipInfo" : {
                        "ipv6" : "ipv6",
                        "privateIp" : "172.58.92.31",
                        "operativeSystemVersion" : "operativeSystemVersion",
                        "publicIp" : "172.58.92.31"
                      },
                      "status" : "online"
                    }, {
                      "agentId" : "6522",
                      "agentName" : "0c3898000117",
                      "location" : {
                        "locationName" : "San Francisco, California, US",
                        "latitude" : 37.77493,
                        "longitude" : -122.41942
                      },
                      "ipInfo" : {
                        "ipv6" : "ipv6",
                        "privateIp" : "172.58.92.31",
                        "operativeSystemVersion" : "operativeSystemVersion",
                        "publicIp" : "172.58.92.31"
                      },
                      "status" : "online"
                    } ],
                    "status" : "No data"
                  },
                  "endDate" : "2022-07-18T22:00:54Z",
                  "_links" : {
                    "next" : {
                      "hreflang" : "hreflang",
                      "templated" : true,
                      "profile" : "profile",
                      "name" : "name",
                      "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                      "type" : "type",
                      "deprecation" : "deprecation",
                      "title" : "title"
                    },
                    "previous" : {
                      "hreflang" : "hreflang",
                      "templated" : true,
                      "profile" : "profile",
                      "name" : "name",
                      "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                      "type" : "type",
                      "deprecation" : "deprecation",
                      "title" : "title"
                    },
                    "self" : {
                      "hreflang" : "hreflang",
                      "templated" : true,
                      "profile" : "profile",
                      "name" : "name",
                      "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                      "type" : "type",
                      "deprecation" : "deprecation",
                      "title" : "title"
                    }
                  },
                  "binSize" : 3600,
                  "startDate" : "2022-07-17T22:00:54Z"
                }
                                  """;
        GetDashboardData200Response mappedResponse = 
                mapper.readValue(responseBodyJson, GetDashboardData200Response.class);
        assertNotNull(mappedResponse);
    }
    
    /**
     * List dashboards
     * <p>
     * Returns a list of dashboards and their settings within your account group. 
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void getDashboardsForUserRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {

        String responseBodyJson = """
                [ {
                  "isMigratedReport" : false,
                  "dashboardCreatedBy" : "1",
                  "_links" : {
                    "snapshots" : {
                      "hreflang" : "hreflang",
                      "templated" : true,
                      "profile" : "profile",
                      "name" : "name",
                      "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                      "type" : "type",
                      "deprecation" : "deprecation",
                      "title" : "title"
                    },
                    "self" : {
                      "hreflang" : "hreflang",
                      "templated" : true,
                      "profile" : "profile",
                      "name" : "name",
                      "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                      "type" : "type",
                      "deprecation" : "deprecation",
                      "title" : "title"
                    }
                  },
                  "dashboardModifiedBy" : "1",
                  "migratedReport" : false,
                  "isDefaultForAccount" : false,
                  "isDefaultForUser" : true,
                  "description" : "HTTP Server Widgets",
                  "isPrivate" : true,
                  "title" : "HTTP Server Widgets",
                  "isBuiltIn" : true,
                  "widgets" : [ {
                    "type" : "Agent Status",
                    "dataSource" : "ENDPOINT_AGENTS"
                  }, {
                    "type" : "Agent Status",
                    "dataSource" : "ENDPOINT_AGENTS"
                  } ],
                  "defaultTimespan" : {
                    "duration" : 7200,
                    "timespanDuration" : 7200,
                    "start" : "2023-05-16T10:14:28Z",
                    "end" : "2023-05-16T11:14:28Z",
                    "timespanStart" : "2023-05-16 10:14:28",
                    "timespanEnd" : "2023-05-16 11:14:28"
                  },
                  "globalFilterId" : "65babd9bb90bf55b17c96c8d",
                  "accountId" : 1234,
                  "apiLink" : [ {
                    "key" : ""
                  }, {
                    "key" : ""
                  } ],
                  "dashboardId" : "5e1f7a99143ae6004fdc3bb4",
                  "createdBy" : 1,
                  "globalOverride" : true,
                  "modifiedDate" : "2023-05-16 10:14:28",
                  "modifiedBy" : 1,
                  "isGlobalOverride" : true,
                  "aid" : "1234",
                  "dashboardModifiedDate" : "2023-05-16T10:14:28Z"
                }, {
                  "isMigratedReport" : false,
                  "dashboardCreatedBy" : "1",
                  "_links" : {
                    "snapshots" : {
                      "hreflang" : "hreflang",
                      "templated" : true,
                      "profile" : "profile",
                      "name" : "name",
                      "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                      "type" : "type",
                      "deprecation" : "deprecation",
                      "title" : "title"
                    },
                    "self" : {
                      "hreflang" : "hreflang",
                      "templated" : true,
                      "profile" : "profile",
                      "name" : "name",
                      "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                      "type" : "type",
                      "deprecation" : "deprecation",
                      "title" : "title"
                    }
                  },
                  "dashboardModifiedBy" : "1",
                  "migratedReport" : false,
                  "isDefaultForAccount" : false,
                  "isDefaultForUser" : true,
                  "description" : "HTTP Server Widgets",
                  "isPrivate" : true,
                  "title" : "HTTP Server Widgets",
                  "isBuiltIn" : true,
                  "widgets" : [ {
                    "type" : "Agent Status",
                    "dataSource" : "ENDPOINT_AGENTS"
                  }, {
                    "type" : "Agent Status",
                    "dataSource" : "ENDPOINT_AGENTS"
                  } ],
                  "defaultTimespan" : {
                    "duration" : 7200,
                    "timespanDuration" : 7200,
                    "start" : "2023-05-16T10:14:28Z",
                    "end" : "2023-05-16T11:14:28Z",
                    "timespanStart" : "2023-05-16 10:14:28",
                    "timespanEnd" : "2023-05-16 11:14:28"
                  },
                  "globalFilterId" : "65babd9bb90bf55b17c96c8d",
                  "accountId" : 1234,
                  "apiLink" : [ {
                    "key" : ""
                  }, {
                    "key" : ""
                  } ],
                  "dashboardId" : "5e1f7a99143ae6004fdc3bb4",
                  "createdBy" : 1,
                  "globalOverride" : true,
                  "modifiedDate" : "2023-05-16 10:14:28",
                  "modifiedBy" : 1,
                  "isGlobalOverride" : true,
                  "aid" : "1234",
                  "dashboardModifiedDate" : "2023-05-16T10:14:28Z"
                } ]
                                  """;
        List<ApiDashboard> mappedResponse = 
                mapper.readValue(responseBodyJson, new TypeReference<List<ApiDashboard>>(){});
        assertNotNull(mappedResponse);
    }
    
    /**
     * Update dashboard
     * <p>
     * Updates an existing dashboard in your account group.   **Note**:  * Users with the &#x60;Edit dashboard templates for all users in account group&#x60; permission (Account Admin) can update any dashboard. * Users with the &#x60;Edit own dashboard templates&#x60; permission (Regular User) can only update the dashboards they have created themselves. 
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void updateDashboardRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {
        String requestBodyJson = """
                {
                  "isMigratedReport" : false,
                  "_links" : {
                    "snapshots" : {
                      "hreflang" : "hreflang",
                      "templated" : true,
                      "profile" : "profile",
                      "name" : "name",
                      "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                      "type" : "type",
                      "deprecation" : "deprecation",
                      "title" : "title"
                    },
                    "self" : {
                      "hreflang" : "hreflang",
                      "templated" : true,
                      "profile" : "profile",
                      "name" : "name",
                      "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                      "type" : "type",
                      "deprecation" : "deprecation",
                      "title" : "title"
                    }
                  },
                  "isDefaultForAccount" : false,
                  "isDefaultForUser" : true,
                  "description" : "HTTP Server Widgets",
                  "isPrivate" : true,
                  "title" : "HTTP Server Widgets",
                  "isBuiltIn" : true,
                  "widgets" : [ {
                    "type" : "Agent Status",
                    "dataSource" : "ENDPOINT_AGENTS"
                  }, {
                    "type" : "Agent Status",
                    "dataSource" : "ENDPOINT_AGENTS"
                  } ],
                  "defaultTimespan" : {
                    "duration" : 7200,
                    "timespanDuration" : 7200,
                    "start" : "2023-05-16T10:14:28Z",
                    "end" : "2023-05-16T11:14:28Z",
                    "timespanStart" : "2023-05-16 10:14:28",
                    "timespanEnd" : "2023-05-16 11:14:28"
                  },
                  "globalFilterId" : "65babd9bb90bf55b17c96c8d",
                  "dashboardId" : "5e1f7a99143ae6004fdc3bb4",
                  "createdBy" : "1",
                  "modifiedDate" : "2023-05-16T10:14:28Z",
                  "modifiedBy" : "1",
                  "isGlobalOverride" : true,
                  "aid" : "1234"
                }
                                 """;
        Dashboard mappedRequest = 
                mapper.readValue(requestBodyJson, Dashboard.class);
        assertNotNull(mappedRequest);

        String responseBodyJson = """
                {
                  "isMigratedReport" : false,
                  "_links" : {
                    "snapshots" : {
                      "hreflang" : "hreflang",
                      "templated" : true,
                      "profile" : "profile",
                      "name" : "name",
                      "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                      "type" : "type",
                      "deprecation" : "deprecation",
                      "title" : "title"
                    },
                    "self" : {
                      "hreflang" : "hreflang",
                      "templated" : true,
                      "profile" : "profile",
                      "name" : "name",
                      "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                      "type" : "type",
                      "deprecation" : "deprecation",
                      "title" : "title"
                    }
                  },
                  "isDefaultForAccount" : false,
                  "isDefaultForUser" : true,
                  "description" : "HTTP Server Widgets",
                  "isPrivate" : true,
                  "title" : "HTTP Server Widgets",
                  "isBuiltIn" : true,
                  "widgets" : [ {
                    "type" : "Agent Status",
                    "dataSource" : "ENDPOINT_AGENTS"
                  }, {
                    "type" : "Agent Status",
                    "dataSource" : "ENDPOINT_AGENTS"
                  } ],
                  "defaultTimespan" : {
                    "duration" : 7200,
                    "timespanDuration" : 7200,
                    "start" : "2023-05-16T10:14:28Z",
                    "end" : "2023-05-16T11:14:28Z",
                    "timespanStart" : "2023-05-16 10:14:28",
                    "timespanEnd" : "2023-05-16 11:14:28"
                  },
                  "globalFilterId" : "65babd9bb90bf55b17c96c8d",
                  "dashboardId" : "5e1f7a99143ae6004fdc3bb4",
                  "createdBy" : "1",
                  "modifiedDate" : "2023-05-16T10:14:28Z",
                  "modifiedBy" : "1",
                  "isGlobalOverride" : true,
                  "aid" : "1234"
                }
                                  """;
        Dashboard mappedResponse = 
                mapper.readValue(responseBodyJson, Dashboard.class);
        assertNotNull(mappedResponse);
    }
    
}
