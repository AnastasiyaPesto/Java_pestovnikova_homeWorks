package ru.pestovnikova.Lesson10;

public class Administrator extends User {

    public Administrator(String name, String surname, int age, TypesUsers viewUser) {
        super(name, surname, age, viewUser);
    }

    public Administrator() { super(); }
}
