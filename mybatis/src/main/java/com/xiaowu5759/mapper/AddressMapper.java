package com.xiaowu5759.mapper;

import com.xiaowu5759.pojo.Address;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AddressMapper {
    Address queryById(Long id);

    // 新建一个集合
    List<Address> queryByConutryCity(@Param("country") String country, @Param("city") String city);

    int update(Address address);

    List<Address> queryByConutryCity2(Address address);

    List<Address> queryTrim(Address address);

    List<Address> queryByIds(List<Long> list);

    // 模糊查询
    List<Address> queryLike(@Param("city") String city);

    List<Address> listAll();
}
