package com.example.springboot.controllers;

import com.example.springboot.models.Trajectories;
import com.example.springboot.repository.TrajectoriesRepository;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("trajectories")
public class TrajectoriesControllers {
    @Id
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "taxi_id")
    @JsonIgnore

    @Autowired
    private TrajectoriesRepository repository;

    @GetMapping("/")
    public  List<Trajectories> list(@RequestParam Integer taxi_id){
        return repository.trajectoriesList(taxi_id);
    }
}