package controllers;


import com.example.springboot.models.Taxi;
import com.example.springboot.repository.TaxiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("taxis")
public class TaxiControllers {

    @Autowired
    private TaxiRepository repository;

    @GetMapping("/")
    public List<Taxi> List(){
        return repository.findAll();
    }

}
