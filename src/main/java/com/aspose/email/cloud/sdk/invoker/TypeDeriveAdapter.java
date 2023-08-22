/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="TypeDeriveAdapter.java">
*   Copyright (c) 2018-2023 Aspose Pty Ltd. All rights reserved.
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
package com.aspose.email.cloud.sdk.invoker;

import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import com.google.gson.*;

public class TypeDeriveAdapter<T> implements JsonSerializer<T>, JsonDeserializer<T>{

    private String classNameProperty;
    private Gson gson;

    public TypeDeriveAdapter() {
        classNameProperty = "discriminator";
        gson = new Gson();
    }

    public TypeDeriveAdapter(String typeProperty) {
        classNameProperty = typeProperty;
        gson = new Gson();
    }

    public JsonElement serialize(T src, Type typeOfSrc,
            JsonSerializationContext context) {
        return gson.toJsonTree(src);
    }

    public T deserialize(JsonElement json, Type typeOfT,
            JsonDeserializationContext context) throws JsonParseException  {
        JsonObject jsonObject = json.getAsJsonObject();
        Class<?> klass = null;
        JsonPrimitive prim = (JsonPrimitive) jsonObject.get(classNameProperty);
        if (prim != null)
        {
            String className = "com.aspose.email.cloud.sdk.model." + prim.getAsString();
            try {
                klass = Class.forName(className);
            } catch (ClassNotFoundException e) {
                throw new JsonParseException(e.getMessage());
            }
        } else {
            klass = typeOfT.getClass();
        }
        return context.deserialize(jsonObject, klass);
    }
}
