package org.training.design.patterns.training.oo.structural.bridge.araba;

import lombok.Builder;

public class Dizel extends YakitTuru{
    public static YakitTuruBuilder builder() {
        return new YakitTuruBuilder();
    }

}
