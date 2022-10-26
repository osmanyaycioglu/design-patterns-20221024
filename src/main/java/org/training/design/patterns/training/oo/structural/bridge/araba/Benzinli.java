package org.training.design.patterns.training.oo.structural.bridge.araba;

import lombok.Builder;


public class Benzinli extends YakitTuru {

    public Benzinli() {
    }

    Benzinli(YakitTuru yakitTuru) {
        litre = yakitTuru.litre;
        depoLt = yakitTuru.depoLt;
        menzil = yakitTuru.menzil;
    }

    public static BenzinliBuilder builder() {
        return new BenzinliBuilder();
    }

    public static class BenzinliBuilder extends YakitTuruBuilder {
        @Override
        public Benzinli build() {
            return new Benzinli(super.build());
        }
    }
}
