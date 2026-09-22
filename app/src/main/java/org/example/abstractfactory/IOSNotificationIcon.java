package org.example.abstractfactory;

public class IOSNotificationIcon implements NotificationIcon {

    @Override
    public void display() {
        System.out.println("displaying ios notification icon");
    }
}