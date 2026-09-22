package org.example.factorymethod;

public class SMSNotificationCreator extends NotificationCreator {

    @Override
    protected Notification createNotification() {
        return new SMSNotification();
    }
}
