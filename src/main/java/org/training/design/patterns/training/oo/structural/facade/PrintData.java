package org.training.design.patterns.training.oo.structural.facade;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.training.design.patterns.training.oo.examples.printer.EGender;

@Getter
@Setter
@Builder
public class PrintData {

    private String  name;
    private     String  surname;
    private     EGender gender;
}
