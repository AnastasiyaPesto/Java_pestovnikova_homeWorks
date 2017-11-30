package ru.pestovnikova.Lesson4;

import java.util.Date;

public class PostMessage extends Message{
    private Post post;

    PostMessage(int messageId, String text, User author, Date data, Post post){
        super(messageId, text, author, data);
        this.post = post;
    }

    public boolean equals(Object obj){
        if(this == obj) return true;

        if(!(obj instanceof PostMessage)) return false;

        PostMessage other = (PostMessage)obj;

        return post.equals(other.post);
    }

    public int hashCode(){
        int result = 17;

        result = 31 * result + post.hashCode();

        return result;
    }

    public Post getPost(){
        return post;
    }

    public void setPost(Post post){
        this.post = post;
    }
}
