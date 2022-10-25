package org.training.design.patterns.training.oo.interfaces.calculator2;


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
        double execute = calculator.execute(i,
                                            i1,
                                            i2);
        System.out.println("sonuç : " + execute);
    }
}
