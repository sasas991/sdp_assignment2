package org.example.abstractfactory;

public class IOSNotificationFactory implements NotificationFactory {


    
    @Override
    public Notification createNotification() {
        return new IOSNotification();
    }


    @Override
    public MessageFormatter createFormatter() {
        return new IOSMessageFormatter();
    }




    @Override
    public NotificationIcon createIcon() {
        return new IOSNotificationIcon();
    }
}