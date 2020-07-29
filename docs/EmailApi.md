# EmailApi

            ﻿
<a name="asFile"></a>
# asFile
> byte[] asFile([EmailAsFileRequest](EmailAsFileRequest.md) request)

Converts Email model to specified format and returns as file.             

### request Parameter

See parameter model documentation at [EmailAsFileRequest](EmailAsFileRequest.md)

### Return type

**byte[]**

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)
            ﻿
<a name="asMapi"></a>
# asMapi
> [MapiMessageDto](MapiMessageDto.md) asMapi([EmailDto](EmailDto.md) emailDto)

Converts EmailDto to MapiMessageDto.             

### emailDto Parameter

See parameter model documentation at [EmailDto](EmailDto.md)

### Return type

[**MapiMessageDto**](MapiMessageDto.md)

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)
            ﻿
<a name="convert"></a>
# **convert**
> byte[] convert(EmailConvertRequest request)

Converts email document to specified format and returns as file             

### **EmailConvertRequest** Parameters
```java
public EmailConvertRequest(
    String format, 
    byte[] file)
```

Name | Type | Description | Notes
---- | ---- | ----------- | -----
 **format** | **String**| File format Enum, available values: Eml, Msg, MsgUnicode, Mhtml, Html, Tnef |
 **file** | **byte[]**| File to convert |

### Return type

**byte[]**

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

            ﻿
<a name="fromFile"></a>
# **fromFile**
> [EmailDto](EmailDto.md) fromFile(EmailFromFileRequest request)

Converts email document to a model representation             

### **EmailFromFileRequest** Parameters
```java
public EmailFromFileRequest(
    String format, 
    byte[] file)
```

Name | Type | Description | Notes
---- | ---- | ----------- | -----
 **format** | **String**|  Enum, available values: Eml, Msg, MsgUnicode, Mhtml, Html, Tnef |
 **file** | **byte[]**| File to convert |

### Return type

[**EmailDto**](EmailDto.md)

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

            ﻿
<a name="get"></a>
# **get**
> [EmailDto](EmailDto.md) get(EmailGetRequest request)

Get email document from storage.             

### **EmailGetRequest** Parameters
```java
public EmailGetRequest(
    String format, 
    String fileName, 
    String folder, 
    String storage)
```

Name | Type | Description | Notes
---- | ---- | ----------- | -----
 **format** | **String**| Email document format. Enum, available values: Eml, Msg, MsgUnicode, Mhtml, Html, Tnef |
 **fileName** | **String**| Email document file name. |
 **folder** | **String**| Path to folder in storage. | [optional]
 **storage** | **String**| Storage name. | [optional]

### Return type

[**EmailDto**](EmailDto.md)

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

            ﻿
<a name="getAsFile"></a>
# **getAsFile**
> byte[] getAsFile(EmailGetAsFileRequest request)

Converts email document from storage to specified format and returns as file             

### **EmailGetAsFileRequest** Parameters
```java
public EmailGetAsFileRequest(
    String fileName, 
    String format, 
    String storage, 
    String folder)
```

Name | Type | Description | Notes
---- | ---- | ----------- | -----
 **fileName** | **String**| Email document file name |
 **format** | **String**| File format Enum, available values: Eml, Msg, MsgUnicode, Mhtml, Html, Tnef |
 **storage** | **String**| Storage name | [optional]
 **folder** | **String**| Path to folder in storage | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

            ﻿
<a name="getList"></a>
# **getList**
> [EmailStorageList](EmailStorageList.md) getList(EmailGetListRequest request)

Get email list from storage folder.             

### **EmailGetListRequest** Parameters
```java
public EmailGetListRequest(
    String format, 
    String folder, 
    String storage, 
    Integer itemsPerPage, 
    Integer pageNumber)
```

Name | Type | Description | Notes
---- | ---- | ----------- | -----
 **format** | **String**| Email document format. Enum, available values: Eml, Msg, MsgUnicode, Mhtml, Html, Tnef |
 **folder** | **String**| Path to folder in storage. | [optional]
 **storage** | **String**| Storage name. | [optional]
 **itemsPerPage** | **Integer**| Count of items on page. | [optional] [default to 10]
 **pageNumber** | **Integer**| Page number. | [optional] [default to 0]

### Return type

[**EmailStorageList**](EmailStorageList.md)

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

            ﻿
<a name="save"></a>
# save
> void save([EmailSaveRequest](EmailSaveRequest.md) request)

Save email document to storage.             

### request Parameter

See parameter model documentation at [EmailSaveRequest](EmailSaveRequest.md)

### Return type

void (empty response body)

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)
