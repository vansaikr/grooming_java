package com.sapient.w5.creative.factory.implementations;

import com.sapient.w5.creative.factory.facades.Notification;

public class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("sending an email notification");
    }
}
