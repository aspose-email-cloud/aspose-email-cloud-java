# RecurrencePatternDto

iCalendar recurrence pattern.             

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**interval** | **Integer** | Number of recurrence units.              | 
**occurs** | **Integer** | Number of occurrences of the recurrence pattern.              | 
**endDate** | [**Date**](Date.md) | End date.              | 
**weekStart** | **String** | Represents the day of the week. Enum, available values: None, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday, Day, WeekDay, WeekendDay | 
**discriminator** | **String** |  | 



## Example
```java
RecurrencePatternDto recurrencePatternDto = Models.recurrencePatternDto()
    .interval(-1)
    .weekStart("Monday")
    .build();
```


[[Back to Model list]](Models.md) [[Back to API README]](README.md)
