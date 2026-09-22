package org.example.factorymethod;

public class EmailNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("eending email: " + message);
    }
}
