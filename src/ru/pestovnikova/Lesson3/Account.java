package ru.pestovnikova.Lesson3;

public class Account {
    String user;
    double balance;
    // default constructor
    Account(){
        user = "";
        balance = 0;
    }
    // constructor parametrs
    Account(String nameUser, double balanceUser){
        user = nameUser;
        balance = balanceUser;
    }
    // method print()
    void print(){
        System.out.println("Пользователь: " + user + '\n' + "Баланс: " + balance);
    }
}
