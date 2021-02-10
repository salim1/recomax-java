# RecommendationApi

All URIs are relative to *https://convertein.com:8083/convertein/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**queryItemUsingGET**](RecommendationApi.md#queryItemUsingGET) | **GET** /{apiKey}/recommendations/items/{id} | Get Recommendations for items
[**recommendForUserUsingGET**](RecommendationApi.md#recommendForUserUsingGET) | **GET** /{apiKey}/recommendations/users/{id} | Get Recommendations for user


<a name="queryItemUsingGET"></a>
# **queryItemUsingGET**
> RecomResult queryItemUsingGET(apiKey, id, start, pageSize, sortField, sortType, token, did, user, fq, event, sb, callback, uidCookie)

Get Recommendations for items

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RecommendationApi;


RecommendationApi apiInstance = new RecommendationApi();
String apiKey = "apiKey_example"; // String | apiKey
String id = "id_example"; // String | id
Integer start = 0; // Integer | start
Integer pageSize = 10; // Integer | pageSize
String sortField = "sortField_example"; // String | sortField
String sortType = "asc"; // String | sortType
String token = "token_example"; // String | token
String did = "did_example"; // String | did
String user = "user_example"; // String | user
List<String> fq = Arrays.asList("fq_example"); // List<String> | fq
String event = "ON_QUERY"; // String | event
String sb = "false"; // String | sb
String callback = "callback_example"; // String | callback
String uidCookie = "uidCookie_example"; // String | uidCookie
try {
    RecomResult result = apiInstance.queryItemUsingGET(apiKey, id, start, pageSize, sortField, sortType, token, did, user, fq, event, sb, callback, uidCookie);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecommendationApi#queryItemUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**| apiKey |
 **id** | **String**| id |
 **start** | **Integer**| start | [optional] [default to 0]
 **pageSize** | **Integer**| pageSize | [optional] [default to 10]
 **sortField** | **String**| sortField | [optional]
 **sortType** | **String**| sortType | [optional] [default to asc]
 **token** | **String**| token | [optional]
 **did** | **String**| did | [optional]
 **user** | **String**| user | [optional]
 **fq** | [**List&lt;String&gt;**](String.md)| fq | [optional]
 **event** | **String**| event | [optional] [default to ON_QUERY]
 **sb** | **String**| sb | [optional] [default to false]
 **callback** | **String**| callback | [optional]
 **uidCookie** | **String**| uidCookie | [optional]

### Return type

[**RecomResult**](RecomResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="recommendForUserUsingGET"></a>
# **recommendForUserUsingGET**
> RecomResult recommendForUserUsingGET(apiKey, id)

Get Recommendations for user

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RecommendationApi;


RecommendationApi apiInstance = new RecommendationApi();
String apiKey = "apiKey_example"; // String | apiKey
String id = "id_example"; // String | id
try {
    RecomResult result = apiInstance.recommendForUserUsingGET(apiKey, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecommendationApi#recommendForUserUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**| apiKey |
 **id** | **String**| id |

### Return type

[**RecomResult**](RecomResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

