package com.lzw.service;

import com.lzw.pojo.User;

public interface UserService {

    /**
     * 注册用户
     * @param user
     */
    public void registUser(User user);

    /**
     * 登陆
     * @param user
     * @return  如果返回null是登陆失败，有值说明登陆成功
     */
    public User login(User user);

    /**
     * 检查用户名是否可用
     * @param username
     * @return  返回true表示用户名已存在，返回false表示用户名可用
     */
    public boolean existsUsername(String username);
}
