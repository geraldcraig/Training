package com.example.demo;

public class Client {

    private boolean bonus;

    public void setBonus(boolean bonus) {
        this.bonus = bonus;
    }

    public boolean hasBonus() {
        return bonus;
    }

    public void rejectsCharge() {
        bonus = false;
    }

}
