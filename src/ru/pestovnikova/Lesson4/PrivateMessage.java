package ru.pestovnikova.Lesson4;

import java.util.Date;

public class PrivateMessage extends Message {
    private User user;

    PrivateMessage(){
        user = new User();
    }

    public PrivateMessage(int messageId, String text, User author, Date data, User user) {
        super(messageId, text, author, data);
        this.user = user;
    }

    public User getUser(){
        return user;
    }

    public void setUser(User user){
        this.user = user;
    }
}
