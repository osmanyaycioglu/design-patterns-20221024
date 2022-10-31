package org.training.design.patterns.training.oo.behavioral.chainofresponsibility;

public class CheckLessThan10 extends AbstractCheckNumber {

    public CheckLessThan10(ICheckNumber next) {
        super(next);
    }

    @Override
    public String checkInternal(int number) {
        if (number < 10) {
            return "10 dan küçük";
        }
        return null;
    }

}
