package io.laaf.travelclub.spring.controller;


import io.laaf.travelclub.spring.aggregate.club.TravelClub;
import io.laaf.travelclub.spring.service.ClubService;
import io.laaf.travelclub.spring.service.sdo.TravelClubCdo;
import io.laaf.travelclub.spring.shared.NameValueList;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/club")
@RestController
public class ClubController {

    private ClubService clubService;

    public ClubController(ClubService clubService) {
        this.clubService = clubService;
    }

    @PostMapping //localhost:8090/club
    public String register(@RequestBody TravelClubCdo travelClubCdo) {
        return clubService.registerClub(travelClubCdo);
    }

    @GetMapping("/all")
    public List<TravelClub> findAll() {
        return clubService.findAll();
    }

    @GetMapping("/{clubId}")
    public TravelClub find(@PathVariable String clubId) {
        return clubService.findClubById(clubId);
    }

    @GetMapping // localhost:8090/club?name=JavaClub
    public List<TravelClub> findByName(@RequestParam String name) {
        return clubService.findClubsByName(name);
    }

    @PutMapping("/{clubId}")
    public void modify(@PathVariable String clubId, @RequestBody NameValueList nameValueList) {
        clubService.modify(clubId, nameValueList);
    }

    @DeleteMapping("/{clubId}")
    public void delete(@PathVariable String clubId) {
        clubService.remove(clubId);
    }
}
