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

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.model.*;
import io.swagger.client.Pair;

import io.swagger.client.model.RecomResult;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2021-02-10T19:21:14.497+01:00")
public class RecommendationApi {
  private ApiClient apiClient;

  public RecommendationApi() {
    this(Configuration.getDefaultApiClient());
  }

  public RecommendationApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get Recommendations for items
   * 
   * @param apiKey apiKey (required)
   * @param id id (required)
   * @param start start (optional, default to 0)
   * @param pageSize pageSize (optional, default to 10)
   * @param sortField sortField (optional)
   * @param sortType sortType (optional, default to asc)
   * @param token token (optional)
   * @param did did (optional)
   * @param user user (optional)
   * @param fq fq (optional)
   * @param event event (optional, default to ON_QUERY)
   * @param sb sb (optional, default to false)
   * @param callback callback (optional)
   * @param uidCookie uidCookie (optional)
   * @return RecomResult
   * @throws ApiException if fails to make API call
   */
  public RecomResult queryItemUsingGET(String apiKey, String id, Integer start, Integer pageSize, String sortField, String sortType, String token, String did, String user, List<String> fq, String event, String sb, String callback, String uidCookie) throws ApiException {
    Object localVarPostBody = uidCookie;
    
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling queryItemUsingGET");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling queryItemUsingGET");
    }
    
    // create path and map variables
    String localVarPath = "/{apiKey}/recommendations/items/{id}"
      .replaceAll("\\{" + "apiKey" + "\\}", apiClient.escapeString(apiKey.toString()))
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("start", start));
    localVarQueryParams.addAll(apiClient.parameterToPair("pageSize", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPair("sortField", sortField));
    localVarQueryParams.addAll(apiClient.parameterToPair("sortType", sortType));
    localVarQueryParams.addAll(apiClient.parameterToPair("token", token));
    localVarQueryParams.addAll(apiClient.parameterToPair("did", did));
    localVarQueryParams.addAll(apiClient.parameterToPair("user", user));
    localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "fq", fq));
    localVarQueryParams.addAll(apiClient.parameterToPair("event", event));
    localVarQueryParams.addAll(apiClient.parameterToPair("sb", sb));
    localVarQueryParams.addAll(apiClient.parameterToPair("callback", callback));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<RecomResult> localVarReturnType = new GenericType<RecomResult>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get Recommendations for user
   * 
   * @param apiKey apiKey (required)
   * @param id id (required)
   * @return RecomResult
   * @throws ApiException if fails to make API call
   */
  public RecomResult recommendForUserUsingGET(String apiKey, String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling recommendForUserUsingGET");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling recommendForUserUsingGET");
    }
    
    // create path and map variables
    String localVarPath = "/{apiKey}/recommendations/users/{id}"
      .replaceAll("\\{" + "apiKey" + "\\}", apiClient.escapeString(apiKey.toString()))
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<RecomResult> localVarReturnType = new GenericType<RecomResult>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}