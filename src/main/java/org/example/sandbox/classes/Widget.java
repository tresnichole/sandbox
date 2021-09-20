package org.example.sandbox.classes;

import org.example.sandbox.inheritance.animal.Bird;
import org.example.sandbox.inheritance.animal.Fish;

public class Widget {

    Bird bird;
    Fish fish;

    public Widget(){
        this.bird = new Bird();
        this.fish = new Fish();
    }

    public Widget(Bird bird, Fish fish) {
        this.bird = bird;
        this.fish = fish;
    }
}
