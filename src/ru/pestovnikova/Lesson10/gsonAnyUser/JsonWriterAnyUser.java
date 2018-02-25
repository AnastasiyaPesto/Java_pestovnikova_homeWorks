package ru.pestovnikova.Lesson10.gsonAnyUser;

import com.google.gson.stream.JsonWriter;
import ru.pestovnikova.Lesson10.AnyUser;
import ru.pestovnikova.Lesson10.BankCard;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class JsonWriterAnyUser {
    public static void writeJsonAnyUser(File file, AnyUser anyUser) throws IOException{
        try (JsonWriter writer = new JsonWriter(new BufferedWriter(new FileWriter(file, false)))){
            writer.setIndent("   ");
            writer.beginObject();
            writer.name("Name").value(anyUser.getName());
            writer.name("Surname").value(anyUser.getSurname());
            writer.name("Age").value(anyUser.getAge());
            writeBankCardArray(writer, anyUser.getBankCardsList());
            writer.endObject();
        }
    }

    public static void writeBankCardArray(JsonWriter writer, ArrayList<BankCard> cardList) throws IOException{
        writer.name("Bank cards");
        writer.beginArray();
        for (BankCard bankCardIter : cardList) {
            writeBankCard(writer, bankCardIter);
        }
        writer.endArray();
    }

    public static void writeBankCard(JsonWriter writer, BankCard bankCard) throws IOException {
        writer.beginObject();
        writer.name("Card number").value(bankCard.getCardNumber());
        writer.name("CVV").value(bankCard.getCodeCVV());
        writer.name("Balance").value(bankCard.getBalance());
        writer.endObject();
    }
}
