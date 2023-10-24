package com.example.Hackaton;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HackatonRepository extends JpaRepository<Hackaton,Integer> {

}
