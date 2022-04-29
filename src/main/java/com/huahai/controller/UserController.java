package com.huahai.controller;


import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author yao
 * @since 2022-04-29
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

}
