package ru.pestovnikova.Lesson10;

public class BankCard
{
    private int ID;
    private String name;
    private String surname;
    private long cardNumber;
    private short codeCVV;
    private float balance;
    // TODO-me добавить "до какой даты действительна"

    public BankCard(int id, String name, String surname, long cardNumber, short codeCVV, float balance) {
        this.ID = id;
        this.name = name;
        this.surname = surname;
        this.cardNumber = cardNumber;
        this.codeCVV = codeCVV;
        this.balance = balance;
    }

    public BankCard() {
        this.ID = 0;
        this.name = "";
        this.surname = "";
        this.cardNumber = 0;
        this.codeCVV = 0;
        this.balance = 0;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setCodeCVV(short codeCVV) {
        this.codeCVV = codeCVV;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getName() {

        return name;
    }

    public String getSurname() {
        return surname;
    }


    public long getCardNumber() {
        return cardNumber;
    }

    public short getCodeCVV() {
        return codeCVV;
    }

    public float getBalance() {
        return balance;
    }

    public int getID() {
        return ID;
    }

    public void setID(int id) {
        this.ID = id;
    }

    @Override
    public String toString() {
        return "BankCard{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", cardNumber=" + cardNumber +
                ", codeCVV=" + codeCVV +
                ", balance=" + balance +
                '}';
    }
}
