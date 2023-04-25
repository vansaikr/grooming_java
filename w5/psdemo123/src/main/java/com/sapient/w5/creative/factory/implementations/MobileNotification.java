package com.sapient.w5.creative.factory.implementations;

import com.sapient.w5.creative.factory.facades.Notification;

public class MobileNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("sending a mobile voice notification");
    }
}
