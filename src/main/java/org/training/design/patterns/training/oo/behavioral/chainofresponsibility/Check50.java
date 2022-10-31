package org.training.design.patterns.training.oo.behavioral.chainofresponsibility;

public class Check50 extends AbstractCheckNumber {

    public Check50(ICheckNumber next) {
        super(next);
    }

    @Override
    public String checkInternal(int value) {
           return "50";
    }
}
