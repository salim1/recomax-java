# UserApi

All URIs are relative to *https://convertein.com:8083/convertein/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addUserUsingPOST**](UserApi.md#addUserUsingPOST) | **POST** /{apiKey}/users | Add User
[**addUserUsingPUT**](UserApi.md#addUserUsingPUT) | **PUT** /{apiKey}/users/{id} | Add User
[**deleteUserUsingDELETE**](UserApi.md#deleteUserUsingDELETE) | **DELETE** /{apiKey}/users/{id} | Delete User
[**getSegmentsUsingGET**](UserApi.md#getSegmentsUsingGET) | **GET** /{apiKey}/uses/{id}/segments | Get User List
[**getUserUsingGET**](UserApi.md#getUserUsingGET) | **GET** /{apiKey}/users/{id} | Get User
[**listUsersUsingGET**](UserApi.md#listUsersUsingGET) | **GET** /{apiKey}/users | List Users
[**updateUserUsingPOST**](UserApi.md#updateUserUsingPOST) | **POST** /{apiKey}/users/{id} | User item


<a name="addUserUsingPOST"></a>
# **addUserUsingPOST**
> Response addUserUsingPOST(apiKey, attributeList)

Add User

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
String apiKey = "apiKey_example"; // String | apiKey
List<Attribute> attributeList = Arrays.asList(new Attribute()); // List<Attribute> | attributeList
try {
    Response result = apiInstance.addUserUsingPOST(apiKey, attributeList);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#addUserUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**| apiKey |
 **attributeList** | [**List&lt;Attribute&gt;**](Attribute.md)| attributeList |

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addUserUsingPUT"></a>
# **addUserUsingPUT**
> User addUserUsingPUT(apiKey, id, attributeList)

Add User

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
String apiKey = "apiKey_example"; // String | apiKey
String id = "id_example"; // String | id
List<Attribute> attributeList = Arrays.asList(new Attribute()); // List<Attribute> | attributeList
try {
    User result = apiInstance.addUserUsingPUT(apiKey, id, attributeList);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#addUserUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**| apiKey |
 **id** | **String**| id |
 **attributeList** | [**List&lt;Attribute&gt;**](Attribute.md)| attributeList |

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteUserUsingDELETE"></a>
# **deleteUserUsingDELETE**
> User deleteUserUsingDELETE(apiKey, id)

Delete User

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
String apiKey = "apiKey_example"; // String | apiKey
String id = "id_example"; // String | id
try {
    User result = apiInstance.deleteUserUsingDELETE(apiKey, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#deleteUserUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**| apiKey |
 **id** | **String**| id |

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSegmentsUsingGET"></a>
# **getSegmentsUsingGET**
> List&lt;String&gt; getSegmentsUsingGET(apiKey, id)

Get User List

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
String apiKey = "apiKey_example"; // String | apiKey
String id = "id_example"; // String | id
try {
    List<String> result = apiInstance.getSegmentsUsingGET(apiKey, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getSegmentsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**| apiKey |
 **id** | **String**| id |

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUserUsingGET"></a>
# **getUserUsingGET**
> User getUserUsingGET(apiKey, id)

Get User

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
String apiKey = "apiKey_example"; // String | apiKey
String id = "id_example"; // String | id
try {
    User result = apiInstance.getUserUsingGET(apiKey, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getUserUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**| apiKey |
 **id** | **String**| id |

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listUsersUsingGET"></a>
# **listUsersUsingGET**
> List&lt;User&gt; listUsersUsingGET(apiKey, offset, limit)

List Users

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
String apiKey = "apiKey_example"; // String | apiKey
Integer offset = 56; // Integer | offsel of the items list
Integer limit = 56; // Integer | limit of the items list
try {
    List<User> result = apiInstance.listUsersUsingGET(apiKey, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#listUsersUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**| apiKey |
 **offset** | **Integer**| offsel of the items list | [optional]
 **limit** | **Integer**| limit of the items list | [optional]

### Return type

[**List&lt;User&gt;**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateUserUsingPOST"></a>
# **updateUserUsingPOST**
> Response updateUserUsingPOST(apiKey, id, attributeList)

User item

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
String apiKey = "apiKey_example"; // String | apiKey
String id = "id_example"; // String | id
List<Attribute> attributeList = Arrays.asList(new Attribute()); // List<Attribute> | attributeList
try {
    Response result = apiInstance.updateUserUsingPOST(apiKey, id, attributeList);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#updateUserUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**| apiKey |
 **id** | **String**| id |
 **attributeList** | [**List&lt;Attribute&gt;**](Attribute.md)| attributeList |

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

