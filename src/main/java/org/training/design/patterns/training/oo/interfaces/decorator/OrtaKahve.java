package org.training.design.patterns.training.oo.interfaces.decorator;

public class OrtaKahve extends Kahve {

    public int fiyat() {
        return 25;
    }

    public String kahveMalzemeleri() {
        return "Orta Kahve";
    }

    public void kahveyiYap() {
        System.out.println("Kahve olarak : " + kahveMalzemeleri() + " hazırlandı");
    }

}
