package com.abyss.mapper;

import com.abyss.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author mayn
 */
@Mapper
@Repository
public interface UserMapper {
    /**
     * 通过名字获取密码
     * @param userName
     * @param password
     * @return
     */
    User selectPasswordByName(@Param("userName") String userName, @Param("password") String password);
}
