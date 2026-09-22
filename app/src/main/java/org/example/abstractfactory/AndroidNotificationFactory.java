package org.example.abstractfactory;

public class AndroidNotificationFactory implements NotificationFactory {

    @Override
    public Notification createNotification() {
        return new AndroidNotification();
    }


    @Override
    public MessageFormatter createFormatter() {
        return new AndroidMessageFormatter();
    }


    
    @Override
    public NotificationIcon createIcon() {
        return new AndroidNotificationIcon();
    }
}