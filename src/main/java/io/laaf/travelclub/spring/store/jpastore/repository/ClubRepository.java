package io.laaf.travelclub.spring.store.jpastore.repository;

import io.laaf.travelclub.spring.store.jpastore.jpao.TravelClubJpo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClubRepository extends JpaRepository<TravelClubJpo, String> {
    List<TravelClubJpo> findAllByName(String name);
}




