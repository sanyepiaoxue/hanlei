package com.han.myboot.web;

import com.han.myboot.exception.BusinessException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String test(){
        if (true){
            throw new BusinessException("500","自定义异常500");
        }
        return "index";
    }
}
