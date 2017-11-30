package ru.pestovnikova.Lesson4;

import java.util.Date;

public class Message {
    private int messageId;
    private String text;
    private User author;
    private Date data;

    public Message(){
        messageId = 0;
        text = "";
        author = new User();
        data = new Date();
    }
    public Message(int messageId, String text, User author, Date data) {
        this.messageId = messageId;
        this.text = text;
        this.author = author;
        this.data = data;
    }

    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
