# EventApi

All URIs are relative to *https://convertein.com:8083/convertein/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createEventTestUsingPOST**](EventApi.md#createEventTestUsingPOST) | **POST** /{apiKey}/events | Get Event List
[**createEventUsingPUT**](EventApi.md#createEventUsingPUT) | **PUT** /{apiKey}/event/{id} | Create event


<a name="createEventTestUsingPOST"></a>
# **createEventTestUsingPOST**
> ResponseEntity createEventTestUsingPOST(apiKey, itemId, userId, name)

Get Event List

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EventApi;


EventApi apiInstance = new EventApi();
String apiKey = "apiKey_example"; // String | apiKey
String itemId = "itemId_example"; // String | itemId
String userId = "userId_example"; // String | userId
String name = "name_example"; // String | name
try {
    ResponseEntity result = apiInstance.createEventTestUsingPOST(apiKey, itemId, userId, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventApi#createEventTestUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**| apiKey |
 **itemId** | **String**| itemId |
 **userId** | **String**| userId |
 **name** | **String**| name |

### Return type

[**ResponseEntity**](ResponseEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createEventUsingPUT"></a>
# **createEventUsingPUT**
> ResponseEntity createEventUsingPUT(apiKey, id, itemId, userId, name)

Create event

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EventApi;


EventApi apiInstance = new EventApi();
String apiKey = "apiKey_example"; // String | apiKey
String id = "id_example"; // String | id
String itemId = "itemId_example"; // String | itemId
String userId = "userId_example"; // String | userId
String name = "VIEW"; // String | name
try {
    ResponseEntity result = apiInstance.createEventUsingPUT(apiKey, id, itemId, userId, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventApi#createEventUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**| apiKey |
 **id** | **String**| id |
 **itemId** | **String**| itemId | [optional]
 **userId** | **String**| userId | [optional]
 **name** | **String**| name | [optional] [default to VIEW]

### Return type

[**ResponseEntity**](ResponseEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

