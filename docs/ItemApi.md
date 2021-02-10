# ItemApi

All URIs are relative to *https://convertein.com:8083/convertein/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addItemAtUsingPUT**](ItemApi.md#addItemAtUsingPUT) | **PUT** /{apiKey}/items/{id} | Add item
[**addItemUsingPOST**](ItemApi.md#addItemUsingPOST) | **POST** /{apiKey}/items | Add item
[**deleteItemUsingDELETE**](ItemApi.md#deleteItemUsingDELETE) | **DELETE** /{apiKey}/items/{id} | Delete item
[**gettemUsingGET**](ItemApi.md#gettemUsingGET) | **GET** /{apiKey}/items/{id} | Get item
[**listtemUsingGET**](ItemApi.md#listtemUsingGET) | **GET** /{apiKey}/items | List items
[**updateItemUsingPOST**](ItemApi.md#updateItemUsingPOST) | **POST** /{apiKey}/items/{id} | Update item


<a name="addItemAtUsingPUT"></a>
# **addItemAtUsingPUT**
> Item addItemAtUsingPUT(apiKey, id, attributeList)

Add item

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ItemApi;


ItemApi apiInstance = new ItemApi();
String apiKey = "apiKey_example"; // String | apiKey
String id = "id_example"; // String | id
List<Attribute> attributeList = Arrays.asList(new Attribute()); // List<Attribute> | attributeList
try {
    Item result = apiInstance.addItemAtUsingPUT(apiKey, id, attributeList);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#addItemAtUsingPUT");
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

[**Item**](Item.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addItemUsingPOST"></a>
# **addItemUsingPOST**
> Response addItemUsingPOST(apiKey, attributeList)

Add item

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ItemApi;


ItemApi apiInstance = new ItemApi();
String apiKey = "apiKey_example"; // String | apiKey
List<Attribute> attributeList = Arrays.asList(new Attribute()); // List<Attribute> | attributeList
try {
    Response result = apiInstance.addItemUsingPOST(apiKey, attributeList);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#addItemUsingPOST");
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

<a name="deleteItemUsingDELETE"></a>
# **deleteItemUsingDELETE**
> Item deleteItemUsingDELETE(apiKey, id)

Delete item

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ItemApi;


ItemApi apiInstance = new ItemApi();
String apiKey = "apiKey_example"; // String | apiKey
String id = "id_example"; // String | id
try {
    Item result = apiInstance.deleteItemUsingDELETE(apiKey, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#deleteItemUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**| apiKey |
 **id** | **String**| id |

### Return type

[**Item**](Item.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gettemUsingGET"></a>
# **gettemUsingGET**
> Item gettemUsingGET(apiKey, id)

Get item

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ItemApi;


ItemApi apiInstance = new ItemApi();
String apiKey = "apiKey_example"; // String | apiKey
String id = "id_example"; // String | id
try {
    Item result = apiInstance.gettemUsingGET(apiKey, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#gettemUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**| apiKey |
 **id** | **String**| id |

### Return type

[**Item**](Item.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listtemUsingGET"></a>
# **listtemUsingGET**
> List&lt;Item&gt; listtemUsingGET(apiKey, offset, limit)

List items

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ItemApi;


ItemApi apiInstance = new ItemApi();
String apiKey = "apiKey_example"; // String | apiKey
Integer offset = 56; // Integer | offsel of the items list
Integer limit = 56; // Integer | limit of the items list
try {
    List<Item> result = apiInstance.listtemUsingGET(apiKey, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#listtemUsingGET");
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

[**List&lt;Item&gt;**](Item.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateItemUsingPOST"></a>
# **updateItemUsingPOST**
> Response updateItemUsingPOST(apiKey, id, attributeList)

Update item

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ItemApi;


ItemApi apiInstance = new ItemApi();
String apiKey = "apiKey_example"; // String | apiKey
String id = "id_example"; // String | id
List<Attribute> attributeList = Arrays.asList(new Attribute()); // List<Attribute> | attributeList
try {
    Response result = apiInstance.updateItemUsingPOST(apiKey, id, attributeList);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#updateItemUsingPOST");
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

