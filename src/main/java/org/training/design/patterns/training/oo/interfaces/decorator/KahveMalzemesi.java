package org.training.design.patterns.training.oo.interfaces.decorator;

public abstract class KahveMalzemesi extends Kahve {

    Kahve kahve;
    private int fiyat;
    private String malzemeIsmi;


    public KahveMalzemesi(Kahve kahve,int fiyat,String malzemeIsmi) {
        this.kahve = kahve;
        this.fiyat = fiyat;
        this.malzemeIsmi = malzemeIsmi;
    }

    @Override
    public int fiyat() {
        return kahve.fiyat() + fiyat;
    }

    @Override
    public String kahveMalzemeleri() {
        return kahve.kahveMalzemeleri() + "," + malzemeIsmi;
    }
}
