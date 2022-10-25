package org.training.design.patterns.training.oo.examples.printer.facade;

import lombok.Getter;
import lombok.Setter;
import org.training.design.patterns.training.oo.examples.printer.EGender;

@Getter
@Setter
public class PrintData {

    private String  name;
    private     String  surname;
    private     EGender gender;
}
