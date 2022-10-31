package org.training.design.patterns.training.oo.behavioral.strategy;

import java.security.SecureRandom;
import java.util.Random;

public class ElitSoldier extends Soldier {
    public void fire() {
        Random random = new SecureRandom();
        int i = random.nextInt(100);
        if (i > 30) {
            System.out.println("vurdum");
        }
    }

    public void duck() {
        Random random = new SecureRandom();
        int i = random.nextInt(100);
        if (i > 20) {
            System.out.println("vuruldum");
        }
    }

}
