package org.training.design.patterns.training.oo.structural.composite;

public class CompositeRun {
    public static void main(String[] args) {
        ErrorObj root_error = ErrorObj.builder()
                                      .desc("root error")
                                      .cause(1000)
                                      .build()
                                      .addSubError(ErrorObj.builder()
                                                           .desc("1 level a")
                                                           .cause(1001)
                                                           .build())
                                      .addSubError(ErrorObj.builder()
                                                           .desc("1 level b")
                                                           .cause(1002)
                                                           .build()
                                                           .addSubError(ErrorObj.builder()
                                                                                .desc("2 level b")
                                                                                .cause(1003)
                                                                                .build()));
        System.out.println(root_error);
    }
}
