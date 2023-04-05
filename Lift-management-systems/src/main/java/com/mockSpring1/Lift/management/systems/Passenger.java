package com.mockSpring1.Lift.management.systems;

public class Passenger {

    private int passengerId;

    private int Lift;

    private int weight;

    public Passenger(){

    }

    public Passenger(int passengerId, int lift, int weight) {
        this.passengerId = passengerId;
        Lift = lift;
        this.weight = weight;
    }

    public int getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(int passengerId) {
        this.passengerId = passengerId;
    }

    public int getLift() {
        return Lift;
    }

    public void setLift(int lift) {
        Lift = lift;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
