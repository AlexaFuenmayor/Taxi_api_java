package com.example.springboot.repository;


import com.example.springboot.models.Taxi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaxiRepository extends JpaRepository <Taxi, Integer>{
}
