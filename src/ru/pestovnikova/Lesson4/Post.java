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

    public boolean equals(Object obj){
        if (this == obj) return true;

        if (!(obj instanceof Post)){
            return false;
        }

        Post other = (Post) obj;
        return (postId == other.postId)
                && (title.equals(other.title)
                && postedAt.equals(other.postedAt));
    }

    public int hashCode(){
        int result = 17;

        result = 31 * result + postId;
        result = 31 * result + title.hashCode();
        result = 31 * result + postedAt.hashCode();

        return result;
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
