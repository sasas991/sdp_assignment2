package org.example;

public class App {

    public static void main(String[] args) {

        org.example.factorymethod.Client factoryMethodClient=new org.example.factorymethod.Client();

        factoryMethodClient.run();





        org.example.abstractfactory.NotificationFactory factory=new org.example.abstractfactory.AndroidNotificationFactory();

        org.example.abstractfactory.Client abstractFactoryClient=new org.example.abstractfactory.Client(factory);

        abstractFactoryClient.run("hello from notification system");
    }
}