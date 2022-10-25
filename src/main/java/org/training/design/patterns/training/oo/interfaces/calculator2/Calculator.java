package org.training.design.patterns.training.oo.interfaces.calculator2;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    private List<ICalculatorOperation> calculatorOperations = new ArrayList<>();

    public Calculator() {
        calculatorOperations.addAll(CalculatorOperationFactory.getAllOps());
    }

    public double execute(int index, double val1, double val2){
        ICalculatorOperation iCalculatorOperation = calculatorOperations.get(index -1);
        return iCalculatorOperation.execute(val1,val2);
    }

    public void showMenu(){
        for (int i = 0; i < calculatorOperations.size(); i++) {
            ICalculatorOperation iCalculatorOperation = calculatorOperations.get(i);
            System.out.println( (i+1) + "-" +  iCalculatorOperation.operationName());
        }
    }

}
