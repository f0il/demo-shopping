package com.shop.demo.dao;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Comment;

import java.time.OffsetDateTime;

@Data
@Entity(name="member")
public class Member {
    @Id
    @Column(length = 10, nullable = false)
    @Comment("유저 인덱스")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int memberIndex;

    @Column(name = "member_name", length = 50, nullable = false)
    @Comment("사용자명")
    private String memberName;

    @Column(name = "member_id", length = 50, nullable = false)
    @Comment("아이디")
    private String memberId;

    @Column(name = "member_password", length = 255, nullable = false)
    @Comment("비밀번호")
    private String memberPassword;

    @Column(name = "member_type", nullable = false)
    @Comment("사용자 형식")
    private String memberType;

    @Column(name = "member_cdt", nullable = false)
    @Comment("생성일시")
    private OffsetDateTime memberCdt = OffsetDateTime.now();

    public Member(String memberName, String memberId, String memberPassword, String memberType) {
        this.memberName = memberName;
        this.memberId = memberId;
        this.memberPassword = memberPassword;
        this.memberType = memberType;
    }

    public Member() {

    }
}

