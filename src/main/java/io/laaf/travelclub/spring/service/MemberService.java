package io.laaf.travelclub.spring.service;

import io.laaf.travelclub.spring.aggregate.club.CommunityMember;
import io.laaf.travelclub.spring.service.sdo.MemberCdo;
import io.laaf.travelclub.spring.shared.NameValueList;

import java.util.List;

public interface MemberService {
    //
    String registerMember(MemberCdo member);
    CommunityMember findMemberById(String memberId);
    CommunityMember findMemberByEmail(String memberEmail);
    List<CommunityMember> findMembersByName(String name);
    void modifyMember(String memberId, NameValueList member);
    void removeMember(String memberId);
}
