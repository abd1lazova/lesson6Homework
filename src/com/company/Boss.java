package com.company;

public class Boss extends GameEntity{


    private Weapon weapon;

    public Boss(String health, int damage, Weapon weapon) {
        super(health, damage);
        this.weapon = weapon;
    }


    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " avtomat" + weapon.getAvtomat() + "kalash" + weapon.getKalash();


    }
}
