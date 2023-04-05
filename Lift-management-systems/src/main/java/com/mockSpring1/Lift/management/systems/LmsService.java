package com.mockSpring1.Lift.management.systems;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LmsService {

    @Autowired
    LmsRepository repository;

    public void addLift(Lift lift){
        repository.addLift(lift);
    }

    public void addPassenger(Passenger passenger){
        repository.addPassenger(passenger);
    }

    public void deletePassenger(){
        repository.deletePassenger();
    }

    public int getPeopleWithWeightX(int weightX, int liftNoM){
        return repository.getPeopleWithWeightX(weightX, liftNoM);
    }

    public int getPeopleWeightGreaterThan50(int liftNoM){
        return repository.getPeopleWeightGreaterThan50(liftNoM);
    }
}
