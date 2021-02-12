package com.company;

public class Weapon {
    public String getAvtomat() {
        return avtomat;
    }

    public void setAvtomat(String avtomat) {
        this.avtomat = avtomat;
    }

    public String getKalash() {
        return kalash;
    }

    public void setKalash(String kalash) {
        this.kalash = kalash;
    }

    private String avtomat;
    private String kalash;


    public Weapon(String avtomat, String kalash) {
        this.avtomat = avtomat;
        this.kalash = kalash;
    }
}
