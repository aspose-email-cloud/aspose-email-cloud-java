

## Documentation for API endpoints

All URIs are relative to *https://api.aspose.cloud/v3.0*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ClientThreadApi* | [**clientThreadDelete**](ClientThreadApi.md#clientthreaddelete) | **DELETE** /email/client/thread | Delete thread by id. All messages from thread will also be deleted.             
*ClientThreadApi* | [**clientThreadGetList**](ClientThreadApi.md#clientthreadgetlist) | **GET** /email/client/thread/list | Get message threads from folder. All messages are partly fetched (without email body and some other fields).             
*ClientThreadApi* | [**clientThreadGetMessages**](ClientThreadApi.md#clientthreadgetmessages) | **GET** /email/client/thread/messages | Get messages from thread by id. All messages are fully fetched. For accounts with CacheFile only cached messages will be returned.             
*ClientThreadApi* | [**clientThreadMove**](ClientThreadApi.md#clientthreadmove) | **PUT** /email/client/thread/move | Move thread to another folder.             
*ClientThreadApi* | [**clientThreadSetIsRead**](ClientThreadApi.md#clientthreadsetisread) | **PUT** /email/client/thread/set-is-read | Mark all messages in thread as read or unread.             


    
