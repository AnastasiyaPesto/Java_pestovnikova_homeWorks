package ru.pestovnikova.Lesson10;

public enum TypesUsers {
    NOSET(0),
    ANY_USER(1),
    MANAGER(2),
    ADMIN(3);

    private int userID;

    TypesUsers(int userId) {
        this.userID = userId;
    }

    public int getUserID(){return this.userID;}

    public static TypesUsers parseIntToTypeUser(int id){
        if (id == 1) {
            return TypesUsers.ANY_USER;
        } else if (id == 2) {
            return TypesUsers.MANAGER;
        } else if (id == 3) {
            return TypesUsers.ADMIN;
        }
        return TypesUsers.NOSET;
    }
}


