package org.training.design.patterns.training.oo.behavioral.state;

public interface ISystemState {
    ISystemState pauseSys(String str);
    ISystemState restart(String str);
    ISystemState stopSys(String str);
    ESystemState systemState();
}
