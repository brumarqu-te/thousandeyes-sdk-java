/*
 * Endpoint Test Results API
 * Retrieve results for scheduled and dynamic tests on endpoint agents.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.endpoint.tests.results;

import java.math.BigDecimal;
import com.thousandeyes.api.endpoint.tests.results.model.Error;
import com.thousandeyes.api.endpoint.tests.results.model.GetTestResultNetworkPathvis200Response;
import com.thousandeyes.api.endpoint.tests.results.model.GetTestResultPathvisAgentRound200Response;
import com.thousandeyes.api.endpoint.tests.results.model.MultiTestIdTestsDataRoundsSearch;
import java.time.OffsetDateTime;
import com.thousandeyes.api.endpoint.tests.results.model.PostFetchTestResultMetrics200Response;
import com.thousandeyes.api.endpoint.tests.results.model.PostFetchTestResultMetricsMultiTest200Response;
import com.thousandeyes.api.endpoint.tests.results.model.TestsDataRoundsSearch;
import com.thousandeyes.api.endpoint.tests.results.model.UnauthorizedError;
import static com.thousandeyes.api.serialization.JSON.getDefault;
import static org.junit.jupiter.api.Assertions.assertNotNull;


import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * Request and Response model deserialization tests for NetworkScheduledTestsResultsApi
 */
public class NetworkScheduledTestsResultsApiTest {
    // private final NetworkScheduledTestsResultsApi api = new NetworkScheduledTestsResultsApi();
    private final ObjectMapper mapper = getDefault()
            .getMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
    
    /**
     * Retrieve path visualization network scheduled test results
     * <p>
     * Returns a summary of the path visualization data collected from each endpoint agent to the destination. In each path visualization attempt, one attempt is made to reach the destination. Each set of data is summarized, based on response time, number of hops, and response time to the target. A time frame must be specified, or the most recent round within last 2 hours is returned. 
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void getTestResultNetworkPathvisRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {

        String responseBodyJson = """
                {
                  "test" : {
                    "type" : "agent-to-server"
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
                  "results" : [ {
                    "pathTraces" : [ {
                      "numberOfHops" : 15,
                      "responseTime" : 1500,
                      "ipAddress" : "196.40.106.237",
                      "pathId" : "1230899668701775614109128428722974545787322404682781961521"
                    }, {
                      "numberOfHops" : 15,
                      "responseTime" : 1500,
                      "ipAddress" : "196.40.106.237",
                      "pathId" : "1230899668701775614109128428722974545787322404682781961521"
                    } ],
                    "location" : "San Francisco Area"
                  }, {
                    "pathTraces" : [ {
                      "numberOfHops" : 15,
                      "responseTime" : 1500,
                      "ipAddress" : "196.40.106.237",
                      "pathId" : "1230899668701775614109128428722974545787322404682781961521"
                    }, {
                      "numberOfHops" : 15,
                      "responseTime" : 1500,
                      "ipAddress" : "196.40.106.237",
                      "pathId" : "1230899668701775614109128428722974545787322404682781961521"
                    } ],
                    "location" : "San Francisco Area"
                  } ],
                  "startDate" : "2022-07-17T22:00:54Z"
                }
                                  """;
        GetTestResultNetworkPathvis200Response mappedResponse = 
                mapper.readValue(responseBodyJson, GetTestResultNetworkPathvis200Response.class);
        assertNotNull(mappedResponse);
    }
    
    /**
     * Retrieve path visualization network scheduled test results details
     * <p>
     * Returns a hop-by-hop summary of the path trace data collected during path visualization. In each round, one path discovery attempt is made to reach the destination. The entire path is returned. A &#x60;roundId&#x60; must be specified. 
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void getTestResultPathvisAgentRoundRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {

        String responseBodyJson = """
                {
                  "test" : {
                    "type" : "agent-to-server"
                  },
                  "_links" : {
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
                  "results" : [ {
                    "pathTraces" : [ {
                      "hops" : [ {
                        "rdns" : "core-router1.cpt2.host-h.net",
                        "prefix" : "196.40.96.0/20",
                        "responseTime" : 1,
                        "hop" : 1,
                        "ipAddress" : "196.40.106.237",
                        "location" : "Cape Town, South Africa",
                        "network" : "HETZNER (Pty) Ltd (AS 37153)"
                      }, {
                        "rdns" : "core-router1.cpt2.host-h.net",
                        "prefix" : "196.40.96.0/20",
                        "responseTime" : 1,
                        "hop" : 1,
                        "ipAddress" : "196.40.106.237",
                        "location" : "Cape Town, South Africa",
                        "network" : "HETZNER (Pty) Ltd (AS 37153)"
                      } ],
                      "pathId" : "4711301366345855606023718047703941305741293841502186803"
                    }, {
                      "hops" : [ {
                        "rdns" : "core-router1.cpt2.host-h.net",
                        "prefix" : "196.40.96.0/20",
                        "responseTime" : 1,
                        "hop" : 1,
                        "ipAddress" : "196.40.106.237",
                        "location" : "Cape Town, South Africa",
                        "network" : "HETZNER (Pty) Ltd (AS 37153)"
                      }, {
                        "rdns" : "core-router1.cpt2.host-h.net",
                        "prefix" : "196.40.96.0/20",
                        "responseTime" : 1,
                        "hop" : 1,
                        "ipAddress" : "196.40.106.237",
                        "location" : "Cape Town, South Africa",
                        "network" : "HETZNER (Pty) Ltd (AS 37153)"
                      } ],
                      "pathId" : "4711301366345855606023718047703941305741293841502186803"
                    } ],
                    "vpnPathTraces" : [ {
                      "hops" : [ {
                        "rdns" : "core-router1.cpt2.host-h.net",
                        "prefix" : "196.40.96.0/20",
                        "responseTime" : 1,
                        "hop" : 1,
                        "ipAddress" : "196.40.106.237",
                        "location" : "Cape Town, South Africa",
                        "network" : "HETZNER (Pty) Ltd (AS 37153)"
                      }, {
                        "rdns" : "core-router1.cpt2.host-h.net",
                        "prefix" : "196.40.96.0/20",
                        "responseTime" : 1,
                        "hop" : 1,
                        "ipAddress" : "196.40.106.237",
                        "location" : "Cape Town, South Africa",
                        "network" : "HETZNER (Pty) Ltd (AS 37153)"
                      } ],
                      "pathId" : "4711301366345855606023718047703941305741293841502186803"
                    }, {
                      "hops" : [ {
                        "rdns" : "core-router1.cpt2.host-h.net",
                        "prefix" : "196.40.96.0/20",
                        "responseTime" : 1,
                        "hop" : 1,
                        "ipAddress" : "196.40.106.237",
                        "location" : "Cape Town, South Africa",
                        "network" : "HETZNER (Pty) Ltd (AS 37153)"
                      }, {
                        "rdns" : "core-router1.cpt2.host-h.net",
                        "prefix" : "196.40.96.0/20",
                        "responseTime" : 1,
                        "hop" : 1,
                        "ipAddress" : "196.40.106.237",
                        "location" : "Cape Town, South Africa",
                        "network" : "HETZNER (Pty) Ltd (AS 37153)"
                      } ],
                      "pathId" : "4711301366345855606023718047703941305741293841502186803"
                    } ]
                  }, {
                    "pathTraces" : [ {
                      "hops" : [ {
                        "rdns" : "core-router1.cpt2.host-h.net",
                        "prefix" : "196.40.96.0/20",
                        "responseTime" : 1,
                        "hop" : 1,
                        "ipAddress" : "196.40.106.237",
                        "location" : "Cape Town, South Africa",
                        "network" : "HETZNER (Pty) Ltd (AS 37153)"
                      }, {
                        "rdns" : "core-router1.cpt2.host-h.net",
                        "prefix" : "196.40.96.0/20",
                        "responseTime" : 1,
                        "hop" : 1,
                        "ipAddress" : "196.40.106.237",
                        "location" : "Cape Town, South Africa",
                        "network" : "HETZNER (Pty) Ltd (AS 37153)"
                      } ],
                      "pathId" : "4711301366345855606023718047703941305741293841502186803"
                    }, {
                      "hops" : [ {
                        "rdns" : "core-router1.cpt2.host-h.net",
                        "prefix" : "196.40.96.0/20",
                        "responseTime" : 1,
                        "hop" : 1,
                        "ipAddress" : "196.40.106.237",
                        "location" : "Cape Town, South Africa",
                        "network" : "HETZNER (Pty) Ltd (AS 37153)"
                      }, {
                        "rdns" : "core-router1.cpt2.host-h.net",
                        "prefix" : "196.40.96.0/20",
                        "responseTime" : 1,
                        "hop" : 1,
                        "ipAddress" : "196.40.106.237",
                        "location" : "Cape Town, South Africa",
                        "network" : "HETZNER (Pty) Ltd (AS 37153)"
                      } ],
                      "pathId" : "4711301366345855606023718047703941305741293841502186803"
                    } ],
                    "vpnPathTraces" : [ {
                      "hops" : [ {
                        "rdns" : "core-router1.cpt2.host-h.net",
                        "prefix" : "196.40.96.0/20",
                        "responseTime" : 1,
                        "hop" : 1,
                        "ipAddress" : "196.40.106.237",
                        "location" : "Cape Town, South Africa",
                        "network" : "HETZNER (Pty) Ltd (AS 37153)"
                      }, {
                        "rdns" : "core-router1.cpt2.host-h.net",
                        "prefix" : "196.40.96.0/20",
                        "responseTime" : 1,
                        "hop" : 1,
                        "ipAddress" : "196.40.106.237",
                        "location" : "Cape Town, South Africa",
                        "network" : "HETZNER (Pty) Ltd (AS 37153)"
                      } ],
                      "pathId" : "4711301366345855606023718047703941305741293841502186803"
                    }, {
                      "hops" : [ {
                        "rdns" : "core-router1.cpt2.host-h.net",
                        "prefix" : "196.40.96.0/20",
                        "responseTime" : 1,
                        "hop" : 1,
                        "ipAddress" : "196.40.106.237",
                        "location" : "Cape Town, South Africa",
                        "network" : "HETZNER (Pty) Ltd (AS 37153)"
                      }, {
                        "rdns" : "core-router1.cpt2.host-h.net",
                        "prefix" : "196.40.96.0/20",
                        "responseTime" : 1,
                        "hop" : 1,
                        "ipAddress" : "196.40.106.237",
                        "location" : "Cape Town, South Africa",
                        "network" : "HETZNER (Pty) Ltd (AS 37153)"
                      } ],
                      "pathId" : "4711301366345855606023718047703941305741293841502186803"
                    } ]
                  } ]
                }
                                  """;
        GetTestResultPathvisAgentRound200Response mappedResponse = 
                mapper.readValue(responseBodyJson, GetTestResultPathvisAgentRound200Response.class);
        assertNotNull(mappedResponse);
    }
    
    /**
     * Retrieve network scheduled test results
     * <p>
     * Returns network metrics (loss, latency, and jitter) from each endpoint agent, for each roundId within the specified time window, as determined by search filters. If a time frame is provided, the rounds relevant to that time frame are returned, and the order is not predefined unless the user specifies a sort order in the filter. When no time frame is provided, the latest rounds are returned. 
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void postFetchTestResultMetricsRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {
        String requestBodyJson = """
                {
                  "searchSort" : [ {
                    "order" : "desc"
                  }, {
                    "order" : "desc"
                  } ],
                  "searchFilters" : {
                    "agentId" : [ "52455b09-ff1b-4849-8194-99026cc890e0", "52455b09-ff1b-4849-8194-99026cc890e0" ]
                  },
                  "thresholdFilter" : {
                    "filters" : [ {
                      "value" : 0.8008281904610115
                    }, {
                      "value" : 0.8008281904610115
                    } ]
                  }
                }
                                 """;
        TestsDataRoundsSearch mappedRequest = 
                mapper.readValue(requestBodyJson, TestsDataRoundsSearch.class);
        assertNotNull(mappedRequest);

        String responseBodyJson = """
                {
                  "test" : {
                    "type" : "agent-to-server"
                  },
                  "totalHits" : 12,
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
                    }
                  },
                  "results" : [ {
                    "loss" : 0.0,
                    "jitter" : 0.076808,
                    "isIcmpBlocked" : true,
                    "avgLatency" : 167.04,
                    "minLatency" : 167.0,
                    "maxLatency" : 168.0,
                    "errorDetails" : "Error"
                  }, {
                    "loss" : 0.0,
                    "jitter" : 0.076808,
                    "isIcmpBlocked" : true,
                    "avgLatency" : 167.04,
                    "minLatency" : 167.0,
                    "maxLatency" : 168.0,
                    "errorDetails" : "Error"
                  } ],
                  "startDate" : "2022-07-17T22:00:54Z"
                }
                                  """;
        PostFetchTestResultMetrics200Response mappedResponse = 
                mapper.readValue(responseBodyJson, PostFetchTestResultMetrics200Response.class);
        assertNotNull(mappedResponse);
    }
    
    /**
     * Retrieve network scheduled test results from multiple tests
     * <p>
     * Returns network metrics, including loss, latency, and jitter, for multiple test IDs obtained from each endpoint agent. It allows you to specify a time window using search filters to retrieve metrics for specific round IDs within that time frame. The default order of results is unspecified unless you include a sorting preference in the filter. When no time frame is provided, the API returns metrics for the most recent rounds. Access to all accounts associated with the specified test IDs is required to use this endpoint. 
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void postFetchTestResultMetricsMultiTestRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {
        String requestBodyJson = """
                {
                  "searchSort" : [ {
                    "order" : "desc"
                  }, {
                    "order" : "desc"
                  } ],
                  "searchFilters" : {
                    "agentId" : [ "52455b09-ff1b-4849-8194-99026cc890e0", "52455b09-ff1b-4849-8194-99026cc890e0" ],
                    "testId" : [ "5", "5" ]
                  },
                  "thresholdFilter" : {
                    "filters" : [ {
                      "value" : 0.8008281904610115
                    }, {
                      "value" : 0.8008281904610115
                    } ]
                  }
                }
                                 """;
        MultiTestIdTestsDataRoundsSearch mappedRequest = 
                mapper.readValue(requestBodyJson, MultiTestIdTestsDataRoundsSearch.class);
        assertNotNull(mappedRequest);

        String responseBodyJson = """
                {
                  "totalHits" : 12,
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
                    }
                  },
                  "results" : [ {
                    "loss" : 0.0,
                    "jitter" : 0.076808,
                    "isIcmpBlocked" : true,
                    "avgLatency" : 167.04,
                    "minLatency" : 167.0,
                    "maxLatency" : 168.0,
                    "errorDetails" : "Error"
                  }, {
                    "loss" : 0.0,
                    "jitter" : 0.076808,
                    "isIcmpBlocked" : true,
                    "avgLatency" : 167.04,
                    "minLatency" : 167.0,
                    "maxLatency" : 168.0,
                    "errorDetails" : "Error"
                  } ],
                  "startDate" : "2022-07-17T22:00:54Z"
                }
                                  """;
        PostFetchTestResultMetricsMultiTest200Response mappedResponse = 
                mapper.readValue(responseBodyJson, PostFetchTestResultMetricsMultiTest200Response.class);
        assertNotNull(mappedResponse);
    }
    
}
