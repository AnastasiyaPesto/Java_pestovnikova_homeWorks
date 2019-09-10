package ru.pestovnikova.Lesson8.ExampleException;

public class EmptyQueueException extends Exception {
    EmptyQueueException(String message){
        super(message);
    }
}
