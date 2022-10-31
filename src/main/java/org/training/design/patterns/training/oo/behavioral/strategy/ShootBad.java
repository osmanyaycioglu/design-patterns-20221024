package org.training.design.patterns.training.oo.behavioral.strategy;

import java.security.SecureRandom;
import java.util.Random;

public class ShootBad implements IShoot {

    @Override
    public boolean fire() {
        Random random = new SecureRandom();
        int i = random.nextInt(100);
        if (i > 70) {
            return true;
        }
        return false;
    }
}
