package org.training.design.patterns.training.oo.behavioral.observer;

public class DoorAlarmObserver implements IAlarmObserver {
    private int doorState;
    private int oldDoorState;

    public DoorAlarmObserver(int doorState) {
        this.doorState = doorState;
        oldDoorState = doorState;
        Alarm.getInstance().register(this);

    }


    @Override
    public void alarmOn(EAlarmType eAlarmType) {
        oldDoorState = doorState;
        if (eAlarmType == EAlarmType.FIRE_ALARM){
            System.out.println("Kapılar açıldı");
            doorState = 1;
        } else {
            System.out.println("Kapılar kitlendi");
            doorState = 0;
        }
    }

    @Override
    public void alarmOff() {
        doorState = oldDoorState;
        System.out.println("kapılar eski durumuna getirildi");
    }
}
