package com.company;

public class Main {

    public static void main(String[] args) {
        Medic medic = new Medic();
        medic.health();
        medic.ability();
        medic.damage();
        medic.superAbility();

        System.out.println("____________");

        Magic magic = new Magic();
        magic.health();
        magic.ability();
        magic.damage();
        magic.superAbility();

        System.out.println("____________");

        Warrior warrior = new Warrior();
        warrior.health();
        warrior.ability();
        warrior.damage();
        warrior.superAbility();

        System.out.println("__________________");

        //Доп задание
        HavingSuperAbility[] havingSuperAbility = {medic, magic, warrior};
        for (int i = 0; i < havingSuperAbility.length; i++) {
            havingSuperAbility[i].superAbility();
    }
}}
