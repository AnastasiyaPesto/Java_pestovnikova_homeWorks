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

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof PrivateMessage)) return false;

        PrivateMessage other = (PrivateMessage) obj;
        return user.equals(other.user);
    }

    public int hashCode(){
        int result = 17;
        return (31 * result + user.hashCode());
    }

    public User getUser(){
        return user;
    }

    public void setUser(User user){
        this.user = user;
    }
}
