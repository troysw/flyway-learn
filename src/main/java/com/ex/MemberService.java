package com.ex;

import com.ex.entity.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

  private final MemberRepository memberRepository;

  public void addUser() {
    Member member = new Member();
    memberRepository.save(member);
  }

}
