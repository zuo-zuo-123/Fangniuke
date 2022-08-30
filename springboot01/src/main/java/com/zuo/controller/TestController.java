package com.zuo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author zuozuo
 * @Date 2022 08 27
 * @Description:
 */
@Controller
@RequestMapping("/test")
public class TestController {
    @RequestMapping("/hello")
    @ResponseBody
    public String test01() {
        return "hello springboot";
    }
}
