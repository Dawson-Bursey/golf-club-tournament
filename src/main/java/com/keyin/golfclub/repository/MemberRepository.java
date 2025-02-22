package com.keyin.golfclub.repository;

import com.keyin.golfclub.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {
    List<Member> searchByFirstName(String firstName);
    // Add custom query methods if needed
}




