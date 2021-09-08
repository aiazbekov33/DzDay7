package com.company;

public class Magic extends Hero{

    @Override
    public void superAbility() {
        System.out.println("Magic применил супер удар");
    }

    @Override
    void health() {
        System.out.println("Health 120");
    }

    @Override
    void damage() {
        System.out.println("Damage = 30");

    }

    @Override
    void ability() {
        System.out.println("Магия");

    }
}
