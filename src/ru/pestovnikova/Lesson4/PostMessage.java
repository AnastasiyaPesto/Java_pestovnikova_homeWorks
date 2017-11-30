package ru.pestovnikova.Lesson4;

import java.util.Date;

public class PostMessage extends Message{
    private Post post;

    PostMessage(int messageId, String text, User author, Date data, Post post){
        super(messageId, text, author, data);
        this.post = post;
    }

    public Post getPost(){
        return post;
    }

    public void setPost(Post post){
        this.post = post;
    }
}
