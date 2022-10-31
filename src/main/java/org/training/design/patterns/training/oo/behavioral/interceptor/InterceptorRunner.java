package org.training.design.patterns.training.oo.behavioral.interceptor;

import java.util.Scanner;

public class InterceptorRunner {

    public static void main(final String[] args) {
        Interceptor interceptorLoc = new Interceptor();
        Scanner scannerLoc = new Scanner(System.in);
        while (true) {
            String nextLineLoc = scannerLoc.nextLine();
            interceptorLoc.intercept(nextLineLoc);
        }
    }
}
