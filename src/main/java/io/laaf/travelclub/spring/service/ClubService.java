package io.laaf.travelclub.spring.service;

import io.laaf.travelclub.spring.aggregate.club.TravelClub;
import io.laaf.travelclub.spring.service.sdo.TravelClubCdo;
import io.laaf.travelclub.spring.shared.NameValueList;

import java.util.List;

public interface ClubService {
    String registerClub(TravelClubCdo club);
    TravelClub findClubById(String id);
    List<TravelClub> findClubsByName(String name);
    List<TravelClub> findAll();
    void modify(String clubId, NameValueList nameValues);
    void remove(String clubId);
}
