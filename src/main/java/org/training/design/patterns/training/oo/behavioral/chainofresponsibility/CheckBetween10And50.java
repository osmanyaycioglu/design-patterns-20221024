package org.training.design.patterns.training.oo.behavioral.chainofresponsibility;

public class CheckBetween10And50 extends AbstractCheckNumber {

    public CheckBetween10And50(ICheckNumber next) {
        super(next);
    }

    @Override
    public String checkInternal(int value) {
        if (value >= 10 && value < 50) {
            return "10 ile 50 arasında";
        }
        return null;
    }
}
