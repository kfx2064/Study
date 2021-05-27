package org.hdcd.devproject;

import org.hdcd.devproject.domain.Address;
import org.hdcd.devproject.domain.Member;
import org.hdcd.devproject.repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
public class MemberTests {

    @Autowired
    MemberRepository memberRepository;

}
