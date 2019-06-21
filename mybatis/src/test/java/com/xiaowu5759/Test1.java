package com.xiaowu5759;

import com.xiaowu5759.mapper.GirlMapper;
import com.xiaowu5759.pojo.A;
import com.xiaowu5759.pojo.B;
import com.xiaowu5759.pojo.Girl;
import com.xiaowu5759.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Test1 {

    @Test
    public void m1() {
        SqlSession sqlSession = MybatisUtil.getSeesion();

        GirlMapper mapper = sqlSession.getMapper(GirlMapper.class);
        Girl g = new Girl();
        g.setName("liu");
        g.setFlower("chaochao");
        g.setBirthday(new Date());

        mapper.insert(g);
        sqlSession.commit();

        sqlSession.close();

    }

    @Test
    public void m2() {
        SqlSession sqlSession = MybatisUtil.getSeesion();

        GirlMapper mapper = sqlSession.getMapper(GirlMapper.class);

        Girl girl = mapper.queryById(1L);
        System.out.println(girl.getName());

        sqlSession.close();

    }

    @Test
    public void m3() {
        SqlSession sqlSession = MybatisUtil.getSeesion();

        GirlMapper mapper = sqlSession.getMapper(GirlMapper.class);

        Girl girl = mapper.queryByNameFlower("xinru", "huojianhua");
        System.out.println(girl.getBirthday());

        sqlSession.close();

    }

    @Test
    public void m4() {
        SqlSession sqlSession = MybatisUtil.getSeesion();
        GirlMapper mapper = sqlSession.getMapper(GirlMapper.class);

        Girl g =  new Girl();
        g.setName("xinru");
        g.setFlower("huojianhua");
        Girl girl = mapper.queryByNameFlower2(g);
        System.out.println(girl.getBirthday());

        sqlSession.close();

    }

    @Test
    public void m5() {
        SqlSession sqlSession = MybatisUtil.getSeesion();

        GirlMapper mapper = sqlSession.getMapper(GirlMapper.class);

//        Girl g =  new Girl();
        // map封装方法 是一个万能方法
        Map<String, Object> map = new HashMap<>();
        map.put("name", "ruhua");
        map.put("flower", "huojianhua");

        Girl girl = mapper.queryByNameFlower3(map);

        System.out.println(girl.getBirthday());

        sqlSession.close();

    }

    @Test
    public void m6() {
        SqlSession sqlSession = MybatisUtil.getSeesion();
        GirlMapper mapper = sqlSession.getMapper(GirlMapper.class);

        A a = new A();
        B b = new B();
        a.setName("ruhua");
        b.setFlower("huojianhua");

        Girl girl = mapper.queryByAB(a, b);

        System.out.println(girl.getBirthday());

        sqlSession.close();

    }
}
