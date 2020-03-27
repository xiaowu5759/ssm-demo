package com.xiaowu5759.mapper;

import com.xiaowu5759.pojo.UserBlog;
import com.xiaowu5759.pojo.UserWithDetial;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    UserWithDetial queryById(@Param("id") Long id);

    UserWithDetial queryByStep(@Param("id") Long id);

    UserBlog queryByIdWithBlog(@Param("uId") Long uId);

}
