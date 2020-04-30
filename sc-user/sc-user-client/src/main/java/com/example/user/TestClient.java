package com.example.user;

import com.example.user.inter.TestInter;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "sc-user-service")
public interface TestClient extends TestInter {
}
