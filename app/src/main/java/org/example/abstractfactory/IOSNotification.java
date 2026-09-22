package org.example.abstractfactory;

public class IOSNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("ios notification: " + message);
    }
}