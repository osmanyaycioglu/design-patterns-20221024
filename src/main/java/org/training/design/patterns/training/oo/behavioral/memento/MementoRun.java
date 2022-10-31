package org.training.design.patterns.training.oo.behavioral.memento;

import java.util.UUID;

public class MementoRun {
    public static void main(String[] args) {
        MySession mySession = new MySession();
        mySession.setSessionId(UUID.randomUUID().toString());
        mySession.setName("myse1");
        mySession.setData("first");
        mySession.doSome();
        mySession.doSome();
        mySession.doSome();

        mySession.save();

        mySession.setData("second");
        mySession.doSome();
        mySession.doSome();
        mySession.doSome();

        System.out.println("Current : " + mySession);
        mySession.undo();
        System.out.println("After undo : " + mySession);

    }
}
