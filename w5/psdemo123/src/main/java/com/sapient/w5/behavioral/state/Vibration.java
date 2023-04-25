package com.sapient.w5.behavioral.state;

public class Vibration implements MobileAlertState{
    @Override public void alert(AlertStateContext ctx)
    {
        System.out.println(" vibration... ");
    }
}
