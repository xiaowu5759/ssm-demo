package com.xiaowu5759;

import com.xiaowu5759.mapper.UserMapper;
import com.xiaowu5759.pojo.UserBlog;
import com.xiaowu5759.pojo.UserWithDetial;
import com.xiaowu5759.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class Test03 {

    @Test
    public void m1(){
        SqlSession sqlSession = MybatisUtil.getSeesion();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        // 修改resultMap 返回的值任然是我们的userWithDetial
        UserWithDetial userWithDetial = mapper.queryById(1L);
//        System.out.println(userWithDetial.getPassward());
        System.out.println(userWithDetial);
        sqlSession.close();

    }

    @Test
    public void m2(){
        SqlSession sqlSession = MybatisUtil.getSeesion();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        UserWithDetial userWithDetial = mapper.queryByStep(1L);
//        System.out.println(userWithDetial.getPassward());
        System.out.println(userWithDetial);
        sqlSession.close();

    }

    @Test
    public void m3(){
        SqlSession sqlSession = MybatisUtil.getSeesion();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        UserBlog userBlog = mapper.queryByIdWithBlog(1L);
        System.out.println(userBlog.getPhone() + userBlog.getBlogs());
        sqlSession.close();

    }
}
