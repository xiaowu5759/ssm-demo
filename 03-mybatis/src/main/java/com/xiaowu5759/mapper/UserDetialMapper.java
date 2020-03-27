package com.xiaowu5759.mapper;

import com.xiaowu5759.pojo.UserDetial;
import org.apache.ibatis.annotations.Param;

public interface UserDetialMapper {

    UserDetial queryByUserId(@Param("uId") Long uId);
}
