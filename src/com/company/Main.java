package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss("100",  12, new Weapon(" 14 ", " 16 "));
        System.out.println(boss.getInfo());
    }
}
