package org.example.abstractfactory;

public interface NotificationFactory {

    Notification createNotification();

    MessageFormatter createFormatter();

    NotificationIcon createIcon();
}