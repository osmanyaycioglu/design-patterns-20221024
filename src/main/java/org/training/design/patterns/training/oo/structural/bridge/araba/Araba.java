package org.training.design.patterns.training.oo.structural.bridge.araba;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Araba {

    private YakitTuru yakitTuru;
    private Transmisyon transmisyon;
    private String name;
    private int speed;

    public Araba(YakitTuru yakitTuru,
                 Transmisyon transmisyon,
                 String name,
                 int speed) {
        this.yakitTuru = yakitTuru;
        this.transmisyon = transmisyon;
        this.name = name;
        this.speed = speed;
    }

    public void ileri() {
        System.out.println(transmisyon.getName()
                                   +  " araba ileri gitti : "
                                   + yakitTuru.calculateMenzil()
                                   + " km" );
    }


}
