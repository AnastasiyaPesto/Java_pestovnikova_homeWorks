package ru.pestovnikova.Lesson10.gsonAnyUser;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import jdk.nashorn.internal.ir.debug.JSONWriter;
import ru.pestovnikova.Lesson10.AnyUser;
import ru.pestovnikova.Lesson10.TypesUsers;

import java.io.*;

public class example {
    public static void main(String[] args) throws IOException {
        AnyUser anyUserWrite = new AnyUser("Ivan", "Zentsov", 27, TypesUsers.ANY_USER);
        anyUserWrite.addNewBankCard(11112222, 123);
        anyUserWrite.addNewBankCard(798566253, 553);
        File fileAnyUser = new File(anyUserWrite.getName() + anyUserWrite.getSurname() + ".txt");

        // Вариант записи через JsonWriterAnyUser
//        JsonWriterAnyUser.writeJsonAnyUser(fileAnyUser, anyUser);
        anyUserWrite.writeAnyUserToFile(fileAnyUser);

        AnyUser anyUserRead = new AnyUser();
        anyUserRead.readAnyUserFromFile(fileAnyUser);

        // Вариант записи через ConverterAnyUserToJson
//        GsonBuilder builder = new GsonBuilder();
//        builder.registerTypeAdapter(AnyUser.class, new ConverterAnyUserToJson());
//        // читаемый вид (с пробелами)
//        Gson gson = builder.setPrettyPrinting().create();
//        String json = gson.toJson(anyUser);
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileAnyUser))) {
//            writer.write(json);
//        }
        // Считывание
//        JsonReader reader = new JsonReader(new FileReader(fileAnyUser));
//        AnyUser anyUserFromJson = gson.fromJson(reader, AnyUser.class);
// }


    }
}

