package com.xiaowu5759.pojo;


import java.util.List;

// 为了描述关系 一种集成关系
public class UserBlog extends User {

    // 这是一种反向关联？
    // 在user当中 应该是持有一堆博客
//    private Blog  blog;
//
//    public Blog getBlog() {
//        return blog;
//    }
//
//    public void setBlog(Blog blog) {
//        this.blog = blog;
//    }
    private List<Blog> blogs;

    public List<Blog> getBlogs() {
        return blogs;
    }

    public void setBlogs(List<Blog> blogs) {
        this.blogs = blogs;
    }
}
