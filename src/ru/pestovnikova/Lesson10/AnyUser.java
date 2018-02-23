package ru.pestovnikova.Lesson10;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class AnyUser extends User {
    private ArrayList<BankCard> bankCardsList;
    private int ID;
    private BankCard bankCard;

    public AnyUser(String name, String surname, int age, TypesUsers viewUser) {
        super(name, surname, age, viewUser);
        ID = new Random().nextInt();
        bankCard = new BankCard();
    }

    public AnyUser() { super(); }

    public int getID() {
        return ID;
    }

    // TODO-me как обработать если bankCard == null ?
    public void add(BankCard bankCard) throws IOException {
        if (bankCardsList == null) {
            bankCardsList = new ArrayList<BankCard>();
        }
        bankCardsList.add(bankCard);
        writeNewCardDB(bankCard);
    }

    public void writeNewCardDB(BankCard bankCard) throws IOException {
        File fileBankCards = new File("BankCards" + getName() + getSurname() +  ".txt");
        if (bankCard != null) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileBankCards))) {
                writer.write(bankCard.getName() + "/" + bankCard.getSurname() + "/"
                        + bankCard.getCardNumber() + "/" + bankCard.getCodeCVV());
            }
        }
    }
}
