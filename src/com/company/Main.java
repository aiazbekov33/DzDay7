package com.company;

public class Main {

    public static void main(String[] args) {
        Medic medic = new Medic();
        medic.health();
        medic.ability();
        medic.damage();
        medic.superAbility();
        medic.draw();

        System.out.println("____________");

        Magic magic = new Magic();
        magic.health();
        magic.ability();
        magic.damage();
        magic.superAbility();
        magic.draw();

        System.out.println("____________");

        Warrior warrior = new Warrior();
        warrior.health();
        warrior.ability();
        warrior.damage();
        warrior.superAbility();
        warrior.draw();

        System.out.println("__________________");

        //Доп задание
        HavingSuperAbility[] havingSuperAbility = {medic, magic, warrior};
        for (int i = 0; i < havingSuperAbility.length; i++) {
            havingSuperAbility[i].superAbility();
            havingSuperAbility[i].draw();
    }
}}
