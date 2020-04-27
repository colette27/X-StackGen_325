# CsatApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete**](CsatApi.md#delete) | **DELETE** Csat/{param} | Delete an existing Csat from the system
[**insert**](CsatApi.md#insert) | **POST** Csat/{param} | Insert a new Csat into the system
[**list**](CsatApi.md#list) | **GET** Csat/list/{searchparam} | Fetch a set of Csats from the system
[**load**](CsatApi.md#load) | **GET** Csat/{param} | Load an existing Csat from the system
[**update**](CsatApi.md#update) | **PUT** Csat/{param} | Update an existing Csat


<a name="delete"></a>
# **delete**
> Void delete(param)

Delete an existing Csat from the system

Starter StackGen Auto Generated Csat:delete

### Example
```java
// Import classes:
//import io.starter.happypath.invoker.ApiException;
//import io.starter.happypath.api.CsatApi;


CsatApi apiInstance = new CsatApi();
Integer param = 56; // Integer | Retrieve a single result by ID
try {
    Void result = apiInstance.delete(param);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CsatApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **param** | **Integer**| Retrieve a single result by ID |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="insert"></a>
# **insert**
> Csat insert(param)

Insert a new Csat into the system

Starter StackGen Auto Generated Csat:insert

### Example
```java
// Import classes:
//import io.starter.happypath.invoker.ApiException;
//import io.starter.happypath.api.CsatApi;


CsatApi apiInstance = new CsatApi();
Csat param = new Csat(); // Csat | Updated JSON data
try {
    Csat result = apiInstance.insert(param);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CsatApi#insert");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **param** | [**Csat**](Csat.md)| Updated JSON data |

### Return type

[**Csat**](Csat.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="list"></a>
# **list**
> Object list(searchparam)

Fetch a set of Csats from the system

Starter StackGen Auto Generated Listing

### Example
```java
// Import classes:
//import io.starter.happypath.invoker.ApiException;
//import io.starter.happypath.api.CsatApi;


CsatApi apiInstance = new CsatApi();
String searchparam = "searchparam_example"; // String | Search example: JSON
try {
    Object result = apiInstance.list(searchparam);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CsatApi#list");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchparam** | **String**| Search example: JSON |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="load"></a>
# **load**
> Object load(param)

Load an existing Csat from the system

Starter StackGen Auto Generated Csat:load

### Example
```java
// Import classes:
//import io.starter.happypath.invoker.ApiException;
//import io.starter.happypath.api.CsatApi;


CsatApi apiInstance = new CsatApi();
Integer param = 56; // Integer | Retrieve a single result by ID
try {
    Object result = apiInstance.load(param);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CsatApi#load");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **param** | **Integer**| Retrieve a single result by ID |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="update"></a>
# **update**
> Object update(param, param2)

Update an existing Csat

Starter StackGen Auto Generated Csat:update

### Example
```java
// Import classes:
//import io.starter.happypath.invoker.ApiException;
//import io.starter.happypath.api.CsatApi;


CsatApi apiInstance = new CsatApi();
Integer param = 56; // Integer | Retrieve a single result by ID
Csat param2 = new Csat(); // Csat | Updated JSON data
try {
    Object result = apiInstance.update(param, param2);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CsatApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **param** | **Integer**| Retrieve a single result by ID |
 **param2** | [**Csat**](Csat.md)| Updated JSON data |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

