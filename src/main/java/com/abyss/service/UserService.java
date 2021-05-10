package com.abyss.service;

import com.abyss.pojo.User;

/**
 * @author mayn
 */
public interface UserService {
    /**
     * 通过姓名获取密码
     * @param userName
     * @param password
     * @return
     */
    User selectPasswordByName(String userName, String password);
}
