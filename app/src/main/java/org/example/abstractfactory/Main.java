package org.example.abstractfactory;

public class Main {

    public static void main(String[] args) {
        NotificationFactory factory=new AndroidNotificationFactory();

        Client client=new Client(factory);
        client.run("hello from notification system");
    }
}