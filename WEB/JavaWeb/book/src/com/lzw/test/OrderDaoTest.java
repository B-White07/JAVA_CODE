package com.lzw.test;

import com.lzw.dao.OrderDao;
import com.lzw.dao.impl.OrderDaoImpl;
import com.lzw.pojo.Order;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Date;

public class OrderDaoTest {

    @Test
    public void saveOrder() {
        OrderDao orderDao = new OrderDaoImpl();
        orderDao.saveOrder(new Order("1234",new Date(),new BigDecimal(100),0,1));
    }
}