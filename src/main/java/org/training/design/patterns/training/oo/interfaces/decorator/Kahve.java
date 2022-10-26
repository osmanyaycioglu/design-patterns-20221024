package org.training.design.patterns.training.oo.interfaces.decorator;

public class Kahve {

    public int fiyat() {
        return 20;
    }

    public String kahveMalzemeleri() {
        return "Kahve";
    }

    public void kahveyiYap() {
        System.out.println("Kahve olarak : "
                                   + kahveMalzemeleri()
                                   + " hazırlandı."
                                   + " fiyat : "
                                   + fiyat());
    }

}
