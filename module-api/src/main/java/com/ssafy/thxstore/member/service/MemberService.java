package com.ssafy.thxstore.member.service;

import com.ssafy.thxstore.member.dto.Member;
import com.ssafy.thxstore.member.dto.MemberDto;
import com.ssafy.thxstore.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Component
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    @Transactional
    public void join(MemberDto form) {

        System.out.println("서비스 들어왔니?");

        Member member = Member.builder().
                email(form.getEmail()).
                password(form.getPassword()).
                nickName(form.getNickName()).
                build();

        memberRepository.save(member);
    }
}
