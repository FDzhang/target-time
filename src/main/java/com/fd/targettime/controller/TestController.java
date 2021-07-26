package com.fd.targettime.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : zxq
 * @create : 2021/6/27 13:14
 */
@RestController
@Api(value = "TestController")
public class TestController {

    @GetMapping("/test")
    @ApiOperation("test方法")
    public String test(){
        return "success";
    }
}
