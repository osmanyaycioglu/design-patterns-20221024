package org.training.design.patterns.training.oo.interfaces.calculator;

import java.util.Scanner;

public class CalculatorRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        calculator.showMenu();
        System.out.println("seçiminiz : ");
        int i = scanner.nextInt();
        System.out.println("Val1 : ");
        double i1 = scanner.nextDouble();
        System.out.println("Val2 : ");
        double i2 = scanner.nextDouble();
        if (i == 1) {
            double add = calculator.add(i1,
                                        i2);
            System.out.println("sonuç : " + add);
        } else if (i == 2) {
            double add = calculator.subs(i1,
                                         i2);
            System.out.println("sonuç : " + add);

        } else if (i == 3) {
            double add = calculator.mult(i1,
                                         i2);
            System.out.println("sonuç : " + add);

        }


    }
}
