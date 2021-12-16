package com.lzw.dao.impl;

import com.lzw.dao.UserDao;
import com.lzw.domain.SysUser;
import org.springframework.stereotype.Repository;

@Repository("oracleDao")
public class OracleDaoImpl implements UserDao {

    @Override
    public void insertUser(SysUser user) {
        System.out.println("Oracle数据库连接");
    }
}
