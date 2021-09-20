package org.example.sandbox.vehicle;

public class Boat extends WaterCraft{
    @Override
    public void transport() {
    System.out.println("Transporting boat stuff");
    }

    @Override
    public void launch() {
    System.out.println("Launching the boat");
    }
}
