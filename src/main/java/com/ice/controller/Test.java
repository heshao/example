package com.ice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 你好
 */
@Controller
public class Test {

    @RequestMapping("")
    public String test() {
        return "index";
    }
}
