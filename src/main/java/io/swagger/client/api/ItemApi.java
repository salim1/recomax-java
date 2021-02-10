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

import io.swagger.client.model.Item;
import io.swagger.client.model.Attribute;
import io.swagger.client.model.Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2021-02-10T19:21:14.497+01:00")
public class ItemApi {
  private ApiClient apiClient;

  public ItemApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ItemApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Add item
   * 
   * @param apiKey apiKey (required)
   * @param id id (required)
   * @param attributeList attributeList (required)
   * @return Item
   * @throws ApiException if fails to make API call
   */
  public Item addItemAtUsingPUT(String apiKey, String id, List<Attribute> attributeList) throws ApiException {
    Object localVarPostBody = attributeList;
    
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling addItemAtUsingPUT");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling addItemAtUsingPUT");
    }
    
    // verify the required parameter 'attributeList' is set
    if (attributeList == null) {
      throw new ApiException(400, "Missing the required parameter 'attributeList' when calling addItemAtUsingPUT");
    }
    
    // create path and map variables
    String localVarPath = "/{apiKey}/items/{id}"
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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Item> localVarReturnType = new GenericType<Item>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Add item
   * 
   * @param apiKey apiKey (required)
   * @param attributeList attributeList (required)
   * @return Response
   * @throws ApiException if fails to make API call
   */
  public Response addItemUsingPOST(String apiKey, List<Attribute> attributeList) throws ApiException {
    Object localVarPostBody = attributeList;
    
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling addItemUsingPOST");
    }
    
    // verify the required parameter 'attributeList' is set
    if (attributeList == null) {
      throw new ApiException(400, "Missing the required parameter 'attributeList' when calling addItemUsingPOST");
    }
    
    // create path and map variables
    String localVarPath = "/{apiKey}/items"
      .replaceAll("\\{" + "apiKey" + "\\}", apiClient.escapeString(apiKey.toString()));

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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Response> localVarReturnType = new GenericType<Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete item
   * 
   * @param apiKey apiKey (required)
   * @param id id (required)
   * @return Item
   * @throws ApiException if fails to make API call
   */
  public Item deleteItemUsingDELETE(String apiKey, String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling deleteItemUsingDELETE");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteItemUsingDELETE");
    }
    
    // create path and map variables
    String localVarPath = "/{apiKey}/items/{id}"
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

    GenericType<Item> localVarReturnType = new GenericType<Item>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get item
   * 
   * @param apiKey apiKey (required)
   * @param id id (required)
   * @return Item
   * @throws ApiException if fails to make API call
   */
  public Item gettemUsingGET(String apiKey, String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling gettemUsingGET");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gettemUsingGET");
    }
    
    // create path and map variables
    String localVarPath = "/{apiKey}/items/{id}"
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

    GenericType<Item> localVarReturnType = new GenericType<Item>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List items
   * 
   * @param apiKey apiKey (required)
   * @param offset offsel of the items list (optional)
   * @param limit limit of the items list (optional)
   * @return List&lt;Item&gt;
   * @throws ApiException if fails to make API call
   */
  public List<Item> listtemUsingGET(String apiKey, Integer offset, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling listtemUsingGET");
    }
    
    // create path and map variables
    String localVarPath = "/{apiKey}/items"
      .replaceAll("\\{" + "apiKey" + "\\}", apiClient.escapeString(apiKey.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<Item>> localVarReturnType = new GenericType<List<Item>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update item
   * 
   * @param apiKey apiKey (required)
   * @param id id (required)
   * @param attributeList attributeList (required)
   * @return Response
   * @throws ApiException if fails to make API call
   */
  public Response updateItemUsingPOST(String apiKey, String id, List<Attribute> attributeList) throws ApiException {
    Object localVarPostBody = attributeList;
    
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling updateItemUsingPOST");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateItemUsingPOST");
    }
    
    // verify the required parameter 'attributeList' is set
    if (attributeList == null) {
      throw new ApiException(400, "Missing the required parameter 'attributeList' when calling updateItemUsingPOST");
    }
    
    // create path and map variables
    String localVarPath = "/{apiKey}/items/{id}"
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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Response> localVarReturnType = new GenericType<Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}