package org.training.design.patterns.training.oo.behavioral.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Alarm implements IAlarmObserver {
    private static Alarm alarmDistributor = new Alarm();
    private List<IAlarmObserver> alarms = new ArrayList<>();

    public static Alarm getInstance(){
        return alarmDistributor;
    }

    public void register(IAlarmObserver alarm){
        alarms.add(alarm);
    }

    @Override
    public void alarmOn(EAlarmType eAlarmType) {
        for (IAlarmObserver alarm:
             alarms) {
            alarm.alarmOn(eAlarmType);
        }
    }

    @Override
    public void alarmOff() {
        for (IAlarmObserver alarm:
                alarms) {
            alarm.alarmOff();
        }
    }
}
