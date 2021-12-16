package com.gcl.module.service.impl;

import com.gcl.module.dao.IUserDao;
import com.gcl.module.domain.Users;
import com.gcl.module.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao iUserDao;

    public List<Users> findAll() throws Exception {
        System.out.println("进入service");
        return iUserDao.findAll();
    }
}
