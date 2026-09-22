package org.example.abstractfactory;

public class AndroidNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("android notification: " + message);
    }
}