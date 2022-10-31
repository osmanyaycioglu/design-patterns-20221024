package org.training.design.patterns.training.oo.behavioral.observer;

public class SystemHealth {

    public void check() {
        Alarm.getInstance()
             .alarmOn(EAlarmType.BURGLAR_ALARM);
    }

}
