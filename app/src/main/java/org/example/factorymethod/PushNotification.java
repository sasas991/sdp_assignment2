package org.example.factorymethod;

public class PushNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("sending push notification: " + message);
    }
}
