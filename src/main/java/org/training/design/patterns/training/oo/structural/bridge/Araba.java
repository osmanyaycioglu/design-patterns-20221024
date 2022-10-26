package org.training.design.patterns.training.oo.structural.bridge;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Araba {
    private String name;
    private int speed;

    public void ileri() {
        System.out.println("İleri gittim : 10km");
    }

}
