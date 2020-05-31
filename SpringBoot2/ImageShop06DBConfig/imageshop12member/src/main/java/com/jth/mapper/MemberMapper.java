package com.jth.mapper;

import com.jth.domain.Member;
import com.jth.domain.MemberAuth;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberMapper {

    public Member readByUserId(String userId);

    public void create(Member member) throws Exception;

    public Member read(int userNo) throws Exception;

    public void update(Member member) throws Exception;

    public void delete(int userNo) throws Exception;

    public List<Member> list() throws Exception;

    public void createAuth(MemberAuth memberAuth) throws Exception;

    public void deleteAuth(int userNo) throws Exception;

    // 회원 테이블의 데이터 건수 반환
    public int countAll() throws Exception;

}
