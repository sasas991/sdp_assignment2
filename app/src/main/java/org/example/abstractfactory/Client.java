package org.example.abstractfactory;

public class Client {


    private final NotificationFactory factory;

    public Client(NotificationFactory factory) {
        this.factory=factory;
    }

    public void run(String message) {

        Notification notification=factory.createNotification();
        MessageFormatter formatter=factory.createFormatter();
        NotificationIcon icon=factory.createIcon();

        String formattedMessage=formatter.format(message);

        notification.send(formattedMessage);
        
        icon.display();
    }
}