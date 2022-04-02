package io.laaf.travelclub.spring.service.logic;

import io.laaf.travelclub.spring.aggregate.club.TravelClub;
import io.laaf.travelclub.spring.service.ClubService;
import io.laaf.travelclub.spring.service.sdo.TravelClubCdo;
import io.laaf.travelclub.spring.shared.NameValueList;
import io.laaf.travelclub.spring.store.ClubStore;
import io.laaf.travelclub.spring.util.exception.NoSuchClubException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClubServiceLogic implements ClubService {

    private ClubStore clubStore;

    public ClubServiceLogic(ClubStore clubStore) {
        this.clubStore = clubStore;
    }

    @Override
    public String registerClub(TravelClubCdo club) {
        TravelClub newClub = new TravelClub(club.getName(), club.getIntro());
        newClub.checkValidation();
        return clubStore.create(newClub);
    }

    @Override
    public TravelClub findClubById(String id) {

        return clubStore.retrieve(id);
    }

    @Override
    public List<TravelClub> findClubsByName(String name) {

        return clubStore.retrieveByName(name);
    }

    @Override
    public List<TravelClub> findAll() {
        return clubStore.retrieveAll();
    }

    @Override
    public void modify(String clubId, NameValueList nameValues) {
        TravelClub foundedClub = clubStore.retrieve(clubId);
        if (foundedClub == null) {
            throw new NoSuchClubException("No such club with id: " + clubId);
        }
        foundedClub.modifyValues(nameValues);
        clubStore.update(foundedClub);
    }

    @Override
    public void remove(String clubId) {
        if (!clubStore.exists(clubId)) {
            throw new NoSuchClubException("No such club with id : " + clubId);
        }
        clubStore.delete(clubId);
    }
}
