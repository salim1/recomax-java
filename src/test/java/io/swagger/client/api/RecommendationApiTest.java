/*
 * Recomax REST API
 * Recomax REST API
 *
 * OpenAPI spec version: 1.0.0
 * Contact: info@recomax.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.RecomResult;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RecommendationApi
 */
@Ignore
public class RecommendationApiTest {

    private final RecommendationApi api = new RecommendationApi();

    
    /**
     * Get Recommendations for items
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void queryItemUsingGETTest() throws ApiException {
        String apiKey = null;
        String id = null;
        Integer start = null;
        Integer pageSize = null;
        String sortField = null;
        String sortType = null;
        String token = null;
        String did = null;
        String user = null;
        List<String> fq = null;
        String event = null;
        String sb = null;
        String callback = null;
        String uidCookie = null;
        RecomResult response = api.queryItemUsingGET(apiKey, id, start, pageSize, sortField, sortType, token, did, user, fq, event, sb, callback, uidCookie);

        // TODO: test validations
    }
    
    /**
     * Get Recommendations for user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void recommendForUserUsingGETTest() throws ApiException {
        String apiKey = null;
        String id = null;
        RecomResult response = api.recommendForUserUsingGET(apiKey, id);

        // TODO: test validations
    }
    
}
