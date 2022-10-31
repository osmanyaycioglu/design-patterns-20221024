package org.training.design.patterns.training.oo.behavioral.strategy;

import java.security.SecureRandom;
import java.util.Random;

public class DuckBest  implements IDuck{

    @Override
    public boolean duck() {
        Random random = new SecureRandom();
        int i = random.nextInt(100);
        if (i > 30) {
            return true;
        }
        return false;

    }
}
