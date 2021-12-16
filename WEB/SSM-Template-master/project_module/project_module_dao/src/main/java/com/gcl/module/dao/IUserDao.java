package com.gcl.module.dao;

import com.gcl.module.domain.Users;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IUserDao {

    @Select("select * from users")
    public List<Users> findAll();
}
