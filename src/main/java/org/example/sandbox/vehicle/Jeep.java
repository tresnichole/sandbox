package org.example.sandbox.vehicle;

public class Jeep extends SportUtilityVehicle{

    @Override
    public void transport(){
        System.out.println("Transporting Jeep stuff");
    }

    @Override
    public void engage4WD(){
        System.out.println("Engaging 4WD");
    }

    @Override
    public void disengage4WD(){
        System.out.println("disengaging");
    }
}
