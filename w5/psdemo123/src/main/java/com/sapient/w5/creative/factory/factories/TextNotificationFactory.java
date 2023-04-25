package com.sapient.w5.creative.factory.factories;

import com.sapient.w5.creative.factory.facades.Notification;
import com.sapient.w5.creative.factory.implementations.EmailNotification;
import com.sapient.w5.creative.factory.implementations.PushNotification;
import com.sapient.w5.creative.factory.implementations.SMSNotification;
import com.sapient.w5.creative.factory.utilities.Channel;
import com.sapient.w5.creative.factory.facades.NotificationFact;

public class TextNotificationFactory implements NotificationFact {
    public Notification createNotification(Channel channel)
    {
        if (channel == null)
            return null;
        switch (channel) {
            case SMS:
                return new SMSNotification();
            case EMAIL:
                return new EmailNotification();
            case PUSH:
                return new PushNotification();
            default:
                throw new IllegalArgumentException("Unknown channel "+channel);
        }
    }
}
