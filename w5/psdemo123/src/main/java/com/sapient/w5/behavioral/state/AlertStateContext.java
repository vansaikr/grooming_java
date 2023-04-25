package com.sapient.w5.behavioral.state;

public class AlertStateContext {
    private MobileAlertState currentState;

    public AlertStateContext()
    {
        currentState = new Vibration();
    }

    public void setState(MobileAlertState state)
    {
        currentState = state;
    }

    public void alert() { currentState.alert(this); }
}
