# EmailConfigDiscoverRequest

Request model for EmailConfigApi.discover

## Properties

Name | Type | Description | Notes
---- | ---- | ----------- | -----
**address** | **String**| Email address. |
**fastProcessing** | **Boolean**| Turns on fast processing. All discover systems will run in parallel. First discovered result will be returned.              | [optional] [default to false]

## Example
```java
EmailConfigDiscoverRequest request = Models.emailConfigDiscoverRequest()
    .address("address@gmail.com")
    .build();
```

