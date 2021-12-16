package com.lzw.threadlocal;

public class OrderDao {
    public  void saveOrder(){
        String name = Thread.currentThread().getName();
        System.out.println("OrderDao[" + name +"]保存的数据是：" + ThreadLocalTest.threadLocal.get());
    }
}
