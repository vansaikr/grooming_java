package com.sapient.w5.creative.factory.implementations;

import com.sapient.w5.creative.factory.facades.Notification;

public class LandlineNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("sending a voice landline notification");
    }
}
