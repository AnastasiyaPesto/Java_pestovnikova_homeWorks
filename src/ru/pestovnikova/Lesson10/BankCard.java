package ru.pestovnikova.Lesson10;

public class BankCard
{
    private String name;
    private String surname;
    private long cardNumber;
    private short codeCVV;
    private float balance;
    // TODO-me добавить "до какой даты действительна"

    public BankCard(String name, String surname, long cardNumber, short codeCVV, float balance) {
        this.name = name;
        this.surname = surname;
        this.cardNumber = cardNumber;
        this.codeCVV = codeCVV;
        this.balance = balance;
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
