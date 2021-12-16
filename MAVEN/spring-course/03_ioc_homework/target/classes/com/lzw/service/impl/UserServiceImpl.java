// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   UserServiceImpl.java

package com.lzw.service.impl;

import com.lzw.dao.UserDao;
import com.lzw.domain.SysUser;
import com.lzw.service.UserService;

public class UserServiceImpl
	implements UserService
{

	private UserDao dao;

	public UserServiceImpl()
	{
		dao = null;
	}

	public void addUser(SysUser user)
	{
		dao.insertUser(user);
	}
}
