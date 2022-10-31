package org.training.design.patterns.training.oo.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private List<Memento> mementos = new ArrayList<>();

    public void save(MySession mySession) {
        mementos.add(mySession.save());
    }

    public void save(Memento mySession) {
        mementos.add(mySession);
    }

    public void undo(MySession mySession) {
        mySession.restore(mementos.get(mementos.size() - 1));
    }

    public void restore(int index,MySession mySession){
        mySession.restore(mementos.get(index));
    }

}
