# MapiMessageApi

            ﻿
<a name="asEmailDto"></a>
# asEmailDto
> [EmailDto](EmailDto.md) asEmailDto([MapiMessageDto](MapiMessageDto.md) mapiMessage)

Converts MAPI message model to EmailDto model             

### mapiMessage Parameter

See parameter model documentation at [MapiMessageDto](MapiMessageDto.md)

### Return type

[**EmailDto**](EmailDto.md)

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)
            ﻿
<a name="asFile"></a>
# asFile
> byte[] asFile([MapiMessageAsFileRequest](MapiMessageAsFileRequest.md) request)

Converts MAPI message model to specified format and returns as file.             

### request Parameter

See parameter model documentation at [MapiMessageAsFileRequest](MapiMessageAsFileRequest.md)

### Return type

**byte[]**

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)
            ﻿
<a name="fromFile"></a>
# **fromFile**
> [MapiMessageDto](MapiMessageDto.md) fromFile(MapiMessageFromFileRequest request)

Converts email file to a MAPI model representation             

### **MapiMessageFromFileRequest** Parameters
```java
public MapiMessageFromFileRequest(
    String format, 
    byte[] file)
```

Name | Type | Description | Notes
---- | ---- | ----------- | -----
 **format** | **String**| File format Enum, available values: Eml, Msg, MsgUnicode, Mhtml, Html, Tnef |
 **file** | **byte[]**| File to convert |

### Return type

[**MapiMessageDto**](MapiMessageDto.md)

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

            ﻿
<a name="get"></a>
# **get**
> [MapiMessageDto](MapiMessageDto.md) get(MapiMessageGetRequest request)

Get MAPI message document.             

### **MapiMessageGetRequest** Parameters
```java
public MapiMessageGetRequest(
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

[**MapiMessageDto**](MapiMessageDto.md)

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

            ﻿
<a name="save"></a>
# save
> void save([MapiMessageSaveRequest](MapiMessageSaveRequest.md) request)

Save MAPI message to storage.             

### request Parameter

See parameter model documentation at [MapiMessageSaveRequest](MapiMessageSaveRequest.md)

### Return type

void (empty response body)

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)
