package ru.pestovnikova.Lesson10;

import com.google.gson.stream.JsonWriter;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

import static ru.pestovnikova.Lesson10.gsonAnyUser.JsonWriterAnyUser.writeBankCard;

public class AnyUser extends User {
    // todo
    private ArrayList<BankCard> bankCardsList;
    // сделать map вместо id (ключ - фамилия имя?)

    public AnyUser(String name, String surname, int age, TypesUsers viewUser) {
        super(name, surname, age, viewUser);
    }

    public AnyUser() { super(); }

    public void addNewBankCard(long cardNum, int cvv) {
        BankCard bankCard = new BankCard(getName(), getSurname(), cardNum, cvv, 0);
        if (bankCardsList == null) {
            bankCardsList = new ArrayList<BankCard>();
        }
        bankCardsList.add(bankCard);
    }

    public ArrayList<BankCard> getBankCardsList() {
        return bankCardsList;
    }

    public void writeNewCardDB(BankCard bankCard) throws IOException {

    }

    public void writeAnyUserToTXT(File file) throws IOException {
        try (JsonWriter writer = new JsonWriter(new BufferedWriter(new FileWriter(file)))){
            writer.setIndent("   ");
            writer.beginObject();
            writer.name("Name").value(getName());
            writer.name("Surname").value(getSurname());
            writer.name("Age").value(getAge());
            writeBankCardArray(writer);
            writer.endObject();
        }
    }

    private void writeBankCardArray(JsonWriter writer) throws IOException {
        writer.name("Bank cards");
        writer.beginArray();
        for (BankCard bankCardIter : bankCardsList) {
            writeBankCard(writer, bankCardIter);
        }
        writer.endArray();
    }

    private void writeBankCard (JsonWriter writer, BankCard bankCard) throws IOException {
        writer.beginObject();
        writer.name("Card number").value(bankCard.getCardNumber());
        writer.name("CVV").value(bankCard.getCodeCVV());
        writer.name("Balance").value(bankCard.getBalance());
        writer.endObject();
    }
}
