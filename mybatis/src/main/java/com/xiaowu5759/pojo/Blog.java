package com.xiaowu5759.pojo;

import java.util.List;

public class Blog {

    private Long blogId;
    private String title;
    private String summary;
    private String content;
    private User user;

    // 为了体现blog和comment的关系
    // 一篇博客 有多个评论

    private List<Comment> comments;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public Long getBlogId() {
        return blogId;
    }

    public void setBlogId(Long blogId) {
        this.blogId = blogId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getuId() {
        return user;
    }

    public void setuId(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "blogId=" + blogId +
                ", title='" + title + '\'' +
                ", summary='" + summary + '\'' +
                ", content='" + content + '\'' +
                ", user=" + user +
                ", comments=" + comments +
                '}';
    }
}
