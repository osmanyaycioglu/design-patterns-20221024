package org.training.design.patterns.training.oo.structural.bridge.araba;

import lombok.Builder;

public class Elektrikli extends YakitTuru{
    public static YakitTuruBuilder builder() {
        return new YakitTuruBuilder();
    }

}
