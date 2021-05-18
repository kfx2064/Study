package org.hdcd.devproject.repository;

import org.hdcd.devproject.domain.Member;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.List;

public interface MemberRepository extends CrudRepository<Member, Long> {

    public List<Member> findByUserId(String userId);

    public List<Member> findByUserPw(String userPw);

    public List<Member> findByUserIdAndUserPw(String userId, String userPw);

    public List<Member> findByUserNameContaining(String userName);

    public Collection<Member> findByUserNoGreaterThan(Long userNo);

    public Page<Member> findByUserNoGreaterThan(Long userNo, Pageable pageable);

    public Collection<Member> findByUserNoGreaterThanOrderByUserNoDesc(Long userNo);

    public List<Member> findByUserNoGreaterThanOrderByUserNoDesc(Long userNo, Pageable pageable);

    public List<Member> findMemberByUserId(String userId);

}
