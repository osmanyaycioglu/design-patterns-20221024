package org.training.design.patterns.training.oo.interfaces.calculator2;

import java.util.ArrayList;
import java.util.List;

public class CalculatorOperationFactory {

    public static ICalculatorOperation getCalOp(int index){
        switch (index){
            case 1:
                return new OpAdd();
            case 2:
                return new OpSubs();
            default:
                return new OpAdd();
        }
    }

    public static List<ICalculatorOperation> getAllOps(){
        List<ICalculatorOperation> calculatorOperations = new ArrayList<>();
        calculatorOperations.add(new OpAdd());
        calculatorOperations.add(new OpSubs());
        calculatorOperations.add(new OpMult());
        return  calculatorOperations;
    }
}
