# AiNameApi

            ﻿
<a name="complete"></a>
# **complete**
> [AiNameWeightedVariants](AiNameWeightedVariants.md) complete(AiNameCompleteRequest request)

The call proposes k most probable names for given starting characters             

### **AiNameCompleteRequest** Parameters
```java
public AiNameCompleteRequest(
    String name, 
    String language, 
    String location, 
    String encoding, 
    String script, 
    String style)
```

Name | Type | Description | Notes
---- | ---- | ----------- | -----
 **name** | **String**| A name to complete (required) |
 **language** | **String**| An ISO-639 code of the language; either 639-1 or 639-3 (e.g. \&quot;it\&quot; or \&quot;ita\&quot; for Italian)              | [optional] [default to ]
 **location** | **String**| A geographic code such as an ISO-3166 two letter country code, for example \&quot;FR\&quot; for France              | [optional] [default to ]
 **encoding** | **String**| A character encoding name | [optional] [default to ]
 **script** | **String**| A writing system code; starts with the ISO-15924 script name | [optional] [default to ]
 **style** | **String**| Name writing style. Enum, available values: Formal, Informal, Legal, Academic | [optional] [default to 0]

### Return type

[**AiNameWeightedVariants**](AiNameWeightedVariants.md)

[[Back to top]](#) [[Back to Model list]](Model.md) [[Back to API README]](README.md)

            ﻿
<a name="expand"></a>
# **expand**
> [AiNameWeightedVariants](AiNameWeightedVariants.md) expand(AiNameExpandRequest request)

Expands a person&#39;s name into a list of possible alternatives using options for expanding instructions             

### **AiNameExpandRequest** Parameters
```java
public AiNameExpandRequest(
    String name, 
    String language, 
    String location, 
    String encoding, 
    String script, 
    String style)
```

Name | Type | Description | Notes
---- | ---- | ----------- | -----
 **name** | **String**| A name to format (required) |
 **language** | **String**| An ISO-639 code of the language; either 639-1 or 639-3 (e.g. \&quot;it\&quot; or \&quot;ita\&quot; for Italian)              | [optional] [default to ]
 **location** | **String**| A geographic code such as an ISO-3166 two letter country code, for example \&quot;FR\&quot; for France              | [optional] [default to ]
 **encoding** | **String**| A character encoding name | [optional] [default to ]
 **script** | **String**| A writing system code; starts with the ISO-15924 script name | [optional] [default to ]
 **style** | **String**| Name writing style. Enum, available values: Formal, Informal, Legal, Academic | [optional] [default to 0]

### Return type

[**AiNameWeightedVariants**](AiNameWeightedVariants.md)

[[Back to top]](#) [[Back to Model list]](Model.md) [[Back to API README]](README.md)

            ﻿
<a name="expandParsed"></a>
# expandParsed
> [AiNameWeightedVariants](AiNameWeightedVariants.md) expandParsed([AiNameParsedRequest](AiNameParsedRequest.md) request)

Expands a person&#39;s parsed name into a list of possible alternatives using options for expanding instructions             

### request Parameter

See parameter model documentation at [AiNameParsedRequest](AiNameParsedRequest.md)

### Return type

[**AiNameWeightedVariants**](AiNameWeightedVariants.md)

[[Back to top]](#) [[Back to Model list]](Model.md) [[Back to API README]](README.md)
            ﻿
<a name="format"></a>
# **format**
> [AiNameFormatted](AiNameFormatted.md) format(AiNameFormatRequest request)

Formats a person&#39;s name in correct case and name order using options for formatting instructions             

### **AiNameFormatRequest** Parameters
```java
public AiNameFormatRequest(
    String name, 
    String language, 
    String location, 
    String encoding, 
    String script, 
    String format, 
    String style)
```

Name | Type | Description | Notes
---- | ---- | ----------- | -----
 **name** | **String**| A name to format (required) |
 **language** | **String**| An ISO-639 code of the language; either 639-1 or 639-3 (e.g. \&quot;it\&quot; or \&quot;ita\&quot; for Italian)              | [optional] [default to ]
 **location** | **String**| A geographic code such as an ISO-3166 two letter country code, for example \&quot;FR\&quot; for France              | [optional] [default to ]
 **encoding** | **String**| A character encoding name | [optional] [default to ]
 **script** | **String**| A writing system code; starts with the ISO-15924 script name | [optional] [default to ]
 **format** | **String**| Format of the name. Predefined format can be used by ID, or custom format can be specified. Predefined formats:      /format/default/ (&#x3D; &#39;%t%F%m%N%L%p&#39;)     /format/FN+LN/ (&#x3D; &#39;%F%L&#39;)     /format/title+FN+LN/ (&#x3D; &#39;%t%F%L&#39;)     /format/FN+MN+LN/ (&#x3D; &#39;%F%M%N%L&#39;)     /format/title+FN+MN+LN/ (&#x3D; &#39;%t%F%M%N%L&#39;)     /format/FN+MI+LN/ (&#x3D; &#39;%F%m%N%L&#39;)     /format/title+FN+MI+LN/ (&#x3D; &#39;%t%F%m%N%L&#39;)     /format/LN/ (&#x3D; &#39;%L&#39;)     /format/title+LN/ (&#x3D; &#39;%t%L&#39;)     /format/LN+FN+MN/ (&#x3D; &#39;%L,%F%M%N&#39;)     /format/LN+title+FN+MN/ (&#x3D; &#39;%L,%t%F%M%N&#39;)     /format/LN+FN+MI/ (&#x3D; &#39;%L,%F%m%N&#39;)     /format/LN+title+FN+MI/ (&#x3D; &#39;%L,%t%F%m%N&#39;)  Custom format string - custom combination of characters and the next term placeholders:      &#39;%t&#39; - Title (prefix)     &#39;%F&#39; - First name     &#39;%f&#39; - First initial     &#39;%M&#39; - Middle name(s)     &#39;%m&#39; - Middle initial(s)     &#39;%N&#39; - Nickname     &#39;%L&#39; - Last name     &#39;%l&#39; - Last initial     &#39;%p&#39; - Postfix  If no value for format option was provided, its default value is &#39;%t%F%m%N%L%p&#39;              | [optional] [default to ]
 **style** | **String**| Name writing style. Enum, available values: Formal, Informal, Legal, Academic | [optional] [default to 0]

### Return type

[**AiNameFormatted**](AiNameFormatted.md)

[[Back to top]](#) [[Back to Model list]](Model.md) [[Back to API README]](README.md)

            ﻿
<a name="formatParsed"></a>
# formatParsed
> [AiNameFormatted](AiNameFormatted.md) formatParsed([AiNameParsedRequest](AiNameParsedRequest.md) request)

Formats a person&#39;s parsed name in correct case and name order using options for formatting instructions             

### request Parameter

See parameter model documentation at [AiNameParsedRequest](AiNameParsedRequest.md)

### Return type

[**AiNameFormatted**](AiNameFormatted.md)

[[Back to top]](#) [[Back to Model list]](Model.md) [[Back to API README]](README.md)
            ﻿
<a name="genderize"></a>
# **genderize**
> [AiNameGenderHypothesisList](AiNameGenderHypothesisList.md) genderize(AiNameGenderizeRequest request)

Detect person&#39;s gender from name string             

### **AiNameGenderizeRequest** Parameters
```java
public AiNameGenderizeRequest(
    String name, 
    String language, 
    String location, 
    String encoding, 
    String script, 
    String style)
```

Name | Type | Description | Notes
---- | ---- | ----------- | -----
 **name** | **String**| A name to parse (required) |
 **language** | **String**| An ISO-639 code of the language; either 639-1 or 639-3 (e.g. \&quot;it\&quot; or \&quot;ita\&quot; for Italian)              | [optional] [default to ]
 **location** | **String**| A geographic code such as an ISO-3166 two letter country code, for example \&quot;FR\&quot; for France              | [optional] [default to ]
 **encoding** | **String**| A character encoding name | [optional] [default to ]
 **script** | **String**| A writing system code; starts with the ISO-15924 script name | [optional] [default to ]
 **style** | **String**| Name writing style. Enum, available values: Formal, Informal, Legal, Academic | [optional] [default to 0]

### Return type

[**AiNameGenderHypothesisList**](AiNameGenderHypothesisList.md)

[[Back to top]](#) [[Back to Model list]](Model.md) [[Back to API README]](README.md)

            ﻿
<a name="genderizeParsed"></a>
# genderizeParsed
> [AiNameGenderHypothesisList](AiNameGenderHypothesisList.md) genderizeParsed([AiNameParsedRequest](AiNameParsedRequest.md) request)

Detect person&#39;s gender from parsed name             

### request Parameter

See parameter model documentation at [AiNameParsedRequest](AiNameParsedRequest.md)

### Return type

[**AiNameGenderHypothesisList**](AiNameGenderHypothesisList.md)

[[Back to top]](#) [[Back to Model list]](Model.md) [[Back to API README]](README.md)
            ﻿
<a name="match"></a>
# **match**
> [AiNameMatchResult](AiNameMatchResult.md) match(AiNameMatchRequest request)

Compare people&#39;s names. Uses options for comparing instructions             

### **AiNameMatchRequest** Parameters
```java
public AiNameMatchRequest(
    String name, 
    String otherName, 
    String language, 
    String location, 
    String encoding, 
    String script, 
    String style)
```

Name | Type | Description | Notes
---- | ---- | ----------- | -----
 **name** | **String**| A name to match (required) |
 **otherName** | **String**| Another name to match (required) |
 **language** | **String**| An ISO-639 code of the language; either 639-1 or 639-3 (e.g. \&quot;it\&quot; or \&quot;ita\&quot; for Italian)              | [optional] [default to ]
 **location** | **String**| A geographic code such as an ISO-3166 two letter country code, for example \&quot;FR\&quot; for France              | [optional] [default to ]
 **encoding** | **String**| A character encoding name | [optional] [default to ]
 **script** | **String**| A writing system code; starts with the ISO-15924 script name | [optional] [default to ]
 **style** | **String**| Name writing style. Enum, available values: Formal, Informal, Legal, Academic | [optional] [default to 0]

### Return type

[**AiNameMatchResult**](AiNameMatchResult.md)

[[Back to top]](#) [[Back to Model list]](Model.md) [[Back to API README]](README.md)

            ﻿
<a name="matchParsed"></a>
# matchParsed
> [AiNameMatchResult](AiNameMatchResult.md) matchParsed([AiNameParsedMatchRequest](AiNameParsedMatchRequest.md) request)

Compare people&#39;s parsed names and attributes. Uses options for comparing instructions             

### request Parameter

See parameter model documentation at [AiNameParsedMatchRequest](AiNameParsedMatchRequest.md)

### Return type

[**AiNameMatchResult**](AiNameMatchResult.md)

[[Back to top]](#) [[Back to Model list]](Model.md) [[Back to API README]](README.md)
            ﻿
<a name="parse"></a>
# **parse**
> [AiNameComponentList](AiNameComponentList.md) parse(AiNameParseRequest request)

Parse name to components             

### **AiNameParseRequest** Parameters
```java
public AiNameParseRequest(
    String name, 
    String language, 
    String location, 
    String encoding, 
    String script, 
    String style)
```

Name | Type | Description | Notes
---- | ---- | ----------- | -----
 **name** | **String**| A name to parse (required) |
 **language** | **String**| An ISO-639 code of the language; either 639-1 or 639-3 (e.g. \&quot;it\&quot; or \&quot;ita\&quot; for Italian)              | [optional] [default to ]
 **location** | **String**| A geographic code such as an ISO-3166 two letter country code, for example \&quot;FR\&quot; for France              | [optional] [default to ]
 **encoding** | **String**| A character encoding name | [optional] [default to ]
 **script** | **String**| A writing system code; starts with the ISO-15924 script name | [optional] [default to ]
 **style** | **String**| Name writing style Enum, available values: Formal, Informal, Legal, Academic | [optional] [default to 0]

### Return type

[**AiNameComponentList**](AiNameComponentList.md)

[[Back to top]](#) [[Back to Model list]](Model.md) [[Back to API README]](README.md)

            ﻿
<a name="parseEmailAddress"></a>
# **parseEmailAddress**
> [AiNameExtractedList](AiNameExtractedList.md) parseEmailAddress(AiNameParseEmailAddressRequest request)

Parse person&#39;s name out of an email address             

### **AiNameParseEmailAddressRequest** Parameters
```java
public AiNameParseEmailAddressRequest(
    String emailAddress, 
    String language, 
    String location, 
    String encoding, 
    String script, 
    String style)
```

Name | Type | Description | Notes
---- | ---- | ----------- | -----
 **emailAddress** | **String**| Email address to parse (required) |
 **language** | **String**| An ISO-639 code of the language; either 639-1 or 639-3 (e.g. \&quot;it\&quot; or \&quot;ita\&quot; for Italian)              | [optional] [default to ]
 **location** | **String**| A geographic code such as an ISO-3166 two letter country code, for example \&quot;FR\&quot; for France              | [optional] [default to ]
 **encoding** | **String**| A character encoding name | [optional] [default to ]
 **script** | **String**| A writing system code; starts with the ISO-15924 script name | [optional] [default to ]
 **style** | **String**| Name writing style. Enum, available values: Formal, Informal, Legal, Academic | [optional] [default to 0]

### Return type

[**AiNameExtractedList**](AiNameExtractedList.md)

[[Back to top]](#) [[Back to Model list]](Model.md) [[Back to API README]](README.md)

