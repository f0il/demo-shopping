package com.shop.demo.service;


import com.shop.demo.dao.Member;
import com.shop.demo.dto.LoginDto;
import com.shop.demo.dto.SignupDto;
import com.shop.demo.service.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class MemberService {
    @Autowired
    MemberRepository memberRepository;

    public boolean signup(SignupDto request) {

        try {
            memberRepository.save(new Member(request.getMemberName(), request.getMemberId(), request.getMemberPassword(), request.getMemberType()));
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public boolean login(LoginDto request) {
        try {
            return memberRepository.existsByMemberIdAndMemberPassword(request.getMemberId(), request.getMemberPassword());
        } catch (Exception e) {
            return false;
        }

    }

}
