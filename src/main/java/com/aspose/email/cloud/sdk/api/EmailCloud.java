/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="EmailCloud.java">
*   Copyright (c) 2020 Aspose Pty Ltd. All rights reserved.
* </copyright>
* <summary>
*   Permission is hereby granted, free of charge, to any person obtaining a copy
*  of this software and associated documentation files (the "Software"), to deal
*  in the Software without restriction, including without limitation the rights
*  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
*  copies of the Software, and to permit persons to whom the Software is
*  furnished to do so, subject to the following conditions:
*
*  The above copyright notice and this permission notice shall be included in all
*  copies or substantial portions of the Software.
*
*  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
*  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
*  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
*  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
*  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
*  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
*  SOFTWARE.
* </summary>
* --------------------------------------------------------------------------------------------------------------------
*/

package com.aspose.email.cloud.sdk.api;

import com.aspose.email.cloud.sdk.model.*;
import com.aspose.email.cloud.sdk.invoker.*;
import com.aspose.email.cloud.sdk.invoker.internal.*;
import com.aspose.email.cloud.sdk.invoker.internal.requesthandlers.*;
import java.io.*;

import java.util.HashMap;

/**
 * Aspose.Email Cloud API
 */
public class EmailCloud {
    private Configuration configuration;
    private ApiInvoker apiInvoker;

    
    private CalendarApi calendar;
    
    private ContactApi contact;
    
    private EmailApi email;
    
    private DisposableEmailApi disposableEmail;
    
    private EmailConfigApi emailConfig;
    
    
    private MapiGroup mapi;
    
    private ClientGroup client;
    
    private AiGroup ai;
    
    private CloudStorageGroup cloudStorage;
    

    
    /**
     *  iCalendar document operations.
     */
    public CalendarApi calendar() {
        return calendar;
    }
    
    /**
     *  Contact document operations. Supported formats: VCard, MSG, WebDav
     */
    public ContactApi contact() {
        return contact;
    }
    
    /**
     *  Email document (*.eml) operations.
     */
    public EmailApi email() {
        return email;
    }
    
    /**
     *  Check email address is disposable operations
     */
    public DisposableEmailApi disposableEmail() {
        return disposableEmail;
    }
    
    /**
     *  Email server configuration discovery.
     */
    public EmailConfigApi emailConfig() {
        return emailConfig;
    }
    

    
    /**
     *  MAPI operations.
     */
    public MapiGroup mapi() {
        return mapi;
    }
    
    /**
     *  Builtin Email client operations.
     */
    public ClientGroup client() {
        return client;
    }
    
    /**
     *  AI powered operations.
     */
    public AiGroup ai() {
        return ai;
    }
    
    /**
     *  Cloud file storage operations.
     */
    public CloudStorageGroup cloudStorage() {
        return cloudStorage;
    }
    


    /**
     * Initializes a new instance of the EmailCloud class.
     * @param clientSecret The client secret.
     * @param clientId The client id.
     */
    public EmailCloud(String clientSecret, String clientId)
    {
        Configuration configuration = new Configuration();
        configuration.ClientSecret = clientSecret;
        configuration.ClientId = clientId;
        this.init(configuration);
    }

    /**
     * Initializes a new instance of the EmailCloud class.
     * @param configuration The API configuration.
     */
    public EmailCloud(Configuration configuration)
    {
        this.init(configuration);
    }

    /**
     * Initializes a new instance of the EmailApi class.
     * @param configuration Configuration settings.
     */
    private void init(Configuration configuration)
    {
        this.configuration = configuration;
        int handlersCount = configuration.OnPremise ? 2 : 3;
        IRequestHandler[] requestHandlers = new IRequestHandler[handlersCount];
        requestHandlers[--handlersCount] = new ApiExceptionRequestHandler();
        requestHandlers[--handlersCount] = new DebugLogRequestHandler(this.configuration);
        if (!configuration.OnPremise)
        {
            requestHandlers[--handlersCount] = new AuthRequestHandler(this.configuration);
        }
        
        this.apiInvoker = new ApiInvoker(requestHandlers, this.configuration);

    
        calendar = new CalendarApi(apiInvoker, configuration);
    
        contact = new ContactApi(apiInvoker, configuration);
    
        email = new EmailApi(apiInvoker, configuration);
    
        disposableEmail = new DisposableEmailApi(apiInvoker, configuration);
    
        emailConfig = new EmailConfigApi(apiInvoker, configuration);
    
    
        mapi = new MapiGroup(apiInvoker, configuration);
    
        client = new ClientGroup(apiInvoker, configuration);
    
        ai = new AiGroup(apiInvoker, configuration);
    
        cloudStorage = new CloudStorageGroup(apiInvoker, configuration);
    

    }
}