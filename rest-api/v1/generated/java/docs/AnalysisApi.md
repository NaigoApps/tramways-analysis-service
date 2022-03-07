# AnalysisApi

All URIs are relative to *http://localhost:8762/tramways/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteAnalysis**](AnalysisApi.md#deleteAnalysis) | **DELETE** /analysis/{analysisId} | Deletes an analysis
[**getAnalysis**](AnalysisApi.md#getAnalysis) | **GET** /analysis/{analysisId} | Gets an analysis
[**getAvailableAnalysis**](AnalysisApi.md#getAvailableAnalysis) | **GET** /analysis/available | Gets available analysis
[**getMapAnalysis**](AnalysisApi.md#getMapAnalysis) | **GET** /analysis/{projectId}/{mapId} | Gets project map analysis
[**launchAnalysis**](AnalysisApi.md#launchAnalysis) | **POST** /analysis/launch | Launch selected analysis
[**updateAnalysis**](AnalysisApi.md#updateAnalysis) | **PUT** /analysis/{analysisId} | Updates an analysis parameters


<a name="deleteAnalysis"></a>
# **deleteAnalysis**
> deleteAnalysis(analysisId)

Deletes an analysis

### Example
```java
// Import classes:
import it.tramways.analysis.api.ApiClient;
import it.tramways.analysis.api.ApiException;
import it.tramways.analysis.api.Configuration;
import it.tramways.analysis.api.auth.*;
import it.tramways.analysis.api.models.*;
import it.tramways.analysis.api.v1.AnalysisApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8762/tramways/rest");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AnalysisApi apiInstance = new AnalysisApi(defaultClient);
    String analysisId = "analysisId_example"; // String | 
    try {
      apiInstance.deleteAnalysis(analysisId);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysisApi#deleteAnalysis");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **analysisId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ok |  -  |

<a name="getAnalysis"></a>
# **getAnalysis**
> Analysis getAnalysis(analysisId)

Gets an analysis

### Example
```java
// Import classes:
import it.tramways.analysis.api.ApiClient;
import it.tramways.analysis.api.ApiException;
import it.tramways.analysis.api.Configuration;
import it.tramways.analysis.api.auth.*;
import it.tramways.analysis.api.models.*;
import it.tramways.analysis.api.v1.AnalysisApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8762/tramways/rest");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AnalysisApi apiInstance = new AnalysisApi(defaultClient);
    String analysisId = "analysisId_example"; // String | 
    try {
      Analysis result = apiInstance.getAnalysis(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysisApi#getAnalysis");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **analysisId** | **String**|  |

### Return type

[**Analysis**](Analysis.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ok |  -  |

<a name="getAvailableAnalysis"></a>
# **getAvailableAnalysis**
> List&lt;AnalysisType&gt; getAvailableAnalysis(projectId, mapId)

Gets available analysis

### Example
```java
// Import classes:
import it.tramways.analysis.api.ApiClient;
import it.tramways.analysis.api.ApiException;
import it.tramways.analysis.api.Configuration;
import it.tramways.analysis.api.auth.*;
import it.tramways.analysis.api.models.*;
import it.tramways.analysis.api.v1.AnalysisApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8762/tramways/rest");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AnalysisApi apiInstance = new AnalysisApi(defaultClient);
    String projectId = "projectId_example"; // String | 
    String mapId = "mapId_example"; // String | 
    try {
      List<AnalysisType> result = apiInstance.getAvailableAnalysis(projectId, mapId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysisApi#getAvailableAnalysis");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**|  |
 **mapId** | **String**|  |

### Return type

[**List&lt;AnalysisType&gt;**](AnalysisType.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ok |  -  |

<a name="getMapAnalysis"></a>
# **getMapAnalysis**
> List&lt;AnalysisDescription&gt; getMapAnalysis(projectId, mapId)

Gets project map analysis

### Example
```java
// Import classes:
import it.tramways.analysis.api.ApiClient;
import it.tramways.analysis.api.ApiException;
import it.tramways.analysis.api.Configuration;
import it.tramways.analysis.api.auth.*;
import it.tramways.analysis.api.models.*;
import it.tramways.analysis.api.v1.AnalysisApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8762/tramways/rest");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AnalysisApi apiInstance = new AnalysisApi(defaultClient);
    String projectId = "projectId_example"; // String | 
    String mapId = "mapId_example"; // String | 
    try {
      List<AnalysisDescription> result = apiInstance.getMapAnalysis(projectId, mapId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysisApi#getMapAnalysis");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**|  |
 **mapId** | **String**|  |

### Return type

[**List&lt;AnalysisDescription&gt;**](AnalysisDescription.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ok |  -  |

<a name="launchAnalysis"></a>
# **launchAnalysis**
> AnalysisDescription launchAnalysis(analysisRequest)

Launch selected analysis

### Example
```java
// Import classes:
import it.tramways.analysis.api.ApiClient;
import it.tramways.analysis.api.ApiException;
import it.tramways.analysis.api.Configuration;
import it.tramways.analysis.api.auth.*;
import it.tramways.analysis.api.models.*;
import it.tramways.analysis.api.v1.AnalysisApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8762/tramways/rest");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AnalysisApi apiInstance = new AnalysisApi(defaultClient);
    AnalysisRequest analysisRequest = new AnalysisRequest(); // AnalysisRequest | 
    try {
      AnalysisDescription result = apiInstance.launchAnalysis(analysisRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysisApi#launchAnalysis");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **analysisRequest** | [**AnalysisRequest**](AnalysisRequest.md)|  | [optional]

### Return type

[**AnalysisDescription**](AnalysisDescription.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ok |  -  |

<a name="updateAnalysis"></a>
# **updateAnalysis**
> Analysis updateAnalysis(analysisId, analysisUpdateRequest)

Updates an analysis parameters

### Example
```java
// Import classes:
import it.tramways.analysis.api.ApiClient;
import it.tramways.analysis.api.ApiException;
import it.tramways.analysis.api.Configuration;
import it.tramways.analysis.api.auth.*;
import it.tramways.analysis.api.models.*;
import it.tramways.analysis.api.v1.AnalysisApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8762/tramways/rest");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AnalysisApi apiInstance = new AnalysisApi(defaultClient);
    String analysisId = "analysisId_example"; // String | 
    AnalysisUpdateRequest analysisUpdateRequest = new AnalysisUpdateRequest(); // AnalysisUpdateRequest | 
    try {
      Analysis result = apiInstance.updateAnalysis(analysisId, analysisUpdateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysisApi#updateAnalysis");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **analysisId** | **String**|  |
 **analysisUpdateRequest** | [**AnalysisUpdateRequest**](AnalysisUpdateRequest.md)|  | [optional]

### Return type

[**Analysis**](Analysis.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ok |  -  |

