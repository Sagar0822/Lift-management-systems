package com.mockSpring1.Lift.management.systems;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Lift-passenger")
public class LmsController {

    @Autowired
    LmsService service;

    //add Lift
    @PostMapping("/addLift")
    public String addLift(@RequestBody Lift lift){
        service.addLift(lift);
        return "Lift added successfully";
    }
    //add passenger
    @PostMapping("/addPassenger")
    public String addPassenger(@RequestBody Passenger passenger){
        service.addPassenger(passenger);
        return "Passenger added successfully";
    }
    //1. Delete all passengers with IDs less than 5
    @DeleteMapping("/delete")
    public String deletePassenger(){
        service.deletePassenger();
        return "Deleted successfully";
    }

    //2. Find the maximum number of people with weight X that can travel in a given lift M
    @GetMapping("/get-people")
    public int getPeopleWithWeightX(int weightX, int liftNoM){
        return service.getPeopleWithWeightX(weightX, liftNoM);
    }

    //3. Find the number of people with a weight greater than 50 in a given lift M
    @GetMapping("/get-people-weight-greater-50")
    public int getPeopleWeightGreaterThan50(int liftNoM){
        return service.getPeopleWeightGreaterThan50(liftNoM);
    }
}
