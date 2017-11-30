package ru.pestovnikova.Lesson4;

import java.util.Calendar;
import java.util.Date;

public class Application {
    public static void main(String[] args) {
        MessageStore myMessageStore = new MessageStore(10);

        Calendar date = Calendar.getInstance();
        // утсановили нужную нам дату регистрации пользователей
        date.set(2017,Calendar.JANUARY,1);

        // получили объект типа Date
        Date dateRegistration = date.getTime();

        // Все пользователи зарегистрировались в один день
        User user1 = new User(0, "Nastya", "Pestovnikova", "nastya@ya.ru", dateRegistration);
        User user2 = new User(1, "Ivan", "Ivanov", "ivan@ya.ru", dateRegistration);
        User user3 = new User(2, "Olga", "Larri", "olga@ya.ru", dateRegistration);
        User user4 = new User(3, "Dima", "Kopitov", "dima@ya.ru", dateRegistration);
        User user5 = new User(4, "Kostya", "Orlov", "kostya@ya.ru", dateRegistration);
        User user6 = new User(5, "Petr", "Babich", "petr@ya.ru", dateRegistration);
        User user7 = new User(6, "Vasiya", "Sobolev", "vasiya@ya.ru", dateRegistration);
        User user8 = new User(7, "Nastya", "Kornilova", "nastya@ya.ru", dateRegistration);
        User user9 = new User(8, "Natasha", "Terent'eva", "natasha@ya.ru", dateRegistration);
        User user10 = new User(9, "Valerii", "Rakov", "valera@ya.ru", dateRegistration);
        User user11 = new User(10, "Anna", "Akhmatova", "anna@ya.ru", dateRegistration);

        Message myMessage0 = new Message(0, "Privet", user1, Calendar.getInstance().getTime());
        Message myMessage1 = new Message(12, "Privet", user2, Calendar.getInstance().getTime());
        Message myMessage2 = new Message(10, "Hello", user3, Calendar.getInstance().getTime());
        Message myMessage3 = new Message(11, "Hi", user4, Calendar.getInstance().getTime());
        Message myMessage4 = new Message(7, "Sorry", user5, Calendar.getInstance().getTime());
        Message myMessage5 = new Message(5, "Who are you?", user6, Calendar.getInstance().getTime());
        Message myMessage6 = new Message(14, "What is your name?", user7, Calendar.getInstance().getTime());
        Message myMessage7 = new Message(3, "Privet my mom", user8, Calendar.getInstance().getTime());
        Message myMessage8 = new Message(8, "God", user9, Calendar.getInstance().getTime());
        Message myMessage9 = new Message(13, "Petrozavodsk", user10, Calendar.getInstance().getTime());
        Message myMessage10 = new Message(777, "ERROR", user10, Calendar.getInstance().getTime());

        myMessageStore.add(myMessage0);
        myMessageStore.add(myMessage1);
        myMessageStore.add(myMessage2);
        myMessageStore.add(myMessage3);
        myMessageStore.add(myMessage4);
        myMessageStore.add(myMessage5);
        myMessageStore.add(myMessage6);
        myMessageStore.add(myMessage7);
        myMessageStore.add(myMessage8);
        myMessageStore.add(myMessage9);
        // не добавится
        myMessageStore.add(myMessage10);
    }
}
