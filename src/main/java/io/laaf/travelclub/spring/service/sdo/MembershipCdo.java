package io.laaf.travelclub.spring.service.sdo;

import io.laaf.travelclub.spring.aggregate.club.vo.RoleInClub;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MembershipCdo implements Serializable {

    private String clubId;
    private String memberId;
    private RoleInClub role;
}
