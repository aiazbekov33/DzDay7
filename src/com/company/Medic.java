package com.company;

public class Medic extends Hero {
    @Override
    public void superAbility() {
        System.out.println("Medic применил супер удар");
    }

    @Override
    void health() {
        System.out.println("Health 100");
    }

    @Override
    void damage() {
        System.out.println("Damage = 0");

    }

    @Override
    void ability() {
        System.out.println("Лечит раненых");

    }
}
