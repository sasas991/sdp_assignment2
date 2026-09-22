package org.example.factorymethod;

public class Client {

    public void run() {
        NotificationCreator emailCreator=new EmailNotificationCreator();
        emailCreator.sendNotification("hello by email");


        NotificationCreator smsCreator=new SMSNotificationCreator();
        smsCreator.sendNotification("hello by sms");



        NotificationCreator pushCreator=new PushNotificationCreator();
        pushCreator.sendNotification("hello by push");
    }
}
