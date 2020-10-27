
# MapiCalendarTimeZoneInfoDto
## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bias** | **Integer** | Time zone&#39;s offset in minutes from UTC.              | 
**daylightBias** | **Integer** | Offset in minutes from lBias during daylight saving time.              | 
**daylightDate** | [**MapiCalendarTimeZoneRuleDto**](MapiCalendarTimeZoneRuleDto.md) | Date and local time that indicate when to begin using the DaylightBias.              |  [optional]
**standardBias** | **Integer** | Offset in minutes from lBias during standard time.              | 
**standardDate** | [**MapiCalendarTimeZoneRuleDto**](MapiCalendarTimeZoneRuleDto.md) | Date and local time that indicate when to begin using the StandardBias.              |  [optional]
**timeZoneFlags** | **List&lt;String&gt;** | Individual bit flags that specify information about this TimeZoneRule.              Items: Enumerates the individual bit flags that specify information about TimeZoneRule Enum, available values: TzRuleFlagRecurCurrentTzReg, TzRuleFlagEffectiveTzReg |  [optional]
**year** | **Integer** | Year in which this rule is scheduled to take effect.              | 




[[Back to Model list]](Models.md) [[Back to API README]](README.md)

