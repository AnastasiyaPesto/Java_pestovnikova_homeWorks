package ru.pestovnikova.Lesson4;


import java.util.Date;

public class Post {
    private int postId;
    private String title;
    private Date postedAt;

    public Post(int postId, String title, Date postedAt) {
        this.postId = postId;
        this.title = title;
        this.postedAt = postedAt;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getPostedAt() {
        return postedAt;
    }

    public void setPostedAt(Date postedAt) {
        this.postedAt = postedAt;
    }
}
