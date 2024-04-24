/*
 * Instant Tests API
 * The Instant Tests API endpoint lets you create and run new instant tests. You will need to be a regular user or have the following permissions:   * `API Access`   * `View tests`  The response does not include the immediate test results. Use the Test Results endpoints to get test results after creating and executing an instant test. You can find the URLs for these endpoints in the _links section of the test definition that is returned when you create the instant test. 
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.tests.instant;

import com.thousandeyes.api.tests.instant.model.DnsServerInstantTest;
import com.thousandeyes.api.tests.instant.model.DnsServerInstantTestRequest;
import com.thousandeyes.api.tests.instant.model.Error;
import com.thousandeyes.api.tests.instant.model.Expand;
import java.net.URI;
import com.thousandeyes.api.tests.instant.model.UnauthorizedError;
import com.thousandeyes.api.tests.instant.model.ValidationError;
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
 * Request and Response model deserialization tests for DnsServerApi
 */
public class DnsServerApiTest {
    // private final DnsServerApi api = new DnsServerApi();
    private final ObjectMapper mapper = getDefault()
            .getMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
    
    /**
     * Create DNS server instant test
     * <p>
     * Creates and runs a new DNS server instant test.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void postInstantDnsServerRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {
        String requestBodyJson = """
                {
                  "sharedWithAccounts" : [ "1234", "12345" ],
                  "dnsServers" : [ "dns-example.net", "8.8.8.8" ],
                  "labels" : [ "9842", "1283" ],
                  "agents" : [ {
                    "agentId" : "125",
                    "sourceIpAddress" : "1.1.1.1"
                  }, {
                    "agentId" : "125",
                    "sourceIpAddress" : "1.1.1.1"
                  } ]
                }
                                 """;
        DnsServerInstantTestRequest mappedRequest = 
                mapper.readValue(requestBodyJson, DnsServerInstantTestRequest.class);
        assertNotNull(mappedRequest);

        String responseBodyJson = """
                {
                  "numPathTraces" : 1,
                  "mtuMeasurements" : false,
                  "bandwidthMeasurements" : true,
                  "networkMeasurements" : true,
                  "type" : "dns-server",
                  "fixedPacketRate" : 50,
                  "domain" : "www.thousandeyes.com",
                  "dnsServers" : [ {
                    "serverName" : "dns-example.net",
                    "serverId" : "1447"
                  }, {
                    "serverName" : "dns-example.net",
                    "serverId" : "1447"
                  } ],
                  "recursiveQueries" : true
                }
                                  """;
        DnsServerInstantTest mappedResponse = 
                mapper.readValue(responseBodyJson, DnsServerInstantTest.class);
        assertNotNull(mappedResponse);
    }
    
}
