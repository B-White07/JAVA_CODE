package com.lzw.service.impl;

import com.lzw.service.SomeService;
import com.lzw.utils.ServiceTools;

import java.util.Date;

//  不修改service的代码，也能实现输出日志，事务的功能。
public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome() {
        System.out.println("执行doSome");
    }

    @Override
    public void doOther() {
        System.out.println("执行doOther");
    }
}
