# MonthlyRecurrencePatternDto

Monthly recurrence pattern.             

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDay** | **String** | Represents the day of the week. Enum, available values: None, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday, Day, WeekDay, WeekendDay | 
**startOffset** | **Integer** | Start offset.              | 
**startPosition** | **String** | Day positions, typically found in a month. Enum, available values: None, First, Second, Third, Fourth, Last | 

## Parent class

See: [RecurrencePatternDto](RecurrencePatternDto.md)


## Example
```java
MonthlyRecurrencePatternDto monthlyRecurrencePatternDto = Models.monthlyRecurrencePatternDto()
    .startDay("Monday")
    .startPosition("First")
    .interval(-1)
    .weekStart("Monday")
    .build();
```


[[Back to Model list]](Models.md) [[Back to API README]](README.md)
