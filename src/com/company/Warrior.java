package com.company;

public class Warrior extends Hero{

    @Override
    public void superAbility() {
        System.out.println("Warrior применил супер удар");
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
