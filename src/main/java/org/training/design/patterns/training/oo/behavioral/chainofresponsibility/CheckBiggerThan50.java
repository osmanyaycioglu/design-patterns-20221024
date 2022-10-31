package org.training.design.patterns.training.oo.behavioral.chainofresponsibility;

public class CheckBiggerThan50 extends AbstractCheckNumber {

    public CheckBiggerThan50(ICheckNumber next) {
        super(next);
    }

    @Override
    public String checkInternal(int value) {
        if (value > 50){
           return "50 den büyük";
        }
        return null;
    }
}
