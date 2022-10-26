package org.training.design.patterns.training.oo.structural.bridge;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BenzinliAraba extends Araba {
    private int benzinLt;
    private int menzil;

    @Override
    public void ileri() {
        System.out.println("ileri gittim : " + menzil);
    }
}
