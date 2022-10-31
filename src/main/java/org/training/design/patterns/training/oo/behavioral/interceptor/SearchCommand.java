package org.training.design.patterns.training.oo.behavioral.interceptor;


public class SearchCommand implements IInterceptor {

    @Override
    public void intercept(final String strParam) {
        String[] splitLoc = strParam.split(" ");
        System.out.println("SearchCommand Parametre : " + strParam);

    }

    @Override
    public String getCommandStr() {
        return "search";
    }

}
