package org.training.design.patterns.training.oo.behavioral.memento;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MySession {
    private String    data;
    private String    sessionId;
    private String    name;
    private int       counter;
    private Caretaker caretaker = new Caretaker();

    public void doSome() {
        counter++;
    }

    public Memento save() {
        Memento memento = new Memento();
        memento.setData(data);
        memento.setCounter(counter);
        caretaker.save(memento);
        return memento;
    }

    public void undo() {
        caretaker.undo(this);
    }

    public void restore(Memento memento) {
        data = memento.getData();
        counter = memento.getCounter();
    }

}
