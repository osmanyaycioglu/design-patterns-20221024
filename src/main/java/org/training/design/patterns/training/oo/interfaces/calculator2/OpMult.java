package org.training.design.patterns.training.oo.interfaces.calculator2;

public class OpMult implements ICalculatorOperation{
    @Override
    public double execute(double val1,
                          double val2) {
        return val1 * val2;
    }

    @Override
    public String operationName() {
        return "Çarpma";
    }
}
