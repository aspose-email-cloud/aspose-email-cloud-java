
# WeeklyRecurrencePatternDto

Weekly recurrence pattern.             

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDays** | **List&lt;String&gt;** | Start days              Items: Represents the day of the week. Enum, available values: None, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday, Day, WeekDay, WeekendDay |  [optional]

## Parent class

See: [RecurrencePatternDto](RecurrencePatternDto.md)


## Example
```java
WeeklyRecurrencePatternDto weeklyRecurrencePatternDto = Models.weeklyRecurrencePatternDto()
    .startDays(Arrays.<CalendarDay>asList(
        "Tuesday",
        "Thursday"))
    .interval(-1)
    .occurs(10)
    .weekStart("Sunday")
    .build();
```


[[Back to Model list]](Models.md) [[Back to API README]](README.md)

