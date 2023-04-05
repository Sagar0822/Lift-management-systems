package com.mockSpring1.Lift.management.systems;

import java.util.List;

public class Lift {

    private int liftNo;

    private int CapacityInWeight;

    private int CapacityInPerson;

    private List<Passenger> passengers;

    public Lift(){

    }

    public Lift(int liftNo, int capacityInWeight, int capacityInPerson, List<Passenger> passengers) {
        this.liftNo = liftNo;
        CapacityInWeight = capacityInWeight;
        CapacityInPerson = capacityInPerson;
        this.passengers = passengers;
    }

    public int getLiftNo() {
        return liftNo;
    }

    public void setLiftNo(int liftNo) {
        this.liftNo = liftNo;
    }

    public int getCapacityInWeight() {
        return CapacityInWeight;
    }

    public void setCapacityInWeight(int capacityInWeight) {
        CapacityInWeight = capacityInWeight;
    }

    public int getCapacityInPerson() {
        return CapacityInPerson;
    }

    public void setCapacityInPerson(int capacityInPerson) {
        CapacityInPerson = capacityInPerson;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }
}
