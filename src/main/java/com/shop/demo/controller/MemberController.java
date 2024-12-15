package com.shop.demo.controller;

import com.shop.demo.dto.LoginDto;
import com.shop.demo.dto.SignupDto;
import com.shop.demo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MemberController {

    @Autowired
    MemberService memberService;

    @PostMapping("signup")
    public String signUp(@RequestBody SignupDto request) {
        boolean signuped = memberService.signup(request);
        if(signuped) {
            return "환영합니다.";
        } else {
            return "등록실패했습니다.";
        }
    }

    @PostMapping("login")
    public String login(@RequestBody LoginDto request) {
        boolean logined = memberService.login(request);
        if(logined) {
            return "반갑습니다.";
        } else {
            return "등록되지 않은 사용자입니다.";
        }

    }
}
