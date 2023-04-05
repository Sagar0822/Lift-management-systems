package com.mockSpring1.Lift.management.systems;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public class LmsRepository {

    HashMap<Integer, Lift> liftMapDb  = new HashMap<>();  //use for database
    HashMap<Integer, Passenger> passengerMapDb = new HashMap<>();

    //add lift
    public void addLift(Lift lift){
        liftMapDb.put(lift.getLiftNo(), lift);
    }

    //add passenger
    public void addPassenger(Passenger passenger){
        passengerMapDb.put(passenger.getPassengerId(), passenger);
    }

   // 1. Delete all passengers with IDs less than 5
     public void deletePassenger(){
        int x = 5;  //given
        for(Passenger p : passengerMapDb.values()){
            if(p.getPassengerId() < x){
                passengerMapDb.remove(p);
            }
        }
     }

    //2. Find the maximum number of people with weight X that can travel in a given lift M
    public int getPeopleWithWeightX(int weightX, int liftNoM){
        int totalPassenger = 0;
        int totalWeight = 0;
        Lift lift = liftMapDb.get(liftNoM);

        for(Passenger p : passengerMapDb.values()){
            if(p.getWeight() == weightX){
                totalPassenger++;
                totalWeight++;
            }
            while(totalPassenger > lift.getCapacityInPerson() || totalWeight > lift.getCapacityInWeight()){
                totalPassenger--;
                totalWeight--;
            }
        }
        return totalPassenger;
    }

    //3. Find the number of people with a weight greater than 50 in a given lift M
    public int getPeopleWeightGreaterThan50(int liftNoM){
        int x = 50;
        int countPeople = 0;

        Lift lift = liftMapDb.get(liftNoM);

        List<Passenger> passengerList = lift.getPassengers(); //add passenger in list from given lift

        for(Passenger p : passengerList){
            if(p.getWeight() > x){
                countPeople++;
            }
        }
        return countPeople;
    }
}
