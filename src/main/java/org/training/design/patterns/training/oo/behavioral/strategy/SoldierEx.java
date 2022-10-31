package org.training.design.patterns.training.oo.behavioral.strategy;

public class SoldierEx extends Soldier {

    private IShoot iShoot;
    private IDuck  iDuck;

    public SoldierEx(IShoot iShoot,
                     IDuck iDuck) {
        this.iShoot = iShoot;
        this.iDuck = iDuck;
    }

    @Override
    public void fire() {
        if (iShoot.fire()) {
            System.out.println("Vurdum");
        } else {
            System.out.println("Vuramadım");
        }
    }

    @Override
    public void duck() {
        if (iDuck.duck()) {
            System.out.println("Vurulmadım");
        } else {
            System.out.println("Vuruldum");

        }
    }
}
