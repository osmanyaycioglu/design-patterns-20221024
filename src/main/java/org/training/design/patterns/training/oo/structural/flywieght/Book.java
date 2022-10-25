package org.training.design.patterns.training.oo.structural.flywieght;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book {

    private String name;
    private int pageCount;
    private String writer;
    private BookCategory bookCategory;

}
