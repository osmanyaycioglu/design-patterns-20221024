package org.training.design.patterns.training.oo.behavioral.state;

public class SystemStateRun {
    public static void main(String[] args) {
        ISystemState systemState = new SystemState();
        systemState.pauseSys("DB connection failed");
        System.out.println("System state : " + systemState.systemState());
        systemState.restart("DB connection restored");
        System.out.println("System state : " + systemState.systemState());
        systemState.stopSys("Stop requested");
        System.out.println("System state : " + systemState.systemState());
        systemState.restart("Restart app");
        System.out.println("System state : " + systemState.systemState());


        ESystemState.INSTANCE.setCurrentState(ESystemState.STARTED);
        ISystemState systemState1 = ESystemState.INSTANCE;
        ESystemState.INSTANCE.pauseSys("DB connection failed");
        System.out.println("System state : " + ESystemState.INSTANCE.systemState());
        ESystemState.INSTANCE.restart("DB connection restored");
        System.out.println("System state : " + ESystemState.INSTANCE.systemState());
        ESystemState.INSTANCE.stopSys("Stop requested");
        System.out.println("System state : " + ESystemState.INSTANCE.systemState());
        ESystemState.INSTANCE.restart("Restart app");
        System.out.println("System state : " + ESystemState.INSTANCE.systemState());
    }
}
