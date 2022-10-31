package org.training.design.patterns.training.oo.behavioral.chainofresponsibility;

public abstract class AbstractCheckNumber implements ICheckNumber {

    private ICheckNumber next;

    public AbstractCheckNumber(ICheckNumber next) {
        this.next = next;
    }

    abstract String checkInternal(int number);

    @Override
    public String check(int number) {
        String s = checkInternal(number);
        if (s == null && next != null) {
            return next.check(number);
        }
        return s;
    }

    public String runNext(int value) {
        if (next != null) {
            return next.check(value);
        }
        return null;
    }
}
