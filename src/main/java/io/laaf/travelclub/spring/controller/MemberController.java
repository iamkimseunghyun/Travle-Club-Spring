package io.laaf.travelclub.spring.controller;

import io.laaf.travelclub.spring.aggregate.club.CommunityMember;
import io.laaf.travelclub.spring.service.MemberService;
import io.laaf.travelclub.spring.service.sdo.MemberCdo;
import io.laaf.travelclub.spring.shared.NameValueList;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/member")
public class MemberController {

    private MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping // localhost:8090/member
    public String register(@RequestBody MemberCdo memberCdo) {
        return memberService.registerMember(memberCdo);
    }

    @GetMapping("/{memberId}")
    public CommunityMember findMemberById(@PathVariable String memberId) {
        return memberService.findMemberById(memberId);
    }

    @GetMapping("/{memberEmail}")
    public CommunityMember findMemberByEmail(@PathVariable String memberEmail) {
        return memberService.findMemberByEmail(memberEmail);
    }

    @GetMapping
    public List<CommunityMember> findMemberByName(@RequestParam String memberName) {
        return memberService.findMembersByName(memberName);
    }

    @PutMapping("/{memberId}")
    public void modifyMember(@PathVariable String memberId, @RequestBody NameValueList member) {
        memberService.modifyMember(memberId, member);
    }

    @DeleteMapping("/{memberId}")
    public void removeMember(@PathVariable String memberId) {
        memberService.removeMember(memberId);
    }
}
