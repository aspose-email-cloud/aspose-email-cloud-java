# AiNameApi (EmailCloud.ai().name())

AI Name operations.

<a name="complete"></a>
## complete

Description: The call proposes k most probable names for given starting characters.             

Returns: List of name variations.

Method call example:
```java
AiNameWeightedVariants result = api.ai().name().complete(request);
```


### Parameter: request

Description: complete method request.

See parameter model documentation at [AiNameCompleteRequest](AiNameCompleteRequest.md)

<details>
    <summary>Parameter initialization example:</summary>

```java
AiNameCompleteRequest request = Models.aiNameCompleteRequest()
    .name("Dav")
    .build();
```

</details>

### Result

Description: List of name variations.

Return type: [**AiNameWeightedVariants**](AiNameWeightedVariants.md)

<details>
    <summary>Result example</summary>

```java
result = Models.aiNameWeightedVariants()
    .names(Arrays.<AiNameWeighted>asList(
        Models.aiNameWeighted()
            .name("J. Cane")
            .score(1)
            .build(),
        Models.aiNameWeighted()
            .name("Mr. Cane")
            .score(0.75)
            .build()))
    .build();
```
</details>

### Complete example

<details>
    <summary>Method call example:</summary>

```java
EmailCloud api = new EmailCloud(appKey, appSid);

// Prepare parameters:
AiNameCompleteRequest request = Models.aiNameCompleteRequest()
    .name("Dav")
    .build();

// Call method:
AiNameWeightedVariants result = api.ai().name().complete(request);

// Result example:
result = Models.aiNameWeightedVariants()
    .names(Arrays.<AiNameWeighted>asList(
        Models.aiNameWeighted()
            .name("J. Cane")
            .score(1)
            .build(),
        Models.aiNameWeighted()
            .name("Mr. Cane")
            .score(0.75)
            .build()))
    .build();
```

</details>

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

<a name="expand"></a>
## expand

Description: Expands a person&#39;s name into a list of possible alternatives using options for expanding instructions.             

Returns: List of name variations.

Method call example:
```java
AiNameWeightedVariants result = api.ai().name().expand(request);
```


### Parameter: request

Description: expand method request.

See parameter model documentation at [AiNameExpandRequest](AiNameExpandRequest.md)

<details>
    <summary>Parameter initialization example:</summary>

```java
AiNameExpandRequest request = Models.aiNameExpandRequest()
    .name("John Cane")
    .build();
```

</details>

### Result

Description: List of name variations.

Return type: [**AiNameWeightedVariants**](AiNameWeightedVariants.md)

<details>
    <summary>Result example</summary>

```java
result = Models.aiNameWeightedVariants()
    .names(Arrays.<AiNameWeighted>asList(
        Models.aiNameWeighted()
            .name("J. Cane")
            .score(1)
            .build(),
        Models.aiNameWeighted()
            .name("Mr. Cane")
            .score(0.75)
            .build()))
    .build();
```
</details>

### Complete example

<details>
    <summary>Method call example:</summary>

```java
EmailCloud api = new EmailCloud(appKey, appSid);

// Prepare parameters:
AiNameExpandRequest request = Models.aiNameExpandRequest()
    .name("John Cane")
    .build();

// Call method:
AiNameWeightedVariants result = api.ai().name().expand(request);

// Result example:
result = Models.aiNameWeightedVariants()
    .names(Arrays.<AiNameWeighted>asList(
        Models.aiNameWeighted()
            .name("J. Cane")
            .score(1)
            .build(),
        Models.aiNameWeighted()
            .name("Mr. Cane")
            .score(0.75)
            .build()))
    .build();
```

</details>

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

<a name="expandParsed"></a>
## expandParsed

Description: Expands a person&#39;s parsed name into a list of possible alternatives using options for expanding instructions.             

Returns: List of name variations.

Method call example:
```java
AiNameWeightedVariants result = api.ai().name().expandParsed(request);
```

### Parameter: request

Description: Parsed name with options.

See parameter model documentation at [AiNameParsedRequest](AiNameParsedRequest.md)

<details>
    <summary>Parameter initialization example:</summary>
    
```java
AiNameParsedRequest request = ;
```

</details>


### Result

Description: List of name variations.

Return type: [**AiNameWeightedVariants**](AiNameWeightedVariants.md)

<details>
    <summary>Result example</summary>

```java
result = Models.aiNameWeightedVariants()
    .names(Arrays.<AiNameWeighted>asList(
        Models.aiNameWeighted()
            .name("J. Cane")
            .score(1)
            .build(),
        Models.aiNameWeighted()
            .name("Mr. Cane")
            .score(0.75)
            .build()))
    .build();
```
</details>

### Complete example

<details>
    <summary>Method call example:</summary>

```java
EmailCloud api = new EmailCloud(appKey, appSid);

// Prepare parameters:
AiNameParsedRequest request = ;

// Call method:
AiNameWeightedVariants result = api.ai().name().expandParsed(request);

// Result example:
result = Models.aiNameWeightedVariants()
    .names(Arrays.<AiNameWeighted>asList(
        Models.aiNameWeighted()
            .name("J. Cane")
            .score(1)
            .build(),
        Models.aiNameWeighted()
            .name("Mr. Cane")
            .score(0.75)
            .build()))
    .build();
```

</details>

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)
<a name="format"></a>
## format

Description: Formats a person&#39;s name in correct case and name order using options for formatting instructions.             

Returns: Formatted name.

Method call example:
```java
AiNameFormatted result = api.ai().name().format(request);
```


### Parameter: request

Description: format method request.

See parameter model documentation at [AiNameFormatRequest](AiNameFormatRequest.md)

<details>
    <summary>Parameter initialization example:</summary>

```java
AiNameFormatRequest request = Models.aiNameFormatRequest()
    .name("Mr. John Michael Cane")
    .format("%t%L%f%m")
    .build();
```

</details>

### Result

Description: Formatted name.

Return type: [**AiNameFormatted**](AiNameFormatted.md)

<details>
    <summary>Result example</summary>

```java
result = Models.aiNameFormatted()
    .name("Mr. Cane J. M.")
    .comments("format: %t%L%f%m; source: parsed format")
    .build();
```
</details>

### Complete example

<details>
    <summary>Method call example:</summary>

```java
EmailCloud api = new EmailCloud(appKey, appSid);

// Prepare parameters:
AiNameFormatRequest request = Models.aiNameFormatRequest()
    .name("Mr. John Michael Cane")
    .format("%t%L%f%m")
    .build();

// Call method:
AiNameFormatted result = api.ai().name().format(request);

// Result example:
result = Models.aiNameFormatted()
    .name("Mr. Cane J. M.")
    .comments("format: %t%L%f%m; source: parsed format")
    .build();
```

</details>

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

<a name="formatParsed"></a>
## formatParsed

Description: Formats a person&#39;s parsed name in correct case and name order using options for formatting instructions.             

Returns: Formatted name.

Method call example:
```java
AiNameFormatted result = api.ai().name().formatParsed(request);
```

### Parameter: request

Description: Parsed name with options.

See parameter model documentation at [AiNameParsedRequest](AiNameParsedRequest.md)

<details>
    <summary>Parameter initialization example:</summary>
    
```java
AiNameParsedRequest request = ;
```

</details>


### Result

Description: Formatted name.

Return type: [**AiNameFormatted**](AiNameFormatted.md)

<details>
    <summary>Result example</summary>

```java
result = Models.aiNameFormatted()
    .name("Mr. Cane J. M.")
    .comments("format: %t%L%f%m; source: parsed format")
    .build();
```
</details>

### Complete example

<details>
    <summary>Method call example:</summary>

```java
EmailCloud api = new EmailCloud(appKey, appSid);

// Prepare parameters:
AiNameParsedRequest request = ;

// Call method:
AiNameFormatted result = api.ai().name().formatParsed(request);

// Result example:
result = Models.aiNameFormatted()
    .name("Mr. Cane J. M.")
    .comments("format: %t%L%f%m; source: parsed format")
    .build();
```

</details>

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)
<a name="genderize"></a>
## genderize

Description: Detect person&#39;s gender from name string.             

Returns: Hypotheses about person&#39;s gender.

Method call example:
```java
AiNameGenderHypothesisList result = api.ai().name().genderize(request);
```


### Parameter: request

Description: genderize method request.

See parameter model documentation at [AiNameGenderizeRequest](AiNameGenderizeRequest.md)

<details>
    <summary>Parameter initialization example:</summary>

```java
AiNameGenderizeRequest request = Models.aiNameGenderizeRequest()
    .name("John Cane")
    .build();
```

</details>

### Result

Description: Hypotheses about person&#39;s gender.

Return type: [**AiNameGenderHypothesisList**](AiNameGenderHypothesisList.md)

<details>
    <summary>Result example</summary>

```java
result = ;
```
</details>

### Complete example

<details>
    <summary>Method call example:</summary>

```java
EmailCloud api = new EmailCloud(appKey, appSid);

// Prepare parameters:
AiNameGenderizeRequest request = Models.aiNameGenderizeRequest()
    .name("John Cane")
    .build();

// Call method:
AiNameGenderHypothesisList result = api.ai().name().genderize(request);

// Result example:
result = ;
```

</details>

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

<a name="genderizeParsed"></a>
## genderizeParsed

Description: Detect person&#39;s gender from parsed name.             

Returns: Hypotheses about person&#39;s gender.

Method call example:
```java
AiNameGenderHypothesisList result = api.ai().name().genderizeParsed(request);
```

### Parameter: request

Description: Gender detection request data.

See parameter model documentation at [AiNameParsedRequest](AiNameParsedRequest.md)

<details>
    <summary>Parameter initialization example:</summary>
    
```java
AiNameParsedRequest request = ;
```

</details>


### Result

Description: Hypotheses about person&#39;s gender.

Return type: [**AiNameGenderHypothesisList**](AiNameGenderHypothesisList.md)

<details>
    <summary>Result example</summary>

```java
result = ;
```
</details>

### Complete example

<details>
    <summary>Method call example:</summary>

```java
EmailCloud api = new EmailCloud(appKey, appSid);

// Prepare parameters:
AiNameParsedRequest request = ;

// Call method:
AiNameGenderHypothesisList result = api.ai().name().genderizeParsed(request);

// Result example:
result = ;
```

</details>

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)
<a name="match"></a>
## match

Description: Compare people&#39;s names. Uses options for comparing instructions.             

Returns: Match result.

Method call example:
```java
AiNameMatchResult result = api.ai().name().match(request);
```


### Parameter: request

Description: match method request.

See parameter model documentation at [AiNameMatchRequest](AiNameMatchRequest.md)

<details>
    <summary>Parameter initialization example:</summary>

```java
AiNameMatchRequest request = Models.aiNameMatchRequest()
    .name("John Michael Cane")
    .otherName("Cane J.")
    .build();
```

</details>

### Result

Description: Match result.

Return type: [**AiNameMatchResult**](AiNameMatchResult.md)

<details>
    <summary>Result example</summary>

```java
result = Models.aiNameMatchResult()
    .similarity(0.6)
    .mismatches(Arrays.<AiNameMismatch>asList(
        Models.aiNameMismatch()
            .category("Gender")
            .explanation("no_match")
            .build()))
    .build();
```
</details>

### Complete example

<details>
    <summary>Method call example:</summary>

```java
EmailCloud api = new EmailCloud(appKey, appSid);

// Prepare parameters:
AiNameMatchRequest request = Models.aiNameMatchRequest()
    .name("John Michael Cane")
    .otherName("Cane J.")
    .build();

// Call method:
AiNameMatchResult result = api.ai().name().match(request);

// Result example:
result = Models.aiNameMatchResult()
    .similarity(0.6)
    .mismatches(Arrays.<AiNameMismatch>asList(
        Models.aiNameMismatch()
            .category("Gender")
            .explanation("no_match")
            .build()))
    .build();
```

</details>

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

<a name="matchParsed"></a>
## matchParsed

Description: Compare people&#39;s parsed names and attributes. Uses options for comparing instructions.             

Returns: Match result.

Method call example:
```java
AiNameMatchResult result = api.ai().name().matchParsed(request);
```

### Parameter: request

Description: Parsed names to match.

See parameter model documentation at [AiNameMatchParsedRequest](AiNameMatchParsedRequest.md)

<details>
    <summary>Parameter initialization example:</summary>
    
```java
AiNameMatchParsedRequest request = ;
```

</details>


### Result

Description: Match result.

Return type: [**AiNameMatchResult**](AiNameMatchResult.md)

<details>
    <summary>Result example</summary>

```java
result = Models.aiNameMatchResult()
    .similarity(0.6)
    .mismatches(Arrays.<AiNameMismatch>asList(
        Models.aiNameMismatch()
            .category("Gender")
            .explanation("no_match")
            .build()))
    .build();
```
</details>

### Complete example

<details>
    <summary>Method call example:</summary>

```java
EmailCloud api = new EmailCloud(appKey, appSid);

// Prepare parameters:
AiNameMatchParsedRequest request = ;

// Call method:
AiNameMatchResult result = api.ai().name().matchParsed(request);

// Result example:
result = Models.aiNameMatchResult()
    .similarity(0.6)
    .mismatches(Arrays.<AiNameMismatch>asList(
        Models.aiNameMismatch()
            .category("Gender")
            .explanation("no_match")
            .build()))
    .build();
```

</details>

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)
<a name="parse"></a>
## parse

Description: Parse name to components.             

Returns: List of name components.

Method call example:
```java
AiNameComponentList result = api.ai().name().parse(request);
```


### Parameter: request

Description: parse method request.

See parameter model documentation at [AiNameParseRequest](AiNameParseRequest.md)

<details>
    <summary>Parameter initialization example:</summary>

```java
AiNameParseRequest request = Models.aiNameParseRequest()
    .name("John Cane")
    .language("eng")
    .location("USA")
    .build();
```

</details>

### Result

Description: List of name components.

Return type: [**AiNameComponentList**](AiNameComponentList.md)

<details>
    <summary>Result example</summary>

```java
result = ;
```
</details>

### Complete example

<details>
    <summary>Method call example:</summary>

```java
EmailCloud api = new EmailCloud(appKey, appSid);

// Prepare parameters:
AiNameParseRequest request = Models.aiNameParseRequest()
    .name("John Cane")
    .language("eng")
    .location("USA")
    .build();

// Call method:
AiNameComponentList result = api.ai().name().parse(request);

// Result example:
result = ;
```

</details>

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

<a name="parseEmailAddress"></a>
## parseEmailAddress

Description: Parse person&#39;s name out of an email address.             

Returns: Match result.

Method call example:
```java
AiNameExtractedList result = api.ai().name().parseEmailAddress(request);
```


### Parameter: request

Description: parseEmailAddress method request.

See parameter model documentation at [AiNameParseEmailAddressRequest](AiNameParseEmailAddressRequest.md)

<details>
    <summary>Parameter initialization example:</summary>

```java
AiNameParseEmailAddressRequest request = Models.aiNameParseEmailAddressRequest()
    .emailAddress("john-cane@gmail.com")
    .build();
```

</details>

### Result

Description: Match result.

Return type: [**AiNameExtractedList**](AiNameExtractedList.md)

<details>
    <summary>Result example</summary>

```java
result = ;
```
</details>

### Complete example

<details>
    <summary>Method call example:</summary>

```java
EmailCloud api = new EmailCloud(appKey, appSid);

// Prepare parameters:
AiNameParseEmailAddressRequest request = Models.aiNameParseEmailAddressRequest()
    .emailAddress("john-cane@gmail.com")
    .build();

// Call method:
AiNameExtractedList result = api.ai().name().parseEmailAddress(request);

// Result example:
result = ;
```

</details>

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

