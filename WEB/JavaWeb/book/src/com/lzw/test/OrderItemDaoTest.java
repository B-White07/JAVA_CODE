package com.lzw.test;

import com.lzw.dao.OrderItemDao;
import com.lzw.dao.impl.OrderItemDaoImpl;
import com.lzw.pojo.OrderItem;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class OrderItemDaoTest {

    @Test
    public void saveOrderItem() {
        OrderItemDao orderItemDao = new OrderItemDaoImpl();
        orderItemDao.saveOrderItem(new OrderItem(null,"Java",1,new BigDecimal(100),new BigDecimal(100),"1234"));
        orderItemDao.saveOrderItem(new OrderItem(null,"Java1",2,new BigDecimal(100),new BigDecimal(100),"1234"));
        orderItemDao.saveOrderItem(new OrderItem(null,"Java2",1,new BigDecimal(100),new BigDecimal(100),"1234"));
    }
}