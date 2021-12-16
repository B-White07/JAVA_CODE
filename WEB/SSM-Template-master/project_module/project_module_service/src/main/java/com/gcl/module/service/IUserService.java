package com.gcl.module.service;

import com.gcl.module.domain.Users;

import java.util.List;

public interface IUserService {

    List<Users> findAll() throws Exception;
}
