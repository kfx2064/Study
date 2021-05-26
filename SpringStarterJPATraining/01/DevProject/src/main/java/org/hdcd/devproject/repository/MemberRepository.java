package org.hdcd.devproject.repository;

import org.hdcd.devproject.domain.Member;
import org.springframework.data.repository.CrudRepository;

public interface MemberRepository extends CrudRepository<Member, Long> {

}
