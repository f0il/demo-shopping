package com.shop.demo.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.shop.demo.dao.*;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
    boolean existsByMemberIdAndMemberPassword(String memberId, String memberPassword);

}