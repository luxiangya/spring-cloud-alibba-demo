package com.example.user.inter;

import org.springframework.web.bind.annotation.GetMapping;

public interface TestInter {

    @GetMapping("getTest")
    String getTest();


}
