package org.hdcd.devproject;

import org.hdcd.devproject.domain.Board;
import org.hdcd.devproject.domain.Member;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
public class LombokTests {

    @Test
    public void testBoardBuilder() {
        Board board = Board.builder()
            .boardNo(1)
            .title("title1")
            .content("content1")
            .writer("writer1")
            .regDate(LocalDateTime.now())
            .build();

        System.out.println(board);
    }

    @Test
    public void testMemberBuilder() {
        Member member = Member.builder()
                .userId("userId1")
                .password("password1")
                .build();

        System.out.println(member);
    }

}
