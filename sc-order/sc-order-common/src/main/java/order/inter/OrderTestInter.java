package order.inter;

import org.springframework.web.bind.annotation.GetMapping;

public interface OrderTestInter {

    @GetMapping("getOrderTest")
    String getOrderTest();
}
