package org.training.design.patterns.training.oo.behavioral.interceptor;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Interceptor implements IInterceptor {

    private final Map<String, IInterceptor> interMap = new ConcurrentHashMap<>();


    public Interceptor() {
        DirCommand commandLoc1 = new DirCommand();
        RunCommand commandLoc2 = new RunCommand();
        SearchCommand commandLoc3 = new SearchCommand();
        AltInterceptor altInterceptorLoc = new AltInterceptor();
        this.interMap.put(commandLoc1.getCommandStr(),
                          commandLoc1);
        this.interMap.put(commandLoc2.getCommandStr(),
                          commandLoc2);
        this.interMap.put(commandLoc3.getCommandStr(),
                          commandLoc3);
        this.interMap.put(altInterceptorLoc.getCommandStr(),
                          altInterceptorLoc);
    }

    //komut parametreler
    //komut altkomut parametreler
    //alt ls parametreler
    @Override
    public void intercept(final String strParam) {
        String[] splitLoc = strParam.trim()
                                    .split(" ");
        IInterceptor iInterceptorLoc = this.interMap.get(splitLoc[0]);
        if (iInterceptorLoc != null) {
            iInterceptorLoc.intercept(strParam.substring(splitLoc[0].length() + 1));
        }
    }

    @Override
    public String getCommandStr() {
        throw new IllegalStateException();
    }


}
