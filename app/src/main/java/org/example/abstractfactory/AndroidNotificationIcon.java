package org.example.abstractfactory;

public class AndroidNotificationIcon implements NotificationIcon {

    @Override
    public void display() {
        System.out.println("displaying android notification icon");
    }
}