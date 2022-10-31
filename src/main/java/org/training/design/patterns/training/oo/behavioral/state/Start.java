package org.training.design.patterns.training.oo.behavioral.state;

public class Start implements ISystemState {
    @Override
    public ISystemState pauseSys(String str) {
        // pause işlemleri
        System.out.println("-- Stopping threads");
        System.out.println("-- Blocking web app requests");
        return new Pause();
    }

    @Override
    public ISystemState restart(String str) {
        return this;
    }

    @Override
    public ISystemState stopSys(String str) {
        // stop işlemleri
        return new Stop();
    }

    @Override
    public ESystemState systemState() {
        return ESystemState.STARTED;
    }

}
