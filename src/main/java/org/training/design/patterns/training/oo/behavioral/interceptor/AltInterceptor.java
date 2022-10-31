package org.training.design.patterns.training.oo.behavioral.interceptor;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class AltInterceptor implements IInterceptor {

    private final Map<String, IInterceptor> interMap = new ConcurrentHashMap<>();


    public AltInterceptor() {
        LsAltCommand altCommandLoc = new LsAltCommand();
        DfAltCommand commandLoc = new DfAltCommand();
        this.interMap.put(altCommandLoc.getCommandStr(),
                          altCommandLoc);
        this.interMap.put(commandLoc.getCommandStr(),
                          commandLoc);
    }

    //komut parametreler
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
        return "alt";
    }


}
