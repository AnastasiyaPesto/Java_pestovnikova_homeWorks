package ru.pestovnikova.Lesson10;

public enum TypesUsers {
    AnyUser(0),
    Manager(1),
    Admin(2);

    private int userID;

    TypesUsers(int userId) {
        this.userID = userId;
    }

    public int getUserID(){return this.userID;}
}
