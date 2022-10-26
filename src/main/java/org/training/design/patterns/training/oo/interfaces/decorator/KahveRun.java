package org.training.design.patterns.training.oo.interfaces.decorator;

import java.util.Scanner;

public class KahveRun {
    public static void main(String[] args) {
        Kahve kahve = new Surup(new Decaf(new SoyaSut(new OrtaKahve())));
        kahve.kahveyiYap();

        Kahve kahve1 = new Kahve();

        try (Scanner scanner = new Scanner(System.in);) {
            while (true) {
                KahveMalzemesiFactory.showMalzemeMenu();
                System.out.println("seçiminiz");
                int i = scanner.nextInt();
                if (i > KahveMalzemesiFactory.malzemeListesiSize()){
                    break;
                }

                kahve1 = KahveMalzemesiFactory.addMalzeme(i,
                                                 kahve1);

            }
            kahve1.kahveyiYap();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
