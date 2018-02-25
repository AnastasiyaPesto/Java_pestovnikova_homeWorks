package ru.pestovnikova.Lesson10;

public class User {
    private String name;
    private String surname;
    private int age;
    /** Вид пользователя: обычный, админ, менеджер */
    private TypesUsers viewUser;

    public User(String name, String surname, int age, TypesUsers viewUser) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.viewUser = viewUser;
    }

    public User() {
        this.name = "";
        this.surname = "";
        this.age = 0;
        this.viewUser = TypesUsers.NOSET;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // TODO-me обработка возраста
        // написать buider pattern
        if (age >= 18){
            this.age = age;
        }
    }

    public TypesUsers getViewUser() {
        return viewUser;
    }

    public void setViewUser(TypesUsers viewUser) {
        this.viewUser = viewUser;
    }

}
