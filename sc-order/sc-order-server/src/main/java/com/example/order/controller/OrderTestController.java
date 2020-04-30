package com.example.order.controller;

import com.example.user.TestClient;
import order.inter.OrderTestInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: lxy
 * @Date: 2020/4/28 11:15
 */
@RestController
public class OrderTestController implements OrderTestInter {

    @Autowired
    private TestClient testClient;

    @Override
    public String getOrderTest() {

        return "hello word orderTest"+testClient.getTest() ;
    }
}
