package org.training.design.patterns.training.oo.behavioral.mediator;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Mediator {

    private final Map<String, IMsgListener> map = new ConcurrentHashMap<>();


    public void sendMessage(final IMsgListener listenerParam,
                            final String message) {
        Collection<IMsgListener> valuesLoc = this.map.values();
        for (IMsgListener iMsgListenerLoc : valuesLoc) {
            if (listenerParam != iMsgListenerLoc) {
                iMsgListenerLoc.messageReceived(message);
            }
        }
    }

    public void sendMessage(final String message) {
        Collection<IMsgListener> valuesLoc = this.map.values();
        for (IMsgListener iMsgListenerLoc : valuesLoc) {
            iMsgListenerLoc.messageReceived(message);
        }
    }

    public void sendMessage(final String clientName,
                            final String message) {
        IMsgListener iMsgListenerLoc = this.map.get(clientName);
        if (iMsgListenerLoc != null) {
            iMsgListenerLoc.messageReceived(message);

        }
    }

    public void register(final IMsgListener listenerParam) {
        this.map.put(listenerParam.getName(),
                     listenerParam);
    }
}
