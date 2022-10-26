package org.training.design.patterns.training.oo.examples.printer;

import lombok.Getter;
import lombok.Setter;
import org.training.design.patterns.training.oo.structural.facade.IPrintFacade;
import org.training.design.patterns.training.oo.structural.facade.PrintData;

import java.util.function.Supplier;

@Getter
@Setter
public class Employee {

    private String  name;
    private String  surname;
    private EGender gender;

    public void print(Supplier<IPrintFacade> facadeSupplier) {
        facadeSupplier.get()
                      .print(PrintData.builder()
                                      .name(name)
                                      .surname(surname)
                                      .gender(gender)
                                      .build());
    }

}
