package com.company;

public class Warrior extends Hero{

    @Override
    public void superAbility() {
        System.out.println("Warrior применил супер удар");
    }

    @Override
    public void draw() {
        System.out.println("\uD83D\uDC82\uD83C\uDFFE");
    }

    @Override
    void health() {
        System.out.println("Health 300");
    }

    @Override
    void damage() {
        System.out.println("Damage = 50");

    }

    @Override
    void ability() {
        System.out.println("2 раза повышенный урон");

    }
}
