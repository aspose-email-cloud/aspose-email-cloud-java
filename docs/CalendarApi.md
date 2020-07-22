# CalendarApi

            ﻿
<a name="asAlternate"></a>
# asAlternate
> [AlternateView](AlternateView.md) asAlternate([CalendarAsAlternateRequest](CalendarAsAlternateRequest.md) request)

Convert iCalendar to AlternateView             

### request Parameter

See parameter model documentation at [CalendarAsAlternateRequest](CalendarAsAlternateRequest.md)

### Return type

[**AlternateView**](AlternateView.md)

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)
            ﻿
<a name="asFile"></a>
# asFile
> byte[] asFile([CalendarAsFileRequest](CalendarAsFileRequest.md) request)

Converts calendar model to specified format and returns as file.             

### request Parameter

See parameter model documentation at [CalendarAsFileRequest](CalendarAsFileRequest.md)

### Return type

**byte[]**

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)
            ﻿
<a name="asMapi"></a>
# asMapi
> [MapiCalendarDto](MapiCalendarDto.md) asMapi([CalendarDto](CalendarDto.md) calendarDto)

Converts CalendarDto to MapiCalendarDto.             

### calendarDto Parameter

See parameter model documentation at [CalendarDto](CalendarDto.md)

### Return type

[**MapiCalendarDto**](MapiCalendarDto.md)

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)
            ﻿
<a name="convert"></a>
# **convert**
> byte[] convert(CalendarConvertRequest request)

Converts calendar document to specified format and returns as file.             

### **CalendarConvertRequest** Parameters
```java
public CalendarConvertRequest(
    String format, 
    byte[] file)
```

Name | Type | Description | Notes
---- | ---- | ----------- | -----
 **format** | **String**| File format. Enum, available values: Ics, Msg |
 **file** | **byte[]**| File to convert |

### Return type

**byte[]**

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

            ﻿
<a name="fromFile"></a>
# **fromFile**
> [CalendarDto](CalendarDto.md) fromFile(CalendarFromFileRequest request)

Converts calendar document to a model representation.             

### **CalendarFromFileRequest** Parameters
```java
public CalendarFromFileRequest(
    byte[] file)
```

Name | Type | Description | Notes
---- | ---- | ----------- | -----
 **file** | **byte[]**| File to convert |

### Return type

[**CalendarDto**](CalendarDto.md)

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

            ﻿
<a name="get"></a>
# **get**
> [CalendarDto](CalendarDto.md) get(CalendarGetRequest request)

Get calendar file from storage.             

### **CalendarGetRequest** Parameters
```java
public CalendarGetRequest(
    String name, 
    String folder, 
    String storage)
```

Name | Type | Description | Notes
---- | ---- | ----------- | -----
 **name** | **String**| iCalendar file name in storage. |
 **folder** | **String**| Path to folder in storage. | [optional]
 **storage** | **String**| Storage name. | [optional]

### Return type

[**CalendarDto**](CalendarDto.md)

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

            ﻿
<a name="getAsAlternate"></a>
# **getAsAlternate**
> [AlternateView](AlternateView.md) getAsAlternate(CalendarGetAsAlternateRequest request)

Get iCalendar from storage as AlternateView             

### **CalendarGetAsAlternateRequest** Parameters
```java
public CalendarGetAsAlternateRequest(
    String name, 
    String calendarAction, 
    String sequenceId, 
    String folder, 
    String storage)
```

Name | Type | Description | Notes
---- | ---- | ----------- | -----
 **name** | **String**| iCalendar file name in storage |
 **calendarAction** | **String**| iCalendar method type Enum, available values: Create, Update, Cancel |
 **sequenceId** | **String**| The sequence id | [optional]
 **folder** | **String**| Path to folder in storage | [optional]
 **storage** | **String**| Storage name | [optional]

### Return type

[**AlternateView**](AlternateView.md)

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

            ﻿
<a name="getAsFile"></a>
# **getAsFile**
> byte[] getAsFile(CalendarGetAsFileRequest request)

Converts calendar document from storage to specified format and returns as file.             

### **CalendarGetAsFileRequest** Parameters
```java
public CalendarGetAsFileRequest(
    String fileName, 
    String format, 
    String storage, 
    String folder)
```

Name | Type | Description | Notes
---- | ---- | ----------- | -----
 **fileName** | **String**| Calendar document file name. |
 **format** | **String**| File format. Enum, available values: Ics, Msg |
 **storage** | **String**| Storage name. | [optional]
 **folder** | **String**| Path to folder in storage. | [optional]

### Return type

**byte[]**

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

            ﻿
<a name="getList"></a>
# **getList**
> [CalendarStorageList](CalendarStorageList.md) getList(CalendarGetListRequest request)

Get iCalendar list from storage folder.             

### **CalendarGetListRequest** Parameters
```java
public CalendarGetListRequest(
    String folder, 
    Integer itemsPerPage, 
    Integer pageNumber, 
    String storage)
```

Name | Type | Description | Notes
---- | ---- | ----------- | -----
 **folder** | **String**| Path to folder in storage. |
 **itemsPerPage** | **Integer**| Count of items on page. | [optional] [default to 10]
 **pageNumber** | **Integer**| Page number. | [optional] [default to 0]
 **storage** | **String**| Storage name. | [optional]

### Return type

[**CalendarStorageList**](CalendarStorageList.md)

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)

            ﻿
<a name="save"></a>
# save
> void save([CalendarSaveRequest](CalendarSaveRequest.md) request)

Save iCalendar             

### request Parameter

See parameter model documentation at [CalendarSaveRequest](CalendarSaveRequest.md)

### Return type

void (empty response body)

[[Back to top]](#) [[Back to Model list]](Models.md) [[Back to API README]](README.md)
