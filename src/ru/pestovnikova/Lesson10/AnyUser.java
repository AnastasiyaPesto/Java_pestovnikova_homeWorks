package ru.pestovnikova.Lesson10;

import com.google.gson.stream.JsonReader;
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

    /**
     * Writes the user to a file with an extension
     * @param   file the file where the recording will be made
     * @throws  IOException
     */
    public void writeAnyUserToFile(File file) throws IOException {
        try (JsonWriter writer = new JsonWriter(new BufferedWriter(new FileWriter(file, true)))){
             writer.setIndent("   ");
            writer.beginObject();
            writer.name("Name").value(getName());
            writer.name("Surname").value(getSurname());
            writer.name("Age").value(getAge());
            writeBankCardArray(writer);
            writer.endObject();
        }
    }

    /**
     *  Add to JsonWriter an array of bank cards this user
     * @param   writer class JsonWriter in library Gson
     * @throws  IOException
     */
    private void writeBankCardArray(JsonWriter writer) throws IOException {
        writer.name("Bank cards");
        writer.beginArray();
        for (BankCard bankCardIter : bankCardsList) {
            writeBankCard(writer, bankCardIter);
        }
        writer.endArray();
    }

    /**
     *  Add to JsonWriter bank card
     * @param   writer class JsonWriter in library Gson
     * @param   bankCard user's bank card
     * @throws  IOException
     */
    private void writeBankCard (JsonWriter writer, BankCard bankCard) throws IOException {
        writer.beginObject();
        writer.name("Card number").value(bankCard.getCardNumber());
        writer.name("CVV").value(bankCard.getCodeCVV());
        writer.name("Balance").value(bankCard.getBalance());
        writer.endObject();
    }

    public void readAnyUserFromFile(File file) throws IOException {
        try (JsonReader reader = new JsonReader(new BufferedReader(new FileReader(file)))){
            reader.beginObject();
            while (reader.hasNext()){
                String name = reader.nextName();
                if (name.equals("Name")) {
                    setName(reader.nextString());
                } else if (name.equals("Surname")) {
                    setSurname(reader.nextString());
                } else if (name.equals("Age")) {
                    setAge(reader.nextInt());
                } else if (name.equals("Bank cards")) {
                    readBankCardArray(reader);
                } else {
                    reader.skipValue();
                }
            }
            reader.endObject();
        }
    }

    private void readBankCardArray(JsonReader reader) throws IOException {
        if (bankCardsList == null){
            bankCardsList = new ArrayList<BankCard>();
        }
        reader.beginArray();
        while (reader.hasNext()) {
            bankCardsList.add(readBankCard(reader));
        }
        reader.endArray();
    }

    private BankCard readBankCard (JsonReader reader) throws IOException {
        reader.beginObject();
        BankCard bankCard = new BankCard();
        while (reader.hasNext()) {
            String name =   reader.nextName();
            if (name.equals("Card number")) {
                bankCard.setCardNumber(reader.nextLong());
            } else if (name.equals("CVV")) {
                bankCard.setCodeCVV(reader.nextInt());
            } else if (name.equals("Balance")) {
                bankCard.setBalance((float) reader.nextDouble());
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return bankCard;
    }
}
