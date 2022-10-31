package org.training.design.patterns.training.oo.behavioral.strategy;

public class SoldierRun {
    public static void main(String[] args) {
        Soldier soldier = new ElitSoldier();
        Soldier soldier2 = new SoldierEx(new ShootBest(),
                                         new DuckBad());

        Soldier soldier3 = new SoldierEx(new ShootSnipper(),
                                         new DuckBest());

        Soldier soldier4 = new SoldierEx(new ShootBad(),
                                         new DuckBest());

        soldier2.fire();
        soldier2.duck();


    }
}
