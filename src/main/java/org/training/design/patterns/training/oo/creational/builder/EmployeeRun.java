package org.training.design.patterns.training.oo.creational.builder;

import org.training.design.patterns.training.oo.creational.singleton.MyLazySingleton;

public class EmployeeRun {
    public static void main(String[] args) {
        Employee employee = Employee.getBuilder()
                                    .withName("osman")
                                    .withSurname("yaycıoğlu")
                                    .setCounter(10)
                                    .setHeight(200)
                                    .setWeight(100)
                                    .build();
        EmployeeLombok build = EmployeeLombok.builder()
                                             .name("osman")
                                             .surname("yaycıoğlu")
                                             .counter(10)
                                             .height(200)
                                             .weight(100)
                                             .build();
        MyLazySingleton.getInstance().doSomething();
        String str = "osman " + employee + " " + build;
        str += " yaycıoğlu";
        String test = str.concat("test");

        String m = "test";
        String x = "test";
        String y = new String("test");
        if (m == y) {
            System.out.println("eşit");
        }
        String str2 = "start";
        for (int i = 0; i < 100; i++) {
            str2 += i;
        }
        StringBuilder stringBuilder = new StringBuilder(50);
        for (int i = 0; i < 100; i++) {
            stringBuilder.append("deneme")
                         .append(i);
        }
        // System.out.println("sonuç : " + (stringBuilder == null ? "null" : stringBuilder.toString()));
        System.out.println("sonuç : " + stringBuilder);
        long delta = System.currentTimeMillis();
        for (int i = 0; i < 100_001; i++) {
            if (i > 100_000) {
                check("osman" + i + " " + m,
                      i);
            }
        }
        System.out.println("Delta : " + (System.currentTimeMillis() - delta));


        delta = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            String.format("debug %s deneme %d",
                          "osman",
                          10);
        }
        System.out.println("Fromat Delta : " + (System.currentTimeMillis() - delta));

        StringBuilder builder = new StringBuilder(10000);
        delta = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            builder.append("osman");
        }
        System.out.println("Fromat Delta : " + (System.currentTimeMillis() - delta));

    }

    public static void check(String str,
                             int count) {
        if (count > 100_000) {
            System.out.println("sonuç " + str);
        }
    }

}
