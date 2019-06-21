package com.xiaowu5759;

import com.xiaowu5759.mapper.AddressMapper;
import com.xiaowu5759.pojo.Address;
import com.xiaowu5759.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestDynamicSql {

    @Test
    public void m1() {
        // 按照我们的id查询
        SqlSession sqlSession = MybatisUtil.getSeesion();
        AddressMapper mapper = sqlSession.getMapper(AddressMapper.class);

        List<Address> addressList = mapper.queryByConutryCity("Comanche", "Lavton");

        System.out.println(addressList.toString());
        sqlSession.close();

    }

    @Test
    public void m2() {
        // 按照我们的id查询
        SqlSession sqlSession = MybatisUtil.getSeesion();
        AddressMapper mapper = sqlSession.getMapper(AddressMapper.class);

//        List<Address> addressList = mapper.queryByConutryCity("Comanche", null);

        // 打印sql语句

        List<Address> addressList = mapper.queryByConutryCity("Comanche", "");

        //会返回两条数据值
        System.out.println(addressList.toString());
        sqlSession.close();

    }

    @Test
    public void m3() {

        SqlSession sqlSession = MybatisUtil.getSeesion();
        AddressMapper mapper = sqlSession.getMapper(AddressMapper.class);

        Address address = new Address();
        address.setAddrId(5L);
        address.setCity("aa");
        address.setCountry("zhongguo");
        address.setState("A");
        address.setStreet("xinfudajie");
//        address.setZip(124001);
        mapper.update(address);
        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void m4() {

        SqlSession sqlSession = MybatisUtil.getSeesion();
        AddressMapper mapper = sqlSession.getMapper(AddressMapper.class);

        // 按照先后顺序 选择一个和 if不同的地方
        Address ad = new Address();
        ad.setState("San Diego");
        ad.setCountry("CA");
        ad.setCity("San Diego");
        List<Address> addressList = mapper.queryByConutryCity2(ad);
        System.out.println(addressList.toString());
        sqlSession.close();

    }

    @Test
    public void m5() {

        SqlSession sqlSession = MybatisUtil.getSeesion();
        AddressMapper mapper = sqlSession.getMapper(AddressMapper.class);
        Address ad = new Address();
//        ad.setState("CA");
        ad.setCountry("San Diego");
//        ad.setCity("San Diego");
        List<Address> addressList = mapper.queryTrim(ad);
        System.out.println(addressList.toString());
        sqlSession.close();

    }

    @Test
    public void m6() {

        SqlSession sqlSession = MybatisUtil.getSeesion();
        AddressMapper mapper = sqlSession.getMapper(AddressMapper.class);

        List<Long> list = new ArrayList<>();
        list.add(1L);
        list.add(2L);
        list.add(3L);
        List<Address> addressList = mapper.queryByIds(list);
        System.out.println(addressList.toString());

        sqlSession.close();

    }

    @Test
    public void m7() {

        //模糊查询解决方案一：在应用程序层面加入%%拼接
        //模糊查询 二：通过mysql函数来完成concat（）
        //解决方案 三：通过bind标签，对变量重新绑定，再进行引用

        SqlSession sqlSession = MybatisUtil.getSeesion();
        AddressMapper mapper = sqlSession.getMapper(AddressMapper.class);

        List<Address> addressList = mapper.queryLike("Law");

        System.out.println(addressList.toString());
        sqlSession.close();

    }

    @Test
    public void m8() {

        SqlSession sqlSession = MybatisUtil.getSeesion();
        AddressMapper mapper = sqlSession.getMapper(AddressMapper.class);

        List<Address> addressList = mapper.listAll();
        System.out.println(addressList.toString());
        sqlSession.close();

        SqlSession sqlSession1 = MybatisUtil.getSeesion();
        AddressMapper mapper1 = sqlSession1.getMapper(AddressMapper.class);

        /*
        一级缓存是会话级别的

        如果开启了二级缓存，
        先去二级缓存当中尝试命中
        如果也无法命中
        尝试去以及缓存当中命中
        还不命中，再去数据库查询
         */

        // 缓存失效 一： 如果在查询之后，进行了增删改行为，缓存会失效
        // 缓存失效 二：强制刷新缓存
//        sqlSession.clearCache(); 这是清空所有

        List<Address> addressList2 = mapper1.listAll();
        System.out.println(addressList2.toString());

        sqlSession.close();
    }

    //二级缓存实验
    @Test
    public void m9() {
        SqlSession sqlSession = MybatisUtil.getSeesion();
        AddressMapper mapper = sqlSession.getMapper(AddressMapper.class);
        SqlSession sqlSession2 = MybatisUtil.getSeesion();
        AddressMapper mapper2 = sqlSession2.getMapper(AddressMapper.class);

        mapper.listAll();
        sqlSession.close();
        mapper2.listAll();
//        System.out.println(addressList.toString());
//        System.out.println(addressList1.toString());


        sqlSession2.close();

    }
}
