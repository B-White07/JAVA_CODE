package com.lzw.service;

import com.lzw.pojo.Cart;

public interface OrderService {
    public String createOrder(Cart cart,Integer userId);
}
