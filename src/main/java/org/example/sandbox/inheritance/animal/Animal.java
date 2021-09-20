package org.example.sandbox.inheritance.animal;

import java.util.List;

public abstract class Animal {

    private List<Cell> cells;

    public void eat(String food){
        System.out.println("Eating " + food);
    }


}
