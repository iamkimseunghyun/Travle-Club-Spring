package io.laaf.travelclub.spring;

import io.laaf.travelclub.spring.aggregate.club.CommunityMember;
import io.laaf.travelclub.spring.aggregate.club.Membership;
import io.laaf.travelclub.spring.aggregate.club.TravelClub;
import io.laaf.travelclub.spring.service.ClubService;
import io.laaf.travelclub.spring.service.MemberService;
import io.laaf.travelclub.spring.service.sdo.MemberCdo;
import io.laaf.travelclub.spring.service.sdo.TravelClubCdo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.Date;

@SpringBootApplication
public class TravelClubApp {
    public static void main(String[] args) {
        SpringApplication.run(TravelClubApp.class);


//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//
//        String[] beanNames = context.getBeanDefinitionNames();
////        System.out.println(Arrays.toString(beanNames));
//
//        MemberService memberService = context.getBean("memberServiceLogic", MemberService.class);
//
//        String memberId = memberService.registerMember(
//                new MemberCdo(
//                        "test@nextree.io",
//                        "Kim",
//                        "Test Member",
//                        "010-0100-0000",
//                        "2022.02.10"));
//
//        CommunityMember foundedMember = memberService.findMemberById(memberId);
//        System.out.println(foundedMember.toString());


//        TravelClubCdo clubCdo = new TravelClubCdo("TravelClub", "TestTravelClub");
//        ClubService clubService = context.getBean("clubService", ClubService.class);
//
//        String clubId = clubService.registerClub(clubCdo);
//
//        TravelClub foundedClub = clubService.findClubById(clubId);
//        System.out.println("Club name " + foundedClub.getName());
//        System.out.println("Club intro " + foundedClub.getIntro());
//        System.out.println("Club foundationTime" + new Date(foundedClub.getFoundationTime()));


    }
}
