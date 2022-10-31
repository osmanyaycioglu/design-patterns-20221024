package org.training.design.patterns.training.oo.behavioral.mediator;


public class MediatorRunner {

    public static void main(final String[] args) {
        Mediator mediatorLoc = new Mediator();
        Client1 client1Loc = new Client1(mediatorLoc);
        Client2 client2Loc = new Client2(mediatorLoc);
        Client3 client3Loc = new Client3(mediatorLoc);

        mediatorLoc.sendMessage("bütün client lar için");

        client2Loc.sendMessage("hello from client2");

        client3Loc.sendMessage("Client2",
                               "Naber client2 ben client3");

    }
}
