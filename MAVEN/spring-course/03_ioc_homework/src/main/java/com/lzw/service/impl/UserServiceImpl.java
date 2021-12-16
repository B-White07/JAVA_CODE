package com.lzw.service.impl;

import com.lzw.dao.UserDao;
import com.lzw.domain.SysUser;
import com.lzw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {
    //  引用类型，在xml文件中给属性赋值，要求属性需要有set方法
    @Resource(name = "oracleDao")
/*    @Autowired()
    @Qualifier("oracleDao")*/
    private UserDao dao = null;

    //public UserServiceImpl(){}

 /*   public UserServiceImpl(UserDao dao) {
        this.dao = dao;
    }*/

/*    public void setDao(UserDao dao) {
        this.dao = dao;
    }*/

    @Override
    public void addUser(SysUser user) {
        dao.insertUser(user);
    }
}
