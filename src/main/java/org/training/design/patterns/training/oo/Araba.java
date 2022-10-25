package org.training.design.patterns.training.oo;

public class Araba {
    private int maxHiz;
    private int ortalamaHiz;
    private int donusHizi;
    private int asfaltHizi;

    private int caymiktari;

    public void cayYap() {

    }

    public int ileri(int yolTipi,
                     int uzaklik) {
        if (yolTipi == 1) {
            return uzaklik / maxHiz;
        } else if (yolTipi == 2) {
            return uzaklik / ortalamaHiz;
        }
        return uzaklik / 60;
    }

    public void dur() {

    }


}
