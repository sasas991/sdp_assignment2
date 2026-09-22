package org.example.abstractfactory;

public class IOSMessageFormatter implements MessageFormatter {

    @Override
    public String format(String message) {
        return "[ios] " + message;
    }
}