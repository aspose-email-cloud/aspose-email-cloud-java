# YearlyRecurrencePatternDto

Yearly recurrence pattern.             

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDay** | **String** | Represents the day of the week. Enum, available values: None, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday, Day, WeekDay, WeekendDay | 
**startMonth** | **String** | Represents a calendar month. Enum, available values: None, January, February, March, April, May, June, July, August, September, October, November, December | 
**startOffset** | **Integer** | Start offset.              | 
**startPosition** | **String** | Day positions, typically found in a month. Enum, available values: None, First, Second, Third, Fourth, Last | 

## Parent class

See: [RecurrencePatternDto](RecurrencePatternDto.md)


## Example
```java
YearlyRecurrencePatternDto yearlyRecurrencePatternDto = Models.yearlyRecurrencePatternDto()
    .startMonth("January")
    .startOffset(30)
    .interval(-1)
    .weekStart("Monday")
    .build();
```


[[Back to Model list]](Models.md) [[Back to API README]](README.md)
