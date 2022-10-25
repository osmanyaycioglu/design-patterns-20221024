package org.training.design.patterns.training.oo.interfaces.calculator;

public class Calculator {
    public double add (double val1,double val2){
        return val1 + val2;
    }

    public double subs (double val1,double val2){
        return val1 - val2;
    }

    public double mult (double val1,double val2){
        return val1 * val2;
    }

    public void showMenu(){
        System.out.println("1-Toplama");
        System.out.println("2-Çıkarma");
        System.out.println("3-Çarpma");

    }

}
