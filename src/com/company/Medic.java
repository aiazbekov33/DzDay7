package com.company;

public class Medic extends Hero {
    @Override
    public void superAbility() {
        System.out.println("Medic применил супер удар");
    }

    @Override
    public void draw() {
        System.out.println("\uD83D\uDC68\u200D\uD83D\uDCBB");
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
