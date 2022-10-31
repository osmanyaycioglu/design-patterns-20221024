package org.training.design.patterns.training.oo.behavioral.interceptor;


public class DirCommand implements IInterceptor {


    @Override
    public void intercept(final String strParam) {
        System.out.println("DirCommand Parametre : " + strParam);

    }

    @Override
    public String getCommandStr() {
        return "dir";
    }

}
