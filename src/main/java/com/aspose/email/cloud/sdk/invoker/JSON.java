/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="JSON.java">
*   Copyright (c) 2018-2019 Aspose Pty Ltd.
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

import com.aspose.email.cloud.sdk.model.BaseObject;

import com.google.gson.*;

import java.lang.reflect.Type;

/**
 * JSON helper class.
 */
public class JSON {
    private static class BaseObjectAdapter implements JsonSerializer<BaseObject>, JsonDeserializer<BaseObject>{

        private static final String CLASSNAME = "type";

        public JsonElement serialize(BaseObject src, Type typeOfSrc,
                JsonSerializationContext context) {
            String className = src.getClass().getSimpleName();
            src.setType(className);
            return context.serialize(src); 
        }

        public BaseObject deserialize(JsonElement json, Type typeOfT,
                JsonDeserializationContext context) throws JsonParseException  {
            JsonObject jsonObject = json.getAsJsonObject();
            JsonPrimitive prim = (JsonPrimitive) jsonObject.get(CLASSNAME);
            String className = "com.aspose.email.cloud.sdk.model." + prim.getAsString();

            Class<?> klass = null;
            try {
                klass = Class.forName(className);
            } catch (ClassNotFoundException e) {
                throw new JsonParseException(e.getMessage());
            }
            return context.deserialize(jsonObject, klass);
        }
    }

    private static Gson gsonExt;

    static {
        GsonBuilder builder = new GsonBuilder();
        builder.registerTypeAdapter(BaseObject.class, new JSON.BaseObjectAdapter());
        gsonExt = builder.create();
    }
    public static String serialize(Object object)
    {
        return gsonExt.toJson(object);
    }

    public static <T> T deserialize(String json, Class<T> type)
    {
        return gsonExt.fromJson(json, type);
    }
}
