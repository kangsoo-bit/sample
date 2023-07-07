package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DemoController {
    @RequestMapping("/hello")
    public String index() {
        return "안녕? 제임스딘! 반가워요~ ㅋㅋㅋ";
    }

}

record Prescription (Integer orderID, String OrderName, Double OrderQty){}