package org.training.design.patterns.training.oo.interfaces.decorator;

public class KahveMalzemesiFactory {

    public static Kahve addMalzeme(int malzemeIndexi,
                                   Kahve kahve) {
        switch (malzemeIndexi) {
            case 1:
                return new NormalSut(kahve);
            case 2:
                return new SoyaSut(kahve);
            case 3:
                return new Decaf(kahve);
            case 4:
                return new Surup(kahve);
            default:
                return kahve;
        }
    }

    public static void showMalzemeMenu() {
        System.out.println("1-Normal süt");
        System.out.println("2-Soya sütü");
        System.out.println("3-Decaf");
        System.out.println("4-Surup");

    }

    public static int malzemeListesiSize() {
        return 4;
    }

}
