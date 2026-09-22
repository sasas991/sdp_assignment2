package org.example.factorymethod;

public abstract class NotificationCreator {

    protected abstract Notification createNotification();

    public void sendNotification(String message) {
        Notification notification=createNotification();
        notification.send(message);
    }
}
