package com.sapient.w5.creative.factory.services;

import com.sapient.w5.creative.factory.facades.Notification;
import com.sapient.w5.creative.factory.utilities.Channel;
import com.sapient.w5.creative.factory.facades.NotificationFact;
import com.sapient.w5.creative.factory.factories.TextNotificationFactory;
import com.sapient.w5.creative.factory.factories.VoiceNotificationFactory;

public class NotificationService {
    public static void main(String[] args)
    {
        NotificationFact notificationFactory = new TextNotificationFactory();
        Notification notification = notificationFactory.createNotification(Channel.SMS);
        notification.notifyUser();

        NotificationFact notificationFact=new VoiceNotificationFactory();
        Notification notification1= notificationFact.createNotification(Channel.LANDLINE);
        notification1.notifyUser();
    }
}
