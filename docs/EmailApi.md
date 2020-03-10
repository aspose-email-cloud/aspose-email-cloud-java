# com.aspose.email.cloud.sdk.api.EmailApi

<a name="addCalendarAttachment"></a>
## **addCalendarAttachment**
> void addCalendarAttachment(AddCalendarAttachmentRequestData request)

Adds an attachment to iCalendar file             

### **AddCalendarAttachmentRequestData** Parameters
```java
public AddCalendarAttachmentRequestData(
    String name, 
    String attachment, 
    AddAttachmentRequest request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Calendar file name in storage |
 **attachment** | **String**| Attachment file name in storage |
 **request** | [**AddAttachmentRequest**](AddAttachmentRequest.md)| Storage name and folder path for calendar and attachment files |

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="addContactAttachment"></a>
## **addContactAttachment**
> void addContactAttachment(AddContactAttachmentRequestData request)

Add attachment to contact document             

### **AddContactAttachmentRequestData** Parameters
```java
public AddContactAttachmentRequestData(
    String format, 
    String name, 
    String attachment, 
    AddAttachmentRequest request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**| Contact document format Enum, available values: VCard, WebDav, Msg |
 **name** | **String**| Contact document file name |
 **attachment** | **String**| Attachment name |
 **request** | [**AddAttachmentRequest**](AddAttachmentRequest.md)| Add attachment request |

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="addEmailAttachment"></a>
## **addEmailAttachment**
> [EmailDocumentResponse](EmailDocumentResponse.md) addEmailAttachment(AddEmailAttachmentRequestData request)

Adds an attachment to Email document             

### **AddEmailAttachmentRequestData** Parameters
```java
public AddEmailAttachmentRequestData(
    String attachmentName, 
    String fileName, 
    AddAttachmentRequest request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attachmentName** | **String**| Attachment file name |
 **fileName** | **String**| Email document file name |
 **request** | [**AddAttachmentRequest**](AddAttachmentRequest.md)| Storage info to specify location of email document and attachment files |

### Return type

[**EmailDocumentResponse**](EmailDocumentResponse.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="addMapiAttachment"></a>
## **addMapiAttachment**
> void addMapiAttachment(AddMapiAttachmentRequestData request)

Add attachment to document             

### **AddMapiAttachmentRequestData** Parameters
```java
public AddMapiAttachmentRequestData(
    String name, 
    String attachment, 
    AddAttachmentRequest request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document file name |
 **attachment** | **String**| Attachment file name |
 **request** | [**AddAttachmentRequest**](AddAttachmentRequest.md)| Add attachment request |

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="aiBcrOcr"></a>
## **aiBcrOcr**
> [ListResponseOfAiBcrOcrData](ListResponseOfAiBcrOcrData.md) aiBcrOcr(AiBcrOcrRequestData request)

Ocr images             

### **AiBcrOcrRequestData** Parameters
```java
public AiBcrOcrRequestData(
    AiBcrBase64Rq rq)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rq** | [**AiBcrBase64Rq**](AiBcrBase64Rq.md)| Request with base64 images data |

### Return type

[**ListResponseOfAiBcrOcrData**](ListResponseOfAiBcrOcrData.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="aiBcrOcrStorage"></a>
## **aiBcrOcrStorage**
> [ListResponseOfAiBcrOcrData](ListResponseOfAiBcrOcrData.md) aiBcrOcrStorage(AiBcrOcrStorageRequestData request)

Ocr images from storage             

### **AiBcrOcrStorageRequestData** Parameters
```java
public AiBcrOcrStorageRequestData(
    AiBcrStorageImageRq rq)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rq** | [**AiBcrStorageImageRq**](AiBcrStorageImageRq.md)| Request with images located on storage |

### Return type

[**ListResponseOfAiBcrOcrData**](ListResponseOfAiBcrOcrData.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="aiBcrParse"></a>
## **aiBcrParse**
> [ListResponseOfHierarchicalObject](ListResponseOfHierarchicalObject.md) aiBcrParse(AiBcrParseRequestData request)

Parse images to vCard properties             

### **AiBcrParseRequestData** Parameters
```java
public AiBcrParseRequestData(
    AiBcrBase64Rq rq)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rq** | [**AiBcrBase64Rq**](AiBcrBase64Rq.md)| Request with base64 images data |

### Return type

[**ListResponseOfHierarchicalObject**](ListResponseOfHierarchicalObject.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="aiBcrParseModel"></a>
## **aiBcrParseModel**
> [ListResponseOfContactDto](ListResponseOfContactDto.md) aiBcrParseModel(AiBcrParseModelRequestData request)

Parse images to vCard document models             

### **AiBcrParseModelRequestData** Parameters
```java
public AiBcrParseModelRequestData(
    AiBcrBase64Rq rq)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rq** | [**AiBcrBase64Rq**](AiBcrBase64Rq.md)| Request with base64 images data |

### Return type

[**ListResponseOfContactDto**](ListResponseOfContactDto.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="aiBcrParseOcrDataModel"></a>
## **aiBcrParseOcrDataModel**
> [ListResponseOfContactDto](ListResponseOfContactDto.md) aiBcrParseOcrDataModel(AiBcrParseOcrDataModelRequestData request)

Parse OCR data to vCard document models             

### **AiBcrParseOcrDataModelRequestData** Parameters
```java
public AiBcrParseOcrDataModelRequestData(
    AiBcrParseOcrDataRq rq)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rq** | [**AiBcrParseOcrDataRq**](AiBcrParseOcrDataRq.md)|  |

### Return type

[**ListResponseOfContactDto**](ListResponseOfContactDto.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="aiBcrParseStorage"></a>
## **aiBcrParseStorage**
> [ListResponseOfStorageFileLocation](ListResponseOfStorageFileLocation.md) aiBcrParseStorage(AiBcrParseStorageRequestData request)

Parse images from storage to vCard files             

### **AiBcrParseStorageRequestData** Parameters
```java
public AiBcrParseStorageRequestData(
    AiBcrParseStorageRq rq)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rq** | [**AiBcrParseStorageRq**](AiBcrParseStorageRq.md)| Request with images located on storage |

### Return type

[**ListResponseOfStorageFileLocation**](ListResponseOfStorageFileLocation.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="aiNameComplete"></a>
## **aiNameComplete**
> [AiNameWeightedVariants](AiNameWeightedVariants.md) aiNameComplete(AiNameCompleteRequestData request)

The call proposes k most probable names for given starting characters             

### **AiNameCompleteRequestData** Parameters
```java
public AiNameCompleteRequestData(
    String name, 
    String language, 
    String location, 
    String encoding, 
    String script, 
    String style)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| A name to complete (required) |
 **language** | **String**| An ISO-639 code of the language; either 639-1 or 639-3 (e.g. \&quot;it\&quot; or \&quot;ita\&quot; for Italian)              | [optional] [default to ]
 **location** | **String**| A geographic code such as an ISO-3166 two letter country code, for example \&quot;FR\&quot; for France              | [optional] [default to ]
 **encoding** | **String**| A character encoding name | [optional] [default to ]
 **script** | **String**| A writing system code; starts with the ISO-15924 script name | [optional] [default to ]
 **style** | **String**| Name writing style. Enum, available values: Formal, Informal, Legal, Academic | [optional] [default to 0]

### Return type

[**AiNameWeightedVariants**](AiNameWeightedVariants.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="aiNameExpand"></a>
## **aiNameExpand**
> [AiNameWeightedVariants](AiNameWeightedVariants.md) aiNameExpand(AiNameExpandRequestData request)

Expands a person&#39;s name into a list of possible alternatives using options for expanding instructions             

### **AiNameExpandRequestData** Parameters
```java
public AiNameExpandRequestData(
    String name, 
    String language, 
    String location, 
    String encoding, 
    String script, 
    String style)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| A name to format (required) |
 **language** | **String**| An ISO-639 code of the language; either 639-1 or 639-3 (e.g. \&quot;it\&quot; or \&quot;ita\&quot; for Italian)              | [optional] [default to ]
 **location** | **String**| A geographic code such as an ISO-3166 two letter country code, for example \&quot;FR\&quot; for France              | [optional] [default to ]
 **encoding** | **String**| A character encoding name | [optional] [default to ]
 **script** | **String**| A writing system code; starts with the ISO-15924 script name | [optional] [default to ]
 **style** | **String**| Name writing style. Enum, available values: Formal, Informal, Legal, Academic | [optional] [default to 0]

### Return type

[**AiNameWeightedVariants**](AiNameWeightedVariants.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="aiNameExpandParsed"></a>
## **aiNameExpandParsed**
> [AiNameWeightedVariants](AiNameWeightedVariants.md) aiNameExpandParsed(AiNameExpandParsedRequestData request)

Expands a person&#39;s parsed name into a list of possible alternatives using options for expanding instructions             

### **AiNameExpandParsedRequestData** Parameters
```java
public AiNameExpandParsedRequestData(
    AiNameParsedRq rq)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rq** | [**AiNameParsedRq**](AiNameParsedRq.md)| Parsed name with options |

### Return type

[**AiNameWeightedVariants**](AiNameWeightedVariants.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="aiNameFormat"></a>
## **aiNameFormat**
> [AiNameFormatted](AiNameFormatted.md) aiNameFormat(AiNameFormatRequestData request)

Formats a person&#39;s name in correct case and name order using options for formatting instructions             

### **AiNameFormatRequestData** Parameters
```java
public AiNameFormatRequestData(
    String name, 
    String language, 
    String location, 
    String encoding, 
    String script, 
    String format, 
    String style)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| A name to format (required) |
 **language** | **String**| An ISO-639 code of the language; either 639-1 or 639-3 (e.g. \&quot;it\&quot; or \&quot;ita\&quot; for Italian)              | [optional] [default to ]
 **location** | **String**| A geographic code such as an ISO-3166 two letter country code, for example \&quot;FR\&quot; for France              | [optional] [default to ]
 **encoding** | **String**| A character encoding name | [optional] [default to ]
 **script** | **String**| A writing system code; starts with the ISO-15924 script name | [optional] [default to ]
 **format** | **String**| Format of the name. Predefined format can be used by ID, or custom format can be specified. Predefined formats:      /format/default/ (&#x3D; &#39;%t%F%m%N%L%p&#39;)     /format/FN+LN/ (&#x3D; &#39;%F%L&#39;)     /format/title+FN+LN/ (&#x3D; &#39;%t%F%L&#39;)     /format/FN+MN+LN/ (&#x3D; &#39;%F%M%N%L&#39;)     /format/title+FN+MN+LN/ (&#x3D; &#39;%t%F%M%N%L&#39;)     /format/FN+MI+LN/ (&#x3D; &#39;%F%m%N%L&#39;)     /format/title+FN+MI+LN/ (&#x3D; &#39;%t%F%m%N%L&#39;)     /format/LN/ (&#x3D; &#39;%L&#39;)     /format/title+LN/ (&#x3D; &#39;%t%L&#39;)     /format/LN+FN+MN/ (&#x3D; &#39;%L,%F%M%N&#39;)     /format/LN+title+FN+MN/ (&#x3D; &#39;%L,%t%F%M%N&#39;)     /format/LN+FN+MI/ (&#x3D; &#39;%L,%F%m%N&#39;)     /format/LN+title+FN+MI/ (&#x3D; &#39;%L,%t%F%m%N&#39;)  Custom format string - custom combination of characters and the next term placeholders:      &#39;%t&#39; - Title (prefix)     &#39;%F&#39; - First name     &#39;%f&#39; - First initial     &#39;%M&#39; - Middle name(s)     &#39;%m&#39; - Middle initial(s)     &#39;%N&#39; - Nickname     &#39;%L&#39; - Last name     &#39;%l&#39; - Last initial     &#39;%p&#39; - Postfix  If no value for format option was provided, its default value is &#39;%t%F%m%N%L%p&#39;              | [optional] [default to ]
 **style** | **String**| Name writing style. Enum, available values: Formal, Informal, Legal, Academic | [optional] [default to 0]

### Return type

[**AiNameFormatted**](AiNameFormatted.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="aiNameFormatParsed"></a>
## **aiNameFormatParsed**
> [AiNameFormatted](AiNameFormatted.md) aiNameFormatParsed(AiNameFormatParsedRequestData request)

Formats a person&#39;s parsed name in correct case and name order using options for formatting instructions             

### **AiNameFormatParsedRequestData** Parameters
```java
public AiNameFormatParsedRequestData(
    AiNameParsedRq rq)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rq** | [**AiNameParsedRq**](AiNameParsedRq.md)| Parsed name with options |

### Return type

[**AiNameFormatted**](AiNameFormatted.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="aiNameGenderize"></a>
## **aiNameGenderize**
> [ListResponseOfAiNameGenderHypothesis](ListResponseOfAiNameGenderHypothesis.md) aiNameGenderize(AiNameGenderizeRequestData request)

Detect person&#39;s gender from name string             

### **AiNameGenderizeRequestData** Parameters
```java
public AiNameGenderizeRequestData(
    String name, 
    String language, 
    String location, 
    String encoding, 
    String script, 
    String style)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| A name to parse (required) |
 **language** | **String**| An ISO-639 code of the language; either 639-1 or 639-3 (e.g. \&quot;it\&quot; or \&quot;ita\&quot; for Italian)              | [optional] [default to ]
 **location** | **String**| A geographic code such as an ISO-3166 two letter country code, for example \&quot;FR\&quot; for France              | [optional] [default to ]
 **encoding** | **String**| A character encoding name | [optional] [default to ]
 **script** | **String**| A writing system code; starts with the ISO-15924 script name | [optional] [default to ]
 **style** | **String**| Name writing style. Enum, available values: Formal, Informal, Legal, Academic | [optional] [default to 0]

### Return type

[**ListResponseOfAiNameGenderHypothesis**](ListResponseOfAiNameGenderHypothesis.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="aiNameGenderizeParsed"></a>
## **aiNameGenderizeParsed**
> [ListResponseOfAiNameGenderHypothesis](ListResponseOfAiNameGenderHypothesis.md) aiNameGenderizeParsed(AiNameGenderizeParsedRequestData request)

Detect person&#39;s gender from parsed name             

### **AiNameGenderizeParsedRequestData** Parameters
```java
public AiNameGenderizeParsedRequestData(
    AiNameParsedRq rq)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rq** | [**AiNameParsedRq**](AiNameParsedRq.md)| Gender detection request data |

### Return type

[**ListResponseOfAiNameGenderHypothesis**](ListResponseOfAiNameGenderHypothesis.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="aiNameMatch"></a>
## **aiNameMatch**
> [AiNameMatchResult](AiNameMatchResult.md) aiNameMatch(AiNameMatchRequestData request)

Compare people&#39;s names. Uses options for comparing instructions             

### **AiNameMatchRequestData** Parameters
```java
public AiNameMatchRequestData(
    String name, 
    String otherName, 
    String language, 
    String location, 
    String encoding, 
    String script, 
    String style)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| A name to match (required) |
 **otherName** | **String**| Another name to match (required) |
 **language** | **String**| An ISO-639 code of the language; either 639-1 or 639-3 (e.g. \&quot;it\&quot; or \&quot;ita\&quot; for Italian)              | [optional] [default to ]
 **location** | **String**| A geographic code such as an ISO-3166 two letter country code, for example \&quot;FR\&quot; for France              | [optional] [default to ]
 **encoding** | **String**| A character encoding name | [optional] [default to ]
 **script** | **String**| A writing system code; starts with the ISO-15924 script name | [optional] [default to ]
 **style** | **String**| Name writing style. Enum, available values: Formal, Informal, Legal, Academic | [optional] [default to 0]

### Return type

[**AiNameMatchResult**](AiNameMatchResult.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="aiNameMatchParsed"></a>
## **aiNameMatchParsed**
> [AiNameMatchResult](AiNameMatchResult.md) aiNameMatchParsed(AiNameMatchParsedRequestData request)

Compare people&#39;s parsed names and attributes. Uses options for comparing instructions             

### **AiNameMatchParsedRequestData** Parameters
```java
public AiNameMatchParsedRequestData(
    AiNameParsedMatchRq rq)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rq** | [**AiNameParsedMatchRq**](AiNameParsedMatchRq.md)| Parsed names to match |

### Return type

[**AiNameMatchResult**](AiNameMatchResult.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="aiNameParse"></a>
## **aiNameParse**
> [ListResponseOfAiNameComponent](ListResponseOfAiNameComponent.md) aiNameParse(AiNameParseRequestData request)

Parse name to components             

### **AiNameParseRequestData** Parameters
```java
public AiNameParseRequestData(
    String name, 
    String language, 
    String location, 
    String encoding, 
    String script, 
    String style)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| A name to parse (required) |
 **language** | **String**| An ISO-639 code of the language; either 639-1 or 639-3 (e.g. \&quot;it\&quot; or \&quot;ita\&quot; for Italian)              | [optional] [default to ]
 **location** | **String**| A geographic code such as an ISO-3166 two letter country code, for example \&quot;FR\&quot; for France              | [optional] [default to ]
 **encoding** | **String**| A character encoding name | [optional] [default to ]
 **script** | **String**| A writing system code; starts with the ISO-15924 script name | [optional] [default to ]
 **style** | **String**| Name writing style Enum, available values: Formal, Informal, Legal, Academic | [optional] [default to 0]

### Return type

[**ListResponseOfAiNameComponent**](ListResponseOfAiNameComponent.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="aiNameParseEmailAddress"></a>
## **aiNameParseEmailAddress**
> [ListResponseOfAiNameExtracted](ListResponseOfAiNameExtracted.md) aiNameParseEmailAddress(AiNameParseEmailAddressRequestData request)

Parse person&#39;s name out of an email address             

### **AiNameParseEmailAddressRequestData** Parameters
```java
public AiNameParseEmailAddressRequestData(
    String emailAddress, 
    String language, 
    String location, 
    String encoding, 
    String script, 
    String style)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailAddress** | **String**| Email address to parse (required) |
 **language** | **String**| An ISO-639 code of the language; either 639-1 or 639-3 (e.g. \&quot;it\&quot; or \&quot;ita\&quot; for Italian)              | [optional] [default to ]
 **location** | **String**| A geographic code such as an ISO-3166 two letter country code, for example \&quot;FR\&quot; for France              | [optional] [default to ]
 **encoding** | **String**| A character encoding name | [optional] [default to ]
 **script** | **String**| A writing system code; starts with the ISO-15924 script name | [optional] [default to ]
 **style** | **String**| Name writing style. Enum, available values: Formal, Informal, Legal, Academic | [optional] [default to 0]

### Return type

[**ListResponseOfAiNameExtracted**](ListResponseOfAiNameExtracted.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="appendEmailMessage"></a>
## **appendEmailMessage**
> [EmailPropertyResponse](EmailPropertyResponse.md) appendEmailMessage(AppendEmailMessageRequestData request)

Adds an email from *.eml file to specified folder in email account             

### **AppendEmailMessageRequestData** Parameters
```java
public AppendEmailMessageRequestData(
    AppendEmailBaseRequest request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**AppendEmailBaseRequest**](AppendEmailBaseRequest.md)| Append email request |

### Return type

[**EmailPropertyResponse**](EmailPropertyResponse.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="appendEmailModelMessage"></a>
## **appendEmailModelMessage**
> [ValueResponse](ValueResponse.md) appendEmailModelMessage(AppendEmailModelMessageRequestData request)

Adds an email from model to specified folder in email account             

### **AppendEmailModelMessageRequestData** Parameters
```java
public AppendEmailModelMessageRequestData(
    AppendEmailModelRq rq)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rq** | [**AppendEmailModelRq**](AppendEmailModelRq.md)| Append email request |

### Return type

[**ValueResponse**](ValueResponse.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="appendMimeMessage"></a>
## **appendMimeMessage**
> [ValueResponse](ValueResponse.md) appendMimeMessage(AppendMimeMessageRequestData request)

Adds an email from MIME to specified folder in email account             

### **AppendMimeMessageRequestData** Parameters
```java
public AppendMimeMessageRequestData(
    AppendEmailMimeBaseRequest request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**AppendEmailMimeBaseRequest**](AppendEmailMimeBaseRequest.md)| Append email request |

### Return type

[**ValueResponse**](ValueResponse.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="convertCalendarModelToAlternate"></a>
## **convertCalendarModelToAlternate**
> [AlternateView](AlternateView.md) convertCalendarModelToAlternate(ConvertCalendarModelToAlternateRequestData request)

Convert iCalendar to AlternateView             

### **ConvertCalendarModelToAlternateRequestData** Parameters
```java
public ConvertCalendarModelToAlternateRequestData(
    CalendarDtoAlternateRq rq)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rq** | [**CalendarDtoAlternateRq**](CalendarDtoAlternateRq.md)| iCalendar to AlternateView request |

### Return type

[**AlternateView**](AlternateView.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="convertEmail"></a>
## **convertEmail**
> [File](File.md) convertEmail(ConvertEmailRequestData request)

Converts email document to specified format and returns as file             

### **ConvertEmailRequestData** Parameters
```java
public ConvertEmailRequestData(
    String format, 
    byte[] file)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**| File format Enum, available values: Eml, Msg, MsgUnicode, Mhtml, Html |
 **file** | **byte[]**| File to upload |

### Return type

[**File**](File.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="copyFile"></a>
## **copyFile**
> void copyFile(CopyFileRequestData request)

Copy file

### **CopyFileRequestData** Parameters
```java
public CopyFileRequestData(
    String srcPath, 
    String destPath, 
    String srcStorageName, 
    String destStorageName, 
    String versionId)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **srcPath** | **String**| Source file path e.g. &#39;/folder/file.ext&#39; |
 **destPath** | **String**| Destination file path |
 **srcStorageName** | **String**| Source storage name | [optional]
 **destStorageName** | **String**| Destination storage name | [optional]
 **versionId** | **String**| File version ID to copy | [optional]

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="copyFolder"></a>
## **copyFolder**
> void copyFolder(CopyFolderRequestData request)

Copy folder

### **CopyFolderRequestData** Parameters
```java
public CopyFolderRequestData(
    String srcPath, 
    String destPath, 
    String srcStorageName, 
    String destStorageName)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **srcPath** | **String**| Source folder path e.g. &#39;/src&#39; |
 **destPath** | **String**| Destination folder path e.g. &#39;/dst&#39; |
 **srcStorageName** | **String**| Source storage name | [optional]
 **destStorageName** | **String**| Destination storage name | [optional]

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="createCalendar"></a>
## **createCalendar**
> void createCalendar(CreateCalendarRequestData request)

Create calendar file             

### **CreateCalendarRequestData** Parameters
```java
public CreateCalendarRequestData(
    String name, 
    HierarchicalObjectRequest request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Calendar file name in storage |
 **request** | [**HierarchicalObjectRequest**](HierarchicalObjectRequest.md)|  |

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="createContact"></a>
## **createContact**
> void createContact(CreateContactRequestData request)

Create contact document             

### **CreateContactRequestData** Parameters
```java
public CreateContactRequestData(
    String format, 
    String name, 
    HierarchicalObjectRequest request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**| Contact document format Enum, available values: VCard, WebDav, Msg |
 **name** | **String**| Contact document file name |
 **request** | [**HierarchicalObjectRequest**](HierarchicalObjectRequest.md)| Create contact request |

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="createEmail"></a>
## **createEmail**
> [EmailDocumentResponse](EmailDocumentResponse.md) createEmail(CreateEmailRequestData request)

Create an email document             

### **CreateEmailRequestData** Parameters
```java
public CreateEmailRequestData(
    String fileName, 
    CreateEmailRequest request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileName** | **String**| Email document file name in storage |
 **request** | [**CreateEmailRequest**](CreateEmailRequest.md)| An email document and optional Storage info to specify where the file should be located              |

### Return type

[**EmailDocumentResponse**](EmailDocumentResponse.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="createEmailFolder"></a>
## **createEmailFolder**
> void createEmailFolder(CreateEmailFolderRequestData request)

Create new folder in email account             

### **CreateEmailFolderRequestData** Parameters
```java
public CreateEmailFolderRequestData(
    CreateFolderBaseRequest request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CreateFolderBaseRequest**](CreateFolderBaseRequest.md)| Create folder request |

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="createFolder"></a>
## **createFolder**
> void createFolder(CreateFolderRequestData request)

Create the folder

### **CreateFolderRequestData** Parameters
```java
public CreateFolderRequestData(
    String path, 
    String storageName)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| Folder path to create e.g. &#39;folder_1/folder_2/&#39; |
 **storageName** | **String**| Storage name | [optional]

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="createMapi"></a>
## **createMapi**
> void createMapi(CreateMapiRequestData request)

Create new document             

### **CreateMapiRequestData** Parameters
```java
public CreateMapiRequestData(
    String name, 
    HierarchicalObjectRequest request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document file name |
 **request** | [**HierarchicalObjectRequest**](HierarchicalObjectRequest.md)| Create document request |

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="deleteCalendarProperty"></a>
## **deleteCalendarProperty**
> void deleteCalendarProperty(DeleteCalendarPropertyRequestData request)

Deletes indexed property by index and name. To delete Reminder attachment, use path ReminderAttachment/{ReminderIndex}/{AttachmentIndex}             

### **DeleteCalendarPropertyRequestData** Parameters
```java
public DeleteCalendarPropertyRequestData(
    String name, 
    String memberName, 
    String index, 
    StorageFolderLocation request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| iCalendar file name in storage |
 **memberName** | **String**| Indexed property name |
 **index** | **String**| Property index path |
 **request** | [**StorageFolderLocation**](StorageFolderLocation.md)| Storage detail to specify iCalendar file location |

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="deleteContactProperty"></a>
## **deleteContactProperty**
> void deleteContactProperty(DeleteContactPropertyRequestData request)

Delete property from indexed property list             

### **DeleteContactPropertyRequestData** Parameters
```java
public DeleteContactPropertyRequestData(
    String format, 
    String name, 
    String memberName, 
    Integer index, 
    StorageFolderLocation folder)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**| Contact document format Enum, available values: VCard, WebDav, Msg |
 **name** | **String**| Contact document file name |
 **memberName** | **String**| Indexed property name |
 **index** | **Integer**| Property index |
 **folder** | [**StorageFolderLocation**](StorageFolderLocation.md)| Calendar document location in storage information |

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="deleteEmailFolder"></a>
## **deleteEmailFolder**
> void deleteEmailFolder(DeleteEmailFolderRequestData request)

Delete a folder in email account             

### **DeleteEmailFolderRequestData** Parameters
```java
public DeleteEmailFolderRequestData(
    DeleteFolderBaseRequest request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**DeleteFolderBaseRequest**](DeleteFolderBaseRequest.md)| Delete folder request |

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="deleteEmailMessage"></a>
## **deleteEmailMessage**
> void deleteEmailMessage(DeleteEmailMessageRequestData request)

Delete message from email account by id             

### **DeleteEmailMessageRequestData** Parameters
```java
public DeleteEmailMessageRequestData(
    DeleteMessageBaseRequest request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**DeleteMessageBaseRequest**](DeleteMessageBaseRequest.md)| Delete message request |

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="deleteFile"></a>
## **deleteFile**
> void deleteFile(DeleteFileRequestData request)

Delete file

### **DeleteFileRequestData** Parameters
```java
public DeleteFileRequestData(
    String path, 
    String storageName, 
    String versionId)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| File path e.g. &#39;/folder/file.ext&#39; |
 **storageName** | **String**| Storage name | [optional]
 **versionId** | **String**| File version ID to delete | [optional]

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="deleteFolder"></a>
## **deleteFolder**
> void deleteFolder(DeleteFolderRequestData request)

Delete folder

### **DeleteFolderRequestData** Parameters
```java
public DeleteFolderRequestData(
    String path, 
    String storageName, 
    Boolean recursive)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| Folder path e.g. &#39;/folder&#39; |
 **storageName** | **String**| Storage name | [optional]
 **recursive** | **Boolean**| Enable to delete folders, subfolders and files | [optional] [default to false]

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="deleteMapiAttachment"></a>
## **deleteMapiAttachment**
> void deleteMapiAttachment(DeleteMapiAttachmentRequestData request)

Remove attachment from document             

### **DeleteMapiAttachmentRequestData** Parameters
```java
public DeleteMapiAttachmentRequestData(
    String name, 
    String attachment, 
    StorageFolderLocation storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document file name |
 **attachment** | **String**| Attachment name or index |
 **storage** | [**StorageFolderLocation**](StorageFolderLocation.md)| Document file storage location info |

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="deleteMapiProperties"></a>
## **deleteMapiProperties**
> void deleteMapiProperties(DeleteMapiPropertiesRequestData request)

Delete document properties             

### **DeleteMapiPropertiesRequestData** Parameters
```java
public DeleteMapiPropertiesRequestData(
    String name, 
    HierarchicalObjectRequest request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document file name |
 **request** | [**HierarchicalObjectRequest**](HierarchicalObjectRequest.md)| Properties that should be deleted |

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="discoverEmailConfig"></a>
## **discoverEmailConfig**
> [EmailAccountConfigList](EmailAccountConfigList.md) discoverEmailConfig(DiscoverEmailConfigRequestData request)

Discover email accounts by email address. Does not validate discovered accounts.             

### **DiscoverEmailConfigRequestData** Parameters
```java
public DiscoverEmailConfigRequestData(
    String address, 
    Boolean fastProcessing)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **String**| Email address |
 **fastProcessing** | **Boolean**| Turns on fast processing. All discover systems will run in parallel. First discovered result will be returned              | [optional] [default to false]

### Return type

[**EmailAccountConfigList**](EmailAccountConfigList.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="discoverEmailConfigOauth"></a>
## **discoverEmailConfigOauth**
> [EmailAccountConfigList](EmailAccountConfigList.md) discoverEmailConfigOauth(DiscoverEmailConfigOauthRequestData request)

Discover email accounts by email address. Validates discovered accounts using OAuth 2.0.             

### **DiscoverEmailConfigOauthRequestData** Parameters
```java
public DiscoverEmailConfigOauthRequestData(
    DiscoverEmailConfigOauth rq)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rq** | [**DiscoverEmailConfigOauth**](DiscoverEmailConfigOauth.md)| Discover email configuration request. |

### Return type

[**EmailAccountConfigList**](EmailAccountConfigList.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="discoverEmailConfigPassword"></a>
## **discoverEmailConfigPassword**
> [EmailAccountConfigList](EmailAccountConfigList.md) discoverEmailConfigPassword(DiscoverEmailConfigPasswordRequestData request)

Discover email accounts by email address. Validates discovered accounts using login and password.             

### **DiscoverEmailConfigPasswordRequestData** Parameters
```java
public DiscoverEmailConfigPasswordRequestData(
    DiscoverEmailConfigPassword rq)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rq** | [**DiscoverEmailConfigPassword**](DiscoverEmailConfigPassword.md)| Discover email configuration request. |

### Return type

[**EmailAccountConfigList**](EmailAccountConfigList.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="downloadFile"></a>
## **downloadFile**
> byte[] downloadFile(DownloadFileRequestData request)

Download file

### **DownloadFileRequestData** Parameters
```java
public DownloadFileRequestData(
    String path, 
    String storageName, 
    String versionId)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| File path e.g. &#39;/folder/file.ext&#39; |
 **storageName** | **String**| Storage name | [optional]
 **versionId** | **String**| File version ID to download | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="fetchEmailMessage"></a>
## **fetchEmailMessage**
> [MimeResponse](MimeResponse.md) fetchEmailMessage(FetchEmailMessageRequestData request)

Fetch message mime from email account             

### **FetchEmailMessageRequestData** Parameters
```java
public FetchEmailMessageRequestData(
    String messageId, 
    String firstAccount, 
    String secondAccount, 
    String storage, 
    String storageFolder)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messageId** | **String**| Message identifier |
 **firstAccount** | **String**| Email account |
 **secondAccount** | **String**| Additional email account (should be specified for POP/IMAP accounts and should be SMTP account)              | [optional]
 **storage** | **String**| Storage name where account file(s) located | [optional]
 **storageFolder** | **String**| Folder in storage where account file(s) located | [optional]

### Return type

[**MimeResponse**](MimeResponse.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="fetchEmailModel"></a>
## **fetchEmailModel**
> [EmailDto](EmailDto.md) fetchEmailModel(FetchEmailModelRequestData request)

Fetch message model from email account             

### **FetchEmailModelRequestData** Parameters
```java
public FetchEmailModelRequestData(
    String messageId, 
    String firstAccount, 
    String secondAccount, 
    String storage, 
    String storageFolder)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messageId** | **String**| Message identifier |
 **firstAccount** | **String**| Email account |
 **secondAccount** | **String**| Additional email account (should be specified for POP/IMAP accounts and should be SMTP account)              | [optional]
 **storage** | **String**| Storage name where account file(s) located | [optional]
 **storageFolder** | **String**| Folder in storage where account file(s) located | [optional]

### Return type

[**EmailDto**](EmailDto.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="getCalendar"></a>
## **getCalendar**
> [HierarchicalObject](HierarchicalObject.md) getCalendar(GetCalendarRequestData request)

Get calendar file properties             

### **GetCalendarRequestData** Parameters
```java
public GetCalendarRequestData(
    String name, 
    String folder, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| iCalendar file name in storage |
 **folder** | **String**| Path to folder in storage | [optional]
 **storage** | **String**| Storage name | [optional]

### Return type

[**HierarchicalObject**](HierarchicalObject.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="getCalendarAttachment"></a>
## **getCalendarAttachment**
> byte[] getCalendarAttachment(GetCalendarAttachmentRequestData request)

Get iCalendar document attachment by name             

### **GetCalendarAttachmentRequestData** Parameters
```java
public GetCalendarAttachmentRequestData(
    String name, 
    String attachment, 
    String folder, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| iCalendar document file name |
 **attachment** | **String**| Attachment name or index |
 **folder** | **String**| Path to folder in storage | [optional]
 **storage** | **String**| Storage name | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="getCalendarList"></a>
## **getCalendarList**
> [ListResponseOfHierarchicalObjectResponse](ListResponseOfHierarchicalObjectResponse.md) getCalendarList(GetCalendarListRequestData request)

Get iCalendar files list in folder on storage             

### **GetCalendarListRequestData** Parameters
```java
public GetCalendarListRequestData(
    String folder, 
    Integer itemsPerPage, 
    Integer pageNumber, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **folder** | **String**| Path to folder in storage |
 **itemsPerPage** | **Integer**| Count of items on page |
 **pageNumber** | **Integer**| Page number |
 **storage** | **String**| Storage name | [optional]

### Return type

[**ListResponseOfHierarchicalObjectResponse**](ListResponseOfHierarchicalObjectResponse.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="getCalendarModel"></a>
## **getCalendarModel**
> [CalendarDto](CalendarDto.md) getCalendarModel(GetCalendarModelRequestData request)

Get calendar file             

### **GetCalendarModelRequestData** Parameters
```java
public GetCalendarModelRequestData(
    String name, 
    String folder, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| iCalendar file name in storage |
 **folder** | **String**| Path to folder in storage | [optional]
 **storage** | **String**| Storage name | [optional]

### Return type

[**CalendarDto**](CalendarDto.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="getCalendarModelAsAlternate"></a>
## **getCalendarModelAsAlternate**
> [AlternateView](AlternateView.md) getCalendarModelAsAlternate(GetCalendarModelAsAlternateRequestData request)

Get iCalendar from storage as AlternateView             

### **GetCalendarModelAsAlternateRequestData** Parameters
```java
public GetCalendarModelAsAlternateRequestData(
    String name, 
    String calendarAction, 
    String sequenceId, 
    String folder, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| iCalendar file name in storage |
 **calendarAction** | **String**| iCalendar method type Enum, available values: Create, Update, Cancel |
 **sequenceId** | **String**| The sequence id | [optional]
 **folder** | **String**| Path to folder in storage | [optional]
 **storage** | **String**| Storage name | [optional]

### Return type

[**AlternateView**](AlternateView.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="getCalendarModelList"></a>
## **getCalendarModelList**
> [CalendarDtoList](CalendarDtoList.md) getCalendarModelList(GetCalendarModelListRequestData request)

Get iCalendar list from storage folder             

### **GetCalendarModelListRequestData** Parameters
```java
public GetCalendarModelListRequestData(
    String folder, 
    Integer itemsPerPage, 
    Integer pageNumber, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **folder** | **String**| Path to folder in storage |
 **itemsPerPage** | **Integer**| Count of items on page | [optional] [default to 10]
 **pageNumber** | **Integer**| Page number | [optional] [default to 0]
 **storage** | **String**| Storage name | [optional]

### Return type

[**CalendarDtoList**](CalendarDtoList.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="getContactAttachment"></a>
## **getContactAttachment**
> byte[] getContactAttachment(GetContactAttachmentRequestData request)

Get attachment file by name             

### **GetContactAttachmentRequestData** Parameters
```java
public GetContactAttachmentRequestData(
    String format, 
    String name, 
    String attachment, 
    String folder, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**| Contact document format. Enum, available values: VCard, WebDav, Msg |
 **name** | **String**| Contact document file name |
 **attachment** | **String**| Attachment name or index |
 **folder** | **String**| Path to folder in storage | [optional]
 **storage** | **String**| Storage name | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="getContactList"></a>
## **getContactList**
> [ListResponseOfHierarchicalObjectResponse](ListResponseOfHierarchicalObjectResponse.md) getContactList(GetContactListRequestData request)

Get contact list from storage folder             

### **GetContactListRequestData** Parameters
```java
public GetContactListRequestData(
    String format, 
    String folder, 
    String storage, 
    Integer itemsPerPage, 
    Integer pageNumber)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**| Contact document format. Enum, available values: VCard, WebDav, Msg |
 **folder** | **String**| Path to folder in storage | [optional]
 **storage** | **String**| Storage name | [optional]
 **itemsPerPage** | **Integer**| Count of items on page | [optional] [default to 10]
 **pageNumber** | **Integer**| Page number | [optional] [default to 0]

### Return type

[**ListResponseOfHierarchicalObjectResponse**](ListResponseOfHierarchicalObjectResponse.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="getContactModel"></a>
## **getContactModel**
> [ContactDto](ContactDto.md) getContactModel(GetContactModelRequestData request)

Get contact document.             

### **GetContactModelRequestData** Parameters
```java
public GetContactModelRequestData(
    String format, 
    String name, 
    String folder, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**| Contact document format. Enum, available values: VCard, WebDav, Msg |
 **name** | **String**| Contact document file name. |
 **folder** | **String**| Path to folder in storage. | [optional]
 **storage** | **String**| Storage name. | [optional]

### Return type

[**ContactDto**](ContactDto.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="getContactModelList"></a>
## **getContactModelList**
> [ContactDtoList](ContactDtoList.md) getContactModelList(GetContactModelListRequestData request)

Get contact list from storage folder.             

### **GetContactModelListRequestData** Parameters
```java
public GetContactModelListRequestData(
    String format, 
    String folder, 
    String storage, 
    Integer itemsPerPage, 
    Integer pageNumber)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**| Contact document format. Enum, available values: VCard, WebDav, Msg |
 **folder** | **String**| Path to folder in storage. | [optional]
 **storage** | **String**| Storage name. | [optional]
 **itemsPerPage** | **Integer**| Count of items on page. | [optional] [default to 10]
 **pageNumber** | **Integer**| Page number. | [optional] [default to 0]

### Return type

[**ContactDtoList**](ContactDtoList.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="getContactProperties"></a>
## **getContactProperties**
> [HierarchicalObject](HierarchicalObject.md) getContactProperties(GetContactPropertiesRequestData request)

Get contact document properties             

### **GetContactPropertiesRequestData** Parameters
```java
public GetContactPropertiesRequestData(
    String format, 
    String name, 
    String folder, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**| Contact document format. Enum, available values: VCard, WebDav, Msg |
 **name** | **String**| Contact document file name |
 **folder** | **String**| Path to folder in storage | [optional]
 **storage** | **String**| Storage name | [optional]

### Return type

[**HierarchicalObject**](HierarchicalObject.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="getDiscUsage"></a>
## **getDiscUsage**
> [DiscUsage](DiscUsage.md) getDiscUsage(GetDiscUsageRequestData request)

Get disc usage

### **GetDiscUsageRequestData** Parameters
```java
public GetDiscUsageRequestData(
    String storageName)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storageName** | **String**| Storage name | [optional]

### Return type

[**DiscUsage**](DiscUsage.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="getEmail"></a>
## **getEmail**
> [EmailDocument](EmailDocument.md) getEmail(GetEmailRequestData request)

Get email document             

### **GetEmailRequestData** Parameters
```java
public GetEmailRequestData(
    String fileName, 
    String storage, 
    String folder)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileName** | **String**| Email document file name in storage |
 **storage** | **String**| Storage name | [optional]
 **folder** | **String**| Path to folder in storage | [optional]

### Return type

[**EmailDocument**](EmailDocument.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="getEmailAsFile"></a>
## **getEmailAsFile**
> byte[] getEmailAsFile(GetEmailAsFileRequestData request)

Converts email document from storage to specified format and returns as file             

### **GetEmailAsFileRequestData** Parameters
```java
public GetEmailAsFileRequestData(
    String fileName, 
    String format, 
    String storage, 
    String folder)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileName** | **String**| Email document file name |
 **format** | **String**| File format Enum, available values: Eml, Msg, MsgUnicode, Mhtml, Html |
 **storage** | **String**| Storage name | [optional]
 **folder** | **String**| Path to folder in storage | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="getEmailAttachment"></a>
## **getEmailAttachment**
> byte[] getEmailAttachment(GetEmailAttachmentRequestData request)

Get email attachment by name             

### **GetEmailAttachmentRequestData** Parameters
```java
public GetEmailAttachmentRequestData(
    String attachment, 
    String fileName, 
    String storage, 
    String folder)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attachment** | **String**| Attachment name |
 **fileName** | **String**| Email document file name |
 **storage** | **String**| Storage name | [optional]
 **folder** | **String**| Path to folder in storage | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="getEmailClientAccount"></a>
## **getEmailClientAccount**
> [EmailClientAccount](EmailClientAccount.md) getEmailClientAccount(GetEmailClientAccountRequestData request)

Get email client account from storage             

### **GetEmailClientAccountRequestData** Parameters
```java
public GetEmailClientAccountRequestData(
    String name, 
    String folder, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| File name on storage |
 **folder** | **String**| Folder on storage |
 **storage** | **String**| Storage name |

### Return type

[**EmailClientAccount**](EmailClientAccount.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="getEmailClientMultiAccount"></a>
## **getEmailClientMultiAccount**
> [EmailClientMultiAccount](EmailClientMultiAccount.md) getEmailClientMultiAccount(GetEmailClientMultiAccountRequestData request)

Get email client multi account file (*.multi.account). Will respond error if file extension is not \&quot;.multi.account\&quot;.             

### **GetEmailClientMultiAccountRequestData** Parameters
```java
public GetEmailClientMultiAccountRequestData(
    String name, 
    String folder, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| File name on storage |
 **folder** | **String**| Folder on storage |
 **storage** | **String**| Storage name |

### Return type

[**EmailClientMultiAccount**](EmailClientMultiAccount.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="getEmailModel"></a>
## **getEmailModel**
> [EmailDto](EmailDto.md) getEmailModel(GetEmailModelRequestData request)

Get email document.             

### **GetEmailModelRequestData** Parameters
```java
public GetEmailModelRequestData(
    String format, 
    String name, 
    String folder, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**| Email document format. Enum, available values: Eml, Msg, MsgUnicode, Mhtml, Html |
 **name** | **String**| Email document file name. |
 **folder** | **String**| Path to folder in storage. | [optional]
 **storage** | **String**| Storage name. | [optional]

### Return type

[**EmailDto**](EmailDto.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="getEmailModelList"></a>
## **getEmailModelList**
> [EmailDtoList](EmailDtoList.md) getEmailModelList(GetEmailModelListRequestData request)

Get email list from storage folder.             

### **GetEmailModelListRequestData** Parameters
```java
public GetEmailModelListRequestData(
    String format, 
    String folder, 
    String storage, 
    Integer itemsPerPage, 
    Integer pageNumber)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**| Email document format. Enum, available values: Eml, Msg, MsgUnicode, Mhtml, Html |
 **folder** | **String**| Path to folder in storage. | [optional]
 **storage** | **String**| Storage name. | [optional]
 **itemsPerPage** | **Integer**| Count of items on page. | [optional] [default to 10]
 **pageNumber** | **Integer**| Page number. | [optional] [default to 0]

### Return type

[**EmailDtoList**](EmailDtoList.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="getEmailProperty"></a>
## **getEmailProperty**
> [EmailPropertyResponse](EmailPropertyResponse.md) getEmailProperty(GetEmailPropertyRequestData request)

Get an email document property by its name             

### **GetEmailPropertyRequestData** Parameters
```java
public GetEmailPropertyRequestData(
    String propertyName, 
    String fileName, 
    String storage, 
    String folder)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **propertyName** | **String**| A property name |
 **fileName** | **String**| Email document file name |
 **storage** | **String**| Storage name | [optional]
 **folder** | **String**| Path to folder in storage | [optional]

### Return type

[**EmailPropertyResponse**](EmailPropertyResponse.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="getFileVersions"></a>
## **getFileVersions**
> [FileVersions](FileVersions.md) getFileVersions(GetFileVersionsRequestData request)

Get file versions

### **GetFileVersionsRequestData** Parameters
```java
public GetFileVersionsRequestData(
    String path, 
    String storageName)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| File path e.g. &#39;/file.ext&#39; |
 **storageName** | **String**| Storage name | [optional]

### Return type

[**FileVersions**](FileVersions.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="getFilesList"></a>
## **getFilesList**
> [FilesList](FilesList.md) getFilesList(GetFilesListRequestData request)

Get all files and folders within a folder

### **GetFilesListRequestData** Parameters
```java
public GetFilesListRequestData(
    String path, 
    String storageName)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| Folder path e.g. &#39;/folder&#39; |
 **storageName** | **String**| Storage name | [optional]

### Return type

[**FilesList**](FilesList.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="getMapiAttachment"></a>
## **getMapiAttachment**
> byte[] getMapiAttachment(GetMapiAttachmentRequestData request)

Get document attachment as file stream             

### **GetMapiAttachmentRequestData** Parameters
```java
public GetMapiAttachmentRequestData(
    String name, 
    String attachment, 
    String folder, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document file name |
 **attachment** | **String**| Attachment name or index |
 **folder** | **String**| Path to folder in storage | [optional]
 **storage** | **String**| Storage name | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="getMapiAttachments"></a>
## **getMapiAttachments**
> [ListResponseOfString](ListResponseOfString.md) getMapiAttachments(GetMapiAttachmentsRequestData request)

Get document attachment list             

### **GetMapiAttachmentsRequestData** Parameters
```java
public GetMapiAttachmentsRequestData(
    String name, 
    String folder, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document file name |
 **folder** | **String**| Path to folder in storage | [optional]
 **storage** | **String**| Storage name | [optional]

### Return type

[**ListResponseOfString**](ListResponseOfString.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="getMapiList"></a>
## **getMapiList**
> [ListResponseOfHierarchicalObjectResponse](ListResponseOfHierarchicalObjectResponse.md) getMapiList(GetMapiListRequestData request)

Get document list from storage folder             

### **GetMapiListRequestData** Parameters
```java
public GetMapiListRequestData(
    String folder, 
    String storage, 
    Integer itemsPerPage, 
    Integer pageNumber)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **folder** | **String**| Path to folder in storage | [optional]
 **storage** | **String**| Storage name | [optional]
 **itemsPerPage** | **Integer**| Count of items on page | [optional] [default to 10]
 **pageNumber** | **Integer**| Page number | [optional] [default to 0]

### Return type

[**ListResponseOfHierarchicalObjectResponse**](ListResponseOfHierarchicalObjectResponse.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="getMapiProperties"></a>
## **getMapiProperties**
> [HierarchicalObjectResponse](HierarchicalObjectResponse.md) getMapiProperties(GetMapiPropertiesRequestData request)

Get document properties             

### **GetMapiPropertiesRequestData** Parameters
```java
public GetMapiPropertiesRequestData(
    String name, 
    String folder, 
    String storage)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document file name |
 **folder** | **String**| Path to folder in storage | [optional]
 **storage** | **String**| Storage name | [optional]

### Return type

[**HierarchicalObjectResponse**](HierarchicalObjectResponse.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="isEmailAddressDisposable"></a>
## **isEmailAddressDisposable**
> [ValueTOfBoolean](ValueTOfBoolean.md) isEmailAddressDisposable(IsEmailAddressDisposableRequestData request)

Check email address is disposable             

### **IsEmailAddressDisposableRequestData** Parameters
```java
public IsEmailAddressDisposableRequestData(
    String address)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **String**| An email address to check |

### Return type

[**ValueTOfBoolean**](ValueTOfBoolean.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="listEmailFolders"></a>
## **listEmailFolders**
> [ListResponseOfMailServerFolder](ListResponseOfMailServerFolder.md) listEmailFolders(ListEmailFoldersRequestData request)

Get folders list in email account             

### **ListEmailFoldersRequestData** Parameters
```java
public ListEmailFoldersRequestData(
    String firstAccount, 
    String secondAccount, 
    String storage, 
    String storageFolder, 
    String parentFolder)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **firstAccount** | **String**| Email account |
 **secondAccount** | **String**| Additional email account (should be specified for POP/IMAP accounts and should be SMTP account)              | [optional]
 **storage** | **String**| Storage name where account file(s) located | [optional]
 **storageFolder** | **String**| Folder in storage where account file(s) located | [optional]
 **parentFolder** | **String**| Folder in which subfolders should be listed | [optional]

### Return type

[**ListResponseOfMailServerFolder**](ListResponseOfMailServerFolder.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="listEmailMessages"></a>
## **listEmailMessages**
> [ListResponseOfString](ListResponseOfString.md) listEmailMessages(ListEmailMessagesRequestData request)

Get messages from folder, filtered by query             

The query string should have the following view.      The example of a simple expression:       &#39;&lt;Field name&gt;&#39; &lt;Comparison operator&gt; &#39;&lt;Field value&gt;&#39;,  where &amp;lt;Field Name&amp;gt; - the name of a message field through which filtering is made, &amp;lt;Comparison operator&amp;gt; - comparison operators, as their name implies, allow to compare message field and specified value, &amp;lt;Field value&amp;gt; - value to be compared with a message field.      The number of simple expressions can make a compound one, ex.:     (&lt;Simple expression 1&gt; &amp; &lt;Simple expression 2&gt;) | &lt;Simple expression 3     &gt;,  where \&quot;&amp;amp;\&quot; - logical-AND operator, \&quot;|\&quot; - logical-OR operator      At present the following values are allowed as a field name (&lt;Field name&gt;):  \&quot;To\&quot; - represents a TO field of message, \&quot;Text\&quot; - represents string in the header or body of the message, \&quot;Bcc\&quot; - represents a BCC field of message, \&quot;Body\&quot; - represents a string in the body of message, \&quot;Cc\&quot; - represents a CC field of message, \&quot;From\&quot; - represents a From field of message, \&quot;Subject\&quot; - represents a string in the subject of message, \&quot;InternalDate\&quot; - represents an internal date of message, \&quot;SentDate\&quot; - represents a sent date of message      Additionally, the following field names are allowed for IMAP-protocol:  \&quot;Answered\&quot; - represents an /Answered flag of message \&quot;Seen\&quot; - represents a /Seen flag of message \&quot;Flagged\&quot; - represents a /Flagged flag of message \&quot;Draft\&quot; - represents a /Draft flag of message \&quot;Deleted\&quot; - represents a Deleted/ flag of message \&quot;Recent\&quot; - represents a Deleted/ flag of message \&quot;MessageSize\&quot; - represents a size (in bytes) of message      Additionally, the following field names are allowed for Exchange:  \&quot;IsRead\&quot; - Indicates whether the message has been read \&quot;HasAttachment\&quot; - Indicates whether or not the message has attachments \&quot;IsSubmitted\&quot; - Indicates whether the message has been submitted to the Outbox \&quot;ContentClass\&quot; - represents a content class of item      Additionally, the following field names are allowed for pst/ost files:  \&quot;MessageClass\&quot; - Represents a message class \&quot;ContainerClass\&quot; - Represents a folder container class \&quot;Importance\&quot; - Represents a message importance \&quot;MessageSize\&quot; - represents a size (in bytes) of message \&quot;FolderName\&quot; - represents a folder name \&quot;ContentsCount\&quot; - represents a total number of items in the folder \&quot;UnreadContentsCount\&quot; - represents the number of unread items in the folder. \&quot;Subfolders\&quot; - Indicates whether or not the folder has subfolders \&quot;Read\&quot; - the message is marked as having been read \&quot;HasAttachment\&quot; - the message has at least one attachment \&quot;Unsent\&quot; - the message is still being composed \&quot;Unmodified\&quot; - the message has not been modified since it was first saved (if unsent) or it was delivered (if sent) \&quot;FromMe\&quot; - the user receiving the message was also the user who sent the message \&quot;Resend\&quot; - the message includes a request for a resend operation with a non-delivery report \&quot;NotifyRead\&quot; - the user who sent the message has requested notification when a recipient first reads it \&quot;NotifyUnread\&quot; - the user who sent the message has requested notification when a recipient deletes it before reading or the Message object expires \&quot;EverRead\&quot; - the message has been read at least once      The field value (&lt;Field value&gt;) can take the following values:     For text fields - any string,     For date type fields - the string of \&quot;d-MMM-yyy\&quot; format, ex. \&quot;10-Feb-2009\&quot;,     For flags (fields of boolean type) - either \&quot;True\&quot;, or \&quot;False\&quot;              

### **ListEmailMessagesRequestData** Parameters
```java
public ListEmailMessagesRequestData(
    String folder, 
    String queryString, 
    String firstAccount, 
    String secondAccount, 
    String storage, 
    String storageFolder, 
    Boolean recursive)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **folder** | **String**| A folder in email account |
 **queryString** | **String**| A MailQuery search string |
 **firstAccount** | **String**| Email account |
 **secondAccount** | **String**| Additional email account (should be specified for POP/IMAP accounts and should be SMTP account)              | [optional]
 **storage** | **String**| Storage name where account file(s) located | [optional]
 **storageFolder** | **String**| Folder in storage where account file(s) located | [optional]
 **recursive** | **Boolean**| Specifies that should message be searched in subfolders recursively | [optional] [default to false]

### Return type

[**ListResponseOfString**](ListResponseOfString.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="listEmailModels"></a>
## **listEmailModels**
> [ListResponseOfEmailDto](ListResponseOfEmailDto.md) listEmailModels(ListEmailModelsRequestData request)

Get messages from folder, filtered by query             

The query string should have the following view.      The example of a simple expression:       &#39;&lt;Field name&gt;&#39; &lt;Comparison operator&gt; &#39;&lt;Field value&gt;&#39;,  where &amp;lt;Field Name&amp;gt; - the name of a message field through which filtering is made, &amp;lt;Comparison operator&amp;gt; - comparison operators, as their name implies, allow to compare message field and specified value, &amp;lt;Field value&amp;gt; - value to be compared with a message field.      The number of simple expressions can make a compound one, ex.:     (&lt;Simple expression 1&gt; &amp; &lt;Simple expression 2&gt;) | &lt;Simple expression 3     &gt;,  where \&quot;&amp;amp;\&quot; - logical-AND operator, \&quot;|\&quot; - logical-OR operator      At present the following values are allowed as a field name (&lt;Field name&gt;):  \&quot;To\&quot; - represents a TO field of message, \&quot;Text\&quot; - represents string in the header or body of the message, \&quot;Bcc\&quot; - represents a BCC field of message, \&quot;Body\&quot; - represents a string in the body of message, \&quot;Cc\&quot; - represents a CC field of message, \&quot;From\&quot; - represents a From field of message, \&quot;Subject\&quot; - represents a string in the subject of message, \&quot;InternalDate\&quot; - represents an internal date of message, \&quot;SentDate\&quot; - represents a sent date of message      Additionally, the following field names are allowed for IMAP-protocol:  \&quot;Answered\&quot; - represents an /Answered flag of message \&quot;Seen\&quot; - represents a /Seen flag of message \&quot;Flagged\&quot; - represents a /Flagged flag of message \&quot;Draft\&quot; - represents a /Draft flag of message \&quot;Deleted\&quot; - represents a Deleted/ flag of message \&quot;Recent\&quot; - represents a Deleted/ flag of message \&quot;MessageSize\&quot; - represents a size (in bytes) of message      Additionally, the following field names are allowed for Exchange:  \&quot;IsRead\&quot; - Indicates whether the message has been read \&quot;HasAttachment\&quot; - Indicates whether or not the message has attachments \&quot;IsSubmitted\&quot; - Indicates whether the message has been submitted to the Outbox \&quot;ContentClass\&quot; - represents a content class of item      Additionally, the following field names are allowed for pst/ost files:  \&quot;MessageClass\&quot; - Represents a message class \&quot;ContainerClass\&quot; - Represents a folder container class \&quot;Importance\&quot; - Represents a message importance \&quot;MessageSize\&quot; - represents a size (in bytes) of message \&quot;FolderName\&quot; - represents a folder name \&quot;ContentsCount\&quot; - represents a total number of items in the folder \&quot;UnreadContentsCount\&quot; - represents the number of unread items in the folder. \&quot;Subfolders\&quot; - Indicates whether or not the folder has subfolders \&quot;Read\&quot; - the message is marked as having been read \&quot;HasAttachment\&quot; - the message has at least one attachment \&quot;Unsent\&quot; - the message is still being composed \&quot;Unmodified\&quot; - the message has not been modified since it was first saved (if unsent) or it was delivered (if sent) \&quot;FromMe\&quot; - the user receiving the message was also the user who sent the message \&quot;Resend\&quot; - the message includes a request for a resend operation with a non-delivery report \&quot;NotifyRead\&quot; - the user who sent the message has requested notification when a recipient first reads it \&quot;NotifyUnread\&quot; - the user who sent the message has requested notification when a recipient deletes it before reading or the Message object expires \&quot;EverRead\&quot; - the message has been read at least once      The field value (&lt;Field value&gt;) can take the following values:     For text fields - any string,     For date type fields - the string of \&quot;d-MMM-yyy\&quot; format, ex. \&quot;10-Feb-2009\&quot;,     For flags (fields of boolean type) - either \&quot;True\&quot;, or \&quot;False\&quot;              

### **ListEmailModelsRequestData** Parameters
```java
public ListEmailModelsRequestData(
    String folder, 
    String queryString, 
    String firstAccount, 
    String secondAccount, 
    String storage, 
    String storageFolder, 
    Boolean recursive)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **folder** | **String**| A folder in email account |
 **queryString** | **String**| A MailQuery search string |
 **firstAccount** | **String**| Email account |
 **secondAccount** | **String**| Additional email account (should be specified for POP/IMAP accounts and should be SMTP account)              | [optional]
 **storage** | **String**| Storage name where account file(s) located | [optional]
 **storageFolder** | **String**| Folder in storage where account file(s) located | [optional]
 **recursive** | **Boolean**| Specifies that should message be searched in subfolders recursively | [optional] [default to false]

### Return type

[**ListResponseOfEmailDto**](ListResponseOfEmailDto.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="moveFile"></a>
## **moveFile**
> void moveFile(MoveFileRequestData request)

Move file

### **MoveFileRequestData** Parameters
```java
public MoveFileRequestData(
    String srcPath, 
    String destPath, 
    String srcStorageName, 
    String destStorageName, 
    String versionId)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **srcPath** | **String**| Source file path e.g. &#39;/src.ext&#39; |
 **destPath** | **String**| Destination file path e.g. &#39;/dest.ext&#39; |
 **srcStorageName** | **String**| Source storage name | [optional]
 **destStorageName** | **String**| Destination storage name | [optional]
 **versionId** | **String**| File version ID to move | [optional]

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="moveFolder"></a>
## **moveFolder**
> void moveFolder(MoveFolderRequestData request)

Move folder

### **MoveFolderRequestData** Parameters
```java
public MoveFolderRequestData(
    String srcPath, 
    String destPath, 
    String srcStorageName, 
    String destStorageName)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **srcPath** | **String**| Folder path to move e.g. &#39;/folder&#39; |
 **destPath** | **String**| Destination folder path to move to e.g &#39;/dst&#39; |
 **srcStorageName** | **String**| Source storage name | [optional]
 **destStorageName** | **String**| Destination storage name | [optional]

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="objectExists"></a>
## **objectExists**
> [ObjectExist](ObjectExist.md) objectExists(ObjectExistsRequestData request)

Check if file or folder exists

### **ObjectExistsRequestData** Parameters
```java
public ObjectExistsRequestData(
    String path, 
    String storageName, 
    String versionId)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| File or folder path e.g. &#39;/file.ext&#39; or &#39;/folder&#39; |
 **storageName** | **String**| Storage name | [optional]
 **versionId** | **String**| File version ID | [optional]

### Return type

[**ObjectExist**](ObjectExist.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="saveCalendarModel"></a>
## **saveCalendarModel**
> void saveCalendarModel(SaveCalendarModelRequestData request)

Save iCalendar             

### **SaveCalendarModelRequestData** Parameters
```java
public SaveCalendarModelRequestData(
    String name, 
    StorageModelRqOfCalendarDto rq)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| iCalendar file name in storage |
 **rq** | [**StorageModelRqOfCalendarDto**](StorageModelRqOfCalendarDto.md)| Calendar properties update request |

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="saveContactModel"></a>
## **saveContactModel**
> void saveContactModel(SaveContactModelRequestData request)

Save contact.             

### **SaveContactModelRequestData** Parameters
```java
public SaveContactModelRequestData(
    String format, 
    String name, 
    StorageModelRqOfContactDto rq)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**| Contact document format. Enum, available values: VCard, WebDav, Msg |
 **name** | **String**| Contact document file name. |
 **rq** | [**StorageModelRqOfContactDto**](StorageModelRqOfContactDto.md)| Create contact request. |

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="saveEmailClientAccount"></a>
## **saveEmailClientAccount**
> void saveEmailClientAccount(SaveEmailClientAccountRequestData request)

Create email client account file (*.account) with any of supported credentials             

### **SaveEmailClientAccountRequestData** Parameters
```java
public SaveEmailClientAccountRequestData(
    StorageFileRqOfEmailClientAccount request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**StorageFileRqOfEmailClientAccount**](StorageFileRqOfEmailClientAccount.md)| Email account information |

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="saveEmailClientMultiAccount"></a>
## **saveEmailClientMultiAccount**
> void saveEmailClientMultiAccount(SaveEmailClientMultiAccountRequestData request)

Create email client multi account file (*.multi.account). Will respond error if file extension is not \&quot;.multi.account\&quot;.             

### **SaveEmailClientMultiAccountRequestData** Parameters
```java
public SaveEmailClientMultiAccountRequestData(
    StorageFileRqOfEmailClientMultiAccount request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**StorageFileRqOfEmailClientMultiAccount**](StorageFileRqOfEmailClientMultiAccount.md)| Email accounts information |

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="saveEmailModel"></a>
## **saveEmailModel**
> void saveEmailModel(SaveEmailModelRequestData request)

Save email document.             

### **SaveEmailModelRequestData** Parameters
```java
public SaveEmailModelRequestData(
    String format, 
    String name, 
    StorageModelRqOfEmailDto rq)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**| File format. Enum, available values: Eml, Msg, MsgUnicode, Mhtml, Html |
 **name** | **String**| iCalendar file name in storage. |
 **rq** | [**StorageModelRqOfEmailDto**](StorageModelRqOfEmailDto.md)| Calendar properties update request. |

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="saveMailAccount"></a>
## **saveMailAccount**
> void saveMailAccount(SaveMailAccountRequestData request)

Create email account file (*.account) with login/password authentication             

### **SaveMailAccountRequestData** Parameters
```java
public SaveMailAccountRequestData(
    SaveEmailAccountRequest request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**SaveEmailAccountRequest**](SaveEmailAccountRequest.md)| Email account information |

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="saveMailOAuthAccount"></a>
## **saveMailOAuthAccount**
> void saveMailOAuthAccount(SaveMailOAuthAccountRequestData request)

Create email account file (*.account) with OAuth             

### **SaveMailOAuthAccountRequestData** Parameters
```java
public SaveMailOAuthAccountRequestData(
    SaveOAuthEmailAccountRequest request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**SaveOAuthEmailAccountRequest**](SaveOAuthEmailAccountRequest.md)| Email account information |

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="sendEmail"></a>
## **sendEmail**
> void sendEmail(SendEmailRequestData request)

Send an email from *.eml file located on storage             

### **SendEmailRequestData** Parameters
```java
public SendEmailRequestData(
    SendEmailBaseRequest request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**SendEmailBaseRequest**](SendEmailBaseRequest.md)| Send email request |

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="sendEmailMime"></a>
## **sendEmailMime**
> void sendEmailMime(SendEmailMimeRequestData request)

Send an email specified by MIME in request             

### **SendEmailMimeRequestData** Parameters
```java
public SendEmailMimeRequestData(
    SendEmailMimeBaseRequest request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**SendEmailMimeBaseRequest**](SendEmailMimeBaseRequest.md)| Send email request |

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="sendEmailModel"></a>
## **sendEmailModel**
> void sendEmailModel(SendEmailModelRequestData request)

Send an email specified by model in request             

### **SendEmailModelRequestData** Parameters
```java
public SendEmailModelRequestData(
    SendEmailModelRq rq)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rq** | [**SendEmailModelRq**](SendEmailModelRq.md)| Send email request |

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="setEmailProperty"></a>
## **setEmailProperty**
> [EmailPropertyResponse](EmailPropertyResponse.md) setEmailProperty(SetEmailPropertyRequestData request)

Set email document property value             

### **SetEmailPropertyRequestData** Parameters
```java
public SetEmailPropertyRequestData(
    String propertyName, 
    String fileName, 
    SetEmailPropertyRequest request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **propertyName** | **String**| A property name that should be changed |
 **fileName** | **String**| Email document file name |
 **request** | [**SetEmailPropertyRequest**](SetEmailPropertyRequest.md)| A property that should be changed and optional Storage info to specify where the file located              |

### Return type

[**EmailPropertyResponse**](EmailPropertyResponse.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="setEmailReadFlag"></a>
## **setEmailReadFlag**
> void setEmailReadFlag(SetEmailReadFlagRequestData request)

Sets \&quot;Message is read\&quot; flag             

### **SetEmailReadFlagRequestData** Parameters
```java
public SetEmailReadFlagRequestData(
    SetMessageReadFlagAccountBaseRequest request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**SetMessageReadFlagAccountBaseRequest**](SetMessageReadFlagAccountBaseRequest.md)| Message is read request |

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="storageExists"></a>
## **storageExists**
> [StorageExist](StorageExist.md) storageExists(StorageExistsRequestData request)

Check if storage exists

### **StorageExistsRequestData** Parameters
```java
public StorageExistsRequestData(
    String storageName)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storageName** | **String**| Storage name |

### Return type

[**StorageExist**](StorageExist.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="updateCalendarProperties"></a>
## **updateCalendarProperties**
> void updateCalendarProperties(UpdateCalendarPropertiesRequestData request)

Update calendar file properties             

### **UpdateCalendarPropertiesRequestData** Parameters
```java
public UpdateCalendarPropertiesRequestData(
    String name, 
    HierarchicalObjectRequest request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| iCalendar file name in storage |
 **request** | [**HierarchicalObjectRequest**](HierarchicalObjectRequest.md)| Calendar properties update request |

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="updateContactProperties"></a>
## **updateContactProperties**
> void updateContactProperties(UpdateContactPropertiesRequestData request)

Update contact document properties             

### **UpdateContactPropertiesRequestData** Parameters
```java
public UpdateContactPropertiesRequestData(
    String format, 
    String name, 
    HierarchicalObjectRequest request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**| Contact document format Enum, available values: VCard, WebDav, Msg |
 **name** | **String**| Contact document file name |
 **request** | [**HierarchicalObjectRequest**](HierarchicalObjectRequest.md)| Properties that should be updated/added |

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="updateMapiProperties"></a>
## **updateMapiProperties**
> void updateMapiProperties(UpdateMapiPropertiesRequestData request)

Update document properties             

### **UpdateMapiPropertiesRequestData** Parameters
```java
public UpdateMapiPropertiesRequestData(
    String name, 
    HierarchicalObjectRequest request)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document file name |
 **request** | [**HierarchicalObjectRequest**](HierarchicalObjectRequest.md)| Properties that should be updated/added |

### Return type

void (empty response body)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

<a name="uploadFile"></a>
## **uploadFile**
> [FilesUploadResult](FilesUploadResult.md) uploadFile(UploadFileRequestData request)

Upload file

### **UploadFileRequestData** Parameters
```java
public UploadFileRequestData(
    String path, 
    byte[] file, 
    String storageName)
```

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| Path where to upload including filename and extension e.g. /file.ext or /Folder 1/file.ext             If the content is multipart and path does not contains the file name it tries to get them from filename parameter             from Content-Disposition header.              |
 **file** | **byte[]**| File to upload |
 **storageName** | **String**| Storage name | [optional]

### Return type

[**FilesUploadResult**](FilesUploadResult.md)

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to API README]](README.md)

