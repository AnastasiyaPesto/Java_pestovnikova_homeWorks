package ru.pestovnikova.Lesson10;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

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
        File fileBankCards = new File("BankCards" + getName() + getSurname() +  ".txt");
        if (bankCard != null) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileBankCards))) {
                writer.write(bankCard.getName() + "/" + bankCard.getSurname() + "/"
                        + bankCard.getCardNumber() + "/" + bankCard.getCodeCVV());
            }
        }
    }
}
