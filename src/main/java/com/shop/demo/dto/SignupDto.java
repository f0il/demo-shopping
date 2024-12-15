package com.shop.demo.dto;
import lombok.Data;

@Data
public class SignupDto {
    private String memberId;

    private String memberPassword;

    private String memberName;

    private String memberType;
}
