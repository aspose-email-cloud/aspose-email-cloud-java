# ContactApi

            ﻿
<a name="asFile"></a>
# asFile
> byte[] asFile([ContactAsFileRequest](ContactAsFileRequest.md) request)

Converts contact model to specified format and returns as file             

### request Parameter

See parameter model documentation at [ContactAsFileRequest](ContactAsFileRequest.md)

### Return type

**byte[]**

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)
            ﻿
<a name="asMapi"></a>
# asMapi
> [MapiContactDto](MapiContactDto.md) asMapi([ContactDto](ContactDto.md) contactDto)

Converts ContactDto to MapiContactDto.             

### contactDto Parameter

See parameter model documentation at [ContactDto](ContactDto.md)

### Return type

[**MapiContactDto**](MapiContactDto.md)

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)
            ﻿
<a name="convert"></a>
# **convert**
> byte[] convert(ContactConvertRequest request)

Converts contact document to specified format and returns as file             

### **ContactConvertRequest** Parameters
```java
public ContactConvertRequest(
    String toFormat, 
    String fromFormat, 
    byte[] file)
```

Name | Type | Description | Notes
---- | ---- | ----------- | -----
 **toFormat** | **String**| File format to convert to Enum, available values: VCard, WebDav, Msg |
 **fromFormat** | **String**| File format to convert from Enum, available values: VCard, WebDav, Msg |
 **file** | **byte[]**| File to convert |

### Return type

**byte[]**

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

            ﻿
<a name="fromFile"></a>
# **fromFile**
> [ContactDto](ContactDto.md) fromFile(ContactFromFileRequest request)

Converts contact document to a model representation             

### **ContactFromFileRequest** Parameters
```java
public ContactFromFileRequest(
    String format, 
    byte[] file)
```

Name | Type | Description | Notes
---- | ---- | ----------- | -----
 **format** | **String**| File format Enum, available values: VCard, WebDav, Msg |
 **file** | **byte[]**| File to convert |

### Return type

[**ContactDto**](ContactDto.md)

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

            ﻿
<a name="get"></a>
# **get**
> [ContactDto](ContactDto.md) get(ContactGetRequest request)

Get contact document from storage.             

### **ContactGetRequest** Parameters
```java
public ContactGetRequest(
    String format, 
    String fileName, 
    String folder, 
    String storage)
```

Name | Type | Description | Notes
---- | ---- | ----------- | -----
 **format** | **String**| Contact document format. Enum, available values: VCard, WebDav, Msg |
 **fileName** | **String**| Contact document file name. |
 **folder** | **String**| Path to folder in storage. | [optional]
 **storage** | **String**| Storage name. | [optional]

### Return type

[**ContactDto**](ContactDto.md)

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

            ﻿
<a name="getAsFile"></a>
# **getAsFile**
> byte[] getAsFile(ContactGetAsFileRequest request)

Converts contact document from storage to specified format and returns as file             

### **ContactGetAsFileRequest** Parameters
```java
public ContactGetAsFileRequest(
    String fileName, 
    String toFormat, 
    String fromFormat, 
    String storage, 
    String folder)
```

Name | Type | Description | Notes
---- | ---- | ----------- | -----
 **fileName** | **String**| Calendar document file name |
 **toFormat** | **String**| File format Enum, available values: VCard, WebDav, Msg |
 **fromFormat** | **String**| File format to convert from Enum, available values: VCard, WebDav, Msg |
 **storage** | **String**| Storage name | [optional]
 **folder** | **String**| Path to folder in storage | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

            ﻿
<a name="getList"></a>
# **getList**
> [ContactStorageList](ContactStorageList.md) getList(ContactGetListRequest request)

Get contact list from storage folder.             

### **ContactGetListRequest** Parameters
```java
public ContactGetListRequest(
    String format, 
    String folder, 
    String storage, 
    Integer itemsPerPage, 
    Integer pageNumber)
```

Name | Type | Description | Notes
---- | ---- | ----------- | -----
 **format** | **String**| Contact document format. Enum, available values: VCard, WebDav, Msg |
 **folder** | **String**| Path to folder in storage. | [optional]
 **storage** | **String**| Storage name. | [optional]
 **itemsPerPage** | **Integer**| Count of items on page. | [optional] [default to 10]
 **pageNumber** | **Integer**| Page number. | [optional] [default to 0]

### Return type

[**ContactStorageList**](ContactStorageList.md)

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

            ﻿
<a name="save"></a>
# save
> void save([ContactSaveRequest](ContactSaveRequest.md) request)

Save contact to storage.             

### request Parameter

See parameter model documentation at [ContactSaveRequest](ContactSaveRequest.md)

### Return type

void (empty response body)

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)
