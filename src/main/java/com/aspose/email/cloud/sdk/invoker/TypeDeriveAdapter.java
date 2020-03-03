package com.aspose.email.cloud.sdk.invoker;

import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import com.google.gson.*;

public class TypeDeriveAdapter<T> implements JsonSerializer<T>, JsonDeserializer<T>{

    private String classNameProperty;

    public TypeDeriveAdapter() {
        classNameProperty = "discriminator";
    }

    public TypeDeriveAdapter(String typeProperty) {
        classNameProperty = typeProperty;
    }

    public JsonElement serialize(T src, Type typeOfSrc,
            JsonSerializationContext context) {
        return context.serialize(src); 
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