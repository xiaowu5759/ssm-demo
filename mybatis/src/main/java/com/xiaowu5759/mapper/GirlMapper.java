package com.xiaowu5759.mapper;

import com.xiaowu5759.pojo.A;
import com.xiaowu5759.pojo.B;
import com.xiaowu5759.pojo.Girl;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface GirlMapper {
    int insert(Girl girl);

    // 查询一个girl对象,通过主键
    Girl queryById(Long id);

    Girl queryById2(long id);

    Girl queryByName(String name);

    /**
     * 加上一个注解 @Param，
     *
     * @param name
     * @param flower
     * @return
     */
    Girl queryByNameFlower(@Param("name1") String name, @Param("flower1") String flower);

    Girl queryByNameFlower2(Girl girl);

    Girl queryByNameFlower3(Map<String, Object> map);

    Girl queryByAB(@Param("A") A a, @Param("B") B b);

}
