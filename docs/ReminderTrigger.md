# ReminderTrigger

Specifies when an alarm will trigger.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dateTime** | [**Date**](Date.md) | A trigger set to an absolute date/time. | 
**duration** | **Long** | Specifies a relative time in ticks for the trigger of the alarm.              |  [optional]
**related** | **String** | Specify the relationship of the alarm trigger with respect to the start or end of the event. Enum, available values: Start, End | 



## Example
```java
ReminderTrigger reminderTrigger = Models.reminderTrigger()
    .dateTime(Calendar.getInstance().getTime())
    .duration(600000000)
    .build();
```


[[Back to Model list]](Models.md) [[Back to API README]](README.md)
