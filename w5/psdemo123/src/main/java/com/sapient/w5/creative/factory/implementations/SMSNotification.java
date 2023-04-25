package com.sapient.w5.creative.factory.implementations;

import com.sapient.w5.creative.factory.facades.Notification;

public class SMSNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("sending an sms notification");
    }
}
