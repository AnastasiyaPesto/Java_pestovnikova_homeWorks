package ru.pestovnikova.Lesson10.gsonAnyUser;

import com.google.gson.*;
import ru.pestovnikova.Lesson10.AnyUser;
import ru.pestovnikova.Lesson10.TypesUsers;

import java.lang.reflect.Type;

public class ConverterAnyUserToJson implements JsonSerializer<AnyUser>, JsonDeserializer<AnyUser>{
    @Override
    public AnyUser deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject object = json.getAsJsonObject();
        String name = object.get("Name").getAsString();
        String surname = object.get("Surname").getAsString();
        Integer age = object.get("Age").getAsInt();
        return new AnyUser(name, surname, age, TypesUsers.ANY_USER);
    }

    @Override
    public JsonElement serialize(AnyUser src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject object = new JsonObject();
        object.addProperty("Name", src.getName());
        object.addProperty("Surname", src.getSurname());
        object.addProperty("Age", src.getAge());
//        object.addProperty("Bank cards:");
        return object;
    }
}
