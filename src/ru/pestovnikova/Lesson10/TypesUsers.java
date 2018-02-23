package ru.pestovnikova.Lesson10;

public enum TypesUsers {
    NOSET(0),
    ANYUSER(1),
    MANAGER(2),
    ADMIN(3);

    private int userID;

    TypesUsers(int userId) {
        this.userID = userId;
    }

    public int getUserID(){return this.userID;}
}


