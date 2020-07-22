# MapiCalendarApi

            ﻿
<a name="asCalendarDto"></a>
# asCalendarDto
> [CalendarDto](CalendarDto.md) asCalendarDto([MapiCalendarDto](MapiCalendarDto.md) mapiCalendarDto)

Converts MAPI calendar model to CalendarDto model.             

### mapiCalendarDto Parameter

See parameter model documentation at [MapiCalendarDto](MapiCalendarDto.md)

### Return type

[**CalendarDto**](CalendarDto.md)

[[Back to top]](#) [[Back to Model list]](Model.md) [[Back to API README]](README.md)
            ﻿
<a name="asFile"></a>
# asFile
> byte[] asFile([MapiCalendarAsFileRequest](MapiCalendarAsFileRequest.md) request)

Converts MAPI calendar model to specified format and returns as file.             

### request Parameter

See parameter model documentation at [MapiCalendarAsFileRequest](MapiCalendarAsFileRequest.md)

### Return type

**byte[]**

[[Back to top]](#) [[Back to Model list]](Model.md) [[Back to API README]](README.md)
            ﻿
<a name="fromFile"></a>
# **fromFile**
> [MapiCalendarDto](MapiCalendarDto.md) fromFile(MapiCalendarFromFileRequest request)

Converts calendar file to a MAPI model representation.             

### **MapiCalendarFromFileRequest** Parameters
```java
public MapiCalendarFromFileRequest(
    byte[] file)
```

Name | Type | Description | Notes
---- | ---- | ----------- | -----
 **file** | **byte[]**| File to convert |

### Return type

[**MapiCalendarDto**](MapiCalendarDto.md)

[[Back to top]](#) [[Back to Model list]](Model.md) [[Back to API README]](README.md)

            ﻿
<a name="get"></a>
# **get**
> [MapiCalendarDto](MapiCalendarDto.md) get(MapiCalendarGetRequest request)

Get MAPI calendar document.             

### **MapiCalendarGetRequest** Parameters
```java
public MapiCalendarGetRequest(
    String name, 
    String folder, 
    String storage)
```

Name | Type | Description | Notes
---- | ---- | ----------- | -----
 **name** | **String**| Calendar file name in storage. |
 **folder** | **String**| Path to folder in storage. | [optional]
 **storage** | **String**| Storage name. | [optional]

### Return type

[**MapiCalendarDto**](MapiCalendarDto.md)

[[Back to top]](#) [[Back to Model list]](Model.md) [[Back to API README]](README.md)

            ﻿
<a name="save"></a>
# save
> void save([MapiCalendarSaveRequest](MapiCalendarSaveRequest.md) request)

Save MAPI Calendar to storage.             

### request Parameter

See parameter model documentation at [MapiCalendarSaveRequest](MapiCalendarSaveRequest.md)

### Return type

void (empty response body)

[[Back to top]](#) [[Back to Model list]](Model.md) [[Back to API README]](README.md)
