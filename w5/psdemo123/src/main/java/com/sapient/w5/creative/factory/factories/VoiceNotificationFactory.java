package com.sapient.w5.creative.factory.factories;

import com.sapient.w5.creative.factory.facades.Notification;
import com.sapient.w5.creative.factory.implementations.LandlineNotification;
import com.sapient.w5.creative.factory.implementations.MobileNotification;
import com.sapient.w5.creative.factory.utilities.Channel;
import com.sapient.w5.creative.factory.facades.NotificationFact;

public class VoiceNotificationFactory implements NotificationFact {
    @Override
    public Notification createNotification(Channel channel) {
        if (channel == null)
            return null;
        switch (channel) {
            case MOBILE:
                return new MobileNotification();
            case LANDLINE:
                return new LandlineNotification();
            default:
                throw new IllegalArgumentException("Unknown channel "+channel);
        }
    }
}
