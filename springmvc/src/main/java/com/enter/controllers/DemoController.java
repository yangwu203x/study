package com.enter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author leo_Yang【音特】
 * @Date 2017/9/11 0011 10:42
 */
@Controller
public class DemoController {
    @RequestMapping(value = "index",method = RequestMethod.GET)
    public String index(){
        return "demo";
    }

    @RequestMapping(value = "/hello" ,produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public String hello(){
        return "Hello World的";
    }
}
