package org.training.design.patterns.training.oo.behavioral.state;

public class Pause implements ISystemState {
    @Override
    public ISystemState pauseSys(String str) {
        return this;
    }

    @Override
    public ISystemState restart(String str) {
       // restart işlemleri
        System.out.println("-- Starting threads");
        System.out.println("-- web app requests is on");

        return new Start();
    }

    @Override
    public ISystemState stopSys(String str) {
        // stop işlem
        return new Stop();
    }

    @Override
    public ESystemState systemState() {
        return ESystemState.PAUSED;
    }
}
