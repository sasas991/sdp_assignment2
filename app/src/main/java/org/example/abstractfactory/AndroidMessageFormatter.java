package org.example.abstractfactory;

public class AndroidMessageFormatter implements MessageFormatter {

    @Override
    public String format(String message) {
        return "[Android] " + message;
    }
}