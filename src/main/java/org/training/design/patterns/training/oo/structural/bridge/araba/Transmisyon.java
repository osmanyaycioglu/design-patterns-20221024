package org.training.design.patterns.training.oo.structural.bridge.araba;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Transmisyon {
    String name;

    public Transmisyon(String name) {
        this.name = name;
    }
}
