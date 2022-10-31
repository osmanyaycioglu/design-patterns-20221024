package org.training.design.patterns.training.oo.behavioral.observer;

public class AlarmSoundObserver implements IAlarmObserver {

    public AlarmSoundObserver() {
        Alarm.getInstance().register(this);
    }

    @Override
    public void alarmOn(EAlarmType eAlarmType) {
        System.out.println("Alarm sound on");
    }

    @Override
    public void alarmOff() {
        System.out.println("Alarm sound off");

    }
}
