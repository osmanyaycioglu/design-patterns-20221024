package org.training.design.patterns.training.oo.behavioral.state;

public enum ESystemState implements ISystemState {
    INSTANCE,
    STARTED {
        @Override
        public ISystemState pauseSys(String str) {
            // pause işlemleri
            System.out.println("-- Stopping threads");
            System.out.println("-- Blocking web app requests");
            return PAUSED;
        }

        @Override
        public ISystemState restart(String str) {
            return this;
        }

        @Override
        public ISystemState stopSys(String str) {
            // stop işlemleri
            return STOPPED;
        }

        @Override
        public ESystemState systemState() {
            return STARTED;
        }

    },
    PAUSED {
        @Override
        public ISystemState pauseSys(String str) {
            return this;
        }

        @Override
        public ISystemState restart(String str) {
            // restart işlemleri
            System.out.println("-- Starting threads");
            System.out.println("-- web app requests is on");

            return STARTED;
        }

        @Override
        public ISystemState stopSys(String str) {
            // stop işlem
            return STOPPED;
        }

        @Override
        public ESystemState systemState() {
            return PAUSED;
        }
    }, STOPPED {
        @Override
        public ISystemState pauseSys(String str) {
            return PAUSED;
        }

        @Override
        public ISystemState restart(String str) {
            return STARTED;
        }

        @Override
        public ISystemState stopSys(String str) {
            return this;
        }

        @Override
        public ESystemState systemState() {
            return STOPPED;
        }

    };

    private ISystemState currentState;

    public void setCurrentState(ISystemState currentState){
        this.currentState = currentState;
    }

    @Override
    public ISystemState pauseSys(String str) {
        currentState = currentState.pauseSys(str);
        return currentState;
    }

    @Override
    public ISystemState restart(String str) {
        currentState = currentState.restart(str);
        return currentState;
    }

    @Override
    public ISystemState stopSys(String str) {
        currentState = currentState.stopSys(str);
        return currentState;
    }

    @Override
    public ESystemState systemState() {
        return currentState.systemState();
    }

}
