package org.training.design.patterns.training.oo.behavioral.mediator;


public interface IMsgListener {

    void messageReceived(String msg);

    String getName();

    void sendMessage(String msg);

    void sendMessage(String clientName,
                     String msg);
}
