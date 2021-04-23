package com.ssafy.thxstore.controller.member;

import com.ssafy.thxstore.member.dto.MemberDto;
import com.ssafy.thxstore.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RequiredArgsConstructor
@RestController
public class MemberController {

    private final MemberService memberService;

    /**
     * 맴버 생성 db에 넣어주기
     * */
    @PostMapping("/members/join")
    public ResponseEntity<String> join(@RequestBody MemberDto form){
        System.out.println("들어왔냐?");
        memberService.join(form);
        return new ResponseEntity<>("success", HttpStatus.OK);
    }

    @GetMapping(value = "/demo")
    public String demo(){
        return "hello world";
    }

}
