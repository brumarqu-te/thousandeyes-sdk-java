/*
 * Dashboards API
 * Manage ThousandEyes Dashboards
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.dashboards.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import com.fasterxml.jackson.core.type.TypeReference;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.thousandeyes.api.serialization.JSON;
import com.thousandeyes.api.serialization.AbstractOpenApiSchema;

@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-18T12:55:02.220586+01:00[Europe/Lisbon]")
@JsonDeserialize(using = ApiMultiMetricColumnFiltersValueInner.ApiMultiMetricColumnFiltersValueInnerDeserializer.class)
@JsonSerialize(using = ApiMultiMetricColumnFiltersValueInner.ApiMultiMetricColumnFiltersValueInnerSerializer.class)
public class ApiMultiMetricColumnFiltersValueInner extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(ApiMultiMetricColumnFiltersValueInner.class.getName());

    public static class ApiMultiMetricColumnFiltersValueInnerSerializer extends StdSerializer<ApiMultiMetricColumnFiltersValueInner> {
        public ApiMultiMetricColumnFiltersValueInnerSerializer(Class<ApiMultiMetricColumnFiltersValueInner> t) {
            super(t);
        }

        public ApiMultiMetricColumnFiltersValueInnerSerializer() {
            this(null);
        }

        @Override
        public void serialize(ApiMultiMetricColumnFiltersValueInner value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class ApiMultiMetricColumnFiltersValueInnerDeserializer extends StdDeserializer<ApiMultiMetricColumnFiltersValueInner> {
        public ApiMultiMetricColumnFiltersValueInnerDeserializer() {
            this(ApiMultiMetricColumnFiltersValueInner.class);
        }

        public ApiMultiMetricColumnFiltersValueInnerDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public ApiMultiMetricColumnFiltersValueInner deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize Map<String, Object>
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (Map<String, Object>.class.equals(Integer.class) || Map<String, Object>.class.equals(Long.class) || Map<String, Object>.class.equals(Float.class) || Map<String, Object>.class.equals(Double.class) || Map<String, Object>.class.equals(Boolean.class) || Map<String, Object>.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((Map<String, Object>.class.equals(Integer.class) || Map<String, Object>.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((Map<String, Object>.class.equals(Float.class) || Map<String, Object>.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (Map<String, Object>.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (Map<String, Object>.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(Map<String, Object>.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'Map<String, Object>'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'Map<String, Object>'", e);
            }

            // deserialize String
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (String.class.equals(Integer.class) || String.class.equals(Long.class) || String.class.equals(Float.class) || String.class.equals(Double.class) || String.class.equals(Boolean.class) || String.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((String.class.equals(Integer.class) || String.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((String.class.equals(Float.class) || String.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (String.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (String.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(String.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'String'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'String'", e);
            }

            if (match == 1) {
                ApiMultiMetricColumnFiltersValueInner ret = new ApiMultiMetricColumnFiltersValueInner();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for ApiMultiMetricColumnFiltersValueInner: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public ApiMultiMetricColumnFiltersValueInner getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "ApiMultiMetricColumnFiltersValueInner cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<>();

    public ApiMultiMetricColumnFiltersValueInner() {
        super("oneOf", Boolean.FALSE);
    }

    public ApiMultiMetricColumnFiltersValueInner(Map<String, Object> o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ApiMultiMetricColumnFiltersValueInner(String o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("Map<String, Object>", Map<String, Object>.class);
        schemas.put("String", String.class);
        JSON.registerDescendants(ApiMultiMetricColumnFiltersValueInner.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return ApiMultiMetricColumnFiltersValueInner.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * Map<String, Object>, String
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(Map<String, Object>.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(String.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be Map<String, Object>, String");
    }

    /**
     * Get the actual instance, which can be the following:
     * Map<String, Object>, String
     *
     * @return The actual instance (Map<String, Object>, String)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `Map<String, Object>`. If the actual instance is not `Map<String, Object>`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Map<String, Object>`
     * @throws ClassCastException if the instance is not `Map<String, Object>`
     */
    public Map<String, Object> getMap<String, Object>() throws ClassCastException {
        return (Map<String, Object>)super.getActualInstance();
    }

    /**
     * Get the actual instance of `String`. If the actual instance is not `String`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `String`
     * @throws ClassCastException if the instance is not `String`
     */
    public String getString() throws ClassCastException {
        return (String)super.getActualInstance();
    }



}

