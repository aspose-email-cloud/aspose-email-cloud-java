# com.aspose.email.cloud.sdk.api.MapiContactApi

            ﻿
<a name="asContactDto"></a>
# asContactDto
> [ContactDto](ContactDto.md) asContactDto([MapiContactDto](MapiContactDto.md) mapiContactDto)

Converts MAPI contact model to ContactDto model.             

### mapiContactDto Parameter

See parameter model documentation at [MapiContactDto](MapiContactDto.md)

### Return type

[**ContactDto**](ContactDto.md)

[[Back to top]](#) [[Back to Model list]](Model.md) [[Back to API README]](README.md)
            ﻿
<a name="asFile"></a>
# asFile
> byte[] asFile([MapiContactAsFileRequest](MapiContactAsFileRequest.md) request)

Converts MAPI contact model to specified format and returns as file.             

### request Parameter

See parameter model documentation at [MapiContactAsFileRequest](MapiContactAsFileRequest.md)

### Return type

**byte[]**

[[Back to top]](#) [[Back to Model list]](Model.md) [[Back to API README]](README.md)
            ﻿
<a name="fromFile"></a>
# **fromFile**
> [MapiContactDto](MapiContactDto.md) fromFile(MapiContactFromFileRequest request)

Converts contact file to a MAPI model representation.             

### **MapiContactFromFileRequest** Parameters
```java
public MapiContactFromFileRequest(
    String fileFormat, 
    byte[] file)
```

Name | Type | Description | Notes
---- | ---- | ----------- | -----
 **fileFormat** | **String**| File format Enum, available values: VCard, WebDav, Msg |
 **file** | **byte[]**| File to convert |

### Return type

[**MapiContactDto**](MapiContactDto.md)

[[Back to top]](#) [[Back to Model list]](Model.md) [[Back to API README]](README.md)

            ﻿
<a name="get"></a>
# **get**
> [MapiContactDto](MapiContactDto.md) get(MapiContactGetRequest request)

Get MAPI contact document.             

### **MapiContactGetRequest** Parameters
```java
public MapiContactGetRequest(
    String format, 
    String name, 
    String folder, 
    String storage)
```

Name | Type | Description | Notes
---- | ---- | ----------- | -----
 **format** | **String**| Contact document format. Enum, available values: VCard, WebDav, Msg |
 **name** | **String**| Contact document file name. |
 **folder** | **String**| Path to folder in storage. | [optional]
 **storage** | **String**| Storage name. | [optional]

### Return type

[**MapiContactDto**](MapiContactDto.md)

[[Back to top]](#) [[Back to Model list]](Model.md) [[Back to API README]](README.md)

            ﻿
<a name="save"></a>
# save
> void save([MapiContactSaveRequest](MapiContactSaveRequest.md) request)

Save MAPI Contact to storage.             

### request Parameter

See parameter model documentation at [MapiContactSaveRequest](MapiContactSaveRequest.md)

### Return type

void (empty response body)

[[Back to top]](#) [[Back to Model list]](Model.md) [[Back to API README]](README.md)
