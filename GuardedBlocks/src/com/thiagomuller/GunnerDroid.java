package com.thiagomuller;

public class GunnerDroid {
    private String name;
    private String weaponName;

    public GunnerDroid(String name, String weaponName) {
        this.name = name;
        this.weaponName = weaponName;
    }

    public String getName() {
        return name;
    }

    public String getWeaponName() {
        return weaponName;
    }
}
