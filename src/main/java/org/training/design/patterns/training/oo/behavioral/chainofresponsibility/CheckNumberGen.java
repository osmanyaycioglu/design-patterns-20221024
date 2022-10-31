package org.training.design.patterns.training.oo.behavioral.chainofresponsibility;

public class CheckNumberGen extends AbstractCheckNumber{
    private Integer max;
    private Integer min;

    public CheckNumberGen(ICheckNumber next,
                          Integer min,
                          Integer max) {
        super(next);
        this.max = max;
        this.min = min;
    }


    @Override
    public String checkInternal(int number) {
        if (number >= min && number < max ){
            return min + " ile " + max + " arasında";
        }
        return null;
    }
}
