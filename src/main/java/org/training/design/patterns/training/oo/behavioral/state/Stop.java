package org.training.design.patterns.training.oo.behavioral.state;

public class Stop implements ISystemState{
    @Override
    public ISystemState pauseSys(String str) {
        return new Pause();
    }

    @Override
    public ISystemState restart(String str) {
        return new Start();
    }

    @Override
    public ISystemState stopSys(String str) {
        return this;
    }

    @Override
    public ESystemState systemState() {
        return ESystemState.STOPPED;
    }

}
