package org.training.design.patterns.training.oo.creational.builder;

import lombok.Builder;

@Builder
public class EmployeeLombok {
    private final String name;
    private final String surname;
    private final int    counter;
    private final int    height;
    private final int    weight;
}
