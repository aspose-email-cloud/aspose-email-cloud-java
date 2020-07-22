
# com.aspose.email.cloud.sdk.model.MapiCalendarRecurrencePatternDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**calendarType** | **String** | Enumerated the calendar type of the mapi recurrence Enum, available values: Default, CalGregorian, CalGregorianUs, CalJapan, CalTaiwan, CalKorea, CalHijri, CalThai, CalHebrew, CalGregorianMeFrench, CalGregorianArabic, CalGregorianXLitEnglish, CalGregorianXLitFrench, CalLunarJapanese, CalChineseLunar, CalSaka, CalLunarEtoChn, CalLunarEtoKor, CalLunarRokuyou, CalLunarKorean, CalUmAlQura | 
**deletedInstanceDates** | [**List&lt;Date&gt;**](Date.md) | An array of dates, each of which is the original instance date of either a deleted instance or a modified instance for this recurrence.              |  [optional]
**endDate** | [**Date**](Date.md) | End date of an item recurrence pattern.              | 
**endType** | **String** | Enumerates the ending type for the recurrence. Enum, available values: None, EndAfterDate, EndAfterNOccurrences, NeverEnd | 
**exceptions** | [**List&lt;MapiCalendarExceptionInfoDto&gt;**](MapiCalendarExceptionInfoDto.md) | An exception specifies changes to an instance of a recurring series.              |  [optional]
**frequency** | **String** | Enumerates mapi calendar recurrence frequency Enum, available values: None, Daily, Weekly, Monthly, Yearly | 
**modifiedInstanceDates** | [**List&lt;Date&gt;**](Date.md) | An array of dates, each of which is the date of a modified instance.              |  [optional]
**occurrenceCount** | **Long** | Number of occurrences in a recurrence.              | 
**patternType** | **String** | Enumerates the mapi calendar recurrence pattern types Enum, available values: Day, Week, Month, MonthEnd, MonthNth, HjMonth, HjMonthNth, HjMonthEnd | 
**period** | **Long** | Interval at which the meeting pattern repeats.              | 
**slidingFlag** | **Boolean** | Defines whether pattern is sliding or not.              | 
**startDate** | [**Date**](Date.md) | Start date of an item recurrence pattern.              | 
**weekStartDay** | **String** | Day of week. Enum, available values: Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday | 
**discriminator** | **String** |  | 


    
    


    
    


    
    


    
    


    
    


    
    


    
    


    
    


    
    


    
    


    
    


    
    


    
    


    
    


[[Back to Model list]](README.md#documentation-for-models) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to API README]](README.md)

