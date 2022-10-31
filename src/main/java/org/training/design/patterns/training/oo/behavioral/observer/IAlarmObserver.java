package org.training.design.patterns.training.oo.behavioral.observer;

public interface IAlarmObserver {
    void alarmOn(EAlarmType eAlarmType);

    void alarmOff();
}
