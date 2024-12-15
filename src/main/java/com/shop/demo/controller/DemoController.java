package com.shop.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("startdemo")
    String demo() {

        return "It's demo";
    }
}
