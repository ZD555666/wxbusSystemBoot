package com.cykj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @version 1.0
 * @author: ZD
 * @date: 2021/7/23 16:13
 * @desc:
 */
@RestController
public class wxTest {


    @RequestMapping("/test")
    public String getParam( String name,Integer age){
        System.out.println(132);
        return "45613";
    }

}
