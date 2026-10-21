package com.dogsAndOwners.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DogRepository extends JpaRepository<Dog, Integer> {
    @Query(value = "SELECT AVG(Age) FROM dogs", nativeQuery = true)
    public double getAverageDogAge();
}