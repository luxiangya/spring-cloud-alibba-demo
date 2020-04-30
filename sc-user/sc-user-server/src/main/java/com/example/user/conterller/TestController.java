package com.example.user.conterller;

import com.example.user.inter.TestInter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: lxy
 * @Date: 2020/4/28 10:03
 */
@RestController
public class TestController implements TestInter {

    @Override
    public String getTest() {
        return "hello word";
    }

}
